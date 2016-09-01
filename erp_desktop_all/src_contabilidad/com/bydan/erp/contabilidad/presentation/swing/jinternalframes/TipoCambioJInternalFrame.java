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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.sris.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoCambioConstantesFunciones;

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
public class TipoCambioJInternalFrame extends TipoCambioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCambio;
	
	protected JMenuBar jmenuBarTipoCambio;
	
	protected JMenu jmenuTipoCambio;
	protected JMenu jmenuDatosTipoCambio;
	protected JMenu jmenuArchivoTipoCambio;
	protected JMenu jmenuAccionesTipoCambio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCambio;	
	protected GridBagConstraints gridBagConstraintsTipoCambio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCambioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCambio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCambio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCambio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";
	
	public TipoCambioSessionBean tipocambioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCambio> tipocambios;		
	public List<TipoCambio> tipocambiosEliminados;	
	public List<TipoCambio> tipocambiosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCambio;		
	protected JButton jButtonAbrirOrderByTipoCambio;
	
	
	//protected JPanel jPanelOrderByTipoCambio;
	//public JScrollPane jScrollPanelOrderByTipoCambio;	
	//protected JButton jButtonCerrarOrderByTipoCambio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCambioLogic tipocambioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCambio;
	public JScrollPane jScrollPanelDatosEdicionTipoCambio;
	public JScrollPane jScrollPanelDatosGeneralTipoCambio;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCambioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCambio;
	//public JScrollPane jScrollPanelImportacionTipoCambio;
	
	
	
	protected JPanel jPanelAccionesTipoCambio;
	
    protected JPanel jPanelPaginacionTipoCambio;
    protected JPanel jPanelParametrosReportesTipoCambio;
	protected JPanel jPanelParametrosReportesAccionesTipoCambio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCambio;
	protected JPanel jPanelParametrosAuxiliar2TipoCambio;
	protected JPanel jPanelParametrosAuxiliar3TipoCambio;
	protected JPanel jPanelParametrosAuxiliar4TipoCambio;
	//protected JPanel jPanelParametrosAuxiliar5TipoCambio;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCambio;
	//protected JPanel jPanelImportacionTipoCambio;
	
	
	public JTable jTableDatosTipoCambio;
	
	
	
	//public JTable jTableDatosTipoCambioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCambio;
	protected JButton jButtonDuplicarTipoCambio;
	protected JButton jButtonCopiarTipoCambio;
	protected JButton jButtonVerFormTipoCambio;
	protected JButton jButtonNuevoRelacionesTipoCambio;
	protected JButton jButtonModificarTipoCambio;
	
    protected JButton jButtonGuardarCambiosTablaTipoCambio;
	protected JButton jButtonCerrarTipoCambio;
	
	
	protected JButton jButtonRecargarInformacionTipoCambio;
	protected JButton jButtonProcesarInformacionTipoCambio;
	
	
	protected JButton jButtonAnterioresTipoCambio;
	protected JButton jButtonSiguientesTipoCambio;
	protected JButton jButtonNuevoGuardarCambiosTipoCambio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCambio;
	//protected JButton jButtonCerrarReporteDinamicoTipoCambio;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCambio;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCambio;
	//protected JButton jButtonGenerarImportacionTipoCambio;
	//protected JButton jButtonCerrarImportacionTipoCambio;
	//protected JFileChooser jFileChooserImportacionTipoCambio;
	//protected File fileImportacionTipoCambio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCambio;
	protected JButton jButtonDuplicarToolBarTipoCambio;
	protected JButton jButtonNuevoRelacionesToolBarTipoCambio;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCambio;
	protected JButton jButtonCopiarToolBarTipoCambio;
	protected JButton jButtonVerFormToolBarTipoCambio;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCambio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCambio;
	protected JButton jButtonCerrarToolBarTipoCambio;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCambio;
	protected JButton jButtonProcesarInformacionToolBarTipoCambio;
	protected JButton jButtonAnterioresToolBarTipoCambio;
	protected JButton jButtonSiguientesToolBarTipoCambio;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCambio;
	protected JButton jButtonAbrirOrderByToolBarTipoCambio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCambio;
	protected JMenuItem jMenuItemDuplicarTipoCambio;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCambio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCambio;
	protected JMenuItem jMenuItemCopiarTipoCambio;
	protected JMenuItem jMenuItemVerFormTipoCambio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCambio;
	protected JMenuItem jMenuItemCerrarTipoCambio;
	protected JMenuItem jMenuItemDetalleCerrarTipoCambio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCambio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCambio;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCambio;
	protected JMenuItem jMenuItemProcesarInformacionTipoCambio;
	protected JMenuItem jMenuItemAnterioresTipoCambio;
	protected JMenuItem jMenuItemSiguientesTipoCambio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCambio;
	protected JMenuItem jMenuItemAbrirOrderByTipoCambio;
	protected JMenuItem jMenuItemMostrarOcultarTipoCambio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCambio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCambio;
	protected JCheckBox jCheckBoxSeleccionadosTipoCambio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCambio;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCambio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCambio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCambio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCambio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCambio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCambio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCambio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCambio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCambio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCambio;
	protected JTextField jTextFieldValorCampoGeneralTipoCambio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCambio;
	//public JList<Reporte> jListColumnasSelectReporteTipoCambio;
	//public JScrollPane jScrollColumnasSelectReporteTipoCambio;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCambio;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCambio;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCambio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCambio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCambio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCambio;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCambio;
	
		
	//public JLabel jLabelArchivoImportacionTipoCambio;	
	//public JLabel jLabelPathArchivoImportacionTipoCambio;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCambio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCambio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCambio;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCambio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCambio;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCambio;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCambio;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCambio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCambio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCambio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCambio;
	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoCambioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCambio)	{
		this.jButtonRecargarInformacionTipoCambio = jButtonRecargarInformacionTipoCambio;
	}
	
	public JButton getjButtonProcesarInformacionTipoCambio() {
		return this.jButtonProcesarInformacionTipoCambio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCambio)	{
		this.jButtonProcesarInformacionTipoCambio = jButtonProcesarInformacionTipoCambio;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCambio() {
		return this.jButtonRecargarInformacionTipoCambio;
	}
	
	
	public List<TipoCambio> gettipocambios() {
		return this.tipocambios;
	}

	public void settipocambios(List<TipoCambio> tipocambios) {
		this.tipocambios = tipocambios;
	}
	
	public List<TipoCambio> gettipocambiosAux() {
		return this.tipocambiosAux;
	}

	public void settipocambiosAux(List<TipoCambio> tipocambiosAux) {
		this.tipocambiosAux = tipocambiosAux;
	}
	
	public List<TipoCambio> gettipocambiosEliminados() {
		return this.tipocambiosEliminados;
	}

	public void setTipoCambiosEliminados(List<TipoCambio> tipocambiosEliminados) {
		this.tipocambiosEliminados = tipocambiosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCambio() {
		return jComboBoxTiposSeleccionarTipoCambio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCambio(
			JComboBox jComboBoxTiposSeleccionarTipoCambio) {
		this.jComboBoxTiposSeleccionarTipoCambio = jComboBoxTiposSeleccionarTipoCambio;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCambio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCambio() {
		return jTextFieldValorCampoGeneralTipoCambio;
	}

	public void setjTextFieldValorCampoGeneralTipoCambio(
			JTextField jTextFieldValorCampoGeneralTipoCambio) {
		this.jTextFieldValorCampoGeneralTipoCambio = jTextFieldValorCampoGeneralTipoCambio;
	}

	public void setBorderResaltarValorCampoGeneralTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCambio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCambio() {
		return this.jCheckBoxSeleccionarTodosTipoCambio;
	}

	public void setjCheckBoxSeleccionarTodosTipoCambio(
			JCheckBox jCheckBoxSeleccionarTodosTipoCambio) {
		this.jCheckBoxSeleccionarTodosTipoCambio = jCheckBoxSeleccionarTodosTipoCambio;
	}

	public void setBorderResaltarSeleccionarTodosTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCambio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCambio() {
		return this.jCheckBoxSeleccionadosTipoCambio;
	}

	public void setjCheckBoxSeleccionadosTipoCambio(
			JCheckBox jCheckBoxSeleccionadosTipoCambio) {
		this.jCheckBoxSeleccionadosTipoCambio = jCheckBoxSeleccionadosTipoCambio;
	}
	
	public void setBorderResaltarSeleccionadosTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCambio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCambio() {
		return this.jComboBoxTiposArchivosReportesTipoCambio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCambio(
			JComboBox jComboBoxTiposArchivosReportesTipoCambio) {
		this.jComboBoxTiposArchivosReportesTipoCambio = jComboBoxTiposArchivosReportesTipoCambio;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCambio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCambio() {
		return this.jComboBoxTiposReportesTipoCambio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCambio(
			JComboBox jComboBoxTiposReportesTipoCambio) {
		this.jComboBoxTiposReportesTipoCambio = jComboBoxTiposReportesTipoCambio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCambio() {
	//	return jComboBoxTiposReportesDinamicoTipoCambio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCambio(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCambio) {
	//	this.jComboBoxTiposReportesDinamicoTipoCambio = jComboBoxTiposReportesDinamicoTipoCambio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCambio() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCambio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCambio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCambio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCambio = jComboBoxTiposArchivosReportesDinamicoTipoCambio;
	//}
	
	public void setBorderResaltarTiposReportesTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCambio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCambio() {
		return this.jComboBoxTiposGraficosReportesTipoCambio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCambio(
			JComboBox jComboBoxTiposGraficosReportesTipoCambio) {
		this.jComboBoxTiposGraficosReportesTipoCambio = jComboBoxTiposGraficosReportesTipoCambio;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCambio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCambio() {
		return this.jComboBoxTiposPaginacionTipoCambio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCambio(
			JComboBox jComboBoxTiposPaginacionTipoCambio) {
		this.jComboBoxTiposPaginacionTipoCambio = jComboBoxTiposPaginacionTipoCambio;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCambio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCambio() {
		return this.jComboBoxTiposRelacionesTipoCambio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCambio() {
		return this.jComboBoxTiposAccionesTipoCambio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCambio(
			JComboBox jComboBoxTiposRelacionesTipoCambio) {
		this.jComboBoxTiposRelacionesTipoCambio = jComboBoxTiposRelacionesTipoCambio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCambio(
			JComboBox jComboBoxTiposAccionesTipoCambio) {
		this.jComboBoxTiposAccionesTipoCambio = jComboBoxTiposAccionesTipoCambio;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCambio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCambio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCambio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCambio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCambio() {
	//	return jCheckBoxConGraficoDinamicoTipoCambio;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCambio(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCambio) {
	//	this.jCheckBoxConGraficoDinamicoTipoCambio = jCheckBoxConGraficoDinamicoTipoCambio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCambio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCambio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCambio .setBorder(borderResaltar);		
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
		this.tipocambioSessionBean=new TipoCambioSessionBean();
		
		this.tipocambioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocambioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocambioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCambioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCambioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCambioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCambioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCambioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cambio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCambioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCambio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"nuevo","nuevo","Nuevo"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"duplicar","duplicar","Duplicar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"copiar","copiar","Copiar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"ver_form","ver_form","Ver"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"recargar","recargar","Recargar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCambio,this.jTtoolBarTipoCambio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCambio,this.jTtoolBarTipoCambio,
							"cerrar","cerrar","Salir"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCambio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCambio;
			
				this.jButtonProcesarInformacionToolBarTipoCambio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCambio;
				
		//protected JButton jButtonModificarToolBarTipoCambio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCambio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCambio=new JMenuMe("General");
		this.jmenuArchivoTipoCambio=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCambio=new JMenuMe("Acciones");
		this.jmenuDatosTipoCambio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCambio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCambio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCambio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCambio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCambio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCambio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCambio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCambio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCambio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCambio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCambio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCambio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCambio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCambio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCambio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCambio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCambio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCambio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCambio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCambio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCambio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCambio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCambio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCambio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCambio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCambio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCambio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCambio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCambio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCambio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCambio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCambio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCambio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCambio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCambio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCambio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCambio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCambio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCambio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCambio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCambio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCambio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCambio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCambio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCambio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCambio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCambio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCambio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCambio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCambio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCambio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCambio.add(this.jMenuItemCerrarTipoCambio);
			
			this.jmenuAccionesTipoCambio.add(this.jMenuItemNuevoTipoCambio);
			this.jmenuAccionesTipoCambio.add(this.jMenuItemNuevoGuardarCambiosTipoCambio);
			this.jmenuAccionesTipoCambio.add(this.jMenuItemNuevoRelacionesTipoCambio);
			this.jmenuAccionesTipoCambio.add(this.jMenuItemGuardarCambiosTablaTipoCambio);		
			this.jmenuAccionesTipoCambio.add(this.jMenuItemDuplicarTipoCambio);		
			this.jmenuAccionesTipoCambio.add(this.jMenuItemCopiarTipoCambio);		
			this.jmenuAccionesTipoCambio.add(this.jMenuItemVerFormTipoCambio);		
			
			this.jmenuDatosTipoCambio.add(this.jMenuItemRecargarInformacionTipoCambio);				
			this.jmenuDatosTipoCambio.add(this.jMenuItemAnterioresTipoCambio);				
			this.jmenuDatosTipoCambio.add(this.jMenuItemSiguientesTipoCambio);				
			this.jmenuDatosTipoCambio.add(this.jMenuItemAbrirOrderByTipoCambio);				
			this.jmenuDatosTipoCambio.add(this.jMenuItemMostrarOcultarTipoCambio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCambio.add(this.jMenuItemGuardarCambiosTipoCambio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCambio.add(this.jmenuArchivoTipoCambio);		
			this.jmenuBarTipoCambio.add(this.jmenuAccionesTipoCambio);		
			this.jmenuBarTipoCambio.add(this.jmenuDatosTipoCambio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCambio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCambio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoCambio=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCambio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCambio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCambio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCambio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCambio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCambio = new TipoCambioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cambio DATOS");
			this.jInternalFrameDetalleFormTipoCambio = new TipoCambioDetalleFormJInternalFrame(jDesktopPane,this.tipocambioSessionBean.getConGuardarRelaciones(),this.tipocambioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCambio = null;//new TipoCambioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCambio= new GridBagLayout();
		
		
		this.jTableDatosTipoCambio = new JTableMe();      
		
		String sToolTipTipoCambio="";
		sToolTipTipoCambio=TipoCambioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCambio+="(Contabilidad.TipoCambio)";
		}
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCambio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCambio.setToolTipText(sToolTipTipoCambio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCambio);
		this.jTableDatosTipoCambio.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCambio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCambio.setRowSelectionAllowed(true);
		this.jTableDatosTipoCambio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCambio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCambio = new JButtonMe();
		this.jButtonDuplicarTipoCambio = new JButtonMe();
		this.jButtonCopiarTipoCambio = new JButtonMe();
		this.jButtonVerFormTipoCambio = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCambio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCambio = new JButtonMe();
		this.jButtonCerrarTipoCambio = new JButtonMe();
		
		this.jScrollPanelDatosTipoCambio = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCambio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cambio";
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cambios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCambio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCambio.setToolTipText("Acciones");
        this.jPanelAccionesTipoCambio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCambio=new ReporteDinamicoJInternalFrame(TipoCambioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCambio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCambio=new ImportacionJInternalFrame(TipoCambioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCambio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCambio = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCambio.setText("Orden");
		this.jButtonAbrirOrderByTipoCambio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCambio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCambio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCambio,false,this);
			
			//this.cargarOrderByTipoCambio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCambio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCambio,true,this);
			
			//this.cargarOrderByTipoCambio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCambio.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosTipoCambio.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosTipoCambio.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosTipoCambio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCambio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCambio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCambio.setText("Nuevo");
		this.jButtonDuplicarTipoCambio.setText("Duplicar");
		this.jButtonCopiarTipoCambio.setText("Copiar");
		this.jButtonVerFormTipoCambio.setText("Ver");
		this.jButtonNuevoRelacionesTipoCambio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCambio.setText("Guardar");
		this.jButtonCerrarTipoCambio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCambio,"nuevo_button","Nuevo",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCambio,"duplicar_button","Duplicar",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCambio,"copiar_button","Copiar",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCambio,"ver_form","Ver",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCambio,"nuevorelaciones_button","Nuevo Rel",this.tipocambioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCambio,"guardarcambiostabla_button","Guardar",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCambio,"cerrar_button","Salir",this.tipocambioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCambio.setToolTipText("Nuevo"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCambio.setToolTipText("Duplicar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCambio.setToolTipText("Copiar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCambio.setToolTipText("Ver"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCambio.setToolTipText("Nuevo Rel"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCambio.setToolTipText("Guardar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCambio.setToolTipText("Salir"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCambio";
		inputMap = this.jButtonNuevoTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCambio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCambio"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCambio";
		inputMap = this.jButtonDuplicarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCambio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCambio"));
		
		//COPIAR
		sMapKey = "CopiarTipoCambio";
		inputMap = this.jButtonCopiarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCambio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCambio"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCambio";
		inputMap = this.jButtonVerFormTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCambio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCambio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCambio";
		inputMap = this.jButtonNuevoRelacionesTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCambio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCambio";
		inputMap = this.jButtonModificarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCambio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCambio";
		inputMap = this.jButtonCerrarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCambio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCambio";
		inputMap = this.jButtonGuardarCambiosTablaTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCambio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCambio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCambio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCambio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCambio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCambio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCambio.setName("jPanelParametrosReportesTipoCambio"); 
		
		this.jPanelParametrosReportesAccionesTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCambio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCambio.setName("jPanelParametrosReportesAccionesTipoCambio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCambio = new JButtonMe();
		this.jButtonRecargarInformacionTipoCambio.setText("Recargar");
		this.jButtonRecargarInformacionTipoCambio.setToolTipText("Recargar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCambio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCambio = new JButtonMe();
		this.jButtonProcesarInformacionTipoCambio.setText("Procesar");
		this.jButtonProcesarInformacionTipoCambio.setToolTipText("Procesar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCambio.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCambio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCambio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCambio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCambio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCambio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCambio.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCambio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCambio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCambio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCambio.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCambio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCambio.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCambio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCambio.setText("Accion");
		this.jComboBoxTiposAccionesTipoCambio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCambio.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCambio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCambio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCambio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCambio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCambio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCambio = new JLabelMe();
		
		this.jLabelAccionesTipoCambio.setText("Acciones");		
		this.jLabelAccionesTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCambio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCambio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCambio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCambio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCambio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCambio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCambio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCambio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCambio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCambio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCambio.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCambio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCambio = new JButtonMe();
		//this.jButtonAnterioresTipoCambio.setText("<<");
        this.jButtonAnterioresTipoCambio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCambio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCambio = new JButtonMe();
		//this.jButtonSiguientesTipoCambio.setText(">>");
        this.jButtonSiguientesTipoCambio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCambio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCambio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCambio.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCambio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCambio,"nuevoguardarcambios_button","Nue",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCambio";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCambio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCambio";
		inputMap = this.jButtonRecargarInformacionTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCambio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCambio";
		inputMap = this.jButtonSiguientesTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCambio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCambio";
		inputMap = this.jButtonAnterioresTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCambio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCambio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCambio.setMinimumSize(new Dimension(this.getWidth(),TipoCambioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCambioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCambio.setMaximumSize(new Dimension(this.getWidth(),TipoCambioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCambioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCambio.setPreferredSize(new Dimension(this.getWidth(),TipoCambioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCambioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCambio = new GridBagLayout();

			this.jPanelPaginacionTipoCambio.setLayout(gridaBagLayoutPaginacionTipoCambio);						
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 0;
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCambio.add(this.jButtonAnterioresTipoCambio, this.gridBagConstraintsTipoCambio);
					
						
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCambio.gridy = 0;
			
			this.jPanelPaginacionTipoCambio.add(this.jButtonNuevoGuardarCambiosTipoCambio, this.gridBagConstraintsTipoCambio);
						
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCambio.gridy = 0;
			this.jPanelPaginacionTipoCambio.add(this.jButtonSiguientesTipoCambio, this.gridBagConstraintsTipoCambio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 1;
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCambio.add(this.jButtonNuevoTipoCambio, this.gridBagConstraintsTipoCambio);
						
			
			
			if(!this.tipocambioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCambio = new GridBagConstraints();
				this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCambio.gridy = 1;
				this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCambio.add(this.jButtonGuardarCambiosTablaTipoCambio, this.gridBagConstraintsTipoCambio);
			}
			
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 1;
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCambio.add(this.jButtonDuplicarTipoCambio, this.gridBagConstraintsTipoCambio);
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 1;
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCambio.add(this.jButtonCopiarTipoCambio, this.gridBagConstraintsTipoCambio);
		
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 1;
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCambio.add(this.jButtonVerFormTipoCambio, this.gridBagConstraintsTipoCambio);
		
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 1;
			this.gridBagConstraintsTipoCambio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCambio.add(this.jButtonCerrarTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		
		this.jButtonRecargarInformacionTipoCambio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCambio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCambio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCambio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCambio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCambio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCambio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCambio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCambio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCambio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCambio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCambio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCambio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCambio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCambio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCambio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCambio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCambio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCambio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCambio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCambio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCambio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCambio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCambio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCambio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCambio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCambio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCambio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCambio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCambio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCambio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCambio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCambio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCambio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCambio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCambio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCambio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCambio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCambio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCambio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCambio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCambio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCambio.setLayout(gridaBagParametrosReportesTipoCambio);
			this.jPanelParametrosReportesAccionesTipoCambio.setLayout(gridaBagParametrosReportesAccionesTipoCambio);
			
			
			this.jPanelParametrosAuxiliar1TipoCambio.setLayout(gridaBagParametrosAuxiliar1TipoCambio);
			this.jPanelParametrosAuxiliar2TipoCambio.setLayout(gridaBagParametrosAuxiliar2TipoCambio);
			this.jPanelParametrosAuxiliar3TipoCambio.setLayout(gridaBagParametrosAuxiliar3TipoCambio);
			this.jPanelParametrosAuxiliar4TipoCambio.setLayout(gridaBagParametrosAuxiliar4TipoCambio);
			//this.jPanelParametrosAuxiliar5TipoCambio.setLayout(gridaBagParametrosAuxiliar2TipoCambio);			
			
			
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCambio.add(this.jButtonRecargarInformacionTipoCambio, this.gridBagConstraintsTipoCambio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCambio.add(this.jComboBoxTiposPaginacionTipoCambio, this.gridBagConstraintsTipoCambio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCambio.add(this.jCheckBoxConAltoMaximoTablaTipoCambio, this.gridBagConstraintsTipoCambio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCambio.add(this.jComboBoxTiposArchivosReportesTipoCambio, this.gridBagConstraintsTipoCambio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCambio.add(this.jPanelParametrosAuxiliar1TipoCambio, this.gridBagConstraintsTipoCambio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCambio.add(this.jComboBoxTiposReportesTipoCambio, this.gridBagConstraintsTipoCambio);																		
			
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoCambio.add(this.jComboBoxTiposGraficosReportesTipoCambio, this.gridBagConstraintsTipoCambio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCambio.add(this.jPanelParametrosAuxiliar4TipoCambio, this.gridBagConstraintsTipoCambio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCambio.add(this.jComboBoxTiposReportesTipoCambio, this.gridBagConstraintsTipoCambio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCambio.add(this.jCheckBoxGenerarReporteTipoCambio, this.gridBagConstraintsTipoCambio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCambio.add(this.jPanelParametrosAuxiliar2TipoCambio, this.gridBagConstraintsTipoCambio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCambio.add(this.jLabelAccionesTipoCambio, this.gridBagConstraintsTipoCambio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCambio = new GridBagConstraints();
				this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCambio.add(this.jButtonAbrirOrderByTipoCambio, this.gridBagConstraintsTipoCambio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCambio.add(this.jComboBoxTiposSeleccionarTipoCambio, this.gridBagConstraintsTipoCambio);			
			
			
			/*
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCambio.add(this.jCheckBoxSeleccionarTodosTipoCambio, this.gridBagConstraintsTipoCambio);
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCambio.add(this.jCheckBoxConGraficoReporteTipoCambio, this.gridBagConstraintsTipoCambio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCambio.add(this.jCheckBoxSeleccionarTodosTipoCambio, this.gridBagConstraintsTipoCambio);															
				
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCambio.add(this.jCheckBoxSeleccionadosTipoCambio, this.gridBagConstraintsTipoCambio);															
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCambio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCambio.add(this.jCheckBoxConGraficoReporteTipoCambio, this.gridBagConstraintsTipoCambio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCambio.add(this.jPanelParametrosAuxiliar3TipoCambio, this.gridBagConstraintsTipoCambio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCambio.add(this.jComboBoxTiposRelacionesTipoCambio, this.gridBagConstraintsTipoCambio);
				
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCambio.add(this.jComboBoxTiposAccionesTipoCambio, this.gridBagConstraintsTipoCambio);
	
				
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCambio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCambio.add(this.jTextFieldValorCampoGeneralTipoCambio, this.gridBagConstraintsTipoCambio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCambio = new GridBagLayout();

			this.jScrollPanelDatosTipoCambio.setLayout(gridaBagLayoutDatosTipoCambio);
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = 0;
			this.gridBagConstraintsTipoCambio.gridx = 0;
			
			this.jScrollPanelDatosTipoCambio.add(this.jTableDatosTipoCambio, this.gridBagConstraintsTipoCambio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCambio.setViewportView(this.jTableDatosTipoCambio);
		this.jTableDatosTipoCambio.setFillsViewportHeight(true);
		this.jTableDatosTipoCambio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCambio= new GridBagLayout();
		this.jPanelAccionesTipoCambio.setLayout(gridaBagLayoutAccionesTipoCambio);
		
		
		/*	
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 0;
			
		this.jPanelAccionesTipoCambio.add(this.jButtonNuevoTipoCambio, this.gridBagConstraintsTipoCambio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCambio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCambio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();						
			this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCambio.gridx = 0;		
			//this.gridBagConstraintsTipoCambio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCambio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCambio, this.gridBagConstraintsTipoCambio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCambio.gridx = 0;		
		//this.gridBagConstraintsTipoCambio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCambio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCambio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCambio, this.gridBagConstraintsTipoCambio);								
		
		
		/*
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCambio, this.gridBagConstraintsTipoCambio);
		*/		
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCambio.gridx =0;
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCambio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCambio, this.gridBagConstraintsTipoCambio);
				
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCambio, this.gridBagConstraintsTipoCambio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCambio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCambio = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCambio.setLayout(gridaBagLayoutBusquedasParametrosTipoCambio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCambio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCambio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCambio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCambio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCambio, this.gridBagConstraintsTipoCambio);
			
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCambio, this.gridBagConstraintsTipoCambio);
		
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCambio, this.gridBagConstraintsTipoCambio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCambio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCambio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCambio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCambio.setName("jPanelReporteDinamicoTipoCambio"); 
		
		this.jPanelReporteDinamicoTipoCambio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCambio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCambio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCambio.setLayout(gridaBagLayoutReporteDinamicoTipoCambio);
		
		
		this.jInternalFrameReporteDinamicoTipoCambio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCambio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCambio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCambio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCambio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCambio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCambio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCambio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCambio.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCambio.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCambio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCambio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCambio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCambio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cambios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCambio = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCambio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelColumnasSelectReporteTipoCambio, this.gridBagConstraintsTipoCambio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCambio = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCambio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCambio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCambio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCambio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCambio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCambio=new JScrollPane(this.jListColumnasSelectReporteTipoCambio);
			
			this.jScrollColumnasSelectReporteTipoCambio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCambio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCambio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCambio.add(this.jListColumnasSelectReporteTipoCambio, this.gridBagConstraintsTipoCambio);
		this.jPanelReporteDinamicoTipoCambio.add(this.jScrollColumnasSelectReporteTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCambio = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCambio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCambio = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCambio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCambio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCambio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCambio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCambio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCambio=new JScrollPane(this.jListRelacionesSelectReporteTipoCambio);
			
			this.jScrollRelacionesSelectReporteTipoCambio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCambio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCambio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCambio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCambio = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCambio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCambio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCambio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCambio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCambio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCambio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCambio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCambio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCambio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCambio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCambio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoCambio = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoCambio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelConGraficoDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoCambio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoCambio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoCambio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoCambio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoCambio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoCambio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jCheckBoxConGraficoDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoCambio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoCambio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelColumnaCategoriaGraficoTipoCambio, this.gridBagConstraintsTipoCambio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoCambio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoCambio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoCambio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoCambio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoCambio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoCambio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoCambio.add(this.jComboBoxColumnaCategoriaGraficoTipoCambio, this.gridBagConstraintsTipoCambio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoCambio = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoCambio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelColumnaCategoriaValorTipoCambio, this.gridBagConstraintsTipoCambio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoCambio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoCambio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoCambio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoCambio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoCambio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoCambio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoCambio.add(this.jComboBoxColumnaCategoriaValorTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoCambio = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoCambio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelColumnasValoresGraficoTipoCambio, this.gridBagConstraintsTipoCambio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoCambio = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoCambio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoCambio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoCambio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoCambio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoCambio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoCambio=new JScrollPane(this.jListColumnasValoresGraficoTipoCambio);
			
			this.jScrollColumnasValoresGraficoTipoCambio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoCambio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoCambio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoCambio.add(this.jListColumnasSelectReporteTipoCambio, this.gridBagConstraintsTipoCambio);
		this.jPanelReporteDinamicoTipoCambio.add(this.jScrollColumnasValoresGraficoTipoCambio, this.gridBagConstraintsTipoCambio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoCambio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoCambio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelTiposGraficosReportesDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoCambio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoCambio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoCambio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoCambio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoCambio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoCambio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jComboBoxTiposGraficosReportesDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCambio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCambio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelGenerarExcelReporteDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCambio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCambio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCambio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCambio.setToolTipText("Generar EXCEL"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCambio.add(this.jButtonGenerarExcelReporteDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCambio.add(this.jComboBoxTiposReportesDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCambio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCambio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCambio.add(this.jLabelTiposArchivoReporteDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCambio.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCambio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCambio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCambio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCambio.setToolTipText("Generar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCambio.add(this.jButtonGenerarReporteDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCambio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCambio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCambio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCambio.setToolTipText("Cancelar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCambio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCambio.add(this.jButtonCerrarReporteDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCambio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCambio= new JScrollPane(jPanelReporteDinamicoTipoCambio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCambio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCambio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCambio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cambios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCambio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCambio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCambio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCambio);
		this.jInternalFrameReporteDinamicoTipoCambio.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCambio, this.gridBagConstraintsTipoCambio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCambio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCambio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCambio.setName("jPanelImportacionTipoCambio"); 
		
		this.jPanelImportacionTipoCambio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCambio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCambio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCambio.setLayout(gridaBagLayoutImportacionTipoCambio);
		
		
		this.jInternalFrameImportacionTipoCambio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCambio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCambio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCambio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCambio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCambio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCambio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCambio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCambio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCambio.setResizable(true);
	    this.jInternalFrameImportacionTipoCambio.setClosable(true);
	    this.jInternalFrameImportacionTipoCambio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCambio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCambio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCambio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCambio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCambio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCambio.setResizable(true);
	    this.jInternalFrameImportacionTipoCambio.setClosable(true);
	    this.jInternalFrameImportacionTipoCambio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCambio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCambio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCambio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cambios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCambio = new JLabelMe();

		this.jLabelArchivoImportacionTipoCambio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCambio.add(this.jLabelArchivoImportacionTipoCambio, this.gridBagConstraintsTipoCambio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCambio = new JFileChooser();		
		this.jFileChooserImportacionTipoCambio.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCambio = new JButtonMe();
		this.jButtonAbrirImportacionTipoCambio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCambio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCambio.setToolTipText("Generar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCambio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCambio.add(this.jButtonAbrirImportacionTipoCambio, this.gridBagConstraintsTipoCambio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCambio = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCambio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCambio.add(this.jLabelPathArchivoImportacionTipoCambio, this.gridBagConstraintsTipoCambio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCambio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCambio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCambio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCambio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCambio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCambio.add(this.jTextFieldPathArchivoImportacionTipoCambio, this.gridBagConstraintsTipoCambio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCambio = new JButtonMe();
		this.jButtonGenerarImportacionTipoCambio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCambio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCambio.setToolTipText("Generar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCambio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCambio.add(this.jButtonGenerarImportacionTipoCambio, this.gridBagConstraintsTipoCambio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCambio = new JButtonMe();
		this.jButtonCerrarImportacionTipoCambio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCambio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCambio.setToolTipText("Cancelar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCambio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCambio.add(this.jButtonCerrarImportacionTipoCambio, this.gridBagConstraintsTipoCambio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCambio = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCambio= new JScrollPane(jPanelImportacionTipoCambio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCambio.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCambio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCambio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCambio);
		this.jInternalFrameImportacionTipoCambio.getContentPane().add(this.jScrollPanelImportacionTipoCambio, this.gridBagConstraintsTipoCambio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCambio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCambio = new JButtonMe();
			this.jButtonAbrirOrderByTipoCambio.setText("Orden");
			this.jButtonAbrirOrderByTipoCambio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCambio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCambio";
			inputMap = this.jButtonAbrirOrderByTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCambio"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCambio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCambio.setName("jPanelOrderByTipoCambio"); 
			
			this.jPanelOrderByTipoCambio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCambio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCambio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCambio.setLayout(gridaBagLayoutOrderByTipoCambio);
			
			
			this.jTableDatosTipoCambioOrderBy = new JTableMe();        
			this.jTableDatosTipoCambioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCambioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCambioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCambioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCambioOrderBy.setViewportView(this.jTableDatosTipoCambioOrderBy);
			this.jTableDatosTipoCambioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCambioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCambio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCambio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCambio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCambio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCambio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCambio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCambio.setTitle("Orden");
			this.jInternalFrameOrderByTipoCambio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCambio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCambio.setResizable(true);
			this.jInternalFrameOrderByTipoCambio.setClosable(true);
			this.jInternalFrameOrderByTipoCambio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCambio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCambio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCambio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cambios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCambio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCambio.ipady =150;
				
			this.jPanelOrderByTipoCambio.add(jScrollPanelDatosTipoCambioOrderBy, this.gridBagConstraintsTipoCambio);//this.jTableDatosTipoCambioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCambio = new JButtonMe();
			this.jButtonCerrarOrderByTipoCambio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCambio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCambio.setToolTipText("Cancelar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCambio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCambio.add(this.jButtonCerrarOrderByTipoCambio, this.gridBagConstraintsTipoCambio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCambio = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCambio= new JScrollPane(jPanelOrderByTipoCambio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCambio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCambio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCambio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCambio);
			
			this.jInternalFrameOrderByTipoCambio.getContentPane().add(this.jScrollPanelOrderByTipoCambio, this.gridBagConstraintsTipoCambio);			
		
		} else {
			this.jButtonAbrirOrderByTipoCambio = new JButtonMe();
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
			&& this.tipocambioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCambio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCambio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCambio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCambio.getRowHeight();//TipoCambioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCambioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCambio.isSelected()) {
					iHeightTable=TipoCambioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCambioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCambioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCambioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCambio.isSelected()) {
					iHeightTable=TipoCambioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCambioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCambioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCambio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCambio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCambio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCambio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCambio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCambio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCambio!=null && this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCambio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCambio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCambio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCambio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCambio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCambio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCambio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocambioLogic.getTipoCambios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocambios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCambio> TraerTipoCambioBeans(List<TipoCambio> tipocambios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCambio tipocambio:tipocambios) {
					
				if(!(TipoCambioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCambioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocambio.setsDetalleGeneralEntityReporte(TipoCambioConstantesFunciones.getTipoCambioDescripcion(tipocambio));
										
						
					
						
					
				} else  {
							
					//tipocambio.setsDetalleGeneralEntityReporte(tipocambio.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocambiobeans.add(tipocambiobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocambios;
    }
	//PARA REPORTES FIN
}
