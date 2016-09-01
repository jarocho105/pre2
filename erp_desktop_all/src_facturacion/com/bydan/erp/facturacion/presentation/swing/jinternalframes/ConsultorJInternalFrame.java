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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;

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
import com.bydan.erp.facturacion.util.ConsultorConstantesFunciones;

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
public class ConsultorJInternalFrame extends ConsultorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsultor;
	
	protected JMenuBar jmenuBarConsultor;
	
	protected JMenu jmenuConsultor;
	protected JMenu jmenuDatosConsultor;
	protected JMenu jmenuArchivoConsultor;
	protected JMenu jmenuAccionesConsultor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsultor;	
	protected GridBagConstraints gridBagConstraintsConsultor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsultorDetalleFormJInternalFrame jInternalFrameDetalleFormConsultor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsultor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsultor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ConsultorSessionBean consultorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Consultor> consultors;		
	public List<Consultor> consultorsEliminados;	
	public List<Consultor> consultorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsultor;		
	protected JButton jButtonAbrirOrderByConsultor;
	
	
	//protected JPanel jPanelOrderByConsultor;
	//public JScrollPane jScrollPanelOrderByConsultor;	
	//protected JButton jButtonCerrarOrderByConsultor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsultorLogic consultorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsultor;
	public JScrollPane jScrollPanelDatosEdicionConsultor;
	public JScrollPane jScrollPanelDatosGeneralConsultor;
    
	
	
	//public JScrollPane jScrollPanelDatosConsultorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsultor;
	//public JScrollPane jScrollPanelImportacionConsultor;
	
	
	
	protected JPanel jPanelAccionesConsultor;
	
    protected JPanel jPanelPaginacionConsultor;
    protected JPanel jPanelParametrosReportesConsultor;
	protected JPanel jPanelParametrosReportesAccionesConsultor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Consultor;
	protected JPanel jPanelParametrosAuxiliar2Consultor;
	protected JPanel jPanelParametrosAuxiliar3Consultor;
	protected JPanel jPanelParametrosAuxiliar4Consultor;
	//protected JPanel jPanelParametrosAuxiliar5Consultor;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsultor;
	//protected JPanel jPanelImportacionConsultor;
	
	
	public JTable jTableDatosConsultor;
	
	
	
	//public JTable jTableDatosConsultorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsultor;
	protected JButton jButtonDuplicarConsultor;
	protected JButton jButtonCopiarConsultor;
	protected JButton jButtonVerFormConsultor;
	protected JButton jButtonNuevoRelacionesConsultor;
	protected JButton jButtonModificarConsultor;
	
    protected JButton jButtonGuardarCambiosTablaConsultor;
	protected JButton jButtonCerrarConsultor;
	
	
	protected JButton jButtonRecargarInformacionConsultor;
	protected JButton jButtonProcesarInformacionConsultor;
	
	
	protected JButton jButtonAnterioresConsultor;
	protected JButton jButtonSiguientesConsultor;
	protected JButton jButtonNuevoGuardarCambiosConsultor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsultor;
	//protected JButton jButtonCerrarReporteDinamicoConsultor;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsultor;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsultor;
	//protected JButton jButtonGenerarImportacionConsultor;
	//protected JButton jButtonCerrarImportacionConsultor;
	//protected JFileChooser jFileChooserImportacionConsultor;
	//protected File fileImportacionConsultor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsultor;
	protected JButton jButtonDuplicarToolBarConsultor;
	protected JButton jButtonNuevoRelacionesToolBarConsultor;
	
	
	public JButton jButtonGuardarCambiosToolBarConsultor;
	protected JButton jButtonCopiarToolBarConsultor;
	protected JButton jButtonVerFormToolBarConsultor;
	public JButton jButtonGuardarCambiosTablaToolBarConsultor;
	protected JButton jButtonMostrarOcultarTablaToolBarConsultor;
	protected JButton jButtonCerrarToolBarConsultor;
	
	protected JButton jButtonRecargarInformacionToolBarConsultor;
	protected JButton jButtonProcesarInformacionToolBarConsultor;
	protected JButton jButtonAnterioresToolBarConsultor;
	protected JButton jButtonSiguientesToolBarConsultor;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsultor;
	protected JButton jButtonAbrirOrderByToolBarConsultor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsultor;
	protected JMenuItem jMenuItemDuplicarConsultor;
	protected JMenuItem jMenuItemNuevoRelacionesConsultor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsultor;
	protected JMenuItem jMenuItemCopiarConsultor;
	protected JMenuItem jMenuItemVerFormConsultor;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsultor;
	protected JMenuItem jMenuItemCerrarConsultor;
	protected JMenuItem jMenuItemDetalleCerrarConsultor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsultor;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsultor;
	
	protected JMenuItem jMenuItemRecargarInformacionConsultor;
	protected JMenuItem jMenuItemProcesarInformacionConsultor;
	protected JMenuItem jMenuItemAnterioresConsultor;
	protected JMenuItem jMenuItemSiguientesConsultor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsultor;
	protected JMenuItem jMenuItemAbrirOrderByConsultor;
	protected JMenuItem jMenuItemMostrarOcultarConsultor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsultor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsultor;
	protected JCheckBox jCheckBoxSeleccionadosConsultor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsultor;
	protected JCheckBox jCheckBoxConGraficoReporteConsultor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsultor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsultor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsultor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsultor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsultor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsultor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsultor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsultor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsultor;
	protected JTextField jTextFieldValorCampoGeneralConsultor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsultor;
	//public JList<Reporte> jListColumnasSelectReporteConsultor;
	//public JScrollPane jScrollColumnasSelectReporteConsultor;
	
	//public JLabel jLabelRelacionesSelectReporteConsultor;
	//public JList<Reporte> jListRelacionesSelectReporteConsultor;
	//public JScrollPane jScrollRelacionesSelectReporteConsultor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsultor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsultor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsultor;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsultor;
	
		
	//public JLabel jLabelArchivoImportacionConsultor;	
	//public JLabel jLabelPathArchivoImportacionConsultor;
	//protected JTextField jTextFieldPathArchivoImportacionConsultor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsultor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsultor;
	
	//public JLabel jLabelColumnaCategoriaValorConsultor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsultor;
	
	//public JLabel jLabelColumnasValoresGraficoConsultor;
	//public JList<Reporte> jListColumnasValoresGraficoConsultor;
	//public JScrollPane jScrollColumnasValoresGraficoConsultor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsultor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsultor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsultor;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsultorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsultor)	{
		this.jButtonRecargarInformacionConsultor = jButtonRecargarInformacionConsultor;
	}
	
	public JButton getjButtonProcesarInformacionConsultor() {
		return this.jButtonProcesarInformacionConsultor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsultor)	{
		this.jButtonProcesarInformacionConsultor = jButtonProcesarInformacionConsultor;
	}
	
	
	public JButton getjButtonRecargarInformacionConsultor() {
		return this.jButtonRecargarInformacionConsultor;
	}
	
	
	public List<Consultor> getconsultors() {
		return this.consultors;
	}

	public void setconsultors(List<Consultor> consultors) {
		this.consultors = consultors;
	}
	
	public List<Consultor> getconsultorsAux() {
		return this.consultorsAux;
	}

	public void setconsultorsAux(List<Consultor> consultorsAux) {
		this.consultorsAux = consultorsAux;
	}
	
	public List<Consultor> getconsultorsEliminados() {
		return this.consultorsEliminados;
	}

	public void setConsultorsEliminados(List<Consultor> consultorsEliminados) {
		this.consultorsEliminados = consultorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsultor() {
		return jComboBoxTiposSeleccionarConsultor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsultor(
			JComboBox jComboBoxTiposSeleccionarConsultor) {
		this.jComboBoxTiposSeleccionarConsultor = jComboBoxTiposSeleccionarConsultor;
	}
	
	public void setBorderResaltarTiposSeleccionarConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsultor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsultor() {
		return jTextFieldValorCampoGeneralConsultor;
	}

	public void setjTextFieldValorCampoGeneralConsultor(
			JTextField jTextFieldValorCampoGeneralConsultor) {
		this.jTextFieldValorCampoGeneralConsultor = jTextFieldValorCampoGeneralConsultor;
	}

	public void setBorderResaltarValorCampoGeneralConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsultor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsultor() {
		return this.jCheckBoxSeleccionarTodosConsultor;
	}

	public void setjCheckBoxSeleccionarTodosConsultor(
			JCheckBox jCheckBoxSeleccionarTodosConsultor) {
		this.jCheckBoxSeleccionarTodosConsultor = jCheckBoxSeleccionarTodosConsultor;
	}

	public void setBorderResaltarSeleccionarTodosConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsultor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsultor() {
		return this.jCheckBoxSeleccionadosConsultor;
	}

	public void setjCheckBoxSeleccionadosConsultor(
			JCheckBox jCheckBoxSeleccionadosConsultor) {
		this.jCheckBoxSeleccionadosConsultor = jCheckBoxSeleccionadosConsultor;
	}
	
	public void setBorderResaltarSeleccionadosConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsultor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsultor() {
		return this.jComboBoxTiposArchivosReportesConsultor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsultor(
			JComboBox jComboBoxTiposArchivosReportesConsultor) {
		this.jComboBoxTiposArchivosReportesConsultor = jComboBoxTiposArchivosReportesConsultor;
	}

	public void setBorderResaltarTiposArchivosReportesConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsultor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsultor() {
		return this.jComboBoxTiposReportesConsultor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsultor(
			JComboBox jComboBoxTiposReportesConsultor) {
		this.jComboBoxTiposReportesConsultor = jComboBoxTiposReportesConsultor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsultor() {
	//	return jComboBoxTiposReportesDinamicoConsultor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsultor(
	//		JComboBox jComboBoxTiposReportesDinamicoConsultor) {
	//	this.jComboBoxTiposReportesDinamicoConsultor = jComboBoxTiposReportesDinamicoConsultor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsultor() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsultor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsultor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsultor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsultor = jComboBoxTiposArchivosReportesDinamicoConsultor;
	//}
	
	public void setBorderResaltarTiposReportesConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsultor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsultor() {
		return this.jComboBoxTiposGraficosReportesConsultor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsultor(
			JComboBox jComboBoxTiposGraficosReportesConsultor) {
		this.jComboBoxTiposGraficosReportesConsultor = jComboBoxTiposGraficosReportesConsultor;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsultor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsultor() {
		return this.jComboBoxTiposPaginacionConsultor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsultor(
			JComboBox jComboBoxTiposPaginacionConsultor) {
		this.jComboBoxTiposPaginacionConsultor = jComboBoxTiposPaginacionConsultor;
	}
	
	public void setBorderResaltarTiposPaginacionConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsultor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsultor() {
		return this.jComboBoxTiposRelacionesConsultor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsultor() {
		return this.jComboBoxTiposAccionesConsultor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsultor(
			JComboBox jComboBoxTiposRelacionesConsultor) {
		this.jComboBoxTiposRelacionesConsultor = jComboBoxTiposRelacionesConsultor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsultor(
			JComboBox jComboBoxTiposAccionesConsultor) {
		this.jComboBoxTiposAccionesConsultor = jComboBoxTiposAccionesConsultor;
	}
	
	public void setBorderResaltarTiposRelacionesConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsultor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsultor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsultor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsultor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsultor() {
	//	return jCheckBoxConGraficoDinamicoConsultor;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsultor(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsultor) {
	//	this.jCheckBoxConGraficoDinamicoConsultor = jCheckBoxConGraficoDinamicoConsultor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsultor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsultor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsultor .setBorder(borderResaltar);		
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
		this.consultorSessionBean=new ConsultorSessionBean();
		
		this.consultorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consultorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consultorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsultorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consultor MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsultorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsultor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsultor,this.jTtoolBarConsultor,
							"nuevo","nuevo","Nuevo"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsultor,this.jTtoolBarConsultor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsultor,this.jTtoolBarConsultor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsultor,this.jTtoolBarConsultor,
							"duplicar","duplicar","Duplicar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsultor,this.jTtoolBarConsultor,
							"copiar","copiar","Copiar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsultor,this.jTtoolBarConsultor,
							"ver_form","ver_form","Ver"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsultor,this.jTtoolBarConsultor,
							"recargar","recargar","Recargar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsultor,this.jTtoolBarConsultor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsultor,this.jTtoolBarConsultor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsultor,this.jTtoolBarConsultor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsultor,this.jTtoolBarConsultor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsultor,this.jTtoolBarConsultor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsultor,this.jTtoolBarConsultor,
							"cerrar","cerrar","Salir"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsultor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsultor;
			
				this.jButtonProcesarInformacionToolBarConsultor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsultor;
				
		//protected JButton jButtonModificarToolBarConsultor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsultor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsultor=new JMenuMe("General");
		this.jmenuArchivoConsultor=new JMenuMe("Archivo");
		this.jmenuAccionesConsultor=new JMenuMe("Acciones");
		this.jmenuDatosConsultor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsultor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsultor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsultor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsultor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsultor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsultor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsultor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsultor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsultor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsultor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsultor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsultor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsultor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsultor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsultor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsultor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsultor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsultor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsultor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsultor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsultor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsultor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsultor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsultor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsultor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsultor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsultor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsultor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsultor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsultor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsultor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsultor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsultor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsultor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsultor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsultor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsultor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsultor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsultor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsultor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsultor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsultor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsultor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsultor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsultor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsultor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsultor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsultor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsultor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsultor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsultor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsultor.add(this.jMenuItemCerrarConsultor);
			
			this.jmenuAccionesConsultor.add(this.jMenuItemNuevoConsultor);
			this.jmenuAccionesConsultor.add(this.jMenuItemNuevoGuardarCambiosConsultor);
			this.jmenuAccionesConsultor.add(this.jMenuItemNuevoRelacionesConsultor);
			this.jmenuAccionesConsultor.add(this.jMenuItemGuardarCambiosTablaConsultor);		
			this.jmenuAccionesConsultor.add(this.jMenuItemDuplicarConsultor);		
			this.jmenuAccionesConsultor.add(this.jMenuItemCopiarConsultor);		
			this.jmenuAccionesConsultor.add(this.jMenuItemVerFormConsultor);		
			
			this.jmenuDatosConsultor.add(this.jMenuItemRecargarInformacionConsultor);				
			this.jmenuDatosConsultor.add(this.jMenuItemAnterioresConsultor);				
			this.jmenuDatosConsultor.add(this.jMenuItemSiguientesConsultor);				
			this.jmenuDatosConsultor.add(this.jMenuItemAbrirOrderByConsultor);				
			this.jmenuDatosConsultor.add(this.jMenuItemMostrarOcultarConsultor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsultor.add(this.jMenuItemGuardarCambiosConsultor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsultor.add(this.jmenuArchivoConsultor);		
			this.jmenuBarConsultor.add(this.jmenuAccionesConsultor);		
			this.jmenuBarConsultor.add(this.jmenuDatosConsultor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsultor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsultor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasConsultor=new JTabbedPane();


		this.jTabbedPaneBusquedasConsultor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConsultor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConsultor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsultor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsultor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsultor = new ConsultorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consultor DATOS");
			this.jInternalFrameDetalleFormConsultor = new ConsultorDetalleFormJInternalFrame(jDesktopPane,this.consultorSessionBean.getConGuardarRelaciones(),this.consultorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsultor = null;//new ConsultorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsultor= new GridBagLayout();
		
		
		this.jTableDatosConsultor = new JTableMe();      
		
		String sToolTipConsultor="";
		sToolTipConsultor=ConsultorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsultor+="(Facturacion.Consultor)";
		}
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsultor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsultor.setToolTipText(sToolTipConsultor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsultor);
		this.jTableDatosConsultor.setAutoCreateRowSorter(true);
		this.jTableDatosConsultor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsultor.setRowSelectionAllowed(true);
		this.jTableDatosConsultor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsultor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsultor = new JButtonMe();
		this.jButtonDuplicarConsultor = new JButtonMe();
		this.jButtonCopiarConsultor = new JButtonMe();
		this.jButtonVerFormConsultor = new JButtonMe();
		this.jButtonNuevoRelacionesConsultor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsultor = new JButtonMe();
		this.jButtonCerrarConsultor = new JButtonMe();
		
		this.jScrollPanelDatosConsultor = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsultor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Consultor";
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consultores" + this.sPath));
		} else {
			this.jScrollPanelDatosConsultor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsultor.setToolTipText("Acciones");
        this.jPanelAccionesConsultor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsultor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConsultor=new ReporteDinamicoJInternalFrame(ConsultorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsultor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsultor=new ImportacionJInternalFrame(ConsultorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsultor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsultor = new JButtonMe();
		
		this.jButtonAbrirOrderByConsultor.setText("Orden");
		this.jButtonAbrirOrderByConsultor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsultor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsultor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsultor,false,this);
			
			//this.cargarOrderByConsultor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsultor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsultor,true,this);
			
			//this.cargarOrderByConsultor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsultor.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosConsultor.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosConsultor.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosConsultor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsultor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsultor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsultor.setText("Nuevo");
		this.jButtonDuplicarConsultor.setText("Duplicar");
		this.jButtonCopiarConsultor.setText("Copiar");
		this.jButtonVerFormConsultor.setText("Ver");
		this.jButtonNuevoRelacionesConsultor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsultor.setText("Guardar");
		this.jButtonCerrarConsultor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsultor,"nuevo_button","Nuevo",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsultor,"duplicar_button","Duplicar",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsultor,"copiar_button","Copiar",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsultor,"ver_form","Ver",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsultor,"nuevorelaciones_button","Nuevo Rel",this.consultorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsultor,"guardarcambiostabla_button","Guardar",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsultor,"cerrar_button","Salir",this.consultorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsultor.setToolTipText("Nuevo"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsultor.setToolTipText("Duplicar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsultor.setToolTipText("Copiar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsultor.setToolTipText("Ver"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsultor.setToolTipText("Nuevo Rel"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsultor.setToolTipText("Guardar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsultor.setToolTipText("Salir"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsultor";
		inputMap = this.jButtonNuevoConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsultor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsultor"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsultor";
		inputMap = this.jButtonDuplicarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsultor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsultor"));
		
		//COPIAR
		sMapKey = "CopiarConsultor";
		inputMap = this.jButtonCopiarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsultor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsultor"));
		
		//VEr FORM
		sMapKey = "VerFormConsultor";
		inputMap = this.jButtonVerFormConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsultor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsultor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsultor";
		inputMap = this.jButtonNuevoRelacionesConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsultor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsultor";
		inputMap = this.jButtonModificarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsultor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsultor";
		inputMap = this.jButtonCerrarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsultor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsultor";
		inputMap = this.jButtonGuardarCambiosTablaConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsultor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Consultor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Consultor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Consultor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Consultor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Consultor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsultor.setName("jPanelParametrosReportesConsultor"); 
		
		this.jPanelParametrosReportesAccionesConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsultor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsultor.setName("jPanelParametrosReportesAccionesConsultor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsultor = new JButtonMe();
		this.jButtonRecargarInformacionConsultor.setText("Recargar");
		this.jButtonRecargarInformacionConsultor.setToolTipText("Recargar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsultor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConsultor = new JButtonMe();
		this.jButtonProcesarInformacionConsultor.setText("Procesar");
		this.jButtonProcesarInformacionConsultor.setToolTipText("Procesar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsultor.setVisible(false);
			
		this.jButtonProcesarInformacionConsultor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsultor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsultor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsultor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsultor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsultor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsultor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsultor.setText("TIPO");       
		this.jComboBoxTiposReportesConsultor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsultor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsultor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsultor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsultor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsultor.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsultor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsultor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsultor.setText("Accion");
		this.jComboBoxTiposRelacionesConsultor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsultor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsultor.setText("Accion");
		this.jComboBoxTiposAccionesConsultor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsultor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsultor.setText("Accion");
		this.jComboBoxTiposSeleccionarConsultor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsultor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsultor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsultor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsultor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsultor = new JLabelMe();
		
		this.jLabelAccionesConsultor.setText("Acciones");		
		this.jLabelAccionesConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsultor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsultor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsultor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsultor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsultor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsultor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsultor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsultor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsultor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsultor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsultor.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsultor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsultor = new JButtonMe();
		//this.jButtonAnterioresConsultor.setText("<<");
        this.jButtonAnterioresConsultor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsultor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsultor = new JButtonMe();
		//this.jButtonSiguientesConsultor.setText(">>");
        this.jButtonSiguientesConsultor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsultor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsultor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsultor.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsultor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsultor,"nuevoguardarcambios_button","Nue",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsultor";
		inputMap = this.jButtonNuevoGuardarCambiosConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsultor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsultor";
		inputMap = this.jButtonRecargarInformacionConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsultor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsultor";
		inputMap = this.jButtonSiguientesConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsultor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsultor";
		inputMap = this.jButtonAnterioresConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsultor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsultor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsultor.setMinimumSize(new Dimension(this.getWidth(),ConsultorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsultorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsultor.setMaximumSize(new Dimension(this.getWidth(),ConsultorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsultorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsultor.setPreferredSize(new Dimension(this.getWidth(),ConsultorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsultorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsultor = new GridBagLayout();

			this.jPanelPaginacionConsultor.setLayout(gridaBagLayoutPaginacionConsultor);						
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 0;
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsultor.add(this.jButtonAnterioresConsultor, this.gridBagConstraintsConsultor);
					
						
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsultor.gridy = 0;
			
			this.jPanelPaginacionConsultor.add(this.jButtonNuevoGuardarCambiosConsultor, this.gridBagConstraintsConsultor);
						
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsultor.gridy = 0;
			this.jPanelPaginacionConsultor.add(this.jButtonSiguientesConsultor, this.gridBagConstraintsConsultor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 1;
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsultor.add(this.jButtonNuevoConsultor, this.gridBagConstraintsConsultor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsConsultor = new GridBagConstraints();
				this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsultor.gridy = 1;
				this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionConsultor.add(this.jButtonNuevoRelacionesConsultor, this.gridBagConstraintsConsultor);
			}
			
			
			if(!this.consultorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsultor = new GridBagConstraints();
				this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsultor.gridy = 1;
				this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConsultor.add(this.jButtonGuardarCambiosTablaConsultor, this.gridBagConstraintsConsultor);
			}
			
			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 1;
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsultor.add(this.jButtonDuplicarConsultor, this.gridBagConstraintsConsultor);
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 1;
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsultor.add(this.jButtonCopiarConsultor, this.gridBagConstraintsConsultor);
		
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 1;
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsultor.add(this.jButtonVerFormConsultor, this.gridBagConstraintsConsultor);
		
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 1;
			this.gridBagConstraintsConsultor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsultor.add(this.jButtonCerrarConsultor, this.gridBagConstraintsConsultor);
		
		
		
		this.jButtonRecargarInformacionConsultor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsultor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsultor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsultor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsultor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsultor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsultor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsultor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsultor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsultor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsultor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsultor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsultor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsultor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsultor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsultor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsultor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsultor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsultor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsultor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsultor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsultor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsultor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsultor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsultor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsultor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsultor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsultor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsultor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsultor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsultor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsultor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsultor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsultor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsultor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsultor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsultor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsultor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsultor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsultor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Consultor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Consultor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Consultor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Consultor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsultor.setLayout(gridaBagParametrosReportesConsultor);
			this.jPanelParametrosReportesAccionesConsultor.setLayout(gridaBagParametrosReportesAccionesConsultor);
			
			
			this.jPanelParametrosAuxiliar1Consultor.setLayout(gridaBagParametrosAuxiliar1Consultor);
			this.jPanelParametrosAuxiliar2Consultor.setLayout(gridaBagParametrosAuxiliar2Consultor);
			this.jPanelParametrosAuxiliar3Consultor.setLayout(gridaBagParametrosAuxiliar3Consultor);
			this.jPanelParametrosAuxiliar4Consultor.setLayout(gridaBagParametrosAuxiliar4Consultor);
			//this.jPanelParametrosAuxiliar5Consultor.setLayout(gridaBagParametrosAuxiliar2Consultor);			
			
			
			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsultor.add(this.jButtonRecargarInformacionConsultor, this.gridBagConstraintsConsultor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consultor.add(this.jComboBoxTiposPaginacionConsultor, this.gridBagConstraintsConsultor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consultor.add(this.jCheckBoxConAltoMaximoTablaConsultor, this.gridBagConstraintsConsultor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consultor.add(this.jComboBoxTiposArchivosReportesConsultor, this.gridBagConstraintsConsultor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsultor.add(this.jPanelParametrosAuxiliar1Consultor, this.gridBagConstraintsConsultor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsultor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Consultor.add(this.jComboBoxTiposReportesConsultor, this.gridBagConstraintsConsultor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsultor.add(this.jPanelParametrosAuxiliar4Consultor, this.gridBagConstraintsConsultor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsultor.add(this.jComboBoxTiposReportesConsultor, this.gridBagConstraintsConsultor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsultor.add(this.jCheckBoxGenerarReporteConsultor, this.gridBagConstraintsConsultor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsultor.add(this.jPanelParametrosAuxiliar2Consultor, this.gridBagConstraintsConsultor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsultor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsultor.add(this.jLabelAccionesConsultor, this.gridBagConstraintsConsultor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsultor = new GridBagConstraints();
				this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsultor.add(this.jButtonAbrirOrderByConsultor, this.gridBagConstraintsConsultor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsultor.add(this.jComboBoxTiposSeleccionarConsultor, this.gridBagConstraintsConsultor);			
			
			
			/*
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsultor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsultor.add(this.jCheckBoxSeleccionarTodosConsultor, this.gridBagConstraintsConsultor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsultor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consultor.add(this.jCheckBoxSeleccionarTodosConsultor, this.gridBagConstraintsConsultor);															
				
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsultor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consultor.add(this.jCheckBoxSeleccionadosConsultor, this.gridBagConstraintsConsultor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsultor.add(this.jPanelParametrosAuxiliar3Consultor, this.gridBagConstraintsConsultor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsultor.add(this.jComboBoxTiposRelacionesConsultor, this.gridBagConstraintsConsultor);
				
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsultor.add(this.jComboBoxTiposAccionesConsultor, this.gridBagConstraintsConsultor);
	
				
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsultor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsultor.add(this.jTextFieldValorCampoGeneralConsultor, this.gridBagConstraintsConsultor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsultor = new GridBagLayout();

			this.jScrollPanelDatosConsultor.setLayout(gridaBagLayoutDatosConsultor);
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = 0;
			this.gridBagConstraintsConsultor.gridx = 0;
			
			this.jScrollPanelDatosConsultor.add(this.jTableDatosConsultor, this.gridBagConstraintsConsultor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsultor.setViewportView(this.jTableDatosConsultor);
		this.jTableDatosConsultor.setFillsViewportHeight(true);
		this.jTableDatosConsultor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsultor= new GridBagLayout();
		this.jPanelAccionesConsultor.setLayout(gridaBagLayoutAccionesConsultor);
		
		
		/*	
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 0;
			
		this.jPanelAccionesConsultor.add(this.jButtonNuevoConsultor, this.gridBagConstraintsConsultor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsultor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsultor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consultorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsultor = new GridBagConstraints();						
			this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsultor.gridx = 0;		
			//this.gridBagConstraintsConsultor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsultor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsultor, this.gridBagConstraintsConsultor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsultor.gridx = 0;		
		//this.gridBagConstraintsConsultor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsultor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsultor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsultor, this.gridBagConstraintsConsultor);								
		
		
		/*
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsultor, this.gridBagConstraintsConsultor);
		*/		
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsultor.gridx =0;
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsultor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsultor, this.gridBagConstraintsConsultor);
				
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsultor, this.gridBagConstraintsConsultor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ConsultorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsultor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsultor = new GridBagLayout();
			this.jPanelBusquedasParametrosConsultor.setLayout(gridaBagLayoutBusquedasParametrosConsultor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsultor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsultor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsultor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsultor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsultor, this.gridBagConstraintsConsultor);
			
			
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsultor, this.gridBagConstraintsConsultor);
		
			
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsultor, this.gridBagConstraintsConsultor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsultor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsultor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsultor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsultor.setName("jPanelReporteDinamicoConsultor"); 
		
		this.jPanelReporteDinamicoConsultor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsultor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsultor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsultor.setLayout(gridaBagLayoutReporteDinamicoConsultor);
		
		
		this.jInternalFrameReporteDinamicoConsultor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsultor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsultor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsultor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsultor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsultor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsultor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsultor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsultor.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsultor.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsultor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsultor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsultor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsultor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consultores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsultor = new JLabelMe();

		this.jLabelColumnasSelectReporteConsultor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsultor.add(this.jLabelColumnasSelectReporteConsultor, this.gridBagConstraintsConsultor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsultor = new JList<Reporte>();
		this.jListColumnasSelectReporteConsultor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsultor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsultor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsultor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsultor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsultor=new JScrollPane(this.jListColumnasSelectReporteConsultor);
			
			this.jScrollColumnasSelectReporteConsultor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsultor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsultor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsultor.add(this.jListColumnasSelectReporteConsultor, this.gridBagConstraintsConsultor);
		this.jPanelReporteDinamicoConsultor.add(this.jScrollColumnasSelectReporteConsultor, this.gridBagConstraintsConsultor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsultor = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsultor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsultor.add(this.jLabelRelacionesSelectReporteConsultor, this.gridBagConstraintsConsultor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsultor = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsultor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsultor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsultor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsultor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsultor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsultor=new JScrollPane(this.jListRelacionesSelectReporteConsultor);
			
			this.jScrollRelacionesSelectReporteConsultor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsultor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsultor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsultor.add(this.jListRelacionesSelectReporteConsultor, this.gridBagConstraintsConsultor);
		this.jPanelReporteDinamicoConsultor.add(this.jScrollRelacionesSelectReporteConsultor, this.gridBagConstraintsConsultor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoConsultor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsultor = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsultor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsultor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsultor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsultor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsultor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsultor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsultor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsultor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsultor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsultor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsultor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsultor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsultor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsultor.add(this.jLabelGenerarExcelReporteDinamicoConsultor, this.gridBagConstraintsConsultor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsultor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsultor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsultor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsultor.setToolTipText("Generar EXCEL"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsultor.add(this.jButtonGenerarExcelReporteDinamicoConsultor, this.gridBagConstraintsConsultor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsultor.add(this.jComboBoxTiposReportesDinamicoConsultor, this.gridBagConstraintsConsultor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsultor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsultor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsultor.add(this.jLabelTiposArchivoReporteDinamicoConsultor, this.gridBagConstraintsConsultor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsultor.add(this.jComboBoxTiposArchivosReportesDinamicoConsultor, this.gridBagConstraintsConsultor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsultor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsultor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsultor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsultor.setToolTipText("Generar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsultor.add(this.jButtonGenerarReporteDinamicoConsultor, this.gridBagConstraintsConsultor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsultor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsultor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsultor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsultor.setToolTipText("Cancelar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsultor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsultor.add(this.jButtonCerrarReporteDinamicoConsultor, this.gridBagConstraintsConsultor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsultor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsultor= new JScrollPane(jPanelReporteDinamicoConsultor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsultor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsultor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsultor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consultores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsultor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsultor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsultor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsultor);
		this.jInternalFrameReporteDinamicoConsultor.getContentPane().add(this.jScrollPanelReporteDinamicoConsultor, this.gridBagConstraintsConsultor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsultor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsultor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsultor.setName("jPanelImportacionConsultor"); 
		
		this.jPanelImportacionConsultor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsultor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsultor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsultor.setLayout(gridaBagLayoutImportacionConsultor);
		
		
		this.jInternalFrameImportacionConsultor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsultor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsultor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsultor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsultor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsultor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsultor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsultor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsultor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsultor.setResizable(true);
	    this.jInternalFrameImportacionConsultor.setClosable(true);
	    this.jInternalFrameImportacionConsultor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsultor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsultor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsultor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsultor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsultor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsultor.setResizable(true);
	    this.jInternalFrameImportacionConsultor.setClosable(true);
	    this.jInternalFrameImportacionConsultor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsultor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsultor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsultor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consultores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsultor = new JLabelMe();

		this.jLabelArchivoImportacionConsultor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsultor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsultor.add(this.jLabelArchivoImportacionConsultor, this.gridBagConstraintsConsultor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsultor = new JFileChooser();		
		this.jFileChooserImportacionConsultor.setToolTipText("ESCOGER ARCHIVO"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsultor = new JButtonMe();
		this.jButtonAbrirImportacionConsultor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsultor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsultor.setToolTipText("Generar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYImportacion;
		this.gridBagConstraintsConsultor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsultor.add(this.jButtonAbrirImportacionConsultor, this.gridBagConstraintsConsultor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsultor = new JLabelMe();

		this.jLabelPathArchivoImportacionConsultor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsultor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsultor.add(this.jLabelPathArchivoImportacionConsultor, this.gridBagConstraintsConsultor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsultor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsultor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsultor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsultor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYImportacion;
		this.gridBagConstraintsConsultor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsultor.add(this.jTextFieldPathArchivoImportacionConsultor, this.gridBagConstraintsConsultor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsultor = new JButtonMe();
		this.jButtonGenerarImportacionConsultor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsultor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsultor.setToolTipText("Generar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYImportacion;
		this.gridBagConstraintsConsultor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsultor.add(this.jButtonGenerarImportacionConsultor, this.gridBagConstraintsConsultor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsultor = new JButtonMe();
		this.jButtonCerrarImportacionConsultor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsultor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsultor.setToolTipText("Cancelar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = iPosYImportacion;
		this.gridBagConstraintsConsultor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsultor.add(this.jButtonCerrarImportacionConsultor, this.gridBagConstraintsConsultor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsultor = new GridBagLayout();
		
		this.jScrollPanelImportacionConsultor= new JScrollPane(jPanelImportacionConsultor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy =iPosYImportacion;
		this.gridBagConstraintsConsultor.gridx =iPosXImportacion;
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsultor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsultor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsultor);
		this.jInternalFrameImportacionConsultor.getContentPane().add(this.jScrollPanelImportacionConsultor, this.gridBagConstraintsConsultor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsultor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsultor = new JButtonMe();
			this.jButtonAbrirOrderByConsultor.setText("Orden");
			this.jButtonAbrirOrderByConsultor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsultor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsultor";
			inputMap = this.jButtonAbrirOrderByConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsultor"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsultor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsultor.setName("jPanelOrderByConsultor"); 
			
			this.jPanelOrderByConsultor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsultor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsultor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsultor.setLayout(gridaBagLayoutOrderByConsultor);
			
			
			this.jTableDatosConsultorOrderBy = new JTableMe();        
			this.jTableDatosConsultorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsultorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsultorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsultorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsultorOrderBy.setViewportView(this.jTableDatosConsultorOrderBy);
			this.jTableDatosConsultorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsultorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsultor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsultor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsultor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsultor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsultor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsultor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsultor.setTitle("Orden");
			this.jInternalFrameOrderByConsultor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsultor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsultor.setResizable(true);
			this.jInternalFrameOrderByConsultor.setClosable(true);
			this.jInternalFrameOrderByConsultor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsultor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsultor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsultor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consultores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsultor.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsultor.ipady =150;
				
			this.jPanelOrderByConsultor.add(jScrollPanelDatosConsultorOrderBy, this.gridBagConstraintsConsultor);//this.jTableDatosConsultorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsultor = new JButtonMe();
			this.jButtonCerrarOrderByConsultor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsultor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsultor.setToolTipText("Cancelar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsultor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsultor.add(this.jButtonCerrarOrderByConsultor, this.gridBagConstraintsConsultor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsultor = new GridBagLayout();
			
			this.jScrollPanelOrderByConsultor= new JScrollPane(jPanelOrderByConsultor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsultor.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsultor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsultor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsultor);
			
			this.jInternalFrameOrderByConsultor.getContentPane().add(this.jScrollPanelOrderByConsultor, this.gridBagConstraintsConsultor);			
		
		} else {
			this.jButtonAbrirOrderByConsultor = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.consultorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConsultor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsultor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsultor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConsultor.getRowHeight();//ConsultorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsultorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsultor.isSelected()) {
					iHeightTable=ConsultorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsultorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsultorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsultorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsultor.isSelected()) {
					iHeightTable=ConsultorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsultorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsultorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsultor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsultor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsultor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsultor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsultor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsultor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsultor!=null && this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy()!=null) {
			//if(!this.consultorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsultor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsultor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsultor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsultor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsultor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsultor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=consultorLogic.getConsultors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consultors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Consultor> TraerConsultorBeans(List<Consultor> consultors,ArrayList<Classe> classes)throws Exception {
		try {
			for(Consultor consultor:consultors) {
					
				if(!(ConsultorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsultorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consultor.setsDetalleGeneralEntityReporte(ConsultorConstantesFunciones.getConsultorDescripcion(consultor));
										
						
					
					

					if(consultor.getGuiaRemisions()!=null && Funciones.existeClass(classes,GuiaRemision.class)) {
						try{consultor.setguiaremisionsDescripcionReporte(new JRBeanCollectionDataSource(GuiaRemisionJInternalFrame.TraerGuiaRemisionBeans(consultor.getGuiaRemisions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(consultor.getPedidoExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{consultor.setpedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(consultor.getPedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(consultor.getPedidos()!=null && Funciones.existeClass(classes,Pedido.class)) {
						try{consultor.setpedidosDescripcionReporte(new JRBeanCollectionDataSource(PedidoJInternalFrame.TraerPedidoBeans(consultor.getPedidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//consultor.setsDetalleGeneralEntityReporte(consultor.getsDetalleGeneralEntityReporte());
										
				}
				
				//consultorbeans.add(consultorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consultors;
    }
	//PARA REPORTES FIN
}
