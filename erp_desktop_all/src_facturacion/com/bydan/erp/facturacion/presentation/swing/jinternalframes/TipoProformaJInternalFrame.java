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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoProformaConstantesFunciones;

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
public class TipoProformaJInternalFrame extends TipoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProforma;
	
	protected JMenuBar jmenuBarTipoProforma;
	
	protected JMenu jmenuTipoProforma;
	protected JMenu jmenuDatosTipoProforma;
	protected JMenu jmenuArchivoTipoProforma;
	protected JMenu jmenuAccionesTipoProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProforma;	
	protected GridBagConstraints gridBagConstraintsTipoProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProformaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProforma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProformaSessionBean tipoproformaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProforma> tipoproformas;		
	public List<TipoProforma> tipoproformasEliminados;	
	public List<TipoProforma> tipoproformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProforma;		
	protected JButton jButtonAbrirOrderByTipoProforma;
	
	
	//protected JPanel jPanelOrderByTipoProforma;
	//public JScrollPane jScrollPanelOrderByTipoProforma;	
	//protected JButton jButtonCerrarOrderByTipoProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProformaLogic tipoproformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProforma;
	public JScrollPane jScrollPanelDatosEdicionTipoProforma;
	public JScrollPane jScrollPanelDatosGeneralTipoProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProforma;
	//public JScrollPane jScrollPanelImportacionTipoProforma;
	
	
	
	protected JPanel jPanelAccionesTipoProforma;
	
    protected JPanel jPanelPaginacionTipoProforma;
    protected JPanel jPanelParametrosReportesTipoProforma;
	protected JPanel jPanelParametrosReportesAccionesTipoProforma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProforma;
	protected JPanel jPanelParametrosAuxiliar2TipoProforma;
	protected JPanel jPanelParametrosAuxiliar3TipoProforma;
	protected JPanel jPanelParametrosAuxiliar4TipoProforma;
	//protected JPanel jPanelParametrosAuxiliar5TipoProforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProforma;
	//protected JPanel jPanelImportacionTipoProforma;
	
	
	public JTable jTableDatosTipoProforma;
	
	
	
	//public JTable jTableDatosTipoProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProforma;
	protected JButton jButtonDuplicarTipoProforma;
	protected JButton jButtonCopiarTipoProforma;
	protected JButton jButtonVerFormTipoProforma;
	protected JButton jButtonNuevoRelacionesTipoProforma;
	protected JButton jButtonModificarTipoProforma;
	
    protected JButton jButtonGuardarCambiosTablaTipoProforma;
	protected JButton jButtonCerrarTipoProforma;
	
	
	protected JButton jButtonRecargarInformacionTipoProforma;
	protected JButton jButtonProcesarInformacionTipoProforma;
	
	
	protected JButton jButtonAnterioresTipoProforma;
	protected JButton jButtonSiguientesTipoProforma;
	protected JButton jButtonNuevoGuardarCambiosTipoProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProforma;
	//protected JButton jButtonCerrarReporteDinamicoTipoProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProforma;
	//protected JButton jButtonGenerarImportacionTipoProforma;
	//protected JButton jButtonCerrarImportacionTipoProforma;
	//protected JFileChooser jFileChooserImportacionTipoProforma;
	//protected File fileImportacionTipoProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProforma;
	protected JButton jButtonDuplicarToolBarTipoProforma;
	protected JButton jButtonNuevoRelacionesToolBarTipoProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProforma;
	protected JButton jButtonCopiarToolBarTipoProforma;
	protected JButton jButtonVerFormToolBarTipoProforma;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProforma;
	protected JButton jButtonCerrarToolBarTipoProforma;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProforma;
	protected JButton jButtonProcesarInformacionToolBarTipoProforma;
	protected JButton jButtonAnterioresToolBarTipoProforma;
	protected JButton jButtonSiguientesToolBarTipoProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProforma;
	protected JButton jButtonAbrirOrderByToolBarTipoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProforma;
	protected JMenuItem jMenuItemDuplicarTipoProforma;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProforma;
	protected JMenuItem jMenuItemCopiarTipoProforma;
	protected JMenuItem jMenuItemVerFormTipoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProforma;
	protected JMenuItem jMenuItemCerrarTipoProforma;
	protected JMenuItem jMenuItemDetalleCerrarTipoProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProforma;
	protected JMenuItem jMenuItemProcesarInformacionTipoProforma;
	protected JMenuItem jMenuItemAnterioresTipoProforma;
	protected JMenuItem jMenuItemSiguientesTipoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProforma;
	protected JMenuItem jMenuItemAbrirOrderByTipoProforma;
	protected JMenuItem jMenuItemMostrarOcultarTipoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProforma;
	protected JCheckBox jCheckBoxSeleccionadosTipoProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProforma;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProforma;
	protected JTextField jTextFieldValorCampoGeneralTipoProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProforma;
	//public JList<Reporte> jListColumnasSelectReporteTipoProforma;
	//public JScrollPane jScrollColumnasSelectReporteTipoProforma;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProforma;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProforma;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProforma;
	
		
	//public JLabel jLabelArchivoImportacionTipoProforma;	
	//public JLabel jLabelPathArchivoImportacionTipoProforma;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProforma;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProforma;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProforma;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProforma;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProforma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoProforma;
	
	
	
	
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
	public TipoProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProforma)	{
		this.jButtonRecargarInformacionTipoProforma = jButtonRecargarInformacionTipoProforma;
	}
	
	public JButton getjButtonProcesarInformacionTipoProforma() {
		return this.jButtonProcesarInformacionTipoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProforma)	{
		this.jButtonProcesarInformacionTipoProforma = jButtonProcesarInformacionTipoProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProforma() {
		return this.jButtonRecargarInformacionTipoProforma;
	}
	
	
	public List<TipoProforma> gettipoproformas() {
		return this.tipoproformas;
	}

	public void settipoproformas(List<TipoProforma> tipoproformas) {
		this.tipoproformas = tipoproformas;
	}
	
	public List<TipoProforma> gettipoproformasAux() {
		return this.tipoproformasAux;
	}

	public void settipoproformasAux(List<TipoProforma> tipoproformasAux) {
		this.tipoproformasAux = tipoproformasAux;
	}
	
	public List<TipoProforma> gettipoproformasEliminados() {
		return this.tipoproformasEliminados;
	}

	public void setTipoProformasEliminados(List<TipoProforma> tipoproformasEliminados) {
		this.tipoproformasEliminados = tipoproformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProforma() {
		return jComboBoxTiposSeleccionarTipoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProforma(
			JComboBox jComboBoxTiposSeleccionarTipoProforma) {
		this.jComboBoxTiposSeleccionarTipoProforma = jComboBoxTiposSeleccionarTipoProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProforma() {
		return jTextFieldValorCampoGeneralTipoProforma;
	}

	public void setjTextFieldValorCampoGeneralTipoProforma(
			JTextField jTextFieldValorCampoGeneralTipoProforma) {
		this.jTextFieldValorCampoGeneralTipoProforma = jTextFieldValorCampoGeneralTipoProforma;
	}

	public void setBorderResaltarValorCampoGeneralTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProforma() {
		return this.jCheckBoxSeleccionarTodosTipoProforma;
	}

	public void setjCheckBoxSeleccionarTodosTipoProforma(
			JCheckBox jCheckBoxSeleccionarTodosTipoProforma) {
		this.jCheckBoxSeleccionarTodosTipoProforma = jCheckBoxSeleccionarTodosTipoProforma;
	}

	public void setBorderResaltarSeleccionarTodosTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProforma() {
		return this.jCheckBoxSeleccionadosTipoProforma;
	}

	public void setjCheckBoxSeleccionadosTipoProforma(
			JCheckBox jCheckBoxSeleccionadosTipoProforma) {
		this.jCheckBoxSeleccionadosTipoProforma = jCheckBoxSeleccionadosTipoProforma;
	}
	
	public void setBorderResaltarSeleccionadosTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProforma() {
		return this.jComboBoxTiposArchivosReportesTipoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProforma(
			JComboBox jComboBoxTiposArchivosReportesTipoProforma) {
		this.jComboBoxTiposArchivosReportesTipoProforma = jComboBoxTiposArchivosReportesTipoProforma;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProforma() {
		return this.jComboBoxTiposReportesTipoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProforma(
			JComboBox jComboBoxTiposReportesTipoProforma) {
		this.jComboBoxTiposReportesTipoProforma = jComboBoxTiposReportesTipoProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProforma() {
	//	return jComboBoxTiposReportesDinamicoTipoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProforma) {
	//	this.jComboBoxTiposReportesDinamicoTipoProforma = jComboBoxTiposReportesDinamicoTipoProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProforma = jComboBoxTiposArchivosReportesDinamicoTipoProforma;
	//}
	
	public void setBorderResaltarTiposReportesTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProforma() {
		return this.jComboBoxTiposGraficosReportesTipoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProforma(
			JComboBox jComboBoxTiposGraficosReportesTipoProforma) {
		this.jComboBoxTiposGraficosReportesTipoProforma = jComboBoxTiposGraficosReportesTipoProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProforma() {
		return this.jComboBoxTiposPaginacionTipoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProforma(
			JComboBox jComboBoxTiposPaginacionTipoProforma) {
		this.jComboBoxTiposPaginacionTipoProforma = jComboBoxTiposPaginacionTipoProforma;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProforma() {
		return this.jComboBoxTiposRelacionesTipoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProforma() {
		return this.jComboBoxTiposAccionesTipoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProforma(
			JComboBox jComboBoxTiposRelacionesTipoProforma) {
		this.jComboBoxTiposRelacionesTipoProforma = jComboBoxTiposRelacionesTipoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProforma(
			JComboBox jComboBoxTiposAccionesTipoProforma) {
		this.jComboBoxTiposAccionesTipoProforma = jComboBoxTiposAccionesTipoProforma;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProforma() {
	//	return jCheckBoxConGraficoDinamicoTipoProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProforma) {
	//	this.jCheckBoxConGraficoDinamicoTipoProforma = jCheckBoxConGraficoDinamicoTipoProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProforma .setBorder(borderResaltar);		
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
		this.tipoproformaSessionBean=new TipoProformaSessionBean();
		
		this.tipoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"nuevo","nuevo","Nuevo"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"duplicar","duplicar","Duplicar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"copiar","copiar","Copiar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"ver_form","ver_form","Ver"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"recargar","recargar","Recargar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProforma,this.jTtoolBarTipoProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProforma,this.jTtoolBarTipoProforma,
							"cerrar","cerrar","Salir"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProforma;
			
				this.jButtonProcesarInformacionToolBarTipoProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProforma;
				
		//protected JButton jButtonModificarToolBarTipoProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProforma=new JMenuMe("General");
		this.jmenuArchivoTipoProforma=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProforma=new JMenuMe("Acciones");
		this.jmenuDatosTipoProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProforma.add(this.jMenuItemCerrarTipoProforma);
			
			this.jmenuAccionesTipoProforma.add(this.jMenuItemNuevoTipoProforma);
			this.jmenuAccionesTipoProforma.add(this.jMenuItemNuevoGuardarCambiosTipoProforma);
			this.jmenuAccionesTipoProforma.add(this.jMenuItemNuevoRelacionesTipoProforma);
			this.jmenuAccionesTipoProforma.add(this.jMenuItemGuardarCambiosTablaTipoProforma);		
			this.jmenuAccionesTipoProforma.add(this.jMenuItemDuplicarTipoProforma);		
			this.jmenuAccionesTipoProforma.add(this.jMenuItemCopiarTipoProforma);		
			this.jmenuAccionesTipoProforma.add(this.jMenuItemVerFormTipoProforma);		
			
			this.jmenuDatosTipoProforma.add(this.jMenuItemRecargarInformacionTipoProforma);				
			this.jmenuDatosTipoProforma.add(this.jMenuItemAnterioresTipoProforma);				
			this.jmenuDatosTipoProforma.add(this.jMenuItemSiguientesTipoProforma);				
			this.jmenuDatosTipoProforma.add(this.jMenuItemAbrirOrderByTipoProforma);				
			this.jmenuDatosTipoProforma.add(this.jMenuItemMostrarOcultarTipoProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProforma.add(this.jMenuItemGuardarCambiosTipoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProforma.add(this.jmenuArchivoTipoProforma);		
			this.jmenuBarTipoProforma.add(this.jmenuAccionesTipoProforma);		
			this.jmenuBarTipoProforma.add(this.jmenuDatosTipoProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProforma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoProforma=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoProforma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProforma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProforma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoProforma = new TipoProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Proforma DATOS");
			this.jInternalFrameDetalleFormTipoProforma = new TipoProformaDetalleFormJInternalFrame(jDesktopPane,this.tipoproformaSessionBean.getConGuardarRelaciones(),this.tipoproformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProforma = null;//new TipoProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProforma= new GridBagLayout();
		
		
		this.jTableDatosTipoProforma = new JTableMe();      
		
		String sToolTipTipoProforma="";
		sToolTipTipoProforma=TipoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProforma+="(Facturacion.TipoProforma)";
		}
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProforma.setToolTipText(sToolTipTipoProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProforma);
		this.jTableDatosTipoProforma.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProforma.setRowSelectionAllowed(true);
		this.jTableDatosTipoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProforma = new JButtonMe();
		this.jButtonDuplicarTipoProforma = new JButtonMe();
		this.jButtonCopiarTipoProforma = new JButtonMe();
		this.jButtonVerFormTipoProforma = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProforma = new JButtonMe();
		this.jButtonCerrarTipoProforma = new JButtonMe();
		
		this.jScrollPanelDatosTipoProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proforma";
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProforma.setToolTipText("Acciones");
        this.jPanelAccionesTipoProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProforma=new ReporteDinamicoJInternalFrame(TipoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProforma=new ImportacionJInternalFrame(TipoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProforma.setText("Orden");
		this.jButtonAbrirOrderByTipoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProforma,false,this);
			
			//this.cargarOrderByTipoProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProforma,true,this);
			
			//this.cargarOrderByTipoProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProforma.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProforma.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProforma.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProforma.setText("Nuevo");
		this.jButtonDuplicarTipoProforma.setText("Duplicar");
		this.jButtonCopiarTipoProforma.setText("Copiar");
		this.jButtonVerFormTipoProforma.setText("Ver");
		this.jButtonNuevoRelacionesTipoProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProforma.setText("Guardar");
		this.jButtonCerrarTipoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProforma,"nuevo_button","Nuevo",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProforma,"duplicar_button","Duplicar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProforma,"copiar_button","Copiar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProforma,"ver_form","Ver",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProforma,"nuevorelaciones_button","Nuevo Rel",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProforma,"guardarcambiostabla_button","Guardar",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProforma,"cerrar_button","Salir",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProforma.setToolTipText("Nuevo"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProforma.setToolTipText("Duplicar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProforma.setToolTipText("Copiar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProforma.setToolTipText("Ver"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProforma.setToolTipText("Nuevo Rel"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProforma.setToolTipText("Guardar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProforma.setToolTipText("Salir"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProforma";
		inputMap = this.jButtonNuevoTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProforma";
		inputMap = this.jButtonDuplicarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProforma"));
		
		//COPIAR
		sMapKey = "CopiarTipoProforma";
		inputMap = this.jButtonCopiarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProforma"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProforma";
		inputMap = this.jButtonVerFormTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProforma";
		inputMap = this.jButtonNuevoRelacionesTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProforma";
		inputMap = this.jButtonModificarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProforma";
		inputMap = this.jButtonCerrarTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProforma";
		inputMap = this.jButtonGuardarCambiosTablaTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProforma.setName("jPanelParametrosReportesTipoProforma"); 
		
		this.jPanelParametrosReportesAccionesTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProforma.setName("jPanelParametrosReportesAccionesTipoProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProforma = new JButtonMe();
		this.jButtonRecargarInformacionTipoProforma.setText("Recargar");
		this.jButtonRecargarInformacionTipoProforma.setToolTipText("Recargar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProforma = new JButtonMe();
		this.jButtonProcesarInformacionTipoProforma.setText("Procesar");
		this.jButtonProcesarInformacionTipoProforma.setToolTipText("Procesar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProforma.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProforma.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProforma.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProforma.setText("Accion");
		this.jComboBoxTiposAccionesTipoProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProforma = new JLabelMe();
		
		this.jLabelAccionesTipoProforma.setText("Acciones");		
		this.jLabelAccionesTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProforma = new JButtonMe();
		//this.jButtonAnterioresTipoProforma.setText("<<");
        this.jButtonAnterioresTipoProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProforma = new JButtonMe();
		//this.jButtonSiguientesTipoProforma.setText(">>");
        this.jButtonSiguientesTipoProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProforma,"nuevoguardarcambios_button","Nue",this.tipoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProforma";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProforma";
		inputMap = this.jButtonRecargarInformacionTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProforma";
		inputMap = this.jButtonSiguientesTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProforma";
		inputMap = this.jButtonAnterioresTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProforma.setMinimumSize(new Dimension(this.getWidth(),TipoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProforma.setMaximumSize(new Dimension(this.getWidth(),TipoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProforma.setPreferredSize(new Dimension(this.getWidth(),TipoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProforma = new GridBagLayout();

			this.jPanelPaginacionTipoProforma.setLayout(gridaBagLayoutPaginacionTipoProforma);						
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 0;
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProforma.add(this.jButtonAnterioresTipoProforma, this.gridBagConstraintsTipoProforma);
					
						
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProforma.gridy = 0;
			
			this.jPanelPaginacionTipoProforma.add(this.jButtonNuevoGuardarCambiosTipoProforma, this.gridBagConstraintsTipoProforma);
						
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProforma.gridy = 0;
			this.jPanelPaginacionTipoProforma.add(this.jButtonSiguientesTipoProforma, this.gridBagConstraintsTipoProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 1;
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProforma.add(this.jButtonNuevoTipoProforma, this.gridBagConstraintsTipoProforma);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProforma = new GridBagConstraints();
				this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProforma.gridy = 1;
				this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProforma.add(this.jButtonNuevoRelacionesTipoProforma, this.gridBagConstraintsTipoProforma);
			}
			
			
			if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProforma = new GridBagConstraints();
				this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProforma.gridy = 1;
				this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProforma.add(this.jButtonGuardarCambiosTablaTipoProforma, this.gridBagConstraintsTipoProforma);
			}
			
			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 1;
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProforma.add(this.jButtonDuplicarTipoProforma, this.gridBagConstraintsTipoProforma);
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 1;
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProforma.add(this.jButtonCopiarTipoProforma, this.gridBagConstraintsTipoProforma);
		
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 1;
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProforma.add(this.jButtonVerFormTipoProforma, this.gridBagConstraintsTipoProforma);
		
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 1;
			this.gridBagConstraintsTipoProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProforma.add(this.jButtonCerrarTipoProforma, this.gridBagConstraintsTipoProforma);
		
		
		
		this.jButtonRecargarInformacionTipoProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProforma.setLayout(gridaBagParametrosReportesTipoProforma);
			this.jPanelParametrosReportesAccionesTipoProforma.setLayout(gridaBagParametrosReportesAccionesTipoProforma);
			
			
			this.jPanelParametrosAuxiliar1TipoProforma.setLayout(gridaBagParametrosAuxiliar1TipoProforma);
			this.jPanelParametrosAuxiliar2TipoProforma.setLayout(gridaBagParametrosAuxiliar2TipoProforma);
			this.jPanelParametrosAuxiliar3TipoProforma.setLayout(gridaBagParametrosAuxiliar3TipoProforma);
			this.jPanelParametrosAuxiliar4TipoProforma.setLayout(gridaBagParametrosAuxiliar4TipoProforma);
			//this.jPanelParametrosAuxiliar5TipoProforma.setLayout(gridaBagParametrosAuxiliar2TipoProforma);			
			
			
			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProforma.add(this.jButtonRecargarInformacionTipoProforma, this.gridBagConstraintsTipoProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProforma.add(this.jComboBoxTiposPaginacionTipoProforma, this.gridBagConstraintsTipoProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProforma.add(this.jCheckBoxConAltoMaximoTablaTipoProforma, this.gridBagConstraintsTipoProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProforma.add(this.jComboBoxTiposArchivosReportesTipoProforma, this.gridBagConstraintsTipoProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProforma.add(this.jPanelParametrosAuxiliar1TipoProforma, this.gridBagConstraintsTipoProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProforma.add(this.jComboBoxTiposReportesTipoProforma, this.gridBagConstraintsTipoProforma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProforma.add(this.jPanelParametrosAuxiliar4TipoProforma, this.gridBagConstraintsTipoProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProforma.add(this.jComboBoxTiposReportesTipoProforma, this.gridBagConstraintsTipoProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProforma.add(this.jCheckBoxGenerarReporteTipoProforma, this.gridBagConstraintsTipoProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProforma.add(this.jPanelParametrosAuxiliar2TipoProforma, this.gridBagConstraintsTipoProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProforma.add(this.jLabelAccionesTipoProforma, this.gridBagConstraintsTipoProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProforma = new GridBagConstraints();
				this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProforma.add(this.jButtonAbrirOrderByTipoProforma, this.gridBagConstraintsTipoProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProforma.add(this.jComboBoxTiposSeleccionarTipoProforma, this.gridBagConstraintsTipoProforma);			
			
			
			/*
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProforma.add(this.jCheckBoxSeleccionarTodosTipoProforma, this.gridBagConstraintsTipoProforma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProforma.add(this.jCheckBoxSeleccionarTodosTipoProforma, this.gridBagConstraintsTipoProforma);															
				
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProforma.add(this.jCheckBoxSeleccionadosTipoProforma, this.gridBagConstraintsTipoProforma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProforma.add(this.jPanelParametrosAuxiliar3TipoProforma, this.gridBagConstraintsTipoProforma);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProforma.add(this.jComboBoxTiposRelacionesTipoProforma, this.gridBagConstraintsTipoProforma);
				
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProforma.add(this.jComboBoxTiposAccionesTipoProforma, this.gridBagConstraintsTipoProforma);
	
				
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProforma.add(this.jTextFieldValorCampoGeneralTipoProforma, this.gridBagConstraintsTipoProforma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProforma = new GridBagLayout();

			this.jScrollPanelDatosTipoProforma.setLayout(gridaBagLayoutDatosTipoProforma);
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = 0;
			this.gridBagConstraintsTipoProforma.gridx = 0;
			
			this.jScrollPanelDatosTipoProforma.add(this.jTableDatosTipoProforma, this.gridBagConstraintsTipoProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProforma.setViewportView(this.jTableDatosTipoProforma);
		this.jTableDatosTipoProforma.setFillsViewportHeight(true);
		this.jTableDatosTipoProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProforma= new GridBagLayout();
		this.jPanelAccionesTipoProforma.setLayout(gridaBagLayoutAccionesTipoProforma);
		
		
		/*	
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = 0;
		this.gridBagConstraintsTipoProforma.gridx = 0;
			
		this.jPanelAccionesTipoProforma.add(this.jButtonNuevoTipoProforma, this.gridBagConstraintsTipoProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();						
			this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProforma.gridx = 0;		
			//this.gridBagConstraintsTipoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProforma, this.gridBagConstraintsTipoProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProforma.gridx = 0;		
		//this.gridBagConstraintsTipoProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProforma, this.gridBagConstraintsTipoProforma);								
		
		
		/*
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProforma, this.gridBagConstraintsTipoProforma);
		*/		
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProforma.gridx =0;
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProforma, this.gridBagConstraintsTipoProforma);
				
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProforma, this.gridBagConstraintsTipoProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProforma.setLayout(gridaBagLayoutBusquedasParametrosTipoProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProforma, this.gridBagConstraintsTipoProforma);
			
			
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProforma, this.gridBagConstraintsTipoProforma);
		
			
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProforma, this.gridBagConstraintsTipoProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProforma.setName("jPanelReporteDinamicoTipoProforma"); 
		
		this.jPanelReporteDinamicoTipoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProforma.setLayout(gridaBagLayoutReporteDinamicoTipoProforma);
		
		
		this.jInternalFrameReporteDinamicoTipoProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProforma.add(this.jLabelColumnasSelectReporteTipoProforma, this.gridBagConstraintsTipoProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProforma=new JScrollPane(this.jListColumnasSelectReporteTipoProforma);
			
			this.jScrollColumnasSelectReporteTipoProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProforma.add(this.jListColumnasSelectReporteTipoProforma, this.gridBagConstraintsTipoProforma);
		this.jPanelReporteDinamicoTipoProforma.add(this.jScrollColumnasSelectReporteTipoProforma, this.gridBagConstraintsTipoProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProforma.add(this.jLabelRelacionesSelectReporteTipoProforma, this.gridBagConstraintsTipoProforma);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProforma=new JScrollPane(this.jListRelacionesSelectReporteTipoProforma);
			
			this.jScrollRelacionesSelectReporteTipoProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProforma.add(this.jListRelacionesSelectReporteTipoProforma, this.gridBagConstraintsTipoProforma);
		this.jPanelReporteDinamicoTipoProforma.add(this.jScrollRelacionesSelectReporteTipoProforma, this.gridBagConstraintsTipoProforma);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProforma.add(this.jLabelGenerarExcelReporteDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProforma.setToolTipText("Generar EXCEL"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProforma.add(this.jButtonGenerarExcelReporteDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProforma.add(this.jComboBoxTiposReportesDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProforma.add(this.jLabelTiposArchivoReporteDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProforma.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProforma.setToolTipText("Generar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProforma.add(this.jButtonGenerarReporteDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProforma.setToolTipText("Cancelar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProforma.add(this.jButtonCerrarReporteDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProforma= new JScrollPane(jPanelReporteDinamicoTipoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProforma);
		this.jInternalFrameReporteDinamicoTipoProforma.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProforma, this.gridBagConstraintsTipoProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProforma.setName("jPanelImportacionTipoProforma"); 
		
		this.jPanelImportacionTipoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProforma.setLayout(gridaBagLayoutImportacionTipoProforma);
		
		
		this.jInternalFrameImportacionTipoProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProforma.setResizable(true);
	    this.jInternalFrameImportacionTipoProforma.setClosable(true);
	    this.jInternalFrameImportacionTipoProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProforma.setResizable(true);
	    this.jInternalFrameImportacionTipoProforma.setClosable(true);
	    this.jInternalFrameImportacionTipoProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProforma = new JLabelMe();

		this.jLabelArchivoImportacionTipoProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProforma.add(this.jLabelArchivoImportacionTipoProforma, this.gridBagConstraintsTipoProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProforma = new JFileChooser();		
		this.jFileChooserImportacionTipoProforma.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProforma = new JButtonMe();
		this.jButtonAbrirImportacionTipoProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProforma.setToolTipText("Generar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProforma.add(this.jButtonAbrirImportacionTipoProforma, this.gridBagConstraintsTipoProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProforma.add(this.jLabelPathArchivoImportacionTipoProforma, this.gridBagConstraintsTipoProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProforma.add(this.jTextFieldPathArchivoImportacionTipoProforma, this.gridBagConstraintsTipoProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProforma = new JButtonMe();
		this.jButtonGenerarImportacionTipoProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProforma.setToolTipText("Generar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProforma.add(this.jButtonGenerarImportacionTipoProforma, this.gridBagConstraintsTipoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProforma = new JButtonMe();
		this.jButtonCerrarImportacionTipoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProforma.setToolTipText("Cancelar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProforma.add(this.jButtonCerrarImportacionTipoProforma, this.gridBagConstraintsTipoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProforma= new JScrollPane(jPanelImportacionTipoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProforma = new GridBagConstraints();
		this.gridBagConstraintsTipoProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProforma);
		this.jInternalFrameImportacionTipoProforma.getContentPane().add(this.jScrollPanelImportacionTipoProforma, this.gridBagConstraintsTipoProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProforma = new JButtonMe();
			this.jButtonAbrirOrderByTipoProforma.setText("Orden");
			this.jButtonAbrirOrderByTipoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProforma";
			inputMap = this.jButtonAbrirOrderByTipoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProforma.setName("jPanelOrderByTipoProforma"); 
			
			this.jPanelOrderByTipoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProforma.setLayout(gridaBagLayoutOrderByTipoProforma);
			
			
			this.jTableDatosTipoProformaOrderBy = new JTableMe();        
			this.jTableDatosTipoProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProformaOrderBy.setViewportView(this.jTableDatosTipoProformaOrderBy);
			this.jTableDatosTipoProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProforma.setTitle("Orden");
			this.jInternalFrameOrderByTipoProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProforma.setResizable(true);
			this.jInternalFrameOrderByTipoProforma.setClosable(true);
			this.jInternalFrameOrderByTipoProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProforma.ipady =150;
				
			this.jPanelOrderByTipoProforma.add(jScrollPanelDatosTipoProformaOrderBy, this.gridBagConstraintsTipoProforma);//this.jTableDatosTipoProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProforma = new JButtonMe();
			this.jButtonCerrarOrderByTipoProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProforma.setToolTipText("Cancelar"+" "+TipoProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProforma.add(this.jButtonCerrarOrderByTipoProforma, this.gridBagConstraintsTipoProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProforma= new JScrollPane(jPanelOrderByTipoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProforma = new GridBagConstraints();
			this.gridBagConstraintsTipoProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProforma);
			
			this.jInternalFrameOrderByTipoProforma.getContentPane().add(this.jScrollPanelOrderByTipoProforma, this.gridBagConstraintsTipoProforma);			
		
		} else {
			this.jButtonAbrirOrderByTipoProforma = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoproformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProforma.getRowHeight();//TipoProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProforma.isSelected()) {
					iHeightTable=TipoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProforma.isSelected()) {
					iHeightTable=TipoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProforma!=null && this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoproformaLogic.getTipoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproformas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProforma> TraerTipoProformaBeans(List<TipoProforma> tipoproformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProforma tipoproforma:tipoproformas) {
					
				if(!(TipoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoproforma.setsDetalleGeneralEntityReporte(TipoProformaConstantesFunciones.getTipoProformaDescripcion(tipoproforma));
										
						
					
					

					if(tipoproforma.getProformas()!=null && Funciones.existeClass(classes,Proforma.class)) {
						try{tipoproforma.setproformasDescripcionReporte(new JRBeanCollectionDataSource(ProformaJInternalFrame.TraerProformaBeans(tipoproforma.getProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoproforma.setsDetalleGeneralEntityReporte(tipoproforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoproformabeans.add(tipoproformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoproformas;
    }
	//PARA REPORTES FIN
}
