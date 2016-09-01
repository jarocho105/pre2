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
import com.bydan.erp.inventario.util.GrupoColorConstantesFunciones;

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
public class GrupoColorJInternalFrame extends GrupoColorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGrupoColor;
	
	protected JMenuBar jmenuBarGrupoColor;
	
	protected JMenu jmenuGrupoColor;
	protected JMenu jmenuDatosGrupoColor;
	protected JMenu jmenuArchivoGrupoColor;
	protected JMenu jmenuAccionesGrupoColor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoColor;	
	protected GridBagConstraints gridBagConstraintsGrupoColor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GrupoColorDetalleFormJInternalFrame jInternalFrameDetalleFormGrupoColor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGrupoColor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGrupoColor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public GrupoColorSessionBean grupocolorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GrupoColor> grupocolors;		
	public List<GrupoColor> grupocolorsEliminados;	
	public List<GrupoColor> grupocolorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGrupoColor;		
	protected JButton jButtonAbrirOrderByGrupoColor;
	
	
	//protected JPanel jPanelOrderByGrupoColor;
	//public JScrollPane jScrollPanelOrderByGrupoColor;	
	//protected JButton jButtonCerrarOrderByGrupoColor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GrupoColorLogic grupocolorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGrupoColor;
	public JScrollPane jScrollPanelDatosEdicionGrupoColor;
	public JScrollPane jScrollPanelDatosGeneralGrupoColor;
    
	
	
	//public JScrollPane jScrollPanelDatosGrupoColorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGrupoColor;
	//public JScrollPane jScrollPanelImportacionGrupoColor;
	
	
	
	protected JPanel jPanelAccionesGrupoColor;
	
    protected JPanel jPanelPaginacionGrupoColor;
    protected JPanel jPanelParametrosReportesGrupoColor;
	protected JPanel jPanelParametrosReportesAccionesGrupoColor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GrupoColor;
	protected JPanel jPanelParametrosAuxiliar2GrupoColor;
	protected JPanel jPanelParametrosAuxiliar3GrupoColor;
	protected JPanel jPanelParametrosAuxiliar4GrupoColor;
	//protected JPanel jPanelParametrosAuxiliar5GrupoColor;
	
	
	
	//protected JPanel jPanelReporteDinamicoGrupoColor;
	//protected JPanel jPanelImportacionGrupoColor;
	
	
	public JTable jTableDatosGrupoColor;
	
	
	
	//public JTable jTableDatosGrupoColorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGrupoColor;
	protected JButton jButtonDuplicarGrupoColor;
	protected JButton jButtonCopiarGrupoColor;
	protected JButton jButtonVerFormGrupoColor;
	protected JButton jButtonNuevoRelacionesGrupoColor;
	protected JButton jButtonModificarGrupoColor;
	
    protected JButton jButtonGuardarCambiosTablaGrupoColor;
	protected JButton jButtonCerrarGrupoColor;
	
	
	protected JButton jButtonRecargarInformacionGrupoColor;
	protected JButton jButtonProcesarInformacionGrupoColor;
	
	
	protected JButton jButtonAnterioresGrupoColor;
	protected JButton jButtonSiguientesGrupoColor;
	protected JButton jButtonNuevoGuardarCambiosGrupoColor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGrupoColor;
	//protected JButton jButtonCerrarReporteDinamicoGrupoColor;
	//protected JButton jButtonGenerarExcelReporteDinamicoGrupoColor;	
	
	
	
	//protected JButton jButtonAbrirImportacionGrupoColor;
	//protected JButton jButtonGenerarImportacionGrupoColor;
	//protected JButton jButtonCerrarImportacionGrupoColor;
	//protected JFileChooser jFileChooserImportacionGrupoColor;
	//protected File fileImportacionGrupoColor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoColor;
	protected JButton jButtonDuplicarToolBarGrupoColor;
	protected JButton jButtonNuevoRelacionesToolBarGrupoColor;
	
	
	public JButton jButtonGuardarCambiosToolBarGrupoColor;
	protected JButton jButtonCopiarToolBarGrupoColor;
	protected JButton jButtonVerFormToolBarGrupoColor;
	public JButton jButtonGuardarCambiosTablaToolBarGrupoColor;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoColor;
	protected JButton jButtonCerrarToolBarGrupoColor;
	
	protected JButton jButtonRecargarInformacionToolBarGrupoColor;
	protected JButton jButtonProcesarInformacionToolBarGrupoColor;
	protected JButton jButtonAnterioresToolBarGrupoColor;
	protected JButton jButtonSiguientesToolBarGrupoColor;
	protected JButton jButtonNuevoGuardarCambiosToolBarGrupoColor;
	protected JButton jButtonAbrirOrderByToolBarGrupoColor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoColor;
	protected JMenuItem jMenuItemDuplicarGrupoColor;
	protected JMenuItem jMenuItemNuevoRelacionesGrupoColor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGrupoColor;
	protected JMenuItem jMenuItemCopiarGrupoColor;
	protected JMenuItem jMenuItemVerFormGrupoColor;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoColor;
	protected JMenuItem jMenuItemCerrarGrupoColor;
	protected JMenuItem jMenuItemDetalleCerrarGrupoColor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGrupoColor;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoColor;
	
	protected JMenuItem jMenuItemRecargarInformacionGrupoColor;
	protected JMenuItem jMenuItemProcesarInformacionGrupoColor;
	protected JMenuItem jMenuItemAnterioresGrupoColor;
	protected JMenuItem jMenuItemSiguientesGrupoColor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoColor;
	protected JMenuItem jMenuItemAbrirOrderByGrupoColor;
	protected JMenuItem jMenuItemMostrarOcultarGrupoColor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoColor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGrupoColor;
	protected JCheckBox jCheckBoxSeleccionadosGrupoColor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGrupoColor;
	protected JCheckBox jCheckBoxConGraficoReporteGrupoColor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGrupoColor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGrupoColor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoColor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGrupoColor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGrupoColor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGrupoColor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoColor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoColor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGrupoColor;
	protected JTextField jTextFieldValorCampoGeneralGrupoColor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGrupoColor;
	//public JList<Reporte> jListColumnasSelectReporteGrupoColor;
	//public JScrollPane jScrollColumnasSelectReporteGrupoColor;
	
	//public JLabel jLabelRelacionesSelectReporteGrupoColor;
	//public JList<Reporte> jListRelacionesSelectReporteGrupoColor;
	//public JScrollPane jScrollRelacionesSelectReporteGrupoColor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGrupoColor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGrupoColor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGrupoColor;
	//public JLabel jLabelTiposArchivoReporteDinamicoGrupoColor;
	
		
	//public JLabel jLabelArchivoImportacionGrupoColor;	
	//public JLabel jLabelPathArchivoImportacionGrupoColor;
	//protected JTextField jTextFieldPathArchivoImportacionGrupoColor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGrupoColor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGrupoColor;
	
	//public JLabel jLabelColumnaCategoriaValorGrupoColor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGrupoColor;
	
	//public JLabel jLabelColumnasValoresGraficoGrupoColor;
	//public JList<Reporte> jListColumnasValoresGraficoGrupoColor;
	//public JScrollPane jScrollColumnasValoresGraficoGrupoColor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGrupoColor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGrupoColor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGrupoColor;
	public JPanel jPanelBusquedaPorCodigoGrupoColor;
	public JButton jButtonBusquedaPorCodigoGrupoColor;
	public JPanel jPanelBusquedaPorNombreGrupoColor;
	public JButton jButtonBusquedaPorNombreGrupoColor;
	
	public JPanel jPanelcodigoBusquedaPorCodigoGrupoColor;
	public JLabel jLabelcodigoBusquedaPorCodigoGrupoColor;
	public JTextField jTextFieldcodigoBusquedaPorCodigoGrupoColor;
	public JButton jButtoncodigoBusquedaPorCodigoGrupoColorBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreGrupoColor;
	public JLabel jLabelnombreBusquedaPorNombreGrupoColor;
	public JTextArea jTextAreanombreBusquedaPorNombreGrupoColor;
	public JButton jButtonnombreBusquedaPorNombreGrupoColorBusqueda= new JButtonMe();

	
	
	
	
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
	public GrupoColorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGrupoColor)	{
		this.jButtonRecargarInformacionGrupoColor = jButtonRecargarInformacionGrupoColor;
	}
	
	public JButton getjButtonProcesarInformacionGrupoColor() {
		return this.jButtonProcesarInformacionGrupoColor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoColor)	{
		this.jButtonProcesarInformacionGrupoColor = jButtonProcesarInformacionGrupoColor;
	}
	
	
	public JButton getjButtonRecargarInformacionGrupoColor() {
		return this.jButtonRecargarInformacionGrupoColor;
	}
	
	
	public List<GrupoColor> getgrupocolors() {
		return this.grupocolors;
	}

	public void setgrupocolors(List<GrupoColor> grupocolors) {
		this.grupocolors = grupocolors;
	}
	
	public List<GrupoColor> getgrupocolorsAux() {
		return this.grupocolorsAux;
	}

	public void setgrupocolorsAux(List<GrupoColor> grupocolorsAux) {
		this.grupocolorsAux = grupocolorsAux;
	}
	
	public List<GrupoColor> getgrupocolorsEliminados() {
		return this.grupocolorsEliminados;
	}

	public void setGrupoColorsEliminados(List<GrupoColor> grupocolorsEliminados) {
		this.grupocolorsEliminados = grupocolorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGrupoColor() {
		return jComboBoxTiposSeleccionarGrupoColor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGrupoColor(
			JComboBox jComboBoxTiposSeleccionarGrupoColor) {
		this.jComboBoxTiposSeleccionarGrupoColor = jComboBoxTiposSeleccionarGrupoColor;
	}
	
	public void setBorderResaltarTiposSeleccionarGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGrupoColor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGrupoColor() {
		return jTextFieldValorCampoGeneralGrupoColor;
	}

	public void setjTextFieldValorCampoGeneralGrupoColor(
			JTextField jTextFieldValorCampoGeneralGrupoColor) {
		this.jTextFieldValorCampoGeneralGrupoColor = jTextFieldValorCampoGeneralGrupoColor;
	}

	public void setBorderResaltarValorCampoGeneralGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGrupoColor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGrupoColor() {
		return this.jCheckBoxSeleccionarTodosGrupoColor;
	}

	public void setjCheckBoxSeleccionarTodosGrupoColor(
			JCheckBox jCheckBoxSeleccionarTodosGrupoColor) {
		this.jCheckBoxSeleccionarTodosGrupoColor = jCheckBoxSeleccionarTodosGrupoColor;
	}

	public void setBorderResaltarSeleccionarTodosGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGrupoColor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGrupoColor() {
		return this.jCheckBoxSeleccionadosGrupoColor;
	}

	public void setjCheckBoxSeleccionadosGrupoColor(
			JCheckBox jCheckBoxSeleccionadosGrupoColor) {
		this.jCheckBoxSeleccionadosGrupoColor = jCheckBoxSeleccionadosGrupoColor;
	}
	
	public void setBorderResaltarSeleccionadosGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGrupoColor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGrupoColor() {
		return this.jComboBoxTiposArchivosReportesGrupoColor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGrupoColor(
			JComboBox jComboBoxTiposArchivosReportesGrupoColor) {
		this.jComboBoxTiposArchivosReportesGrupoColor = jComboBoxTiposArchivosReportesGrupoColor;
	}

	public void setBorderResaltarTiposArchivosReportesGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGrupoColor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGrupoColor() {
		return this.jComboBoxTiposReportesGrupoColor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGrupoColor(
			JComboBox jComboBoxTiposReportesGrupoColor) {
		this.jComboBoxTiposReportesGrupoColor = jComboBoxTiposReportesGrupoColor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGrupoColor() {
	//	return jComboBoxTiposReportesDinamicoGrupoColor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGrupoColor(
	//		JComboBox jComboBoxTiposReportesDinamicoGrupoColor) {
	//	this.jComboBoxTiposReportesDinamicoGrupoColor = jComboBoxTiposReportesDinamicoGrupoColor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGrupoColor() {
	//	return jComboBoxTiposArchivosReportesDinamicoGrupoColor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGrupoColor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoColor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGrupoColor = jComboBoxTiposArchivosReportesDinamicoGrupoColor;
	//}
	
	public void setBorderResaltarTiposReportesGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGrupoColor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGrupoColor() {
		return this.jComboBoxTiposGraficosReportesGrupoColor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGrupoColor(
			JComboBox jComboBoxTiposGraficosReportesGrupoColor) {
		this.jComboBoxTiposGraficosReportesGrupoColor = jComboBoxTiposGraficosReportesGrupoColor;
	}
	
	public void setBorderResaltarTiposGraficosReportesGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGrupoColor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGrupoColor() {
		return this.jComboBoxTiposPaginacionGrupoColor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGrupoColor(
			JComboBox jComboBoxTiposPaginacionGrupoColor) {
		this.jComboBoxTiposPaginacionGrupoColor = jComboBoxTiposPaginacionGrupoColor;
	}
	
	public void setBorderResaltarTiposPaginacionGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGrupoColor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGrupoColor() {
		return this.jComboBoxTiposRelacionesGrupoColor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoColor() {
		return this.jComboBoxTiposAccionesGrupoColor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoColor(
			JComboBox jComboBoxTiposRelacionesGrupoColor) {
		this.jComboBoxTiposRelacionesGrupoColor = jComboBoxTiposRelacionesGrupoColor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoColor(
			JComboBox jComboBoxTiposAccionesGrupoColor) {
		this.jComboBoxTiposAccionesGrupoColor = jComboBoxTiposAccionesGrupoColor;
	}
	
	public void setBorderResaltarTiposRelacionesGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGrupoColor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGrupoColor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoColor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGrupoColor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGrupoColor() {
	//	return jCheckBoxConGraficoDinamicoGrupoColor;
	//}

	//public void setjCheckBoxConGraficoDinamicoGrupoColor(
	//		JCheckBox jCheckBoxConGraficoDinamicoGrupoColor) {
	//	this.jCheckBoxConGraficoDinamicoGrupoColor = jCheckBoxConGraficoDinamicoGrupoColor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGrupoColor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGrupoColor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGrupoColor .setBorder(borderResaltar);		
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
		this.grupocolorSessionBean=new GrupoColorSessionBean();
		
		this.grupocolorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupocolorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupocolorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoColorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Color MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
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
		
		GrupoColorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGrupoColor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"nuevo","nuevo","Nuevo"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"duplicar","duplicar","Duplicar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"copiar","copiar","Copiar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"ver_form","ver_form","Ver"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"recargar","recargar","Recargar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGrupoColor,this.jTtoolBarGrupoColor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGrupoColor,this.jTtoolBarGrupoColor,
							"cerrar","cerrar","Salir"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGrupoColor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGrupoColor;
			
				this.jButtonProcesarInformacionToolBarGrupoColor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGrupoColor;
				
		//protected JButton jButtonModificarToolBarGrupoColor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGrupoColor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGrupoColor=new JMenuMe("General");
		this.jmenuArchivoGrupoColor=new JMenuMe("Archivo");
		this.jmenuAccionesGrupoColor=new JMenuMe("Acciones");
		this.jmenuDatosGrupoColor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoColor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoColor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoColor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGrupoColor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGrupoColor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGrupoColor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGrupoColor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGrupoColor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGrupoColor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGrupoColor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoColor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoColor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGrupoColor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGrupoColor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGrupoColor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGrupoColor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGrupoColor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGrupoColor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGrupoColor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGrupoColor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGrupoColor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoColor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoColor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoColor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGrupoColor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGrupoColor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGrupoColor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGrupoColor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGrupoColor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGrupoColor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGrupoColor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGrupoColor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGrupoColor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGrupoColor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGrupoColor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGrupoColor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGrupoColor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGrupoColor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGrupoColor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoColor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoColor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoColor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGrupoColor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGrupoColor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGrupoColor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoColor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoColor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoColor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGrupoColor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGrupoColor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGrupoColor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGrupoColor.add(this.jMenuItemCerrarGrupoColor);
			
			this.jmenuAccionesGrupoColor.add(this.jMenuItemNuevoGrupoColor);
			this.jmenuAccionesGrupoColor.add(this.jMenuItemNuevoGuardarCambiosGrupoColor);
			this.jmenuAccionesGrupoColor.add(this.jMenuItemNuevoRelacionesGrupoColor);
			this.jmenuAccionesGrupoColor.add(this.jMenuItemGuardarCambiosTablaGrupoColor);		
			this.jmenuAccionesGrupoColor.add(this.jMenuItemDuplicarGrupoColor);		
			this.jmenuAccionesGrupoColor.add(this.jMenuItemCopiarGrupoColor);		
			this.jmenuAccionesGrupoColor.add(this.jMenuItemVerFormGrupoColor);		
			
			this.jmenuDatosGrupoColor.add(this.jMenuItemRecargarInformacionGrupoColor);				
			this.jmenuDatosGrupoColor.add(this.jMenuItemAnterioresGrupoColor);				
			this.jmenuDatosGrupoColor.add(this.jMenuItemSiguientesGrupoColor);				
			this.jmenuDatosGrupoColor.add(this.jMenuItemAbrirOrderByGrupoColor);				
			this.jmenuDatosGrupoColor.add(this.jMenuItemMostrarOcultarGrupoColor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGrupoColor.add(this.jMenuItemGuardarCambiosGrupoColor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGrupoColor.add(this.jmenuArchivoGrupoColor);		
			this.jmenuBarGrupoColor.add(this.jmenuAccionesGrupoColor);		
			this.jmenuBarGrupoColor.add(this.jmenuDatosGrupoColor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGrupoColor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGrupoColor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoGrupoColor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoGrupoColor.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoGrupoColor= new JButtonMe();
		this.jButtonBusquedaPorCodigoGrupoColor.setText("Buscar");
		this.jButtonBusquedaPorCodigoGrupoColor.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoGrupoColor,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoGrupoColor = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoGrupoColor.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoGrupoColor.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoGrupoColor,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoGrupoColor= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoGrupoColor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreGrupoColor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreGrupoColor.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreGrupoColor= new JButtonMe();
		this.jButtonBusquedaPorNombreGrupoColor.setText("Buscar");
		this.jButtonBusquedaPorNombreGrupoColor.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreGrupoColor,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreGrupoColor = new JLabelMe();
		jLabelnombreBusquedaPorNombreGrupoColor.setText("Nombre :");
		jLabelnombreBusquedaPorNombreGrupoColor.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreGrupoColor,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreGrupoColor= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreGrupoColor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGrupoColor=new JTabbedPane();


		this.jTabbedPaneBusquedasGrupoColor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoColor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoColor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGrupoColor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGrupoColor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGrupoColor = new GrupoColorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Grupo Color DATOS");
			this.jInternalFrameDetalleFormGrupoColor = new GrupoColorDetalleFormJInternalFrame(jDesktopPane,this.grupocolorSessionBean.getConGuardarRelaciones(),this.grupocolorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGrupoColor = null;//new GrupoColorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoColor= new GridBagLayout();
		
		
		this.jTableDatosGrupoColor = new JTableMe();      
		
		String sToolTipGrupoColor="";
		sToolTipGrupoColor=GrupoColorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoColor+="(Inventario.GrupoColor)";
		}
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoColor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGrupoColor.setToolTipText(sToolTipGrupoColor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGrupoColor);
		this.jTableDatosGrupoColor.setAutoCreateRowSorter(true);
		this.jTableDatosGrupoColor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGrupoColor.setRowSelectionAllowed(true);
		this.jTableDatosGrupoColor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGrupoColor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGrupoColor = new JButtonMe();
		this.jButtonDuplicarGrupoColor = new JButtonMe();
		this.jButtonCopiarGrupoColor = new JButtonMe();
		this.jButtonVerFormGrupoColor = new JButtonMe();
		this.jButtonNuevoRelacionesGrupoColor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGrupoColor = new JButtonMe();
		this.jButtonCerrarGrupoColor = new JButtonMe();
		
		this.jScrollPanelDatosGrupoColor = new JScrollPane();   
        this.jScrollPanelDatosGeneralGrupoColor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Color";
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Colores" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoColor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoColor.setToolTipText("Acciones");
        this.jPanelAccionesGrupoColor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGrupoColor=new ReporteDinamicoJInternalFrame(GrupoColorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGrupoColor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGrupoColor=new ImportacionJInternalFrame(GrupoColorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGrupoColor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGrupoColor = new JButtonMe();
		
		this.jButtonAbrirOrderByGrupoColor.setText("Orden");
		this.jButtonAbrirOrderByGrupoColor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoColor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoColor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoColor,false,this);
			
			//this.cargarOrderByGrupoColor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoColor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoColor,true,this);
			
			//this.cargarOrderByGrupoColor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGrupoColor.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosGrupoColor.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosGrupoColor.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosGrupoColor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoColor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoColor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGrupoColor.setText("Nuevo");
		this.jButtonDuplicarGrupoColor.setText("Duplicar");
		this.jButtonCopiarGrupoColor.setText("Copiar");
		this.jButtonVerFormGrupoColor.setText("Ver");
		this.jButtonNuevoRelacionesGrupoColor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGrupoColor.setText("Guardar");
		this.jButtonCerrarGrupoColor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoColor,"nuevo_button","Nuevo",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGrupoColor,"duplicar_button","Duplicar",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGrupoColor,"copiar_button","Copiar",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGrupoColor,"ver_form","Ver",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGrupoColor,"nuevorelaciones_button","Nuevo Rel",this.grupocolorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoColor,"guardarcambiostabla_button","Guardar",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoColor,"cerrar_button","Salir",this.grupocolorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGrupoColor.setToolTipText("Nuevo"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGrupoColor.setToolTipText("Duplicar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGrupoColor.setToolTipText("Copiar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGrupoColor.setToolTipText("Ver"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGrupoColor.setToolTipText("Nuevo Rel"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGrupoColor.setToolTipText("Guardar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoColor.setToolTipText("Salir"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoColor";
		inputMap = this.jButtonNuevoGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoColor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoColor"));
		
		//DUPLICAR
		sMapKey = "DuplicarGrupoColor";
		inputMap = this.jButtonDuplicarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGrupoColor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGrupoColor"));
		
		//COPIAR
		sMapKey = "CopiarGrupoColor";
		inputMap = this.jButtonCopiarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGrupoColor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGrupoColor"));
		
		//VEr FORM
		sMapKey = "VerFormGrupoColor";
		inputMap = this.jButtonVerFormGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGrupoColor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGrupoColor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGrupoColor";
		inputMap = this.jButtonNuevoRelacionesGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGrupoColor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGrupoColor";
		inputMap = this.jButtonModificarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGrupoColor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGrupoColor";
		inputMap = this.jButtonCerrarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoColor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoColor";
		inputMap = this.jButtonGuardarCambiosTablaGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoColor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GrupoColor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GrupoColor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GrupoColor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GrupoColor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GrupoColor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGrupoColor.setName("jPanelParametrosReportesGrupoColor"); 
		
		this.jPanelParametrosReportesAccionesGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGrupoColor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGrupoColor.setName("jPanelParametrosReportesAccionesGrupoColor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGrupoColor = new JButtonMe();
		this.jButtonRecargarInformacionGrupoColor.setText("Recargar");
		this.jButtonRecargarInformacionGrupoColor.setToolTipText("Recargar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGrupoColor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGrupoColor = new JButtonMe();
		this.jButtonProcesarInformacionGrupoColor.setText("Procesar");
		this.jButtonProcesarInformacionGrupoColor.setToolTipText("Procesar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGrupoColor.setVisible(false);
			
		this.jButtonProcesarInformacionGrupoColor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoColor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoColor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoColor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGrupoColor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoColor.setText("TIPO");       
		this.jComboBoxTiposReportesGrupoColor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoColor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGrupoColor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGrupoColor.setText("Paginacion");
		this.jComboBoxTiposPaginacionGrupoColor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGrupoColor.setText("Accion");
		this.jComboBoxTiposRelacionesGrupoColor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoColor.setText("Accion");
		this.jComboBoxTiposAccionesGrupoColor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGrupoColor.setText("Accion");
		this.jComboBoxTiposSeleccionarGrupoColor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGrupoColor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGrupoColor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoColor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoColor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGrupoColor = new JLabelMe();
		
		this.jLabelAccionesGrupoColor.setText("Acciones");		
		this.jLabelAccionesGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGrupoColor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGrupoColor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGrupoColor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGrupoColor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGrupoColor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGrupoColor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGrupoColor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGrupoColor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGrupoColor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGrupoColor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGrupoColor.setText("Graf.");
		this.jCheckBoxConGraficoReporteGrupoColor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGrupoColor = new JButtonMe();
		//this.jButtonAnterioresGrupoColor.setText("<<");
        this.jButtonAnterioresGrupoColor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGrupoColor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGrupoColor = new JButtonMe();
		//this.jButtonSiguientesGrupoColor.setText(">>");
        this.jButtonSiguientesGrupoColor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGrupoColor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGrupoColor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGrupoColor.setText("Nue");
        this.jButtonNuevoGuardarCambiosGrupoColor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGrupoColor,"nuevoguardarcambios_button","Nue",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGrupoColor";
		inputMap = this.jButtonNuevoGuardarCambiosGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGrupoColor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGrupoColor";
		inputMap = this.jButtonRecargarInformacionGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGrupoColor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGrupoColor";
		inputMap = this.jButtonSiguientesGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGrupoColor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGrupoColor";
		inputMap = this.jButtonAnterioresGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGrupoColor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGrupoColor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGrupoColor.setMinimumSize(new Dimension(this.getWidth(),GrupoColorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoColorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoColor.setMaximumSize(new Dimension(this.getWidth(),GrupoColorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoColorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoColor.setPreferredSize(new Dimension(this.getWidth(),GrupoColorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoColorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGrupoColor = new GridBagLayout();

			this.jPanelPaginacionGrupoColor.setLayout(gridaBagLayoutPaginacionGrupoColor);						
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 0;
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGrupoColor.add(this.jButtonAnterioresGrupoColor, this.gridBagConstraintsGrupoColor);
					
						
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoColor.gridy = 0;
			
			this.jPanelPaginacionGrupoColor.add(this.jButtonNuevoGuardarCambiosGrupoColor, this.gridBagConstraintsGrupoColor);
						
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoColor.gridy = 0;
			this.jPanelPaginacionGrupoColor.add(this.jButtonSiguientesGrupoColor, this.gridBagConstraintsGrupoColor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 1;
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoColor.add(this.jButtonNuevoGrupoColor, this.gridBagConstraintsGrupoColor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGrupoColor = new GridBagConstraints();
				this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoColor.gridy = 1;
				this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGrupoColor.add(this.jButtonNuevoRelacionesGrupoColor, this.gridBagConstraintsGrupoColor);
			}
			
			
			if(!this.grupocolorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGrupoColor = new GridBagConstraints();
				this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoColor.gridy = 1;
				this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGrupoColor.add(this.jButtonGuardarCambiosTablaGrupoColor, this.gridBagConstraintsGrupoColor);
			}
			
			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 1;
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoColor.add(this.jButtonDuplicarGrupoColor, this.gridBagConstraintsGrupoColor);
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 1;
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoColor.add(this.jButtonCopiarGrupoColor, this.gridBagConstraintsGrupoColor);
		
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 1;
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoColor.add(this.jButtonVerFormGrupoColor, this.gridBagConstraintsGrupoColor);
		
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 1;
			this.gridBagConstraintsGrupoColor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGrupoColor.add(this.jButtonCerrarGrupoColor, this.gridBagConstraintsGrupoColor);
		
		
		
		this.jButtonRecargarInformacionGrupoColor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoColor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoColor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGrupoColor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoColor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoColor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGrupoColor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoColor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoColor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGrupoColor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoColor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoColor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGrupoColor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoColor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoColor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGrupoColor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoColor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoColor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGrupoColor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoColor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoColor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGrupoColor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoColor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoColor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGrupoColor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoColor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoColor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGrupoColor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoColor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoColor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGrupoColor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoColor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoColor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGrupoColor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoColor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoColor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGrupoColor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGrupoColor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GrupoColor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GrupoColor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GrupoColor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GrupoColor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGrupoColor.setLayout(gridaBagParametrosReportesGrupoColor);
			this.jPanelParametrosReportesAccionesGrupoColor.setLayout(gridaBagParametrosReportesAccionesGrupoColor);
			
			
			this.jPanelParametrosAuxiliar1GrupoColor.setLayout(gridaBagParametrosAuxiliar1GrupoColor);
			this.jPanelParametrosAuxiliar2GrupoColor.setLayout(gridaBagParametrosAuxiliar2GrupoColor);
			this.jPanelParametrosAuxiliar3GrupoColor.setLayout(gridaBagParametrosAuxiliar3GrupoColor);
			this.jPanelParametrosAuxiliar4GrupoColor.setLayout(gridaBagParametrosAuxiliar4GrupoColor);
			//this.jPanelParametrosAuxiliar5GrupoColor.setLayout(gridaBagParametrosAuxiliar2GrupoColor);			
			
			
			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoColor.add(this.jButtonRecargarInformacionGrupoColor, this.gridBagConstraintsGrupoColor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoColor.add(this.jComboBoxTiposPaginacionGrupoColor, this.gridBagConstraintsGrupoColor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoColor.add(this.jCheckBoxConAltoMaximoTablaGrupoColor, this.gridBagConstraintsGrupoColor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoColor.add(this.jComboBoxTiposArchivosReportesGrupoColor, this.gridBagConstraintsGrupoColor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoColor.add(this.jPanelParametrosAuxiliar1GrupoColor, this.gridBagConstraintsGrupoColor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoColor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GrupoColor.add(this.jComboBoxTiposReportesGrupoColor, this.gridBagConstraintsGrupoColor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoColor.add(this.jPanelParametrosAuxiliar4GrupoColor, this.gridBagConstraintsGrupoColor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoColor.add(this.jComboBoxTiposReportesGrupoColor, this.gridBagConstraintsGrupoColor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoColor.add(this.jCheckBoxGenerarReporteGrupoColor, this.gridBagConstraintsGrupoColor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoColor.add(this.jPanelParametrosAuxiliar2GrupoColor, this.gridBagConstraintsGrupoColor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoColor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoColor.add(this.jLabelAccionesGrupoColor, this.gridBagConstraintsGrupoColor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGrupoColor = new GridBagConstraints();
				this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGrupoColor.add(this.jButtonAbrirOrderByGrupoColor, this.gridBagConstraintsGrupoColor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoColor.add(this.jComboBoxTiposSeleccionarGrupoColor, this.gridBagConstraintsGrupoColor);			
			
			
			/*
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoColor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoColor.add(this.jCheckBoxSeleccionarTodosGrupoColor, this.gridBagConstraintsGrupoColor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoColor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoColor.add(this.jCheckBoxSeleccionarTodosGrupoColor, this.gridBagConstraintsGrupoColor);															
				
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoColor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoColor.add(this.jCheckBoxSeleccionadosGrupoColor, this.gridBagConstraintsGrupoColor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoColor.add(this.jPanelParametrosAuxiliar3GrupoColor, this.gridBagConstraintsGrupoColor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoColor.add(this.jComboBoxTiposRelacionesGrupoColor, this.gridBagConstraintsGrupoColor);
				
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoColor.add(this.jComboBoxTiposAccionesGrupoColor, this.gridBagConstraintsGrupoColor);
	
				
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoColor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoColor.add(this.jTextFieldValorCampoGeneralGrupoColor, this.gridBagConstraintsGrupoColor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGrupoColor = new GridBagLayout();

			this.jScrollPanelDatosGrupoColor.setLayout(gridaBagLayoutDatosGrupoColor);
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = 0;
			this.gridBagConstraintsGrupoColor.gridx = 0;
			
			this.jScrollPanelDatosGrupoColor.add(this.jTableDatosGrupoColor, this.gridBagConstraintsGrupoColor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGrupoColor.setViewportView(this.jTableDatosGrupoColor);
		this.jTableDatosGrupoColor.setFillsViewportHeight(true);
		this.jTableDatosGrupoColor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGrupoColor= new GridBagLayout();
		this.jPanelAccionesGrupoColor.setLayout(gridaBagLayoutAccionesGrupoColor);
		
		
		/*	
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 0;
			
		this.jPanelAccionesGrupoColor.add(this.jButtonNuevoGrupoColor, this.gridBagConstraintsGrupoColor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoGrupoColor= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoGrupoColor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoGrupoColor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoGrupoColor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoGrupoColor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoGrupoColor.setLayout(gridaBagLayoutBusquedaPorCodigoGrupoColor);

		gridBagConstraintsGrupoColor = new GridBagConstraints();
		gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoColor.gridy = 0;
		gridBagConstraintsGrupoColor.gridx = 0;
		jPanelBusquedaPorCodigoGrupoColor.add(jLabelcodigoBusquedaPorCodigoGrupoColor, gridBagConstraintsGrupoColor);

		gridBagConstraintsGrupoColor = new GridBagConstraints();
		gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoColor.gridy = 0;
		gridBagConstraintsGrupoColor.gridx = 1;
		jPanelBusquedaPorCodigoGrupoColor.add(jTextFieldcodigoBusquedaPorCodigoGrupoColor, gridBagConstraintsGrupoColor);

		gridBagConstraintsGrupoColor = new GridBagConstraints();
		gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoColor.gridy = 1;
		gridBagConstraintsGrupoColor.gridx =1;
		jPanelBusquedaPorCodigoGrupoColor.add(jButtonBusquedaPorCodigoGrupoColor, gridBagConstraintsGrupoColor);

		jTabbedPaneBusquedasGrupoColor.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoGrupoColor);
		jTabbedPaneBusquedasGrupoColor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreGrupoColor= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreGrupoColor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoColor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoColor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreGrupoColor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreGrupoColor.setLayout(gridaBagLayoutBusquedaPorNombreGrupoColor);

		gridBagConstraintsGrupoColor = new GridBagConstraints();
		gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoColor.gridy = 0;
		gridBagConstraintsGrupoColor.gridx = 0;
		jPanelBusquedaPorNombreGrupoColor.add(jLabelnombreBusquedaPorNombreGrupoColor, gridBagConstraintsGrupoColor);

		gridBagConstraintsGrupoColor = new GridBagConstraints();
		gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoColor.gridy = 0;
		gridBagConstraintsGrupoColor.gridx = 1;
		jPanelBusquedaPorNombreGrupoColor.add(jTextAreanombreBusquedaPorNombreGrupoColor, gridBagConstraintsGrupoColor);

		gridBagConstraintsGrupoColor = new GridBagConstraints();
		gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoColor.gridy = 1;
		gridBagConstraintsGrupoColor.gridx =1;
		jPanelBusquedaPorNombreGrupoColor.add(jButtonBusquedaPorNombreGrupoColor, gridBagConstraintsGrupoColor);

		jTabbedPaneBusquedasGrupoColor.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreGrupoColor);
		jTabbedPaneBusquedasGrupoColor.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoColor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoColor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();						
			this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoColor.gridx = 0;		
			//this.gridBagConstraintsGrupoColor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoColor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGrupoColor, this.gridBagConstraintsGrupoColor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGrupoColor.gridx = 0;		
		//this.gridBagConstraintsGrupoColor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGrupoColor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGrupoColor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoColor.gridx = 0;		
			this.gridBagConstraintsGrupoColor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGrupoColor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGrupoColor, this.gridBagConstraintsGrupoColor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGrupoColor, this.gridBagConstraintsGrupoColor);								
		
		
		/*
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGrupoColor, this.gridBagConstraintsGrupoColor);
		*/		
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoColor.gridx =0;
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoColor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoColor, this.gridBagConstraintsGrupoColor);
				
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGrupoColor, this.gridBagConstraintsGrupoColor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGrupoColor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoColor = new GridBagLayout();
			this.jPanelBusquedasParametrosGrupoColor.setLayout(gridaBagLayoutBusquedasParametrosGrupoColor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGrupoColor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoColor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoColor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoColor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoColor, this.gridBagConstraintsGrupoColor);
			
			
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoColor, this.gridBagConstraintsGrupoColor);
		
			
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoColor, this.gridBagConstraintsGrupoColor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGrupoColor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGrupoColor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGrupoColor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGrupoColor.setName("jPanelReporteDinamicoGrupoColor"); 
		
		this.jPanelReporteDinamicoGrupoColor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoColor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoColor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGrupoColor.setLayout(gridaBagLayoutReporteDinamicoGrupoColor);
		
		
		this.jInternalFrameReporteDinamicoGrupoColor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGrupoColor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoColor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGrupoColor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGrupoColor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGrupoColor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGrupoColor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGrupoColor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGrupoColor.setResizable(true);
	    this.jInternalFrameReporteDinamicoGrupoColor.setClosable(true);
	    this.jInternalFrameReporteDinamicoGrupoColor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGrupoColor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoColor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoColor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Colores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGrupoColor = new JLabelMe();

		this.jLabelColumnasSelectReporteGrupoColor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoColor.add(this.jLabelColumnasSelectReporteGrupoColor, this.gridBagConstraintsGrupoColor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGrupoColor = new JList<Reporte>();
		this.jListColumnasSelectReporteGrupoColor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGrupoColor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGrupoColor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoColor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoColor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGrupoColor=new JScrollPane(this.jListColumnasSelectReporteGrupoColor);
			
			this.jScrollColumnasSelectReporteGrupoColor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoColor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoColor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoColor.add(this.jListColumnasSelectReporteGrupoColor, this.gridBagConstraintsGrupoColor);
		this.jPanelReporteDinamicoGrupoColor.add(this.jScrollColumnasSelectReporteGrupoColor, this.gridBagConstraintsGrupoColor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGrupoColor = new JLabelMe();

		this.jLabelRelacionesSelectReporteGrupoColor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoColor.add(this.jLabelRelacionesSelectReporteGrupoColor, this.gridBagConstraintsGrupoColor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGrupoColor = new JList<Reporte>();
		this.jListRelacionesSelectReporteGrupoColor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGrupoColor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGrupoColor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoColor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoColor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGrupoColor=new JScrollPane(this.jListRelacionesSelectReporteGrupoColor);
			
			this.jScrollRelacionesSelectReporteGrupoColor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoColor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoColor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoColor.add(this.jListRelacionesSelectReporteGrupoColor, this.gridBagConstraintsGrupoColor);
		this.jPanelReporteDinamicoGrupoColor.add(this.jScrollRelacionesSelectReporteGrupoColor, this.gridBagConstraintsGrupoColor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGrupoColor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGrupoColor = new JComboBoxMe();
		this.jListColumnasValoresGraficoGrupoColor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGrupoColor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGrupoColor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGrupoColor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoColor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoColor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGrupoColor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoColor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoColor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoColor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoColor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGrupoColor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGrupoColor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoColor.add(this.jLabelGenerarExcelReporteDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGrupoColor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGrupoColor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGrupoColor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGrupoColor.setToolTipText("Generar EXCEL"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGrupoColor.add(this.jButtonGenerarExcelReporteDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoColor.add(this.jComboBoxTiposReportesDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGrupoColor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGrupoColor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoColor.add(this.jLabelTiposArchivoReporteDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoColor.add(this.jComboBoxTiposArchivosReportesDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGrupoColor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGrupoColor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGrupoColor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGrupoColor.setToolTipText("Generar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoColor.add(this.jButtonGenerarReporteDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGrupoColor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGrupoColor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGrupoColor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGrupoColor.setToolTipText("Cancelar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoColor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoColor.add(this.jButtonCerrarReporteDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGrupoColor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGrupoColor= new JScrollPane(jPanelReporteDinamicoGrupoColor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGrupoColor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoColor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoColor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Colores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGrupoColor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGrupoColor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGrupoColor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGrupoColor);
		this.jInternalFrameReporteDinamicoGrupoColor.getContentPane().add(this.jScrollPanelReporteDinamicoGrupoColor, this.gridBagConstraintsGrupoColor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGrupoColor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGrupoColor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGrupoColor.setName("jPanelImportacionGrupoColor"); 
		
		this.jPanelImportacionGrupoColor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoColor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoColor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGrupoColor.setLayout(gridaBagLayoutImportacionGrupoColor);
		
		
		this.jInternalFrameImportacionGrupoColor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGrupoColor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGrupoColor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoColor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGrupoColor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoColor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoColor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGrupoColor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoColor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoColor.setResizable(true);
	    this.jInternalFrameImportacionGrupoColor.setClosable(true);
	    this.jInternalFrameImportacionGrupoColor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGrupoColor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoColor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoColor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGrupoColor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoColor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoColor.setResizable(true);
	    this.jInternalFrameImportacionGrupoColor.setClosable(true);
	    this.jInternalFrameImportacionGrupoColor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGrupoColor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoColor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoColor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Colores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGrupoColor = new JLabelMe();

		this.jLabelArchivoImportacionGrupoColor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoColor.add(this.jLabelArchivoImportacionGrupoColor, this.gridBagConstraintsGrupoColor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGrupoColor = new JFileChooser();		
		this.jFileChooserImportacionGrupoColor.setToolTipText("ESCOGER ARCHIVO"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGrupoColor = new JButtonMe();
		this.jButtonAbrirImportacionGrupoColor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGrupoColor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGrupoColor.setToolTipText("Generar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoColor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoColor.add(this.jButtonAbrirImportacionGrupoColor, this.gridBagConstraintsGrupoColor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGrupoColor = new JLabelMe();

		this.jLabelPathArchivoImportacionGrupoColor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoColor.add(this.jLabelPathArchivoImportacionGrupoColor, this.gridBagConstraintsGrupoColor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGrupoColor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGrupoColor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoColor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoColor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoColor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoColor.add(this.jTextFieldPathArchivoImportacionGrupoColor, this.gridBagConstraintsGrupoColor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGrupoColor = new JButtonMe();
		this.jButtonGenerarImportacionGrupoColor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGrupoColor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGrupoColor.setToolTipText("Generar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoColor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoColor.add(this.jButtonGenerarImportacionGrupoColor, this.gridBagConstraintsGrupoColor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGrupoColor = new JButtonMe();
		this.jButtonCerrarImportacionGrupoColor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGrupoColor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGrupoColor.setToolTipText("Cancelar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoColor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoColor.add(this.jButtonCerrarImportacionGrupoColor, this.gridBagConstraintsGrupoColor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGrupoColor = new GridBagLayout();
		
		this.jScrollPanelImportacionGrupoColor= new JScrollPane(jPanelImportacionGrupoColor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy =iPosYImportacion;
		this.gridBagConstraintsGrupoColor.gridx =iPosXImportacion;
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGrupoColor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGrupoColor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGrupoColor);
		this.jInternalFrameImportacionGrupoColor.getContentPane().add(this.jScrollPanelImportacionGrupoColor, this.gridBagConstraintsGrupoColor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGrupoColor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGrupoColor = new JButtonMe();
			this.jButtonAbrirOrderByGrupoColor.setText("Orden");
			this.jButtonAbrirOrderByGrupoColor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoColor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGrupoColor";
			inputMap = this.jButtonAbrirOrderByGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGrupoColor"));
		
		
			GridBagLayout gridaBagLayoutOrderByGrupoColor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGrupoColor.setName("jPanelOrderByGrupoColor"); 
			
			this.jPanelOrderByGrupoColor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoColor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoColor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGrupoColor.setLayout(gridaBagLayoutOrderByGrupoColor);
			
			
			this.jTableDatosGrupoColorOrderBy = new JTableMe();        
			this.jTableDatosGrupoColorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGrupoColorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGrupoColorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGrupoColorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGrupoColorOrderBy.setViewportView(this.jTableDatosGrupoColorOrderBy);
			this.jTableDatosGrupoColorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGrupoColorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGrupoColor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGrupoColor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGrupoColor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGrupoColor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGrupoColor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGrupoColor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGrupoColor.setTitle("Orden");
			this.jInternalFrameOrderByGrupoColor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGrupoColor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGrupoColor.setResizable(true);
			this.jInternalFrameOrderByGrupoColor.setClosable(true);
			this.jInternalFrameOrderByGrupoColor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGrupoColor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoColor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoColor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Colores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGrupoColor.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGrupoColor.ipady =150;
				
			this.jPanelOrderByGrupoColor.add(jScrollPanelDatosGrupoColorOrderBy, this.gridBagConstraintsGrupoColor);//this.jTableDatosGrupoColorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGrupoColor = new JButtonMe();
			this.jButtonCerrarOrderByGrupoColor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGrupoColor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGrupoColor.setToolTipText("Cancelar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGrupoColor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGrupoColor.add(this.jButtonCerrarOrderByGrupoColor, this.gridBagConstraintsGrupoColor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGrupoColor = new GridBagLayout();
			
			this.jScrollPanelOrderByGrupoColor= new JScrollPane(jPanelOrderByGrupoColor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy =iPosYOrderBy;
			this.gridBagConstraintsGrupoColor.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGrupoColor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGrupoColor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGrupoColor);
			
			this.jInternalFrameOrderByGrupoColor.getContentPane().add(this.jScrollPanelOrderByGrupoColor, this.gridBagConstraintsGrupoColor);			
		
		} else {
			this.jButtonAbrirOrderByGrupoColor = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.grupocolorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGrupoColor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGrupoColor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGrupoColor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGrupoColor.getRowHeight();//GrupoColorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GrupoColorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoColor.isSelected()) {
					iHeightTable=GrupoColorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoColorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoColorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GrupoColorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoColor.isSelected()) {
					iHeightTable=GrupoColorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoColorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoColorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGrupoColor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoColor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoColor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGrupoColor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoColor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoColor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGrupoColor!=null && this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy()!=null) {
			//if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGrupoColor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGrupoColor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGrupoColor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGrupoColor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoColor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoColor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=grupocolorLogic.getGrupoColors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupocolors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GrupoColor> TraerGrupoColorBeans(List<GrupoColor> grupocolors,ArrayList<Classe> classes)throws Exception {
		try {
			for(GrupoColor grupocolor:grupocolors) {
					
				if(!(GrupoColorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GrupoColorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					grupocolor.setsDetalleGeneralEntityReporte(GrupoColorConstantesFunciones.getGrupoColorDescripcion(grupocolor));
										
						
					
					

					if(grupocolor.getColorProductos()!=null && Funciones.existeClass(classes,ColorProducto.class)) {
						try{grupocolor.setcolorproductosDescripcionReporte(new JRBeanCollectionDataSource(ColorProductoJInternalFrame.TraerColorProductoBeans(grupocolor.getColorProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//grupocolor.setsDetalleGeneralEntityReporte(grupocolor.getsDetalleGeneralEntityReporte());
										
				}
				
				//grupocolorbeans.add(grupocolorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return grupocolors;
    }
	//PARA REPORTES FIN
}
