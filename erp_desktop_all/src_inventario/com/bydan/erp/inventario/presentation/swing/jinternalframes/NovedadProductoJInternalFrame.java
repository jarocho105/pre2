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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.inventario.util.NovedadProductoConstantesFunciones;

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
public class NovedadProductoJInternalFrame extends NovedadProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNovedadProducto;
	
	protected JMenuBar jmenuBarNovedadProducto;
	
	protected JMenu jmenuNovedadProducto;
	protected JMenu jmenuDatosNovedadProducto;
	protected JMenu jmenuArchivoNovedadProducto;
	protected JMenu jmenuAccionesNovedadProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedadProducto;	
	protected GridBagConstraints gridBagConstraintsNovedadProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NovedadProductoDetalleFormJInternalFrame jInternalFrameDetalleFormNovedadProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNovedadProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNovedadProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NovedadProductoSessionBean novedadproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NovedadProducto> novedadproductos;		
	public List<NovedadProducto> novedadproductosEliminados;	
	public List<NovedadProducto> novedadproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNovedadProducto;		
	protected JButton jButtonAbrirOrderByNovedadProducto;
	
	
	//protected JPanel jPanelOrderByNovedadProducto;
	//public JScrollPane jScrollPanelOrderByNovedadProducto;	
	//protected JButton jButtonCerrarOrderByNovedadProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NovedadProductoLogic novedadproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNovedadProducto;
	public JScrollPane jScrollPanelDatosEdicionNovedadProducto;
	public JScrollPane jScrollPanelDatosGeneralNovedadProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosNovedadProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNovedadProducto;
	//public JScrollPane jScrollPanelImportacionNovedadProducto;
	
	
	
	protected JPanel jPanelAccionesNovedadProducto;
	
    protected JPanel jPanelPaginacionNovedadProducto;
    protected JPanel jPanelParametrosReportesNovedadProducto;
	protected JPanel jPanelParametrosReportesAccionesNovedadProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NovedadProducto;
	protected JPanel jPanelParametrosAuxiliar2NovedadProducto;
	protected JPanel jPanelParametrosAuxiliar3NovedadProducto;
	protected JPanel jPanelParametrosAuxiliar4NovedadProducto;
	//protected JPanel jPanelParametrosAuxiliar5NovedadProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoNovedadProducto;
	//protected JPanel jPanelImportacionNovedadProducto;
	
	
	public JTable jTableDatosNovedadProducto;
	
	
	
	//public JTable jTableDatosNovedadProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNovedadProducto;
	protected JButton jButtonDuplicarNovedadProducto;
	protected JButton jButtonCopiarNovedadProducto;
	protected JButton jButtonVerFormNovedadProducto;
	protected JButton jButtonNuevoRelacionesNovedadProducto;
	protected JButton jButtonModificarNovedadProducto;
	
    protected JButton jButtonGuardarCambiosTablaNovedadProducto;
	protected JButton jButtonCerrarNovedadProducto;
	
	
	protected JButton jButtonRecargarInformacionNovedadProducto;
	protected JButton jButtonProcesarInformacionNovedadProducto;
	
	
	protected JButton jButtonAnterioresNovedadProducto;
	protected JButton jButtonSiguientesNovedadProducto;
	protected JButton jButtonNuevoGuardarCambiosNovedadProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNovedadProducto;
	//protected JButton jButtonCerrarReporteDinamicoNovedadProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoNovedadProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionNovedadProducto;
	//protected JButton jButtonGenerarImportacionNovedadProducto;
	//protected JButton jButtonCerrarImportacionNovedadProducto;
	//protected JFileChooser jFileChooserImportacionNovedadProducto;
	//protected File fileImportacionNovedadProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedadProducto;
	protected JButton jButtonDuplicarToolBarNovedadProducto;
	protected JButton jButtonNuevoRelacionesToolBarNovedadProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarNovedadProducto;
	protected JButton jButtonCopiarToolBarNovedadProducto;
	protected JButton jButtonVerFormToolBarNovedadProducto;
	public JButton jButtonGuardarCambiosTablaToolBarNovedadProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedadProducto;
	protected JButton jButtonCerrarToolBarNovedadProducto;
	
	protected JButton jButtonRecargarInformacionToolBarNovedadProducto;
	protected JButton jButtonProcesarInformacionToolBarNovedadProducto;
	protected JButton jButtonAnterioresToolBarNovedadProducto;
	protected JButton jButtonSiguientesToolBarNovedadProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarNovedadProducto;
	protected JButton jButtonAbrirOrderByToolBarNovedadProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedadProducto;
	protected JMenuItem jMenuItemDuplicarNovedadProducto;
	protected JMenuItem jMenuItemNuevoRelacionesNovedadProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNovedadProducto;
	protected JMenuItem jMenuItemCopiarNovedadProducto;
	protected JMenuItem jMenuItemVerFormNovedadProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedadProducto;
	protected JMenuItem jMenuItemCerrarNovedadProducto;
	protected JMenuItem jMenuItemDetalleCerrarNovedadProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNovedadProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedadProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionNovedadProducto;
	protected JMenuItem jMenuItemProcesarInformacionNovedadProducto;
	protected JMenuItem jMenuItemAnterioresNovedadProducto;
	protected JMenuItem jMenuItemSiguientesNovedadProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedadProducto;
	protected JMenuItem jMenuItemAbrirOrderByNovedadProducto;
	protected JMenuItem jMenuItemMostrarOcultarNovedadProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedadProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNovedadProducto;
	protected JCheckBox jCheckBoxSeleccionadosNovedadProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNovedadProducto;
	protected JCheckBox jCheckBoxConGraficoReporteNovedadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNovedadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNovedadProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNovedadProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNovedadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNovedadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNovedadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNovedadProducto;
	protected JTextField jTextFieldValorCampoGeneralNovedadProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNovedadProducto;
	//public JList<Reporte> jListColumnasSelectReporteNovedadProducto;
	//public JScrollPane jScrollColumnasSelectReporteNovedadProducto;
	
	//public JLabel jLabelRelacionesSelectReporteNovedadProducto;
	//public JList<Reporte> jListRelacionesSelectReporteNovedadProducto;
	//public JScrollPane jScrollRelacionesSelectReporteNovedadProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNovedadProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNovedadProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNovedadProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoNovedadProducto;
	
		
	//public JLabel jLabelArchivoImportacionNovedadProducto;	
	//public JLabel jLabelPathArchivoImportacionNovedadProducto;
	//protected JTextField jTextFieldPathArchivoImportacionNovedadProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNovedadProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNovedadProducto;
	
	//public JLabel jLabelColumnaCategoriaValorNovedadProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNovedadProducto;
	
	//public JLabel jLabelColumnasValoresGraficoNovedadProducto;
	//public JList<Reporte> jListColumnasValoresGraficoNovedadProducto;
	//public JScrollPane jScrollColumnasValoresGraficoNovedadProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNovedadProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNovedadProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNovedadProducto;
	public JPanel jPanelBusquedaPorCodigoNovedadProducto;
	public JButton jButtonBusquedaPorCodigoNovedadProducto;
	public JPanel jPanelBusquedaPorNombreNovedadProducto;
	public JButton jButtonBusquedaPorNombreNovedadProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoNovedadProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoNovedadProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoNovedadProducto;
	public JButton jButtoncodigoBusquedaPorCodigoNovedadProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreNovedadProducto;
	public JLabel jLabelnombreBusquedaPorNombreNovedadProducto;
	public JTextField jTextFieldnombreBusquedaPorNombreNovedadProducto;
	public JButton jButtonnombreBusquedaPorNombreNovedadProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public NovedadProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNovedadProducto)	{
		this.jButtonRecargarInformacionNovedadProducto = jButtonRecargarInformacionNovedadProducto;
	}
	
	public JButton getjButtonProcesarInformacionNovedadProducto() {
		return this.jButtonProcesarInformacionNovedadProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedadProducto)	{
		this.jButtonProcesarInformacionNovedadProducto = jButtonProcesarInformacionNovedadProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionNovedadProducto() {
		return this.jButtonRecargarInformacionNovedadProducto;
	}
	
	
	public List<NovedadProducto> getnovedadproductos() {
		return this.novedadproductos;
	}

	public void setnovedadproductos(List<NovedadProducto> novedadproductos) {
		this.novedadproductos = novedadproductos;
	}
	
	public List<NovedadProducto> getnovedadproductosAux() {
		return this.novedadproductosAux;
	}

	public void setnovedadproductosAux(List<NovedadProducto> novedadproductosAux) {
		this.novedadproductosAux = novedadproductosAux;
	}
	
	public List<NovedadProducto> getnovedadproductosEliminados() {
		return this.novedadproductosEliminados;
	}

	public void setNovedadProductosEliminados(List<NovedadProducto> novedadproductosEliminados) {
		this.novedadproductosEliminados = novedadproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNovedadProducto() {
		return jComboBoxTiposSeleccionarNovedadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNovedadProducto(
			JComboBox jComboBoxTiposSeleccionarNovedadProducto) {
		this.jComboBoxTiposSeleccionarNovedadProducto = jComboBoxTiposSeleccionarNovedadProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNovedadProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNovedadProducto() {
		return jTextFieldValorCampoGeneralNovedadProducto;
	}

	public void setjTextFieldValorCampoGeneralNovedadProducto(
			JTextField jTextFieldValorCampoGeneralNovedadProducto) {
		this.jTextFieldValorCampoGeneralNovedadProducto = jTextFieldValorCampoGeneralNovedadProducto;
	}

	public void setBorderResaltarValorCampoGeneralNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNovedadProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNovedadProducto() {
		return this.jCheckBoxSeleccionarTodosNovedadProducto;
	}

	public void setjCheckBoxSeleccionarTodosNovedadProducto(
			JCheckBox jCheckBoxSeleccionarTodosNovedadProducto) {
		this.jCheckBoxSeleccionarTodosNovedadProducto = jCheckBoxSeleccionarTodosNovedadProducto;
	}

	public void setBorderResaltarSeleccionarTodosNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNovedadProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNovedadProducto() {
		return this.jCheckBoxSeleccionadosNovedadProducto;
	}

	public void setjCheckBoxSeleccionadosNovedadProducto(
			JCheckBox jCheckBoxSeleccionadosNovedadProducto) {
		this.jCheckBoxSeleccionadosNovedadProducto = jCheckBoxSeleccionadosNovedadProducto;
	}
	
	public void setBorderResaltarSeleccionadosNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNovedadProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNovedadProducto() {
		return this.jComboBoxTiposArchivosReportesNovedadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNovedadProducto(
			JComboBox jComboBoxTiposArchivosReportesNovedadProducto) {
		this.jComboBoxTiposArchivosReportesNovedadProducto = jComboBoxTiposArchivosReportesNovedadProducto;
	}

	public void setBorderResaltarTiposArchivosReportesNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNovedadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNovedadProducto() {
		return this.jComboBoxTiposReportesNovedadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNovedadProducto(
			JComboBox jComboBoxTiposReportesNovedadProducto) {
		this.jComboBoxTiposReportesNovedadProducto = jComboBoxTiposReportesNovedadProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNovedadProducto() {
	//	return jComboBoxTiposReportesDinamicoNovedadProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNovedadProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoNovedadProducto) {
	//	this.jComboBoxTiposReportesDinamicoNovedadProducto = jComboBoxTiposReportesDinamicoNovedadProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNovedadProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoNovedadProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNovedadProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNovedadProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto = jComboBoxTiposArchivosReportesDinamicoNovedadProducto;
	//}
	
	public void setBorderResaltarTiposReportesNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNovedadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNovedadProducto() {
		return this.jComboBoxTiposGraficosReportesNovedadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNovedadProducto(
			JComboBox jComboBoxTiposGraficosReportesNovedadProducto) {
		this.jComboBoxTiposGraficosReportesNovedadProducto = jComboBoxTiposGraficosReportesNovedadProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNovedadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNovedadProducto() {
		return this.jComboBoxTiposPaginacionNovedadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNovedadProducto(
			JComboBox jComboBoxTiposPaginacionNovedadProducto) {
		this.jComboBoxTiposPaginacionNovedadProducto = jComboBoxTiposPaginacionNovedadProducto;
	}
	
	public void setBorderResaltarTiposPaginacionNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNovedadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNovedadProducto() {
		return this.jComboBoxTiposRelacionesNovedadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedadProducto() {
		return this.jComboBoxTiposAccionesNovedadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedadProducto(
			JComboBox jComboBoxTiposRelacionesNovedadProducto) {
		this.jComboBoxTiposRelacionesNovedadProducto = jComboBoxTiposRelacionesNovedadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedadProducto(
			JComboBox jComboBoxTiposAccionesNovedadProducto) {
		this.jComboBoxTiposAccionesNovedadProducto = jComboBoxTiposAccionesNovedadProducto;
	}
	
	public void setBorderResaltarTiposRelacionesNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNovedadProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNovedadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNovedadProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNovedadProducto() {
	//	return jCheckBoxConGraficoDinamicoNovedadProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoNovedadProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoNovedadProducto) {
	//	this.jCheckBoxConGraficoDinamicoNovedadProducto = jCheckBoxConGraficoDinamicoNovedadProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNovedadProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNovedadProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNovedadProducto .setBorder(borderResaltar);		
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
		this.novedadproductoSessionBean=new NovedadProductoSessionBean();
		
		this.novedadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		NovedadProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNovedadProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"nuevo","nuevo","Nuevo"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"duplicar","duplicar","Duplicar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"copiar","copiar","Copiar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"ver_form","ver_form","Ver"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"recargar","recargar","Recargar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNovedadProducto,this.jTtoolBarNovedadProducto,
							"cerrar","cerrar","Salir"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNovedadProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNovedadProducto;
			
				this.jButtonProcesarInformacionToolBarNovedadProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNovedadProducto;
				
		//protected JButton jButtonModificarToolBarNovedadProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNovedadProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNovedadProducto=new JMenuMe("General");
		this.jmenuArchivoNovedadProducto=new JMenuMe("Archivo");
		this.jmenuAccionesNovedadProducto=new JMenuMe("Acciones");
		this.jmenuDatosNovedadProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedadProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedadProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedadProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNovedadProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNovedadProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNovedadProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNovedadProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNovedadProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNovedadProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNovedadProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedadProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedadProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNovedadProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNovedadProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNovedadProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNovedadProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNovedadProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNovedadProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNovedadProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNovedadProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNovedadProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNovedadProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNovedadProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNovedadProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNovedadProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNovedadProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNovedadProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNovedadProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNovedadProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNovedadProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNovedadProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNovedadProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNovedadProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNovedadProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNovedadProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNovedadProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedadProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNovedadProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNovedadProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNovedadProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedadProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNovedadProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNovedadProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNovedadProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNovedadProducto.add(this.jMenuItemCerrarNovedadProducto);
			
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemNuevoNovedadProducto);
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemNuevoGuardarCambiosNovedadProducto);
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemNuevoRelacionesNovedadProducto);
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemGuardarCambiosTablaNovedadProducto);		
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemDuplicarNovedadProducto);		
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemCopiarNovedadProducto);		
			this.jmenuAccionesNovedadProducto.add(this.jMenuItemVerFormNovedadProducto);		
			
			this.jmenuDatosNovedadProducto.add(this.jMenuItemRecargarInformacionNovedadProducto);				
			this.jmenuDatosNovedadProducto.add(this.jMenuItemAnterioresNovedadProducto);				
			this.jmenuDatosNovedadProducto.add(this.jMenuItemSiguientesNovedadProducto);				
			this.jmenuDatosNovedadProducto.add(this.jMenuItemAbrirOrderByNovedadProducto);				
			this.jmenuDatosNovedadProducto.add(this.jMenuItemMostrarOcultarNovedadProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNovedadProducto.add(this.jMenuItemGuardarCambiosNovedadProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNovedadProducto.add(this.jmenuArchivoNovedadProducto);		
			this.jmenuBarNovedadProducto.add(this.jmenuAccionesNovedadProducto);		
			this.jmenuBarNovedadProducto.add(this.jmenuDatosNovedadProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNovedadProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNovedadProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoNovedadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoNovedadProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoNovedadProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoNovedadProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoNovedadProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoNovedadProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoNovedadProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoNovedadProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoNovedadProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoNovedadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoNovedadProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoNovedadProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreNovedadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreNovedadProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreNovedadProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreNovedadProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreNovedadProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreNovedadProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreNovedadProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreNovedadProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreNovedadProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreNovedadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreNovedadProducto= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreNovedadProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNovedadProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasNovedadProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedadProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedadProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNovedadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNovedadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNovedadProducto = new NovedadProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Novedad Producto DATOS");
			this.jInternalFrameDetalleFormNovedadProducto = new NovedadProductoDetalleFormJInternalFrame(jDesktopPane,this.novedadproductoSessionBean.getConGuardarRelaciones(),this.novedadproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNovedadProducto = null;//new NovedadProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedadProducto= new GridBagLayout();
		
		
		this.jTableDatosNovedadProducto = new JTableMe();      
		
		String sToolTipNovedadProducto="";
		sToolTipNovedadProducto=NovedadProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedadProducto+="(Inventario.NovedadProducto)";
		}
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedadProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNovedadProducto.setToolTipText(sToolTipNovedadProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNovedadProducto);
		this.jTableDatosNovedadProducto.setAutoCreateRowSorter(true);
		this.jTableDatosNovedadProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNovedadProducto.setRowSelectionAllowed(true);
		this.jTableDatosNovedadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNovedadProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNovedadProducto = new JButtonMe();
		this.jButtonDuplicarNovedadProducto = new JButtonMe();
		this.jButtonCopiarNovedadProducto = new JButtonMe();
		this.jButtonVerFormNovedadProducto = new JButtonMe();
		this.jButtonNuevoRelacionesNovedadProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNovedadProducto = new JButtonMe();
		this.jButtonCerrarNovedadProducto = new JButtonMe();
		
		this.jScrollPanelDatosNovedadProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralNovedadProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad Producto";
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedadProducto.setToolTipText("Acciones");
        this.jPanelAccionesNovedadProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNovedadProducto=new ReporteDinamicoJInternalFrame(NovedadProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNovedadProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNovedadProducto=new ImportacionJInternalFrame(NovedadProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNovedadProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNovedadProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByNovedadProducto.setText("Orden");
		this.jButtonAbrirOrderByNovedadProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedadProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadProducto,false,this);
			
			//this.cargarOrderByNovedadProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadProducto,true,this);
			
			//this.cargarOrderByNovedadProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNovedadProducto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosNovedadProducto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosNovedadProducto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosNovedadProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedadProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedadProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNovedadProducto.setText("Nuevo");
		this.jButtonDuplicarNovedadProducto.setText("Duplicar");
		this.jButtonCopiarNovedadProducto.setText("Copiar");
		this.jButtonVerFormNovedadProducto.setText("Ver");
		this.jButtonNuevoRelacionesNovedadProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNovedadProducto.setText("Guardar");
		this.jButtonCerrarNovedadProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedadProducto,"nuevo_button","Nuevo",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNovedadProducto,"duplicar_button","Duplicar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNovedadProducto,"copiar_button","Copiar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNovedadProducto,"ver_form","Ver",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNovedadProducto,"nuevorelaciones_button","Nuevo Rel",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedadProducto,"guardarcambiostabla_button","Guardar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedadProducto,"cerrar_button","Salir",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNovedadProducto.setToolTipText("Nuevo"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNovedadProducto.setToolTipText("Duplicar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNovedadProducto.setToolTipText("Copiar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNovedadProducto.setToolTipText("Ver"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNovedadProducto.setToolTipText("Nuevo Rel"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNovedadProducto.setToolTipText("Guardar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedadProducto.setToolTipText("Salir"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedadProducto";
		inputMap = this.jButtonNuevoNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedadProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarNovedadProducto";
		inputMap = this.jButtonDuplicarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNovedadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNovedadProducto"));
		
		//COPIAR
		sMapKey = "CopiarNovedadProducto";
		inputMap = this.jButtonCopiarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNovedadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNovedadProducto"));
		
		//VEr FORM
		sMapKey = "VerFormNovedadProducto";
		inputMap = this.jButtonVerFormNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNovedadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNovedadProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNovedadProducto";
		inputMap = this.jButtonNuevoRelacionesNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNovedadProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNovedadProducto";
		inputMap = this.jButtonModificarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNovedadProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNovedadProducto";
		inputMap = this.jButtonCerrarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedadProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedadProducto";
		inputMap = this.jButtonGuardarCambiosTablaNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedadProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NovedadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NovedadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NovedadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NovedadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NovedadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNovedadProducto.setName("jPanelParametrosReportesNovedadProducto"); 
		
		this.jPanelParametrosReportesAccionesNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNovedadProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNovedadProducto.setName("jPanelParametrosReportesAccionesNovedadProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNovedadProducto = new JButtonMe();
		this.jButtonRecargarInformacionNovedadProducto.setText("Recargar");
		this.jButtonRecargarInformacionNovedadProducto.setToolTipText("Recargar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNovedadProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNovedadProducto = new JButtonMe();
		this.jButtonProcesarInformacionNovedadProducto.setText("Procesar");
		this.jButtonProcesarInformacionNovedadProducto.setToolTipText("Procesar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNovedadProducto.setVisible(false);
			
		this.jButtonProcesarInformacionNovedadProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedadProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedadProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNovedadProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadProducto.setText("TIPO");       
		this.jComboBoxTiposReportesNovedadProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNovedadProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNovedadProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionNovedadProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNovedadProducto.setText("Accion");
		this.jComboBoxTiposRelacionesNovedadProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedadProducto.setText("Accion");
		this.jComboBoxTiposAccionesNovedadProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNovedadProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarNovedadProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNovedadProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNovedadProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedadProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedadProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNovedadProducto = new JLabelMe();
		
		this.jLabelAccionesNovedadProducto.setText("Acciones");		
		this.jLabelAccionesNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNovedadProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNovedadProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNovedadProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNovedadProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNovedadProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNovedadProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNovedadProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNovedadProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNovedadProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNovedadProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNovedadProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteNovedadProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNovedadProducto = new JButtonMe();
		//this.jButtonAnterioresNovedadProducto.setText("<<");
        this.jButtonAnterioresNovedadProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNovedadProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNovedadProducto = new JButtonMe();
		//this.jButtonSiguientesNovedadProducto.setText(">>");
        this.jButtonSiguientesNovedadProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNovedadProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNovedadProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNovedadProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosNovedadProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNovedadProducto,"nuevoguardarcambios_button","Nue",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNovedadProducto";
		inputMap = this.jButtonNuevoGuardarCambiosNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNovedadProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNovedadProducto";
		inputMap = this.jButtonRecargarInformacionNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNovedadProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNovedadProducto";
		inputMap = this.jButtonSiguientesNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNovedadProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNovedadProducto";
		inputMap = this.jButtonAnterioresNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNovedadProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNovedadProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNovedadProducto.setMinimumSize(new Dimension(this.getWidth(),NovedadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedadProducto.setMaximumSize(new Dimension(this.getWidth(),NovedadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedadProducto.setPreferredSize(new Dimension(this.getWidth(),NovedadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNovedadProducto = new GridBagLayout();

			this.jPanelPaginacionNovedadProducto.setLayout(gridaBagLayoutPaginacionNovedadProducto);						
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 0;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNovedadProducto.add(this.jButtonAnterioresNovedadProducto, this.gridBagConstraintsNovedadProducto);
					
						
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedadProducto.gridy = 0;
			
			this.jPanelPaginacionNovedadProducto.add(this.jButtonNuevoGuardarCambiosNovedadProducto, this.gridBagConstraintsNovedadProducto);
						
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedadProducto.gridy = 0;
			this.jPanelPaginacionNovedadProducto.add(this.jButtonSiguientesNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 1;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadProducto.add(this.jButtonNuevoNovedadProducto, this.gridBagConstraintsNovedadProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNovedadProducto.gridy = 1;
				this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNovedadProducto.add(this.jButtonNuevoRelacionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
			}
			
			
			if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNovedadProducto.gridy = 1;
				this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNovedadProducto.add(this.jButtonGuardarCambiosTablaNovedadProducto, this.gridBagConstraintsNovedadProducto);
			}
			
			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 1;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadProducto.add(this.jButtonDuplicarNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 1;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadProducto.add(this.jButtonCopiarNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 1;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadProducto.add(this.jButtonVerFormNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 1;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNovedadProducto.add(this.jButtonCerrarNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
		
		
		this.jButtonRecargarInformacionNovedadProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedadProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedadProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNovedadProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedadProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedadProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNovedadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNovedadProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedadProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedadProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNovedadProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedadProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedadProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNovedadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNovedadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNovedadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNovedadProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedadProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedadProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNovedadProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedadProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedadProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNovedadProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedadProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedadProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNovedadProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedadProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedadProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNovedadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNovedadProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NovedadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NovedadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NovedadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NovedadProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNovedadProducto.setLayout(gridaBagParametrosReportesNovedadProducto);
			this.jPanelParametrosReportesAccionesNovedadProducto.setLayout(gridaBagParametrosReportesAccionesNovedadProducto);
			
			
			this.jPanelParametrosAuxiliar1NovedadProducto.setLayout(gridaBagParametrosAuxiliar1NovedadProducto);
			this.jPanelParametrosAuxiliar2NovedadProducto.setLayout(gridaBagParametrosAuxiliar2NovedadProducto);
			this.jPanelParametrosAuxiliar3NovedadProducto.setLayout(gridaBagParametrosAuxiliar3NovedadProducto);
			this.jPanelParametrosAuxiliar4NovedadProducto.setLayout(gridaBagParametrosAuxiliar4NovedadProducto);
			//this.jPanelParametrosAuxiliar5NovedadProducto.setLayout(gridaBagParametrosAuxiliar2NovedadProducto);			
			
			
			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadProducto.add(this.jButtonRecargarInformacionNovedadProducto, this.gridBagConstraintsNovedadProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadProducto.add(this.jComboBoxTiposPaginacionNovedadProducto, this.gridBagConstraintsNovedadProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadProducto.add(this.jCheckBoxConAltoMaximoTablaNovedadProducto, this.gridBagConstraintsNovedadProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadProducto.add(this.jComboBoxTiposArchivosReportesNovedadProducto, this.gridBagConstraintsNovedadProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadProducto.add(this.jPanelParametrosAuxiliar1NovedadProducto, this.gridBagConstraintsNovedadProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NovedadProducto.add(this.jComboBoxTiposReportesNovedadProducto, this.gridBagConstraintsNovedadProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadProducto.add(this.jPanelParametrosAuxiliar4NovedadProducto, this.gridBagConstraintsNovedadProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadProducto.add(this.jComboBoxTiposReportesNovedadProducto, this.gridBagConstraintsNovedadProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadProducto.add(this.jCheckBoxGenerarReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadProducto.add(this.jPanelParametrosAuxiliar2NovedadProducto, this.gridBagConstraintsNovedadProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadProducto.add(this.jLabelAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNovedadProducto.add(this.jButtonAbrirOrderByNovedadProducto, this.gridBagConstraintsNovedadProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadProducto.add(this.jComboBoxTiposSeleccionarNovedadProducto, this.gridBagConstraintsNovedadProducto);			
			
			
			/*
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadProducto.add(this.jCheckBoxSeleccionarTodosNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NovedadProducto.add(this.jCheckBoxSeleccionarTodosNovedadProducto, this.gridBagConstraintsNovedadProducto);															
				
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NovedadProducto.add(this.jCheckBoxSeleccionadosNovedadProducto, this.gridBagConstraintsNovedadProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadProducto.add(this.jPanelParametrosAuxiliar3NovedadProducto, this.gridBagConstraintsNovedadProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadProducto.add(this.jComboBoxTiposRelacionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
				
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadProducto.add(this.jComboBoxTiposAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
	
				
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadProducto.add(this.jTextFieldValorCampoGeneralNovedadProducto, this.gridBagConstraintsNovedadProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNovedadProducto = new GridBagLayout();

			this.jScrollPanelDatosNovedadProducto.setLayout(gridaBagLayoutDatosNovedadProducto);
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = 0;
			this.gridBagConstraintsNovedadProducto.gridx = 0;
			
			this.jScrollPanelDatosNovedadProducto.add(this.jTableDatosNovedadProducto, this.gridBagConstraintsNovedadProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNovedadProducto.setViewportView(this.jTableDatosNovedadProducto);
		this.jTableDatosNovedadProducto.setFillsViewportHeight(true);
		this.jTableDatosNovedadProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNovedadProducto= new GridBagLayout();
		this.jPanelAccionesNovedadProducto.setLayout(gridaBagLayoutAccionesNovedadProducto);
		
		
		/*	
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx = 0;
			
		this.jPanelAccionesNovedadProducto.add(this.jButtonNuevoNovedadProducto, this.gridBagConstraintsNovedadProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoNovedadProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoNovedadProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoNovedadProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoNovedadProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoNovedadProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoNovedadProducto.setLayout(gridaBagLayoutBusquedaPorCodigoNovedadProducto);

		gridBagConstraintsNovedadProducto = new GridBagConstraints();
		gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadProducto.gridy = 0;
		gridBagConstraintsNovedadProducto.gridx = 0;
		jPanelBusquedaPorCodigoNovedadProducto.add(jLabelcodigoBusquedaPorCodigoNovedadProducto, gridBagConstraintsNovedadProducto);

		gridBagConstraintsNovedadProducto = new GridBagConstraints();
		gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadProducto.gridy = 0;
		gridBagConstraintsNovedadProducto.gridx = 1;
		jPanelBusquedaPorCodigoNovedadProducto.add(jTextFieldcodigoBusquedaPorCodigoNovedadProducto, gridBagConstraintsNovedadProducto);

		gridBagConstraintsNovedadProducto = new GridBagConstraints();
		gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadProducto.gridy = 1;
		gridBagConstraintsNovedadProducto.gridx =1;
		jPanelBusquedaPorCodigoNovedadProducto.add(jButtonBusquedaPorCodigoNovedadProducto, gridBagConstraintsNovedadProducto);

		jTabbedPaneBusquedasNovedadProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoNovedadProducto);
		jTabbedPaneBusquedasNovedadProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreNovedadProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreNovedadProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreNovedadProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreNovedadProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreNovedadProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreNovedadProducto.setLayout(gridaBagLayoutBusquedaPorNombreNovedadProducto);

		gridBagConstraintsNovedadProducto = new GridBagConstraints();
		gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadProducto.gridy = 0;
		gridBagConstraintsNovedadProducto.gridx = 0;
		jPanelBusquedaPorNombreNovedadProducto.add(jLabelnombreBusquedaPorNombreNovedadProducto, gridBagConstraintsNovedadProducto);

		gridBagConstraintsNovedadProducto = new GridBagConstraints();
		gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadProducto.gridy = 0;
		gridBagConstraintsNovedadProducto.gridx = 1;
		jPanelBusquedaPorNombreNovedadProducto.add(jTextFieldnombreBusquedaPorNombreNovedadProducto, gridBagConstraintsNovedadProducto);

		gridBagConstraintsNovedadProducto = new GridBagConstraints();
		gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadProducto.gridy = 1;
		gridBagConstraintsNovedadProducto.gridx =1;
		jPanelBusquedaPorNombreNovedadProducto.add(jButtonBusquedaPorNombreNovedadProducto, gridBagConstraintsNovedadProducto);

		jTabbedPaneBusquedasNovedadProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreNovedadProducto);
		jTabbedPaneBusquedasNovedadProducto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedadProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedadProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();						
			this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadProducto.gridx = 0;		
			//this.gridBagConstraintsNovedadProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedadProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNovedadProducto, this.gridBagConstraintsNovedadProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNovedadProducto.gridx = 0;		
		//this.gridBagConstraintsNovedadProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNovedadProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNovedadProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadProducto.gridx = 0;		
			this.gridBagConstraintsNovedadProducto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNovedadProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNovedadProducto, this.gridBagConstraintsNovedadProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNovedadProducto, this.gridBagConstraintsNovedadProducto);								
		
		
		/*
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
		*/		
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedadProducto.gridx =0;
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedadProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedadProducto, this.gridBagConstraintsNovedadProducto);
				
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNovedadProducto, this.gridBagConstraintsNovedadProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNovedadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedadProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosNovedadProducto.setLayout(gridaBagLayoutBusquedasParametrosNovedadProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNovedadProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
			
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
			
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNovedadProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNovedadProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNovedadProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNovedadProducto.setName("jPanelReporteDinamicoNovedadProducto"); 
		
		this.jPanelReporteDinamicoNovedadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNovedadProducto.setLayout(gridaBagLayoutReporteDinamicoNovedadProducto);
		
		
		this.jInternalFrameReporteDinamicoNovedadProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNovedadProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedadProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNovedadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNovedadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNovedadProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNovedadProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNovedadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNovedadProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoNovedadProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoNovedadProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNovedadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Productoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNovedadProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteNovedadProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNovedadProducto.add(this.jLabelColumnasSelectReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNovedadProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteNovedadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNovedadProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNovedadProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedadProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNovedadProducto=new JScrollPane(this.jListColumnasSelectReporteNovedadProducto);
			
			this.jScrollColumnasSelectReporteNovedadProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedadProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedadProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNovedadProducto.add(this.jListColumnasSelectReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
		this.jPanelReporteDinamicoNovedadProducto.add(this.jScrollColumnasSelectReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNovedadProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteNovedadProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNovedadProducto.add(this.jLabelRelacionesSelectReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNovedadProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteNovedadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNovedadProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNovedadProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedadProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNovedadProducto=new JScrollPane(this.jListRelacionesSelectReporteNovedadProducto);
			
			this.jScrollRelacionesSelectReporteNovedadProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedadProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedadProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNovedadProducto.add(this.jListRelacionesSelectReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
		this.jPanelReporteDinamicoNovedadProducto.add(this.jScrollRelacionesSelectReporteNovedadProducto, this.gridBagConstraintsNovedadProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNovedadProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNovedadProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoNovedadProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNovedadProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNovedadProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNovedadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNovedadProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNovedadProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedadProducto.add(this.jLabelGenerarExcelReporteDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNovedadProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNovedadProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNovedadProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNovedadProducto.setToolTipText("Generar EXCEL"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		//this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNovedadProducto.add(this.jButtonGenerarExcelReporteDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadProducto.add(this.jComboBoxTiposReportesDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNovedadProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNovedadProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedadProducto.add(this.jLabelTiposArchivoReporteDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadProducto.add(this.jComboBoxTiposArchivosReportesDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNovedadProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNovedadProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNovedadProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNovedadProducto.setToolTipText("Generar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadProducto.add(this.jButtonGenerarReporteDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNovedadProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNovedadProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNovedadProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNovedadProducto.setToolTipText("Cancelar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadProducto.add(this.jButtonCerrarReporteDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNovedadProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNovedadProducto= new JScrollPane(jPanelReporteDinamicoNovedadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNovedadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Productoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNovedadProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNovedadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNovedadProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNovedadProducto);
		this.jInternalFrameReporteDinamicoNovedadProducto.getContentPane().add(this.jScrollPanelReporteDinamicoNovedadProducto, this.gridBagConstraintsNovedadProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNovedadProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNovedadProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNovedadProducto.setName("jPanelImportacionNovedadProducto"); 
		
		this.jPanelImportacionNovedadProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedadProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedadProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNovedadProducto.setLayout(gridaBagLayoutImportacionNovedadProducto);
		
		
		this.jInternalFrameImportacionNovedadProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNovedadProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNovedadProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedadProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNovedadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedadProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNovedadProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedadProducto.setResizable(true);
	    this.jInternalFrameImportacionNovedadProducto.setClosable(true);
	    this.jInternalFrameImportacionNovedadProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNovedadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedadProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNovedadProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedadProducto.setResizable(true);
	    this.jInternalFrameImportacionNovedadProducto.setClosable(true);
	    this.jInternalFrameImportacionNovedadProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNovedadProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedadProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedadProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Productoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNovedadProducto = new JLabelMe();

		this.jLabelArchivoImportacionNovedadProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedadProducto.add(this.jLabelArchivoImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNovedadProducto = new JFileChooser();		
		this.jFileChooserImportacionNovedadProducto.setToolTipText("ESCOGER ARCHIVO"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNovedadProducto = new JButtonMe();
		this.jButtonAbrirImportacionNovedadProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNovedadProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNovedadProducto.setToolTipText("Generar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadProducto.add(this.jButtonAbrirImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNovedadProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionNovedadProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedadProducto.add(this.jLabelPathArchivoImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNovedadProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNovedadProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedadProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedadProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadProducto.add(this.jTextFieldPathArchivoImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNovedadProducto = new JButtonMe();
		this.jButtonGenerarImportacionNovedadProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNovedadProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNovedadProducto.setToolTipText("Generar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadProducto.add(this.jButtonGenerarImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNovedadProducto = new JButtonMe();
		this.jButtonCerrarImportacionNovedadProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNovedadProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNovedadProducto.setToolTipText("Cancelar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadProducto.add(this.jButtonCerrarImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNovedadProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionNovedadProducto= new JScrollPane(jPanelImportacionNovedadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsNovedadProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNovedadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNovedadProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNovedadProducto);
		this.jInternalFrameImportacionNovedadProducto.getContentPane().add(this.jScrollPanelImportacionNovedadProducto, this.gridBagConstraintsNovedadProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNovedadProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNovedadProducto = new JButtonMe();
			this.jButtonAbrirOrderByNovedadProducto.setText("Orden");
			this.jButtonAbrirOrderByNovedadProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedadProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNovedadProducto";
			inputMap = this.jButtonAbrirOrderByNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNovedadProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByNovedadProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNovedadProducto.setName("jPanelOrderByNovedadProducto"); 
			
			this.jPanelOrderByNovedadProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedadProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedadProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNovedadProducto.setLayout(gridaBagLayoutOrderByNovedadProducto);
			
			
			this.jTableDatosNovedadProductoOrderBy = new JTableMe();        
			this.jTableDatosNovedadProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNovedadProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNovedadProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNovedadProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNovedadProductoOrderBy.setViewportView(this.jTableDatosNovedadProductoOrderBy);
			this.jTableDatosNovedadProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNovedadProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNovedadProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNovedadProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNovedadProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNovedadProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNovedadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNovedadProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNovedadProducto.setTitle("Orden");
			this.jInternalFrameOrderByNovedadProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNovedadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNovedadProducto.setResizable(true);
			this.jInternalFrameOrderByNovedadProducto.setClosable(true);
			this.jInternalFrameOrderByNovedadProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNovedadProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedadProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedadProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Productoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNovedadProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNovedadProducto.ipady =150;
				
			this.jPanelOrderByNovedadProducto.add(jScrollPanelDatosNovedadProductoOrderBy, this.gridBagConstraintsNovedadProducto);//this.jTableDatosNovedadProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNovedadProducto = new JButtonMe();
			this.jButtonCerrarOrderByNovedadProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNovedadProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNovedadProducto.setToolTipText("Cancelar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNovedadProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNovedadProducto.add(this.jButtonCerrarOrderByNovedadProducto, this.gridBagConstraintsNovedadProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNovedadProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByNovedadProducto= new JScrollPane(jPanelOrderByNovedadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsNovedadProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNovedadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNovedadProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNovedadProducto);
			
			this.jInternalFrameOrderByNovedadProducto.getContentPane().add(this.jScrollPanelOrderByNovedadProducto, this.gridBagConstraintsNovedadProducto);			
		
		} else {
			this.jButtonAbrirOrderByNovedadProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.novedadproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNovedadProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNovedadProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNovedadProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNovedadProducto.getRowHeight();//NovedadProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NovedadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedadProducto.isSelected()) {
					iHeightTable=NovedadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NovedadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedadProducto.isSelected()) {
					iHeightTable=NovedadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNovedadProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedadProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedadProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNovedadProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedadProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedadProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNovedadProducto!=null && this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNovedadProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNovedadProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNovedadProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNovedadProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedadProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedadProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=novedadproductoLogic.getNovedadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NovedadProducto> TraerNovedadProductoBeans(List<NovedadProducto> novedadproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(NovedadProducto novedadproducto:novedadproductos) {
					
				if(!(NovedadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NovedadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					novedadproducto.setsDetalleGeneralEntityReporte(NovedadProductoConstantesFunciones.getNovedadProductoDescripcion(novedadproducto));
										
						
					
					

					if(novedadproducto.getDetalleFacturaProveedors()!=null && Funciones.existeClass(classes,DetalleFacturaProveedor.class)) {
						try{novedadproducto.setdetallefacturaproveedorsDescripcionReporte(new JRBeanCollectionDataSource(DetalleFacturaProveedorJInternalFrame.TraerDetalleFacturaProveedorBeans(novedadproducto.getDetalleFacturaProveedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(novedadproducto.getNovedadSeguimientos()!=null && Funciones.existeClass(classes,NovedadSeguimiento.class)) {
						try{novedadproducto.setnovedadseguimientosDescripcionReporte(new JRBeanCollectionDataSource(NovedadSeguimientoJInternalFrame.TraerNovedadSeguimientoBeans(novedadproducto.getNovedadSeguimientos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(novedadproducto.getDetalleTransferencias()!=null && Funciones.existeClass(classes,DetalleTransferencia.class)) {
						try{novedadproducto.setdetalletransferenciasDescripcionReporte(new JRBeanCollectionDataSource(DetalleTransferenciaJInternalFrame.TraerDetalleTransferenciaBeans(novedadproducto.getDetalleTransferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(novedadproducto.getDetalleMovimientoInventarios()!=null && Funciones.existeClass(classes,DetalleMovimientoInventario.class)) {
						try{novedadproducto.setdetallemovimientoinventariosDescripcionReporte(new JRBeanCollectionDataSource(DetalleMovimientoInventarioJInternalFrame.TraerDetalleMovimientoInventarioBeans(novedadproducto.getDetalleMovimientoInventarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(novedadproducto.getDetalleOrdenCompras()!=null && Funciones.existeClass(classes,DetalleOrdenCompra.class)) {
						try{novedadproducto.setdetalleordencomprasDescripcionReporte(new JRBeanCollectionDataSource(DetalleOrdenCompraJInternalFrame.TraerDetalleOrdenCompraBeans(novedadproducto.getDetalleOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//novedadproducto.setsDetalleGeneralEntityReporte(novedadproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//novedadproductobeans.add(novedadproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return novedadproductos;
    }
	//PARA REPORTES FIN
}
