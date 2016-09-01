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
import com.bydan.erp.facturacion.util.VisibleFacturaConstantesFunciones;

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
public class VisibleFacturaJInternalFrame extends VisibleFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVisibleFactura;
	
	protected JMenuBar jmenuBarVisibleFactura;
	
	protected JMenu jmenuVisibleFactura;
	protected JMenu jmenuDatosVisibleFactura;
	protected JMenu jmenuArchivoVisibleFactura;
	protected JMenu jmenuAccionesVisibleFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVisibleFactura;	
	protected GridBagConstraints gridBagConstraintsVisibleFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VisibleFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormVisibleFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVisibleFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVisibleFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VisibleFacturaSessionBean visiblefacturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VisibleFactura> visiblefacturas;		
	public List<VisibleFactura> visiblefacturasEliminados;	
	public List<VisibleFactura> visiblefacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVisibleFactura;		
	protected JButton jButtonAbrirOrderByVisibleFactura;
	
	
	//protected JPanel jPanelOrderByVisibleFactura;
	//public JScrollPane jScrollPanelOrderByVisibleFactura;	
	//protected JButton jButtonCerrarOrderByVisibleFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VisibleFacturaLogic visiblefacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVisibleFactura;
	public JScrollPane jScrollPanelDatosEdicionVisibleFactura;
	public JScrollPane jScrollPanelDatosGeneralVisibleFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosVisibleFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVisibleFactura;
	//public JScrollPane jScrollPanelImportacionVisibleFactura;
	
	
	
	protected JPanel jPanelAccionesVisibleFactura;
	
    protected JPanel jPanelPaginacionVisibleFactura;
    protected JPanel jPanelParametrosReportesVisibleFactura;
	protected JPanel jPanelParametrosReportesAccionesVisibleFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VisibleFactura;
	protected JPanel jPanelParametrosAuxiliar2VisibleFactura;
	protected JPanel jPanelParametrosAuxiliar3VisibleFactura;
	protected JPanel jPanelParametrosAuxiliar4VisibleFactura;
	//protected JPanel jPanelParametrosAuxiliar5VisibleFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoVisibleFactura;
	//protected JPanel jPanelImportacionVisibleFactura;
	
	
	public JTable jTableDatosVisibleFactura;
	
	
	
	//public JTable jTableDatosVisibleFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVisibleFactura;
	protected JButton jButtonDuplicarVisibleFactura;
	protected JButton jButtonCopiarVisibleFactura;
	protected JButton jButtonVerFormVisibleFactura;
	protected JButton jButtonNuevoRelacionesVisibleFactura;
	protected JButton jButtonModificarVisibleFactura;
	
    protected JButton jButtonGuardarCambiosTablaVisibleFactura;
	protected JButton jButtonCerrarVisibleFactura;
	
	
	protected JButton jButtonRecargarInformacionVisibleFactura;
	protected JButton jButtonProcesarInformacionVisibleFactura;
	
	
	protected JButton jButtonAnterioresVisibleFactura;
	protected JButton jButtonSiguientesVisibleFactura;
	protected JButton jButtonNuevoGuardarCambiosVisibleFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVisibleFactura;
	//protected JButton jButtonCerrarReporteDinamicoVisibleFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoVisibleFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionVisibleFactura;
	//protected JButton jButtonGenerarImportacionVisibleFactura;
	//protected JButton jButtonCerrarImportacionVisibleFactura;
	//protected JFileChooser jFileChooserImportacionVisibleFactura;
	//protected File fileImportacionVisibleFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVisibleFactura;
	protected JButton jButtonDuplicarToolBarVisibleFactura;
	protected JButton jButtonNuevoRelacionesToolBarVisibleFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarVisibleFactura;
	protected JButton jButtonCopiarToolBarVisibleFactura;
	protected JButton jButtonVerFormToolBarVisibleFactura;
	public JButton jButtonGuardarCambiosTablaToolBarVisibleFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarVisibleFactura;
	protected JButton jButtonCerrarToolBarVisibleFactura;
	
	protected JButton jButtonRecargarInformacionToolBarVisibleFactura;
	protected JButton jButtonProcesarInformacionToolBarVisibleFactura;
	protected JButton jButtonAnterioresToolBarVisibleFactura;
	protected JButton jButtonSiguientesToolBarVisibleFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarVisibleFactura;
	protected JButton jButtonAbrirOrderByToolBarVisibleFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVisibleFactura;
	protected JMenuItem jMenuItemDuplicarVisibleFactura;
	protected JMenuItem jMenuItemNuevoRelacionesVisibleFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVisibleFactura;
	protected JMenuItem jMenuItemCopiarVisibleFactura;
	protected JMenuItem jMenuItemVerFormVisibleFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaVisibleFactura;
	protected JMenuItem jMenuItemCerrarVisibleFactura;
	protected JMenuItem jMenuItemDetalleCerrarVisibleFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVisibleFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarVisibleFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionVisibleFactura;
	protected JMenuItem jMenuItemProcesarInformacionVisibleFactura;
	protected JMenuItem jMenuItemAnterioresVisibleFactura;
	protected JMenuItem jMenuItemSiguientesVisibleFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVisibleFactura;
	protected JMenuItem jMenuItemAbrirOrderByVisibleFactura;
	protected JMenuItem jMenuItemMostrarOcultarVisibleFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVisibleFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVisibleFactura;
	protected JCheckBox jCheckBoxSeleccionadosVisibleFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVisibleFactura;
	protected JCheckBox jCheckBoxConGraficoReporteVisibleFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVisibleFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVisibleFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVisibleFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVisibleFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVisibleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVisibleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVisibleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVisibleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVisibleFactura;
	protected JTextField jTextFieldValorCampoGeneralVisibleFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVisibleFactura;
	//public JList<Reporte> jListColumnasSelectReporteVisibleFactura;
	//public JScrollPane jScrollColumnasSelectReporteVisibleFactura;
	
	//public JLabel jLabelRelacionesSelectReporteVisibleFactura;
	//public JList<Reporte> jListRelacionesSelectReporteVisibleFactura;
	//public JScrollPane jScrollRelacionesSelectReporteVisibleFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVisibleFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVisibleFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVisibleFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoVisibleFactura;
	
		
	//public JLabel jLabelArchivoImportacionVisibleFactura;	
	//public JLabel jLabelPathArchivoImportacionVisibleFactura;
	//protected JTextField jTextFieldPathArchivoImportacionVisibleFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVisibleFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVisibleFactura;
	
	//public JLabel jLabelColumnaCategoriaValorVisibleFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVisibleFactura;
	
	//public JLabel jLabelColumnasValoresGraficoVisibleFactura;
	//public JList<Reporte> jListColumnasValoresGraficoVisibleFactura;
	//public JScrollPane jScrollColumnasValoresGraficoVisibleFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVisibleFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVisibleFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVisibleFactura;
	
	
	
	
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
	public VisibleFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVisibleFactura)	{
		this.jButtonRecargarInformacionVisibleFactura = jButtonRecargarInformacionVisibleFactura;
	}
	
	public JButton getjButtonProcesarInformacionVisibleFactura() {
		return this.jButtonProcesarInformacionVisibleFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVisibleFactura)	{
		this.jButtonProcesarInformacionVisibleFactura = jButtonProcesarInformacionVisibleFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionVisibleFactura() {
		return this.jButtonRecargarInformacionVisibleFactura;
	}
	
	
	public List<VisibleFactura> getvisiblefacturas() {
		return this.visiblefacturas;
	}

	public void setvisiblefacturas(List<VisibleFactura> visiblefacturas) {
		this.visiblefacturas = visiblefacturas;
	}
	
	public List<VisibleFactura> getvisiblefacturasAux() {
		return this.visiblefacturasAux;
	}

	public void setvisiblefacturasAux(List<VisibleFactura> visiblefacturasAux) {
		this.visiblefacturasAux = visiblefacturasAux;
	}
	
	public List<VisibleFactura> getvisiblefacturasEliminados() {
		return this.visiblefacturasEliminados;
	}

	public void setVisibleFacturasEliminados(List<VisibleFactura> visiblefacturasEliminados) {
		this.visiblefacturasEliminados = visiblefacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVisibleFactura() {
		return jComboBoxTiposSeleccionarVisibleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVisibleFactura(
			JComboBox jComboBoxTiposSeleccionarVisibleFactura) {
		this.jComboBoxTiposSeleccionarVisibleFactura = jComboBoxTiposSeleccionarVisibleFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVisibleFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVisibleFactura() {
		return jTextFieldValorCampoGeneralVisibleFactura;
	}

	public void setjTextFieldValorCampoGeneralVisibleFactura(
			JTextField jTextFieldValorCampoGeneralVisibleFactura) {
		this.jTextFieldValorCampoGeneralVisibleFactura = jTextFieldValorCampoGeneralVisibleFactura;
	}

	public void setBorderResaltarValorCampoGeneralVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVisibleFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVisibleFactura() {
		return this.jCheckBoxSeleccionarTodosVisibleFactura;
	}

	public void setjCheckBoxSeleccionarTodosVisibleFactura(
			JCheckBox jCheckBoxSeleccionarTodosVisibleFactura) {
		this.jCheckBoxSeleccionarTodosVisibleFactura = jCheckBoxSeleccionarTodosVisibleFactura;
	}

	public void setBorderResaltarSeleccionarTodosVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVisibleFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVisibleFactura() {
		return this.jCheckBoxSeleccionadosVisibleFactura;
	}

	public void setjCheckBoxSeleccionadosVisibleFactura(
			JCheckBox jCheckBoxSeleccionadosVisibleFactura) {
		this.jCheckBoxSeleccionadosVisibleFactura = jCheckBoxSeleccionadosVisibleFactura;
	}
	
	public void setBorderResaltarSeleccionadosVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVisibleFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVisibleFactura() {
		return this.jComboBoxTiposArchivosReportesVisibleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVisibleFactura(
			JComboBox jComboBoxTiposArchivosReportesVisibleFactura) {
		this.jComboBoxTiposArchivosReportesVisibleFactura = jComboBoxTiposArchivosReportesVisibleFactura;
	}

	public void setBorderResaltarTiposArchivosReportesVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVisibleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVisibleFactura() {
		return this.jComboBoxTiposReportesVisibleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVisibleFactura(
			JComboBox jComboBoxTiposReportesVisibleFactura) {
		this.jComboBoxTiposReportesVisibleFactura = jComboBoxTiposReportesVisibleFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVisibleFactura() {
	//	return jComboBoxTiposReportesDinamicoVisibleFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVisibleFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoVisibleFactura) {
	//	this.jComboBoxTiposReportesDinamicoVisibleFactura = jComboBoxTiposReportesDinamicoVisibleFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVisibleFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoVisibleFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVisibleFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVisibleFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura = jComboBoxTiposArchivosReportesDinamicoVisibleFactura;
	//}
	
	public void setBorderResaltarTiposReportesVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVisibleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVisibleFactura() {
		return this.jComboBoxTiposGraficosReportesVisibleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVisibleFactura(
			JComboBox jComboBoxTiposGraficosReportesVisibleFactura) {
		this.jComboBoxTiposGraficosReportesVisibleFactura = jComboBoxTiposGraficosReportesVisibleFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVisibleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVisibleFactura() {
		return this.jComboBoxTiposPaginacionVisibleFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVisibleFactura(
			JComboBox jComboBoxTiposPaginacionVisibleFactura) {
		this.jComboBoxTiposPaginacionVisibleFactura = jComboBoxTiposPaginacionVisibleFactura;
	}
	
	public void setBorderResaltarTiposPaginacionVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVisibleFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVisibleFactura() {
		return this.jComboBoxTiposRelacionesVisibleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVisibleFactura() {
		return this.jComboBoxTiposAccionesVisibleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVisibleFactura(
			JComboBox jComboBoxTiposRelacionesVisibleFactura) {
		this.jComboBoxTiposRelacionesVisibleFactura = jComboBoxTiposRelacionesVisibleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVisibleFactura(
			JComboBox jComboBoxTiposAccionesVisibleFactura) {
		this.jComboBoxTiposAccionesVisibleFactura = jComboBoxTiposAccionesVisibleFactura;
	}
	
	public void setBorderResaltarTiposRelacionesVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVisibleFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVisibleFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVisibleFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVisibleFactura() {
	//	return jCheckBoxConGraficoDinamicoVisibleFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoVisibleFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoVisibleFactura) {
	//	this.jCheckBoxConGraficoDinamicoVisibleFactura = jCheckBoxConGraficoDinamicoVisibleFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVisibleFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVisibleFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVisibleFactura .setBorder(borderResaltar);		
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
		this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
		
		this.visiblefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.visiblefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.visiblefacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VisibleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VisibleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VisibleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VisibleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VisibleFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Visibilidad Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		VisibleFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVisibleFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"nuevo","nuevo","Nuevo"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"duplicar","duplicar","Duplicar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"copiar","copiar","Copiar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"ver_form","ver_form","Ver"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"recargar","recargar","Recargar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVisibleFactura,this.jTtoolBarVisibleFactura,
							"cerrar","cerrar","Salir"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVisibleFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVisibleFactura;
			
				this.jButtonProcesarInformacionToolBarVisibleFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVisibleFactura;
				
		//protected JButton jButtonModificarToolBarVisibleFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVisibleFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVisibleFactura=new JMenuMe("General");
		this.jmenuArchivoVisibleFactura=new JMenuMe("Archivo");
		this.jmenuAccionesVisibleFactura=new JMenuMe("Acciones");
		this.jmenuDatosVisibleFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVisibleFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVisibleFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVisibleFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVisibleFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVisibleFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVisibleFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVisibleFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVisibleFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVisibleFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVisibleFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVisibleFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVisibleFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVisibleFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVisibleFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVisibleFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVisibleFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVisibleFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVisibleFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVisibleFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVisibleFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVisibleFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVisibleFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVisibleFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVisibleFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVisibleFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVisibleFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVisibleFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVisibleFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVisibleFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVisibleFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVisibleFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVisibleFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVisibleFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVisibleFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVisibleFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVisibleFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVisibleFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVisibleFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVisibleFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVisibleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVisibleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVisibleFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVisibleFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVisibleFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVisibleFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVisibleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVisibleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVisibleFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVisibleFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVisibleFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVisibleFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVisibleFactura.add(this.jMenuItemCerrarVisibleFactura);
			
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemNuevoVisibleFactura);
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemNuevoGuardarCambiosVisibleFactura);
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemNuevoRelacionesVisibleFactura);
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemGuardarCambiosTablaVisibleFactura);		
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemDuplicarVisibleFactura);		
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemCopiarVisibleFactura);		
			this.jmenuAccionesVisibleFactura.add(this.jMenuItemVerFormVisibleFactura);		
			
			this.jmenuDatosVisibleFactura.add(this.jMenuItemRecargarInformacionVisibleFactura);				
			this.jmenuDatosVisibleFactura.add(this.jMenuItemAnterioresVisibleFactura);				
			this.jmenuDatosVisibleFactura.add(this.jMenuItemSiguientesVisibleFactura);				
			this.jmenuDatosVisibleFactura.add(this.jMenuItemAbrirOrderByVisibleFactura);				
			this.jmenuDatosVisibleFactura.add(this.jMenuItemMostrarOcultarVisibleFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVisibleFactura.add(this.jMenuItemGuardarCambiosVisibleFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVisibleFactura.add(this.jmenuArchivoVisibleFactura);		
			this.jmenuBarVisibleFactura.add(this.jmenuAccionesVisibleFactura);		
			this.jmenuBarVisibleFactura.add(this.jmenuDatosVisibleFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVisibleFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVisibleFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasVisibleFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasVisibleFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVisibleFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVisibleFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVisibleFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVisibleFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVisibleFactura = new VisibleFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Visibilidad Factura DATOS");
			this.jInternalFrameDetalleFormVisibleFactura = new VisibleFacturaDetalleFormJInternalFrame(jDesktopPane,this.visiblefacturaSessionBean.getConGuardarRelaciones(),this.visiblefacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVisibleFactura = null;//new VisibleFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVisibleFactura= new GridBagLayout();
		
		
		this.jTableDatosVisibleFactura = new JTableMe();      
		
		String sToolTipVisibleFactura="";
		sToolTipVisibleFactura=VisibleFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVisibleFactura+="(Facturacion.VisibleFactura)";
		}
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVisibleFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVisibleFactura.setToolTipText(sToolTipVisibleFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVisibleFactura);
		this.jTableDatosVisibleFactura.setAutoCreateRowSorter(true);
		this.jTableDatosVisibleFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVisibleFactura.setRowSelectionAllowed(true);
		this.jTableDatosVisibleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVisibleFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVisibleFactura = new JButtonMe();
		this.jButtonDuplicarVisibleFactura = new JButtonMe();
		this.jButtonCopiarVisibleFactura = new JButtonMe();
		this.jButtonVerFormVisibleFactura = new JButtonMe();
		this.jButtonNuevoRelacionesVisibleFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVisibleFactura = new JButtonMe();
		this.jButtonCerrarVisibleFactura = new JButtonMe();
		
		this.jScrollPanelDatosVisibleFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralVisibleFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Visibilidad Factura";
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visibilidad Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosVisibleFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVisibleFactura.setToolTipText("Acciones");
        this.jPanelAccionesVisibleFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVisibleFactura=new ReporteDinamicoJInternalFrame(VisibleFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVisibleFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVisibleFactura=new ImportacionJInternalFrame(VisibleFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVisibleFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVisibleFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByVisibleFactura.setText("Orden");
		this.jButtonAbrirOrderByVisibleFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVisibleFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVisibleFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisibleFactura,false,this);
			
			//this.cargarOrderByVisibleFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVisibleFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisibleFactura,true,this);
			
			//this.cargarOrderByVisibleFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVisibleFactura.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosVisibleFactura.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosVisibleFactura.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosVisibleFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVisibleFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVisibleFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVisibleFactura.setText("Nuevo");
		this.jButtonDuplicarVisibleFactura.setText("Duplicar");
		this.jButtonCopiarVisibleFactura.setText("Copiar");
		this.jButtonVerFormVisibleFactura.setText("Ver");
		this.jButtonNuevoRelacionesVisibleFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVisibleFactura.setText("Guardar");
		this.jButtonCerrarVisibleFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVisibleFactura,"nuevo_button","Nuevo",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVisibleFactura,"duplicar_button","Duplicar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVisibleFactura,"copiar_button","Copiar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVisibleFactura,"ver_form","Ver",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVisibleFactura,"nuevorelaciones_button","Nuevo Rel",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVisibleFactura,"guardarcambiostabla_button","Guardar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVisibleFactura,"cerrar_button","Salir",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVisibleFactura.setToolTipText("Nuevo"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVisibleFactura.setToolTipText("Duplicar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVisibleFactura.setToolTipText("Copiar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVisibleFactura.setToolTipText("Ver"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVisibleFactura.setToolTipText("Nuevo Rel"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVisibleFactura.setToolTipText("Guardar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVisibleFactura.setToolTipText("Salir"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVisibleFactura";
		inputMap = this.jButtonNuevoVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVisibleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVisibleFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarVisibleFactura";
		inputMap = this.jButtonDuplicarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVisibleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVisibleFactura"));
		
		//COPIAR
		sMapKey = "CopiarVisibleFactura";
		inputMap = this.jButtonCopiarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVisibleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVisibleFactura"));
		
		//VEr FORM
		sMapKey = "VerFormVisibleFactura";
		inputMap = this.jButtonVerFormVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVisibleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVisibleFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVisibleFactura";
		inputMap = this.jButtonNuevoRelacionesVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVisibleFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVisibleFactura";
		inputMap = this.jButtonModificarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVisibleFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVisibleFactura";
		inputMap = this.jButtonCerrarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVisibleFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVisibleFactura";
		inputMap = this.jButtonGuardarCambiosTablaVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVisibleFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VisibleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VisibleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VisibleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VisibleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VisibleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVisibleFactura.setName("jPanelParametrosReportesVisibleFactura"); 
		
		this.jPanelParametrosReportesAccionesVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVisibleFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVisibleFactura.setName("jPanelParametrosReportesAccionesVisibleFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVisibleFactura = new JButtonMe();
		this.jButtonRecargarInformacionVisibleFactura.setText("Recargar");
		this.jButtonRecargarInformacionVisibleFactura.setToolTipText("Recargar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVisibleFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVisibleFactura = new JButtonMe();
		this.jButtonProcesarInformacionVisibleFactura.setText("Procesar");
		this.jButtonProcesarInformacionVisibleFactura.setToolTipText("Procesar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVisibleFactura.setVisible(false);
			
		this.jButtonProcesarInformacionVisibleFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVisibleFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVisibleFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVisibleFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVisibleFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVisibleFactura.setText("TIPO");       
		this.jComboBoxTiposReportesVisibleFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVisibleFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVisibleFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVisibleFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionVisibleFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVisibleFactura.setText("Accion");
		this.jComboBoxTiposRelacionesVisibleFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVisibleFactura.setText("Accion");
		this.jComboBoxTiposAccionesVisibleFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVisibleFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarVisibleFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVisibleFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVisibleFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVisibleFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVisibleFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVisibleFactura = new JLabelMe();
		
		this.jLabelAccionesVisibleFactura.setText("Acciones");		
		this.jLabelAccionesVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVisibleFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVisibleFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVisibleFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVisibleFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVisibleFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVisibleFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVisibleFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVisibleFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVisibleFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVisibleFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVisibleFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteVisibleFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVisibleFactura = new JButtonMe();
		//this.jButtonAnterioresVisibleFactura.setText("<<");
        this.jButtonAnterioresVisibleFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVisibleFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVisibleFactura = new JButtonMe();
		//this.jButtonSiguientesVisibleFactura.setText(">>");
        this.jButtonSiguientesVisibleFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVisibleFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVisibleFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVisibleFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosVisibleFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVisibleFactura,"nuevoguardarcambios_button","Nue",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVisibleFactura";
		inputMap = this.jButtonNuevoGuardarCambiosVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVisibleFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVisibleFactura";
		inputMap = this.jButtonRecargarInformacionVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVisibleFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVisibleFactura";
		inputMap = this.jButtonSiguientesVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVisibleFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVisibleFactura";
		inputMap = this.jButtonAnterioresVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVisibleFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVisibleFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVisibleFactura.setMinimumSize(new Dimension(this.getWidth(),VisibleFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VisibleFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVisibleFactura.setMaximumSize(new Dimension(this.getWidth(),VisibleFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VisibleFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVisibleFactura.setPreferredSize(new Dimension(this.getWidth(),VisibleFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VisibleFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVisibleFactura = new GridBagLayout();

			this.jPanelPaginacionVisibleFactura.setLayout(gridaBagLayoutPaginacionVisibleFactura);						
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 0;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVisibleFactura.add(this.jButtonAnterioresVisibleFactura, this.gridBagConstraintsVisibleFactura);
					
						
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVisibleFactura.gridy = 0;
			
			this.jPanelPaginacionVisibleFactura.add(this.jButtonNuevoGuardarCambiosVisibleFactura, this.gridBagConstraintsVisibleFactura);
						
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVisibleFactura.gridy = 0;
			this.jPanelPaginacionVisibleFactura.add(this.jButtonSiguientesVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 1;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisibleFactura.add(this.jButtonNuevoVisibleFactura, this.gridBagConstraintsVisibleFactura);
						
			
			
			if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
				this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVisibleFactura.gridy = 1;
				this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVisibleFactura.add(this.jButtonGuardarCambiosTablaVisibleFactura, this.gridBagConstraintsVisibleFactura);
			}
			
			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 1;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisibleFactura.add(this.jButtonDuplicarVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 1;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisibleFactura.add(this.jButtonCopiarVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 1;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisibleFactura.add(this.jButtonVerFormVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 1;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVisibleFactura.add(this.jButtonCerrarVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
		
		
		this.jButtonRecargarInformacionVisibleFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVisibleFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVisibleFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVisibleFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVisibleFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVisibleFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVisibleFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVisibleFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVisibleFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVisibleFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVisibleFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVisibleFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVisibleFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVisibleFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVisibleFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVisibleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVisibleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVisibleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVisibleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisibleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisibleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVisibleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVisibleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVisibleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVisibleFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVisibleFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVisibleFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVisibleFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVisibleFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVisibleFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVisibleFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVisibleFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVisibleFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVisibleFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVisibleFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVisibleFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVisibleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVisibleFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VisibleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VisibleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VisibleFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VisibleFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVisibleFactura.setLayout(gridaBagParametrosReportesVisibleFactura);
			this.jPanelParametrosReportesAccionesVisibleFactura.setLayout(gridaBagParametrosReportesAccionesVisibleFactura);
			
			
			this.jPanelParametrosAuxiliar1VisibleFactura.setLayout(gridaBagParametrosAuxiliar1VisibleFactura);
			this.jPanelParametrosAuxiliar2VisibleFactura.setLayout(gridaBagParametrosAuxiliar2VisibleFactura);
			this.jPanelParametrosAuxiliar3VisibleFactura.setLayout(gridaBagParametrosAuxiliar3VisibleFactura);
			this.jPanelParametrosAuxiliar4VisibleFactura.setLayout(gridaBagParametrosAuxiliar4VisibleFactura);
			//this.jPanelParametrosAuxiliar5VisibleFactura.setLayout(gridaBagParametrosAuxiliar2VisibleFactura);			
			
			
			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisibleFactura.add(this.jButtonRecargarInformacionVisibleFactura, this.gridBagConstraintsVisibleFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VisibleFactura.add(this.jComboBoxTiposPaginacionVisibleFactura, this.gridBagConstraintsVisibleFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VisibleFactura.add(this.jCheckBoxConAltoMaximoTablaVisibleFactura, this.gridBagConstraintsVisibleFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VisibleFactura.add(this.jComboBoxTiposArchivosReportesVisibleFactura, this.gridBagConstraintsVisibleFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisibleFactura.add(this.jPanelParametrosAuxiliar1VisibleFactura, this.gridBagConstraintsVisibleFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVisibleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VisibleFactura.add(this.jComboBoxTiposReportesVisibleFactura, this.gridBagConstraintsVisibleFactura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisibleFactura.add(this.jPanelParametrosAuxiliar4VisibleFactura, this.gridBagConstraintsVisibleFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisibleFactura.add(this.jComboBoxTiposReportesVisibleFactura, this.gridBagConstraintsVisibleFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVisibleFactura.add(this.jCheckBoxGenerarReporteVisibleFactura, this.gridBagConstraintsVisibleFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisibleFactura.add(this.jPanelParametrosAuxiliar2VisibleFactura, this.gridBagConstraintsVisibleFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVisibleFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVisibleFactura.add(this.jLabelAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
				this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVisibleFactura.add(this.jButtonAbrirOrderByVisibleFactura, this.gridBagConstraintsVisibleFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisibleFactura.add(this.jComboBoxTiposSeleccionarVisibleFactura, this.gridBagConstraintsVisibleFactura);			
			
			
			/*
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVisibleFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVisibleFactura.add(this.jCheckBoxSeleccionarTodosVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVisibleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VisibleFactura.add(this.jCheckBoxSeleccionarTodosVisibleFactura, this.gridBagConstraintsVisibleFactura);															
				
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVisibleFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VisibleFactura.add(this.jCheckBoxSeleccionadosVisibleFactura, this.gridBagConstraintsVisibleFactura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisibleFactura.add(this.jPanelParametrosAuxiliar3VisibleFactura, this.gridBagConstraintsVisibleFactura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisibleFactura.add(this.jComboBoxTiposAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);
	
				
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisibleFactura.add(this.jTextFieldValorCampoGeneralVisibleFactura, this.gridBagConstraintsVisibleFactura);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVisibleFactura = new GridBagLayout();

			this.jScrollPanelDatosVisibleFactura.setLayout(gridaBagLayoutDatosVisibleFactura);
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = 0;
			this.gridBagConstraintsVisibleFactura.gridx = 0;
			
			this.jScrollPanelDatosVisibleFactura.add(this.jTableDatosVisibleFactura, this.gridBagConstraintsVisibleFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVisibleFactura.setViewportView(this.jTableDatosVisibleFactura);
		this.jTableDatosVisibleFactura.setFillsViewportHeight(true);
		this.jTableDatosVisibleFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVisibleFactura= new GridBagLayout();
		this.jPanelAccionesVisibleFactura.setLayout(gridaBagLayoutAccionesVisibleFactura);
		
		
		/*	
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 0;
			
		this.jPanelAccionesVisibleFactura.add(this.jButtonNuevoVisibleFactura, this.gridBagConstraintsVisibleFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVisibleFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVisibleFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();						
			this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVisibleFactura.gridx = 0;		
			//this.gridBagConstraintsVisibleFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVisibleFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVisibleFactura, this.gridBagConstraintsVisibleFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVisibleFactura.gridx = 0;		
		//this.gridBagConstraintsVisibleFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVisibleFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVisibleFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVisibleFactura, this.gridBagConstraintsVisibleFactura);								
		
		
		/*
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);
		*/		
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVisibleFactura.gridx =0;
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVisibleFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVisibleFactura, this.gridBagConstraintsVisibleFactura);
				
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVisibleFactura, this.gridBagConstraintsVisibleFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVisibleFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVisibleFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosVisibleFactura.setLayout(gridaBagLayoutBusquedasParametrosVisibleFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVisibleFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVisibleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisibleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisibleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
			
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
			
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVisibleFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVisibleFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVisibleFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVisibleFactura.setName("jPanelReporteDinamicoVisibleFactura"); 
		
		this.jPanelReporteDinamicoVisibleFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVisibleFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVisibleFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVisibleFactura.setLayout(gridaBagLayoutReporteDinamicoVisibleFactura);
		
		
		this.jInternalFrameReporteDinamicoVisibleFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVisibleFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVisibleFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVisibleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVisibleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVisibleFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVisibleFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVisibleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVisibleFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoVisibleFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoVisibleFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVisibleFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVisibleFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVisibleFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visibilidad Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVisibleFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteVisibleFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVisibleFactura.add(this.jLabelColumnasSelectReporteVisibleFactura, this.gridBagConstraintsVisibleFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVisibleFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteVisibleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVisibleFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVisibleFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVisibleFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVisibleFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVisibleFactura=new JScrollPane(this.jListColumnasSelectReporteVisibleFactura);
			
			this.jScrollColumnasSelectReporteVisibleFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVisibleFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVisibleFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVisibleFactura.add(this.jListColumnasSelectReporteVisibleFactura, this.gridBagConstraintsVisibleFactura);
		this.jPanelReporteDinamicoVisibleFactura.add(this.jScrollColumnasSelectReporteVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVisibleFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteVisibleFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVisibleFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteVisibleFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVisibleFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVisibleFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVisibleFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVisibleFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVisibleFactura=new JScrollPane(this.jListRelacionesSelectReporteVisibleFactura);
			
			this.jScrollRelacionesSelectReporteVisibleFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVisibleFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVisibleFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVisibleFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVisibleFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoVisibleFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVisibleFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVisibleFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVisibleFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVisibleFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVisibleFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVisibleFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVisibleFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVisibleFactura.add(this.jLabelGenerarExcelReporteDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVisibleFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVisibleFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVisibleFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVisibleFactura.setToolTipText("Generar EXCEL"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVisibleFactura.add(this.jButtonGenerarExcelReporteDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisibleFactura.add(this.jComboBoxTiposReportesDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVisibleFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVisibleFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVisibleFactura.add(this.jLabelTiposArchivoReporteDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisibleFactura.add(this.jComboBoxTiposArchivosReportesDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVisibleFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVisibleFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVisibleFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVisibleFactura.setToolTipText("Generar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisibleFactura.add(this.jButtonGenerarReporteDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVisibleFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVisibleFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVisibleFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVisibleFactura.setToolTipText("Cancelar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisibleFactura.add(this.jButtonCerrarReporteDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVisibleFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVisibleFactura= new JScrollPane(jPanelReporteDinamicoVisibleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVisibleFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVisibleFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVisibleFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visibilidad Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVisibleFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVisibleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVisibleFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVisibleFactura);
		this.jInternalFrameReporteDinamicoVisibleFactura.getContentPane().add(this.jScrollPanelReporteDinamicoVisibleFactura, this.gridBagConstraintsVisibleFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVisibleFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVisibleFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVisibleFactura.setName("jPanelImportacionVisibleFactura"); 
		
		this.jPanelImportacionVisibleFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVisibleFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVisibleFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVisibleFactura.setLayout(gridaBagLayoutImportacionVisibleFactura);
		
		
		this.jInternalFrameImportacionVisibleFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVisibleFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVisibleFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVisibleFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVisibleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVisibleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVisibleFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVisibleFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVisibleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVisibleFactura.setResizable(true);
	    this.jInternalFrameImportacionVisibleFactura.setClosable(true);
	    this.jInternalFrameImportacionVisibleFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVisibleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVisibleFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVisibleFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVisibleFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVisibleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVisibleFactura.setResizable(true);
	    this.jInternalFrameImportacionVisibleFactura.setClosable(true);
	    this.jInternalFrameImportacionVisibleFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVisibleFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVisibleFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVisibleFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visibilidad Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVisibleFactura = new JLabelMe();

		this.jLabelArchivoImportacionVisibleFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVisibleFactura.add(this.jLabelArchivoImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVisibleFactura = new JFileChooser();		
		this.jFileChooserImportacionVisibleFactura.setToolTipText("ESCOGER ARCHIVO"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVisibleFactura = new JButtonMe();
		this.jButtonAbrirImportacionVisibleFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVisibleFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVisibleFactura.setToolTipText("Generar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisibleFactura.add(this.jButtonAbrirImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVisibleFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionVisibleFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVisibleFactura.add(this.jLabelPathArchivoImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVisibleFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVisibleFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVisibleFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVisibleFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisibleFactura.add(this.jTextFieldPathArchivoImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVisibleFactura = new JButtonMe();
		this.jButtonGenerarImportacionVisibleFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVisibleFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVisibleFactura.setToolTipText("Generar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisibleFactura.add(this.jButtonGenerarImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVisibleFactura = new JButtonMe();
		this.jButtonCerrarImportacionVisibleFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVisibleFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVisibleFactura.setToolTipText("Cancelar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisibleFactura.add(this.jButtonCerrarImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVisibleFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionVisibleFactura= new JScrollPane(jPanelImportacionVisibleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsVisibleFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVisibleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVisibleFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVisibleFactura);
		this.jInternalFrameImportacionVisibleFactura.getContentPane().add(this.jScrollPanelImportacionVisibleFactura, this.gridBagConstraintsVisibleFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVisibleFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVisibleFactura = new JButtonMe();
			this.jButtonAbrirOrderByVisibleFactura.setText("Orden");
			this.jButtonAbrirOrderByVisibleFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVisibleFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVisibleFactura";
			inputMap = this.jButtonAbrirOrderByVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVisibleFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByVisibleFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVisibleFactura.setName("jPanelOrderByVisibleFactura"); 
			
			this.jPanelOrderByVisibleFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVisibleFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVisibleFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVisibleFactura.setLayout(gridaBagLayoutOrderByVisibleFactura);
			
			
			this.jTableDatosVisibleFacturaOrderBy = new JTableMe();        
			this.jTableDatosVisibleFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVisibleFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVisibleFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVisibleFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVisibleFacturaOrderBy.setViewportView(this.jTableDatosVisibleFacturaOrderBy);
			this.jTableDatosVisibleFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVisibleFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVisibleFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVisibleFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVisibleFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVisibleFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVisibleFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVisibleFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVisibleFactura.setTitle("Orden");
			this.jInternalFrameOrderByVisibleFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVisibleFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVisibleFactura.setResizable(true);
			this.jInternalFrameOrderByVisibleFactura.setClosable(true);
			this.jInternalFrameOrderByVisibleFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVisibleFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVisibleFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVisibleFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visibilidad Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVisibleFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVisibleFactura.ipady =150;
				
			this.jPanelOrderByVisibleFactura.add(jScrollPanelDatosVisibleFacturaOrderBy, this.gridBagConstraintsVisibleFactura);//this.jTableDatosVisibleFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVisibleFactura = new JButtonMe();
			this.jButtonCerrarOrderByVisibleFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVisibleFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVisibleFactura.setToolTipText("Cancelar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVisibleFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVisibleFactura.add(this.jButtonCerrarOrderByVisibleFactura, this.gridBagConstraintsVisibleFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVisibleFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByVisibleFactura= new JScrollPane(jPanelOrderByVisibleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsVisibleFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVisibleFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVisibleFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVisibleFactura);
			
			this.jInternalFrameOrderByVisibleFactura.getContentPane().add(this.jScrollPanelOrderByVisibleFactura, this.gridBagConstraintsVisibleFactura);			
		
		} else {
			this.jButtonAbrirOrderByVisibleFactura = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.visiblefacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVisibleFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVisibleFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVisibleFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVisibleFactura.getRowHeight();//VisibleFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVisibleFactura.isSelected()) {
					iHeightTable=VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVisibleFactura.isSelected()) {
					iHeightTable=VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VisibleFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVisibleFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVisibleFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVisibleFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVisibleFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVisibleFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVisibleFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVisibleFactura!=null && this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVisibleFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVisibleFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVisibleFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVisibleFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVisibleFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVisibleFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=visiblefacturaLogic.getVisibleFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=visiblefacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VisibleFactura> TraerVisibleFacturaBeans(List<VisibleFactura> visiblefacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(VisibleFactura visiblefactura:visiblefacturas) {
					
				if(!(VisibleFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VisibleFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					visiblefactura.setsDetalleGeneralEntityReporte(VisibleFacturaConstantesFunciones.getVisibleFacturaDescripcion(visiblefactura));
										
					visiblefactura.setcabe_consignatario_descripcion(VisibleFacturaConstantesFunciones.getcabe_consignatarioDescripcion(visiblefactura));visiblefactura.setcabe_tipo_tasa_descripcion(VisibleFacturaConstantesFunciones.getcabe_tipo_tasaDescripcion(visiblefactura));visiblefactura.setcabe_consultor_descripcion(VisibleFacturaConstantesFunciones.getcabe_consultorDescripcion(visiblefactura));visiblefactura.setcabe_ice_descripcion(VisibleFacturaConstantesFunciones.getcabe_iceDescripcion(visiblefactura));visiblefactura.setcabe_transporte_descripcion(VisibleFacturaConstantesFunciones.getcabe_transporteDescripcion(visiblefactura));visiblefactura.setcabe_fue_descripcion(VisibleFacturaConstantesFunciones.getcabe_fueDescripcion(visiblefactura));visiblefactura.setcabe_orden_descripcion(VisibleFacturaConstantesFunciones.getcabe_ordenDescripcion(visiblefactura));visiblefactura.setdeta_autori_precio_descripcion(VisibleFacturaConstantesFunciones.getdeta_autori_precioDescripcion(visiblefactura));visiblefactura.setdeta_area_descripcion(VisibleFacturaConstantesFunciones.getdeta_areaDescripcion(visiblefactura));visiblefactura.setdeta_foto_descripcion(VisibleFacturaConstantesFunciones.getdeta_fotoDescripcion(visiblefactura));	
					
						
					
				} else  {
							
					//visiblefactura.setsDetalleGeneralEntityReporte(visiblefactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//visiblefacturabeans.add(visiblefacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return visiblefacturas;
    }
	//PARA REPORTES FIN
}
