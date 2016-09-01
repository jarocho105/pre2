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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoFacturaPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoFacturaPuntoVentaJInternalFrame extends TipoFacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarTipoFacturaPuntoVenta;
	
	protected JMenu jmenuTipoFacturaPuntoVenta;
	protected JMenu jmenuDatosTipoFacturaPuntoVenta;
	protected JMenu jmenuArchivoTipoFacturaPuntoVenta;
	protected JMenu jmenuAccionesTipoFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsTipoFacturaPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFacturaPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFacturaPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFacturaPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFacturaPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFacturaPuntoVenta> tipofacturapuntoventas;		
	public List<TipoFacturaPuntoVenta> tipofacturapuntoventasEliminados;	
	public List<TipoFacturaPuntoVenta> tipofacturapuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFacturaPuntoVenta;		
	protected JButton jButtonAbrirOrderByTipoFacturaPuntoVenta;
	
	
	//protected JPanel jPanelOrderByTipoFacturaPuntoVenta;
	//public JScrollPane jScrollPanelOrderByTipoFacturaPuntoVenta;	
	//protected JButton jButtonCerrarOrderByTipoFacturaPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFacturaPuntoVentaLogic tipofacturapuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionTipoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralTipoFacturaPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFacturaPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFacturaPuntoVenta;
	//public JScrollPane jScrollPanelImportacionTipoFacturaPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesTipoFacturaPuntoVenta;
	
    protected JPanel jPanelPaginacionTipoFacturaPuntoVenta;
    protected JPanel jPanelParametrosReportesTipoFacturaPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesTipoFacturaPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2TipoFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3TipoFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4TipoFacturaPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5TipoFacturaPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFacturaPuntoVenta;
	//protected JPanel jPanelImportacionTipoFacturaPuntoVenta;
	
	
	public JTable jTableDatosTipoFacturaPuntoVenta;
	
	
	
	//public JTable jTableDatosTipoFacturaPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFacturaPuntoVenta;
	protected JButton jButtonDuplicarTipoFacturaPuntoVenta;
	protected JButton jButtonCopiarTipoFacturaPuntoVenta;
	protected JButton jButtonVerFormTipoFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesTipoFacturaPuntoVenta;
	protected JButton jButtonModificarTipoFacturaPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaTipoFacturaPuntoVenta;
	protected JButton jButtonCerrarTipoFacturaPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionTipoFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionTipoFacturaPuntoVenta;
	
	
	protected JButton jButtonAnterioresTipoFacturaPuntoVenta;
	protected JButton jButtonSiguientesTipoFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFacturaPuntoVenta;
	//protected JButton jButtonGenerarImportacionTipoFacturaPuntoVenta;
	//protected JButton jButtonCerrarImportacionTipoFacturaPuntoVenta;
	//protected JFileChooser jFileChooserImportacionTipoFacturaPuntoVenta;
	//protected File fileImportacionTipoFacturaPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonDuplicarToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonCopiarToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonVerFormToolBarTipoFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarTipoFacturaPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonAnterioresToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonSiguientesToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFacturaPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarTipoFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDuplicarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFacturaPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCopiarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemVerFormTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemAnterioresTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemSiguientesTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByTipoFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarTipoFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFacturaPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosTipoFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFacturaPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralTipoFacturaPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteTipoFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteTipoFacturaPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFacturaPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFacturaPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFacturaPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFacturaPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionTipoFacturaPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionTipoFacturaPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFacturaPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFacturaPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFacturaPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFacturaPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFacturaPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoFacturaPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFacturaPuntoVenta)	{
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta = jButtonRecargarInformacionTipoFacturaPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionTipoFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionTipoFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta = jButtonProcesarInformacionTipoFacturaPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFacturaPuntoVenta() {
		return this.jButtonRecargarInformacionTipoFacturaPuntoVenta;
	}
	
	
	public List<TipoFacturaPuntoVenta> gettipofacturapuntoventas() {
		return this.tipofacturapuntoventas;
	}

	public void settipofacturapuntoventas(List<TipoFacturaPuntoVenta> tipofacturapuntoventas) {
		this.tipofacturapuntoventas = tipofacturapuntoventas;
	}
	
	public List<TipoFacturaPuntoVenta> gettipofacturapuntoventasAux() {
		return this.tipofacturapuntoventasAux;
	}

	public void settipofacturapuntoventasAux(List<TipoFacturaPuntoVenta> tipofacturapuntoventasAux) {
		this.tipofacturapuntoventasAux = tipofacturapuntoventasAux;
	}
	
	public List<TipoFacturaPuntoVenta> gettipofacturapuntoventasEliminados() {
		return this.tipofacturapuntoventasEliminados;
	}

	public void setTipoFacturaPuntoVentasEliminados(List<TipoFacturaPuntoVenta> tipofacturapuntoventasEliminados) {
		this.tipofacturapuntoventasEliminados = tipofacturapuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFacturaPuntoVenta() {
		return jComboBoxTiposSeleccionarTipoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarTipoFacturaPuntoVenta) {
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta = jComboBoxTiposSeleccionarTipoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFacturaPuntoVenta() {
		return jTextFieldValorCampoGeneralTipoFacturaPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralTipoFacturaPuntoVenta(
			JTextField jTextFieldValorCampoGeneralTipoFacturaPuntoVenta) {
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta = jTextFieldValorCampoGeneralTipoFacturaPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosTipoFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta) {
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta = jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosTipoFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosTipoFacturaPuntoVenta) {
		this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta = jCheckBoxSeleccionadosTipoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta = jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposReportesTipoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposReportesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta = jComboBoxTiposReportesTipoFacturaPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta = jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta = jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta = jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposPaginacionTipoFacturaPuntoVenta) {
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta = jComboBoxTiposPaginacionTipoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesTipoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta = jComboBoxTiposRelacionesTipoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesTipoFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta = jComboBoxTiposAccionesTipoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta = jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFacturaPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFacturaPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta .setBorder(borderResaltar);		
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
		this.tipofacturapuntoventaSessionBean=new TipoFacturaPuntoVentaSessionBean();
		
		this.tipofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Factura Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFacturaPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"copiar","copiar","Copiar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"ver_form","ver_form","Ver"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"recargar","recargar","Recargar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFacturaPuntoVenta,this.jTtoolBarTipoFacturaPuntoVenta,
							"cerrar","cerrar","Salir"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFacturaPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarTipoFacturaPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFacturaPuntoVenta;
				
		//protected JButton jButtonModificarToolBarTipoFacturaPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFacturaPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFacturaPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoTipoFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosTipoFacturaPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFacturaPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFacturaPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFacturaPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFacturaPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFacturaPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFacturaPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFacturaPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFacturaPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFacturaPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFacturaPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFacturaPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFacturaPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFacturaPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFacturaPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFacturaPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFacturaPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFacturaPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFacturaPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFacturaPuntoVenta.add(this.jMenuItemCerrarTipoFacturaPuntoVenta);
			
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemNuevoTipoFacturaPuntoVenta);
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosTipoFacturaPuntoVenta);
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemNuevoRelacionesTipoFacturaPuntoVenta);
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosTablaTipoFacturaPuntoVenta);		
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemDuplicarTipoFacturaPuntoVenta);		
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemCopiarTipoFacturaPuntoVenta);		
			this.jmenuAccionesTipoFacturaPuntoVenta.add(this.jMenuItemVerFormTipoFacturaPuntoVenta);		
			
			this.jmenuDatosTipoFacturaPuntoVenta.add(this.jMenuItemRecargarInformacionTipoFacturaPuntoVenta);				
			this.jmenuDatosTipoFacturaPuntoVenta.add(this.jMenuItemAnterioresTipoFacturaPuntoVenta);				
			this.jmenuDatosTipoFacturaPuntoVenta.add(this.jMenuItemSiguientesTipoFacturaPuntoVenta);				
			this.jmenuDatosTipoFacturaPuntoVenta.add(this.jMenuItemAbrirOrderByTipoFacturaPuntoVenta);				
			this.jmenuDatosTipoFacturaPuntoVenta.add(this.jMenuItemMostrarOcultarTipoFacturaPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosTipoFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFacturaPuntoVenta.add(this.jmenuArchivoTipoFacturaPuntoVenta);		
			this.jmenuBarTipoFacturaPuntoVenta.add(this.jmenuAccionesTipoFacturaPuntoVenta);		
			this.jmenuBarTipoFacturaPuntoVenta.add(this.jmenuDatosTipoFacturaPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFacturaPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFacturaPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoFacturaPuntoVenta = new TipoFacturaPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Factura Punto Venta DATOS");
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta = new TipoFacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones(),this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFacturaPuntoVenta = null;//new TipoFacturaPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFacturaPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosTipoFacturaPuntoVenta = new JTableMe();      
		
		String sToolTipTipoFacturaPuntoVenta="";
		sToolTipTipoFacturaPuntoVenta=TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFacturaPuntoVenta+="(PuntoVenta.TipoFacturaPuntoVenta)";
		}
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFacturaPuntoVenta.setToolTipText(sToolTipTipoFacturaPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFacturaPuntoVenta);
		this.jTableDatosTipoFacturaPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFacturaPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosTipoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonDuplicarTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCopiarTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonVerFormTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarTipoFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosTipoFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Factura Punto Venta";
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Factura Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesTipoFacturaPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFacturaPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFacturaPuntoVenta=new ImportacionJInternalFrame(TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFacturaPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFacturaPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFacturaPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByTipoFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFacturaPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFacturaPuntoVenta,false,this);
			
			//this.cargarOrderByTipoFacturaPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFacturaPuntoVenta,true,this);
			
			//this.cargarOrderByTipoFacturaPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFacturaPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarTipoFacturaPuntoVenta.setText("Duplicar");
		this.jButtonCopiarTipoFacturaPuntoVenta.setText("Copiar");
		this.jButtonVerFormTipoFacturaPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarTipoFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFacturaPuntoVenta,"nuevo_button","Nuevo",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFacturaPuntoVenta,"duplicar_button","Duplicar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFacturaPuntoVenta,"copiar_button","Copiar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFacturaPuntoVenta,"ver_form","Ver",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFacturaPuntoVenta,"cerrar_button","Salir",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFacturaPuntoVenta.setToolTipText("Nuevo"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFacturaPuntoVenta.setToolTipText("Duplicar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFacturaPuntoVenta.setToolTipText("Copiar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFacturaPuntoVenta.setToolTipText("Ver"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.setToolTipText("Nuevo Rel"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.setToolTipText("Guardar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFacturaPuntoVenta.setToolTipText("Salir"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFacturaPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFacturaPuntoVenta";
		inputMap = this.jButtonDuplicarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFacturaPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarTipoFacturaPuntoVenta";
		inputMap = this.jButtonCopiarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFacturaPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFacturaPuntoVenta";
		inputMap = this.jButtonVerFormTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFacturaPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFacturaPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFacturaPuntoVenta";
		inputMap = this.jButtonModificarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFacturaPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFacturaPuntoVenta";
		inputMap = this.jButtonCerrarTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFacturaPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFacturaPuntoVenta.setName("jPanelParametrosReportesTipoFacturaPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta.setName("jPanelParametrosReportesAccionesTipoFacturaPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.setToolTipText("Recargar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFacturaPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta.setToolTipText("Procesar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFacturaPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesTipoFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFacturaPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresTipoFacturaPuntoVenta.setText("<<");
        this.jButtonAnterioresTipoFacturaPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFacturaPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFacturaPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesTipoFacturaPuntoVenta.setText(">>");
        this.jButtonSiguientesTipoFacturaPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFacturaPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta,"nuevoguardarcambios_button","Nue",this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFacturaPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFacturaPuntoVenta";
		inputMap = this.jButtonRecargarInformacionTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFacturaPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFacturaPuntoVenta";
		inputMap = this.jButtonSiguientesTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFacturaPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFacturaPuntoVenta";
		inputMap = this.jButtonAnterioresTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFacturaPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFacturaPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),TipoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),TipoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),TipoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFacturaPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionTipoFacturaPuntoVenta.setLayout(gridaBagLayoutPaginacionTipoFacturaPuntoVenta);						
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonAnterioresTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
					
						
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonNuevoGuardarCambiosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
						
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonSiguientesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonNuevoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonNuevoRelacionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			}
			
			
			if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonGuardarCambiosTablaTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonDuplicarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonCopiarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonVerFormTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFacturaPuntoVenta.add(this.jButtonCerrarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFacturaPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFacturaPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.setLayout(gridaBagParametrosReportesTipoFacturaPuntoVenta);
			this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta.setLayout(gridaBagParametrosReportesAccionesTipoFacturaPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1TipoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar1TipoFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar2TipoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2TipoFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar3TipoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar3TipoFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar4TipoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar4TipoFacturaPuntoVenta);
			//this.jPanelParametrosAuxiliar5TipoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2TipoFacturaPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jButtonRecargarInformacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFacturaPuntoVenta.add(this.jComboBoxTiposPaginacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFacturaPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar1TipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFacturaPuntoVenta.add(this.jComboBoxTiposReportesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar4TipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jComboBoxTiposReportesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jCheckBoxGenerarReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar2TipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jLabelAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jButtonAbrirOrderByTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jComboBoxTiposSeleccionarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);															
				
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFacturaPuntoVenta.add(this.jCheckBoxSeleccionadosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar3TipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jComboBoxTiposRelacionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
				
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFacturaPuntoVenta.add(this.jComboBoxTiposAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFacturaPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosTipoFacturaPuntoVenta.setLayout(gridaBagLayoutDatosTipoFacturaPuntoVenta);
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosTipoFacturaPuntoVenta.add(this.jTableDatosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setViewportView(this.jTableDatosTipoFacturaPuntoVenta);
		this.jTableDatosTipoFacturaPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosTipoFacturaPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesTipoFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesTipoFacturaPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
			
		this.jPanelAccionesTipoFacturaPuntoVenta.add(this.jButtonNuevoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFacturaPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsTipoFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsTipoFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFacturaPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFacturaPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		*/		
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
				
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFacturaPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFacturaPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosTipoFacturaPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
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
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
			
			
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
			
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFacturaPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFacturaPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.setName("jPanelReporteDinamicoTipoFacturaPuntoVenta"); 
		
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoTipoFacturaPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Factura Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFacturaPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jLabelColumnasSelectReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFacturaPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteTipoFacturaPuntoVenta);
			
			this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jListColumnasSelectReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFacturaPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFacturaPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jLabelRelacionesSelectReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFacturaPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFacturaPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteTipoFacturaPuntoVenta);
			
			this.jScrollRelacionesSelectReporteTipoFacturaPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFacturaPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFacturaPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jListRelacionesSelectReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jScrollRelacionesSelectReporteTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoFacturaPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFacturaPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFacturaPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta.setToolTipText("Generar EXCEL"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jComboBoxTiposReportesDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta.setToolTipText("Generar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jButtonGenerarReporteDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFacturaPuntoVenta.add(this.jButtonCerrarReporteDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta= new JScrollPane(jPanelReporteDinamicoTipoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Factura Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFacturaPuntoVenta);
		this.jInternalFrameReporteDinamicoTipoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFacturaPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFacturaPuntoVenta.setName("jPanelImportacionTipoFacturaPuntoVenta"); 
		
		this.jPanelImportacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFacturaPuntoVenta.setLayout(gridaBagLayoutImportacionTipoFacturaPuntoVenta);
		
		
		this.jInternalFrameImportacionTipoFacturaPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFacturaPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionTipoFacturaPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Factura Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFacturaPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionTipoFacturaPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFacturaPuntoVenta.add(this.jLabelArchivoImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFacturaPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionTipoFacturaPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionTipoFacturaPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFacturaPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFacturaPuntoVenta.setToolTipText("Generar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFacturaPuntoVenta.add(this.jButtonAbrirImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFacturaPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFacturaPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFacturaPuntoVenta.add(this.jLabelPathArchivoImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFacturaPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFacturaPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFacturaPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFacturaPuntoVenta.add(this.jTextFieldPathArchivoImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionTipoFacturaPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFacturaPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFacturaPuntoVenta.setToolTipText("Generar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFacturaPuntoVenta.add(this.jButtonGenerarImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionTipoFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFacturaPuntoVenta.add(this.jButtonCerrarImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFacturaPuntoVenta= new JScrollPane(jPanelImportacionTipoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFacturaPuntoVenta);
		this.jInternalFrameImportacionTipoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelImportacionTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFacturaPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFacturaPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFacturaPuntoVenta";
			inputMap = this.jButtonAbrirOrderByTipoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFacturaPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFacturaPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFacturaPuntoVenta.setName("jPanelOrderByTipoFacturaPuntoVenta"); 
			
			this.jPanelOrderByTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFacturaPuntoVenta.setLayout(gridaBagLayoutOrderByTipoFacturaPuntoVenta);
			
			
			this.jTableDatosTipoFacturaPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosTipoFacturaPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFacturaPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFacturaPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFacturaPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFacturaPuntoVentaOrderBy.setViewportView(this.jTableDatosTipoFacturaPuntoVentaOrderBy);
			this.jTableDatosTipoFacturaPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFacturaPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFacturaPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFacturaPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Factura Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFacturaPuntoVenta.ipady =150;
				
			this.jPanelOrderByTipoFacturaPuntoVenta.add(jScrollPanelDatosTipoFacturaPuntoVentaOrderBy, this.gridBagConstraintsTipoFacturaPuntoVenta);//this.jTableDatosTipoFacturaPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFacturaPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByTipoFacturaPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFacturaPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+TipoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFacturaPuntoVenta.add(this.jButtonCerrarOrderByTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFacturaPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFacturaPuntoVenta= new JScrollPane(jPanelOrderByTipoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFacturaPuntoVenta);
			
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelOrderByTipoFacturaPuntoVenta, this.gridBagConstraintsTipoFacturaPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByTipoFacturaPuntoVenta = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipofacturapuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFacturaPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFacturaPuntoVenta.getRowHeight();//TipoFacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.isSelected()) {
					iHeightTable=TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFacturaPuntoVenta.isSelected()) {
					iHeightTable=TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFacturaPuntoVenta!=null && this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.tipofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipofacturapuntoventaLogic.getTipoFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofacturapuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFacturaPuntoVenta> TraerTipoFacturaPuntoVentaBeans(List<TipoFacturaPuntoVenta> tipofacturapuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFacturaPuntoVenta tipofacturapuntoventa:tipofacturapuntoventas) {
					
				if(!(TipoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipofacturapuntoventa.setsDetalleGeneralEntityReporte(TipoFacturaPuntoVentaConstantesFunciones.getTipoFacturaPuntoVentaDescripcion(tipofacturapuntoventa));
										
						
					
					

					if(tipofacturapuntoventa.getFacturaPuntoVentas()!=null && Funciones.existeClass(classes,FacturaPuntoVenta.class)) {
						try{tipofacturapuntoventa.setfacturapuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FacturaPuntoVentaJInternalFrame.TraerFacturaPuntoVentaBeans(tipofacturapuntoventa.getFacturaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipofacturapuntoventa.getNotaCreditoPuntoVentas()!=null && Funciones.existeClass(classes,NotaCreditoPuntoVenta.class)) {
						try{tipofacturapuntoventa.setnotacreditopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoPuntoVentaJInternalFrame.TraerNotaCreditoPuntoVentaBeans(tipofacturapuntoventa.getNotaCreditoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipofacturapuntoventa.setsDetalleGeneralEntityReporte(tipofacturapuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipofacturapuntoventabeans.add(tipofacturapuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipofacturapuntoventas;
    }
	//PARA REPORTES FIN
}
