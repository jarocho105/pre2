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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ValorPorUnidadConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ValorPorUnidadJInternalFrame extends ValorPorUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarValorPorUnidad;
	
	protected JMenuBar jmenuBarValorPorUnidad;
	
	protected JMenu jmenuValorPorUnidad;
	protected JMenu jmenuDatosValorPorUnidad;
	protected JMenu jmenuArchivoValorPorUnidad;
	protected JMenu jmenuAccionesValorPorUnidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutValorPorUnidad;	
	protected GridBagConstraints gridBagConstraintsValorPorUnidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ValorPorUnidadDetalleFormJInternalFrame jInternalFrameDetalleFormValorPorUnidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoValorPorUnidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionValorPorUnidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ValorPorUnidadSessionBean valorporunidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ValorPorUnidad> valorporunidads;		
	public List<ValorPorUnidad> valorporunidadsEliminados;	
	public List<ValorPorUnidad> valorporunidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByValorPorUnidad;		
	protected JButton jButtonAbrirOrderByValorPorUnidad;
	
	
	//protected JPanel jPanelOrderByValorPorUnidad;
	//public JScrollPane jScrollPanelOrderByValorPorUnidad;	
	//protected JButton jButtonCerrarOrderByValorPorUnidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ValorPorUnidadLogic valorporunidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosValorPorUnidad;
	public JScrollPane jScrollPanelDatosEdicionValorPorUnidad;
	public JScrollPane jScrollPanelDatosGeneralValorPorUnidad;
    
	
	
	//public JScrollPane jScrollPanelDatosValorPorUnidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoValorPorUnidad;
	//public JScrollPane jScrollPanelImportacionValorPorUnidad;
	
	
	
	protected JPanel jPanelAccionesValorPorUnidad;
	
    protected JPanel jPanelPaginacionValorPorUnidad;
    protected JPanel jPanelParametrosReportesValorPorUnidad;
	protected JPanel jPanelParametrosReportesAccionesValorPorUnidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ValorPorUnidad;
	protected JPanel jPanelParametrosAuxiliar2ValorPorUnidad;
	protected JPanel jPanelParametrosAuxiliar3ValorPorUnidad;
	protected JPanel jPanelParametrosAuxiliar4ValorPorUnidad;
	//protected JPanel jPanelParametrosAuxiliar5ValorPorUnidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoValorPorUnidad;
	//protected JPanel jPanelImportacionValorPorUnidad;
	
	
	public JTable jTableDatosValorPorUnidad;
	
	
	
	//public JTable jTableDatosValorPorUnidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoValorPorUnidad;
	protected JButton jButtonDuplicarValorPorUnidad;
	protected JButton jButtonCopiarValorPorUnidad;
	protected JButton jButtonVerFormValorPorUnidad;
	protected JButton jButtonNuevoRelacionesValorPorUnidad;
	protected JButton jButtonModificarValorPorUnidad;
	
    protected JButton jButtonGuardarCambiosTablaValorPorUnidad;
	protected JButton jButtonCerrarValorPorUnidad;
	
	
	protected JButton jButtonRecargarInformacionValorPorUnidad;
	protected JButton jButtonProcesarInformacionValorPorUnidad;
	
	
	protected JButton jButtonAnterioresValorPorUnidad;
	protected JButton jButtonSiguientesValorPorUnidad;
	protected JButton jButtonNuevoGuardarCambiosValorPorUnidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoValorPorUnidad;
	//protected JButton jButtonCerrarReporteDinamicoValorPorUnidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoValorPorUnidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionValorPorUnidad;
	//protected JButton jButtonGenerarImportacionValorPorUnidad;
	//protected JButton jButtonCerrarImportacionValorPorUnidad;
	//protected JFileChooser jFileChooserImportacionValorPorUnidad;
	//protected File fileImportacionValorPorUnidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarValorPorUnidad;
	protected JButton jButtonDuplicarToolBarValorPorUnidad;
	protected JButton jButtonNuevoRelacionesToolBarValorPorUnidad;
	
	
	public JButton jButtonGuardarCambiosToolBarValorPorUnidad;
	protected JButton jButtonCopiarToolBarValorPorUnidad;
	protected JButton jButtonVerFormToolBarValorPorUnidad;
	public JButton jButtonGuardarCambiosTablaToolBarValorPorUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarValorPorUnidad;
	protected JButton jButtonCerrarToolBarValorPorUnidad;
	
	protected JButton jButtonRecargarInformacionToolBarValorPorUnidad;
	protected JButton jButtonProcesarInformacionToolBarValorPorUnidad;
	protected JButton jButtonAnterioresToolBarValorPorUnidad;
	protected JButton jButtonSiguientesToolBarValorPorUnidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarValorPorUnidad;
	protected JButton jButtonAbrirOrderByToolBarValorPorUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoValorPorUnidad;
	protected JMenuItem jMenuItemDuplicarValorPorUnidad;
	protected JMenuItem jMenuItemNuevoRelacionesValorPorUnidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosValorPorUnidad;
	protected JMenuItem jMenuItemCopiarValorPorUnidad;
	protected JMenuItem jMenuItemVerFormValorPorUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaValorPorUnidad;
	protected JMenuItem jMenuItemCerrarValorPorUnidad;
	protected JMenuItem jMenuItemDetalleCerrarValorPorUnidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByValorPorUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarValorPorUnidad;
	
	protected JMenuItem jMenuItemRecargarInformacionValorPorUnidad;
	protected JMenuItem jMenuItemProcesarInformacionValorPorUnidad;
	protected JMenuItem jMenuItemAnterioresValorPorUnidad;
	protected JMenuItem jMenuItemSiguientesValorPorUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosValorPorUnidad;
	protected JMenuItem jMenuItemAbrirOrderByValorPorUnidad;
	protected JMenuItem jMenuItemMostrarOcultarValorPorUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesValorPorUnidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosValorPorUnidad;
	protected JCheckBox jCheckBoxSeleccionadosValorPorUnidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaValorPorUnidad;
	protected JCheckBox jCheckBoxConGraficoReporteValorPorUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesValorPorUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesValorPorUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoValorPorUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoValorPorUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesValorPorUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionValorPorUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesValorPorUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesValorPorUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarValorPorUnidad;
	protected JTextField jTextFieldValorCampoGeneralValorPorUnidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteValorPorUnidad;
	//public JList<Reporte> jListColumnasSelectReporteValorPorUnidad;
	//public JScrollPane jScrollColumnasSelectReporteValorPorUnidad;
	
	//public JLabel jLabelRelacionesSelectReporteValorPorUnidad;
	//public JList<Reporte> jListRelacionesSelectReporteValorPorUnidad;
	//public JScrollPane jScrollRelacionesSelectReporteValorPorUnidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoValorPorUnidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoValorPorUnidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoValorPorUnidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoValorPorUnidad;
	
		
	//public JLabel jLabelArchivoImportacionValorPorUnidad;	
	//public JLabel jLabelPathArchivoImportacionValorPorUnidad;
	//protected JTextField jTextFieldPathArchivoImportacionValorPorUnidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoValorPorUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoValorPorUnidad;
	
	//public JLabel jLabelColumnaCategoriaValorValorPorUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorValorPorUnidad;
	
	//public JLabel jLabelColumnasValoresGraficoValorPorUnidad;
	//public JList<Reporte> jListColumnasValoresGraficoValorPorUnidad;
	//public JScrollPane jScrollColumnasValoresGraficoValorPorUnidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoValorPorUnidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoValorPorUnidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasValorPorUnidad;
	public JPanel jPanelFK_IdUnidadValorPorUnidad;
	public JButton jButtonFK_IdUnidadValorPorUnidad;
	
	public JPanel jPanelid_unidadFK_IdUnidadValorPorUnidad;
	public JLabel jLabelid_unidadFK_IdUnidadValorPorUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadValorPorUnidad;
	public JButton jButtonid_unidadFK_IdUnidadValorPorUnidad= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadValorPorUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadValorPorUnidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ValorPorUnidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionValorPorUnidad)	{
		this.jButtonRecargarInformacionValorPorUnidad = jButtonRecargarInformacionValorPorUnidad;
	}
	
	public JButton getjButtonProcesarInformacionValorPorUnidad() {
		return this.jButtonProcesarInformacionValorPorUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionValorPorUnidad)	{
		this.jButtonProcesarInformacionValorPorUnidad = jButtonProcesarInformacionValorPorUnidad;
	}
	
	
	public JButton getjButtonRecargarInformacionValorPorUnidad() {
		return this.jButtonRecargarInformacionValorPorUnidad;
	}
	
	
	public List<ValorPorUnidad> getvalorporunidads() {
		return this.valorporunidads;
	}

	public void setvalorporunidads(List<ValorPorUnidad> valorporunidads) {
		this.valorporunidads = valorporunidads;
	}
	
	public List<ValorPorUnidad> getvalorporunidadsAux() {
		return this.valorporunidadsAux;
	}

	public void setvalorporunidadsAux(List<ValorPorUnidad> valorporunidadsAux) {
		this.valorporunidadsAux = valorporunidadsAux;
	}
	
	public List<ValorPorUnidad> getvalorporunidadsEliminados() {
		return this.valorporunidadsEliminados;
	}

	public void setValorPorUnidadsEliminados(List<ValorPorUnidad> valorporunidadsEliminados) {
		this.valorporunidadsEliminados = valorporunidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarValorPorUnidad() {
		return jComboBoxTiposSeleccionarValorPorUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarValorPorUnidad(
			JComboBox jComboBoxTiposSeleccionarValorPorUnidad) {
		this.jComboBoxTiposSeleccionarValorPorUnidad = jComboBoxTiposSeleccionarValorPorUnidad;
	}
	
	public void setBorderResaltarTiposSeleccionarValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarValorPorUnidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralValorPorUnidad() {
		return jTextFieldValorCampoGeneralValorPorUnidad;
	}

	public void setjTextFieldValorCampoGeneralValorPorUnidad(
			JTextField jTextFieldValorCampoGeneralValorPorUnidad) {
		this.jTextFieldValorCampoGeneralValorPorUnidad = jTextFieldValorCampoGeneralValorPorUnidad;
	}

	public void setBorderResaltarValorCampoGeneralValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralValorPorUnidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosValorPorUnidad() {
		return this.jCheckBoxSeleccionarTodosValorPorUnidad;
	}

	public void setjCheckBoxSeleccionarTodosValorPorUnidad(
			JCheckBox jCheckBoxSeleccionarTodosValorPorUnidad) {
		this.jCheckBoxSeleccionarTodosValorPorUnidad = jCheckBoxSeleccionarTodosValorPorUnidad;
	}

	public void setBorderResaltarSeleccionarTodosValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosValorPorUnidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosValorPorUnidad() {
		return this.jCheckBoxSeleccionadosValorPorUnidad;
	}

	public void setjCheckBoxSeleccionadosValorPorUnidad(
			JCheckBox jCheckBoxSeleccionadosValorPorUnidad) {
		this.jCheckBoxSeleccionadosValorPorUnidad = jCheckBoxSeleccionadosValorPorUnidad;
	}
	
	public void setBorderResaltarSeleccionadosValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosValorPorUnidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesValorPorUnidad() {
		return this.jComboBoxTiposArchivosReportesValorPorUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesValorPorUnidad(
			JComboBox jComboBoxTiposArchivosReportesValorPorUnidad) {
		this.jComboBoxTiposArchivosReportesValorPorUnidad = jComboBoxTiposArchivosReportesValorPorUnidad;
	}

	public void setBorderResaltarTiposArchivosReportesValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesValorPorUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesValorPorUnidad() {
		return this.jComboBoxTiposReportesValorPorUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesValorPorUnidad(
			JComboBox jComboBoxTiposReportesValorPorUnidad) {
		this.jComboBoxTiposReportesValorPorUnidad = jComboBoxTiposReportesValorPorUnidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoValorPorUnidad() {
	//	return jComboBoxTiposReportesDinamicoValorPorUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoValorPorUnidad(
	//		JComboBox jComboBoxTiposReportesDinamicoValorPorUnidad) {
	//	this.jComboBoxTiposReportesDinamicoValorPorUnidad = jComboBoxTiposReportesDinamicoValorPorUnidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoValorPorUnidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoValorPorUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoValorPorUnidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoValorPorUnidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad = jComboBoxTiposArchivosReportesDinamicoValorPorUnidad;
	//}
	
	public void setBorderResaltarTiposReportesValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesValorPorUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesValorPorUnidad() {
		return this.jComboBoxTiposGraficosReportesValorPorUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesValorPorUnidad(
			JComboBox jComboBoxTiposGraficosReportesValorPorUnidad) {
		this.jComboBoxTiposGraficosReportesValorPorUnidad = jComboBoxTiposGraficosReportesValorPorUnidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesValorPorUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionValorPorUnidad() {
		return this.jComboBoxTiposPaginacionValorPorUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionValorPorUnidad(
			JComboBox jComboBoxTiposPaginacionValorPorUnidad) {
		this.jComboBoxTiposPaginacionValorPorUnidad = jComboBoxTiposPaginacionValorPorUnidad;
	}
	
	public void setBorderResaltarTiposPaginacionValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionValorPorUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesValorPorUnidad() {
		return this.jComboBoxTiposRelacionesValorPorUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesValorPorUnidad() {
		return this.jComboBoxTiposAccionesValorPorUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesValorPorUnidad(
			JComboBox jComboBoxTiposRelacionesValorPorUnidad) {
		this.jComboBoxTiposRelacionesValorPorUnidad = jComboBoxTiposRelacionesValorPorUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesValorPorUnidad(
			JComboBox jComboBoxTiposAccionesValorPorUnidad) {
		this.jComboBoxTiposAccionesValorPorUnidad = jComboBoxTiposAccionesValorPorUnidad;
	}
	
	public void setBorderResaltarTiposRelacionesValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesValorPorUnidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesValorPorUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesValorPorUnidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoValorPorUnidad() {
	//	return jCheckBoxConGraficoDinamicoValorPorUnidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoValorPorUnidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoValorPorUnidad) {
	//	this.jCheckBoxConGraficoDinamicoValorPorUnidad = jCheckBoxConGraficoDinamicoValorPorUnidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoValorPorUnidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarValorPorUnidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoValorPorUnidad .setBorder(borderResaltar);		
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
		this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		
		this.valorporunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.valorporunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.valorporunidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ValorPorUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Valor Por Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
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
		
		ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarValorPorUnidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"nuevo","nuevo","Nuevo"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"duplicar","duplicar","Duplicar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"copiar","copiar","Copiar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"ver_form","ver_form","Ver"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"recargar","recargar","Recargar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarValorPorUnidad,this.jTtoolBarValorPorUnidad,
							"cerrar","cerrar","Salir"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarValorPorUnidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarValorPorUnidad;
			
				this.jButtonProcesarInformacionToolBarValorPorUnidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarValorPorUnidad;
				
		//protected JButton jButtonModificarToolBarValorPorUnidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarValorPorUnidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuValorPorUnidad=new JMenuMe("General");
		this.jmenuArchivoValorPorUnidad=new JMenuMe("Archivo");
		this.jmenuAccionesValorPorUnidad=new JMenuMe("Acciones");
		this.jmenuDatosValorPorUnidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoValorPorUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoValorPorUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoValorPorUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarValorPorUnidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarValorPorUnidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarValorPorUnidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesValorPorUnidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesValorPorUnidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesValorPorUnidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosValorPorUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosValorPorUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosValorPorUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarValorPorUnidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarValorPorUnidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarValorPorUnidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormValorPorUnidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormValorPorUnidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormValorPorUnidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaValorPorUnidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaValorPorUnidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaValorPorUnidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarValorPorUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarValorPorUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarValorPorUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionValorPorUnidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionValorPorUnidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionValorPorUnidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionValorPorUnidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionValorPorUnidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionValorPorUnidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresValorPorUnidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresValorPorUnidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresValorPorUnidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesValorPorUnidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesValorPorUnidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesValorPorUnidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByValorPorUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByValorPorUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByValorPorUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarValorPorUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarValorPorUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarValorPorUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByValorPorUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByValorPorUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByValorPorUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarValorPorUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarValorPorUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarValorPorUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosValorPorUnidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosValorPorUnidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosValorPorUnidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoValorPorUnidad.add(this.jMenuItemCerrarValorPorUnidad);
			
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemNuevoValorPorUnidad);
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemNuevoGuardarCambiosValorPorUnidad);
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemNuevoRelacionesValorPorUnidad);
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemGuardarCambiosTablaValorPorUnidad);		
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemDuplicarValorPorUnidad);		
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemCopiarValorPorUnidad);		
			this.jmenuAccionesValorPorUnidad.add(this.jMenuItemVerFormValorPorUnidad);		
			
			this.jmenuDatosValorPorUnidad.add(this.jMenuItemRecargarInformacionValorPorUnidad);				
			this.jmenuDatosValorPorUnidad.add(this.jMenuItemAnterioresValorPorUnidad);				
			this.jmenuDatosValorPorUnidad.add(this.jMenuItemSiguientesValorPorUnidad);				
			this.jmenuDatosValorPorUnidad.add(this.jMenuItemAbrirOrderByValorPorUnidad);				
			this.jmenuDatosValorPorUnidad.add(this.jMenuItemMostrarOcultarValorPorUnidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesValorPorUnidad.add(this.jMenuItemGuardarCambiosValorPorUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarValorPorUnidad.add(this.jmenuArchivoValorPorUnidad);		
			this.jmenuBarValorPorUnidad.add(this.jmenuAccionesValorPorUnidad);		
			this.jmenuBarValorPorUnidad.add(this.jmenuDatosValorPorUnidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarValorPorUnidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasValorPorUnidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdUnidadValorPorUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadValorPorUnidad.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadValorPorUnidad= new JButtonMe();
		this.jButtonFK_IdUnidadValorPorUnidad.setText("Buscar");
		this.jButtonFK_IdUnidadValorPorUnidad.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadValorPorUnidad,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadValorPorUnidad = new JLabelMe();
		jLabelid_unidadFK_IdUnidadValorPorUnidad.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadValorPorUnidad.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadValorPorUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadValorPorUnidad= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadValorPorUnidad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasValorPorUnidad=new JTabbedPane();


		this.jTabbedPaneBusquedasValorPorUnidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasValorPorUnidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasValorPorUnidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasValorPorUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasValorPorUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleValorPorUnidad = new ValorPorUnidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Valor Por Unidad DATOS");
			this.jInternalFrameDetalleFormValorPorUnidad = new ValorPorUnidadDetalleFormJInternalFrame(jDesktopPane,this.valorporunidadSessionBean.getConGuardarRelaciones(),this.valorporunidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormValorPorUnidad = null;//new ValorPorUnidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutValorPorUnidad= new GridBagLayout();
		
		
		this.jTableDatosValorPorUnidad = new JTableMe();      
		
		String sToolTipValorPorUnidad="";
		sToolTipValorPorUnidad=ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipValorPorUnidad+="(Importaciones.ValorPorUnidad)";
		}
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipValorPorUnidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosValorPorUnidad.setToolTipText(sToolTipValorPorUnidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosValorPorUnidad);
		this.jTableDatosValorPorUnidad.setAutoCreateRowSorter(true);
		this.jTableDatosValorPorUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosValorPorUnidad.setRowSelectionAllowed(true);
		this.jTableDatosValorPorUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosValorPorUnidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoValorPorUnidad = new JButtonMe();
		this.jButtonDuplicarValorPorUnidad = new JButtonMe();
		this.jButtonCopiarValorPorUnidad = new JButtonMe();
		this.jButtonVerFormValorPorUnidad = new JButtonMe();
		this.jButtonNuevoRelacionesValorPorUnidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaValorPorUnidad = new JButtonMe();
		this.jButtonCerrarValorPorUnidad = new JButtonMe();
		
		this.jScrollPanelDatosValorPorUnidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralValorPorUnidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Valor Por Unidad";
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Por Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosValorPorUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesValorPorUnidad.setToolTipText("Acciones");
        this.jPanelAccionesValorPorUnidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoValorPorUnidad=new ReporteDinamicoJInternalFrame(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoValorPorUnidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionValorPorUnidad=new ImportacionJInternalFrame(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionValorPorUnidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByValorPorUnidad = new JButtonMe();
		
		this.jButtonAbrirOrderByValorPorUnidad.setText("Orden");
		this.jButtonAbrirOrderByValorPorUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByValorPorUnidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByValorPorUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorPorUnidad,false,this);
			
			//this.cargarOrderByValorPorUnidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByValorPorUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorPorUnidad,true,this);
			
			//this.cargarOrderByValorPorUnidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosValorPorUnidad.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosValorPorUnidad.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosValorPorUnidad.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosValorPorUnidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosValorPorUnidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosValorPorUnidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoValorPorUnidad.setText("Nuevo");
		this.jButtonDuplicarValorPorUnidad.setText("Duplicar");
		this.jButtonCopiarValorPorUnidad.setText("Copiar");
		this.jButtonVerFormValorPorUnidad.setText("Ver");
		this.jButtonNuevoRelacionesValorPorUnidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.setText("Guardar");
		this.jButtonCerrarValorPorUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoValorPorUnidad,"nuevo_button","Nuevo",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarValorPorUnidad,"duplicar_button","Duplicar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarValorPorUnidad,"copiar_button","Copiar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormValorPorUnidad,"ver_form","Ver",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesValorPorUnidad,"nuevorelaciones_button","Nuevo Rel",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaValorPorUnidad,"guardarcambiostabla_button","Guardar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarValorPorUnidad,"cerrar_button","Salir",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoValorPorUnidad.setToolTipText("Nuevo"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarValorPorUnidad.setToolTipText("Duplicar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarValorPorUnidad.setToolTipText("Copiar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormValorPorUnidad.setToolTipText("Ver"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesValorPorUnidad.setToolTipText("Nuevo Rel"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.setToolTipText("Guardar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarValorPorUnidad.setToolTipText("Salir"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoValorPorUnidad";
		inputMap = this.jButtonNuevoValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoValorPorUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoValorPorUnidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarValorPorUnidad";
		inputMap = this.jButtonDuplicarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarValorPorUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarValorPorUnidad"));
		
		//COPIAR
		sMapKey = "CopiarValorPorUnidad";
		inputMap = this.jButtonCopiarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarValorPorUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarValorPorUnidad"));
		
		//VEr FORM
		sMapKey = "VerFormValorPorUnidad";
		inputMap = this.jButtonVerFormValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormValorPorUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormValorPorUnidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesValorPorUnidad";
		inputMap = this.jButtonNuevoRelacionesValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesValorPorUnidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarValorPorUnidad";
		inputMap = this.jButtonModificarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarValorPorUnidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarValorPorUnidad";
		inputMap = this.jButtonCerrarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarValorPorUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaValorPorUnidad";
		inputMap = this.jButtonGuardarCambiosTablaValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaValorPorUnidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ValorPorUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ValorPorUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ValorPorUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ValorPorUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ValorPorUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesValorPorUnidad.setName("jPanelParametrosReportesValorPorUnidad"); 
		
		this.jPanelParametrosReportesAccionesValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesValorPorUnidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesValorPorUnidad.setName("jPanelParametrosReportesAccionesValorPorUnidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionValorPorUnidad = new JButtonMe();
		this.jButtonRecargarInformacionValorPorUnidad.setText("Recargar");
		this.jButtonRecargarInformacionValorPorUnidad.setToolTipText("Recargar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionValorPorUnidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionValorPorUnidad = new JButtonMe();
		this.jButtonProcesarInformacionValorPorUnidad.setText("Procesar");
		this.jButtonProcesarInformacionValorPorUnidad.setToolTipText("Procesar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionValorPorUnidad.setVisible(false);
			
		this.jButtonProcesarInformacionValorPorUnidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionValorPorUnidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionValorPorUnidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesValorPorUnidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesValorPorUnidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesValorPorUnidad.setText("TIPO");       
		this.jComboBoxTiposReportesValorPorUnidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesValorPorUnidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesValorPorUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionValorPorUnidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionValorPorUnidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesValorPorUnidad.setText("Accion");
		this.jComboBoxTiposRelacionesValorPorUnidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesValorPorUnidad.setText("Accion");
		this.jComboBoxTiposAccionesValorPorUnidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarValorPorUnidad.setText("Accion");
		this.jComboBoxTiposSeleccionarValorPorUnidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralValorPorUnidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralValorPorUnidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralValorPorUnidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralValorPorUnidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesValorPorUnidad = new JLabelMe();
		
		this.jLabelAccionesValorPorUnidad.setText("Acciones");		
		this.jLabelAccionesValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosValorPorUnidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosValorPorUnidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosValorPorUnidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosValorPorUnidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosValorPorUnidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosValorPorUnidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaValorPorUnidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaValorPorUnidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaValorPorUnidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteValorPorUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteValorPorUnidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteValorPorUnidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresValorPorUnidad = new JButtonMe();
		//this.jButtonAnterioresValorPorUnidad.setText("<<");
        this.jButtonAnterioresValorPorUnidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresValorPorUnidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesValorPorUnidad = new JButtonMe();
		//this.jButtonSiguientesValorPorUnidad.setText(">>");
        this.jButtonSiguientesValorPorUnidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesValorPorUnidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosValorPorUnidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosValorPorUnidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosValorPorUnidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosValorPorUnidad,"nuevoguardarcambios_button","Nue",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosValorPorUnidad";
		inputMap = this.jButtonNuevoGuardarCambiosValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosValorPorUnidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionValorPorUnidad";
		inputMap = this.jButtonRecargarInformacionValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionValorPorUnidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesValorPorUnidad";
		inputMap = this.jButtonSiguientesValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesValorPorUnidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresValorPorUnidad";
		inputMap = this.jButtonAnterioresValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresValorPorUnidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasValorPorUnidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesValorPorUnidad.setMinimumSize(new Dimension(this.getWidth(),ValorPorUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ValorPorUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesValorPorUnidad.setMaximumSize(new Dimension(this.getWidth(),ValorPorUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ValorPorUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesValorPorUnidad.setPreferredSize(new Dimension(this.getWidth(),ValorPorUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ValorPorUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionValorPorUnidad = new GridBagLayout();

			this.jPanelPaginacionValorPorUnidad.setLayout(gridaBagLayoutPaginacionValorPorUnidad);						
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 0;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonAnterioresValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
					
						
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsValorPorUnidad.gridy = 0;
			
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonNuevoGuardarCambiosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
						
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsValorPorUnidad.gridy = 0;
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonSiguientesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 1;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonNuevoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
						
			
			
			if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
				this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsValorPorUnidad.gridy = 1;
				this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionValorPorUnidad.add(this.jButtonGuardarCambiosTablaValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			}
			
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 1;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonDuplicarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 1;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonCopiarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 1;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonVerFormValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 1;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionValorPorUnidad.add(this.jButtonCerrarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		
		this.jButtonRecargarInformacionValorPorUnidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionValorPorUnidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionValorPorUnidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesValorPorUnidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesValorPorUnidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesValorPorUnidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesValorPorUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesValorPorUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesValorPorUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesValorPorUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesValorPorUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesValorPorUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionValorPorUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionValorPorUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionValorPorUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesValorPorUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesValorPorUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesValorPorUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesValorPorUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorPorUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorPorUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarValorPorUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarValorPorUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarValorPorUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaValorPorUnidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaValorPorUnidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaValorPorUnidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteValorPorUnidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteValorPorUnidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteValorPorUnidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosValorPorUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosValorPorUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosValorPorUnidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosValorPorUnidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosValorPorUnidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosValorPorUnidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesValorPorUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesValorPorUnidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ValorPorUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ValorPorUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ValorPorUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ValorPorUnidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesValorPorUnidad.setLayout(gridaBagParametrosReportesValorPorUnidad);
			this.jPanelParametrosReportesAccionesValorPorUnidad.setLayout(gridaBagParametrosReportesAccionesValorPorUnidad);
			
			
			this.jPanelParametrosAuxiliar1ValorPorUnidad.setLayout(gridaBagParametrosAuxiliar1ValorPorUnidad);
			this.jPanelParametrosAuxiliar2ValorPorUnidad.setLayout(gridaBagParametrosAuxiliar2ValorPorUnidad);
			this.jPanelParametrosAuxiliar3ValorPorUnidad.setLayout(gridaBagParametrosAuxiliar3ValorPorUnidad);
			this.jPanelParametrosAuxiliar4ValorPorUnidad.setLayout(gridaBagParametrosAuxiliar4ValorPorUnidad);
			//this.jPanelParametrosAuxiliar5ValorPorUnidad.setLayout(gridaBagParametrosAuxiliar2ValorPorUnidad);			
			
			
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorPorUnidad.add(this.jButtonRecargarInformacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ValorPorUnidad.add(this.jComboBoxTiposPaginacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ValorPorUnidad.add(this.jCheckBoxConAltoMaximoTablaValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ValorPorUnidad.add(this.jComboBoxTiposArchivosReportesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorPorUnidad.add(this.jPanelParametrosAuxiliar1ValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ValorPorUnidad.add(this.jComboBoxTiposReportesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);																		
			
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ValorPorUnidad.add(this.jComboBoxTiposGraficosReportesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorPorUnidad.add(this.jPanelParametrosAuxiliar4ValorPorUnidad, this.gridBagConstraintsValorPorUnidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorPorUnidad.add(this.jComboBoxTiposReportesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorPorUnidad.add(this.jCheckBoxGenerarReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorPorUnidad.add(this.jPanelParametrosAuxiliar2ValorPorUnidad, this.gridBagConstraintsValorPorUnidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorPorUnidad.add(this.jLabelAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
				this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesValorPorUnidad.add(this.jButtonAbrirOrderByValorPorUnidad, this.gridBagConstraintsValorPorUnidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorPorUnidad.add(this.jComboBoxTiposSeleccionarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
			
			
			/*
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorPorUnidad.add(this.jCheckBoxSeleccionarTodosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorPorUnidad.add(this.jCheckBoxConGraficoReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ValorPorUnidad.add(this.jCheckBoxSeleccionarTodosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);															
				
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ValorPorUnidad.add(this.jCheckBoxSeleccionadosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);															
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorPorUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ValorPorUnidad.add(this.jCheckBoxConGraficoReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorPorUnidad.add(this.jPanelParametrosAuxiliar3ValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorPorUnidad.add(this.jComboBoxTiposAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
	
				
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorPorUnidad.add(this.jTextFieldValorCampoGeneralValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosValorPorUnidad = new GridBagLayout();

			this.jScrollPanelDatosValorPorUnidad.setLayout(gridaBagLayoutDatosValorPorUnidad);
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = 0;
			this.gridBagConstraintsValorPorUnidad.gridx = 0;
			
			this.jScrollPanelDatosValorPorUnidad.add(this.jTableDatosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosValorPorUnidad.setViewportView(this.jTableDatosValorPorUnidad);
		this.jTableDatosValorPorUnidad.setFillsViewportHeight(true);
		this.jTableDatosValorPorUnidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesValorPorUnidad= new GridBagLayout();
		this.jPanelAccionesValorPorUnidad.setLayout(gridaBagLayoutAccionesValorPorUnidad);
		
		
		/*	
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
			
		this.jPanelAccionesValorPorUnidad.add(this.jButtonNuevoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdUnidadValorPorUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadValorPorUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadValorPorUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadValorPorUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadValorPorUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadValorPorUnidad.setLayout(gridaBagLayoutFK_IdUnidadValorPorUnidad);

		gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorPorUnidad.gridy = 0;
		gridBagConstraintsValorPorUnidad.gridx = 0;
		jPanelFK_IdUnidadValorPorUnidad.add(jLabelid_unidadFK_IdUnidadValorPorUnidad, gridBagConstraintsValorPorUnidad);

		gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorPorUnidad.gridy = 0;
		gridBagConstraintsValorPorUnidad.gridx = 1;
		jPanelFK_IdUnidadValorPorUnidad.add(jComboBoxid_unidadFK_IdUnidadValorPorUnidad, gridBagConstraintsValorPorUnidad);

		gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorPorUnidad.gridy = 1;
		gridBagConstraintsValorPorUnidad.gridx =1;
		jPanelFK_IdUnidadValorPorUnidad.add(jButtonFK_IdUnidadValorPorUnidad, gridBagConstraintsValorPorUnidad);

		jTabbedPaneBusquedasValorPorUnidad.addTab("1.-Por Unidad ", jPanelFK_IdUnidadValorPorUnidad);
		jTabbedPaneBusquedasValorPorUnidad.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutValorPorUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutValorPorUnidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();						
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsValorPorUnidad.gridx = 0;		
			//this.gridBagConstraintsValorPorUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsValorPorUnidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsValorPorUnidad.gridx = 0;		
		//this.gridBagConstraintsValorPorUnidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsValorPorUnidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsValorPorUnidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsValorPorUnidad.gridx = 0;		
			this.gridBagConstraintsValorPorUnidad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsValorPorUnidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasValorPorUnidad, this.gridBagConstraintsValorPorUnidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);								
		
		
		/*
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		*/		
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsValorPorUnidad.gridx =0;
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsValorPorUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
				
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosValorPorUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosValorPorUnidad = new GridBagLayout();
			this.jPanelBusquedasParametrosValorPorUnidad.setLayout(gridaBagLayoutBusquedasParametrosValorPorUnidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralValorPorUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralValorPorUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorPorUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorPorUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralValorPorUnidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoValorPorUnidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoValorPorUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoValorPorUnidad.setName("jPanelReporteDinamicoValorPorUnidad"); 
		
		this.jPanelReporteDinamicoValorPorUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoValorPorUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoValorPorUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoValorPorUnidad.setLayout(gridaBagLayoutReporteDinamicoValorPorUnidad);
		
		
		this.jInternalFrameReporteDinamicoValorPorUnidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoValorPorUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteValorPorUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoValorPorUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoValorPorUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoValorPorUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoValorPorUnidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoValorPorUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoValorPorUnidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoValorPorUnidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoValorPorUnidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoValorPorUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoValorPorUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoValorPorUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Por Unidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteValorPorUnidad = new JLabelMe();

		this.jLabelColumnasSelectReporteValorPorUnidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelColumnasSelectReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteValorPorUnidad = new JList<Reporte>();
		this.jListColumnasSelectReporteValorPorUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteValorPorUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteValorPorUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteValorPorUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteValorPorUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteValorPorUnidad=new JScrollPane(this.jListColumnasSelectReporteValorPorUnidad);
			
			this.jScrollColumnasSelectReporteValorPorUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteValorPorUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteValorPorUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoValorPorUnidad.add(this.jListColumnasSelectReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jScrollColumnasSelectReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteValorPorUnidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteValorPorUnidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteValorPorUnidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteValorPorUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteValorPorUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteValorPorUnidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteValorPorUnidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteValorPorUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteValorPorUnidad=new JScrollPane(this.jListRelacionesSelectReporteValorPorUnidad);
			
			this.jScrollRelacionesSelectReporteValorPorUnidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteValorPorUnidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteValorPorUnidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoValorPorUnidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoValorPorUnidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoValorPorUnidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoValorPorUnidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoValorPorUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoValorPorUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoValorPorUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoValorPorUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoValorPorUnidad = new JLabelMe();

		this.jLabelConGraficoDinamicoValorPorUnidad.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelConGraficoDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoValorPorUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoValorPorUnidad.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoValorPorUnidad.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoValorPorUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoValorPorUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoValorPorUnidad.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jCheckBoxConGraficoDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoValorPorUnidad = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoValorPorUnidad.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelColumnaCategoriaGraficoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoValorPorUnidad.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoValorPorUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoValorPorUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoValorPorUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoValorPorUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jComboBoxColumnaCategoriaGraficoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorValorPorUnidad = new JLabelMe();

		this.jLabelColumnaCategoriaValorValorPorUnidad.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelColumnaCategoriaValorValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorValorPorUnidad.setText("Accion");
        this.jComboBoxColumnaCategoriaValorValorPorUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorValorPorUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorValorPorUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorValorPorUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jComboBoxColumnaCategoriaValorValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoValorPorUnidad = new JLabelMe();

		this.jLabelColumnasValoresGraficoValorPorUnidad.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelColumnasValoresGraficoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoValorPorUnidad = new JList<Reporte>();
		this.jListColumnasValoresGraficoValorPorUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoValorPorUnidad.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoValorPorUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoValorPorUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoValorPorUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoValorPorUnidad=new JScrollPane(this.jListColumnasValoresGraficoValorPorUnidad);
			
			this.jScrollColumnasValoresGraficoValorPorUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoValorPorUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoValorPorUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoValorPorUnidad.add(this.jListColumnasSelectReporteValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jScrollColumnasValoresGraficoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoValorPorUnidad = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoValorPorUnidad.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelTiposGraficosReportesDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoValorPorUnidad.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoValorPorUnidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoValorPorUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoValorPorUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoValorPorUnidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jComboBoxTiposGraficosReportesDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoValorPorUnidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoValorPorUnidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelGenerarExcelReporteDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoValorPorUnidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoValorPorUnidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoValorPorUnidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoValorPorUnidad.setToolTipText("Generar EXCEL"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		//this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoValorPorUnidad.add(this.jButtonGenerarExcelReporteDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jComboBoxTiposReportesDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoValorPorUnidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoValorPorUnidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jLabelTiposArchivoReporteDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jComboBoxTiposArchivosReportesDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoValorPorUnidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoValorPorUnidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoValorPorUnidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoValorPorUnidad.setToolTipText("Generar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jButtonGenerarReporteDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoValorPorUnidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoValorPorUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoValorPorUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoValorPorUnidad.setToolTipText("Cancelar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorPorUnidad.add(this.jButtonCerrarReporteDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalValorPorUnidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoValorPorUnidad= new JScrollPane(jPanelReporteDinamicoValorPorUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoValorPorUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoValorPorUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoValorPorUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Por Unidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsValorPorUnidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoValorPorUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoValorPorUnidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalValorPorUnidad);
		this.jInternalFrameReporteDinamicoValorPorUnidad.getContentPane().add(this.jScrollPanelReporteDinamicoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionValorPorUnidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionValorPorUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionValorPorUnidad.setName("jPanelImportacionValorPorUnidad"); 
		
		this.jPanelImportacionValorPorUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionValorPorUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionValorPorUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionValorPorUnidad.setLayout(gridaBagLayoutImportacionValorPorUnidad);
		
		
		this.jInternalFrameImportacionValorPorUnidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionValorPorUnidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionValorPorUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteValorPorUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionValorPorUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionValorPorUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionValorPorUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionValorPorUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionValorPorUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionValorPorUnidad.setResizable(true);
	    this.jInternalFrameImportacionValorPorUnidad.setClosable(true);
	    this.jInternalFrameImportacionValorPorUnidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionValorPorUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionValorPorUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionValorPorUnidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionValorPorUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionValorPorUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionValorPorUnidad.setResizable(true);
	    this.jInternalFrameImportacionValorPorUnidad.setClosable(true);
	    this.jInternalFrameImportacionValorPorUnidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionValorPorUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionValorPorUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionValorPorUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Por Unidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionValorPorUnidad = new JLabelMe();

		this.jLabelArchivoImportacionValorPorUnidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionValorPorUnidad.add(this.jLabelArchivoImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionValorPorUnidad = new JFileChooser();		
		this.jFileChooserImportacionValorPorUnidad.setToolTipText("ESCOGER ARCHIVO"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionValorPorUnidad = new JButtonMe();
		this.jButtonAbrirImportacionValorPorUnidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionValorPorUnidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionValorPorUnidad.setToolTipText("Generar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorPorUnidad.add(this.jButtonAbrirImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionValorPorUnidad = new JLabelMe();

		this.jLabelPathArchivoImportacionValorPorUnidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionValorPorUnidad.add(this.jLabelPathArchivoImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionValorPorUnidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionValorPorUnidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionValorPorUnidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionValorPorUnidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorPorUnidad.add(this.jTextFieldPathArchivoImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionValorPorUnidad = new JButtonMe();
		this.jButtonGenerarImportacionValorPorUnidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionValorPorUnidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionValorPorUnidad.setToolTipText("Generar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorPorUnidad.add(this.jButtonGenerarImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionValorPorUnidad = new JButtonMe();
		this.jButtonCerrarImportacionValorPorUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionValorPorUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionValorPorUnidad.setToolTipText("Cancelar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorPorUnidad.add(this.jButtonCerrarImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalValorPorUnidad = new GridBagLayout();
		
		this.jScrollPanelImportacionValorPorUnidad= new JScrollPane(jPanelImportacionValorPorUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy =iPosYImportacion;
		this.gridBagConstraintsValorPorUnidad.gridx =iPosXImportacion;
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionValorPorUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionValorPorUnidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalValorPorUnidad);
		this.jInternalFrameImportacionValorPorUnidad.getContentPane().add(this.jScrollPanelImportacionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByValorPorUnidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByValorPorUnidad = new JButtonMe();
			this.jButtonAbrirOrderByValorPorUnidad.setText("Orden");
			this.jButtonAbrirOrderByValorPorUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByValorPorUnidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByValorPorUnidad";
			inputMap = this.jButtonAbrirOrderByValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByValorPorUnidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByValorPorUnidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByValorPorUnidad.setName("jPanelOrderByValorPorUnidad"); 
			
			this.jPanelOrderByValorPorUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByValorPorUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByValorPorUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByValorPorUnidad.setLayout(gridaBagLayoutOrderByValorPorUnidad);
			
			
			this.jTableDatosValorPorUnidadOrderBy = new JTableMe();        
			this.jTableDatosValorPorUnidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosValorPorUnidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosValorPorUnidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosValorPorUnidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosValorPorUnidadOrderBy.setViewportView(this.jTableDatosValorPorUnidadOrderBy);
			this.jTableDatosValorPorUnidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosValorPorUnidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByValorPorUnidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByValorPorUnidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByValorPorUnidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteValorPorUnidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByValorPorUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByValorPorUnidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByValorPorUnidad.setTitle("Orden");
			this.jInternalFrameOrderByValorPorUnidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByValorPorUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByValorPorUnidad.setResizable(true);
			this.jInternalFrameOrderByValorPorUnidad.setClosable(true);
			this.jInternalFrameOrderByValorPorUnidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByValorPorUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByValorPorUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByValorPorUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Por Unidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsValorPorUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsValorPorUnidad.ipady =150;
				
			this.jPanelOrderByValorPorUnidad.add(jScrollPanelDatosValorPorUnidadOrderBy, this.gridBagConstraintsValorPorUnidad);//this.jTableDatosValorPorUnidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByValorPorUnidad = new JButtonMe();
			this.jButtonCerrarOrderByValorPorUnidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByValorPorUnidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByValorPorUnidad.setToolTipText("Cancelar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsValorPorUnidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByValorPorUnidad.add(this.jButtonCerrarOrderByValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalValorPorUnidad = new GridBagLayout();
			
			this.jScrollPanelOrderByValorPorUnidad= new JScrollPane(jPanelOrderByValorPorUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsValorPorUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByValorPorUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByValorPorUnidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalValorPorUnidad);
			
			this.jInternalFrameOrderByValorPorUnidad.getContentPane().add(this.jScrollPanelOrderByValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
		
		} else {
			this.jButtonAbrirOrderByValorPorUnidad = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.valorporunidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosValorPorUnidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosValorPorUnidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosValorPorUnidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosValorPorUnidad.getRowHeight();//ValorPorUnidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaValorPorUnidad.isSelected()) {
					iHeightTable=ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaValorPorUnidad.isSelected()) {
					iHeightTable=ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ValorPorUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosValorPorUnidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosValorPorUnidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosValorPorUnidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosValorPorUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosValorPorUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosValorPorUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByValorPorUnidad!=null && this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy()!=null) {
			//if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByValorPorUnidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByValorPorUnidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByValorPorUnidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByValorPorUnidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosValorPorUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosValorPorUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosValorPorUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=valorporunidadLogic.getValorPorUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=valorporunidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ValorPorUnidad> TraerValorPorUnidadBeans(List<ValorPorUnidad> valorporunidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(ValorPorUnidad valorporunidad:valorporunidads) {
					
				if(!(ValorPorUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ValorPorUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					valorporunidad.setsDetalleGeneralEntityReporte(ValorPorUnidadConstantesFunciones.getValorPorUnidadDescripcion(valorporunidad));
										
						
					
						
					
				} else  {
							
					//valorporunidad.setsDetalleGeneralEntityReporte(valorporunidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//valorporunidadbeans.add(valorporunidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return valorporunidads;
    }
	//PARA REPORTES FIN
}
