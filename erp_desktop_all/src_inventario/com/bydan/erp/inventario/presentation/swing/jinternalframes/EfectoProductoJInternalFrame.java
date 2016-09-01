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
import com.bydan.erp.inventario.util.EfectoProductoConstantesFunciones;

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
public class EfectoProductoJInternalFrame extends EfectoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEfectoProducto;
	
	protected JMenuBar jmenuBarEfectoProducto;
	
	protected JMenu jmenuEfectoProducto;
	protected JMenu jmenuDatosEfectoProducto;
	protected JMenu jmenuArchivoEfectoProducto;
	protected JMenu jmenuAccionesEfectoProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEfectoProducto;	
	protected GridBagConstraints gridBagConstraintsEfectoProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EfectoProductoDetalleFormJInternalFrame jInternalFrameDetalleFormEfectoProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEfectoProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEfectoProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public EfectoProductoSessionBean efectoproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EfectoProducto> efectoproductos;		
	public List<EfectoProducto> efectoproductosEliminados;	
	public List<EfectoProducto> efectoproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEfectoProducto;		
	protected JButton jButtonAbrirOrderByEfectoProducto;
	
	
	//protected JPanel jPanelOrderByEfectoProducto;
	//public JScrollPane jScrollPanelOrderByEfectoProducto;	
	//protected JButton jButtonCerrarOrderByEfectoProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EfectoProductoLogic efectoproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEfectoProducto;
	public JScrollPane jScrollPanelDatosEdicionEfectoProducto;
	public JScrollPane jScrollPanelDatosGeneralEfectoProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosEfectoProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEfectoProducto;
	//public JScrollPane jScrollPanelImportacionEfectoProducto;
	
	
	
	protected JPanel jPanelAccionesEfectoProducto;
	
    protected JPanel jPanelPaginacionEfectoProducto;
    protected JPanel jPanelParametrosReportesEfectoProducto;
	protected JPanel jPanelParametrosReportesAccionesEfectoProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EfectoProducto;
	protected JPanel jPanelParametrosAuxiliar2EfectoProducto;
	protected JPanel jPanelParametrosAuxiliar3EfectoProducto;
	protected JPanel jPanelParametrosAuxiliar4EfectoProducto;
	//protected JPanel jPanelParametrosAuxiliar5EfectoProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoEfectoProducto;
	//protected JPanel jPanelImportacionEfectoProducto;
	
	
	public JTable jTableDatosEfectoProducto;
	
	
	
	//public JTable jTableDatosEfectoProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEfectoProducto;
	protected JButton jButtonDuplicarEfectoProducto;
	protected JButton jButtonCopiarEfectoProducto;
	protected JButton jButtonVerFormEfectoProducto;
	protected JButton jButtonNuevoRelacionesEfectoProducto;
	protected JButton jButtonModificarEfectoProducto;
	
    protected JButton jButtonGuardarCambiosTablaEfectoProducto;
	protected JButton jButtonCerrarEfectoProducto;
	
	
	protected JButton jButtonRecargarInformacionEfectoProducto;
	protected JButton jButtonProcesarInformacionEfectoProducto;
	
	
	protected JButton jButtonAnterioresEfectoProducto;
	protected JButton jButtonSiguientesEfectoProducto;
	protected JButton jButtonNuevoGuardarCambiosEfectoProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEfectoProducto;
	//protected JButton jButtonCerrarReporteDinamicoEfectoProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoEfectoProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionEfectoProducto;
	//protected JButton jButtonGenerarImportacionEfectoProducto;
	//protected JButton jButtonCerrarImportacionEfectoProducto;
	//protected JFileChooser jFileChooserImportacionEfectoProducto;
	//protected File fileImportacionEfectoProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEfectoProducto;
	protected JButton jButtonDuplicarToolBarEfectoProducto;
	protected JButton jButtonNuevoRelacionesToolBarEfectoProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarEfectoProducto;
	protected JButton jButtonCopiarToolBarEfectoProducto;
	protected JButton jButtonVerFormToolBarEfectoProducto;
	public JButton jButtonGuardarCambiosTablaToolBarEfectoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarEfectoProducto;
	protected JButton jButtonCerrarToolBarEfectoProducto;
	
	protected JButton jButtonRecargarInformacionToolBarEfectoProducto;
	protected JButton jButtonProcesarInformacionToolBarEfectoProducto;
	protected JButton jButtonAnterioresToolBarEfectoProducto;
	protected JButton jButtonSiguientesToolBarEfectoProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarEfectoProducto;
	protected JButton jButtonAbrirOrderByToolBarEfectoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEfectoProducto;
	protected JMenuItem jMenuItemDuplicarEfectoProducto;
	protected JMenuItem jMenuItemNuevoRelacionesEfectoProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEfectoProducto;
	protected JMenuItem jMenuItemCopiarEfectoProducto;
	protected JMenuItem jMenuItemVerFormEfectoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaEfectoProducto;
	protected JMenuItem jMenuItemCerrarEfectoProducto;
	protected JMenuItem jMenuItemDetalleCerrarEfectoProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEfectoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarEfectoProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionEfectoProducto;
	protected JMenuItem jMenuItemProcesarInformacionEfectoProducto;
	protected JMenuItem jMenuItemAnterioresEfectoProducto;
	protected JMenuItem jMenuItemSiguientesEfectoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEfectoProducto;
	protected JMenuItem jMenuItemAbrirOrderByEfectoProducto;
	protected JMenuItem jMenuItemMostrarOcultarEfectoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEfectoProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEfectoProducto;
	protected JCheckBox jCheckBoxSeleccionadosEfectoProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEfectoProducto;
	protected JCheckBox jCheckBoxConGraficoReporteEfectoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEfectoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEfectoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEfectoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEfectoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEfectoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEfectoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEfectoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEfectoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEfectoProducto;
	protected JTextField jTextFieldValorCampoGeneralEfectoProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEfectoProducto;
	//public JList<Reporte> jListColumnasSelectReporteEfectoProducto;
	//public JScrollPane jScrollColumnasSelectReporteEfectoProducto;
	
	//public JLabel jLabelRelacionesSelectReporteEfectoProducto;
	//public JList<Reporte> jListRelacionesSelectReporteEfectoProducto;
	//public JScrollPane jScrollRelacionesSelectReporteEfectoProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEfectoProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEfectoProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEfectoProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoEfectoProducto;
	
		
	//public JLabel jLabelArchivoImportacionEfectoProducto;	
	//public JLabel jLabelPathArchivoImportacionEfectoProducto;
	//protected JTextField jTextFieldPathArchivoImportacionEfectoProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEfectoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEfectoProducto;
	
	//public JLabel jLabelColumnaCategoriaValorEfectoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEfectoProducto;
	
	//public JLabel jLabelColumnasValoresGraficoEfectoProducto;
	//public JList<Reporte> jListColumnasValoresGraficoEfectoProducto;
	//public JScrollPane jScrollColumnasValoresGraficoEfectoProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEfectoProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEfectoProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEfectoProducto;
	public JPanel jPanelBusquedaPorCodigoEfectoProducto;
	public JButton jButtonBusquedaPorCodigoEfectoProducto;
	public JPanel jPanelBusquedaPorNombreEfectoProducto;
	public JButton jButtonBusquedaPorNombreEfectoProducto;
	public JPanel jPanelFK_IdTipoProductoEfectoProducto;
	public JButton jButtonFK_IdTipoProductoEfectoProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoEfectoProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoEfectoProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoEfectoProducto;
	public JButton jButtoncodigoBusquedaPorCodigoEfectoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreEfectoProducto;
	public JLabel jLabelnombreBusquedaPorNombreEfectoProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreEfectoProducto;
	public JButton jButtonnombreBusquedaPorNombreEfectoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoEfectoProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoEfectoProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoEfectoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoEfectoProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public EfectoProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EfectoProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEfectoProducto)	{
		this.jButtonRecargarInformacionEfectoProducto = jButtonRecargarInformacionEfectoProducto;
	}
	
	public JButton getjButtonProcesarInformacionEfectoProducto() {
		return this.jButtonProcesarInformacionEfectoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEfectoProducto)	{
		this.jButtonProcesarInformacionEfectoProducto = jButtonProcesarInformacionEfectoProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionEfectoProducto() {
		return this.jButtonRecargarInformacionEfectoProducto;
	}
	
	
	public List<EfectoProducto> getefectoproductos() {
		return this.efectoproductos;
	}

	public void setefectoproductos(List<EfectoProducto> efectoproductos) {
		this.efectoproductos = efectoproductos;
	}
	
	public List<EfectoProducto> getefectoproductosAux() {
		return this.efectoproductosAux;
	}

	public void setefectoproductosAux(List<EfectoProducto> efectoproductosAux) {
		this.efectoproductosAux = efectoproductosAux;
	}
	
	public List<EfectoProducto> getefectoproductosEliminados() {
		return this.efectoproductosEliminados;
	}

	public void setEfectoProductosEliminados(List<EfectoProducto> efectoproductosEliminados) {
		this.efectoproductosEliminados = efectoproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEfectoProducto() {
		return jComboBoxTiposSeleccionarEfectoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEfectoProducto(
			JComboBox jComboBoxTiposSeleccionarEfectoProducto) {
		this.jComboBoxTiposSeleccionarEfectoProducto = jComboBoxTiposSeleccionarEfectoProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEfectoProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEfectoProducto() {
		return jTextFieldValorCampoGeneralEfectoProducto;
	}

	public void setjTextFieldValorCampoGeneralEfectoProducto(
			JTextField jTextFieldValorCampoGeneralEfectoProducto) {
		this.jTextFieldValorCampoGeneralEfectoProducto = jTextFieldValorCampoGeneralEfectoProducto;
	}

	public void setBorderResaltarValorCampoGeneralEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEfectoProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEfectoProducto() {
		return this.jCheckBoxSeleccionarTodosEfectoProducto;
	}

	public void setjCheckBoxSeleccionarTodosEfectoProducto(
			JCheckBox jCheckBoxSeleccionarTodosEfectoProducto) {
		this.jCheckBoxSeleccionarTodosEfectoProducto = jCheckBoxSeleccionarTodosEfectoProducto;
	}

	public void setBorderResaltarSeleccionarTodosEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEfectoProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEfectoProducto() {
		return this.jCheckBoxSeleccionadosEfectoProducto;
	}

	public void setjCheckBoxSeleccionadosEfectoProducto(
			JCheckBox jCheckBoxSeleccionadosEfectoProducto) {
		this.jCheckBoxSeleccionadosEfectoProducto = jCheckBoxSeleccionadosEfectoProducto;
	}
	
	public void setBorderResaltarSeleccionadosEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEfectoProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEfectoProducto() {
		return this.jComboBoxTiposArchivosReportesEfectoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEfectoProducto(
			JComboBox jComboBoxTiposArchivosReportesEfectoProducto) {
		this.jComboBoxTiposArchivosReportesEfectoProducto = jComboBoxTiposArchivosReportesEfectoProducto;
	}

	public void setBorderResaltarTiposArchivosReportesEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEfectoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEfectoProducto() {
		return this.jComboBoxTiposReportesEfectoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEfectoProducto(
			JComboBox jComboBoxTiposReportesEfectoProducto) {
		this.jComboBoxTiposReportesEfectoProducto = jComboBoxTiposReportesEfectoProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEfectoProducto() {
	//	return jComboBoxTiposReportesDinamicoEfectoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEfectoProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoEfectoProducto) {
	//	this.jComboBoxTiposReportesDinamicoEfectoProducto = jComboBoxTiposReportesDinamicoEfectoProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEfectoProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoEfectoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEfectoProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEfectoProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto = jComboBoxTiposArchivosReportesDinamicoEfectoProducto;
	//}
	
	public void setBorderResaltarTiposReportesEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEfectoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEfectoProducto() {
		return this.jComboBoxTiposGraficosReportesEfectoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEfectoProducto(
			JComboBox jComboBoxTiposGraficosReportesEfectoProducto) {
		this.jComboBoxTiposGraficosReportesEfectoProducto = jComboBoxTiposGraficosReportesEfectoProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEfectoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEfectoProducto() {
		return this.jComboBoxTiposPaginacionEfectoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEfectoProducto(
			JComboBox jComboBoxTiposPaginacionEfectoProducto) {
		this.jComboBoxTiposPaginacionEfectoProducto = jComboBoxTiposPaginacionEfectoProducto;
	}
	
	public void setBorderResaltarTiposPaginacionEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEfectoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEfectoProducto() {
		return this.jComboBoxTiposRelacionesEfectoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEfectoProducto() {
		return this.jComboBoxTiposAccionesEfectoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEfectoProducto(
			JComboBox jComboBoxTiposRelacionesEfectoProducto) {
		this.jComboBoxTiposRelacionesEfectoProducto = jComboBoxTiposRelacionesEfectoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEfectoProducto(
			JComboBox jComboBoxTiposAccionesEfectoProducto) {
		this.jComboBoxTiposAccionesEfectoProducto = jComboBoxTiposAccionesEfectoProducto;
	}
	
	public void setBorderResaltarTiposRelacionesEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEfectoProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEfectoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEfectoProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEfectoProducto() {
	//	return jCheckBoxConGraficoDinamicoEfectoProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoEfectoProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoEfectoProducto) {
	//	this.jCheckBoxConGraficoDinamicoEfectoProducto = jCheckBoxConGraficoDinamicoEfectoProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEfectoProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEfectoProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEfectoProducto .setBorder(borderResaltar);		
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
		this.efectoproductoSessionBean=new EfectoProductoSessionBean();
		
		this.efectoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.efectoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.efectoproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EfectoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EfectoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Efecto Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EfectoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEfectoProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"nuevo","nuevo","Nuevo"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"duplicar","duplicar","Duplicar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"copiar","copiar","Copiar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"ver_form","ver_form","Ver"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"recargar","recargar","Recargar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEfectoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEfectoProducto,this.jTtoolBarEfectoProducto,
							"cerrar","cerrar","Salir"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEfectoProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEfectoProducto;
			
				this.jButtonProcesarInformacionToolBarEfectoProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEfectoProducto;
				
		//protected JButton jButtonModificarToolBarEfectoProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEfectoProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEfectoProducto=new JMenuMe("General");
		this.jmenuArchivoEfectoProducto=new JMenuMe("Archivo");
		this.jmenuAccionesEfectoProducto=new JMenuMe("Acciones");
		this.jmenuDatosEfectoProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEfectoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEfectoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEfectoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEfectoProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEfectoProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEfectoProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEfectoProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEfectoProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEfectoProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEfectoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEfectoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEfectoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEfectoProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEfectoProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEfectoProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEfectoProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEfectoProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEfectoProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEfectoProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEfectoProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEfectoProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEfectoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEfectoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEfectoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEfectoProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEfectoProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEfectoProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEfectoProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEfectoProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEfectoProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEfectoProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEfectoProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEfectoProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEfectoProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEfectoProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEfectoProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEfectoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEfectoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEfectoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEfectoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEfectoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEfectoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEfectoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEfectoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEfectoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEfectoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEfectoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEfectoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEfectoProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEfectoProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEfectoProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEfectoProducto.add(this.jMenuItemCerrarEfectoProducto);
			
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemNuevoEfectoProducto);
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemNuevoGuardarCambiosEfectoProducto);
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemNuevoRelacionesEfectoProducto);
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemGuardarCambiosTablaEfectoProducto);		
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemDuplicarEfectoProducto);		
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemCopiarEfectoProducto);		
			this.jmenuAccionesEfectoProducto.add(this.jMenuItemVerFormEfectoProducto);		
			
			this.jmenuDatosEfectoProducto.add(this.jMenuItemRecargarInformacionEfectoProducto);				
			this.jmenuDatosEfectoProducto.add(this.jMenuItemAnterioresEfectoProducto);				
			this.jmenuDatosEfectoProducto.add(this.jMenuItemSiguientesEfectoProducto);				
			this.jmenuDatosEfectoProducto.add(this.jMenuItemAbrirOrderByEfectoProducto);				
			this.jmenuDatosEfectoProducto.add(this.jMenuItemMostrarOcultarEfectoProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEfectoProducto.add(this.jMenuItemGuardarCambiosEfectoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEfectoProducto.add(this.jmenuArchivoEfectoProducto);		
			this.jmenuBarEfectoProducto.add(this.jmenuAccionesEfectoProducto);		
			this.jmenuBarEfectoProducto.add(this.jmenuDatosEfectoProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEfectoProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEfectoProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoEfectoProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoEfectoProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoEfectoProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoEfectoProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoEfectoProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoEfectoProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoEfectoProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoEfectoProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoEfectoProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreEfectoProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreEfectoProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreEfectoProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreEfectoProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreEfectoProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreEfectoProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreEfectoProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreEfectoProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreEfectoProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoEfectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoEfectoProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoEfectoProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoEfectoProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoEfectoProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoEfectoProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEfectoProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasEfectoProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEfectoProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEfectoProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEfectoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEfectoProducto = new EfectoProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Efecto Producto DATOS");
			this.jInternalFrameDetalleFormEfectoProducto = new EfectoProductoDetalleFormJInternalFrame(jDesktopPane,this.efectoproductoSessionBean.getConGuardarRelaciones(),this.efectoproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEfectoProducto = null;//new EfectoProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEfectoProducto= new GridBagLayout();
		
		
		this.jTableDatosEfectoProducto = new JTableMe();      
		
		String sToolTipEfectoProducto="";
		sToolTipEfectoProducto=EfectoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEfectoProducto+="(Inventario.EfectoProducto)";
		}
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEfectoProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEfectoProducto.setToolTipText(sToolTipEfectoProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEfectoProducto);
		this.jTableDatosEfectoProducto.setAutoCreateRowSorter(true);
		this.jTableDatosEfectoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEfectoProducto.setRowSelectionAllowed(true);
		this.jTableDatosEfectoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEfectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEfectoProducto = new JButtonMe();
		this.jButtonDuplicarEfectoProducto = new JButtonMe();
		this.jButtonCopiarEfectoProducto = new JButtonMe();
		this.jButtonVerFormEfectoProducto = new JButtonMe();
		this.jButtonNuevoRelacionesEfectoProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEfectoProducto = new JButtonMe();
		this.jButtonCerrarEfectoProducto = new JButtonMe();
		
		this.jScrollPanelDatosEfectoProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralEfectoProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Efecto Producto";
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Efecto Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosEfectoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEfectoProducto.setToolTipText("Acciones");
        this.jPanelAccionesEfectoProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEfectoProducto=new ReporteDinamicoJInternalFrame(EfectoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEfectoProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEfectoProducto=new ImportacionJInternalFrame(EfectoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEfectoProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEfectoProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByEfectoProducto.setText("Orden");
		this.jButtonAbrirOrderByEfectoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEfectoProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEfectoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEfectoProducto,false,this);
			
			//this.cargarOrderByEfectoProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEfectoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEfectoProducto,true,this);
			
			//this.cargarOrderByEfectoProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEfectoProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEfectoProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEfectoProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEfectoProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEfectoProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEfectoProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEfectoProducto.setText("Nuevo");
		this.jButtonDuplicarEfectoProducto.setText("Duplicar");
		this.jButtonCopiarEfectoProducto.setText("Copiar");
		this.jButtonVerFormEfectoProducto.setText("Ver");
		this.jButtonNuevoRelacionesEfectoProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEfectoProducto.setText("Guardar");
		this.jButtonCerrarEfectoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEfectoProducto,"nuevo_button","Nuevo",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEfectoProducto,"duplicar_button","Duplicar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEfectoProducto,"copiar_button","Copiar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEfectoProducto,"ver_form","Ver",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEfectoProducto,"nuevorelaciones_button","Nuevo Rel",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEfectoProducto,"guardarcambiostabla_button","Guardar",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEfectoProducto,"cerrar_button","Salir",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEfectoProducto.setToolTipText("Nuevo"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEfectoProducto.setToolTipText("Duplicar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEfectoProducto.setToolTipText("Copiar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEfectoProducto.setToolTipText("Ver"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEfectoProducto.setToolTipText("Nuevo Rel"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEfectoProducto.setToolTipText("Guardar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEfectoProducto.setToolTipText("Salir"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEfectoProducto";
		inputMap = this.jButtonNuevoEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEfectoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEfectoProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarEfectoProducto";
		inputMap = this.jButtonDuplicarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEfectoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEfectoProducto"));
		
		//COPIAR
		sMapKey = "CopiarEfectoProducto";
		inputMap = this.jButtonCopiarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEfectoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEfectoProducto"));
		
		//VEr FORM
		sMapKey = "VerFormEfectoProducto";
		inputMap = this.jButtonVerFormEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEfectoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEfectoProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEfectoProducto";
		inputMap = this.jButtonNuevoRelacionesEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEfectoProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEfectoProducto";
		inputMap = this.jButtonModificarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEfectoProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEfectoProducto";
		inputMap = this.jButtonCerrarEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEfectoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEfectoProducto";
		inputMap = this.jButtonGuardarCambiosTablaEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEfectoProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EfectoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EfectoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EfectoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EfectoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EfectoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEfectoProducto.setName("jPanelParametrosReportesEfectoProducto"); 
		
		this.jPanelParametrosReportesAccionesEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEfectoProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEfectoProducto.setName("jPanelParametrosReportesAccionesEfectoProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEfectoProducto = new JButtonMe();
		this.jButtonRecargarInformacionEfectoProducto.setText("Recargar");
		this.jButtonRecargarInformacionEfectoProducto.setToolTipText("Recargar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEfectoProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEfectoProducto = new JButtonMe();
		this.jButtonProcesarInformacionEfectoProducto.setText("Procesar");
		this.jButtonProcesarInformacionEfectoProducto.setToolTipText("Procesar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEfectoProducto.setVisible(false);
			
		this.jButtonProcesarInformacionEfectoProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEfectoProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEfectoProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEfectoProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEfectoProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEfectoProducto.setText("TIPO");       
		this.jComboBoxTiposReportesEfectoProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEfectoProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEfectoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEfectoProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionEfectoProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEfectoProducto.setText("Accion");
		this.jComboBoxTiposRelacionesEfectoProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEfectoProducto.setText("Accion");
		this.jComboBoxTiposAccionesEfectoProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEfectoProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEfectoProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarEfectoProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEfectoProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEfectoProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEfectoProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEfectoProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEfectoProducto = new JLabelMe();
		
		this.jLabelAccionesEfectoProducto.setText("Acciones");		
		this.jLabelAccionesEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEfectoProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEfectoProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEfectoProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEfectoProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEfectoProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEfectoProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEfectoProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEfectoProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEfectoProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEfectoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEfectoProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteEfectoProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEfectoProducto = new JButtonMe();
		//this.jButtonAnterioresEfectoProducto.setText("<<");
        this.jButtonAnterioresEfectoProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEfectoProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEfectoProducto = new JButtonMe();
		//this.jButtonSiguientesEfectoProducto.setText(">>");
        this.jButtonSiguientesEfectoProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEfectoProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEfectoProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEfectoProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosEfectoProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEfectoProducto,"nuevoguardarcambios_button","Nue",this.efectoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEfectoProducto";
		inputMap = this.jButtonNuevoGuardarCambiosEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEfectoProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEfectoProducto";
		inputMap = this.jButtonRecargarInformacionEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEfectoProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEfectoProducto";
		inputMap = this.jButtonSiguientesEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEfectoProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEfectoProducto";
		inputMap = this.jButtonAnterioresEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEfectoProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEfectoProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEfectoProducto.setMinimumSize(new Dimension(this.getWidth(),EfectoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EfectoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEfectoProducto.setMaximumSize(new Dimension(this.getWidth(),EfectoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EfectoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEfectoProducto.setPreferredSize(new Dimension(this.getWidth(),EfectoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EfectoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEfectoProducto = new GridBagLayout();

			this.jPanelPaginacionEfectoProducto.setLayout(gridaBagLayoutPaginacionEfectoProducto);						
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 0;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEfectoProducto.add(this.jButtonAnterioresEfectoProducto, this.gridBagConstraintsEfectoProducto);
					
						
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEfectoProducto.gridy = 0;
			
			this.jPanelPaginacionEfectoProducto.add(this.jButtonNuevoGuardarCambiosEfectoProducto, this.gridBagConstraintsEfectoProducto);
						
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEfectoProducto.gridy = 0;
			this.jPanelPaginacionEfectoProducto.add(this.jButtonSiguientesEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 1;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEfectoProducto.add(this.jButtonNuevoEfectoProducto, this.gridBagConstraintsEfectoProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
				this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEfectoProducto.gridy = 1;
				this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEfectoProducto.add(this.jButtonNuevoRelacionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
			}
			
			
			if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
				this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEfectoProducto.gridy = 1;
				this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEfectoProducto.add(this.jButtonGuardarCambiosTablaEfectoProducto, this.gridBagConstraintsEfectoProducto);
			}
			
			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 1;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEfectoProducto.add(this.jButtonDuplicarEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 1;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEfectoProducto.add(this.jButtonCopiarEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 1;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEfectoProducto.add(this.jButtonVerFormEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 1;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEfectoProducto.add(this.jButtonCerrarEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
		
		
		this.jButtonRecargarInformacionEfectoProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEfectoProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEfectoProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEfectoProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEfectoProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEfectoProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEfectoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEfectoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEfectoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEfectoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEfectoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEfectoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEfectoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEfectoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEfectoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEfectoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEfectoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEfectoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEfectoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEfectoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEfectoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEfectoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEfectoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEfectoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEfectoProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEfectoProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEfectoProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEfectoProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEfectoProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEfectoProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEfectoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEfectoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEfectoProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEfectoProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEfectoProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEfectoProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEfectoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEfectoProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EfectoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EfectoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EfectoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EfectoProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEfectoProducto.setLayout(gridaBagParametrosReportesEfectoProducto);
			this.jPanelParametrosReportesAccionesEfectoProducto.setLayout(gridaBagParametrosReportesAccionesEfectoProducto);
			
			
			this.jPanelParametrosAuxiliar1EfectoProducto.setLayout(gridaBagParametrosAuxiliar1EfectoProducto);
			this.jPanelParametrosAuxiliar2EfectoProducto.setLayout(gridaBagParametrosAuxiliar2EfectoProducto);
			this.jPanelParametrosAuxiliar3EfectoProducto.setLayout(gridaBagParametrosAuxiliar3EfectoProducto);
			this.jPanelParametrosAuxiliar4EfectoProducto.setLayout(gridaBagParametrosAuxiliar4EfectoProducto);
			//this.jPanelParametrosAuxiliar5EfectoProducto.setLayout(gridaBagParametrosAuxiliar2EfectoProducto);			
			
			
			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEfectoProducto.add(this.jButtonRecargarInformacionEfectoProducto, this.gridBagConstraintsEfectoProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EfectoProducto.add(this.jComboBoxTiposPaginacionEfectoProducto, this.gridBagConstraintsEfectoProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EfectoProducto.add(this.jCheckBoxConAltoMaximoTablaEfectoProducto, this.gridBagConstraintsEfectoProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EfectoProducto.add(this.jComboBoxTiposArchivosReportesEfectoProducto, this.gridBagConstraintsEfectoProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEfectoProducto.add(this.jPanelParametrosAuxiliar1EfectoProducto, this.gridBagConstraintsEfectoProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEfectoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EfectoProducto.add(this.jComboBoxTiposReportesEfectoProducto, this.gridBagConstraintsEfectoProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEfectoProducto.add(this.jPanelParametrosAuxiliar4EfectoProducto, this.gridBagConstraintsEfectoProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEfectoProducto.add(this.jComboBoxTiposReportesEfectoProducto, this.gridBagConstraintsEfectoProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEfectoProducto.add(this.jCheckBoxGenerarReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEfectoProducto.add(this.jPanelParametrosAuxiliar2EfectoProducto, this.gridBagConstraintsEfectoProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEfectoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEfectoProducto.add(this.jLabelAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
				this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEfectoProducto.add(this.jButtonAbrirOrderByEfectoProducto, this.gridBagConstraintsEfectoProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEfectoProducto.add(this.jComboBoxTiposSeleccionarEfectoProducto, this.gridBagConstraintsEfectoProducto);			
			
			
			/*
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEfectoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEfectoProducto.add(this.jCheckBoxSeleccionarTodosEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEfectoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EfectoProducto.add(this.jCheckBoxSeleccionarTodosEfectoProducto, this.gridBagConstraintsEfectoProducto);															
				
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEfectoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EfectoProducto.add(this.jCheckBoxSeleccionadosEfectoProducto, this.gridBagConstraintsEfectoProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEfectoProducto.add(this.jPanelParametrosAuxiliar3EfectoProducto, this.gridBagConstraintsEfectoProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEfectoProducto.add(this.jComboBoxTiposRelacionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
				
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEfectoProducto.add(this.jComboBoxTiposAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
	
				
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEfectoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEfectoProducto.add(this.jTextFieldValorCampoGeneralEfectoProducto, this.gridBagConstraintsEfectoProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEfectoProducto = new GridBagLayout();

			this.jScrollPanelDatosEfectoProducto.setLayout(gridaBagLayoutDatosEfectoProducto);
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = 0;
			this.gridBagConstraintsEfectoProducto.gridx = 0;
			
			this.jScrollPanelDatosEfectoProducto.add(this.jTableDatosEfectoProducto, this.gridBagConstraintsEfectoProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEfectoProducto.setViewportView(this.jTableDatosEfectoProducto);
		this.jTableDatosEfectoProducto.setFillsViewportHeight(true);
		this.jTableDatosEfectoProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEfectoProducto= new GridBagLayout();
		this.jPanelAccionesEfectoProducto.setLayout(gridaBagLayoutAccionesEfectoProducto);
		
		
		/*	
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = 0;
		this.gridBagConstraintsEfectoProducto.gridx = 0;
			
		this.jPanelAccionesEfectoProducto.add(this.jButtonNuevoEfectoProducto, this.gridBagConstraintsEfectoProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoEfectoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoEfectoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoEfectoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoEfectoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoEfectoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoEfectoProducto.setLayout(gridaBagLayoutBusquedaPorCodigoEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 0;
		gridBagConstraintsEfectoProducto.gridx = 0;
		jPanelBusquedaPorCodigoEfectoProducto.add(jLabelcodigoBusquedaPorCodigoEfectoProducto, gridBagConstraintsEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 0;
		gridBagConstraintsEfectoProducto.gridx = 1;
		jPanelBusquedaPorCodigoEfectoProducto.add(jTextFieldcodigoBusquedaPorCodigoEfectoProducto, gridBagConstraintsEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 1;
		gridBagConstraintsEfectoProducto.gridx =1;
		jPanelBusquedaPorCodigoEfectoProducto.add(jButtonBusquedaPorCodigoEfectoProducto, gridBagConstraintsEfectoProducto);

		jTabbedPaneBusquedasEfectoProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoEfectoProducto);
		jTabbedPaneBusquedasEfectoProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreEfectoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreEfectoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreEfectoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreEfectoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreEfectoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreEfectoProducto.setLayout(gridaBagLayoutBusquedaPorNombreEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 0;
		gridBagConstraintsEfectoProducto.gridx = 0;
		jPanelBusquedaPorNombreEfectoProducto.add(jLabelnombreBusquedaPorNombreEfectoProducto, gridBagConstraintsEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 0;
		gridBagConstraintsEfectoProducto.gridx = 1;
		jPanelBusquedaPorNombreEfectoProducto.add(jTextAreanombreBusquedaPorNombreEfectoProducto, gridBagConstraintsEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 1;
		gridBagConstraintsEfectoProducto.gridx =1;
		jPanelBusquedaPorNombreEfectoProducto.add(jButtonBusquedaPorNombreEfectoProducto, gridBagConstraintsEfectoProducto);

		jTabbedPaneBusquedasEfectoProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreEfectoProducto);
		jTabbedPaneBusquedasEfectoProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoEfectoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoEfectoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoEfectoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoEfectoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoEfectoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoEfectoProducto.setLayout(gridaBagLayoutFK_IdTipoProductoEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 0;
		gridBagConstraintsEfectoProducto.gridx = 0;
		jPanelFK_IdTipoProductoEfectoProducto.add(jLabelid_tipo_productoFK_IdTipoProductoEfectoProducto, gridBagConstraintsEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 0;
		gridBagConstraintsEfectoProducto.gridx = 1;
		jPanelFK_IdTipoProductoEfectoProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto, gridBagConstraintsEfectoProducto);

		gridBagConstraintsEfectoProducto = new GridBagConstraints();
		gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEfectoProducto.gridy = 1;
		gridBagConstraintsEfectoProducto.gridx =1;
		jPanelFK_IdTipoProductoEfectoProducto.add(jButtonFK_IdTipoProductoEfectoProducto, gridBagConstraintsEfectoProducto);

		jTabbedPaneBusquedasEfectoProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoEfectoProducto);
		jTabbedPaneBusquedasEfectoProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEfectoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEfectoProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();						
			this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEfectoProducto.gridx = 0;		
			//this.gridBagConstraintsEfectoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEfectoProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEfectoProducto, this.gridBagConstraintsEfectoProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEfectoProducto.gridx = 0;		
		//this.gridBagConstraintsEfectoProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEfectoProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEfectoProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEfectoProducto.gridx = 0;		
			this.gridBagConstraintsEfectoProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEfectoProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEfectoProducto, this.gridBagConstraintsEfectoProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEfectoProducto, this.gridBagConstraintsEfectoProducto);								
		
		
		/*
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
		*/		
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEfectoProducto.gridx =0;
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEfectoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEfectoProducto, this.gridBagConstraintsEfectoProducto);
				
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEfectoProducto, this.gridBagConstraintsEfectoProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEfectoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEfectoProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosEfectoProducto.setLayout(gridaBagLayoutBusquedasParametrosEfectoProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEfectoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEfectoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEfectoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEfectoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEfectoProducto, this.gridBagConstraintsEfectoProducto);
			
			
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
			
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEfectoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEfectoProducto, this.gridBagConstraintsEfectoProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEfectoProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEfectoProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEfectoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEfectoProducto.setName("jPanelReporteDinamicoEfectoProducto"); 
		
		this.jPanelReporteDinamicoEfectoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEfectoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEfectoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEfectoProducto.setLayout(gridaBagLayoutReporteDinamicoEfectoProducto);
		
		
		this.jInternalFrameReporteDinamicoEfectoProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEfectoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEfectoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEfectoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEfectoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEfectoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEfectoProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEfectoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEfectoProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoEfectoProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoEfectoProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEfectoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEfectoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEfectoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Efecto Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEfectoProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteEfectoProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEfectoProducto.add(this.jLabelColumnasSelectReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEfectoProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteEfectoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEfectoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEfectoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEfectoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEfectoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEfectoProducto=new JScrollPane(this.jListColumnasSelectReporteEfectoProducto);
			
			this.jScrollColumnasSelectReporteEfectoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEfectoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEfectoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEfectoProducto.add(this.jListColumnasSelectReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
		this.jPanelReporteDinamicoEfectoProducto.add(this.jScrollColumnasSelectReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEfectoProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteEfectoProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEfectoProducto.add(this.jLabelRelacionesSelectReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEfectoProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteEfectoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEfectoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEfectoProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEfectoProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEfectoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEfectoProducto=new JScrollPane(this.jListRelacionesSelectReporteEfectoProducto);
			
			this.jScrollRelacionesSelectReporteEfectoProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEfectoProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEfectoProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEfectoProducto.add(this.jListRelacionesSelectReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
		this.jPanelReporteDinamicoEfectoProducto.add(this.jScrollRelacionesSelectReporteEfectoProducto, this.gridBagConstraintsEfectoProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEfectoProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEfectoProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoEfectoProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEfectoProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEfectoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEfectoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEfectoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEfectoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEfectoProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEfectoProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEfectoProducto.add(this.jLabelGenerarExcelReporteDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEfectoProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEfectoProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEfectoProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEfectoProducto.setToolTipText("Generar EXCEL"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		//this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEfectoProducto.add(this.jButtonGenerarExcelReporteDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEfectoProducto.add(this.jComboBoxTiposReportesDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEfectoProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEfectoProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEfectoProducto.add(this.jLabelTiposArchivoReporteDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEfectoProducto.add(this.jComboBoxTiposArchivosReportesDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEfectoProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEfectoProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEfectoProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEfectoProducto.setToolTipText("Generar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEfectoProducto.add(this.jButtonGenerarReporteDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEfectoProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEfectoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEfectoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEfectoProducto.setToolTipText("Cancelar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEfectoProducto.add(this.jButtonCerrarReporteDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEfectoProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEfectoProducto= new JScrollPane(jPanelReporteDinamicoEfectoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEfectoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEfectoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEfectoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Efecto Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEfectoProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEfectoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEfectoProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEfectoProducto);
		this.jInternalFrameReporteDinamicoEfectoProducto.getContentPane().add(this.jScrollPanelReporteDinamicoEfectoProducto, this.gridBagConstraintsEfectoProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEfectoProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEfectoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEfectoProducto.setName("jPanelImportacionEfectoProducto"); 
		
		this.jPanelImportacionEfectoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEfectoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEfectoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEfectoProducto.setLayout(gridaBagLayoutImportacionEfectoProducto);
		
		
		this.jInternalFrameImportacionEfectoProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEfectoProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEfectoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEfectoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEfectoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEfectoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEfectoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEfectoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEfectoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEfectoProducto.setResizable(true);
	    this.jInternalFrameImportacionEfectoProducto.setClosable(true);
	    this.jInternalFrameImportacionEfectoProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEfectoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEfectoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEfectoProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEfectoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEfectoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEfectoProducto.setResizable(true);
	    this.jInternalFrameImportacionEfectoProducto.setClosable(true);
	    this.jInternalFrameImportacionEfectoProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEfectoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEfectoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEfectoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Efecto Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEfectoProducto = new JLabelMe();

		this.jLabelArchivoImportacionEfectoProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEfectoProducto.add(this.jLabelArchivoImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEfectoProducto = new JFileChooser();		
		this.jFileChooserImportacionEfectoProducto.setToolTipText("ESCOGER ARCHIVO"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEfectoProducto = new JButtonMe();
		this.jButtonAbrirImportacionEfectoProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEfectoProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEfectoProducto.setToolTipText("Generar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEfectoProducto.add(this.jButtonAbrirImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEfectoProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionEfectoProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEfectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEfectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEfectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsEfectoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEfectoProducto.add(this.jLabelPathArchivoImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEfectoProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEfectoProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEfectoProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEfectoProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEfectoProducto.add(this.jTextFieldPathArchivoImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEfectoProducto = new JButtonMe();
		this.jButtonGenerarImportacionEfectoProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEfectoProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEfectoProducto.setToolTipText("Generar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEfectoProducto.add(this.jButtonGenerarImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEfectoProducto = new JButtonMe();
		this.jButtonCerrarImportacionEfectoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEfectoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEfectoProducto.setToolTipText("Cancelar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEfectoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsEfectoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEfectoProducto.add(this.jButtonCerrarImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEfectoProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionEfectoProducto= new JScrollPane(jPanelImportacionEfectoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
		this.gridBagConstraintsEfectoProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsEfectoProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEfectoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEfectoProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEfectoProducto);
		this.jInternalFrameImportacionEfectoProducto.getContentPane().add(this.jScrollPanelImportacionEfectoProducto, this.gridBagConstraintsEfectoProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEfectoProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEfectoProducto = new JButtonMe();
			this.jButtonAbrirOrderByEfectoProducto.setText("Orden");
			this.jButtonAbrirOrderByEfectoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEfectoProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEfectoProducto";
			inputMap = this.jButtonAbrirOrderByEfectoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEfectoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEfectoProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByEfectoProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEfectoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEfectoProducto.setName("jPanelOrderByEfectoProducto"); 
			
			this.jPanelOrderByEfectoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEfectoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEfectoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEfectoProducto.setLayout(gridaBagLayoutOrderByEfectoProducto);
			
			
			this.jTableDatosEfectoProductoOrderBy = new JTableMe();        
			this.jTableDatosEfectoProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEfectoProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEfectoProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEfectoProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEfectoProductoOrderBy.setViewportView(this.jTableDatosEfectoProductoOrderBy);
			this.jTableDatosEfectoProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEfectoProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEfectoProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEfectoProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEfectoProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEfectoProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEfectoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEfectoProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEfectoProducto.setTitle("Orden");
			this.jInternalFrameOrderByEfectoProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEfectoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEfectoProducto.setResizable(true);
			this.jInternalFrameOrderByEfectoProducto.setClosable(true);
			this.jInternalFrameOrderByEfectoProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEfectoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEfectoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEfectoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEfectoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Efecto Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEfectoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEfectoProducto.ipady =150;
				
			this.jPanelOrderByEfectoProducto.add(jScrollPanelDatosEfectoProductoOrderBy, this.gridBagConstraintsEfectoProducto);//this.jTableDatosEfectoProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEfectoProducto = new JButtonMe();
			this.jButtonCerrarOrderByEfectoProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEfectoProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEfectoProducto.setToolTipText("Cancelar"+" "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEfectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEfectoProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEfectoProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEfectoProducto.add(this.jButtonCerrarOrderByEfectoProducto, this.gridBagConstraintsEfectoProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEfectoProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByEfectoProducto= new JScrollPane(jPanelOrderByEfectoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEfectoProducto = new GridBagConstraints();
			this.gridBagConstraintsEfectoProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsEfectoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsEfectoProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEfectoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEfectoProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEfectoProducto);
			
			this.jInternalFrameOrderByEfectoProducto.getContentPane().add(this.jScrollPanelOrderByEfectoProducto, this.gridBagConstraintsEfectoProducto);			
		
		} else {
			this.jButtonAbrirOrderByEfectoProducto = new JButtonMe();
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
			&& this.efectoproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEfectoProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEfectoProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEfectoProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEfectoProducto.getRowHeight();//EfectoProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EfectoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEfectoProducto.isSelected()) {
					iHeightTable=EfectoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EfectoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EfectoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EfectoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEfectoProducto.isSelected()) {
					iHeightTable=EfectoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EfectoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EfectoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEfectoProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEfectoProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEfectoProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEfectoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEfectoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEfectoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEfectoProducto!=null && this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEfectoProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEfectoProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEfectoProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEfectoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEfectoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEfectoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=efectoproductoLogic.getEfectoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=efectoproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EfectoProducto> TraerEfectoProductoBeans(List<EfectoProducto> efectoproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EfectoProducto efectoproducto:efectoproductos) {
					
				if(!(EfectoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EfectoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					efectoproducto.setsDetalleGeneralEntityReporte(EfectoProductoConstantesFunciones.getEfectoProductoDescripcion(efectoproducto));
										
						
					
					

					if(efectoproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{efectoproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(efectoproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(efectoproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{efectoproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(efectoproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//efectoproducto.setsDetalleGeneralEntityReporte(efectoproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//efectoproductobeans.add(efectoproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return efectoproductos;
    }
	//PARA REPORTES FIN
}
