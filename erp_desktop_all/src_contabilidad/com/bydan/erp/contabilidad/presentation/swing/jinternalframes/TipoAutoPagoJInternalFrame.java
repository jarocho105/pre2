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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoAutoPagoConstantesFunciones;

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
public class TipoAutoPagoJInternalFrame extends TipoAutoPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoAutoPago;
	
	protected JMenuBar jmenuBarTipoAutoPago;
	
	protected JMenu jmenuTipoAutoPago;
	protected JMenu jmenuDatosTipoAutoPago;
	protected JMenu jmenuArchivoTipoAutoPago;
	protected JMenu jmenuAccionesTipoAutoPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAutoPago;	
	protected GridBagConstraints gridBagConstraintsTipoAutoPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoAutoPagoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoAutoPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoAutoPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoAutoPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAutoPagoSessionBean tipoautopagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoAutoPago> tipoautopagos;		
	public List<TipoAutoPago> tipoautopagosEliminados;	
	public List<TipoAutoPago> tipoautopagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoAutoPago;		
	protected JButton jButtonAbrirOrderByTipoAutoPago;
	
	
	//protected JPanel jPanelOrderByTipoAutoPago;
	//public JScrollPane jScrollPanelOrderByTipoAutoPago;	
	//protected JButton jButtonCerrarOrderByTipoAutoPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoAutoPagoLogic tipoautopagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoAutoPago;
	public JScrollPane jScrollPanelDatosEdicionTipoAutoPago;
	public JScrollPane jScrollPanelDatosGeneralTipoAutoPago;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoAutoPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoAutoPago;
	//public JScrollPane jScrollPanelImportacionTipoAutoPago;
	
	
	
	protected JPanel jPanelAccionesTipoAutoPago;
	
    protected JPanel jPanelPaginacionTipoAutoPago;
    protected JPanel jPanelParametrosReportesTipoAutoPago;
	protected JPanel jPanelParametrosReportesAccionesTipoAutoPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoAutoPago;
	protected JPanel jPanelParametrosAuxiliar2TipoAutoPago;
	protected JPanel jPanelParametrosAuxiliar3TipoAutoPago;
	protected JPanel jPanelParametrosAuxiliar4TipoAutoPago;
	//protected JPanel jPanelParametrosAuxiliar5TipoAutoPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoAutoPago;
	//protected JPanel jPanelImportacionTipoAutoPago;
	
	
	public JTable jTableDatosTipoAutoPago;
	
	
	
	//public JTable jTableDatosTipoAutoPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoAutoPago;
	protected JButton jButtonDuplicarTipoAutoPago;
	protected JButton jButtonCopiarTipoAutoPago;
	protected JButton jButtonVerFormTipoAutoPago;
	protected JButton jButtonNuevoRelacionesTipoAutoPago;
	protected JButton jButtonModificarTipoAutoPago;
	
    protected JButton jButtonGuardarCambiosTablaTipoAutoPago;
	protected JButton jButtonCerrarTipoAutoPago;
	
	
	protected JButton jButtonRecargarInformacionTipoAutoPago;
	protected JButton jButtonProcesarInformacionTipoAutoPago;
	
	
	protected JButton jButtonAnterioresTipoAutoPago;
	protected JButton jButtonSiguientesTipoAutoPago;
	protected JButton jButtonNuevoGuardarCambiosTipoAutoPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoAutoPago;
	//protected JButton jButtonCerrarReporteDinamicoTipoAutoPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoAutoPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoAutoPago;
	//protected JButton jButtonGenerarImportacionTipoAutoPago;
	//protected JButton jButtonCerrarImportacionTipoAutoPago;
	//protected JFileChooser jFileChooserImportacionTipoAutoPago;
	//protected File fileImportacionTipoAutoPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAutoPago;
	protected JButton jButtonDuplicarToolBarTipoAutoPago;
	protected JButton jButtonNuevoRelacionesToolBarTipoAutoPago;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoAutoPago;
	protected JButton jButtonCopiarToolBarTipoAutoPago;
	protected JButton jButtonVerFormToolBarTipoAutoPago;
	public JButton jButtonGuardarCambiosTablaToolBarTipoAutoPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAutoPago;
	protected JButton jButtonCerrarToolBarTipoAutoPago;
	
	protected JButton jButtonRecargarInformacionToolBarTipoAutoPago;
	protected JButton jButtonProcesarInformacionToolBarTipoAutoPago;
	protected JButton jButtonAnterioresToolBarTipoAutoPago;
	protected JButton jButtonSiguientesToolBarTipoAutoPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoAutoPago;
	protected JButton jButtonAbrirOrderByToolBarTipoAutoPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAutoPago;
	protected JMenuItem jMenuItemDuplicarTipoAutoPago;
	protected JMenuItem jMenuItemNuevoRelacionesTipoAutoPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoAutoPago;
	protected JMenuItem jMenuItemCopiarTipoAutoPago;
	protected JMenuItem jMenuItemVerFormTipoAutoPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAutoPago;
	protected JMenuItem jMenuItemCerrarTipoAutoPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoAutoPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoAutoPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAutoPago;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoAutoPago;
	protected JMenuItem jMenuItemProcesarInformacionTipoAutoPago;
	protected JMenuItem jMenuItemAnterioresTipoAutoPago;
	protected JMenuItem jMenuItemSiguientesTipoAutoPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAutoPago;
	protected JMenuItem jMenuItemAbrirOrderByTipoAutoPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoAutoPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAutoPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoAutoPago;
	protected JCheckBox jCheckBoxSeleccionadosTipoAutoPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoAutoPago;
	protected JCheckBox jCheckBoxConGraficoReporteTipoAutoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoAutoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoAutoPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAutoPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoAutoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoAutoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoAutoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAutoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAutoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoAutoPago;
	protected JTextField jTextFieldValorCampoGeneralTipoAutoPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoAutoPago;
	//public JList<Reporte> jListColumnasSelectReporteTipoAutoPago;
	//public JScrollPane jScrollColumnasSelectReporteTipoAutoPago;
	
	//public JLabel jLabelRelacionesSelectReporteTipoAutoPago;
	//public JList<Reporte> jListRelacionesSelectReporteTipoAutoPago;
	//public JScrollPane jScrollRelacionesSelectReporteTipoAutoPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoAutoPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoAutoPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoAutoPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoAutoPago;
	
		
	//public JLabel jLabelArchivoImportacionTipoAutoPago;	
	//public JLabel jLabelPathArchivoImportacionTipoAutoPago;
	//protected JTextField jTextFieldPathArchivoImportacionTipoAutoPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoAutoPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoAutoPago;
	
	//public JLabel jLabelColumnaCategoriaValorTipoAutoPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoAutoPago;
	
	//public JLabel jLabelColumnasValoresGraficoTipoAutoPago;
	//public JList<Reporte> jListColumnasValoresGraficoTipoAutoPago;
	//public JScrollPane jScrollColumnasValoresGraficoTipoAutoPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoAutoPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoAutoPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoAutoPago;
	
	
	
	
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
	public TipoAutoPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoAutoPago)	{
		this.jButtonRecargarInformacionTipoAutoPago = jButtonRecargarInformacionTipoAutoPago;
	}
	
	public JButton getjButtonProcesarInformacionTipoAutoPago() {
		return this.jButtonProcesarInformacionTipoAutoPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAutoPago)	{
		this.jButtonProcesarInformacionTipoAutoPago = jButtonProcesarInformacionTipoAutoPago;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoAutoPago() {
		return this.jButtonRecargarInformacionTipoAutoPago;
	}
	
	
	public List<TipoAutoPago> gettipoautopagos() {
		return this.tipoautopagos;
	}

	public void settipoautopagos(List<TipoAutoPago> tipoautopagos) {
		this.tipoautopagos = tipoautopagos;
	}
	
	public List<TipoAutoPago> gettipoautopagosAux() {
		return this.tipoautopagosAux;
	}

	public void settipoautopagosAux(List<TipoAutoPago> tipoautopagosAux) {
		this.tipoautopagosAux = tipoautopagosAux;
	}
	
	public List<TipoAutoPago> gettipoautopagosEliminados() {
		return this.tipoautopagosEliminados;
	}

	public void setTipoAutoPagosEliminados(List<TipoAutoPago> tipoautopagosEliminados) {
		this.tipoautopagosEliminados = tipoautopagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoAutoPago() {
		return jComboBoxTiposSeleccionarTipoAutoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoAutoPago(
			JComboBox jComboBoxTiposSeleccionarTipoAutoPago) {
		this.jComboBoxTiposSeleccionarTipoAutoPago = jComboBoxTiposSeleccionarTipoAutoPago;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoAutoPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoAutoPago() {
		return jTextFieldValorCampoGeneralTipoAutoPago;
	}

	public void setjTextFieldValorCampoGeneralTipoAutoPago(
			JTextField jTextFieldValorCampoGeneralTipoAutoPago) {
		this.jTextFieldValorCampoGeneralTipoAutoPago = jTextFieldValorCampoGeneralTipoAutoPago;
	}

	public void setBorderResaltarValorCampoGeneralTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoAutoPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoAutoPago() {
		return this.jCheckBoxSeleccionarTodosTipoAutoPago;
	}

	public void setjCheckBoxSeleccionarTodosTipoAutoPago(
			JCheckBox jCheckBoxSeleccionarTodosTipoAutoPago) {
		this.jCheckBoxSeleccionarTodosTipoAutoPago = jCheckBoxSeleccionarTodosTipoAutoPago;
	}

	public void setBorderResaltarSeleccionarTodosTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoAutoPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoAutoPago() {
		return this.jCheckBoxSeleccionadosTipoAutoPago;
	}

	public void setjCheckBoxSeleccionadosTipoAutoPago(
			JCheckBox jCheckBoxSeleccionadosTipoAutoPago) {
		this.jCheckBoxSeleccionadosTipoAutoPago = jCheckBoxSeleccionadosTipoAutoPago;
	}
	
	public void setBorderResaltarSeleccionadosTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoAutoPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoAutoPago() {
		return this.jComboBoxTiposArchivosReportesTipoAutoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoAutoPago(
			JComboBox jComboBoxTiposArchivosReportesTipoAutoPago) {
		this.jComboBoxTiposArchivosReportesTipoAutoPago = jComboBoxTiposArchivosReportesTipoAutoPago;
	}

	public void setBorderResaltarTiposArchivosReportesTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoAutoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoAutoPago() {
		return this.jComboBoxTiposReportesTipoAutoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoAutoPago(
			JComboBox jComboBoxTiposReportesTipoAutoPago) {
		this.jComboBoxTiposReportesTipoAutoPago = jComboBoxTiposReportesTipoAutoPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoAutoPago() {
	//	return jComboBoxTiposReportesDinamicoTipoAutoPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoAutoPago(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoAutoPago) {
	//	this.jComboBoxTiposReportesDinamicoTipoAutoPago = jComboBoxTiposReportesDinamicoTipoAutoPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoAutoPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoAutoPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoAutoPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAutoPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago = jComboBoxTiposArchivosReportesDinamicoTipoAutoPago;
	//}
	
	public void setBorderResaltarTiposReportesTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoAutoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoAutoPago() {
		return this.jComboBoxTiposGraficosReportesTipoAutoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoAutoPago(
			JComboBox jComboBoxTiposGraficosReportesTipoAutoPago) {
		this.jComboBoxTiposGraficosReportesTipoAutoPago = jComboBoxTiposGraficosReportesTipoAutoPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoAutoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoAutoPago() {
		return this.jComboBoxTiposPaginacionTipoAutoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoAutoPago(
			JComboBox jComboBoxTiposPaginacionTipoAutoPago) {
		this.jComboBoxTiposPaginacionTipoAutoPago = jComboBoxTiposPaginacionTipoAutoPago;
	}
	
	public void setBorderResaltarTiposPaginacionTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoAutoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoAutoPago() {
		return this.jComboBoxTiposRelacionesTipoAutoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAutoPago() {
		return this.jComboBoxTiposAccionesTipoAutoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAutoPago(
			JComboBox jComboBoxTiposRelacionesTipoAutoPago) {
		this.jComboBoxTiposRelacionesTipoAutoPago = jComboBoxTiposRelacionesTipoAutoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAutoPago(
			JComboBox jComboBoxTiposAccionesTipoAutoPago) {
		this.jComboBoxTiposAccionesTipoAutoPago = jComboBoxTiposAccionesTipoAutoPago;
	}
	
	public void setBorderResaltarTiposRelacionesTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoAutoPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoAutoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoAutoPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoAutoPago() {
	//	return jCheckBoxConGraficoDinamicoTipoAutoPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoAutoPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoAutoPago) {
	//	this.jCheckBoxConGraficoDinamicoTipoAutoPago = jCheckBoxConGraficoDinamicoTipoAutoPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoAutoPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoAutoPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoAutoPago .setBorder(borderResaltar);		
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
		this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
		
		this.tipoautopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoautopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoautopagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoAutoPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoAutoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAutoPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAutoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAutoPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Auto Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoAutoPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoAutoPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"nuevo","nuevo","Nuevo"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"duplicar","duplicar","Duplicar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"copiar","copiar","Copiar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"ver_form","ver_form","Ver"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"recargar","recargar","Recargar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoAutoPago,this.jTtoolBarTipoAutoPago,
							"cerrar","cerrar","Salir"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoAutoPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoAutoPago;
			
				this.jButtonProcesarInformacionToolBarTipoAutoPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoAutoPago;
				
		//protected JButton jButtonModificarToolBarTipoAutoPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoAutoPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoAutoPago=new JMenuMe("General");
		this.jmenuArchivoTipoAutoPago=new JMenuMe("Archivo");
		this.jmenuAccionesTipoAutoPago=new JMenuMe("Acciones");
		this.jmenuDatosTipoAutoPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAutoPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAutoPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAutoPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoAutoPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoAutoPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoAutoPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoAutoPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoAutoPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoAutoPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoAutoPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAutoPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAutoPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoAutoPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoAutoPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoAutoPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoAutoPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoAutoPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoAutoPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoAutoPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoAutoPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoAutoPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAutoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAutoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAutoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoAutoPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoAutoPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoAutoPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoAutoPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoAutoPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoAutoPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoAutoPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoAutoPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoAutoPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoAutoPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoAutoPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoAutoPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoAutoPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoAutoPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoAutoPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAutoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAutoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAutoPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoAutoPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoAutoPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoAutoPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAutoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAutoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAutoPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoAutoPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoAutoPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoAutoPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoAutoPago.add(this.jMenuItemCerrarTipoAutoPago);
			
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemNuevoTipoAutoPago);
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemNuevoGuardarCambiosTipoAutoPago);
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemNuevoRelacionesTipoAutoPago);
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemGuardarCambiosTablaTipoAutoPago);		
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemDuplicarTipoAutoPago);		
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemCopiarTipoAutoPago);		
			this.jmenuAccionesTipoAutoPago.add(this.jMenuItemVerFormTipoAutoPago);		
			
			this.jmenuDatosTipoAutoPago.add(this.jMenuItemRecargarInformacionTipoAutoPago);				
			this.jmenuDatosTipoAutoPago.add(this.jMenuItemAnterioresTipoAutoPago);				
			this.jmenuDatosTipoAutoPago.add(this.jMenuItemSiguientesTipoAutoPago);				
			this.jmenuDatosTipoAutoPago.add(this.jMenuItemAbrirOrderByTipoAutoPago);				
			this.jmenuDatosTipoAutoPago.add(this.jMenuItemMostrarOcultarTipoAutoPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoAutoPago.add(this.jMenuItemGuardarCambiosTipoAutoPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoAutoPago.add(this.jmenuArchivoTipoAutoPago);		
			this.jmenuBarTipoAutoPago.add(this.jmenuAccionesTipoAutoPago);		
			this.jmenuBarTipoAutoPago.add(this.jmenuDatosTipoAutoPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoAutoPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoAutoPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoAutoPago=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoAutoPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAutoPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAutoPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoAutoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoAutoPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoAutoPago = new TipoAutoPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Auto Pago DATOS");
			this.jInternalFrameDetalleFormTipoAutoPago = new TipoAutoPagoDetalleFormJInternalFrame(jDesktopPane,this.tipoautopagoSessionBean.getConGuardarRelaciones(),this.tipoautopagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoAutoPago = null;//new TipoAutoPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAutoPago= new GridBagLayout();
		
		
		this.jTableDatosTipoAutoPago = new JTableMe();      
		
		String sToolTipTipoAutoPago="";
		sToolTipTipoAutoPago=TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAutoPago+="(Contabilidad.TipoAutoPago)";
		}
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAutoPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoAutoPago.setToolTipText(sToolTipTipoAutoPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoAutoPago);
		this.jTableDatosTipoAutoPago.setAutoCreateRowSorter(true);
		this.jTableDatosTipoAutoPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoAutoPago.setRowSelectionAllowed(true);
		this.jTableDatosTipoAutoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoAutoPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoAutoPago = new JButtonMe();
		this.jButtonDuplicarTipoAutoPago = new JButtonMe();
		this.jButtonCopiarTipoAutoPago = new JButtonMe();
		this.jButtonVerFormTipoAutoPago = new JButtonMe();
		this.jButtonNuevoRelacionesTipoAutoPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoAutoPago = new JButtonMe();
		this.jButtonCerrarTipoAutoPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoAutoPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoAutoPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Auto Pago";
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Auto Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAutoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAutoPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoAutoPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoAutoPago=new ReporteDinamicoJInternalFrame(TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoAutoPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoAutoPago=new ImportacionJInternalFrame(TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoAutoPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoAutoPago = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoAutoPago.setText("Orden");
		this.jButtonAbrirOrderByTipoAutoPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAutoPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAutoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoPago,false,this);
			
			//this.cargarOrderByTipoAutoPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAutoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoPago,true,this);
			
			//this.cargarOrderByTipoAutoPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoAutoPago.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAutoPago.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAutoPago.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoAutoPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAutoPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAutoPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoAutoPago.setText("Nuevo");
		this.jButtonDuplicarTipoAutoPago.setText("Duplicar");
		this.jButtonCopiarTipoAutoPago.setText("Copiar");
		this.jButtonVerFormTipoAutoPago.setText("Ver");
		this.jButtonNuevoRelacionesTipoAutoPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.setText("Guardar");
		this.jButtonCerrarTipoAutoPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAutoPago,"nuevo_button","Nuevo",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoAutoPago,"duplicar_button","Duplicar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoAutoPago,"copiar_button","Copiar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoAutoPago,"ver_form","Ver",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoAutoPago,"nuevorelaciones_button","Nuevo Rel",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAutoPago,"guardarcambiostabla_button","Guardar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAutoPago,"cerrar_button","Salir",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoAutoPago.setToolTipText("Nuevo"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoAutoPago.setToolTipText("Duplicar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoAutoPago.setToolTipText("Copiar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoAutoPago.setToolTipText("Ver"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoAutoPago.setToolTipText("Nuevo Rel"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.setToolTipText("Guardar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAutoPago.setToolTipText("Salir"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAutoPago";
		inputMap = this.jButtonNuevoTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAutoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAutoPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoAutoPago";
		inputMap = this.jButtonDuplicarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoAutoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoAutoPago"));
		
		//COPIAR
		sMapKey = "CopiarTipoAutoPago";
		inputMap = this.jButtonCopiarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoAutoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoAutoPago"));
		
		//VEr FORM
		sMapKey = "VerFormTipoAutoPago";
		inputMap = this.jButtonVerFormTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoAutoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoAutoPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoAutoPago";
		inputMap = this.jButtonNuevoRelacionesTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoAutoPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoAutoPago";
		inputMap = this.jButtonModificarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoAutoPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoAutoPago";
		inputMap = this.jButtonCerrarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAutoPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAutoPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAutoPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoAutoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoAutoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoAutoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoAutoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoAutoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoAutoPago.setName("jPanelParametrosReportesTipoAutoPago"); 
		
		this.jPanelParametrosReportesAccionesTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoAutoPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoAutoPago.setName("jPanelParametrosReportesAccionesTipoAutoPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoAutoPago = new JButtonMe();
		this.jButtonRecargarInformacionTipoAutoPago.setText("Recargar");
		this.jButtonRecargarInformacionTipoAutoPago.setToolTipText("Recargar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoAutoPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoAutoPago = new JButtonMe();
		this.jButtonProcesarInformacionTipoAutoPago.setText("Procesar");
		this.jButtonProcesarInformacionTipoAutoPago.setToolTipText("Procesar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoAutoPago.setVisible(false);
			
		this.jButtonProcesarInformacionTipoAutoPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAutoPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAutoPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAutoPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoAutoPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAutoPago.setText("TIPO");       
		this.jComboBoxTiposReportesTipoAutoPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAutoPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoAutoPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoAutoPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoAutoPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoAutoPago.setText("Accion");
		this.jComboBoxTiposRelacionesTipoAutoPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAutoPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoAutoPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoAutoPago.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoAutoPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoAutoPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoAutoPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAutoPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAutoPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoAutoPago = new JLabelMe();
		
		this.jLabelAccionesTipoAutoPago.setText("Acciones");		
		this.jLabelAccionesTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoAutoPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoAutoPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoAutoPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoAutoPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoAutoPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoAutoPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoAutoPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoAutoPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoAutoPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoAutoPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoAutoPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoAutoPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoAutoPago = new JButtonMe();
		//this.jButtonAnterioresTipoAutoPago.setText("<<");
        this.jButtonAnterioresTipoAutoPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoAutoPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoAutoPago = new JButtonMe();
		//this.jButtonSiguientesTipoAutoPago.setText(">>");
        this.jButtonSiguientesTipoAutoPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoAutoPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoAutoPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoAutoPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoAutoPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoAutoPago,"nuevoguardarcambios_button","Nue",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoAutoPago";
		inputMap = this.jButtonNuevoGuardarCambiosTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoAutoPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoAutoPago";
		inputMap = this.jButtonRecargarInformacionTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoAutoPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoAutoPago";
		inputMap = this.jButtonSiguientesTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoAutoPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoAutoPago";
		inputMap = this.jButtonAnterioresTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoAutoPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoAutoPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoAutoPago.setMinimumSize(new Dimension(this.getWidth(),TipoAutoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAutoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAutoPago.setMaximumSize(new Dimension(this.getWidth(),TipoAutoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAutoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAutoPago.setPreferredSize(new Dimension(this.getWidth(),TipoAutoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAutoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoAutoPago = new GridBagLayout();

			this.jPanelPaginacionTipoAutoPago.setLayout(gridaBagLayoutPaginacionTipoAutoPago);						
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 0;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonAnterioresTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
					
						
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAutoPago.gridy = 0;
			
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonNuevoGuardarCambiosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
						
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAutoPago.gridy = 0;
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonSiguientesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 1;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonNuevoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
						
			
			
			if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAutoPago.gridy = 1;
				this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoAutoPago.add(this.jButtonGuardarCambiosTablaTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			}
			
			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 1;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonDuplicarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 1;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonCopiarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 1;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonVerFormTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 1;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoAutoPago.add(this.jButtonCerrarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
		
		
		this.jButtonRecargarInformacionTipoAutoPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAutoPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAutoPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoAutoPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAutoPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAutoPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoAutoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAutoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAutoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoAutoPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAutoPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAutoPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoAutoPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAutoPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAutoPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoAutoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAutoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAutoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoAutoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoAutoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAutoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAutoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoAutoPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAutoPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAutoPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoAutoPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAutoPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAutoPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoAutoPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAutoPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAutoPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoAutoPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAutoPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAutoPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoAutoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoAutoPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoAutoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoAutoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoAutoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoAutoPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoAutoPago.setLayout(gridaBagParametrosReportesTipoAutoPago);
			this.jPanelParametrosReportesAccionesTipoAutoPago.setLayout(gridaBagParametrosReportesAccionesTipoAutoPago);
			
			
			this.jPanelParametrosAuxiliar1TipoAutoPago.setLayout(gridaBagParametrosAuxiliar1TipoAutoPago);
			this.jPanelParametrosAuxiliar2TipoAutoPago.setLayout(gridaBagParametrosAuxiliar2TipoAutoPago);
			this.jPanelParametrosAuxiliar3TipoAutoPago.setLayout(gridaBagParametrosAuxiliar3TipoAutoPago);
			this.jPanelParametrosAuxiliar4TipoAutoPago.setLayout(gridaBagParametrosAuxiliar4TipoAutoPago);
			//this.jPanelParametrosAuxiliar5TipoAutoPago.setLayout(gridaBagParametrosAuxiliar2TipoAutoPago);			
			
			
			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoPago.add(this.jButtonRecargarInformacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAutoPago.add(this.jComboBoxTiposPaginacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAutoPago.add(this.jCheckBoxConAltoMaximoTablaTipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAutoPago.add(this.jComboBoxTiposArchivosReportesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoPago.add(this.jPanelParametrosAuxiliar1TipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoAutoPago.add(this.jComboBoxTiposReportesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoPago.add(this.jPanelParametrosAuxiliar4TipoAutoPago, this.gridBagConstraintsTipoAutoPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoPago.add(this.jComboBoxTiposReportesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAutoPago.add(this.jCheckBoxGenerarReporteTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoPago.add(this.jPanelParametrosAuxiliar2TipoAutoPago, this.gridBagConstraintsTipoAutoPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAutoPago.add(this.jLabelAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoAutoPago.add(this.jButtonAbrirOrderByTipoAutoPago, this.gridBagConstraintsTipoAutoPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoPago.add(this.jComboBoxTiposSeleccionarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
			
			
			/*
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAutoPago.add(this.jCheckBoxSeleccionarTodosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAutoPago.add(this.jCheckBoxSeleccionarTodosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);															
				
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAutoPago.add(this.jCheckBoxSeleccionadosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoPago.add(this.jPanelParametrosAuxiliar3TipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoPago.add(this.jComboBoxTiposRelacionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
				
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoPago.add(this.jComboBoxTiposAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoAutoPago = new GridBagLayout();

			this.jScrollPanelDatosTipoAutoPago.setLayout(gridaBagLayoutDatosTipoAutoPago);
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = 0;
			this.gridBagConstraintsTipoAutoPago.gridx = 0;
			
			this.jScrollPanelDatosTipoAutoPago.add(this.jTableDatosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoAutoPago.setViewportView(this.jTableDatosTipoAutoPago);
		this.jTableDatosTipoAutoPago.setFillsViewportHeight(true);
		this.jTableDatosTipoAutoPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoAutoPago= new GridBagLayout();
		this.jPanelAccionesTipoAutoPago.setLayout(gridaBagLayoutAccionesTipoAutoPago);
		
		
		/*	
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
			
		this.jPanelAccionesTipoAutoPago.add(this.jButtonNuevoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAutoPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAutoPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAutoPago.gridx = 0;		
			//this.gridBagConstraintsTipoAutoPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAutoPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoAutoPago.gridx = 0;		
		//this.gridBagConstraintsTipoAutoPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoAutoPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoAutoPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);								
		
		
		/*
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		*/		
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAutoPago.gridx =0;
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAutoPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
				
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoAutoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAutoPago = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoAutoPago.setLayout(gridaBagLayoutBusquedasParametrosTipoAutoPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoAutoPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAutoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
			
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
			
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoAutoPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoAutoPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoAutoPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoAutoPago.setName("jPanelReporteDinamicoTipoAutoPago"); 
		
		this.jPanelReporteDinamicoTipoAutoPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAutoPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAutoPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoAutoPago.setLayout(gridaBagLayoutReporteDinamicoTipoAutoPago);
		
		
		this.jInternalFrameReporteDinamicoTipoAutoPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoAutoPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAutoPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoAutoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoAutoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoAutoPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoAutoPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoAutoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoAutoPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoAutoPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoAutoPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoAutoPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAutoPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAutoPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Auto Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoAutoPago = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoAutoPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jLabelColumnasSelectReporteTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoAutoPago = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoAutoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoAutoPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoAutoPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAutoPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAutoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoAutoPago=new JScrollPane(this.jListColumnasSelectReporteTipoAutoPago);
			
			this.jScrollColumnasSelectReporteTipoAutoPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAutoPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAutoPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAutoPago.add(this.jListColumnasSelectReporteTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jScrollColumnasSelectReporteTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoAutoPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoAutoPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoAutoPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoAutoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoAutoPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoAutoPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAutoPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAutoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoAutoPago=new JScrollPane(this.jListRelacionesSelectReporteTipoAutoPago);
			
			this.jScrollRelacionesSelectReporteTipoAutoPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAutoPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAutoPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoAutoPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoAutoPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoAutoPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoAutoPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoAutoPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoAutoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAutoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAutoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoAutoPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoAutoPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jLabelGenerarExcelReporteDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoAutoPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoAutoPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoAutoPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoAutoPago.setToolTipText("Generar EXCEL"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoAutoPago.add(this.jButtonGenerarExcelReporteDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jComboBoxTiposReportesDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoAutoPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoAutoPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jLabelTiposArchivoReporteDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jComboBoxTiposArchivosReportesDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoAutoPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoAutoPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoAutoPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoAutoPago.setToolTipText("Generar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jButtonGenerarReporteDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoAutoPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoAutoPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoAutoPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoAutoPago.setToolTipText("Cancelar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoPago.add(this.jButtonCerrarReporteDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoAutoPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoAutoPago= new JScrollPane(jPanelReporteDinamicoTipoAutoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoAutoPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAutoPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAutoPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Auto Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoAutoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoAutoPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoAutoPago);
		this.jInternalFrameReporteDinamicoTipoAutoPago.getContentPane().add(this.jScrollPanelReporteDinamicoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoAutoPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoAutoPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoAutoPago.setName("jPanelImportacionTipoAutoPago"); 
		
		this.jPanelImportacionTipoAutoPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAutoPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAutoPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoAutoPago.setLayout(gridaBagLayoutImportacionTipoAutoPago);
		
		
		this.jInternalFrameImportacionTipoAutoPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoAutoPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoAutoPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAutoPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoAutoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAutoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAutoPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoAutoPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAutoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAutoPago.setResizable(true);
	    this.jInternalFrameImportacionTipoAutoPago.setClosable(true);
	    this.jInternalFrameImportacionTipoAutoPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoAutoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAutoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAutoPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoAutoPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAutoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAutoPago.setResizable(true);
	    this.jInternalFrameImportacionTipoAutoPago.setClosable(true);
	    this.jInternalFrameImportacionTipoAutoPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoAutoPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAutoPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAutoPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Auto Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoAutoPago = new JLabelMe();

		this.jLabelArchivoImportacionTipoAutoPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAutoPago.add(this.jLabelArchivoImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoAutoPago = new JFileChooser();		
		this.jFileChooserImportacionTipoAutoPago.setToolTipText("ESCOGER ARCHIVO"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoAutoPago = new JButtonMe();
		this.jButtonAbrirImportacionTipoAutoPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoAutoPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoAutoPago.setToolTipText("Generar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoPago.add(this.jButtonAbrirImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoAutoPago = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoAutoPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAutoPago.add(this.jLabelPathArchivoImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoAutoPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoAutoPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAutoPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAutoPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoPago.add(this.jTextFieldPathArchivoImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoAutoPago = new JButtonMe();
		this.jButtonGenerarImportacionTipoAutoPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoAutoPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoAutoPago.setToolTipText("Generar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoPago.add(this.jButtonGenerarImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoAutoPago = new JButtonMe();
		this.jButtonCerrarImportacionTipoAutoPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoAutoPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoAutoPago.setToolTipText("Cancelar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoPago.add(this.jButtonCerrarImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoAutoPago = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoAutoPago= new JScrollPane(jPanelImportacionTipoAutoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoAutoPago.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoAutoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoAutoPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoAutoPago);
		this.jInternalFrameImportacionTipoAutoPago.getContentPane().add(this.jScrollPanelImportacionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoAutoPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoAutoPago = new JButtonMe();
			this.jButtonAbrirOrderByTipoAutoPago.setText("Orden");
			this.jButtonAbrirOrderByTipoAutoPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAutoPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoAutoPago";
			inputMap = this.jButtonAbrirOrderByTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoAutoPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoAutoPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoAutoPago.setName("jPanelOrderByTipoAutoPago"); 
			
			this.jPanelOrderByTipoAutoPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAutoPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAutoPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoAutoPago.setLayout(gridaBagLayoutOrderByTipoAutoPago);
			
			
			this.jTableDatosTipoAutoPagoOrderBy = new JTableMe();        
			this.jTableDatosTipoAutoPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoAutoPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoAutoPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoAutoPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoAutoPagoOrderBy.setViewportView(this.jTableDatosTipoAutoPagoOrderBy);
			this.jTableDatosTipoAutoPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoAutoPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoAutoPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoAutoPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoAutoPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoAutoPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoAutoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoAutoPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoAutoPago.setTitle("Orden");
			this.jInternalFrameOrderByTipoAutoPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoAutoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoAutoPago.setResizable(true);
			this.jInternalFrameOrderByTipoAutoPago.setClosable(true);
			this.jInternalFrameOrderByTipoAutoPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoAutoPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAutoPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAutoPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Auto Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoAutoPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoAutoPago.ipady =150;
				
			this.jPanelOrderByTipoAutoPago.add(jScrollPanelDatosTipoAutoPagoOrderBy, this.gridBagConstraintsTipoAutoPago);//this.jTableDatosTipoAutoPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoAutoPago = new JButtonMe();
			this.jButtonCerrarOrderByTipoAutoPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoAutoPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoAutoPago.setToolTipText("Cancelar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoAutoPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoAutoPago.add(this.jButtonCerrarOrderByTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoAutoPago = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoAutoPago= new JScrollPane(jPanelOrderByTipoAutoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoAutoPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoAutoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoAutoPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoAutoPago);
			
			this.jInternalFrameOrderByTipoAutoPago.getContentPane().add(this.jScrollPanelOrderByTipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
		
		} else {
			this.jButtonAbrirOrderByTipoAutoPago = new JButtonMe();
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
			&& this.tipoautopagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoAutoPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoAutoPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoAutoPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoAutoPago.getRowHeight();//TipoAutoPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAutoPago.isSelected()) {
					iHeightTable=TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAutoPago.isSelected()) {
					iHeightTable=TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAutoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoAutoPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAutoPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAutoPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoAutoPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAutoPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAutoPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoAutoPago!=null && this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoAutoPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoAutoPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoAutoPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoAutoPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAutoPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAutoPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoautopagoLogic.getTipoAutoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoautopagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoAutoPago> TraerTipoAutoPagoBeans(List<TipoAutoPago> tipoautopagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoAutoPago tipoautopago:tipoautopagos) {
					
				if(!(TipoAutoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoAutoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoautopago.setsDetalleGeneralEntityReporte(TipoAutoPagoConstantesFunciones.getTipoAutoPagoDescripcion(tipoautopago));
										
						
					
						
					
				} else  {
							
					//tipoautopago.setsDetalleGeneralEntityReporte(tipoautopago.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoautopagobeans.add(tipoautopagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoautopagos;
    }
	//PARA REPORTES FIN
}
