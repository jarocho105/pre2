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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoAutoriConsepConstantesFunciones;

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
public class TipoAutoriConsepJInternalFrame extends TipoAutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoAutoriConsep;
	
	protected JMenuBar jmenuBarTipoAutoriConsep;
	
	protected JMenu jmenuTipoAutoriConsep;
	protected JMenu jmenuDatosTipoAutoriConsep;
	protected JMenu jmenuArchivoTipoAutoriConsep;
	protected JMenu jmenuAccionesTipoAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsTipoAutoriConsep;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoAutoriConsepDetalleFormJInternalFrame jInternalFrameDetalleFormTipoAutoriConsep;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoAutoriConsep;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoAutoriConsep;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoAutoriConsepSessionBean tipoautoriconsepSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoAutoriConsep> tipoautoriconseps;		
	public List<TipoAutoriConsep> tipoautoriconsepsEliminados;	
	public List<TipoAutoriConsep> tipoautoriconsepsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoAutoriConsep;		
	protected JButton jButtonAbrirOrderByTipoAutoriConsep;
	
	
	//protected JPanel jPanelOrderByTipoAutoriConsep;
	//public JScrollPane jScrollPanelOrderByTipoAutoriConsep;	
	//protected JButton jButtonCerrarOrderByTipoAutoriConsep;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoAutoriConsepLogic tipoautoriconsepLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionTipoAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralTipoAutoriConsep;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoAutoriConsepOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoAutoriConsep;
	//public JScrollPane jScrollPanelImportacionTipoAutoriConsep;
	
	
	
	protected JPanel jPanelAccionesTipoAutoriConsep;
	
    protected JPanel jPanelPaginacionTipoAutoriConsep;
    protected JPanel jPanelParametrosReportesTipoAutoriConsep;
	protected JPanel jPanelParametrosReportesAccionesTipoAutoriConsep;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar2TipoAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar3TipoAutoriConsep;
	protected JPanel jPanelParametrosAuxiliar4TipoAutoriConsep;
	//protected JPanel jPanelParametrosAuxiliar5TipoAutoriConsep;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoAutoriConsep;
	//protected JPanel jPanelImportacionTipoAutoriConsep;
	
	
	public JTable jTableDatosTipoAutoriConsep;
	
	
	
	//public JTable jTableDatosTipoAutoriConsepOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoAutoriConsep;
	protected JButton jButtonDuplicarTipoAutoriConsep;
	protected JButton jButtonCopiarTipoAutoriConsep;
	protected JButton jButtonVerFormTipoAutoriConsep;
	protected JButton jButtonNuevoRelacionesTipoAutoriConsep;
	protected JButton jButtonModificarTipoAutoriConsep;
	
    protected JButton jButtonGuardarCambiosTablaTipoAutoriConsep;
	protected JButton jButtonCerrarTipoAutoriConsep;
	
	
	protected JButton jButtonRecargarInformacionTipoAutoriConsep;
	protected JButton jButtonProcesarInformacionTipoAutoriConsep;
	
	
	protected JButton jButtonAnterioresTipoAutoriConsep;
	protected JButton jButtonSiguientesTipoAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosTipoAutoriConsep;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoAutoriConsep;
	//protected JButton jButtonCerrarReporteDinamicoTipoAutoriConsep;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoAutoriConsep;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoAutoriConsep;
	//protected JButton jButtonGenerarImportacionTipoAutoriConsep;
	//protected JButton jButtonCerrarImportacionTipoAutoriConsep;
	//protected JFileChooser jFileChooserImportacionTipoAutoriConsep;
	//protected File fileImportacionTipoAutoriConsep;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAutoriConsep;
	protected JButton jButtonDuplicarToolBarTipoAutoriConsep;
	protected JButton jButtonNuevoRelacionesToolBarTipoAutoriConsep;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoAutoriConsep;
	protected JButton jButtonCopiarToolBarTipoAutoriConsep;
	protected JButton jButtonVerFormToolBarTipoAutoriConsep;
	public JButton jButtonGuardarCambiosTablaToolBarTipoAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAutoriConsep;
	protected JButton jButtonCerrarToolBarTipoAutoriConsep;
	
	protected JButton jButtonRecargarInformacionToolBarTipoAutoriConsep;
	protected JButton jButtonProcesarInformacionToolBarTipoAutoriConsep;
	protected JButton jButtonAnterioresToolBarTipoAutoriConsep;
	protected JButton jButtonSiguientesToolBarTipoAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoAutoriConsep;
	protected JButton jButtonAbrirOrderByToolBarTipoAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAutoriConsep;
	protected JMenuItem jMenuItemDuplicarTipoAutoriConsep;
	protected JMenuItem jMenuItemNuevoRelacionesTipoAutoriConsep;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoAutoriConsep;
	protected JMenuItem jMenuItemCopiarTipoAutoriConsep;
	protected JMenuItem jMenuItemVerFormTipoAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAutoriConsep;
	protected JMenuItem jMenuItemCerrarTipoAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarTipoAutoriConsep;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAutoriConsep;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoAutoriConsep;
	protected JMenuItem jMenuItemProcesarInformacionTipoAutoriConsep;
	protected JMenuItem jMenuItemAnterioresTipoAutoriConsep;
	protected JMenuItem jMenuItemSiguientesTipoAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAutoriConsep;
	protected JMenuItem jMenuItemAbrirOrderByTipoAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarTipoAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAutoriConsep;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoAutoriConsep;
	protected JCheckBox jCheckBoxSeleccionadosTipoAutoriConsep;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoAutoriConsep;
	protected JCheckBox jCheckBoxConGraficoReporteTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoAutoriConsep;
	protected JTextField jTextFieldValorCampoGeneralTipoAutoriConsep;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoAutoriConsep;
	//public JList<Reporte> jListColumnasSelectReporteTipoAutoriConsep;
	//public JScrollPane jScrollColumnasSelectReporteTipoAutoriConsep;
	
	//public JLabel jLabelRelacionesSelectReporteTipoAutoriConsep;
	//public JList<Reporte> jListRelacionesSelectReporteTipoAutoriConsep;
	//public JScrollPane jScrollRelacionesSelectReporteTipoAutoriConsep;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoAutoriConsep;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoAutoriConsep;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoAutoriConsep;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoAutoriConsep;
	
		
	//public JLabel jLabelArchivoImportacionTipoAutoriConsep;	
	//public JLabel jLabelPathArchivoImportacionTipoAutoriConsep;
	//protected JTextField jTextFieldPathArchivoImportacionTipoAutoriConsep;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoAutoriConsep;
	
	//public JLabel jLabelColumnaCategoriaValorTipoAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoAutoriConsep;
	
	//public JLabel jLabelColumnasValoresGraficoTipoAutoriConsep;
	//public JList<Reporte> jListColumnasValoresGraficoTipoAutoriConsep;
	//public JScrollPane jScrollColumnasValoresGraficoTipoAutoriConsep;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoAutoriConsep;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoAutoriConsep;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoAutoriConsep;
	public JPanel jPanelBusquedaPorCodigoTipoAutoriConsep;
	public JButton jButtonBusquedaPorCodigoTipoAutoriConsep;
	public JPanel jPanelBusquedaPorNombreTipoAutoriConsep;
	public JButton jButtonBusquedaPorNombreTipoAutoriConsep;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoAutoriConsep;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoAutoriConsep;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep;
	public JButton jButtoncodigoBusquedaPorCodigoTipoAutoriConsepBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoAutoriConsep;
	public JLabel jLabelnombreBusquedaPorNombreTipoAutoriConsep;
	public JTextField jTextFieldnombreBusquedaPorNombreTipoAutoriConsep;
	public JButton jButtonnombreBusquedaPorNombreTipoAutoriConsepBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoAutoriConsepJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoAutoriConsep)	{
		this.jButtonRecargarInformacionTipoAutoriConsep = jButtonRecargarInformacionTipoAutoriConsep;
	}
	
	public JButton getjButtonProcesarInformacionTipoAutoriConsep() {
		return this.jButtonProcesarInformacionTipoAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAutoriConsep)	{
		this.jButtonProcesarInformacionTipoAutoriConsep = jButtonProcesarInformacionTipoAutoriConsep;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoAutoriConsep() {
		return this.jButtonRecargarInformacionTipoAutoriConsep;
	}
	
	
	public List<TipoAutoriConsep> gettipoautoriconseps() {
		return this.tipoautoriconseps;
	}

	public void settipoautoriconseps(List<TipoAutoriConsep> tipoautoriconseps) {
		this.tipoautoriconseps = tipoautoriconseps;
	}
	
	public List<TipoAutoriConsep> gettipoautoriconsepsAux() {
		return this.tipoautoriconsepsAux;
	}

	public void settipoautoriconsepsAux(List<TipoAutoriConsep> tipoautoriconsepsAux) {
		this.tipoautoriconsepsAux = tipoautoriconsepsAux;
	}
	
	public List<TipoAutoriConsep> gettipoautoriconsepsEliminados() {
		return this.tipoautoriconsepsEliminados;
	}

	public void setTipoAutoriConsepsEliminados(List<TipoAutoriConsep> tipoautoriconsepsEliminados) {
		this.tipoautoriconsepsEliminados = tipoautoriconsepsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoAutoriConsep() {
		return jComboBoxTiposSeleccionarTipoAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoAutoriConsep(
			JComboBox jComboBoxTiposSeleccionarTipoAutoriConsep) {
		this.jComboBoxTiposSeleccionarTipoAutoriConsep = jComboBoxTiposSeleccionarTipoAutoriConsep;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoAutoriConsep() {
		return jTextFieldValorCampoGeneralTipoAutoriConsep;
	}

	public void setjTextFieldValorCampoGeneralTipoAutoriConsep(
			JTextField jTextFieldValorCampoGeneralTipoAutoriConsep) {
		this.jTextFieldValorCampoGeneralTipoAutoriConsep = jTextFieldValorCampoGeneralTipoAutoriConsep;
	}

	public void setBorderResaltarValorCampoGeneralTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoAutoriConsep .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoAutoriConsep() {
		return this.jCheckBoxSeleccionarTodosTipoAutoriConsep;
	}

	public void setjCheckBoxSeleccionarTodosTipoAutoriConsep(
			JCheckBox jCheckBoxSeleccionarTodosTipoAutoriConsep) {
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep = jCheckBoxSeleccionarTodosTipoAutoriConsep;
	}

	public void setBorderResaltarSeleccionarTodosTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoAutoriConsep() {
		return this.jCheckBoxSeleccionadosTipoAutoriConsep;
	}

	public void setjCheckBoxSeleccionadosTipoAutoriConsep(
			JCheckBox jCheckBoxSeleccionadosTipoAutoriConsep) {
		this.jCheckBoxSeleccionadosTipoAutoriConsep = jCheckBoxSeleccionadosTipoAutoriConsep;
	}
	
	public void setBorderResaltarSeleccionadosTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoAutoriConsep() {
		return this.jComboBoxTiposArchivosReportesTipoAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoAutoriConsep(
			JComboBox jComboBoxTiposArchivosReportesTipoAutoriConsep) {
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep = jComboBoxTiposArchivosReportesTipoAutoriConsep;
	}

	public void setBorderResaltarTiposArchivosReportesTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoAutoriConsep() {
		return this.jComboBoxTiposReportesTipoAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoAutoriConsep(
			JComboBox jComboBoxTiposReportesTipoAutoriConsep) {
		this.jComboBoxTiposReportesTipoAutoriConsep = jComboBoxTiposReportesTipoAutoriConsep;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoAutoriConsep() {
	//	return jComboBoxTiposReportesDinamicoTipoAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoAutoriConsep(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoAutoriConsep) {
	//	this.jComboBoxTiposReportesDinamicoTipoAutoriConsep = jComboBoxTiposReportesDinamicoTipoAutoriConsep;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep = jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep;
	//}
	
	public void setBorderResaltarTiposReportesTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoAutoriConsep() {
		return this.jComboBoxTiposGraficosReportesTipoAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoAutoriConsep(
			JComboBox jComboBoxTiposGraficosReportesTipoAutoriConsep) {
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep = jComboBoxTiposGraficosReportesTipoAutoriConsep;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoAutoriConsep() {
		return this.jComboBoxTiposPaginacionTipoAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoAutoriConsep(
			JComboBox jComboBoxTiposPaginacionTipoAutoriConsep) {
		this.jComboBoxTiposPaginacionTipoAutoriConsep = jComboBoxTiposPaginacionTipoAutoriConsep;
	}
	
	public void setBorderResaltarTiposPaginacionTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoAutoriConsep() {
		return this.jComboBoxTiposRelacionesTipoAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAutoriConsep() {
		return this.jComboBoxTiposAccionesTipoAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAutoriConsep(
			JComboBox jComboBoxTiposRelacionesTipoAutoriConsep) {
		this.jComboBoxTiposRelacionesTipoAutoriConsep = jComboBoxTiposRelacionesTipoAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAutoriConsep(
			JComboBox jComboBoxTiposAccionesTipoAutoriConsep) {
		this.jComboBoxTiposAccionesTipoAutoriConsep = jComboBoxTiposAccionesTipoAutoriConsep;
	}
	
	public void setBorderResaltarTiposRelacionesTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoAutoriConsep() {
	//	return jCheckBoxConGraficoDinamicoTipoAutoriConsep;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoAutoriConsep(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoAutoriConsep) {
	//	this.jCheckBoxConGraficoDinamicoTipoAutoriConsep = jCheckBoxConGraficoDinamicoTipoAutoriConsep;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoAutoriConsep() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoAutoriConsep.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoAutoriConsep .setBorder(borderResaltar);		
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
		this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
		
		this.tipoautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoautoriconsepSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Autorizacion Consep MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoAutoriConsep= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"nuevo","nuevo","Nuevo"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"duplicar","duplicar","Duplicar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"copiar","copiar","Copiar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"ver_form","ver_form","Ver"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"recargar","recargar","Recargar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,
							"cerrar","cerrar","Salir"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoAutoriConsep=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoAutoriConsep;
			
				this.jButtonProcesarInformacionToolBarTipoAutoriConsep=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoAutoriConsep;
				
		//protected JButton jButtonModificarToolBarTipoAutoriConsep;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoAutoriConsep=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoAutoriConsep=new JMenuMe("General");
		this.jmenuArchivoTipoAutoriConsep=new JMenuMe("Archivo");
		this.jmenuAccionesTipoAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDatosTipoAutoriConsep=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoAutoriConsep= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoAutoriConsep.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoAutoriConsep,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoAutoriConsep= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoAutoriConsep.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoAutoriConsep,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoAutoriConsep= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoAutoriConsep.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoAutoriConsep,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoAutoriConsep= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoAutoriConsep.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoAutoriConsep,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoAutoriConsep= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoAutoriConsep.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoAutoriConsep,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoAutoriConsep= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoAutoriConsep.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoAutoriConsep,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoAutoriConsep= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoAutoriConsep.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoAutoriConsep,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoAutoriConsep= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoAutoriConsep.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoAutoriConsep,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoAutoriConsep= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoAutoriConsep.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoAutoriConsep,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoAutoriConsep.add(this.jMenuItemCerrarTipoAutoriConsep);
			
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemNuevoTipoAutoriConsep);
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep);
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemNuevoRelacionesTipoAutoriConsep);
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemGuardarCambiosTablaTipoAutoriConsep);		
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemDuplicarTipoAutoriConsep);		
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemCopiarTipoAutoriConsep);		
			this.jmenuAccionesTipoAutoriConsep.add(this.jMenuItemVerFormTipoAutoriConsep);		
			
			this.jmenuDatosTipoAutoriConsep.add(this.jMenuItemRecargarInformacionTipoAutoriConsep);				
			this.jmenuDatosTipoAutoriConsep.add(this.jMenuItemAnterioresTipoAutoriConsep);				
			this.jmenuDatosTipoAutoriConsep.add(this.jMenuItemSiguientesTipoAutoriConsep);				
			this.jmenuDatosTipoAutoriConsep.add(this.jMenuItemAbrirOrderByTipoAutoriConsep);				
			this.jmenuDatosTipoAutoriConsep.add(this.jMenuItemMostrarOcultarTipoAutoriConsep);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoAutoriConsep.add(this.jMenuItemGuardarCambiosTipoAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoAutoriConsep.add(this.jmenuArchivoTipoAutoriConsep);		
			this.jmenuBarTipoAutoriConsep.add(this.jmenuAccionesTipoAutoriConsep);		
			this.jmenuBarTipoAutoriConsep.add(this.jmenuDatosTipoAutoriConsep);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoAutoriConsep);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoAutoriConsep() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoAutoriConsep.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoAutoriConsep= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoAutoriConsep.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoAutoriConsep.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoAutoriConsep,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoAutoriConsep = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoAutoriConsep.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoAutoriConsep.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoAutoriConsep.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoAutoriConsep= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoAutoriConsep.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoAutoriConsep.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoAutoriConsep,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoAutoriConsep = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoAutoriConsep.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoAutoriConsep.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreTipoAutoriConsep= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoAutoriConsep=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoAutoriConsep = new TipoAutoriConsepDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Autorizacion Consep DATOS");
			this.jInternalFrameDetalleFormTipoAutoriConsep = new TipoAutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.tipoautoriconsepSessionBean.getConGuardarRelaciones(),this.tipoautoriconsepSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoAutoriConsep = null;//new TipoAutoriConsepDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAutoriConsep= new GridBagLayout();
		
		
		this.jTableDatosTipoAutoriConsep = new JTableMe();      
		
		String sToolTipTipoAutoriConsep="";
		sToolTipTipoAutoriConsep=TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAutoriConsep+="(Inventario.TipoAutoriConsep)";
		}
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAutoriConsep+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoAutoriConsep.setToolTipText(sToolTipTipoAutoriConsep);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoAutoriConsep);
		this.jTableDatosTipoAutoriConsep.setAutoCreateRowSorter(true);
		this.jTableDatosTipoAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoAutoriConsep.setRowSelectionAllowed(true);
		this.jTableDatosTipoAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoAutoriConsep = new JButtonMe();
		this.jButtonDuplicarTipoAutoriConsep = new JButtonMe();
		this.jButtonCopiarTipoAutoriConsep = new JButtonMe();
		this.jButtonVerFormTipoAutoriConsep = new JButtonMe();
		this.jButtonNuevoRelacionesTipoAutoriConsep = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep = new JButtonMe();
		this.jButtonCerrarTipoAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosTipoAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoAutoriConsep = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Autorizacion Consep";
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Autorizacion Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesTipoAutoriConsep.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoAutoriConsep=new ReporteDinamicoJInternalFrame(TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoAutoriConsep();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoAutoriConsep=new ImportacionJInternalFrame(TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoAutoriConsep();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoAutoriConsep = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoAutoriConsep.setText("Orden");
		this.jButtonAbrirOrderByTipoAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAutoriConsep,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoriConsep,false,this);
			
			//this.cargarOrderByTipoAutoriConsep(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoriConsep,true,this);
			
			//this.cargarOrderByTipoAutoriConsep(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoAutoriConsep.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAutoriConsep.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAutoriConsep.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoAutoriConsep.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAutoriConsep.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAutoriConsep.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoAutoriConsep.setText("Nuevo");
		this.jButtonDuplicarTipoAutoriConsep.setText("Duplicar");
		this.jButtonCopiarTipoAutoriConsep.setText("Copiar");
		this.jButtonVerFormTipoAutoriConsep.setText("Ver");
		this.jButtonNuevoRelacionesTipoAutoriConsep.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.setText("Guardar");
		this.jButtonCerrarTipoAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAutoriConsep,"nuevo_button","Nuevo",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoAutoriConsep,"duplicar_button","Duplicar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoAutoriConsep,"copiar_button","Copiar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoAutoriConsep,"ver_form","Ver",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoAutoriConsep,"nuevorelaciones_button","Nuevo Rel",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAutoriConsep,"guardarcambiostabla_button","Guardar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAutoriConsep,"cerrar_button","Salir",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoAutoriConsep.setToolTipText("Nuevo"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoAutoriConsep.setToolTipText("Duplicar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoAutoriConsep.setToolTipText("Copiar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoAutoriConsep.setToolTipText("Ver"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoAutoriConsep.setToolTipText("Nuevo Rel"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.setToolTipText("Guardar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAutoriConsep.setToolTipText("Salir"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAutoriConsep";
		inputMap = this.jButtonNuevoTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAutoriConsep"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoAutoriConsep";
		inputMap = this.jButtonDuplicarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoAutoriConsep"));
		
		//COPIAR
		sMapKey = "CopiarTipoAutoriConsep";
		inputMap = this.jButtonCopiarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoAutoriConsep"));
		
		//VEr FORM
		sMapKey = "VerFormTipoAutoriConsep";
		inputMap = this.jButtonVerFormTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoAutoriConsep"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoAutoriConsep"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoAutoriConsep";
		inputMap = this.jButtonModificarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoAutoriConsep"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoAutoriConsep";
		inputMap = this.jButtonCerrarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAutoriConsep"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoAutoriConsep.setName("jPanelParametrosReportesTipoAutoriConsep"); 
		
		this.jPanelParametrosReportesAccionesTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoAutoriConsep.setName("jPanelParametrosReportesAccionesTipoAutoriConsep"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoAutoriConsep = new JButtonMe();
		this.jButtonRecargarInformacionTipoAutoriConsep.setText("Recargar");
		this.jButtonRecargarInformacionTipoAutoriConsep.setToolTipText("Recargar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoAutoriConsep,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoAutoriConsep = new JButtonMe();
		this.jButtonProcesarInformacionTipoAutoriConsep.setText("Procesar");
		this.jButtonProcesarInformacionTipoAutoriConsep.setToolTipText("Procesar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoAutoriConsep.setVisible(false);
			
		this.jButtonProcesarInformacionTipoAutoriConsep.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAutoriConsep.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAutoriConsep.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposReportesTipoAutoriConsep.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoAutoriConsep.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoAutoriConsep.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoAutoriConsep.setText("Accion");
		this.jComboBoxTiposRelacionesTipoAutoriConsep.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesTipoAutoriConsep.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoAutoriConsep.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoAutoriConsep.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoAutoriConsep=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoAutoriConsep.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAutoriConsep.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAutoriConsep.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesTipoAutoriConsep.setText("Acciones");		
		this.jLabelAccionesTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoAutoriConsep.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoAutoriConsep.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoAutoriConsep.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoAutoriConsep.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoAutoriConsep = new JButtonMe();
		//this.jButtonAnterioresTipoAutoriConsep.setText("<<");
        this.jButtonAnterioresTipoAutoriConsep.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoAutoriConsep,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoAutoriConsep = new JButtonMe();
		//this.jButtonSiguientesTipoAutoriConsep.setText(">>");
        this.jButtonSiguientesTipoAutoriConsep.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoAutoriConsep,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoAutoriConsep = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoAutoriConsep.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoAutoriConsep.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoAutoriConsep,"nuevoguardarcambios_button","Nue",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoAutoriConsep";
		inputMap = this.jButtonNuevoGuardarCambiosTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoAutoriConsep"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoAutoriConsep";
		inputMap = this.jButtonRecargarInformacionTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoAutoriConsep"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoAutoriConsep";
		inputMap = this.jButtonSiguientesTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoAutoriConsep"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoAutoriConsep";
		inputMap = this.jButtonAnterioresTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoAutoriConsep"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoAutoriConsep();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),TipoAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),TipoAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),TipoAutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoAutoriConsep = new GridBagLayout();

			this.jPanelPaginacionTipoAutoriConsep.setLayout(gridaBagLayoutPaginacionTipoAutoriConsep);						
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonAnterioresTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
					
						
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
			
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonNuevoGuardarCambiosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
						
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonSiguientesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonNuevoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
				this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonNuevoRelacionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			}
			
			
			if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
				this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonGuardarCambiosTablaTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			}
			
			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonDuplicarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonCopiarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonVerFormTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 1;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoAutoriConsep.add(this.jButtonCerrarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
		
		
		this.jButtonRecargarInformacionTipoAutoriConsep.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAutoriConsep.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAutoriConsep.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAutoriConsep.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoAutoriConsep.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAutoriConsep.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAutoriConsep.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAutoriConsep.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAutoriConsep.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoAutoriConsep.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAutoriConsep.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAutoriConsep.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoAutoriConsep = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoAutoriConsep = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoAutoriConsep.setLayout(gridaBagParametrosReportesTipoAutoriConsep);
			this.jPanelParametrosReportesAccionesTipoAutoriConsep.setLayout(gridaBagParametrosReportesAccionesTipoAutoriConsep);
			
			
			this.jPanelParametrosAuxiliar1TipoAutoriConsep.setLayout(gridaBagParametrosAuxiliar1TipoAutoriConsep);
			this.jPanelParametrosAuxiliar2TipoAutoriConsep.setLayout(gridaBagParametrosAuxiliar2TipoAutoriConsep);
			this.jPanelParametrosAuxiliar3TipoAutoriConsep.setLayout(gridaBagParametrosAuxiliar3TipoAutoriConsep);
			this.jPanelParametrosAuxiliar4TipoAutoriConsep.setLayout(gridaBagParametrosAuxiliar4TipoAutoriConsep);
			//this.jPanelParametrosAuxiliar5TipoAutoriConsep.setLayout(gridaBagParametrosAuxiliar2TipoAutoriConsep);			
			
			
			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jButtonRecargarInformacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAutoriConsep.add(this.jComboBoxTiposPaginacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAutoriConsep.add(this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAutoriConsep.add(this.jComboBoxTiposArchivosReportesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jPanelParametrosAuxiliar1TipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoAutoriConsep.add(this.jComboBoxTiposReportesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jPanelParametrosAuxiliar4TipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jComboBoxTiposReportesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jCheckBoxGenerarReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jPanelParametrosAuxiliar2TipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jLabelAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoAutoriConsep.add(this.jButtonAbrirOrderByTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jComboBoxTiposSeleccionarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
			
			
			/*
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jCheckBoxSeleccionarTodosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAutoriConsep.add(this.jCheckBoxSeleccionarTodosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);															
				
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAutoriConsep.add(this.jCheckBoxSeleccionadosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jPanelParametrosAuxiliar3TipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jComboBoxTiposRelacionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
				
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAutoriConsep.add(this.jComboBoxTiposAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoAutoriConsep = new GridBagLayout();

			this.jScrollPanelDatosTipoAutoriConsep.setLayout(gridaBagLayoutDatosTipoAutoriConsep);
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
			
			this.jScrollPanelDatosTipoAutoriConsep.add(this.jTableDatosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoAutoriConsep.setViewportView(this.jTableDatosTipoAutoriConsep);
		this.jTableDatosTipoAutoriConsep.setFillsViewportHeight(true);
		this.jTableDatosTipoAutoriConsep.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoAutoriConsep= new GridBagLayout();
		this.jPanelAccionesTipoAutoriConsep.setLayout(gridaBagLayoutAccionesTipoAutoriConsep);
		
		
		/*	
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
			
		this.jPanelAccionesTipoAutoriConsep.add(this.jButtonNuevoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoAutoriConsep= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoAutoriConsep.setLayout(gridaBagLayoutBusquedaPorCodigoTipoAutoriConsep);

		gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAutoriConsep.gridy = 0;
		gridBagConstraintsTipoAutoriConsep.gridx = 0;
		jPanelBusquedaPorCodigoTipoAutoriConsep.add(jLabelcodigoBusquedaPorCodigoTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);

		gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAutoriConsep.gridy = 0;
		gridBagConstraintsTipoAutoriConsep.gridx = 1;
		jPanelBusquedaPorCodigoTipoAutoriConsep.add(jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);

		gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAutoriConsep.gridy = 1;
		gridBagConstraintsTipoAutoriConsep.gridx =1;
		jPanelBusquedaPorCodigoTipoAutoriConsep.add(jButtonBusquedaPorCodigoTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);

		jTabbedPaneBusquedasTipoAutoriConsep.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoAutoriConsep);
		jTabbedPaneBusquedasTipoAutoriConsep.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoAutoriConsep= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoAutoriConsep.setLayout(gridaBagLayoutBusquedaPorNombreTipoAutoriConsep);

		gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAutoriConsep.gridy = 0;
		gridBagConstraintsTipoAutoriConsep.gridx = 0;
		jPanelBusquedaPorNombreTipoAutoriConsep.add(jLabelnombreBusquedaPorNombreTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);

		gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAutoriConsep.gridy = 0;
		gridBagConstraintsTipoAutoriConsep.gridx = 1;
		jPanelBusquedaPorNombreTipoAutoriConsep.add(jTextFieldnombreBusquedaPorNombreTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);

		gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAutoriConsep.gridy = 1;
		gridBagConstraintsTipoAutoriConsep.gridx =1;
		jPanelBusquedaPorNombreTipoAutoriConsep.add(jButtonBusquedaPorNombreTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);

		jTabbedPaneBusquedasTipoAutoriConsep.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoAutoriConsep);
		jTabbedPaneBusquedasTipoAutoriConsep.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAutoriConsep);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsTipoAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAutoriConsep.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;		
		//this.gridBagConstraintsTipoAutoriConsep.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoAutoriConsep.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoAutoriConsep);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;		
			this.gridBagConstraintsTipoAutoriConsep.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoAutoriConsep.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);								
		
		
		/*
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		*/		
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAutoriConsep.gridx =0;
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
				
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAutoriConsep = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoAutoriConsep.setLayout(gridaBagLayoutBusquedasParametrosTipoAutoriConsep);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
			
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
			
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoAutoriConsep;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoAutoriConsep() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoAutoriConsep.setName("jPanelReporteDinamicoTipoAutoriConsep"); 
		
		this.jPanelReporteDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoAutoriConsep.setLayout(gridaBagLayoutReporteDinamicoTipoAutoriConsep);
		
		
		this.jInternalFrameReporteDinamicoTipoAutoriConsep= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoAutoriConsep.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoAutoriConsep.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoAutoriConsep.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoAutoriConsep.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Autorizacion Consepes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoAutoriConsep = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoAutoriConsep.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jLabelColumnasSelectReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoAutoriConsep = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoAutoriConsep=new JScrollPane(this.jListColumnasSelectReporteTipoAutoriConsep);
			
			this.jScrollColumnasSelectReporteTipoAutoriConsep.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAutoriConsep.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAutoriConsep.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jListColumnasSelectReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jScrollColumnasSelectReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoAutoriConsep = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoAutoriConsep.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jLabelRelacionesSelectReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoAutoriConsep = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoAutoriConsep=new JScrollPane(this.jListRelacionesSelectReporteTipoAutoriConsep);
			
			this.jScrollRelacionesSelectReporteTipoAutoriConsep.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAutoriConsep.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAutoriConsep.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jListRelacionesSelectReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jScrollRelacionesSelectReporteTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoAutoriConsep = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoAutoriConsep = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoAutoriConsep = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoAutoriConsep = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoAutoriConsep.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jLabelGenerarExcelReporteDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep.setToolTipText("Generar EXCEL"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jComboBoxTiposReportesDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoAutoriConsep = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoAutoriConsep.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jLabelTiposArchivoReporteDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jComboBoxTiposArchivosReportesDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoAutoriConsep = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoAutoriConsep.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoAutoriConsep,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoAutoriConsep.setToolTipText("Generar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jButtonGenerarReporteDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoAutoriConsep = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoAutoriConsep.setToolTipText("Cancelar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAutoriConsep.add(this.jButtonCerrarReporteDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoAutoriConsep= new JScrollPane(jPanelReporteDinamicoTipoAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Autorizacion Consepes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoAutoriConsep.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoAutoriConsep.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoAutoriConsep);
		this.jInternalFrameReporteDinamicoTipoAutoriConsep.getContentPane().add(this.jScrollPanelReporteDinamicoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoAutoriConsep() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoAutoriConsep.setName("jPanelImportacionTipoAutoriConsep"); 
		
		this.jPanelImportacionTipoAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoAutoriConsep.setLayout(gridaBagLayoutImportacionTipoAutoriConsep);
		
		
		this.jInternalFrameImportacionTipoAutoriConsep= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoAutoriConsep= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionTipoAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionTipoAutoriConsep.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAutoriConsep.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionTipoAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionTipoAutoriConsep.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Autorizacion Consepes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoAutoriConsep = new JLabelMe();

		this.jLabelArchivoImportacionTipoAutoriConsep.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAutoriConsep.add(this.jLabelArchivoImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoAutoriConsep = new JFileChooser();		
		this.jFileChooserImportacionTipoAutoriConsep.setToolTipText("ESCOGER ARCHIVO"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoAutoriConsep = new JButtonMe();
		this.jButtonAbrirImportacionTipoAutoriConsep.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoAutoriConsep,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoAutoriConsep.setToolTipText("Generar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoriConsep.add(this.jButtonAbrirImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoAutoriConsep = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoAutoriConsep.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAutoriConsep.add(this.jLabelPathArchivoImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoAutoriConsep=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoAutoriConsep.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAutoriConsep.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAutoriConsep.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoriConsep.add(this.jTextFieldPathArchivoImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoAutoriConsep = new JButtonMe();
		this.jButtonGenerarImportacionTipoAutoriConsep.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoAutoriConsep,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoAutoriConsep.setToolTipText("Generar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoriConsep.add(this.jButtonGenerarImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoAutoriConsep = new JButtonMe();
		this.jButtonCerrarImportacionTipoAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoAutoriConsep.setToolTipText("Cancelar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAutoriConsep.add(this.jButtonCerrarImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoAutoriConsep= new JScrollPane(jPanelImportacionTipoAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoAutoriConsep.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoAutoriConsep.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoAutoriConsep);
		this.jInternalFrameImportacionTipoAutoriConsep.getContentPane().add(this.jScrollPanelImportacionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoAutoriConsep(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoAutoriConsep = new JButtonMe();
			this.jButtonAbrirOrderByTipoAutoriConsep.setText("Orden");
			this.jButtonAbrirOrderByTipoAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAutoriConsep,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoAutoriConsep";
			inputMap = this.jButtonAbrirOrderByTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoAutoriConsep"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoAutoriConsep = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoAutoriConsep.setName("jPanelOrderByTipoAutoriConsep"); 
			
			this.jPanelOrderByTipoAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoAutoriConsep.setLayout(gridaBagLayoutOrderByTipoAutoriConsep);
			
			
			this.jTableDatosTipoAutoriConsepOrderBy = new JTableMe();        
			this.jTableDatosTipoAutoriConsepOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoAutoriConsepOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoAutoriConsepOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoAutoriConsepOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoAutoriConsepOrderBy.setViewportView(this.jTableDatosTipoAutoriConsepOrderBy);
			this.jTableDatosTipoAutoriConsepOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoAutoriConsepOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoAutoriConsep= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoAutoriConsep= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoAutoriConsep = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoAutoriConsep= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoAutoriConsep.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoAutoriConsep.setTitle("Orden");
			this.jInternalFrameOrderByTipoAutoriConsep.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoAutoriConsep.setResizable(true);
			this.jInternalFrameOrderByTipoAutoriConsep.setClosable(true);
			this.jInternalFrameOrderByTipoAutoriConsep.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Autorizacion Consepes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoAutoriConsep.ipady =150;
				
			this.jPanelOrderByTipoAutoriConsep.add(jScrollPanelDatosTipoAutoriConsepOrderBy, this.gridBagConstraintsTipoAutoriConsep);//this.jTableDatosTipoAutoriConsepTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoAutoriConsep = new JButtonMe();
			this.jButtonCerrarOrderByTipoAutoriConsep.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoAutoriConsep,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoAutoriConsep.setToolTipText("Cancelar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoAutoriConsep.add(this.jButtonCerrarOrderByTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoAutoriConsep = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoAutoriConsep= new JScrollPane(jPanelOrderByTipoAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoAutoriConsep.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoAutoriConsep);
			
			this.jInternalFrameOrderByTipoAutoriConsep.getContentPane().add(this.jScrollPanelOrderByTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
		
		} else {
			this.jButtonAbrirOrderByTipoAutoriConsep = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoautoriconsepSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoAutoriConsep.getRowHeight();//TipoAutoriConsepConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.isSelected()) {
					iHeightTable=TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAutoriConsep.isSelected()) {
					iHeightTable=TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoAutoriConsep.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAutoriConsep.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAutoriConsep.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoAutoriConsep!=null && this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoAutoriConsep.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoAutoriConsep.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoAutoriConsep.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoautoriconsepLogic.getTipoAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoautoriconseps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoAutoriConsep> TraerTipoAutoriConsepBeans(List<TipoAutoriConsep> tipoautoriconseps,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoAutoriConsep tipoautoriconsep:tipoautoriconseps) {
					
				if(!(TipoAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoautoriconsep.setsDetalleGeneralEntityReporte(TipoAutoriConsepConstantesFunciones.getTipoAutoriConsepDescripcion(tipoautoriconsep));
										
						
					
					

					if(tipoautoriconsep.getAutoriConseps()!=null && Funciones.existeClass(classes,AutoriConsep.class)) {
						try{tipoautoriconsep.setautoriconsepsDescripcionReporte(new JRBeanCollectionDataSource(AutoriConsepJInternalFrame.TraerAutoriConsepBeans(tipoautoriconsep.getAutoriConseps(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoautoriconsep.setsDetalleGeneralEntityReporte(tipoautoriconsep.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoautoriconsepbeans.add(tipoautoriconsepbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoautoriconseps;
    }
	//PARA REPORTES FIN
}
