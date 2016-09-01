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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoPagoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoPagoJInternalFrame extends TipoPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPago;
	
	protected JMenuBar jmenuBarTipoPago;
	
	protected JMenu jmenuTipoPago;
	protected JMenu jmenuDatosTipoPago;
	protected JMenu jmenuArchivoTipoPago;
	protected JMenu jmenuAccionesTipoPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPago;	
	protected GridBagConstraints gridBagConstraintsTipoPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPagoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPagoSessionBean tipopagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPago> tipopagos;		
	public List<TipoPago> tipopagosEliminados;	
	public List<TipoPago> tipopagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPago;		
	protected JButton jButtonAbrirOrderByTipoPago;
	
	
	//protected JPanel jPanelOrderByTipoPago;
	//public JScrollPane jScrollPanelOrderByTipoPago;	
	//protected JButton jButtonCerrarOrderByTipoPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPagoLogic tipopagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPago;
	public JScrollPane jScrollPanelDatosEdicionTipoPago;
	public JScrollPane jScrollPanelDatosGeneralTipoPago;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPago;
	//public JScrollPane jScrollPanelImportacionTipoPago;
	
	
	
	protected JPanel jPanelAccionesTipoPago;
	
    protected JPanel jPanelPaginacionTipoPago;
    protected JPanel jPanelParametrosReportesTipoPago;
	protected JPanel jPanelParametrosReportesAccionesTipoPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPago;
	protected JPanel jPanelParametrosAuxiliar2TipoPago;
	protected JPanel jPanelParametrosAuxiliar3TipoPago;
	protected JPanel jPanelParametrosAuxiliar4TipoPago;
	//protected JPanel jPanelParametrosAuxiliar5TipoPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPago;
	//protected JPanel jPanelImportacionTipoPago;
	
	
	public JTable jTableDatosTipoPago;
	
	
	
	//public JTable jTableDatosTipoPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPago;
	protected JButton jButtonDuplicarTipoPago;
	protected JButton jButtonCopiarTipoPago;
	protected JButton jButtonVerFormTipoPago;
	protected JButton jButtonNuevoRelacionesTipoPago;
	protected JButton jButtonModificarTipoPago;
	
    protected JButton jButtonGuardarCambiosTablaTipoPago;
	protected JButton jButtonCerrarTipoPago;
	
	
	protected JButton jButtonRecargarInformacionTipoPago;
	protected JButton jButtonProcesarInformacionTipoPago;
	
	
	protected JButton jButtonAnterioresTipoPago;
	protected JButton jButtonSiguientesTipoPago;
	protected JButton jButtonNuevoGuardarCambiosTipoPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPago;
	//protected JButton jButtonCerrarReporteDinamicoTipoPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPago;
	//protected JButton jButtonGenerarImportacionTipoPago;
	//protected JButton jButtonCerrarImportacionTipoPago;
	//protected JFileChooser jFileChooserImportacionTipoPago;
	//protected File fileImportacionTipoPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPago;
	protected JButton jButtonDuplicarToolBarTipoPago;
	protected JButton jButtonNuevoRelacionesToolBarTipoPago;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPago;
	protected JButton jButtonCopiarToolBarTipoPago;
	protected JButton jButtonVerFormToolBarTipoPago;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPago;
	protected JButton jButtonCerrarToolBarTipoPago;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPago;
	protected JButton jButtonProcesarInformacionToolBarTipoPago;
	protected JButton jButtonAnterioresToolBarTipoPago;
	protected JButton jButtonSiguientesToolBarTipoPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPago;
	protected JButton jButtonAbrirOrderByToolBarTipoPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPago;
	protected JMenuItem jMenuItemDuplicarTipoPago;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPago;
	protected JMenuItem jMenuItemCopiarTipoPago;
	protected JMenuItem jMenuItemVerFormTipoPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPago;
	protected JMenuItem jMenuItemCerrarTipoPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPago;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPago;
	protected JMenuItem jMenuItemProcesarInformacionTipoPago;
	protected JMenuItem jMenuItemAnterioresTipoPago;
	protected JMenuItem jMenuItemSiguientesTipoPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPago;
	protected JMenuItem jMenuItemAbrirOrderByTipoPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPago;
	protected JCheckBox jCheckBoxSeleccionadosTipoPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPago;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPago;
	protected JTextField jTextFieldValorCampoGeneralTipoPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPago;
	//public JList<Reporte> jListColumnasSelectReporteTipoPago;
	//public JScrollPane jScrollColumnasSelectReporteTipoPago;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPago;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPago;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPago;
	
		
	//public JLabel jLabelArchivoImportacionTipoPago;	
	//public JLabel jLabelPathArchivoImportacionTipoPago;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPago;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPago;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPago;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPago;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPago;
	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPago)	{
		this.jButtonRecargarInformacionTipoPago = jButtonRecargarInformacionTipoPago;
	}
	
	public JButton getjButtonProcesarInformacionTipoPago() {
		return this.jButtonProcesarInformacionTipoPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPago)	{
		this.jButtonProcesarInformacionTipoPago = jButtonProcesarInformacionTipoPago;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPago() {
		return this.jButtonRecargarInformacionTipoPago;
	}
	
	
	public List<TipoPago> gettipopagos() {
		return this.tipopagos;
	}

	public void settipopagos(List<TipoPago> tipopagos) {
		this.tipopagos = tipopagos;
	}
	
	public List<TipoPago> gettipopagosAux() {
		return this.tipopagosAux;
	}

	public void settipopagosAux(List<TipoPago> tipopagosAux) {
		this.tipopagosAux = tipopagosAux;
	}
	
	public List<TipoPago> gettipopagosEliminados() {
		return this.tipopagosEliminados;
	}

	public void setTipoPagosEliminados(List<TipoPago> tipopagosEliminados) {
		this.tipopagosEliminados = tipopagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPago() {
		return jComboBoxTiposSeleccionarTipoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPago(
			JComboBox jComboBoxTiposSeleccionarTipoPago) {
		this.jComboBoxTiposSeleccionarTipoPago = jComboBoxTiposSeleccionarTipoPago;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPago() {
		return jTextFieldValorCampoGeneralTipoPago;
	}

	public void setjTextFieldValorCampoGeneralTipoPago(
			JTextField jTextFieldValorCampoGeneralTipoPago) {
		this.jTextFieldValorCampoGeneralTipoPago = jTextFieldValorCampoGeneralTipoPago;
	}

	public void setBorderResaltarValorCampoGeneralTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPago() {
		return this.jCheckBoxSeleccionarTodosTipoPago;
	}

	public void setjCheckBoxSeleccionarTodosTipoPago(
			JCheckBox jCheckBoxSeleccionarTodosTipoPago) {
		this.jCheckBoxSeleccionarTodosTipoPago = jCheckBoxSeleccionarTodosTipoPago;
	}

	public void setBorderResaltarSeleccionarTodosTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPago() {
		return this.jCheckBoxSeleccionadosTipoPago;
	}

	public void setjCheckBoxSeleccionadosTipoPago(
			JCheckBox jCheckBoxSeleccionadosTipoPago) {
		this.jCheckBoxSeleccionadosTipoPago = jCheckBoxSeleccionadosTipoPago;
	}
	
	public void setBorderResaltarSeleccionadosTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPago() {
		return this.jComboBoxTiposArchivosReportesTipoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPago(
			JComboBox jComboBoxTiposArchivosReportesTipoPago) {
		this.jComboBoxTiposArchivosReportesTipoPago = jComboBoxTiposArchivosReportesTipoPago;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPago() {
		return this.jComboBoxTiposReportesTipoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPago(
			JComboBox jComboBoxTiposReportesTipoPago) {
		this.jComboBoxTiposReportesTipoPago = jComboBoxTiposReportesTipoPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPago() {
	//	return jComboBoxTiposReportesDinamicoTipoPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPago(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPago) {
	//	this.jComboBoxTiposReportesDinamicoTipoPago = jComboBoxTiposReportesDinamicoTipoPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPago = jComboBoxTiposArchivosReportesDinamicoTipoPago;
	//}
	
	public void setBorderResaltarTiposReportesTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPago() {
		return this.jComboBoxTiposGraficosReportesTipoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPago(
			JComboBox jComboBoxTiposGraficosReportesTipoPago) {
		this.jComboBoxTiposGraficosReportesTipoPago = jComboBoxTiposGraficosReportesTipoPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPago() {
		return this.jComboBoxTiposPaginacionTipoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPago(
			JComboBox jComboBoxTiposPaginacionTipoPago) {
		this.jComboBoxTiposPaginacionTipoPago = jComboBoxTiposPaginacionTipoPago;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPago() {
		return this.jComboBoxTiposRelacionesTipoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPago() {
		return this.jComboBoxTiposAccionesTipoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPago(
			JComboBox jComboBoxTiposRelacionesTipoPago) {
		this.jComboBoxTiposRelacionesTipoPago = jComboBoxTiposRelacionesTipoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPago(
			JComboBox jComboBoxTiposAccionesTipoPago) {
		this.jComboBoxTiposAccionesTipoPago = jComboBoxTiposAccionesTipoPago;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPago() {
	//	return jCheckBoxConGraficoDinamicoTipoPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPago) {
	//	this.jCheckBoxConGraficoDinamicoTipoPago = jCheckBoxConGraficoDinamicoTipoPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPago .setBorder(borderResaltar);		
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
		this.tipopagoSessionBean=new TipoPagoSessionBean();
		
		this.tipopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPago,this.jTtoolBarTipoPago,
							"nuevo","nuevo","Nuevo"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPago,this.jTtoolBarTipoPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPago,this.jTtoolBarTipoPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPago,this.jTtoolBarTipoPago,
							"duplicar","duplicar","Duplicar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPago,this.jTtoolBarTipoPago,
							"copiar","copiar","Copiar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPago,this.jTtoolBarTipoPago,
							"ver_form","ver_form","Ver"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPago,this.jTtoolBarTipoPago,
							"recargar","recargar","Recargar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPago,this.jTtoolBarTipoPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPago,this.jTtoolBarTipoPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPago,this.jTtoolBarTipoPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPago,this.jTtoolBarTipoPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPago,this.jTtoolBarTipoPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPago,this.jTtoolBarTipoPago,
							"cerrar","cerrar","Salir"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPago;
			
				this.jButtonProcesarInformacionToolBarTipoPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPago;
				
		//protected JButton jButtonModificarToolBarTipoPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPago=new JMenuMe("General");
		this.jmenuArchivoTipoPago=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPago=new JMenuMe("Acciones");
		this.jmenuDatosTipoPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPago.add(this.jMenuItemCerrarTipoPago);
			
			this.jmenuAccionesTipoPago.add(this.jMenuItemNuevoTipoPago);
			this.jmenuAccionesTipoPago.add(this.jMenuItemNuevoGuardarCambiosTipoPago);
			this.jmenuAccionesTipoPago.add(this.jMenuItemNuevoRelacionesTipoPago);
			this.jmenuAccionesTipoPago.add(this.jMenuItemGuardarCambiosTablaTipoPago);		
			this.jmenuAccionesTipoPago.add(this.jMenuItemDuplicarTipoPago);		
			this.jmenuAccionesTipoPago.add(this.jMenuItemCopiarTipoPago);		
			this.jmenuAccionesTipoPago.add(this.jMenuItemVerFormTipoPago);		
			
			this.jmenuDatosTipoPago.add(this.jMenuItemRecargarInformacionTipoPago);				
			this.jmenuDatosTipoPago.add(this.jMenuItemAnterioresTipoPago);				
			this.jmenuDatosTipoPago.add(this.jMenuItemSiguientesTipoPago);				
			this.jmenuDatosTipoPago.add(this.jMenuItemAbrirOrderByTipoPago);				
			this.jmenuDatosTipoPago.add(this.jMenuItemMostrarOcultarTipoPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPago.add(this.jMenuItemGuardarCambiosTipoPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPago.add(this.jmenuArchivoTipoPago);		
			this.jmenuBarTipoPago.add(this.jmenuAccionesTipoPago);		
			this.jmenuBarTipoPago.add(this.jmenuDatosTipoPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoPago=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPago = new TipoPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Pago DATOS");
			this.jInternalFrameDetalleFormTipoPago = new TipoPagoDetalleFormJInternalFrame(jDesktopPane,this.tipopagoSessionBean.getConGuardarRelaciones(),this.tipopagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPago = null;//new TipoPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPago= new GridBagLayout();
		
		
		this.jTableDatosTipoPago = new JTableMe();      
		
		String sToolTipTipoPago="";
		sToolTipTipoPago=TipoPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPago+="(Facturacion.TipoPago)";
		}
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPago.setToolTipText(sToolTipTipoPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPago);
		this.jTableDatosTipoPago.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPago.setRowSelectionAllowed(true);
		this.jTableDatosTipoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPago = new JButtonMe();
		this.jButtonDuplicarTipoPago = new JButtonMe();
		this.jButtonCopiarTipoPago = new JButtonMe();
		this.jButtonVerFormTipoPago = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPago = new JButtonMe();
		this.jButtonCerrarTipoPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Pago";
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPago=new ReporteDinamicoJInternalFrame(TipoPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPago=new ImportacionJInternalFrame(TipoPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPago = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPago.setText("Orden");
		this.jButtonAbrirOrderByTipoPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago,false,this);
			
			//this.cargarOrderByTipoPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago,true,this);
			
			//this.cargarOrderByTipoPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPago.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPago.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPago.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPago.setText("Nuevo");
		this.jButtonDuplicarTipoPago.setText("Duplicar");
		this.jButtonCopiarTipoPago.setText("Copiar");
		this.jButtonVerFormTipoPago.setText("Ver");
		this.jButtonNuevoRelacionesTipoPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPago.setText("Guardar");
		this.jButtonCerrarTipoPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPago,"nuevo_button","Nuevo",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPago,"duplicar_button","Duplicar",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPago,"copiar_button","Copiar",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPago,"ver_form","Ver",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPago,"nuevorelaciones_button","Nuevo Rel",this.tipopagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPago,"guardarcambiostabla_button","Guardar",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPago,"cerrar_button","Salir",this.tipopagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPago.setToolTipText("Nuevo"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPago.setToolTipText("Duplicar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPago.setToolTipText("Copiar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPago.setToolTipText("Ver"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPago.setToolTipText("Nuevo Rel"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPago.setToolTipText("Guardar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPago.setToolTipText("Salir"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPago";
		inputMap = this.jButtonNuevoTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPago";
		inputMap = this.jButtonDuplicarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPago"));
		
		//COPIAR
		sMapKey = "CopiarTipoPago";
		inputMap = this.jButtonCopiarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPago"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPago";
		inputMap = this.jButtonVerFormTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPago";
		inputMap = this.jButtonNuevoRelacionesTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPago";
		inputMap = this.jButtonModificarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPago";
		inputMap = this.jButtonCerrarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPago.setName("jPanelParametrosReportesTipoPago"); 
		
		this.jPanelParametrosReportesAccionesTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPago.setName("jPanelParametrosReportesAccionesTipoPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPago = new JButtonMe();
		this.jButtonRecargarInformacionTipoPago.setText("Recargar");
		this.jButtonRecargarInformacionTipoPago.setToolTipText("Recargar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPago = new JButtonMe();
		this.jButtonProcesarInformacionTipoPago.setText("Procesar");
		this.jButtonProcesarInformacionTipoPago.setToolTipText("Procesar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPago.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPago.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPago.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPago.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPago = new JLabelMe();
		
		this.jLabelAccionesTipoPago.setText("Acciones");		
		this.jLabelAccionesTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPago = new JButtonMe();
		//this.jButtonAnterioresTipoPago.setText("<<");
        this.jButtonAnterioresTipoPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPago = new JButtonMe();
		//this.jButtonSiguientesTipoPago.setText(">>");
        this.jButtonSiguientesTipoPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPago,"nuevoguardarcambios_button","Nue",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPago";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPago";
		inputMap = this.jButtonRecargarInformacionTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPago";
		inputMap = this.jButtonSiguientesTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPago";
		inputMap = this.jButtonAnterioresTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPago.setMinimumSize(new Dimension(this.getWidth(),TipoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPago.setMaximumSize(new Dimension(this.getWidth(),TipoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPago.setPreferredSize(new Dimension(this.getWidth(),TipoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPago = new GridBagLayout();

			this.jPanelPaginacionTipoPago.setLayout(gridaBagLayoutPaginacionTipoPago);						
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 0;
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPago.add(this.jButtonAnterioresTipoPago, this.gridBagConstraintsTipoPago);
					
						
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPago.gridy = 0;
			
			this.jPanelPaginacionTipoPago.add(this.jButtonNuevoGuardarCambiosTipoPago, this.gridBagConstraintsTipoPago);
						
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPago.gridy = 0;
			this.jPanelPaginacionTipoPago.add(this.jButtonSiguientesTipoPago, this.gridBagConstraintsTipoPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 1;
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago.add(this.jButtonNuevoTipoPago, this.gridBagConstraintsTipoPago);
						
			
			
			if(!this.tipopagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPago = new GridBagConstraints();
				this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPago.gridy = 1;
				this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPago.add(this.jButtonGuardarCambiosTablaTipoPago, this.gridBagConstraintsTipoPago);
			}
			
			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 1;
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago.add(this.jButtonDuplicarTipoPago, this.gridBagConstraintsTipoPago);
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 1;
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago.add(this.jButtonCopiarTipoPago, this.gridBagConstraintsTipoPago);
		
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 1;
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPago.add(this.jButtonVerFormTipoPago, this.gridBagConstraintsTipoPago);
		
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 1;
			this.gridBagConstraintsTipoPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPago.add(this.jButtonCerrarTipoPago, this.gridBagConstraintsTipoPago);
		
		
		
		this.jButtonRecargarInformacionTipoPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPago.setLayout(gridaBagParametrosReportesTipoPago);
			this.jPanelParametrosReportesAccionesTipoPago.setLayout(gridaBagParametrosReportesAccionesTipoPago);
			
			
			this.jPanelParametrosAuxiliar1TipoPago.setLayout(gridaBagParametrosAuxiliar1TipoPago);
			this.jPanelParametrosAuxiliar2TipoPago.setLayout(gridaBagParametrosAuxiliar2TipoPago);
			this.jPanelParametrosAuxiliar3TipoPago.setLayout(gridaBagParametrosAuxiliar3TipoPago);
			this.jPanelParametrosAuxiliar4TipoPago.setLayout(gridaBagParametrosAuxiliar4TipoPago);
			//this.jPanelParametrosAuxiliar5TipoPago.setLayout(gridaBagParametrosAuxiliar2TipoPago);			
			
			
			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago.add(this.jButtonRecargarInformacionTipoPago, this.gridBagConstraintsTipoPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPago.add(this.jComboBoxTiposPaginacionTipoPago, this.gridBagConstraintsTipoPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPago.add(this.jCheckBoxConAltoMaximoTablaTipoPago, this.gridBagConstraintsTipoPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPago.add(this.jComboBoxTiposArchivosReportesTipoPago, this.gridBagConstraintsTipoPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago.add(this.jPanelParametrosAuxiliar1TipoPago, this.gridBagConstraintsTipoPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPago.add(this.jComboBoxTiposReportesTipoPago, this.gridBagConstraintsTipoPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago.add(this.jPanelParametrosAuxiliar4TipoPago, this.gridBagConstraintsTipoPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago.add(this.jComboBoxTiposReportesTipoPago, this.gridBagConstraintsTipoPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPago.add(this.jCheckBoxGenerarReporteTipoPago, this.gridBagConstraintsTipoPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago.add(this.jPanelParametrosAuxiliar2TipoPago, this.gridBagConstraintsTipoPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPago.add(this.jLabelAccionesTipoPago, this.gridBagConstraintsTipoPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPago = new GridBagConstraints();
				this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPago.add(this.jButtonAbrirOrderByTipoPago, this.gridBagConstraintsTipoPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago.add(this.jComboBoxTiposSeleccionarTipoPago, this.gridBagConstraintsTipoPago);			
			
			
			/*
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPago.add(this.jCheckBoxSeleccionarTodosTipoPago, this.gridBagConstraintsTipoPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPago.add(this.jCheckBoxSeleccionarTodosTipoPago, this.gridBagConstraintsTipoPago);															
				
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPago.add(this.jCheckBoxSeleccionadosTipoPago, this.gridBagConstraintsTipoPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPago.add(this.jPanelParametrosAuxiliar3TipoPago, this.gridBagConstraintsTipoPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago.add(this.jComboBoxTiposAccionesTipoPago, this.gridBagConstraintsTipoPago);
	
				
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPago.add(this.jTextFieldValorCampoGeneralTipoPago, this.gridBagConstraintsTipoPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPago = new GridBagLayout();

			this.jScrollPanelDatosTipoPago.setLayout(gridaBagLayoutDatosTipoPago);
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = 0;
			this.gridBagConstraintsTipoPago.gridx = 0;
			
			this.jScrollPanelDatosTipoPago.add(this.jTableDatosTipoPago, this.gridBagConstraintsTipoPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPago.setViewportView(this.jTableDatosTipoPago);
		this.jTableDatosTipoPago.setFillsViewportHeight(true);
		this.jTableDatosTipoPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPago= new GridBagLayout();
		this.jPanelAccionesTipoPago.setLayout(gridaBagLayoutAccionesTipoPago);
		
		
		/*	
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx = 0;
			
		this.jPanelAccionesTipoPago.add(this.jButtonNuevoTipoPago, this.gridBagConstraintsTipoPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPago.gridx = 0;		
			//this.gridBagConstraintsTipoPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPago, this.gridBagConstraintsTipoPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPago.gridx = 0;		
		//this.gridBagConstraintsTipoPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPago, this.gridBagConstraintsTipoPago);								
		
		
		/*
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPago, this.gridBagConstraintsTipoPago);
		*/		
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPago.gridx =0;
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPago, this.gridBagConstraintsTipoPago);
				
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPago, this.gridBagConstraintsTipoPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPago = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPago.setLayout(gridaBagLayoutBusquedasParametrosTipoPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPago, this.gridBagConstraintsTipoPago);
			
			
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPago, this.gridBagConstraintsTipoPago);
		
			
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPago, this.gridBagConstraintsTipoPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPago.setName("jPanelReporteDinamicoTipoPago"); 
		
		this.jPanelReporteDinamicoTipoPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPago.setLayout(gridaBagLayoutReporteDinamicoTipoPago);
		
		
		this.jInternalFrameReporteDinamicoTipoPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPago = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPago.add(this.jLabelColumnasSelectReporteTipoPago, this.gridBagConstraintsTipoPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPago = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPago=new JScrollPane(this.jListColumnasSelectReporteTipoPago);
			
			this.jScrollColumnasSelectReporteTipoPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPago.add(this.jListColumnasSelectReporteTipoPago, this.gridBagConstraintsTipoPago);
		this.jPanelReporteDinamicoTipoPago.add(this.jScrollColumnasSelectReporteTipoPago, this.gridBagConstraintsTipoPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPago=new JScrollPane(this.jListRelacionesSelectReporteTipoPago);
			
			this.jScrollRelacionesSelectReporteTipoPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPago.add(this.jLabelGenerarExcelReporteDinamicoTipoPago, this.gridBagConstraintsTipoPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPago.setToolTipText("Generar EXCEL"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPago.add(this.jButtonGenerarExcelReporteDinamicoTipoPago, this.gridBagConstraintsTipoPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago.add(this.jComboBoxTiposReportesDinamicoTipoPago, this.gridBagConstraintsTipoPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPago.add(this.jLabelTiposArchivoReporteDinamicoTipoPago, this.gridBagConstraintsTipoPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPago, this.gridBagConstraintsTipoPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPago.setToolTipText("Generar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago.add(this.jButtonGenerarReporteDinamicoTipoPago, this.gridBagConstraintsTipoPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPago.setToolTipText("Cancelar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPago.add(this.jButtonCerrarReporteDinamicoTipoPago, this.gridBagConstraintsTipoPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPago= new JScrollPane(jPanelReporteDinamicoTipoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPago);
		this.jInternalFrameReporteDinamicoTipoPago.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPago, this.gridBagConstraintsTipoPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPago.setName("jPanelImportacionTipoPago"); 
		
		this.jPanelImportacionTipoPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPago.setLayout(gridaBagLayoutImportacionTipoPago);
		
		
		this.jInternalFrameImportacionTipoPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPago.setResizable(true);
	    this.jInternalFrameImportacionTipoPago.setClosable(true);
	    this.jInternalFrameImportacionTipoPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPago.setResizable(true);
	    this.jInternalFrameImportacionTipoPago.setClosable(true);
	    this.jInternalFrameImportacionTipoPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPago = new JLabelMe();

		this.jLabelArchivoImportacionTipoPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPago.add(this.jLabelArchivoImportacionTipoPago, this.gridBagConstraintsTipoPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPago = new JFileChooser();		
		this.jFileChooserImportacionTipoPago.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPago = new JButtonMe();
		this.jButtonAbrirImportacionTipoPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPago.setToolTipText("Generar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago.add(this.jButtonAbrirImportacionTipoPago, this.gridBagConstraintsTipoPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPago = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPago.add(this.jLabelPathArchivoImportacionTipoPago, this.gridBagConstraintsTipoPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago.add(this.jTextFieldPathArchivoImportacionTipoPago, this.gridBagConstraintsTipoPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPago = new JButtonMe();
		this.jButtonGenerarImportacionTipoPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPago.setToolTipText("Generar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago.add(this.jButtonGenerarImportacionTipoPago, this.gridBagConstraintsTipoPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPago = new JButtonMe();
		this.jButtonCerrarImportacionTipoPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPago.setToolTipText("Cancelar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPago.add(this.jButtonCerrarImportacionTipoPago, this.gridBagConstraintsTipoPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPago = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPago= new JScrollPane(jPanelImportacionTipoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPago.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPago);
		this.jInternalFrameImportacionTipoPago.getContentPane().add(this.jScrollPanelImportacionTipoPago, this.gridBagConstraintsTipoPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPago = new JButtonMe();
			this.jButtonAbrirOrderByTipoPago.setText("Orden");
			this.jButtonAbrirOrderByTipoPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPago";
			inputMap = this.jButtonAbrirOrderByTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPago.setName("jPanelOrderByTipoPago"); 
			
			this.jPanelOrderByTipoPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPago.setLayout(gridaBagLayoutOrderByTipoPago);
			
			
			this.jTableDatosTipoPagoOrderBy = new JTableMe();        
			this.jTableDatosTipoPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPagoOrderBy.setViewportView(this.jTableDatosTipoPagoOrderBy);
			this.jTableDatosTipoPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPago.setTitle("Orden");
			this.jInternalFrameOrderByTipoPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPago.setResizable(true);
			this.jInternalFrameOrderByTipoPago.setClosable(true);
			this.jInternalFrameOrderByTipoPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPago.ipady =150;
				
			this.jPanelOrderByTipoPago.add(jScrollPanelDatosTipoPagoOrderBy, this.gridBagConstraintsTipoPago);//this.jTableDatosTipoPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPago = new JButtonMe();
			this.jButtonCerrarOrderByTipoPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPago.setToolTipText("Cancelar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPago.add(this.jButtonCerrarOrderByTipoPago, this.gridBagConstraintsTipoPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPago = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPago= new JScrollPane(jPanelOrderByTipoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPago);
			
			this.jInternalFrameOrderByTipoPago.getContentPane().add(this.jScrollPanelOrderByTipoPago, this.gridBagConstraintsTipoPago);			
		
		} else {
			this.jButtonAbrirOrderByTipoPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipopagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPago.getRowHeight();//TipoPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPago.isSelected()) {
					iHeightTable=TipoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPago.isSelected()) {
					iHeightTable=TipoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPago!=null && this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy()!=null) {
			//if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipopagoLogic.getTipoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPago> TraerTipoPagoBeans(List<TipoPago> tipopagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPago tipopago:tipopagos) {
					
				if(!(TipoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipopago.setsDetalleGeneralEntityReporte(TipoPagoConstantesFunciones.getTipoPagoDescripcion(tipopago));
										
						
					
						
					
				} else  {
							
					//tipopago.setsDetalleGeneralEntityReporte(tipopago.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipopagobeans.add(tipopagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipopagos;
    }
	//PARA REPORTES FIN
}
