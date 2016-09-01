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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.SegmentoProductoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class SegmentoProductoJInternalFrame extends SegmentoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSegmentoProducto;
	
	protected JMenuBar jmenuBarSegmentoProducto;
	
	protected JMenu jmenuSegmentoProducto;
	protected JMenu jmenuDatosSegmentoProducto;
	protected JMenu jmenuArchivoSegmentoProducto;
	protected JMenu jmenuAccionesSegmentoProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSegmentoProducto;	
	protected GridBagConstraints gridBagConstraintsSegmentoProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SegmentoProductoDetalleFormJInternalFrame jInternalFrameDetalleFormSegmentoProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSegmentoProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSegmentoProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public SegmentoProductoSessionBean segmentoproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SegmentoProducto> segmentoproductos;		
	public List<SegmentoProducto> segmentoproductosEliminados;	
	public List<SegmentoProducto> segmentoproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySegmentoProducto;		
	protected JButton jButtonAbrirOrderBySegmentoProducto;
	
	
	//protected JPanel jPanelOrderBySegmentoProducto;
	//public JScrollPane jScrollPanelOrderBySegmentoProducto;	
	//protected JButton jButtonCerrarOrderBySegmentoProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SegmentoProductoLogic segmentoproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSegmentoProducto;
	public JScrollPane jScrollPanelDatosEdicionSegmentoProducto;
	public JScrollPane jScrollPanelDatosGeneralSegmentoProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosSegmentoProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSegmentoProducto;
	//public JScrollPane jScrollPanelImportacionSegmentoProducto;
	
	
	
	protected JPanel jPanelAccionesSegmentoProducto;
	
    protected JPanel jPanelPaginacionSegmentoProducto;
    protected JPanel jPanelParametrosReportesSegmentoProducto;
	protected JPanel jPanelParametrosReportesAccionesSegmentoProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SegmentoProducto;
	protected JPanel jPanelParametrosAuxiliar2SegmentoProducto;
	protected JPanel jPanelParametrosAuxiliar3SegmentoProducto;
	protected JPanel jPanelParametrosAuxiliar4SegmentoProducto;
	//protected JPanel jPanelParametrosAuxiliar5SegmentoProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoSegmentoProducto;
	//protected JPanel jPanelImportacionSegmentoProducto;
	
	
	public JTable jTableDatosSegmentoProducto;
	
	
	
	//public JTable jTableDatosSegmentoProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSegmentoProducto;
	protected JButton jButtonDuplicarSegmentoProducto;
	protected JButton jButtonCopiarSegmentoProducto;
	protected JButton jButtonVerFormSegmentoProducto;
	protected JButton jButtonNuevoRelacionesSegmentoProducto;
	protected JButton jButtonModificarSegmentoProducto;
	
    protected JButton jButtonGuardarCambiosTablaSegmentoProducto;
	protected JButton jButtonCerrarSegmentoProducto;
	
	
	protected JButton jButtonRecargarInformacionSegmentoProducto;
	protected JButton jButtonProcesarInformacionSegmentoProducto;
	
	
	protected JButton jButtonAnterioresSegmentoProducto;
	protected JButton jButtonSiguientesSegmentoProducto;
	protected JButton jButtonNuevoGuardarCambiosSegmentoProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSegmentoProducto;
	//protected JButton jButtonCerrarReporteDinamicoSegmentoProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoSegmentoProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionSegmentoProducto;
	//protected JButton jButtonGenerarImportacionSegmentoProducto;
	//protected JButton jButtonCerrarImportacionSegmentoProducto;
	//protected JFileChooser jFileChooserImportacionSegmentoProducto;
	//protected File fileImportacionSegmentoProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSegmentoProducto;
	protected JButton jButtonDuplicarToolBarSegmentoProducto;
	protected JButton jButtonNuevoRelacionesToolBarSegmentoProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarSegmentoProducto;
	protected JButton jButtonCopiarToolBarSegmentoProducto;
	protected JButton jButtonVerFormToolBarSegmentoProducto;
	public JButton jButtonGuardarCambiosTablaToolBarSegmentoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarSegmentoProducto;
	protected JButton jButtonCerrarToolBarSegmentoProducto;
	
	protected JButton jButtonRecargarInformacionToolBarSegmentoProducto;
	protected JButton jButtonProcesarInformacionToolBarSegmentoProducto;
	protected JButton jButtonAnterioresToolBarSegmentoProducto;
	protected JButton jButtonSiguientesToolBarSegmentoProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarSegmentoProducto;
	protected JButton jButtonAbrirOrderByToolBarSegmentoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSegmentoProducto;
	protected JMenuItem jMenuItemDuplicarSegmentoProducto;
	protected JMenuItem jMenuItemNuevoRelacionesSegmentoProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSegmentoProducto;
	protected JMenuItem jMenuItemCopiarSegmentoProducto;
	protected JMenuItem jMenuItemVerFormSegmentoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaSegmentoProducto;
	protected JMenuItem jMenuItemCerrarSegmentoProducto;
	protected JMenuItem jMenuItemDetalleCerrarSegmentoProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySegmentoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarSegmentoProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionSegmentoProducto;
	protected JMenuItem jMenuItemProcesarInformacionSegmentoProducto;
	protected JMenuItem jMenuItemAnterioresSegmentoProducto;
	protected JMenuItem jMenuItemSiguientesSegmentoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSegmentoProducto;
	protected JMenuItem jMenuItemAbrirOrderBySegmentoProducto;
	protected JMenuItem jMenuItemMostrarOcultarSegmentoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSegmentoProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSegmentoProducto;
	protected JCheckBox jCheckBoxSeleccionadosSegmentoProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSegmentoProducto;
	protected JCheckBox jCheckBoxConGraficoReporteSegmentoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSegmentoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSegmentoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSegmentoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSegmentoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSegmentoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSegmentoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSegmentoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSegmentoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSegmentoProducto;
	protected JTextField jTextFieldValorCampoGeneralSegmentoProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSegmentoProducto;
	//public JList<Reporte> jListColumnasSelectReporteSegmentoProducto;
	//public JScrollPane jScrollColumnasSelectReporteSegmentoProducto;
	
	//public JLabel jLabelRelacionesSelectReporteSegmentoProducto;
	//public JList<Reporte> jListRelacionesSelectReporteSegmentoProducto;
	//public JScrollPane jScrollRelacionesSelectReporteSegmentoProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSegmentoProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSegmentoProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSegmentoProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoSegmentoProducto;
	
		
	//public JLabel jLabelArchivoImportacionSegmentoProducto;	
	//public JLabel jLabelPathArchivoImportacionSegmentoProducto;
	//protected JTextField jTextFieldPathArchivoImportacionSegmentoProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSegmentoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSegmentoProducto;
	
	//public JLabel jLabelColumnaCategoriaValorSegmentoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSegmentoProducto;
	
	//public JLabel jLabelColumnasValoresGraficoSegmentoProducto;
	//public JList<Reporte> jListColumnasValoresGraficoSegmentoProducto;
	//public JScrollPane jScrollColumnasValoresGraficoSegmentoProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSegmentoProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSegmentoProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSegmentoProducto;
	public JPanel jPanelBusquedaPorCodigoSegmentoProducto;
	public JButton jButtonBusquedaPorCodigoSegmentoProducto;
	public JPanel jPanelBusquedaPorNombreSegmentoProducto;
	public JButton jButtonBusquedaPorNombreSegmentoProducto;
	public JPanel jPanelFK_IdTipoProductoSegmentoProducto;
	public JButton jButtonFK_IdTipoProductoSegmentoProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoSegmentoProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoSegmentoProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoSegmentoProducto;
	public JButton jButtoncodigoBusquedaPorCodigoSegmentoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreSegmentoProducto;
	public JLabel jLabelnombreBusquedaPorNombreSegmentoProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreSegmentoProducto;
	public JButton jButtonnombreBusquedaPorNombreSegmentoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoSegmentoProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoSegmentoProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoSegmentoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoSegmentoProductoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SegmentoProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SegmentoProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSegmentoProducto)	{
		this.jButtonRecargarInformacionSegmentoProducto = jButtonRecargarInformacionSegmentoProducto;
	}
	
	public JButton getjButtonProcesarInformacionSegmentoProducto() {
		return this.jButtonProcesarInformacionSegmentoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSegmentoProducto)	{
		this.jButtonProcesarInformacionSegmentoProducto = jButtonProcesarInformacionSegmentoProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionSegmentoProducto() {
		return this.jButtonRecargarInformacionSegmentoProducto;
	}
	
	
	public List<SegmentoProducto> getsegmentoproductos() {
		return this.segmentoproductos;
	}

	public void setsegmentoproductos(List<SegmentoProducto> segmentoproductos) {
		this.segmentoproductos = segmentoproductos;
	}
	
	public List<SegmentoProducto> getsegmentoproductosAux() {
		return this.segmentoproductosAux;
	}

	public void setsegmentoproductosAux(List<SegmentoProducto> segmentoproductosAux) {
		this.segmentoproductosAux = segmentoproductosAux;
	}
	
	public List<SegmentoProducto> getsegmentoproductosEliminados() {
		return this.segmentoproductosEliminados;
	}

	public void setSegmentoProductosEliminados(List<SegmentoProducto> segmentoproductosEliminados) {
		this.segmentoproductosEliminados = segmentoproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSegmentoProducto() {
		return jComboBoxTiposSeleccionarSegmentoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSegmentoProducto(
			JComboBox jComboBoxTiposSeleccionarSegmentoProducto) {
		this.jComboBoxTiposSeleccionarSegmentoProducto = jComboBoxTiposSeleccionarSegmentoProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSegmentoProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSegmentoProducto() {
		return jTextFieldValorCampoGeneralSegmentoProducto;
	}

	public void setjTextFieldValorCampoGeneralSegmentoProducto(
			JTextField jTextFieldValorCampoGeneralSegmentoProducto) {
		this.jTextFieldValorCampoGeneralSegmentoProducto = jTextFieldValorCampoGeneralSegmentoProducto;
	}

	public void setBorderResaltarValorCampoGeneralSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSegmentoProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSegmentoProducto() {
		return this.jCheckBoxSeleccionarTodosSegmentoProducto;
	}

	public void setjCheckBoxSeleccionarTodosSegmentoProducto(
			JCheckBox jCheckBoxSeleccionarTodosSegmentoProducto) {
		this.jCheckBoxSeleccionarTodosSegmentoProducto = jCheckBoxSeleccionarTodosSegmentoProducto;
	}

	public void setBorderResaltarSeleccionarTodosSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSegmentoProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSegmentoProducto() {
		return this.jCheckBoxSeleccionadosSegmentoProducto;
	}

	public void setjCheckBoxSeleccionadosSegmentoProducto(
			JCheckBox jCheckBoxSeleccionadosSegmentoProducto) {
		this.jCheckBoxSeleccionadosSegmentoProducto = jCheckBoxSeleccionadosSegmentoProducto;
	}
	
	public void setBorderResaltarSeleccionadosSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSegmentoProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSegmentoProducto() {
		return this.jComboBoxTiposArchivosReportesSegmentoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSegmentoProducto(
			JComboBox jComboBoxTiposArchivosReportesSegmentoProducto) {
		this.jComboBoxTiposArchivosReportesSegmentoProducto = jComboBoxTiposArchivosReportesSegmentoProducto;
	}

	public void setBorderResaltarTiposArchivosReportesSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSegmentoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSegmentoProducto() {
		return this.jComboBoxTiposReportesSegmentoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSegmentoProducto(
			JComboBox jComboBoxTiposReportesSegmentoProducto) {
		this.jComboBoxTiposReportesSegmentoProducto = jComboBoxTiposReportesSegmentoProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSegmentoProducto() {
	//	return jComboBoxTiposReportesDinamicoSegmentoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSegmentoProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoSegmentoProducto) {
	//	this.jComboBoxTiposReportesDinamicoSegmentoProducto = jComboBoxTiposReportesDinamicoSegmentoProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSegmentoProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoSegmentoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSegmentoProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSegmentoProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto = jComboBoxTiposArchivosReportesDinamicoSegmentoProducto;
	//}
	
	public void setBorderResaltarTiposReportesSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSegmentoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSegmentoProducto() {
		return this.jComboBoxTiposGraficosReportesSegmentoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSegmentoProducto(
			JComboBox jComboBoxTiposGraficosReportesSegmentoProducto) {
		this.jComboBoxTiposGraficosReportesSegmentoProducto = jComboBoxTiposGraficosReportesSegmentoProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSegmentoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSegmentoProducto() {
		return this.jComboBoxTiposPaginacionSegmentoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSegmentoProducto(
			JComboBox jComboBoxTiposPaginacionSegmentoProducto) {
		this.jComboBoxTiposPaginacionSegmentoProducto = jComboBoxTiposPaginacionSegmentoProducto;
	}
	
	public void setBorderResaltarTiposPaginacionSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSegmentoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSegmentoProducto() {
		return this.jComboBoxTiposRelacionesSegmentoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSegmentoProducto() {
		return this.jComboBoxTiposAccionesSegmentoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSegmentoProducto(
			JComboBox jComboBoxTiposRelacionesSegmentoProducto) {
		this.jComboBoxTiposRelacionesSegmentoProducto = jComboBoxTiposRelacionesSegmentoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSegmentoProducto(
			JComboBox jComboBoxTiposAccionesSegmentoProducto) {
		this.jComboBoxTiposAccionesSegmentoProducto = jComboBoxTiposAccionesSegmentoProducto;
	}
	
	public void setBorderResaltarTiposRelacionesSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSegmentoProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSegmentoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSegmentoProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSegmentoProducto() {
	//	return jCheckBoxConGraficoDinamicoSegmentoProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoSegmentoProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoSegmentoProducto) {
	//	this.jCheckBoxConGraficoDinamicoSegmentoProducto = jCheckBoxConGraficoDinamicoSegmentoProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSegmentoProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSegmentoProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSegmentoProducto .setBorder(borderResaltar);		
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
		this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		
		this.segmentoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.segmentoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.segmentoproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SegmentoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SegmentoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Segmento Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SegmentoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSegmentoProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"nuevo","nuevo","Nuevo"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"duplicar","duplicar","Duplicar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"copiar","copiar","Copiar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"ver_form","ver_form","Ver"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"recargar","recargar","Recargar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSegmentoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSegmentoProducto,this.jTtoolBarSegmentoProducto,
							"cerrar","cerrar","Salir"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSegmentoProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSegmentoProducto;
			
				this.jButtonProcesarInformacionToolBarSegmentoProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSegmentoProducto;
				
		//protected JButton jButtonModificarToolBarSegmentoProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSegmentoProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSegmentoProducto=new JMenuMe("General");
		this.jmenuArchivoSegmentoProducto=new JMenuMe("Archivo");
		this.jmenuAccionesSegmentoProducto=new JMenuMe("Acciones");
		this.jmenuDatosSegmentoProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSegmentoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSegmentoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSegmentoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSegmentoProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSegmentoProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSegmentoProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSegmentoProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSegmentoProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSegmentoProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSegmentoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSegmentoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSegmentoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSegmentoProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSegmentoProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSegmentoProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSegmentoProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSegmentoProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSegmentoProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSegmentoProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSegmentoProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSegmentoProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSegmentoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSegmentoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSegmentoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSegmentoProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSegmentoProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSegmentoProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSegmentoProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSegmentoProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSegmentoProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSegmentoProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSegmentoProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSegmentoProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSegmentoProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSegmentoProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSegmentoProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySegmentoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySegmentoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySegmentoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSegmentoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSegmentoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSegmentoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySegmentoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySegmentoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySegmentoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSegmentoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSegmentoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSegmentoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSegmentoProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSegmentoProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSegmentoProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSegmentoProducto.add(this.jMenuItemCerrarSegmentoProducto);
			
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemNuevoSegmentoProducto);
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemNuevoGuardarCambiosSegmentoProducto);
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemNuevoRelacionesSegmentoProducto);
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemGuardarCambiosTablaSegmentoProducto);		
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemDuplicarSegmentoProducto);		
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemCopiarSegmentoProducto);		
			this.jmenuAccionesSegmentoProducto.add(this.jMenuItemVerFormSegmentoProducto);		
			
			this.jmenuDatosSegmentoProducto.add(this.jMenuItemRecargarInformacionSegmentoProducto);				
			this.jmenuDatosSegmentoProducto.add(this.jMenuItemAnterioresSegmentoProducto);				
			this.jmenuDatosSegmentoProducto.add(this.jMenuItemSiguientesSegmentoProducto);				
			this.jmenuDatosSegmentoProducto.add(this.jMenuItemAbrirOrderBySegmentoProducto);				
			this.jmenuDatosSegmentoProducto.add(this.jMenuItemMostrarOcultarSegmentoProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSegmentoProducto.add(this.jMenuItemGuardarCambiosSegmentoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSegmentoProducto.add(this.jmenuArchivoSegmentoProducto);		
			this.jmenuBarSegmentoProducto.add(this.jmenuAccionesSegmentoProducto);		
			this.jmenuBarSegmentoProducto.add(this.jmenuDatosSegmentoProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSegmentoProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSegmentoProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoSegmentoProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoSegmentoProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoSegmentoProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoSegmentoProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoSegmentoProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoSegmentoProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoSegmentoProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoSegmentoProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoSegmentoProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreSegmentoProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreSegmentoProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreSegmentoProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreSegmentoProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreSegmentoProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreSegmentoProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreSegmentoProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreSegmentoProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreSegmentoProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoSegmentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoSegmentoProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoSegmentoProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoSegmentoProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoSegmentoProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoSegmentoProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSegmentoProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasSegmentoProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSegmentoProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSegmentoProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSegmentoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSegmentoProducto = new SegmentoProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Segmento Producto DATOS");
			this.jInternalFrameDetalleFormSegmentoProducto = new SegmentoProductoDetalleFormJInternalFrame(jDesktopPane,this.segmentoproductoSessionBean.getConGuardarRelaciones(),this.segmentoproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSegmentoProducto = null;//new SegmentoProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSegmentoProducto= new GridBagLayout();
		
		
		this.jTableDatosSegmentoProducto = new JTableMe();      
		
		String sToolTipSegmentoProducto="";
		sToolTipSegmentoProducto=SegmentoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSegmentoProducto+="(Inventario.SegmentoProducto)";
		}
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSegmentoProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSegmentoProducto.setToolTipText(sToolTipSegmentoProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSegmentoProducto);
		this.jTableDatosSegmentoProducto.setAutoCreateRowSorter(true);
		this.jTableDatosSegmentoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSegmentoProducto.setRowSelectionAllowed(true);
		this.jTableDatosSegmentoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSegmentoProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSegmentoProducto = new JButtonMe();
		this.jButtonDuplicarSegmentoProducto = new JButtonMe();
		this.jButtonCopiarSegmentoProducto = new JButtonMe();
		this.jButtonVerFormSegmentoProducto = new JButtonMe();
		this.jButtonNuevoRelacionesSegmentoProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSegmentoProducto = new JButtonMe();
		this.jButtonCerrarSegmentoProducto = new JButtonMe();
		
		this.jScrollPanelDatosSegmentoProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralSegmentoProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Segmento Producto";
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Segmento Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosSegmentoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSegmentoProducto.setToolTipText("Acciones");
        this.jPanelAccionesSegmentoProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSegmentoProducto=new ReporteDinamicoJInternalFrame(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSegmentoProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSegmentoProducto=new ImportacionJInternalFrame(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSegmentoProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySegmentoProducto = new JButtonMe();
		
		this.jButtonAbrirOrderBySegmentoProducto.setText("Orden");
		this.jButtonAbrirOrderBySegmentoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySegmentoProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySegmentoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySegmentoProducto,false,this);
			
			//this.cargarOrderBySegmentoProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySegmentoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySegmentoProducto,true,this);
			
			//this.cargarOrderBySegmentoProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSegmentoProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosSegmentoProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosSegmentoProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosSegmentoProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSegmentoProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSegmentoProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSegmentoProducto.setText("Nuevo");
		this.jButtonDuplicarSegmentoProducto.setText("Duplicar");
		this.jButtonCopiarSegmentoProducto.setText("Copiar");
		this.jButtonVerFormSegmentoProducto.setText("Ver");
		this.jButtonNuevoRelacionesSegmentoProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.setText("Guardar");
		this.jButtonCerrarSegmentoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSegmentoProducto,"nuevo_button","Nuevo",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSegmentoProducto,"duplicar_button","Duplicar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSegmentoProducto,"copiar_button","Copiar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSegmentoProducto,"ver_form","Ver",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSegmentoProducto,"nuevorelaciones_button","Nuevo Rel",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSegmentoProducto,"guardarcambiostabla_button","Guardar",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSegmentoProducto,"cerrar_button","Salir",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSegmentoProducto.setToolTipText("Nuevo"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSegmentoProducto.setToolTipText("Duplicar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSegmentoProducto.setToolTipText("Copiar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSegmentoProducto.setToolTipText("Ver"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSegmentoProducto.setToolTipText("Nuevo Rel"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.setToolTipText("Guardar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSegmentoProducto.setToolTipText("Salir"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSegmentoProducto";
		inputMap = this.jButtonNuevoSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSegmentoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSegmentoProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarSegmentoProducto";
		inputMap = this.jButtonDuplicarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSegmentoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSegmentoProducto"));
		
		//COPIAR
		sMapKey = "CopiarSegmentoProducto";
		inputMap = this.jButtonCopiarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSegmentoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSegmentoProducto"));
		
		//VEr FORM
		sMapKey = "VerFormSegmentoProducto";
		inputMap = this.jButtonVerFormSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSegmentoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSegmentoProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSegmentoProducto";
		inputMap = this.jButtonNuevoRelacionesSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSegmentoProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSegmentoProducto";
		inputMap = this.jButtonModificarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSegmentoProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSegmentoProducto";
		inputMap = this.jButtonCerrarSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSegmentoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSegmentoProducto";
		inputMap = this.jButtonGuardarCambiosTablaSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSegmentoProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SegmentoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SegmentoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SegmentoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SegmentoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SegmentoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSegmentoProducto.setName("jPanelParametrosReportesSegmentoProducto"); 
		
		this.jPanelParametrosReportesAccionesSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSegmentoProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSegmentoProducto.setName("jPanelParametrosReportesAccionesSegmentoProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSegmentoProducto = new JButtonMe();
		this.jButtonRecargarInformacionSegmentoProducto.setText("Recargar");
		this.jButtonRecargarInformacionSegmentoProducto.setToolTipText("Recargar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSegmentoProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSegmentoProducto = new JButtonMe();
		this.jButtonProcesarInformacionSegmentoProducto.setText("Procesar");
		this.jButtonProcesarInformacionSegmentoProducto.setToolTipText("Procesar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSegmentoProducto.setVisible(false);
			
		this.jButtonProcesarInformacionSegmentoProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSegmentoProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSegmentoProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSegmentoProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSegmentoProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSegmentoProducto.setText("TIPO");       
		this.jComboBoxTiposReportesSegmentoProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSegmentoProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSegmentoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSegmentoProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionSegmentoProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSegmentoProducto.setText("Accion");
		this.jComboBoxTiposRelacionesSegmentoProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSegmentoProducto.setText("Accion");
		this.jComboBoxTiposAccionesSegmentoProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSegmentoProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSegmentoProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarSegmentoProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSegmentoProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSegmentoProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSegmentoProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSegmentoProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSegmentoProducto = new JLabelMe();
		
		this.jLabelAccionesSegmentoProducto.setText("Acciones");		
		this.jLabelAccionesSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSegmentoProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSegmentoProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSegmentoProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSegmentoProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSegmentoProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSegmentoProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSegmentoProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSegmentoProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSegmentoProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSegmentoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSegmentoProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteSegmentoProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSegmentoProducto = new JButtonMe();
		//this.jButtonAnterioresSegmentoProducto.setText("<<");
        this.jButtonAnterioresSegmentoProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSegmentoProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSegmentoProducto = new JButtonMe();
		//this.jButtonSiguientesSegmentoProducto.setText(">>");
        this.jButtonSiguientesSegmentoProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSegmentoProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSegmentoProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSegmentoProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosSegmentoProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSegmentoProducto,"nuevoguardarcambios_button","Nue",this.segmentoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSegmentoProducto";
		inputMap = this.jButtonNuevoGuardarCambiosSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSegmentoProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSegmentoProducto";
		inputMap = this.jButtonRecargarInformacionSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSegmentoProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSegmentoProducto";
		inputMap = this.jButtonSiguientesSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSegmentoProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSegmentoProducto";
		inputMap = this.jButtonAnterioresSegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSegmentoProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSegmentoProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSegmentoProducto.setMinimumSize(new Dimension(this.getWidth(),SegmentoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SegmentoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSegmentoProducto.setMaximumSize(new Dimension(this.getWidth(),SegmentoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SegmentoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSegmentoProducto.setPreferredSize(new Dimension(this.getWidth(),SegmentoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SegmentoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSegmentoProducto = new GridBagLayout();

			this.jPanelPaginacionSegmentoProducto.setLayout(gridaBagLayoutPaginacionSegmentoProducto);						
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 0;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonAnterioresSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
					
						
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSegmentoProducto.gridy = 0;
			
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonNuevoGuardarCambiosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
						
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSegmentoProducto.gridy = 0;
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonSiguientesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 1;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonNuevoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
				this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSegmentoProducto.gridy = 1;
				this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSegmentoProducto.add(this.jButtonNuevoRelacionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			}
			
			
			if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
				this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSegmentoProducto.gridy = 1;
				this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSegmentoProducto.add(this.jButtonGuardarCambiosTablaSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			}
			
			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 1;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonDuplicarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 1;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonCopiarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 1;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonVerFormSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 1;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSegmentoProducto.add(this.jButtonCerrarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
		
		
		this.jButtonRecargarInformacionSegmentoProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSegmentoProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSegmentoProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSegmentoProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSegmentoProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSegmentoProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSegmentoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSegmentoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSegmentoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSegmentoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSegmentoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSegmentoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSegmentoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSegmentoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSegmentoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSegmentoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSegmentoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSegmentoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSegmentoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSegmentoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSegmentoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSegmentoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSegmentoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSegmentoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSegmentoProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSegmentoProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSegmentoProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSegmentoProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSegmentoProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSegmentoProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSegmentoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSegmentoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSegmentoProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSegmentoProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSegmentoProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSegmentoProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSegmentoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSegmentoProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SegmentoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SegmentoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SegmentoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SegmentoProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSegmentoProducto.setLayout(gridaBagParametrosReportesSegmentoProducto);
			this.jPanelParametrosReportesAccionesSegmentoProducto.setLayout(gridaBagParametrosReportesAccionesSegmentoProducto);
			
			
			this.jPanelParametrosAuxiliar1SegmentoProducto.setLayout(gridaBagParametrosAuxiliar1SegmentoProducto);
			this.jPanelParametrosAuxiliar2SegmentoProducto.setLayout(gridaBagParametrosAuxiliar2SegmentoProducto);
			this.jPanelParametrosAuxiliar3SegmentoProducto.setLayout(gridaBagParametrosAuxiliar3SegmentoProducto);
			this.jPanelParametrosAuxiliar4SegmentoProducto.setLayout(gridaBagParametrosAuxiliar4SegmentoProducto);
			//this.jPanelParametrosAuxiliar5SegmentoProducto.setLayout(gridaBagParametrosAuxiliar2SegmentoProducto);			
			
			
			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSegmentoProducto.add(this.jButtonRecargarInformacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SegmentoProducto.add(this.jComboBoxTiposPaginacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SegmentoProducto.add(this.jCheckBoxConAltoMaximoTablaSegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SegmentoProducto.add(this.jComboBoxTiposArchivosReportesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSegmentoProducto.add(this.jPanelParametrosAuxiliar1SegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSegmentoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SegmentoProducto.add(this.jComboBoxTiposReportesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSegmentoProducto.add(this.jPanelParametrosAuxiliar4SegmentoProducto, this.gridBagConstraintsSegmentoProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSegmentoProducto.add(this.jComboBoxTiposReportesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSegmentoProducto.add(this.jCheckBoxGenerarReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSegmentoProducto.add(this.jPanelParametrosAuxiliar2SegmentoProducto, this.gridBagConstraintsSegmentoProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSegmentoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSegmentoProducto.add(this.jLabelAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
				this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSegmentoProducto.add(this.jButtonAbrirOrderBySegmentoProducto, this.gridBagConstraintsSegmentoProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSegmentoProducto.add(this.jComboBoxTiposSeleccionarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
			
			
			/*
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSegmentoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSegmentoProducto.add(this.jCheckBoxSeleccionarTodosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSegmentoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SegmentoProducto.add(this.jCheckBoxSeleccionarTodosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);															
				
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSegmentoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SegmentoProducto.add(this.jCheckBoxSeleccionadosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSegmentoProducto.add(this.jPanelParametrosAuxiliar3SegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSegmentoProducto.add(this.jComboBoxTiposRelacionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
				
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSegmentoProducto.add(this.jComboBoxTiposAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
	
				
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSegmentoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSegmentoProducto.add(this.jTextFieldValorCampoGeneralSegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSegmentoProducto = new GridBagLayout();

			this.jScrollPanelDatosSegmentoProducto.setLayout(gridaBagLayoutDatosSegmentoProducto);
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = 0;
			this.gridBagConstraintsSegmentoProducto.gridx = 0;
			
			this.jScrollPanelDatosSegmentoProducto.add(this.jTableDatosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSegmentoProducto.setViewportView(this.jTableDatosSegmentoProducto);
		this.jTableDatosSegmentoProducto.setFillsViewportHeight(true);
		this.jTableDatosSegmentoProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSegmentoProducto= new GridBagLayout();
		this.jPanelAccionesSegmentoProducto.setLayout(gridaBagLayoutAccionesSegmentoProducto);
		
		
		/*	
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = 0;
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
			
		this.jPanelAccionesSegmentoProducto.add(this.jButtonNuevoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoSegmentoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoSegmentoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSegmentoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSegmentoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoSegmentoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoSegmentoProducto.setLayout(gridaBagLayoutBusquedaPorCodigoSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 0;
		gridBagConstraintsSegmentoProducto.gridx = 0;
		jPanelBusquedaPorCodigoSegmentoProducto.add(jLabelcodigoBusquedaPorCodigoSegmentoProducto, gridBagConstraintsSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 0;
		gridBagConstraintsSegmentoProducto.gridx = 1;
		jPanelBusquedaPorCodigoSegmentoProducto.add(jTextFieldcodigoBusquedaPorCodigoSegmentoProducto, gridBagConstraintsSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 1;
		gridBagConstraintsSegmentoProducto.gridx =1;
		jPanelBusquedaPorCodigoSegmentoProducto.add(jButtonBusquedaPorCodigoSegmentoProducto, gridBagConstraintsSegmentoProducto);

		jTabbedPaneBusquedasSegmentoProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoSegmentoProducto);
		jTabbedPaneBusquedasSegmentoProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreSegmentoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreSegmentoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreSegmentoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreSegmentoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreSegmentoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreSegmentoProducto.setLayout(gridaBagLayoutBusquedaPorNombreSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 0;
		gridBagConstraintsSegmentoProducto.gridx = 0;
		jPanelBusquedaPorNombreSegmentoProducto.add(jLabelnombreBusquedaPorNombreSegmentoProducto, gridBagConstraintsSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 0;
		gridBagConstraintsSegmentoProducto.gridx = 1;
		jPanelBusquedaPorNombreSegmentoProducto.add(jTextAreanombreBusquedaPorNombreSegmentoProducto, gridBagConstraintsSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 1;
		gridBagConstraintsSegmentoProducto.gridx =1;
		jPanelBusquedaPorNombreSegmentoProducto.add(jButtonBusquedaPorNombreSegmentoProducto, gridBagConstraintsSegmentoProducto);

		jTabbedPaneBusquedasSegmentoProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreSegmentoProducto);
		jTabbedPaneBusquedasSegmentoProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoSegmentoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoSegmentoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoSegmentoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoSegmentoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoSegmentoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoSegmentoProducto.setLayout(gridaBagLayoutFK_IdTipoProductoSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 0;
		gridBagConstraintsSegmentoProducto.gridx = 0;
		jPanelFK_IdTipoProductoSegmentoProducto.add(jLabelid_tipo_productoFK_IdTipoProductoSegmentoProducto, gridBagConstraintsSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 0;
		gridBagConstraintsSegmentoProducto.gridx = 1;
		jPanelFK_IdTipoProductoSegmentoProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto, gridBagConstraintsSegmentoProducto);

		gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSegmentoProducto.gridy = 1;
		gridBagConstraintsSegmentoProducto.gridx =1;
		jPanelFK_IdTipoProductoSegmentoProducto.add(jButtonFK_IdTipoProductoSegmentoProducto, gridBagConstraintsSegmentoProducto);

		jTabbedPaneBusquedasSegmentoProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoSegmentoProducto);
		jTabbedPaneBusquedasSegmentoProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSegmentoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSegmentoProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();						
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSegmentoProducto.gridx = 0;		
			//this.gridBagConstraintsSegmentoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSegmentoProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSegmentoProducto, this.gridBagConstraintsSegmentoProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSegmentoProducto.gridx = 0;		
		//this.gridBagConstraintsSegmentoProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSegmentoProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSegmentoProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSegmentoProducto.gridx = 0;		
			this.gridBagConstraintsSegmentoProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSegmentoProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSegmentoProducto, this.gridBagConstraintsSegmentoProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);								
		
		
		/*
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		*/		
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSegmentoProducto.gridx =0;
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSegmentoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
				
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSegmentoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSegmentoProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosSegmentoProducto.setLayout(gridaBagLayoutBusquedasParametrosSegmentoProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSegmentoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSegmentoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSegmentoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSegmentoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
			
			
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
			
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSegmentoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSegmentoProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSegmentoProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSegmentoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSegmentoProducto.setName("jPanelReporteDinamicoSegmentoProducto"); 
		
		this.jPanelReporteDinamicoSegmentoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSegmentoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSegmentoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSegmentoProducto.setLayout(gridaBagLayoutReporteDinamicoSegmentoProducto);
		
		
		this.jInternalFrameReporteDinamicoSegmentoProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSegmentoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSegmentoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSegmentoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSegmentoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSegmentoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSegmentoProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSegmentoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSegmentoProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoSegmentoProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoSegmentoProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSegmentoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSegmentoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSegmentoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Segmento Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSegmentoProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteSegmentoProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jLabelColumnasSelectReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSegmentoProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteSegmentoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSegmentoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSegmentoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSegmentoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSegmentoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSegmentoProducto=new JScrollPane(this.jListColumnasSelectReporteSegmentoProducto);
			
			this.jScrollColumnasSelectReporteSegmentoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSegmentoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSegmentoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSegmentoProducto.add(this.jListColumnasSelectReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jScrollColumnasSelectReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSegmentoProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteSegmentoProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jLabelRelacionesSelectReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSegmentoProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteSegmentoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSegmentoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSegmentoProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSegmentoProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSegmentoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSegmentoProducto=new JScrollPane(this.jListRelacionesSelectReporteSegmentoProducto);
			
			this.jScrollRelacionesSelectReporteSegmentoProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSegmentoProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSegmentoProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSegmentoProducto.add(this.jListRelacionesSelectReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jScrollRelacionesSelectReporteSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSegmentoProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSegmentoProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoSegmentoProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSegmentoProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSegmentoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSegmentoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSegmentoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSegmentoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSegmentoProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSegmentoProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jLabelGenerarExcelReporteDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSegmentoProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSegmentoProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSegmentoProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSegmentoProducto.setToolTipText("Generar EXCEL"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		//this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSegmentoProducto.add(this.jButtonGenerarExcelReporteDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jComboBoxTiposReportesDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSegmentoProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSegmentoProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jLabelTiposArchivoReporteDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jComboBoxTiposArchivosReportesDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSegmentoProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSegmentoProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSegmentoProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSegmentoProducto.setToolTipText("Generar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jButtonGenerarReporteDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSegmentoProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSegmentoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSegmentoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSegmentoProducto.setToolTipText("Cancelar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSegmentoProducto.add(this.jButtonCerrarReporteDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSegmentoProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSegmentoProducto= new JScrollPane(jPanelReporteDinamicoSegmentoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSegmentoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSegmentoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSegmentoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Segmento Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSegmentoProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSegmentoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSegmentoProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSegmentoProducto);
		this.jInternalFrameReporteDinamicoSegmentoProducto.getContentPane().add(this.jScrollPanelReporteDinamicoSegmentoProducto, this.gridBagConstraintsSegmentoProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSegmentoProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSegmentoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSegmentoProducto.setName("jPanelImportacionSegmentoProducto"); 
		
		this.jPanelImportacionSegmentoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSegmentoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSegmentoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSegmentoProducto.setLayout(gridaBagLayoutImportacionSegmentoProducto);
		
		
		this.jInternalFrameImportacionSegmentoProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSegmentoProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSegmentoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSegmentoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSegmentoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSegmentoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSegmentoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSegmentoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSegmentoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSegmentoProducto.setResizable(true);
	    this.jInternalFrameImportacionSegmentoProducto.setClosable(true);
	    this.jInternalFrameImportacionSegmentoProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSegmentoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSegmentoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSegmentoProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSegmentoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSegmentoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSegmentoProducto.setResizable(true);
	    this.jInternalFrameImportacionSegmentoProducto.setClosable(true);
	    this.jInternalFrameImportacionSegmentoProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSegmentoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSegmentoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSegmentoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Segmento Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSegmentoProducto = new JLabelMe();

		this.jLabelArchivoImportacionSegmentoProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSegmentoProducto.add(this.jLabelArchivoImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSegmentoProducto = new JFileChooser();		
		this.jFileChooserImportacionSegmentoProducto.setToolTipText("ESCOGER ARCHIVO"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSegmentoProducto = new JButtonMe();
		this.jButtonAbrirImportacionSegmentoProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSegmentoProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSegmentoProducto.setToolTipText("Generar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSegmentoProducto.add(this.jButtonAbrirImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSegmentoProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionSegmentoProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSegmentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSegmentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSegmentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSegmentoProducto.add(this.jLabelPathArchivoImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSegmentoProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSegmentoProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSegmentoProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSegmentoProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSegmentoProducto.add(this.jTextFieldPathArchivoImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSegmentoProducto = new JButtonMe();
		this.jButtonGenerarImportacionSegmentoProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSegmentoProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSegmentoProducto.setToolTipText("Generar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSegmentoProducto.add(this.jButtonGenerarImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSegmentoProducto = new JButtonMe();
		this.jButtonCerrarImportacionSegmentoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSegmentoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSegmentoProducto.setToolTipText("Cancelar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSegmentoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsSegmentoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSegmentoProducto.add(this.jButtonCerrarImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSegmentoProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionSegmentoProducto= new JScrollPane(jPanelImportacionSegmentoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
		this.gridBagConstraintsSegmentoProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsSegmentoProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSegmentoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSegmentoProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSegmentoProducto);
		this.jInternalFrameImportacionSegmentoProducto.getContentPane().add(this.jScrollPanelImportacionSegmentoProducto, this.gridBagConstraintsSegmentoProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySegmentoProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySegmentoProducto = new JButtonMe();
			this.jButtonAbrirOrderBySegmentoProducto.setText("Orden");
			this.jButtonAbrirOrderBySegmentoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySegmentoProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySegmentoProducto";
			inputMap = this.jButtonAbrirOrderBySegmentoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySegmentoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySegmentoProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderBySegmentoProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySegmentoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySegmentoProducto.setName("jPanelOrderBySegmentoProducto"); 
			
			this.jPanelOrderBySegmentoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySegmentoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySegmentoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySegmentoProducto.setLayout(gridaBagLayoutOrderBySegmentoProducto);
			
			
			this.jTableDatosSegmentoProductoOrderBy = new JTableMe();        
			this.jTableDatosSegmentoProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSegmentoProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSegmentoProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSegmentoProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSegmentoProductoOrderBy.setViewportView(this.jTableDatosSegmentoProductoOrderBy);
			this.jTableDatosSegmentoProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSegmentoProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySegmentoProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySegmentoProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySegmentoProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSegmentoProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySegmentoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySegmentoProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySegmentoProducto.setTitle("Orden");
			this.jInternalFrameOrderBySegmentoProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySegmentoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySegmentoProducto.setResizable(true);
			this.jInternalFrameOrderBySegmentoProducto.setClosable(true);
			this.jInternalFrameOrderBySegmentoProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySegmentoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySegmentoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySegmentoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySegmentoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Segmento Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSegmentoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSegmentoProducto.ipady =150;
				
			this.jPanelOrderBySegmentoProducto.add(jScrollPanelDatosSegmentoProductoOrderBy, this.gridBagConstraintsSegmentoProducto);//this.jTableDatosSegmentoProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySegmentoProducto = new JButtonMe();
			this.jButtonCerrarOrderBySegmentoProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySegmentoProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySegmentoProducto.setToolTipText("Cancelar"+" "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySegmentoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSegmentoProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSegmentoProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySegmentoProducto.add(this.jButtonCerrarOrderBySegmentoProducto, this.gridBagConstraintsSegmentoProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSegmentoProducto = new GridBagLayout();
			
			this.jScrollPanelOrderBySegmentoProducto= new JScrollPane(jPanelOrderBySegmentoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSegmentoProducto = new GridBagConstraints();
			this.gridBagConstraintsSegmentoProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsSegmentoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsSegmentoProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySegmentoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySegmentoProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSegmentoProducto);
			
			this.jInternalFrameOrderBySegmentoProducto.getContentPane().add(this.jScrollPanelOrderBySegmentoProducto, this.gridBagConstraintsSegmentoProducto);			
		
		} else {
			this.jButtonAbrirOrderBySegmentoProducto = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.segmentoproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSegmentoProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSegmentoProducto.getRowHeight();//SegmentoProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSegmentoProducto.isSelected()) {
					iHeightTable=SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSegmentoProducto.isSelected()) {
					iHeightTable=SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SegmentoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSegmentoProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSegmentoProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSegmentoProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSegmentoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSegmentoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSegmentoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySegmentoProducto!=null && this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySegmentoProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySegmentoProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySegmentoProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSegmentoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSegmentoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSegmentoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=segmentoproductoLogic.getSegmentoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=segmentoproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SegmentoProducto> TraerSegmentoProductoBeans(List<SegmentoProducto> segmentoproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(SegmentoProducto segmentoproducto:segmentoproductos) {
					
				if(!(SegmentoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SegmentoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					segmentoproducto.setsDetalleGeneralEntityReporte(SegmentoProductoConstantesFunciones.getSegmentoProductoDescripcion(segmentoproducto));
										
						
					
					

					if(segmentoproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{segmentoproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(segmentoproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(segmentoproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{segmentoproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(segmentoproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//segmentoproducto.setsDetalleGeneralEntityReporte(segmentoproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//segmentoproductobeans.add(segmentoproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return segmentoproductos;
    }
	//PARA REPORTES FIN
}
