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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.FacturasPuntoVentaConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class FacturasPuntoVentaJInternalFrame extends FacturasPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturasPuntoVenta;
	
	protected JMenuBar jmenuBarFacturasPuntoVenta;
	
	protected JMenu jmenuFacturasPuntoVenta;
	protected JMenu jmenuDatosFacturasPuntoVenta;
	protected JMenu jmenuArchivoFacturasPuntoVenta;
	protected JMenu jmenuAccionesFacturasPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsFacturasPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturasPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormFacturasPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturasPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturasPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FacturasPuntoVentaSessionBean facturaspuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturasPuntoVenta> facturaspuntoventas;		
	public List<FacturasPuntoVenta> facturaspuntoventasEliminados;	
	public List<FacturasPuntoVenta> facturaspuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturasPuntoVenta;		
	protected JButton jButtonAbrirOrderByFacturasPuntoVenta;
	
	
	//protected JPanel jPanelOrderByFacturasPuntoVenta;
	//public JScrollPane jScrollPanelOrderByFacturasPuntoVenta;	
	//protected JButton jButtonCerrarOrderByFacturasPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturasPuntoVentaLogic facturaspuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturasPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionFacturasPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralFacturasPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturasPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturasPuntoVenta;
	//public JScrollPane jScrollPanelImportacionFacturasPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesFacturasPuntoVenta;
	
    protected JPanel jPanelPaginacionFacturasPuntoVenta;
    protected JPanel jPanelParametrosReportesFacturasPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesFacturasPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturasPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2FacturasPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3FacturasPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4FacturasPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5FacturasPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturasPuntoVenta;
	//protected JPanel jPanelImportacionFacturasPuntoVenta;
	
	
	public JTable jTableDatosFacturasPuntoVenta;
	
	
	
	//public JTable jTableDatosFacturasPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturasPuntoVenta;
	protected JButton jButtonDuplicarFacturasPuntoVenta;
	protected JButton jButtonCopiarFacturasPuntoVenta;
	protected JButton jButtonVerFormFacturasPuntoVenta;
	protected JButton jButtonNuevoRelacionesFacturasPuntoVenta;
	protected JButton jButtonModificarFacturasPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaFacturasPuntoVenta;
	protected JButton jButtonCerrarFacturasPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionFacturasPuntoVenta;
	protected JButton jButtonProcesarInformacionFacturasPuntoVenta;
	
	
	protected JButton jButtonAnterioresFacturasPuntoVenta;
	protected JButton jButtonSiguientesFacturasPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosFacturasPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturasPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoFacturasPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturasPuntoVenta;
	//protected JButton jButtonGenerarImportacionFacturasPuntoVenta;
	//protected JButton jButtonCerrarImportacionFacturasPuntoVenta;
	//protected JFileChooser jFileChooserImportacionFacturasPuntoVenta;
	//protected File fileImportacionFacturasPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasPuntoVenta;
	protected JButton jButtonDuplicarToolBarFacturasPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarFacturasPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturasPuntoVenta;
	protected JButton jButtonCopiarToolBarFacturasPuntoVenta;
	protected JButton jButtonVerFormToolBarFacturasPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasPuntoVenta;
	protected JButton jButtonCerrarToolBarFacturasPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarFacturasPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarFacturasPuntoVenta;
	protected JButton jButtonAnterioresToolBarFacturasPuntoVenta;
	protected JButton jButtonSiguientesToolBarFacturasPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturasPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarFacturasPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasPuntoVenta;
	protected JMenuItem jMenuItemDuplicarFacturasPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesFacturasPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturasPuntoVenta;
	protected JMenuItem jMenuItemCopiarFacturasPuntoVenta;
	protected JMenuItem jMenuItemVerFormFacturasPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasPuntoVenta;
	protected JMenuItem jMenuItemCerrarFacturasPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarFacturasPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturasPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturasPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionFacturasPuntoVenta;
	protected JMenuItem jMenuItemAnterioresFacturasPuntoVenta;
	protected JMenuItem jMenuItemSiguientesFacturasPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByFacturasPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarFacturasPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturasPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosFacturasPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturasPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturasPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturasPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralFacturasPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturasPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteFacturasPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteFacturasPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteFacturasPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteFacturasPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteFacturasPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturasPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturasPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionFacturasPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionFacturasPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionFacturasPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturasPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorFacturasPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturasPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoFacturasPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoFacturasPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoFacturasPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturasPuntoVenta;
	public JPanel jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	public JButton jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	
	public JPanel jPanelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	public JLabel jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta;

	public JDateChooser jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	public JButton jButtonfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	public JLabel jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta;

	public JDateChooser jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta;
	public JButton jButtonfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturasPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturasPuntoVenta)	{
		this.jButtonRecargarInformacionFacturasPuntoVenta = jButtonRecargarInformacionFacturasPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionFacturasPuntoVenta() {
		return this.jButtonProcesarInformacionFacturasPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasPuntoVenta)	{
		this.jButtonProcesarInformacionFacturasPuntoVenta = jButtonProcesarInformacionFacturasPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturasPuntoVenta() {
		return this.jButtonRecargarInformacionFacturasPuntoVenta;
	}
	
	
	public List<FacturasPuntoVenta> getfacturaspuntoventas() {
		return this.facturaspuntoventas;
	}

	public void setfacturaspuntoventas(List<FacturasPuntoVenta> facturaspuntoventas) {
		this.facturaspuntoventas = facturaspuntoventas;
	}
	
	public List<FacturasPuntoVenta> getfacturaspuntoventasAux() {
		return this.facturaspuntoventasAux;
	}

	public void setfacturaspuntoventasAux(List<FacturasPuntoVenta> facturaspuntoventasAux) {
		this.facturaspuntoventasAux = facturaspuntoventasAux;
	}
	
	public List<FacturasPuntoVenta> getfacturaspuntoventasEliminados() {
		return this.facturaspuntoventasEliminados;
	}

	public void setFacturasPuntoVentasEliminados(List<FacturasPuntoVenta> facturaspuntoventasEliminados) {
		this.facturaspuntoventasEliminados = facturaspuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturasPuntoVenta() {
		return jComboBoxTiposSeleccionarFacturasPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturasPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarFacturasPuntoVenta) {
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta = jComboBoxTiposSeleccionarFacturasPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturasPuntoVenta() {
		return jTextFieldValorCampoGeneralFacturasPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralFacturasPuntoVenta(
			JTextField jTextFieldValorCampoGeneralFacturasPuntoVenta) {
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta = jTextFieldValorCampoGeneralFacturasPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturasPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosFacturasPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosFacturasPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosFacturasPuntoVenta) {
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta = jCheckBoxSeleccionarTodosFacturasPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturasPuntoVenta() {
		return this.jCheckBoxSeleccionadosFacturasPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosFacturasPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosFacturasPuntoVenta) {
		this.jCheckBoxSeleccionadosFacturasPuntoVenta = jCheckBoxSeleccionadosFacturasPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturasPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesFacturasPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturasPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesFacturasPuntoVenta) {
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta = jComboBoxTiposArchivosReportesFacturasPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturasPuntoVenta() {
		return this.jComboBoxTiposReportesFacturasPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturasPuntoVenta(
			JComboBox jComboBoxTiposReportesFacturasPuntoVenta) {
		this.jComboBoxTiposReportesFacturasPuntoVenta = jComboBoxTiposReportesFacturasPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturasPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoFacturasPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturasPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturasPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta = jComboBoxTiposReportesDinamicoFacturasPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta = jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturasPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesFacturasPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturasPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesFacturasPuntoVenta) {
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta = jComboBoxTiposGraficosReportesFacturasPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturasPuntoVenta() {
		return this.jComboBoxTiposPaginacionFacturasPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturasPuntoVenta(
			JComboBox jComboBoxTiposPaginacionFacturasPuntoVenta) {
		this.jComboBoxTiposPaginacionFacturasPuntoVenta = jComboBoxTiposPaginacionFacturasPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturasPuntoVenta() {
		return this.jComboBoxTiposRelacionesFacturasPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasPuntoVenta() {
		return this.jComboBoxTiposAccionesFacturasPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasPuntoVenta(
			JComboBox jComboBoxTiposRelacionesFacturasPuntoVenta) {
		this.jComboBoxTiposRelacionesFacturasPuntoVenta = jComboBoxTiposRelacionesFacturasPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasPuntoVenta(
			JComboBox jComboBoxTiposAccionesFacturasPuntoVenta) {
		this.jComboBoxTiposAccionesFacturasPuntoVenta = jComboBoxTiposAccionesFacturasPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturasPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturasPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturasPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoFacturasPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturasPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturasPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta = jCheckBoxConGraficoDinamicoFacturasPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturasPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturasPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta .setBorder(borderResaltar);		
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
		this.facturaspuntoventaSessionBean=new FacturasPuntoVentaSessionBean();
		
		this.facturaspuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaspuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaspuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturasPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturasPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturasPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturasPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturasPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"copiar","copiar","Copiar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"ver_form","ver_form","Ver"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"recargar","recargar","Buscar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturasPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturasPuntoVenta,this.jTtoolBarFacturasPuntoVenta,
							"cerrar","cerrar","Salir"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturasPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturasPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarFacturasPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturasPuntoVenta;
				
		//protected JButton jButtonModificarToolBarFacturasPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturasPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturasPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoFacturasPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesFacturasPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosFacturasPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturasPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturasPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturasPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturasPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturasPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturasPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturasPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturasPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturasPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturasPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturasPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturasPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturasPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturasPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturasPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturasPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturasPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturasPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturasPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturasPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturasPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturasPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturasPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturasPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturasPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturasPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturasPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturasPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturasPuntoVenta.add(this.jMenuItemCerrarFacturasPuntoVenta);
			
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemNuevoFacturasPuntoVenta);
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosFacturasPuntoVenta);
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemNuevoRelacionesFacturasPuntoVenta);
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemGuardarCambiosTablaFacturasPuntoVenta);		
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemDuplicarFacturasPuntoVenta);		
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemCopiarFacturasPuntoVenta);		
			this.jmenuAccionesFacturasPuntoVenta.add(this.jMenuItemVerFormFacturasPuntoVenta);		
			
			this.jmenuDatosFacturasPuntoVenta.add(this.jMenuItemRecargarInformacionFacturasPuntoVenta);				
			this.jmenuDatosFacturasPuntoVenta.add(this.jMenuItemAnterioresFacturasPuntoVenta);				
			this.jmenuDatosFacturasPuntoVenta.add(this.jMenuItemSiguientesFacturasPuntoVenta);				
			this.jmenuDatosFacturasPuntoVenta.add(this.jMenuItemAbrirOrderByFacturasPuntoVenta);				
			this.jmenuDatosFacturasPuntoVenta.add(this.jMenuItemMostrarOcultarFacturasPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturasPuntoVenta.add(this.jMenuItemGuardarCambiosFacturasPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturasPuntoVenta.add(this.jmenuArchivoFacturasPuntoVenta);		
			this.jmenuBarFacturasPuntoVenta.add(this.jmenuAccionesFacturasPuntoVenta);		
			this.jmenuBarFacturasPuntoVenta.add(this.jmenuDatosFacturasPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturasPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturasPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta= new JButtonMe();
		this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta.setText("Buscar");
		this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta,"buscar_button","Buscar Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta = new JLabelMe();
		jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta= new JDateChooser();
		jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setDate(new Date());
		jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta = new JLabelMe();
		jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta= new JDateChooser();
		jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setDate(new Date());
		jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasFacturasPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturasPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturasPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturasPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturasPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturasPuntoVenta = new FacturasPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Facturas Punto Venta DATOS");
			this.jInternalFrameDetalleFormFacturasPuntoVenta = new FacturasPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.facturaspuntoventaSessionBean.getConGuardarRelaciones(),this.facturaspuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturasPuntoVenta = null;//new FacturasPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosFacturasPuntoVenta = new JTableMe();      
		
		String sToolTipFacturasPuntoVenta="";
		sToolTipFacturasPuntoVenta=FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasPuntoVenta+="(Sris.FacturasPuntoVenta)";
		}
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturasPuntoVenta.setToolTipText(sToolTipFacturasPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturasPuntoVenta);
		this.jTableDatosFacturasPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosFacturasPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturasPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosFacturasPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturasPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturasPuntoVenta = new JButtonMe();
		this.jButtonDuplicarFacturasPuntoVenta = new JButtonMe();
		this.jButtonCopiarFacturasPuntoVenta = new JButtonMe();
		this.jButtonVerFormFacturasPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesFacturasPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta = new JButtonMe();
		this.jButtonCerrarFacturasPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosFacturasPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturasPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Punto Venta";
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFacturasPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturasPuntoVenta=new ReporteDinamicoJInternalFrame(FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturasPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturasPuntoVenta=new ImportacionJInternalFrame(FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturasPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturasPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturasPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByFacturasPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasPuntoVenta,false,this);
			
			//this.cargarOrderByFacturasPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasPuntoVenta,true,this);
			
			//this.cargarOrderByFacturasPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturasPuntoVenta.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosFacturasPuntoVenta.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosFacturasPuntoVenta.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosFacturasPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturasPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarFacturasPuntoVenta.setText("Duplicar");
		this.jButtonCopiarFacturasPuntoVenta.setText("Copiar");
		this.jButtonVerFormFacturasPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesFacturasPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.setText("Guardar");
		this.jButtonCerrarFacturasPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasPuntoVenta,"nuevo_button","Nuevo",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturasPuntoVenta,"duplicar_button","Duplicar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturasPuntoVenta,"copiar_button","Copiar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturasPuntoVenta,"ver_form","Ver",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturasPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasPuntoVenta,"guardarcambiostabla_button","Guardar",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasPuntoVenta,"cerrar_button","Salir",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturasPuntoVenta.setToolTipText("Nuevo"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturasPuntoVenta.setToolTipText("Duplicar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturasPuntoVenta.setToolTipText("Copiar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturasPuntoVenta.setToolTipText("Ver"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturasPuntoVenta.setToolTipText("Nuevo Rel"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.setToolTipText("Guardar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasPuntoVenta.setToolTipText("Salir"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasPuntoVenta";
		inputMap = this.jButtonNuevoFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturasPuntoVenta";
		inputMap = this.jButtonDuplicarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturasPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturasPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarFacturasPuntoVenta";
		inputMap = this.jButtonCopiarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturasPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturasPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormFacturasPuntoVenta";
		inputMap = this.jButtonVerFormFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturasPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturasPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturasPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturasPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturasPuntoVenta";
		inputMap = this.jButtonModificarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturasPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturasPuntoVenta";
		inputMap = this.jButtonCerrarFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturasPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturasPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturasPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturasPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturasPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturasPuntoVenta.setName("jPanelParametrosReportesFacturasPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturasPuntoVenta.setName("jPanelParametrosReportesAccionesFacturasPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturasPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionFacturasPuntoVenta.setText("Buscar");
		this.jButtonRecargarInformacionFacturasPuntoVenta.setToolTipText("Buscar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturasPuntoVenta,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionFacturasPuntoVenta.setVisible(false);
		
		
		this.jButtonProcesarInformacionFacturasPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionFacturasPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionFacturasPuntoVenta.setToolTipText("Procesar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturasPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionFacturasPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesFacturasPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturasPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturasPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturasPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesFacturasPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturasPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturasPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesFacturasPuntoVenta.setText("Acciones");		
		this.jLabelAccionesFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturasPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturasPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturasPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturasPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturasPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturasPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturasPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresFacturasPuntoVenta.setText("<<");
        this.jButtonAnterioresFacturasPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturasPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturasPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesFacturasPuntoVenta.setText(">>");
        this.jButtonSiguientesFacturasPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturasPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturasPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturasPuntoVenta,"nuevoguardarcambios_button","Nue",this.facturaspuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturasPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturasPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturasPuntoVenta";
		inputMap = this.jButtonRecargarInformacionFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturasPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturasPuntoVenta";
		inputMap = this.jButtonSiguientesFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturasPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturasPuntoVenta";
		inputMap = this.jButtonAnterioresFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturasPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturasPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturasPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),FacturasPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),FacturasPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),FacturasPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturasPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionFacturasPuntoVenta.setLayout(gridaBagLayoutPaginacionFacturasPuntoVenta);						
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonAnterioresFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
					
						
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonNuevoGuardarCambiosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
						
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonSiguientesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 1;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonNuevoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
						
			
			
			if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturasPuntoVenta.gridy = 1;
				this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonGuardarCambiosTablaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 1;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonDuplicarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 1;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonCopiarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 1;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonVerFormFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 1;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturasPuntoVenta.add(this.jButtonCerrarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionFacturasPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturasPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturasPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturasPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturasPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturasPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturasPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturasPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturasPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturasPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturasPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturasPuntoVenta.setLayout(gridaBagParametrosReportesFacturasPuntoVenta);
			this.jPanelParametrosReportesAccionesFacturasPuntoVenta.setLayout(gridaBagParametrosReportesAccionesFacturasPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1FacturasPuntoVenta.setLayout(gridaBagParametrosAuxiliar1FacturasPuntoVenta);
			this.jPanelParametrosAuxiliar2FacturasPuntoVenta.setLayout(gridaBagParametrosAuxiliar2FacturasPuntoVenta);
			this.jPanelParametrosAuxiliar3FacturasPuntoVenta.setLayout(gridaBagParametrosAuxiliar3FacturasPuntoVenta);
			this.jPanelParametrosAuxiliar4FacturasPuntoVenta.setLayout(gridaBagParametrosAuxiliar4FacturasPuntoVenta);
			//this.jPanelParametrosAuxiliar5FacturasPuntoVenta.setLayout(gridaBagParametrosAuxiliar2FacturasPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jButtonRecargarInformacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasPuntoVenta.add(this.jComboBoxTiposPaginacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasPuntoVenta.add(this.jComboBoxTiposArchivosReportesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jPanelParametrosAuxiliar1FacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturasPuntoVenta.add(this.jComboBoxTiposReportesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);																		
			
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturasPuntoVenta.add(this.jComboBoxTiposGraficosReportesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jPanelParametrosAuxiliar4FacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jComboBoxTiposReportesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jCheckBoxGenerarReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jPanelParametrosAuxiliar2FacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jLabelAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jButtonAbrirOrderByFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jComboBoxTiposSeleccionarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jCheckBoxSeleccionarTodosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jCheckBoxConGraficoReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasPuntoVenta.add(this.jCheckBoxSeleccionarTodosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);															
				
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasPuntoVenta.add(this.jCheckBoxSeleccionadosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);															
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasPuntoVenta.add(this.jCheckBoxConGraficoReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jPanelParametrosAuxiliar3FacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasPuntoVenta.add(this.jComboBoxTiposAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturasPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosFacturasPuntoVenta.setLayout(gridaBagLayoutDatosFacturasPuntoVenta);
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosFacturasPuntoVenta.add(this.jTableDatosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturasPuntoVenta.setViewportView(this.jTableDatosFacturasPuntoVenta);
		this.jTableDatosFacturasPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosFacturasPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturasPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFacturasPuntoVenta.setLayout(gridaBagLayoutAccionesFacturasPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
			
		this.jPanelAccionesFacturasPuntoVenta.add(this.jButtonNuevoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaFacturasPuntoVentaFacturasPuntoVenta= new GridBagLayout();
		gridaBagLayoutBusquedaFacturasPuntoVentaFacturasPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaFacturasPuntoVentaFacturasPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaFacturasPuntoVentaFacturasPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaFacturasPuntoVentaFacturasPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.setLayout(gridaBagLayoutBusquedaFacturasPuntoVentaFacturasPuntoVenta);

		gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		gridBagConstraintsFacturasPuntoVenta.gridx = 0;
		jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.add(jLabelfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);

		gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasPuntoVenta.gridy = 0;
		gridBagConstraintsFacturasPuntoVenta.gridx = 1;
		jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.add(jDateChooserfecha_desdeBusquedaFacturasPuntoVentaFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);


		gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasPuntoVenta.gridy = 1;
		gridBagConstraintsFacturasPuntoVenta.gridx = 0;
		jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.add(jLabelfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);

		gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasPuntoVenta.gridy = 1;
		gridBagConstraintsFacturasPuntoVenta.gridx = 1;
		jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.add(jDateChooserfecha_hastaBusquedaFacturasPuntoVentaFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);

		gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasPuntoVenta.gridy = 2;
		gridBagConstraintsFacturasPuntoVenta.gridx =1;
		jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta.add(jButtonBusquedaFacturasPuntoVentaFacturasPuntoVenta, gridBagConstraintsFacturasPuntoVenta);

		jTabbedPaneBusquedasFacturasPuntoVenta.addTab("1.-Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaFacturasPuntoVentaFacturasPuntoVenta);
		jTabbedPaneBusquedasFacturasPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsFacturasPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsFacturasPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturasPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturasPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;		
			this.gridBagConstraintsFacturasPuntoVenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturasPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		*/		
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasPuntoVenta.gridx =0;
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
				
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturasPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturasPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturasPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosFacturasPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturasPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
			
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturasPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturasPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturasPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturasPuntoVenta.setName("jPanelReporteDinamicoFacturasPuntoVenta"); 
		
		this.jPanelReporteDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturasPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoFacturasPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturasPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturasPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturasPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelColumnasSelectReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturasPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturasPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturasPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturasPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturasPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteFacturasPuntoVenta);
			
			this.jScrollColumnasSelectReporteFacturasPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jListColumnasSelectReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jScrollColumnasSelectReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturasPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturasPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturasPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturasPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturasPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturasPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturasPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteFacturasPuntoVenta);
			
			this.jScrollRelacionesSelectReporteFacturasPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturasPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturasPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturasPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelConGraficoDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jCheckBoxConGraficoDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturasPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturasPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelColumnaCategoriaGraficoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturasPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturasPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelColumnaCategoriaValorFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jComboBoxColumnaCategoriaValorFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturasPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturasPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelColumnasValoresGraficoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturasPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturasPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturasPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturasPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturasPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoFacturasPuntoVenta);
			
			this.jScrollColumnasValoresGraficoFacturasPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jListColumnasSelectReporteFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jScrollColumnasValoresGraficoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta.setToolTipText("Generar EXCEL"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jComboBoxTiposReportesDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturasPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturasPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturasPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturasPuntoVenta.setToolTipText("Generar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jButtonGenerarReporteDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturasPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturasPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturasPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturasPuntoVenta.setToolTipText("Cancelar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasPuntoVenta.add(this.jButtonCerrarReporteDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturasPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturasPuntoVenta= new JScrollPane(jPanelReporteDinamicoFacturasPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturasPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturasPuntoVenta);
		this.jInternalFrameReporteDinamicoFacturasPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturasPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturasPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturasPuntoVenta.setName("jPanelImportacionFacturasPuntoVenta"); 
		
		this.jPanelImportacionFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturasPuntoVenta.setLayout(gridaBagLayoutImportacionFacturasPuntoVenta);
		
		
		this.jInternalFrameImportacionFacturasPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturasPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturasPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturasPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturasPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionFacturasPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionFacturasPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturasPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturasPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionFacturasPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionFacturasPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturasPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionFacturasPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasPuntoVenta.add(this.jLabelArchivoImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturasPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionFacturasPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturasPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionFacturasPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturasPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturasPuntoVenta.setToolTipText("Generar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasPuntoVenta.add(this.jButtonAbrirImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturasPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturasPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturasPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasPuntoVenta.add(this.jLabelPathArchivoImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturasPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturasPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasPuntoVenta.add(this.jTextFieldPathArchivoImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturasPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionFacturasPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturasPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturasPuntoVenta.setToolTipText("Generar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasPuntoVenta.add(this.jButtonGenerarImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturasPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionFacturasPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturasPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturasPuntoVenta.setToolTipText("Cancelar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasPuntoVenta.add(this.jButtonCerrarImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturasPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturasPuntoVenta= new JScrollPane(jPanelImportacionFacturasPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturasPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturasPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturasPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturasPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturasPuntoVenta);
		this.jInternalFrameImportacionFacturasPuntoVenta.getContentPane().add(this.jScrollPanelImportacionFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturasPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturasPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByFacturasPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByFacturasPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturasPuntoVenta";
			inputMap = this.jButtonAbrirOrderByFacturasPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturasPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturasPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturasPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturasPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturasPuntoVenta.setName("jPanelOrderByFacturasPuntoVenta"); 
			
			this.jPanelOrderByFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturasPuntoVenta.setLayout(gridaBagLayoutOrderByFacturasPuntoVenta);
			
			
			this.jTableDatosFacturasPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosFacturasPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturasPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturasPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturasPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturasPuntoVentaOrderBy.setViewportView(this.jTableDatosFacturasPuntoVentaOrderBy);
			this.jTableDatosFacturasPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturasPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturasPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturasPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturasPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturasPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturasPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturasPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturasPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByFacturasPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturasPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturasPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByFacturasPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByFacturasPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturasPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturasPuntoVenta.ipady =150;
				
			this.jPanelOrderByFacturasPuntoVenta.add(jScrollPanelDatosFacturasPuntoVentaOrderBy, this.gridBagConstraintsFacturasPuntoVenta);//this.jTableDatosFacturasPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturasPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByFacturasPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturasPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturasPuntoVenta.setToolTipText("Cancelar"+" "+FacturasPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturasPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturasPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturasPuntoVenta.add(this.jButtonCerrarOrderByFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturasPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturasPuntoVenta= new JScrollPane(jPanelOrderByFacturasPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturasPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturasPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturasPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturasPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturasPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturasPuntoVenta);
			
			this.jInternalFrameOrderByFacturasPuntoVenta.getContentPane().add(this.jScrollPanelOrderByFacturasPuntoVenta, this.gridBagConstraintsFacturasPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByFacturasPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.facturaspuntoventaSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturasPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosFacturasPuntoVenta.getRowHeight();//FacturasPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.isSelected()) {
					iHeightTable=FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasPuntoVenta.isSelected()) {
					iHeightTable=FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturasPuntoVenta!=null && this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.facturaspuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturasPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturasPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturasPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturasPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturasPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=facturaspuntoventaLogic.getFacturasPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaspuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturasPuntoVenta> TraerFacturasPuntoVentaBeans(List<FacturasPuntoVenta> facturaspuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturasPuntoVenta facturaspuntoventa:facturaspuntoventas) {
					
				if(!(FacturasPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturasPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturaspuntoventa.setsDetalleGeneralEntityReporte(FacturasPuntoVentaConstantesFunciones.getFacturasPuntoVentaDescripcion(facturaspuntoventa));
										
						
					
						
					
				} else  {
							
					//facturaspuntoventa.setsDetalleGeneralEntityReporte(facturaspuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturaspuntoventabeans.add(facturaspuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturaspuntoventas;
    }
	//PARA REPORTES FIN
}
