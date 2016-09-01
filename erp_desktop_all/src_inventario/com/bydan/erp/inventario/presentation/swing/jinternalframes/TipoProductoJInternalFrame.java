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
import com.bydan.erp.inventario.util.TipoProductoConstantesFunciones;

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
public class TipoProductoJInternalFrame extends TipoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProducto;
	
	protected JMenuBar jmenuBarTipoProducto;
	
	protected JMenu jmenuTipoProducto;
	protected JMenu jmenuDatosTipoProducto;
	protected JMenu jmenuArchivoTipoProducto;
	protected JMenu jmenuAccionesTipoProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProducto;	
	protected GridBagConstraints gridBagConstraintsTipoProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProductoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProductoSessionBean tipoproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProducto> tipoproductos;		
	public List<TipoProducto> tipoproductosEliminados;	
	public List<TipoProducto> tipoproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProducto;		
	protected JButton jButtonAbrirOrderByTipoProducto;
	
	
	//protected JPanel jPanelOrderByTipoProducto;
	//public JScrollPane jScrollPanelOrderByTipoProducto;	
	//protected JButton jButtonCerrarOrderByTipoProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProductoLogic tipoproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProducto;
	public JScrollPane jScrollPanelDatosEdicionTipoProducto;
	public JScrollPane jScrollPanelDatosGeneralTipoProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProducto;
	//public JScrollPane jScrollPanelImportacionTipoProducto;
	
	
	
	protected JPanel jPanelAccionesTipoProducto;
	
    protected JPanel jPanelPaginacionTipoProducto;
    protected JPanel jPanelParametrosReportesTipoProducto;
	protected JPanel jPanelParametrosReportesAccionesTipoProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProducto;
	protected JPanel jPanelParametrosAuxiliar2TipoProducto;
	protected JPanel jPanelParametrosAuxiliar3TipoProducto;
	protected JPanel jPanelParametrosAuxiliar4TipoProducto;
	//protected JPanel jPanelParametrosAuxiliar5TipoProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProducto;
	//protected JPanel jPanelImportacionTipoProducto;
	
	
	public JTable jTableDatosTipoProducto;
	
	
	
	//public JTable jTableDatosTipoProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProducto;
	protected JButton jButtonDuplicarTipoProducto;
	protected JButton jButtonCopiarTipoProducto;
	protected JButton jButtonVerFormTipoProducto;
	protected JButton jButtonNuevoRelacionesTipoProducto;
	protected JButton jButtonModificarTipoProducto;
	
    protected JButton jButtonGuardarCambiosTablaTipoProducto;
	protected JButton jButtonCerrarTipoProducto;
	
	
	protected JButton jButtonRecargarInformacionTipoProducto;
	protected JButton jButtonProcesarInformacionTipoProducto;
	
	
	protected JButton jButtonAnterioresTipoProducto;
	protected JButton jButtonSiguientesTipoProducto;
	protected JButton jButtonNuevoGuardarCambiosTipoProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProducto;
	//protected JButton jButtonCerrarReporteDinamicoTipoProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProducto;
	//protected JButton jButtonGenerarImportacionTipoProducto;
	//protected JButton jButtonCerrarImportacionTipoProducto;
	//protected JFileChooser jFileChooserImportacionTipoProducto;
	//protected File fileImportacionTipoProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProducto;
	protected JButton jButtonDuplicarToolBarTipoProducto;
	protected JButton jButtonNuevoRelacionesToolBarTipoProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProducto;
	protected JButton jButtonCopiarToolBarTipoProducto;
	protected JButton jButtonVerFormToolBarTipoProducto;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProducto;
	protected JButton jButtonCerrarToolBarTipoProducto;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProducto;
	protected JButton jButtonProcesarInformacionToolBarTipoProducto;
	protected JButton jButtonAnterioresToolBarTipoProducto;
	protected JButton jButtonSiguientesToolBarTipoProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProducto;
	protected JButton jButtonAbrirOrderByToolBarTipoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProducto;
	protected JMenuItem jMenuItemDuplicarTipoProducto;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProducto;
	protected JMenuItem jMenuItemCopiarTipoProducto;
	protected JMenuItem jMenuItemVerFormTipoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProducto;
	protected JMenuItem jMenuItemCerrarTipoProducto;
	protected JMenuItem jMenuItemDetalleCerrarTipoProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProducto;
	protected JMenuItem jMenuItemProcesarInformacionTipoProducto;
	protected JMenuItem jMenuItemAnterioresTipoProducto;
	protected JMenuItem jMenuItemSiguientesTipoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProducto;
	protected JMenuItem jMenuItemAbrirOrderByTipoProducto;
	protected JMenuItem jMenuItemMostrarOcultarTipoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProducto;
	protected JCheckBox jCheckBoxSeleccionadosTipoProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProducto;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProducto;
	protected JTextField jTextFieldValorCampoGeneralTipoProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProducto;
	//public JList<Reporte> jListColumnasSelectReporteTipoProducto;
	//public JScrollPane jScrollColumnasSelectReporteTipoProducto;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProducto;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProducto;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProducto;
	
		
	//public JLabel jLabelArchivoImportacionTipoProducto;	
	//public JLabel jLabelPathArchivoImportacionTipoProducto;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProducto;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProducto;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProducto;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProducto;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoProducto;
	public JPanel jPanelBusquedaPorCodigoTipoProducto;
	public JButton jButtonBusquedaPorCodigoTipoProducto;
	public JPanel jPanelBusquedaPorNombreTipoProducto;
	public JButton jButtonBusquedaPorNombreTipoProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoProducto;
	public JButton jButtoncodigoBusquedaPorCodigoTipoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoProducto;
	public JLabel jLabelnombreBusquedaPorNombreTipoProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoProducto;
	public JButton jButtonnombreBusquedaPorNombreTipoProductoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProducto)	{
		this.jButtonRecargarInformacionTipoProducto = jButtonRecargarInformacionTipoProducto;
	}
	
	public JButton getjButtonProcesarInformacionTipoProducto() {
		return this.jButtonProcesarInformacionTipoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProducto)	{
		this.jButtonProcesarInformacionTipoProducto = jButtonProcesarInformacionTipoProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProducto() {
		return this.jButtonRecargarInformacionTipoProducto;
	}
	
	
	public List<TipoProducto> gettipoproductos() {
		return this.tipoproductos;
	}

	public void settipoproductos(List<TipoProducto> tipoproductos) {
		this.tipoproductos = tipoproductos;
	}
	
	public List<TipoProducto> gettipoproductosAux() {
		return this.tipoproductosAux;
	}

	public void settipoproductosAux(List<TipoProducto> tipoproductosAux) {
		this.tipoproductosAux = tipoproductosAux;
	}
	
	public List<TipoProducto> gettipoproductosEliminados() {
		return this.tipoproductosEliminados;
	}

	public void setTipoProductosEliminados(List<TipoProducto> tipoproductosEliminados) {
		this.tipoproductosEliminados = tipoproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProducto() {
		return jComboBoxTiposSeleccionarTipoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProducto(
			JComboBox jComboBoxTiposSeleccionarTipoProducto) {
		this.jComboBoxTiposSeleccionarTipoProducto = jComboBoxTiposSeleccionarTipoProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProducto() {
		return jTextFieldValorCampoGeneralTipoProducto;
	}

	public void setjTextFieldValorCampoGeneralTipoProducto(
			JTextField jTextFieldValorCampoGeneralTipoProducto) {
		this.jTextFieldValorCampoGeneralTipoProducto = jTextFieldValorCampoGeneralTipoProducto;
	}

	public void setBorderResaltarValorCampoGeneralTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProducto() {
		return this.jCheckBoxSeleccionarTodosTipoProducto;
	}

	public void setjCheckBoxSeleccionarTodosTipoProducto(
			JCheckBox jCheckBoxSeleccionarTodosTipoProducto) {
		this.jCheckBoxSeleccionarTodosTipoProducto = jCheckBoxSeleccionarTodosTipoProducto;
	}

	public void setBorderResaltarSeleccionarTodosTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProducto() {
		return this.jCheckBoxSeleccionadosTipoProducto;
	}

	public void setjCheckBoxSeleccionadosTipoProducto(
			JCheckBox jCheckBoxSeleccionadosTipoProducto) {
		this.jCheckBoxSeleccionadosTipoProducto = jCheckBoxSeleccionadosTipoProducto;
	}
	
	public void setBorderResaltarSeleccionadosTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProducto() {
		return this.jComboBoxTiposArchivosReportesTipoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProducto(
			JComboBox jComboBoxTiposArchivosReportesTipoProducto) {
		this.jComboBoxTiposArchivosReportesTipoProducto = jComboBoxTiposArchivosReportesTipoProducto;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProducto() {
		return this.jComboBoxTiposReportesTipoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProducto(
			JComboBox jComboBoxTiposReportesTipoProducto) {
		this.jComboBoxTiposReportesTipoProducto = jComboBoxTiposReportesTipoProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProducto() {
	//	return jComboBoxTiposReportesDinamicoTipoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProducto) {
	//	this.jComboBoxTiposReportesDinamicoTipoProducto = jComboBoxTiposReportesDinamicoTipoProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProducto = jComboBoxTiposArchivosReportesDinamicoTipoProducto;
	//}
	
	public void setBorderResaltarTiposReportesTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProducto() {
		return this.jComboBoxTiposGraficosReportesTipoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProducto(
			JComboBox jComboBoxTiposGraficosReportesTipoProducto) {
		this.jComboBoxTiposGraficosReportesTipoProducto = jComboBoxTiposGraficosReportesTipoProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProducto() {
		return this.jComboBoxTiposPaginacionTipoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProducto(
			JComboBox jComboBoxTiposPaginacionTipoProducto) {
		this.jComboBoxTiposPaginacionTipoProducto = jComboBoxTiposPaginacionTipoProducto;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProducto() {
		return this.jComboBoxTiposRelacionesTipoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProducto() {
		return this.jComboBoxTiposAccionesTipoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProducto(
			JComboBox jComboBoxTiposRelacionesTipoProducto) {
		this.jComboBoxTiposRelacionesTipoProducto = jComboBoxTiposRelacionesTipoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProducto(
			JComboBox jComboBoxTiposAccionesTipoProducto) {
		this.jComboBoxTiposAccionesTipoProducto = jComboBoxTiposAccionesTipoProducto;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProducto() {
	//	return jCheckBoxConGraficoDinamicoTipoProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProducto) {
	//	this.jCheckBoxConGraficoDinamicoTipoProducto = jCheckBoxConGraficoDinamicoTipoProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProducto .setBorder(borderResaltar);		
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
		this.tipoproductoSessionBean=new TipoProductoSessionBean();
		
		this.tipoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"nuevo","nuevo","Nuevo"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"duplicar","duplicar","Duplicar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"copiar","copiar","Copiar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"ver_form","ver_form","Ver"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"recargar","recargar","Recargar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProducto,this.jTtoolBarTipoProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProducto,this.jTtoolBarTipoProducto,
							"cerrar","cerrar","Salir"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProducto;
			
				this.jButtonProcesarInformacionToolBarTipoProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProducto;
				
		//protected JButton jButtonModificarToolBarTipoProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProducto=new JMenuMe("General");
		this.jmenuArchivoTipoProducto=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProducto=new JMenuMe("Acciones");
		this.jmenuDatosTipoProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProducto.add(this.jMenuItemCerrarTipoProducto);
			
			this.jmenuAccionesTipoProducto.add(this.jMenuItemNuevoTipoProducto);
			this.jmenuAccionesTipoProducto.add(this.jMenuItemNuevoGuardarCambiosTipoProducto);
			this.jmenuAccionesTipoProducto.add(this.jMenuItemNuevoRelacionesTipoProducto);
			this.jmenuAccionesTipoProducto.add(this.jMenuItemGuardarCambiosTablaTipoProducto);		
			this.jmenuAccionesTipoProducto.add(this.jMenuItemDuplicarTipoProducto);		
			this.jmenuAccionesTipoProducto.add(this.jMenuItemCopiarTipoProducto);		
			this.jmenuAccionesTipoProducto.add(this.jMenuItemVerFormTipoProducto);		
			
			this.jmenuDatosTipoProducto.add(this.jMenuItemRecargarInformacionTipoProducto);				
			this.jmenuDatosTipoProducto.add(this.jMenuItemAnterioresTipoProducto);				
			this.jmenuDatosTipoProducto.add(this.jMenuItemSiguientesTipoProducto);				
			this.jmenuDatosTipoProducto.add(this.jMenuItemAbrirOrderByTipoProducto);				
			this.jmenuDatosTipoProducto.add(this.jMenuItemMostrarOcultarTipoProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProducto.add(this.jMenuItemGuardarCambiosTipoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProducto.add(this.jmenuArchivoTipoProducto);		
			this.jmenuBarTipoProducto.add(this.jmenuAccionesTipoProducto);		
			this.jmenuBarTipoProducto.add(this.jmenuDatosTipoProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoProducto = new TipoProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Producto DATOS");
			this.jInternalFrameDetalleFormTipoProducto = new TipoProductoDetalleFormJInternalFrame(jDesktopPane,this.tipoproductoSessionBean.getConGuardarRelaciones(),this.tipoproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProducto = null;//new TipoProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProducto= new GridBagLayout();
		
		
		this.jTableDatosTipoProducto = new JTableMe();      
		
		String sToolTipTipoProducto="";
		sToolTipTipoProducto=TipoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProducto+="(Inventario.TipoProducto)";
		}
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProducto.setToolTipText(sToolTipTipoProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProducto);
		this.jTableDatosTipoProducto.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProducto.setRowSelectionAllowed(true);
		this.jTableDatosTipoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProducto = new JButtonMe();
		this.jButtonDuplicarTipoProducto = new JButtonMe();
		this.jButtonCopiarTipoProducto = new JButtonMe();
		this.jButtonVerFormTipoProducto = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProducto = new JButtonMe();
		this.jButtonCerrarTipoProducto = new JButtonMe();
		
		this.jScrollPanelDatosTipoProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Producto";
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProducto.setToolTipText("Acciones");
        this.jPanelAccionesTipoProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProducto=new ReporteDinamicoJInternalFrame(TipoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProducto=new ImportacionJInternalFrame(TipoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProducto.setText("Orden");
		this.jButtonAbrirOrderByTipoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProducto,false,this);
			
			//this.cargarOrderByTipoProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProducto,true,this);
			
			//this.cargarOrderByTipoProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProducto.setText("Nuevo");
		this.jButtonDuplicarTipoProducto.setText("Duplicar");
		this.jButtonCopiarTipoProducto.setText("Copiar");
		this.jButtonVerFormTipoProducto.setText("Ver");
		this.jButtonNuevoRelacionesTipoProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProducto.setText("Guardar");
		this.jButtonCerrarTipoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProducto,"nuevo_button","Nuevo",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProducto,"duplicar_button","Duplicar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProducto,"copiar_button","Copiar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProducto,"ver_form","Ver",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProducto,"nuevorelaciones_button","Nuevo Rel",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProducto,"guardarcambiostabla_button","Guardar",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProducto,"cerrar_button","Salir",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProducto.setToolTipText("Nuevo"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProducto.setToolTipText("Duplicar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProducto.setToolTipText("Copiar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProducto.setToolTipText("Ver"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProducto.setToolTipText("Nuevo Rel"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProducto.setToolTipText("Guardar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProducto.setToolTipText("Salir"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProducto";
		inputMap = this.jButtonNuevoTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProducto";
		inputMap = this.jButtonDuplicarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProducto"));
		
		//COPIAR
		sMapKey = "CopiarTipoProducto";
		inputMap = this.jButtonCopiarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProducto"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProducto";
		inputMap = this.jButtonVerFormTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProducto";
		inputMap = this.jButtonNuevoRelacionesTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProducto";
		inputMap = this.jButtonModificarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProducto";
		inputMap = this.jButtonCerrarTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProducto";
		inputMap = this.jButtonGuardarCambiosTablaTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProducto.setName("jPanelParametrosReportesTipoProducto"); 
		
		this.jPanelParametrosReportesAccionesTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProducto.setName("jPanelParametrosReportesAccionesTipoProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProducto = new JButtonMe();
		this.jButtonRecargarInformacionTipoProducto.setText("Recargar");
		this.jButtonRecargarInformacionTipoProducto.setToolTipText("Recargar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProducto = new JButtonMe();
		this.jButtonProcesarInformacionTipoProducto.setText("Procesar");
		this.jButtonProcesarInformacionTipoProducto.setToolTipText("Procesar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProducto.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProducto.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProducto.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProducto.setText("Accion");
		this.jComboBoxTiposAccionesTipoProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProducto = new JLabelMe();
		
		this.jLabelAccionesTipoProducto.setText("Acciones");		
		this.jLabelAccionesTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProducto = new JButtonMe();
		//this.jButtonAnterioresTipoProducto.setText("<<");
        this.jButtonAnterioresTipoProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProducto = new JButtonMe();
		//this.jButtonSiguientesTipoProducto.setText(">>");
        this.jButtonSiguientesTipoProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProducto,"nuevoguardarcambios_button","Nue",this.tipoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProducto";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProducto";
		inputMap = this.jButtonRecargarInformacionTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProducto";
		inputMap = this.jButtonSiguientesTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProducto";
		inputMap = this.jButtonAnterioresTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProducto.setMinimumSize(new Dimension(this.getWidth(),TipoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProducto.setMaximumSize(new Dimension(this.getWidth(),TipoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProducto.setPreferredSize(new Dimension(this.getWidth(),TipoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProducto = new GridBagLayout();

			this.jPanelPaginacionTipoProducto.setLayout(gridaBagLayoutPaginacionTipoProducto);						
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 0;
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProducto.add(this.jButtonAnterioresTipoProducto, this.gridBagConstraintsTipoProducto);
					
						
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProducto.gridy = 0;
			
			this.jPanelPaginacionTipoProducto.add(this.jButtonNuevoGuardarCambiosTipoProducto, this.gridBagConstraintsTipoProducto);
						
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProducto.gridy = 0;
			this.jPanelPaginacionTipoProducto.add(this.jButtonSiguientesTipoProducto, this.gridBagConstraintsTipoProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 1;
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProducto.add(this.jButtonNuevoTipoProducto, this.gridBagConstraintsTipoProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProducto.gridy = 1;
				this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProducto.add(this.jButtonNuevoRelacionesTipoProducto, this.gridBagConstraintsTipoProducto);
			}
			
			
			if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProducto.gridy = 1;
				this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProducto.add(this.jButtonGuardarCambiosTablaTipoProducto, this.gridBagConstraintsTipoProducto);
			}
			
			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 1;
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProducto.add(this.jButtonDuplicarTipoProducto, this.gridBagConstraintsTipoProducto);
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 1;
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProducto.add(this.jButtonCopiarTipoProducto, this.gridBagConstraintsTipoProducto);
		
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 1;
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProducto.add(this.jButtonVerFormTipoProducto, this.gridBagConstraintsTipoProducto);
		
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 1;
			this.gridBagConstraintsTipoProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProducto.add(this.jButtonCerrarTipoProducto, this.gridBagConstraintsTipoProducto);
		
		
		
		this.jButtonRecargarInformacionTipoProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProducto.setLayout(gridaBagParametrosReportesTipoProducto);
			this.jPanelParametrosReportesAccionesTipoProducto.setLayout(gridaBagParametrosReportesAccionesTipoProducto);
			
			
			this.jPanelParametrosAuxiliar1TipoProducto.setLayout(gridaBagParametrosAuxiliar1TipoProducto);
			this.jPanelParametrosAuxiliar2TipoProducto.setLayout(gridaBagParametrosAuxiliar2TipoProducto);
			this.jPanelParametrosAuxiliar3TipoProducto.setLayout(gridaBagParametrosAuxiliar3TipoProducto);
			this.jPanelParametrosAuxiliar4TipoProducto.setLayout(gridaBagParametrosAuxiliar4TipoProducto);
			//this.jPanelParametrosAuxiliar5TipoProducto.setLayout(gridaBagParametrosAuxiliar2TipoProducto);			
			
			
			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProducto.add(this.jButtonRecargarInformacionTipoProducto, this.gridBagConstraintsTipoProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProducto.add(this.jComboBoxTiposPaginacionTipoProducto, this.gridBagConstraintsTipoProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProducto.add(this.jCheckBoxConAltoMaximoTablaTipoProducto, this.gridBagConstraintsTipoProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProducto.add(this.jComboBoxTiposArchivosReportesTipoProducto, this.gridBagConstraintsTipoProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProducto.add(this.jPanelParametrosAuxiliar1TipoProducto, this.gridBagConstraintsTipoProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProducto.add(this.jComboBoxTiposReportesTipoProducto, this.gridBagConstraintsTipoProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProducto.add(this.jPanelParametrosAuxiliar4TipoProducto, this.gridBagConstraintsTipoProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProducto.add(this.jComboBoxTiposReportesTipoProducto, this.gridBagConstraintsTipoProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProducto.add(this.jCheckBoxGenerarReporteTipoProducto, this.gridBagConstraintsTipoProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProducto.add(this.jPanelParametrosAuxiliar2TipoProducto, this.gridBagConstraintsTipoProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProducto.add(this.jLabelAccionesTipoProducto, this.gridBagConstraintsTipoProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProducto = new GridBagConstraints();
				this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProducto.add(this.jButtonAbrirOrderByTipoProducto, this.gridBagConstraintsTipoProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProducto.add(this.jComboBoxTiposSeleccionarTipoProducto, this.gridBagConstraintsTipoProducto);			
			
			
			/*
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProducto.add(this.jCheckBoxSeleccionarTodosTipoProducto, this.gridBagConstraintsTipoProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProducto.add(this.jCheckBoxSeleccionarTodosTipoProducto, this.gridBagConstraintsTipoProducto);															
				
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProducto.add(this.jCheckBoxSeleccionadosTipoProducto, this.gridBagConstraintsTipoProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProducto.add(this.jPanelParametrosAuxiliar3TipoProducto, this.gridBagConstraintsTipoProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProducto.add(this.jComboBoxTiposRelacionesTipoProducto, this.gridBagConstraintsTipoProducto);
				
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProducto.add(this.jComboBoxTiposAccionesTipoProducto, this.gridBagConstraintsTipoProducto);
	
				
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProducto.add(this.jTextFieldValorCampoGeneralTipoProducto, this.gridBagConstraintsTipoProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProducto = new GridBagLayout();

			this.jScrollPanelDatosTipoProducto.setLayout(gridaBagLayoutDatosTipoProducto);
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = 0;
			this.gridBagConstraintsTipoProducto.gridx = 0;
			
			this.jScrollPanelDatosTipoProducto.add(this.jTableDatosTipoProducto, this.gridBagConstraintsTipoProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProducto.setViewportView(this.jTableDatosTipoProducto);
		this.jTableDatosTipoProducto.setFillsViewportHeight(true);
		this.jTableDatosTipoProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProducto= new GridBagLayout();
		this.jPanelAccionesTipoProducto.setLayout(gridaBagLayoutAccionesTipoProducto);
		
		
		/*	
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = 0;
		this.gridBagConstraintsTipoProducto.gridx = 0;
			
		this.jPanelAccionesTipoProducto.add(this.jButtonNuevoTipoProducto, this.gridBagConstraintsTipoProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoProducto.setLayout(gridaBagLayoutBusquedaPorCodigoTipoProducto);

		gridBagConstraintsTipoProducto = new GridBagConstraints();
		gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProducto.gridy = 0;
		gridBagConstraintsTipoProducto.gridx = 0;
		jPanelBusquedaPorCodigoTipoProducto.add(jLabelcodigoBusquedaPorCodigoTipoProducto, gridBagConstraintsTipoProducto);

		gridBagConstraintsTipoProducto = new GridBagConstraints();
		gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProducto.gridy = 0;
		gridBagConstraintsTipoProducto.gridx = 1;
		jPanelBusquedaPorCodigoTipoProducto.add(jTextFieldcodigoBusquedaPorCodigoTipoProducto, gridBagConstraintsTipoProducto);

		gridBagConstraintsTipoProducto = new GridBagConstraints();
		gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProducto.gridy = 1;
		gridBagConstraintsTipoProducto.gridx =1;
		jPanelBusquedaPorCodigoTipoProducto.add(jButtonBusquedaPorCodigoTipoProducto, gridBagConstraintsTipoProducto);

		jTabbedPaneBusquedasTipoProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoProducto);
		jTabbedPaneBusquedasTipoProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoProducto.setLayout(gridaBagLayoutBusquedaPorNombreTipoProducto);

		gridBagConstraintsTipoProducto = new GridBagConstraints();
		gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProducto.gridy = 0;
		gridBagConstraintsTipoProducto.gridx = 0;
		jPanelBusquedaPorNombreTipoProducto.add(jLabelnombreBusquedaPorNombreTipoProducto, gridBagConstraintsTipoProducto);

		gridBagConstraintsTipoProducto = new GridBagConstraints();
		gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProducto.gridy = 0;
		gridBagConstraintsTipoProducto.gridx = 1;
		jPanelBusquedaPorNombreTipoProducto.add(jTextAreanombreBusquedaPorNombreTipoProducto, gridBagConstraintsTipoProducto);

		gridBagConstraintsTipoProducto = new GridBagConstraints();
		gridBagConstraintsTipoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProducto.gridy = 1;
		gridBagConstraintsTipoProducto.gridx =1;
		jPanelBusquedaPorNombreTipoProducto.add(jButtonBusquedaPorNombreTipoProducto, gridBagConstraintsTipoProducto);

		jTabbedPaneBusquedasTipoProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoProducto);
		jTabbedPaneBusquedasTipoProducto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();						
			this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProducto.gridx = 0;		
			//this.gridBagConstraintsTipoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProducto, this.gridBagConstraintsTipoProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProducto.gridx = 0;		
		//this.gridBagConstraintsTipoProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProducto.gridx = 0;		
			this.gridBagConstraintsTipoProducto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoProducto, this.gridBagConstraintsTipoProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProducto, this.gridBagConstraintsTipoProducto);								
		
		
		/*
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProducto, this.gridBagConstraintsTipoProducto);
		*/		
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProducto.gridx =0;
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProducto, this.gridBagConstraintsTipoProducto);
				
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProducto, this.gridBagConstraintsTipoProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProducto.setLayout(gridaBagLayoutBusquedasParametrosTipoProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProducto, this.gridBagConstraintsTipoProducto);
			
			
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProducto, this.gridBagConstraintsTipoProducto);
		
			
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProducto, this.gridBagConstraintsTipoProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProducto.setName("jPanelReporteDinamicoTipoProducto"); 
		
		this.jPanelReporteDinamicoTipoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProducto.setLayout(gridaBagLayoutReporteDinamicoTipoProducto);
		
		
		this.jInternalFrameReporteDinamicoTipoProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProducto.add(this.jLabelColumnasSelectReporteTipoProducto, this.gridBagConstraintsTipoProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProducto=new JScrollPane(this.jListColumnasSelectReporteTipoProducto);
			
			this.jScrollColumnasSelectReporteTipoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProducto.add(this.jListColumnasSelectReporteTipoProducto, this.gridBagConstraintsTipoProducto);
		this.jPanelReporteDinamicoTipoProducto.add(this.jScrollColumnasSelectReporteTipoProducto, this.gridBagConstraintsTipoProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProducto.add(this.jLabelRelacionesSelectReporteTipoProducto, this.gridBagConstraintsTipoProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProducto=new JScrollPane(this.jListRelacionesSelectReporteTipoProducto);
			
			this.jScrollRelacionesSelectReporteTipoProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProducto.add(this.jListRelacionesSelectReporteTipoProducto, this.gridBagConstraintsTipoProducto);
		this.jPanelReporteDinamicoTipoProducto.add(this.jScrollRelacionesSelectReporteTipoProducto, this.gridBagConstraintsTipoProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProducto.add(this.jLabelGenerarExcelReporteDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProducto.setToolTipText("Generar EXCEL"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		//this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProducto.add(this.jButtonGenerarExcelReporteDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProducto.add(this.jComboBoxTiposReportesDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProducto.add(this.jLabelTiposArchivoReporteDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProducto.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProducto.setToolTipText("Generar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProducto.add(this.jButtonGenerarReporteDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProducto.setToolTipText("Cancelar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProducto.add(this.jButtonCerrarReporteDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProducto= new JScrollPane(jPanelReporteDinamicoTipoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProducto);
		this.jInternalFrameReporteDinamicoTipoProducto.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProducto, this.gridBagConstraintsTipoProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProducto.setName("jPanelImportacionTipoProducto"); 
		
		this.jPanelImportacionTipoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProducto.setLayout(gridaBagLayoutImportacionTipoProducto);
		
		
		this.jInternalFrameImportacionTipoProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProducto.setResizable(true);
	    this.jInternalFrameImportacionTipoProducto.setClosable(true);
	    this.jInternalFrameImportacionTipoProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProducto.setResizable(true);
	    this.jInternalFrameImportacionTipoProducto.setClosable(true);
	    this.jInternalFrameImportacionTipoProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProducto = new JLabelMe();

		this.jLabelArchivoImportacionTipoProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProducto.add(this.jLabelArchivoImportacionTipoProducto, this.gridBagConstraintsTipoProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProducto = new JFileChooser();		
		this.jFileChooserImportacionTipoProducto.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProducto = new JButtonMe();
		this.jButtonAbrirImportacionTipoProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProducto.setToolTipText("Generar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProducto.add(this.jButtonAbrirImportacionTipoProducto, this.gridBagConstraintsTipoProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProducto.add(this.jLabelPathArchivoImportacionTipoProducto, this.gridBagConstraintsTipoProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProducto.add(this.jTextFieldPathArchivoImportacionTipoProducto, this.gridBagConstraintsTipoProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProducto = new JButtonMe();
		this.jButtonGenerarImportacionTipoProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProducto.setToolTipText("Generar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProducto.add(this.jButtonGenerarImportacionTipoProducto, this.gridBagConstraintsTipoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProducto = new JButtonMe();
		this.jButtonCerrarImportacionTipoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProducto.setToolTipText("Cancelar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProducto.add(this.jButtonCerrarImportacionTipoProducto, this.gridBagConstraintsTipoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProducto= new JScrollPane(jPanelImportacionTipoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProducto = new GridBagConstraints();
		this.gridBagConstraintsTipoProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProducto);
		this.jInternalFrameImportacionTipoProducto.getContentPane().add(this.jScrollPanelImportacionTipoProducto, this.gridBagConstraintsTipoProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProducto = new JButtonMe();
			this.jButtonAbrirOrderByTipoProducto.setText("Orden");
			this.jButtonAbrirOrderByTipoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProducto";
			inputMap = this.jButtonAbrirOrderByTipoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProducto.setName("jPanelOrderByTipoProducto"); 
			
			this.jPanelOrderByTipoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProducto.setLayout(gridaBagLayoutOrderByTipoProducto);
			
			
			this.jTableDatosTipoProductoOrderBy = new JTableMe();        
			this.jTableDatosTipoProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProductoOrderBy.setViewportView(this.jTableDatosTipoProductoOrderBy);
			this.jTableDatosTipoProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProducto.setTitle("Orden");
			this.jInternalFrameOrderByTipoProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProducto.setResizable(true);
			this.jInternalFrameOrderByTipoProducto.setClosable(true);
			this.jInternalFrameOrderByTipoProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProducto.ipady =150;
				
			this.jPanelOrderByTipoProducto.add(jScrollPanelDatosTipoProductoOrderBy, this.gridBagConstraintsTipoProducto);//this.jTableDatosTipoProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProducto = new JButtonMe();
			this.jButtonCerrarOrderByTipoProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProducto.setToolTipText("Cancelar"+" "+TipoProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProducto.add(this.jButtonCerrarOrderByTipoProducto, this.gridBagConstraintsTipoProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProducto= new JScrollPane(jPanelOrderByTipoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProducto = new GridBagConstraints();
			this.gridBagConstraintsTipoProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProducto);
			
			this.jInternalFrameOrderByTipoProducto.getContentPane().add(this.jScrollPanelOrderByTipoProducto, this.gridBagConstraintsTipoProducto);			
		
		} else {
			this.jButtonAbrirOrderByTipoProducto = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=1000;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProducto.getRowHeight();//TipoProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProducto.isSelected()) {
					iHeightTable=TipoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProducto.isSelected()) {
					iHeightTable=TipoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProducto!=null && this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoproductoLogic.getTipoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProducto> TraerTipoProductoBeans(List<TipoProducto> tipoproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProducto tipoproducto:tipoproductos) {
					
				if(!(TipoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoproducto.setsDetalleGeneralEntityReporte(TipoProductoConstantesFunciones.getTipoProductoDescripcion(tipoproducto));
										
						
					
					

					if(tipoproducto.getModeloProductos()!=null && Funciones.existeClass(classes,ModeloProducto.class)) {
						try{tipoproducto.setmodeloproductosDescripcionReporte(new JRBeanCollectionDataSource(ModeloProductoJInternalFrame.TraerModeloProductoBeans(tipoproducto.getModeloProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getMaterialProductos()!=null && Funciones.existeClass(classes,MaterialProducto.class)) {
						try{tipoproducto.setmaterialproductosDescripcionReporte(new JRBeanCollectionDataSource(MaterialProductoJInternalFrame.TraerMaterialProductoBeans(tipoproducto.getMaterialProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getMarcaProductos()!=null && Funciones.existeClass(classes,MarcaProducto.class)) {
						try{tipoproducto.setmarcaproductosDescripcionReporte(new JRBeanCollectionDataSource(MarcaProductoJInternalFrame.TraerMarcaProductoBeans(tipoproducto.getMarcaProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getSegmentoProductos()!=null && Funciones.existeClass(classes,SegmentoProducto.class)) {
						try{tipoproducto.setsegmentoproductosDescripcionReporte(new JRBeanCollectionDataSource(SegmentoProductoJInternalFrame.TraerSegmentoProductoBeans(tipoproducto.getSegmentoProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getColorProductos()!=null && Funciones.existeClass(classes,ColorProducto.class)) {
						try{tipoproducto.setcolorproductosDescripcionReporte(new JRBeanCollectionDataSource(ColorProductoJInternalFrame.TraerColorProductoBeans(tipoproducto.getColorProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getEfectoProductos()!=null && Funciones.existeClass(classes,EfectoProducto.class)) {
						try{tipoproducto.setefectoproductosDescripcionReporte(new JRBeanCollectionDataSource(EfectoProductoJInternalFrame.TraerEfectoProductoBeans(tipoproducto.getEfectoProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getTallaProductos()!=null && Funciones.existeClass(classes,TallaProducto.class)) {
						try{tipoproducto.settallaproductosDescripcionReporte(new JRBeanCollectionDataSource(TallaProductoJInternalFrame.TraerTallaProductoBeans(tipoproducto.getTallaProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{tipoproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(tipoproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getClaseProductos()!=null && Funciones.existeClass(classes,ClaseProducto.class)) {
						try{tipoproducto.setclaseproductosDescripcionReporte(new JRBeanCollectionDataSource(ClaseProductoJInternalFrame.TraerClaseProductoBeans(tipoproducto.getClaseProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{tipoproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(tipoproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoproducto.setsDetalleGeneralEntityReporte(tipoproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoproductobeans.add(tipoproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoproductos;
    }
	//PARA REPORTES FIN
}
