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
import com.bydan.erp.contabilidad.util.MonedaConstantesFunciones;

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
public class MonedaJInternalFrame extends MonedaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMoneda;
	
	protected JMenuBar jmenuBarMoneda;
	
	protected JMenu jmenuMoneda;
	protected JMenu jmenuDatosMoneda;
	protected JMenu jmenuArchivoMoneda;
	protected JMenu jmenuAccionesMoneda;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMoneda;	
	protected GridBagConstraints gridBagConstraintsMoneda;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MonedaDetalleFormJInternalFrame jInternalFrameDetalleFormMoneda;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMoneda;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMoneda;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public MonedaSessionBean monedaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Moneda> monedas;		
	public List<Moneda> monedasEliminados;	
	public List<Moneda> monedasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMoneda;		
	protected JButton jButtonAbrirOrderByMoneda;
	
	
	//protected JPanel jPanelOrderByMoneda;
	//public JScrollPane jScrollPanelOrderByMoneda;	
	//protected JButton jButtonCerrarOrderByMoneda;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MonedaLogic monedaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMoneda;
	public JScrollPane jScrollPanelDatosEdicionMoneda;
	public JScrollPane jScrollPanelDatosGeneralMoneda;
    
	
	
	//public JScrollPane jScrollPanelDatosMonedaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMoneda;
	//public JScrollPane jScrollPanelImportacionMoneda;
	
	
	
	protected JPanel jPanelAccionesMoneda;
	
    protected JPanel jPanelPaginacionMoneda;
    protected JPanel jPanelParametrosReportesMoneda;
	protected JPanel jPanelParametrosReportesAccionesMoneda;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Moneda;
	protected JPanel jPanelParametrosAuxiliar2Moneda;
	protected JPanel jPanelParametrosAuxiliar3Moneda;
	protected JPanel jPanelParametrosAuxiliar4Moneda;
	//protected JPanel jPanelParametrosAuxiliar5Moneda;
	
	
	
	//protected JPanel jPanelReporteDinamicoMoneda;
	//protected JPanel jPanelImportacionMoneda;
	
	
	public JTable jTableDatosMoneda;
	
	
	
	//public JTable jTableDatosMonedaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMoneda;
	protected JButton jButtonDuplicarMoneda;
	protected JButton jButtonCopiarMoneda;
	protected JButton jButtonVerFormMoneda;
	protected JButton jButtonNuevoRelacionesMoneda;
	protected JButton jButtonModificarMoneda;
	
    protected JButton jButtonGuardarCambiosTablaMoneda;
	protected JButton jButtonCerrarMoneda;
	
	
	protected JButton jButtonRecargarInformacionMoneda;
	protected JButton jButtonProcesarInformacionMoneda;
	
	
	protected JButton jButtonAnterioresMoneda;
	protected JButton jButtonSiguientesMoneda;
	protected JButton jButtonNuevoGuardarCambiosMoneda;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMoneda;
	//protected JButton jButtonCerrarReporteDinamicoMoneda;
	//protected JButton jButtonGenerarExcelReporteDinamicoMoneda;	
	
	
	
	//protected JButton jButtonAbrirImportacionMoneda;
	//protected JButton jButtonGenerarImportacionMoneda;
	//protected JButton jButtonCerrarImportacionMoneda;
	//protected JFileChooser jFileChooserImportacionMoneda;
	//protected File fileImportacionMoneda;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMoneda;
	protected JButton jButtonDuplicarToolBarMoneda;
	protected JButton jButtonNuevoRelacionesToolBarMoneda;
	
	
	public JButton jButtonGuardarCambiosToolBarMoneda;
	protected JButton jButtonCopiarToolBarMoneda;
	protected JButton jButtonVerFormToolBarMoneda;
	public JButton jButtonGuardarCambiosTablaToolBarMoneda;
	protected JButton jButtonMostrarOcultarTablaToolBarMoneda;
	protected JButton jButtonCerrarToolBarMoneda;
	
	protected JButton jButtonRecargarInformacionToolBarMoneda;
	protected JButton jButtonProcesarInformacionToolBarMoneda;
	protected JButton jButtonAnterioresToolBarMoneda;
	protected JButton jButtonSiguientesToolBarMoneda;
	protected JButton jButtonNuevoGuardarCambiosToolBarMoneda;
	protected JButton jButtonAbrirOrderByToolBarMoneda;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMoneda;
	protected JMenuItem jMenuItemDuplicarMoneda;
	protected JMenuItem jMenuItemNuevoRelacionesMoneda;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMoneda;
	protected JMenuItem jMenuItemCopiarMoneda;
	protected JMenuItem jMenuItemVerFormMoneda;
	protected JMenuItem jMenuItemGuardarCambiosTablaMoneda;
	protected JMenuItem jMenuItemCerrarMoneda;
	protected JMenuItem jMenuItemDetalleCerrarMoneda;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMoneda;
	protected JMenuItem jMenuItemDetalleMostarOcultarMoneda;
	
	protected JMenuItem jMenuItemRecargarInformacionMoneda;
	protected JMenuItem jMenuItemProcesarInformacionMoneda;
	protected JMenuItem jMenuItemAnterioresMoneda;
	protected JMenuItem jMenuItemSiguientesMoneda;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMoneda;
	protected JMenuItem jMenuItemAbrirOrderByMoneda;
	protected JMenuItem jMenuItemMostrarOcultarMoneda;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMoneda;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMoneda;
	protected JCheckBox jCheckBoxSeleccionadosMoneda;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMoneda;
	protected JCheckBox jCheckBoxConGraficoReporteMoneda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMoneda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMoneda;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMoneda;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMoneda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMoneda;
	protected JTextField jTextFieldValorCampoGeneralMoneda;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMoneda;
	//public JList<Reporte> jListColumnasSelectReporteMoneda;
	//public JScrollPane jScrollColumnasSelectReporteMoneda;
	
	//public JLabel jLabelRelacionesSelectReporteMoneda;
	//public JList<Reporte> jListRelacionesSelectReporteMoneda;
	//public JScrollPane jScrollRelacionesSelectReporteMoneda;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMoneda;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMoneda;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMoneda;
	//public JLabel jLabelTiposArchivoReporteDinamicoMoneda;
	
		
	//public JLabel jLabelArchivoImportacionMoneda;	
	//public JLabel jLabelPathArchivoImportacionMoneda;
	//protected JTextField jTextFieldPathArchivoImportacionMoneda;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMoneda;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMoneda;
	
	//public JLabel jLabelColumnaCategoriaValorMoneda;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMoneda;
	
	//public JLabel jLabelColumnasValoresGraficoMoneda;
	//public JList<Reporte> jListColumnasValoresGraficoMoneda;
	//public JScrollPane jScrollColumnasValoresGraficoMoneda;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMoneda;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMoneda;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMoneda;
	public JPanel jPanelBusquedaPorNombreMoneda;
	public JButton jButtonBusquedaPorNombreMoneda;
	public JPanel jPanelBusquedaPorSiglaMoneda;
	public JButton jButtonBusquedaPorSiglaMoneda;
	
	public JPanel jPanelnombreBusquedaPorNombreMoneda;
	public JLabel jLabelnombreBusquedaPorNombreMoneda;
	public JTextField jTextFieldnombreBusquedaPorNombreMoneda;
	public JButton jButtonnombreBusquedaPorNombreMonedaBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglaBusquedaPorSiglaMoneda;
	public JLabel jLabelsiglaBusquedaPorSiglaMoneda;
	public JTextField jTextFieldsiglaBusquedaPorSiglaMoneda;
	public JButton jButtonsiglaBusquedaPorSiglaMonedaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MonedaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MonedaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMoneda)	{
		this.jButtonRecargarInformacionMoneda = jButtonRecargarInformacionMoneda;
	}
	
	public JButton getjButtonProcesarInformacionMoneda() {
		return this.jButtonProcesarInformacionMoneda;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMoneda)	{
		this.jButtonProcesarInformacionMoneda = jButtonProcesarInformacionMoneda;
	}
	
	
	public JButton getjButtonRecargarInformacionMoneda() {
		return this.jButtonRecargarInformacionMoneda;
	}
	
	
	public List<Moneda> getmonedas() {
		return this.monedas;
	}

	public void setmonedas(List<Moneda> monedas) {
		this.monedas = monedas;
	}
	
	public List<Moneda> getmonedasAux() {
		return this.monedasAux;
	}

	public void setmonedasAux(List<Moneda> monedasAux) {
		this.monedasAux = monedasAux;
	}
	
	public List<Moneda> getmonedasEliminados() {
		return this.monedasEliminados;
	}

	public void setMonedasEliminados(List<Moneda> monedasEliminados) {
		this.monedasEliminados = monedasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMoneda() {
		return jComboBoxTiposSeleccionarMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMoneda(
			JComboBox jComboBoxTiposSeleccionarMoneda) {
		this.jComboBoxTiposSeleccionarMoneda = jComboBoxTiposSeleccionarMoneda;
	}
	
	public void setBorderResaltarTiposSeleccionarMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMoneda .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMoneda() {
		return jTextFieldValorCampoGeneralMoneda;
	}

	public void setjTextFieldValorCampoGeneralMoneda(
			JTextField jTextFieldValorCampoGeneralMoneda) {
		this.jTextFieldValorCampoGeneralMoneda = jTextFieldValorCampoGeneralMoneda;
	}

	public void setBorderResaltarValorCampoGeneralMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMoneda .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMoneda() {
		return this.jCheckBoxSeleccionarTodosMoneda;
	}

	public void setjCheckBoxSeleccionarTodosMoneda(
			JCheckBox jCheckBoxSeleccionarTodosMoneda) {
		this.jCheckBoxSeleccionarTodosMoneda = jCheckBoxSeleccionarTodosMoneda;
	}

	public void setBorderResaltarSeleccionarTodosMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMoneda .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMoneda() {
		return this.jCheckBoxSeleccionadosMoneda;
	}

	public void setjCheckBoxSeleccionadosMoneda(
			JCheckBox jCheckBoxSeleccionadosMoneda) {
		this.jCheckBoxSeleccionadosMoneda = jCheckBoxSeleccionadosMoneda;
	}
	
	public void setBorderResaltarSeleccionadosMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMoneda .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMoneda() {
		return this.jComboBoxTiposArchivosReportesMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMoneda(
			JComboBox jComboBoxTiposArchivosReportesMoneda) {
		this.jComboBoxTiposArchivosReportesMoneda = jComboBoxTiposArchivosReportesMoneda;
	}

	public void setBorderResaltarTiposArchivosReportesMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMoneda() {
		return this.jComboBoxTiposReportesMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMoneda(
			JComboBox jComboBoxTiposReportesMoneda) {
		this.jComboBoxTiposReportesMoneda = jComboBoxTiposReportesMoneda;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMoneda() {
	//	return jComboBoxTiposReportesDinamicoMoneda;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMoneda(
	//		JComboBox jComboBoxTiposReportesDinamicoMoneda) {
	//	this.jComboBoxTiposReportesDinamicoMoneda = jComboBoxTiposReportesDinamicoMoneda;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMoneda() {
	//	return jComboBoxTiposArchivosReportesDinamicoMoneda;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMoneda(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMoneda) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMoneda = jComboBoxTiposArchivosReportesDinamicoMoneda;
	//}
	
	public void setBorderResaltarTiposReportesMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMoneda() {
		return this.jComboBoxTiposGraficosReportesMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMoneda(
			JComboBox jComboBoxTiposGraficosReportesMoneda) {
		this.jComboBoxTiposGraficosReportesMoneda = jComboBoxTiposGraficosReportesMoneda;
	}
	
	public void setBorderResaltarTiposGraficosReportesMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMoneda() {
		return this.jComboBoxTiposPaginacionMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMoneda(
			JComboBox jComboBoxTiposPaginacionMoneda) {
		this.jComboBoxTiposPaginacionMoneda = jComboBoxTiposPaginacionMoneda;
	}
	
	public void setBorderResaltarTiposPaginacionMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMoneda() {
		return this.jComboBoxTiposRelacionesMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMoneda() {
		return this.jComboBoxTiposAccionesMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMoneda(
			JComboBox jComboBoxTiposRelacionesMoneda) {
		this.jComboBoxTiposRelacionesMoneda = jComboBoxTiposRelacionesMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMoneda(
			JComboBox jComboBoxTiposAccionesMoneda) {
		this.jComboBoxTiposAccionesMoneda = jComboBoxTiposAccionesMoneda;
	}
	
	public void setBorderResaltarTiposRelacionesMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMoneda .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMoneda .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMoneda() {
	//	return jCheckBoxConGraficoDinamicoMoneda;
	//}

	//public void setjCheckBoxConGraficoDinamicoMoneda(
	//		JCheckBox jCheckBoxConGraficoDinamicoMoneda) {
	//	this.jCheckBoxConGraficoDinamicoMoneda = jCheckBoxConGraficoDinamicoMoneda;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMoneda() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMoneda.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMoneda .setBorder(borderResaltar);		
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
		this.monedaSessionBean=new MonedaSessionBean();
		
		this.monedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.monedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.monedaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MonedaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MonedaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MonedaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MonedaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MonedaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Moneda MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
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
		
		MonedaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Moneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMoneda= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMoneda,this.jTtoolBarMoneda,
							"nuevo","nuevo","Nuevo"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMoneda,this.jTtoolBarMoneda,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMoneda,this.jTtoolBarMoneda,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMoneda,this.jTtoolBarMoneda,
							"duplicar","duplicar","Duplicar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMoneda,this.jTtoolBarMoneda,
							"copiar","copiar","Copiar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMoneda,this.jTtoolBarMoneda,
							"ver_form","ver_form","Ver"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMoneda,this.jTtoolBarMoneda,
							"recargar","recargar","Recargar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMoneda,this.jTtoolBarMoneda,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMoneda,this.jTtoolBarMoneda,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMoneda,this.jTtoolBarMoneda,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMoneda,this.jTtoolBarMoneda,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMoneda,this.jTtoolBarMoneda,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMoneda,this.jTtoolBarMoneda,
							"cerrar","cerrar","Salir"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMoneda=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMoneda;
			
				this.jButtonProcesarInformacionToolBarMoneda=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMoneda;
				
		//protected JButton jButtonModificarToolBarMoneda;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMoneda=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMoneda=new JMenuMe("General");
		this.jmenuArchivoMoneda=new JMenuMe("Archivo");
		this.jmenuAccionesMoneda=new JMenuMe("Acciones");
		this.jmenuDatosMoneda=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMoneda= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMoneda.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMoneda,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMoneda= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMoneda.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMoneda,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMoneda= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMoneda.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMoneda,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMoneda= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMoneda.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMoneda,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMoneda= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMoneda.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMoneda,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMoneda= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMoneda.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMoneda,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMoneda= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMoneda.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMoneda,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMoneda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMoneda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMoneda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMoneda= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMoneda.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMoneda,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMoneda= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMoneda.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMoneda,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMoneda= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMoneda.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMoneda,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMoneda= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMoneda.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMoneda,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMoneda= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMoneda.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMoneda,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMoneda,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMoneda= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMoneda.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMoneda,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMoneda,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMoneda= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMoneda.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMoneda,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMoneda.add(this.jMenuItemCerrarMoneda);
			
			this.jmenuAccionesMoneda.add(this.jMenuItemNuevoMoneda);
			this.jmenuAccionesMoneda.add(this.jMenuItemNuevoGuardarCambiosMoneda);
			this.jmenuAccionesMoneda.add(this.jMenuItemNuevoRelacionesMoneda);
			this.jmenuAccionesMoneda.add(this.jMenuItemGuardarCambiosTablaMoneda);		
			this.jmenuAccionesMoneda.add(this.jMenuItemDuplicarMoneda);		
			this.jmenuAccionesMoneda.add(this.jMenuItemCopiarMoneda);		
			this.jmenuAccionesMoneda.add(this.jMenuItemVerFormMoneda);		
			
			this.jmenuDatosMoneda.add(this.jMenuItemRecargarInformacionMoneda);				
			this.jmenuDatosMoneda.add(this.jMenuItemAnterioresMoneda);				
			this.jmenuDatosMoneda.add(this.jMenuItemSiguientesMoneda);				
			this.jmenuDatosMoneda.add(this.jMenuItemAbrirOrderByMoneda);				
			this.jmenuDatosMoneda.add(this.jMenuItemMostrarOcultarMoneda);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMoneda.add(this.jMenuItemGuardarCambiosMoneda);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMoneda.add(this.jmenuArchivoMoneda);		
			this.jmenuBarMoneda.add(this.jmenuAccionesMoneda);		
			this.jmenuBarMoneda.add(this.jmenuDatosMoneda);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMoneda);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMoneda() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreMoneda.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreMoneda= new JButtonMe();
		this.jButtonBusquedaPorNombreMoneda.setText("Buscar");
		this.jButtonBusquedaPorNombreMoneda.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreMoneda,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreMoneda = new JLabelMe();
		jLabelnombreBusquedaPorNombreMoneda.setText("Nombre :");
		jLabelnombreBusquedaPorNombreMoneda.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreMoneda= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreMoneda,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglaMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglaMoneda.setToolTipText("Buscar Por Sigla ");
		this.jButtonBusquedaPorSiglaMoneda= new JButtonMe();
		this.jButtonBusquedaPorSiglaMoneda.setText("Buscar");
		this.jButtonBusquedaPorSiglaMoneda.setToolTipText("Buscar Por Sigla ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglaMoneda,"buscar_button","Buscar Por Sigla ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglaMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglaBusquedaPorSiglaMoneda = new JLabelMe();
		jLabelsiglaBusquedaPorSiglaMoneda.setText("Sigla :");
		jLabelsiglaBusquedaPorSiglaMoneda.setToolTipText("Sigla");
		jLabelsiglaBusquedaPorSiglaMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglaBusquedaPorSiglaMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglaBusquedaPorSiglaMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglaBusquedaPorSiglaMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglaBusquedaPorSiglaMoneda= new JTextFieldMe();
		jTextFieldsiglaBusquedaPorSiglaMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaBusquedaPorSiglaMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaBusquedaPorSiglaMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglaBusquedaPorSiglaMoneda,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMoneda=new JTabbedPane();


		this.jTabbedPaneBusquedasMoneda.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMoneda.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMoneda.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMoneda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMoneda = new MonedaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Moneda DATOS");
			this.jInternalFrameDetalleFormMoneda = new MonedaDetalleFormJInternalFrame(jDesktopPane,this.monedaSessionBean.getConGuardarRelaciones(),this.monedaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMoneda = null;//new MonedaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMoneda= new GridBagLayout();
		
		
		this.jTableDatosMoneda = new JTableMe();      
		
		String sToolTipMoneda="";
		sToolTipMoneda=MonedaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMoneda+="(Contabilidad.Moneda)";
		}
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			sToolTipMoneda+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMoneda.setToolTipText(sToolTipMoneda);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMoneda);
		this.jTableDatosMoneda.setAutoCreateRowSorter(true);
		this.jTableDatosMoneda.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMoneda.setRowSelectionAllowed(true);
		this.jTableDatosMoneda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMoneda,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMoneda = new JButtonMe();
		this.jButtonDuplicarMoneda = new JButtonMe();
		this.jButtonCopiarMoneda = new JButtonMe();
		this.jButtonVerFormMoneda = new JButtonMe();
		this.jButtonNuevoRelacionesMoneda = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMoneda = new JButtonMe();
		this.jButtonCerrarMoneda = new JButtonMe();
		
		this.jScrollPanelDatosMoneda = new JScrollPane();   
        this.jScrollPanelDatosGeneralMoneda = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Moneda";
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monedas" + this.sPath));
		} else {
			this.jScrollPanelDatosMoneda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMoneda.setToolTipText("Acciones");
        this.jPanelAccionesMoneda.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMoneda, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMoneda=new ReporteDinamicoJInternalFrame(MonedaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMoneda();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMoneda=new ImportacionJInternalFrame(MonedaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMoneda();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMoneda = new JButtonMe();
		
		this.jButtonAbrirOrderByMoneda.setText("Orden");
		this.jButtonAbrirOrderByMoneda.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMoneda,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMoneda,false,this);
			
			//this.cargarOrderByMoneda(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMoneda,true,this);
			
			//this.cargarOrderByMoneda(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMoneda.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosMoneda.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosMoneda.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosMoneda.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMoneda.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMoneda.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMoneda.setText("Nuevo");
		this.jButtonDuplicarMoneda.setText("Duplicar");
		this.jButtonCopiarMoneda.setText("Copiar");
		this.jButtonVerFormMoneda.setText("Ver");
		this.jButtonNuevoRelacionesMoneda.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMoneda.setText("Guardar");
		this.jButtonCerrarMoneda.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMoneda,"nuevo_button","Nuevo",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMoneda,"duplicar_button","Duplicar",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMoneda,"copiar_button","Copiar",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMoneda,"ver_form","Ver",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMoneda,"nuevorelaciones_button","Nuevo Rel",this.monedaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMoneda,"guardarcambiostabla_button","Guardar",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMoneda,"cerrar_button","Salir",this.monedaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMoneda.setToolTipText("Nuevo"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMoneda.setToolTipText("Duplicar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMoneda.setToolTipText("Copiar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMoneda.setToolTipText("Ver"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMoneda.setToolTipText("Nuevo Rel"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMoneda.setToolTipText("Guardar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMoneda.setToolTipText("Salir"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMoneda";
		inputMap = this.jButtonNuevoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMoneda"));
		
		//DUPLICAR
		sMapKey = "DuplicarMoneda";
		inputMap = this.jButtonDuplicarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMoneda"));
		
		//COPIAR
		sMapKey = "CopiarMoneda";
		inputMap = this.jButtonCopiarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMoneda"));
		
		//VEr FORM
		sMapKey = "VerFormMoneda";
		inputMap = this.jButtonVerFormMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMoneda"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMoneda";
		inputMap = this.jButtonNuevoRelacionesMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMoneda"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMoneda";
		inputMap = this.jButtonModificarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMoneda"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMoneda";
		inputMap = this.jButtonCerrarMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMoneda"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMoneda";
		inputMap = this.jButtonGuardarCambiosTablaMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMoneda"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Moneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Moneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Moneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Moneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Moneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMoneda.setName("jPanelParametrosReportesMoneda"); 
		
		this.jPanelParametrosReportesAccionesMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMoneda.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMoneda.setName("jPanelParametrosReportesAccionesMoneda"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMoneda = new JButtonMe();
		this.jButtonRecargarInformacionMoneda.setText("Recargar");
		this.jButtonRecargarInformacionMoneda.setToolTipText("Recargar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMoneda,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMoneda = new JButtonMe();
		this.jButtonProcesarInformacionMoneda.setText("Procesar");
		this.jButtonProcesarInformacionMoneda.setToolTipText("Procesar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMoneda.setVisible(false);
			
		this.jButtonProcesarInformacionMoneda.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMoneda.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMoneda.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMoneda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMoneda.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMoneda.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMoneda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMoneda.setText("TIPO");       
		this.jComboBoxTiposReportesMoneda.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMoneda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMoneda.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMoneda.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMoneda = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMoneda.setText("Paginacion");
		this.jComboBoxTiposPaginacionMoneda.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMoneda = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMoneda.setText("Accion");
		this.jComboBoxTiposRelacionesMoneda.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMoneda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMoneda.setText("Accion");
		this.jComboBoxTiposAccionesMoneda.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMoneda = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMoneda.setText("Accion");
		this.jComboBoxTiposSeleccionarMoneda.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMoneda=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMoneda.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMoneda.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMoneda.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMoneda = new JLabelMe();
		
		this.jLabelAccionesMoneda.setText("Acciones");		
		this.jLabelAccionesMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMoneda = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMoneda.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMoneda.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMoneda = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMoneda.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMoneda.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMoneda = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMoneda.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMoneda.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMoneda = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMoneda.setText("Graf.");
		this.jCheckBoxConGraficoReporteMoneda.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMoneda = new JButtonMe();
		//this.jButtonAnterioresMoneda.setText("<<");
        this.jButtonAnterioresMoneda.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMoneda,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMoneda = new JButtonMe();
		//this.jButtonSiguientesMoneda.setText(">>");
        this.jButtonSiguientesMoneda.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMoneda,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMoneda = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMoneda.setText("Nue");
        this.jButtonNuevoGuardarCambiosMoneda.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMoneda,"nuevoguardarcambios_button","Nue",this.monedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMoneda";
		inputMap = this.jButtonNuevoGuardarCambiosMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMoneda"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMoneda";
		inputMap = this.jButtonRecargarInformacionMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMoneda"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMoneda";
		inputMap = this.jButtonSiguientesMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMoneda"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMoneda";
		inputMap = this.jButtonAnterioresMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMoneda"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMoneda();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMoneda.setMinimumSize(new Dimension(this.getWidth(),MonedaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MonedaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMoneda.setMaximumSize(new Dimension(this.getWidth(),MonedaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MonedaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMoneda.setPreferredSize(new Dimension(this.getWidth(),MonedaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MonedaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMoneda = new GridBagLayout();

			this.jPanelPaginacionMoneda.setLayout(gridaBagLayoutPaginacionMoneda);						
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 0;
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMoneda.add(this.jButtonAnterioresMoneda, this.gridBagConstraintsMoneda);
					
						
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMoneda.gridy = 0;
			
			this.jPanelPaginacionMoneda.add(this.jButtonNuevoGuardarCambiosMoneda, this.gridBagConstraintsMoneda);
						
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMoneda.gridy = 0;
			this.jPanelPaginacionMoneda.add(this.jButtonSiguientesMoneda, this.gridBagConstraintsMoneda);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 1;
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMoneda.add(this.jButtonNuevoMoneda, this.gridBagConstraintsMoneda);
						
			
			
			if(!this.monedaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMoneda = new GridBagConstraints();
				this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMoneda.gridy = 1;
				this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMoneda.add(this.jButtonGuardarCambiosTablaMoneda, this.gridBagConstraintsMoneda);
			}
			
			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 1;
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMoneda.add(this.jButtonDuplicarMoneda, this.gridBagConstraintsMoneda);
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 1;
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMoneda.add(this.jButtonCopiarMoneda, this.gridBagConstraintsMoneda);
		
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 1;
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMoneda.add(this.jButtonVerFormMoneda, this.gridBagConstraintsMoneda);
		
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 1;
			this.gridBagConstraintsMoneda.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMoneda.add(this.jButtonCerrarMoneda, this.gridBagConstraintsMoneda);
		
		
		
		this.jButtonRecargarInformacionMoneda.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMoneda.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMoneda.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMoneda, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMoneda.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMoneda.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMoneda.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMoneda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMoneda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMoneda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMoneda.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMoneda.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMoneda.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMoneda.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMoneda.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMoneda.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMoneda.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMoneda.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMoneda.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMoneda.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMoneda.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMoneda.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMoneda, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMoneda.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMoneda.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMoneda.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMoneda.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMoneda.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMoneda.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMoneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMoneda = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Moneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Moneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Moneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Moneda = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMoneda.setLayout(gridaBagParametrosReportesMoneda);
			this.jPanelParametrosReportesAccionesMoneda.setLayout(gridaBagParametrosReportesAccionesMoneda);
			
			
			this.jPanelParametrosAuxiliar1Moneda.setLayout(gridaBagParametrosAuxiliar1Moneda);
			this.jPanelParametrosAuxiliar2Moneda.setLayout(gridaBagParametrosAuxiliar2Moneda);
			this.jPanelParametrosAuxiliar3Moneda.setLayout(gridaBagParametrosAuxiliar3Moneda);
			this.jPanelParametrosAuxiliar4Moneda.setLayout(gridaBagParametrosAuxiliar4Moneda);
			//this.jPanelParametrosAuxiliar5Moneda.setLayout(gridaBagParametrosAuxiliar2Moneda);			
			
			
			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMoneda.add(this.jButtonRecargarInformacionMoneda, this.gridBagConstraintsMoneda);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Moneda.add(this.jComboBoxTiposPaginacionMoneda, this.gridBagConstraintsMoneda);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Moneda.add(this.jCheckBoxConAltoMaximoTablaMoneda, this.gridBagConstraintsMoneda);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Moneda.add(this.jComboBoxTiposArchivosReportesMoneda, this.gridBagConstraintsMoneda);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMoneda.add(this.jPanelParametrosAuxiliar1Moneda, this.gridBagConstraintsMoneda);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMoneda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Moneda.add(this.jComboBoxTiposReportesMoneda, this.gridBagConstraintsMoneda);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMoneda.add(this.jPanelParametrosAuxiliar4Moneda, this.gridBagConstraintsMoneda);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMoneda.add(this.jComboBoxTiposReportesMoneda, this.gridBagConstraintsMoneda);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMoneda.add(this.jCheckBoxGenerarReporteMoneda, this.gridBagConstraintsMoneda);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMoneda.add(this.jPanelParametrosAuxiliar2Moneda, this.gridBagConstraintsMoneda);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMoneda.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMoneda.add(this.jLabelAccionesMoneda, this.gridBagConstraintsMoneda);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMoneda = new GridBagConstraints();
				this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMoneda.add(this.jButtonAbrirOrderByMoneda, this.gridBagConstraintsMoneda);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMoneda.add(this.jComboBoxTiposSeleccionarMoneda, this.gridBagConstraintsMoneda);			
			
			
			/*
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMoneda.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMoneda.add(this.jCheckBoxSeleccionarTodosMoneda, this.gridBagConstraintsMoneda);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMoneda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Moneda.add(this.jCheckBoxSeleccionarTodosMoneda, this.gridBagConstraintsMoneda);															
				
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMoneda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Moneda.add(this.jCheckBoxSeleccionadosMoneda, this.gridBagConstraintsMoneda);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMoneda.add(this.jPanelParametrosAuxiliar3Moneda, this.gridBagConstraintsMoneda);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMoneda.add(this.jComboBoxTiposAccionesMoneda, this.gridBagConstraintsMoneda);
	
				
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMoneda.add(this.jTextFieldValorCampoGeneralMoneda, this.gridBagConstraintsMoneda);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMoneda = new GridBagLayout();

			this.jScrollPanelDatosMoneda.setLayout(gridaBagLayoutDatosMoneda);
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = 0;
			this.gridBagConstraintsMoneda.gridx = 0;
			
			this.jScrollPanelDatosMoneda.add(this.jTableDatosMoneda, this.gridBagConstraintsMoneda);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMoneda.setViewportView(this.jTableDatosMoneda);
		this.jTableDatosMoneda.setFillsViewportHeight(true);
		this.jTableDatosMoneda.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMoneda= new GridBagLayout();
		this.jPanelAccionesMoneda.setLayout(gridaBagLayoutAccionesMoneda);
		
		
		/*	
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = 0;
		this.gridBagConstraintsMoneda.gridx = 0;
			
		this.jPanelAccionesMoneda.add(this.jButtonNuevoMoneda, this.gridBagConstraintsMoneda);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreMoneda= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreMoneda.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreMoneda.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreMoneda.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreMoneda.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreMoneda.setLayout(gridaBagLayoutBusquedaPorNombreMoneda);

		gridBagConstraintsMoneda = new GridBagConstraints();
		gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMoneda.gridy = 0;
		gridBagConstraintsMoneda.gridx = 0;
		jPanelBusquedaPorNombreMoneda.add(jLabelnombreBusquedaPorNombreMoneda, gridBagConstraintsMoneda);

		gridBagConstraintsMoneda = new GridBagConstraints();
		gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMoneda.gridy = 0;
		gridBagConstraintsMoneda.gridx = 1;
		jPanelBusquedaPorNombreMoneda.add(jTextFieldnombreBusquedaPorNombreMoneda, gridBagConstraintsMoneda);

		gridBagConstraintsMoneda = new GridBagConstraints();
		gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMoneda.gridy = 1;
		gridBagConstraintsMoneda.gridx =1;
		jPanelBusquedaPorNombreMoneda.add(jButtonBusquedaPorNombreMoneda, gridBagConstraintsMoneda);

		jTabbedPaneBusquedasMoneda.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreMoneda);
		jTabbedPaneBusquedasMoneda.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorSiglaMoneda= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglaMoneda.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglaMoneda.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglaMoneda.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglaMoneda.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglaMoneda.setLayout(gridaBagLayoutBusquedaPorSiglaMoneda);

		gridBagConstraintsMoneda = new GridBagConstraints();
		gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMoneda.gridy = 0;
		gridBagConstraintsMoneda.gridx = 0;
		jPanelBusquedaPorSiglaMoneda.add(jLabelsiglaBusquedaPorSiglaMoneda, gridBagConstraintsMoneda);

		gridBagConstraintsMoneda = new GridBagConstraints();
		gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMoneda.gridy = 0;
		gridBagConstraintsMoneda.gridx = 1;
		jPanelBusquedaPorSiglaMoneda.add(jTextFieldsiglaBusquedaPorSiglaMoneda, gridBagConstraintsMoneda);

		gridBagConstraintsMoneda = new GridBagConstraints();
		gridBagConstraintsMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMoneda.gridy = 1;
		gridBagConstraintsMoneda.gridx =1;
		jPanelBusquedaPorSiglaMoneda.add(jButtonBusquedaPorSiglaMoneda, gridBagConstraintsMoneda);

		jTabbedPaneBusquedasMoneda.addTab("2.-Por Sigla ", jPanelBusquedaPorSiglaMoneda);
		jTabbedPaneBusquedasMoneda.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMoneda = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMoneda);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.monedaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMoneda = new GridBagConstraints();						
			this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMoneda.gridx = 0;		
			//this.gridBagConstraintsMoneda.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMoneda.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMoneda, this.gridBagConstraintsMoneda);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMoneda.gridx = 0;		
		//this.gridBagConstraintsMoneda.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMoneda.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMoneda);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMoneda.gridx = 0;		
			this.gridBagConstraintsMoneda.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMoneda.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMoneda, this.gridBagConstraintsMoneda);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMoneda, this.gridBagConstraintsMoneda);								
		
		
		/*
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMoneda, this.gridBagConstraintsMoneda);
		*/		
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMoneda.gridx =0;
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMoneda.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMoneda, this.gridBagConstraintsMoneda);
				
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMoneda, this.gridBagConstraintsMoneda);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MonedaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMoneda = new GridBagLayout();
			this.jPanelBusquedasParametrosMoneda.setLayout(gridaBagLayoutBusquedasParametrosMoneda);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMoneda=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMoneda, this.gridBagConstraintsMoneda);
			
			
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMoneda, this.gridBagConstraintsMoneda);
		
			
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMoneda.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMoneda, this.gridBagConstraintsMoneda);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMoneda;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMoneda() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMoneda = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMoneda.setName("jPanelReporteDinamicoMoneda"); 
		
		this.jPanelReporteDinamicoMoneda.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMoneda.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMoneda.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMoneda.setLayout(gridaBagLayoutReporteDinamicoMoneda);
		
		
		this.jInternalFrameReporteDinamicoMoneda= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMoneda = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMoneda= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMoneda.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMoneda.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMoneda.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMoneda.setResizable(true);
	    this.jInternalFrameReporteDinamicoMoneda.setClosable(true);
	    this.jInternalFrameReporteDinamicoMoneda.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMoneda.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMoneda.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMoneda.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monedas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMoneda = new JLabelMe();

		this.jLabelColumnasSelectReporteMoneda.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMoneda.add(this.jLabelColumnasSelectReporteMoneda, this.gridBagConstraintsMoneda);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMoneda = new JList<Reporte>();
		this.jListColumnasSelectReporteMoneda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMoneda.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMoneda.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMoneda.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMoneda.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMoneda=new JScrollPane(this.jListColumnasSelectReporteMoneda);
			
			this.jScrollColumnasSelectReporteMoneda.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMoneda.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMoneda.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMoneda.add(this.jListColumnasSelectReporteMoneda, this.gridBagConstraintsMoneda);
		this.jPanelReporteDinamicoMoneda.add(this.jScrollColumnasSelectReporteMoneda, this.gridBagConstraintsMoneda);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMoneda = new JLabelMe();

		this.jLabelRelacionesSelectReporteMoneda.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMoneda = new JList<Reporte>();
		this.jListRelacionesSelectReporteMoneda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMoneda.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMoneda.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMoneda.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMoneda.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMoneda=new JScrollPane(this.jListRelacionesSelectReporteMoneda);
			
			this.jScrollRelacionesSelectReporteMoneda.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMoneda.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMoneda.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMoneda = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMoneda = new JComboBoxMe();
		this.jListColumnasValoresGraficoMoneda = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMoneda = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMoneda.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMoneda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMoneda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMoneda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMoneda = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMoneda.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMoneda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMoneda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMoneda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMoneda = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMoneda.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMoneda.add(this.jLabelGenerarExcelReporteDinamicoMoneda, this.gridBagConstraintsMoneda);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMoneda = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMoneda.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMoneda,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMoneda.setToolTipText("Generar EXCEL"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMoneda = new GridBagConstraints();
		//this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMoneda.add(this.jButtonGenerarExcelReporteDinamicoMoneda, this.gridBagConstraintsMoneda);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMoneda.add(this.jComboBoxTiposReportesDinamicoMoneda, this.gridBagConstraintsMoneda);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMoneda = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMoneda.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMoneda.add(this.jLabelTiposArchivoReporteDinamicoMoneda, this.gridBagConstraintsMoneda);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMoneda.add(this.jComboBoxTiposArchivosReportesDinamicoMoneda, this.gridBagConstraintsMoneda);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMoneda = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMoneda.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMoneda,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMoneda.setToolTipText("Generar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMoneda.add(this.jButtonGenerarReporteDinamicoMoneda, this.gridBagConstraintsMoneda);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMoneda = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMoneda.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMoneda,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMoneda.setToolTipText("Cancelar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMoneda.add(this.jButtonCerrarReporteDinamicoMoneda, this.gridBagConstraintsMoneda);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMoneda = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMoneda= new JScrollPane(jPanelReporteDinamicoMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMoneda.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMoneda.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMoneda.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monedas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMoneda.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMoneda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMoneda.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMoneda);
		this.jInternalFrameReporteDinamicoMoneda.getContentPane().add(this.jScrollPanelReporteDinamicoMoneda, this.gridBagConstraintsMoneda);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMoneda() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMoneda = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMoneda.setName("jPanelImportacionMoneda"); 
		
		this.jPanelImportacionMoneda.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMoneda.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMoneda.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMoneda.setLayout(gridaBagLayoutImportacionMoneda);
		
		
		this.jInternalFrameImportacionMoneda= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMoneda= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMoneda = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMoneda= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMoneda.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMoneda.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMoneda.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMoneda.setResizable(true);
	    this.jInternalFrameImportacionMoneda.setClosable(true);
	    this.jInternalFrameImportacionMoneda.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMoneda.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMoneda.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMoneda.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMoneda.setResizable(true);
	    this.jInternalFrameImportacionMoneda.setClosable(true);
	    this.jInternalFrameImportacionMoneda.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMoneda.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMoneda.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMoneda.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monedas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMoneda = new JLabelMe();

		this.jLabelArchivoImportacionMoneda.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = iPosYImportacion;		
		this.gridBagConstraintsMoneda.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMoneda.add(this.jLabelArchivoImportacionMoneda, this.gridBagConstraintsMoneda);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMoneda = new JFileChooser();		
		this.jFileChooserImportacionMoneda.setToolTipText("ESCOGER ARCHIVO"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMoneda = new JButtonMe();
		this.jButtonAbrirImportacionMoneda.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMoneda,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMoneda.setToolTipText("Generar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMoneda.add(this.jButtonAbrirImportacionMoneda, this.gridBagConstraintsMoneda);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMoneda = new JLabelMe();

		this.jLabelPathArchivoImportacionMoneda.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMoneda.gridy = iPosYImportacion;		
		this.gridBagConstraintsMoneda.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMoneda.add(this.jLabelPathArchivoImportacionMoneda, this.gridBagConstraintsMoneda);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMoneda=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMoneda.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMoneda.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMoneda.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMoneda.add(this.jTextFieldPathArchivoImportacionMoneda, this.gridBagConstraintsMoneda);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMoneda = new JButtonMe();
		this.jButtonGenerarImportacionMoneda.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMoneda,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMoneda.setToolTipText("Generar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMoneda.add(this.jButtonGenerarImportacionMoneda, this.gridBagConstraintsMoneda);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMoneda = new JButtonMe();
		this.jButtonCerrarImportacionMoneda.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMoneda,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMoneda.setToolTipText("Cancelar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMoneda.add(this.jButtonCerrarImportacionMoneda, this.gridBagConstraintsMoneda);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMoneda = new GridBagLayout();
		
		this.jScrollPanelImportacionMoneda= new JScrollPane(jPanelImportacionMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMoneda = new GridBagConstraints();
		this.gridBagConstraintsMoneda.gridy =iPosYImportacion;
		this.gridBagConstraintsMoneda.gridx =iPosXImportacion;
		this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMoneda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMoneda.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMoneda);
		this.jInternalFrameImportacionMoneda.getContentPane().add(this.jScrollPanelImportacionMoneda, this.gridBagConstraintsMoneda);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMoneda(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMoneda = new JButtonMe();
			this.jButtonAbrirOrderByMoneda.setText("Orden");
			this.jButtonAbrirOrderByMoneda.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMoneda,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMoneda";
			inputMap = this.jButtonAbrirOrderByMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMoneda"));
		
		
			GridBagLayout gridaBagLayoutOrderByMoneda = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMoneda.setName("jPanelOrderByMoneda"); 
			
			this.jPanelOrderByMoneda.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMoneda.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMoneda.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMoneda.setLayout(gridaBagLayoutOrderByMoneda);
			
			
			this.jTableDatosMonedaOrderBy = new JTableMe();        
			this.jTableDatosMonedaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMonedaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMonedaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMonedaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMonedaOrderBy.setViewportView(this.jTableDatosMonedaOrderBy);
			this.jTableDatosMonedaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMonedaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMoneda= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMoneda= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMoneda = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMoneda= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMoneda.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMoneda.setTitle("Orden");
			this.jInternalFrameOrderByMoneda.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMoneda.setResizable(true);
			this.jInternalFrameOrderByMoneda.setClosable(true);
			this.jInternalFrameOrderByMoneda.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMoneda.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMoneda.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMoneda.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monedas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMoneda.gridx =iPosXOrderBy;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMoneda.ipady =150;
				
			this.jPanelOrderByMoneda.add(jScrollPanelDatosMonedaOrderBy, this.gridBagConstraintsMoneda);//this.jTableDatosMonedaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMoneda = new JButtonMe();
			this.jButtonCerrarOrderByMoneda.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMoneda,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMoneda.setToolTipText("Cancelar"+" "+MonedaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMoneda.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMoneda.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMoneda.add(this.jButtonCerrarOrderByMoneda, this.gridBagConstraintsMoneda);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMoneda = new GridBagLayout();
			
			this.jScrollPanelOrderByMoneda= new JScrollPane(jPanelOrderByMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMoneda = new GridBagConstraints();
			this.gridBagConstraintsMoneda.gridy =iPosYOrderBy;
			this.gridBagConstraintsMoneda.gridx =iPosXOrderBy;
			this.gridBagConstraintsMoneda.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMoneda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMoneda.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMoneda);
			
			this.jInternalFrameOrderByMoneda.getContentPane().add(this.jScrollPanelOrderByMoneda, this.gridBagConstraintsMoneda);			
		
		} else {
			this.jButtonAbrirOrderByMoneda = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.monedaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMoneda.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMoneda.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMoneda.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMoneda.getRowHeight();//MonedaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.monedaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMoneda.isSelected()) {
					iHeightTable=MonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMoneda.isSelected()) {
					iHeightTable=MonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMoneda.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMoneda.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMoneda.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMoneda.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMoneda.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMoneda.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMoneda!=null && this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy()!=null) {
			//if(!this.monedaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMoneda.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMoneda.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMoneda.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMoneda.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMoneda.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMoneda.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMoneda.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=monedaLogic.getMonedas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=monedas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Moneda> TraerMonedaBeans(List<Moneda> monedas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Moneda moneda:monedas) {
					
				if(!(MonedaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MonedaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					moneda.setsDetalleGeneralEntityReporte(MonedaConstantesFunciones.getMonedaDescripcion(moneda));
										
					moneda.setesta_activo_descripcion(MonedaConstantesFunciones.getesta_activoDescripcion(moneda));	
					
						
					
				} else  {
							
					//moneda.setsDetalleGeneralEntityReporte(moneda.getsDetalleGeneralEntityReporte());
										
				}
				
				//monedabeans.add(monedabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return monedas;
    }
	//PARA REPORTES FIN
}
