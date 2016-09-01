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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoReteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoReteJInternalFrame extends TipoReteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRete;
	
	protected JMenuBar jmenuBarTipoRete;
	
	protected JMenu jmenuTipoRete;
	protected JMenu jmenuDatosTipoRete;
	protected JMenu jmenuArchivoTipoRete;
	protected JMenu jmenuAccionesTipoRete;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRete;	
	protected GridBagConstraints gridBagConstraintsTipoRete;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoReteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRete;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRete;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRete;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoReteSessionBean tiporeteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRete> tiporetes;		
	public List<TipoRete> tiporetesEliminados;	
	public List<TipoRete> tiporetesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRete;		
	protected JButton jButtonAbrirOrderByTipoRete;
	
	
	//protected JPanel jPanelOrderByTipoRete;
	//public JScrollPane jScrollPanelOrderByTipoRete;	
	//protected JButton jButtonCerrarOrderByTipoRete;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoReteLogic tiporeteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRete;
	public JScrollPane jScrollPanelDatosEdicionTipoRete;
	public JScrollPane jScrollPanelDatosGeneralTipoRete;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoReteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRete;
	//public JScrollPane jScrollPanelImportacionTipoRete;
	
	
	
	protected JPanel jPanelAccionesTipoRete;
	
    protected JPanel jPanelPaginacionTipoRete;
    protected JPanel jPanelParametrosReportesTipoRete;
	protected JPanel jPanelParametrosReportesAccionesTipoRete;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRete;
	protected JPanel jPanelParametrosAuxiliar2TipoRete;
	protected JPanel jPanelParametrosAuxiliar3TipoRete;
	protected JPanel jPanelParametrosAuxiliar4TipoRete;
	//protected JPanel jPanelParametrosAuxiliar5TipoRete;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRete;
	//protected JPanel jPanelImportacionTipoRete;
	
	
	public JTable jTableDatosTipoRete;
	
	
	
	//public JTable jTableDatosTipoReteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRete;
	protected JButton jButtonDuplicarTipoRete;
	protected JButton jButtonCopiarTipoRete;
	protected JButton jButtonVerFormTipoRete;
	protected JButton jButtonNuevoRelacionesTipoRete;
	protected JButton jButtonModificarTipoRete;
	
    protected JButton jButtonGuardarCambiosTablaTipoRete;
	protected JButton jButtonCerrarTipoRete;
	
	
	protected JButton jButtonRecargarInformacionTipoRete;
	protected JButton jButtonProcesarInformacionTipoRete;
	
	
	protected JButton jButtonAnterioresTipoRete;
	protected JButton jButtonSiguientesTipoRete;
	protected JButton jButtonNuevoGuardarCambiosTipoRete;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRete;
	//protected JButton jButtonCerrarReporteDinamicoTipoRete;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRete;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRete;
	//protected JButton jButtonGenerarImportacionTipoRete;
	//protected JButton jButtonCerrarImportacionTipoRete;
	//protected JFileChooser jFileChooserImportacionTipoRete;
	//protected File fileImportacionTipoRete;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRete;
	protected JButton jButtonDuplicarToolBarTipoRete;
	protected JButton jButtonNuevoRelacionesToolBarTipoRete;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRete;
	protected JButton jButtonCopiarToolBarTipoRete;
	protected JButton jButtonVerFormToolBarTipoRete;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRete;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRete;
	protected JButton jButtonCerrarToolBarTipoRete;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRete;
	protected JButton jButtonProcesarInformacionToolBarTipoRete;
	protected JButton jButtonAnterioresToolBarTipoRete;
	protected JButton jButtonSiguientesToolBarTipoRete;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRete;
	protected JButton jButtonAbrirOrderByToolBarTipoRete;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRete;
	protected JMenuItem jMenuItemDuplicarTipoRete;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRete;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRete;
	protected JMenuItem jMenuItemCopiarTipoRete;
	protected JMenuItem jMenuItemVerFormTipoRete;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRete;
	protected JMenuItem jMenuItemCerrarTipoRete;
	protected JMenuItem jMenuItemDetalleCerrarTipoRete;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRete;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRete;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRete;
	protected JMenuItem jMenuItemProcesarInformacionTipoRete;
	protected JMenuItem jMenuItemAnterioresTipoRete;
	protected JMenuItem jMenuItemSiguientesTipoRete;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRete;
	protected JMenuItem jMenuItemAbrirOrderByTipoRete;
	protected JMenuItem jMenuItemMostrarOcultarTipoRete;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRete;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRete;
	protected JCheckBox jCheckBoxSeleccionadosTipoRete;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRete;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRete;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRete;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRete;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRete;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRete;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRete;
	protected JTextField jTextFieldValorCampoGeneralTipoRete;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRete;
	//public JList<Reporte> jListColumnasSelectReporteTipoRete;
	//public JScrollPane jScrollColumnasSelectReporteTipoRete;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRete;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRete;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRete;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRete;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRete;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRete;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRete;
	
		
	//public JLabel jLabelArchivoImportacionTipoRete;	
	//public JLabel jLabelPathArchivoImportacionTipoRete;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRete;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRete;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRete;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRete;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRete;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRete;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRete;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRete;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRete;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRete;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRete;
	public JPanel jPanelBusquedaPorCodigoTipoRete;
	public JButton jButtonBusquedaPorCodigoTipoRete;
	public JPanel jPanelBusquedaPorNombreTipoRete;
	public JButton jButtonBusquedaPorNombreTipoRete;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoRete;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoRete;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoRete;
	public JButton jButtoncodigoBusquedaPorCodigoTipoReteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoRete;
	public JLabel jLabelnombreBusquedaPorNombreTipoRete;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoRete;
	public JButton jButtonnombreBusquedaPorNombreTipoReteBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoReteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRete)	{
		this.jButtonRecargarInformacionTipoRete = jButtonRecargarInformacionTipoRete;
	}
	
	public JButton getjButtonProcesarInformacionTipoRete() {
		return this.jButtonProcesarInformacionTipoRete;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRete)	{
		this.jButtonProcesarInformacionTipoRete = jButtonProcesarInformacionTipoRete;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRete() {
		return this.jButtonRecargarInformacionTipoRete;
	}
	
	
	public List<TipoRete> gettiporetes() {
		return this.tiporetes;
	}

	public void settiporetes(List<TipoRete> tiporetes) {
		this.tiporetes = tiporetes;
	}
	
	public List<TipoRete> gettiporetesAux() {
		return this.tiporetesAux;
	}

	public void settiporetesAux(List<TipoRete> tiporetesAux) {
		this.tiporetesAux = tiporetesAux;
	}
	
	public List<TipoRete> gettiporetesEliminados() {
		return this.tiporetesEliminados;
	}

	public void setTipoRetesEliminados(List<TipoRete> tiporetesEliminados) {
		this.tiporetesEliminados = tiporetesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRete() {
		return jComboBoxTiposSeleccionarTipoRete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRete(
			JComboBox jComboBoxTiposSeleccionarTipoRete) {
		this.jComboBoxTiposSeleccionarTipoRete = jComboBoxTiposSeleccionarTipoRete;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRete .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRete() {
		return jTextFieldValorCampoGeneralTipoRete;
	}

	public void setjTextFieldValorCampoGeneralTipoRete(
			JTextField jTextFieldValorCampoGeneralTipoRete) {
		this.jTextFieldValorCampoGeneralTipoRete = jTextFieldValorCampoGeneralTipoRete;
	}

	public void setBorderResaltarValorCampoGeneralTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRete .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRete() {
		return this.jCheckBoxSeleccionarTodosTipoRete;
	}

	public void setjCheckBoxSeleccionarTodosTipoRete(
			JCheckBox jCheckBoxSeleccionarTodosTipoRete) {
		this.jCheckBoxSeleccionarTodosTipoRete = jCheckBoxSeleccionarTodosTipoRete;
	}

	public void setBorderResaltarSeleccionarTodosTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRete .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRete() {
		return this.jCheckBoxSeleccionadosTipoRete;
	}

	public void setjCheckBoxSeleccionadosTipoRete(
			JCheckBox jCheckBoxSeleccionadosTipoRete) {
		this.jCheckBoxSeleccionadosTipoRete = jCheckBoxSeleccionadosTipoRete;
	}
	
	public void setBorderResaltarSeleccionadosTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRete .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRete() {
		return this.jComboBoxTiposArchivosReportesTipoRete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRete(
			JComboBox jComboBoxTiposArchivosReportesTipoRete) {
		this.jComboBoxTiposArchivosReportesTipoRete = jComboBoxTiposArchivosReportesTipoRete;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRete() {
		return this.jComboBoxTiposReportesTipoRete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRete(
			JComboBox jComboBoxTiposReportesTipoRete) {
		this.jComboBoxTiposReportesTipoRete = jComboBoxTiposReportesTipoRete;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRete() {
	//	return jComboBoxTiposReportesDinamicoTipoRete;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRete(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRete) {
	//	this.jComboBoxTiposReportesDinamicoTipoRete = jComboBoxTiposReportesDinamicoTipoRete;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRete() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRete;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRete(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRete) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRete = jComboBoxTiposArchivosReportesDinamicoTipoRete;
	//}
	
	public void setBorderResaltarTiposReportesTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRete() {
		return this.jComboBoxTiposGraficosReportesTipoRete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRete(
			JComboBox jComboBoxTiposGraficosReportesTipoRete) {
		this.jComboBoxTiposGraficosReportesTipoRete = jComboBoxTiposGraficosReportesTipoRete;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRete() {
		return this.jComboBoxTiposPaginacionTipoRete;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRete(
			JComboBox jComboBoxTiposPaginacionTipoRete) {
		this.jComboBoxTiposPaginacionTipoRete = jComboBoxTiposPaginacionTipoRete;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRete .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRete() {
		return this.jComboBoxTiposRelacionesTipoRete;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRete() {
		return this.jComboBoxTiposAccionesTipoRete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRete(
			JComboBox jComboBoxTiposRelacionesTipoRete) {
		this.jComboBoxTiposRelacionesTipoRete = jComboBoxTiposRelacionesTipoRete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRete(
			JComboBox jComboBoxTiposAccionesTipoRete) {
		this.jComboBoxTiposAccionesTipoRete = jComboBoxTiposAccionesTipoRete;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRete .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRete() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRete.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRete .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRete() {
	//	return jCheckBoxConGraficoDinamicoTipoRete;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRete(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRete) {
	//	this.jCheckBoxConGraficoDinamicoTipoRete = jCheckBoxConGraficoDinamicoTipoRete;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRete() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRete.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRete .setBorder(borderResaltar);		
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
		this.tiporeteSessionBean=new TipoReteSessionBean();
		
		this.tiporeteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporeteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporeteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoReteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoReteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoReteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoReteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoReteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rete(temporal) MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoReteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRete= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRete,this.jTtoolBarTipoRete,
							"nuevo","nuevo","Nuevo"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRete,this.jTtoolBarTipoRete,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRete,this.jTtoolBarTipoRete,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRete,this.jTtoolBarTipoRete,
							"duplicar","duplicar","Duplicar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRete,this.jTtoolBarTipoRete,
							"copiar","copiar","Copiar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRete,this.jTtoolBarTipoRete,
							"ver_form","ver_form","Ver"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRete,this.jTtoolBarTipoRete,
							"recargar","recargar","Recargar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRete,this.jTtoolBarTipoRete,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRete,this.jTtoolBarTipoRete,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRete,this.jTtoolBarTipoRete,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRete,this.jTtoolBarTipoRete,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRete,this.jTtoolBarTipoRete,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRete,this.jTtoolBarTipoRete,
							"cerrar","cerrar","Salir"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRete=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRete;
			
				this.jButtonProcesarInformacionToolBarTipoRete=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRete;
				
		//protected JButton jButtonModificarToolBarTipoRete;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRete=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRete=new JMenuMe("General");
		this.jmenuArchivoTipoRete=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRete=new JMenuMe("Acciones");
		this.jmenuDatosTipoRete=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRete= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRete.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRete,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRete= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRete.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRete,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRete= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRete.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRete,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRete= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRete.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRete,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRete= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRete.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRete,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRete= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRete.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRete,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRete= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRete.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRete,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRete= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRete.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRete,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRete= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRete.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRete,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRete= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRete.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRete,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRete= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRete.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRete,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRete= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRete.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRete,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRete= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRete.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRete,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRete,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRete= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRete.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRete,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRete,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRete= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRete.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRete,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRete.add(this.jMenuItemCerrarTipoRete);
			
			this.jmenuAccionesTipoRete.add(this.jMenuItemNuevoTipoRete);
			this.jmenuAccionesTipoRete.add(this.jMenuItemNuevoGuardarCambiosTipoRete);
			this.jmenuAccionesTipoRete.add(this.jMenuItemNuevoRelacionesTipoRete);
			this.jmenuAccionesTipoRete.add(this.jMenuItemGuardarCambiosTablaTipoRete);		
			this.jmenuAccionesTipoRete.add(this.jMenuItemDuplicarTipoRete);		
			this.jmenuAccionesTipoRete.add(this.jMenuItemCopiarTipoRete);		
			this.jmenuAccionesTipoRete.add(this.jMenuItemVerFormTipoRete);		
			
			this.jmenuDatosTipoRete.add(this.jMenuItemRecargarInformacionTipoRete);				
			this.jmenuDatosTipoRete.add(this.jMenuItemAnterioresTipoRete);				
			this.jmenuDatosTipoRete.add(this.jMenuItemSiguientesTipoRete);				
			this.jmenuDatosTipoRete.add(this.jMenuItemAbrirOrderByTipoRete);				
			this.jmenuDatosTipoRete.add(this.jMenuItemMostrarOcultarTipoRete);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRete.add(this.jMenuItemGuardarCambiosTipoRete);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRete.add(this.jmenuArchivoTipoRete);		
			this.jmenuBarTipoRete.add(this.jmenuAccionesTipoRete);		
			this.jmenuBarTipoRete.add(this.jmenuDatosTipoRete);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRete);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRete() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoRete=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoRete.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoRete= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoRete.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoRete.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoRete,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoRete = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoRete.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoRete.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoRete,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoRete= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoRete,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoRete=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoRete.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoRete= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoRete.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoRete.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoRete,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoRete = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoRete.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoRete.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoRete,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoRete= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoRete,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoRete=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRete.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRete.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRete.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRete.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRete,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRete = new TipoReteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Rete(temporal) DATOS");
			this.jInternalFrameDetalleFormTipoRete = new TipoReteDetalleFormJInternalFrame(jDesktopPane,this.tiporeteSessionBean.getConGuardarRelaciones(),this.tiporeteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRete = null;//new TipoReteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRete= new GridBagLayout();
		
		
		this.jTableDatosTipoRete = new JTableMe();      
		
		String sToolTipTipoRete="";
		sToolTipTipoRete=TipoReteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRete+="(Cartera.TipoRete)";
		}
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRete+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRete.setToolTipText(sToolTipTipoRete);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRete);
		this.jTableDatosTipoRete.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRete.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRete.setRowSelectionAllowed(true);
		this.jTableDatosTipoRete.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRete,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRete = new JButtonMe();
		this.jButtonDuplicarTipoRete = new JButtonMe();
		this.jButtonCopiarTipoRete = new JButtonMe();
		this.jButtonVerFormTipoRete = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRete = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRete = new JButtonMe();
		this.jButtonCerrarTipoRete = new JButtonMe();
		
		this.jScrollPanelDatosTipoRete = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRete = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rete(temporal)";
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rete(temporal)s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRete.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRete.setToolTipText("Acciones");
        this.jPanelAccionesTipoRete.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRete=new ReporteDinamicoJInternalFrame(TipoReteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRete();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRete=new ImportacionJInternalFrame(TipoReteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRete();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRete = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRete.setText("Orden");
		this.jButtonAbrirOrderByTipoRete.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRete,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRete,false,this);
			
			//this.cargarOrderByTipoRete(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRete,true,this);
			
			//this.cargarOrderByTipoRete(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRete.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRete.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRete.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRete.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRete.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRete.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRete.setText("Nuevo");
		this.jButtonDuplicarTipoRete.setText("Duplicar");
		this.jButtonCopiarTipoRete.setText("Copiar");
		this.jButtonVerFormTipoRete.setText("Ver");
		this.jButtonNuevoRelacionesTipoRete.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRete.setText("Guardar");
		this.jButtonCerrarTipoRete.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRete,"nuevo_button","Nuevo",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRete,"duplicar_button","Duplicar",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRete,"copiar_button","Copiar",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRete,"ver_form","Ver",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRete,"nuevorelaciones_button","Nuevo Rel",this.tiporeteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRete,"guardarcambiostabla_button","Guardar",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRete,"cerrar_button","Salir",this.tiporeteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRete.setToolTipText("Nuevo"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRete.setToolTipText("Duplicar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRete.setToolTipText("Copiar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRete.setToolTipText("Ver"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRete.setToolTipText("Nuevo Rel"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRete.setToolTipText("Guardar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRete.setToolTipText("Salir"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRete";
		inputMap = this.jButtonNuevoTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRete"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRete";
		inputMap = this.jButtonDuplicarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRete"));
		
		//COPIAR
		sMapKey = "CopiarTipoRete";
		inputMap = this.jButtonCopiarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRete"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRete";
		inputMap = this.jButtonVerFormTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRete"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRete";
		inputMap = this.jButtonNuevoRelacionesTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRete"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRete";
		inputMap = this.jButtonModificarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRete"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRete";
		inputMap = this.jButtonCerrarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRete"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRete";
		inputMap = this.jButtonGuardarCambiosTablaTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRete"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRete.setName("jPanelParametrosReportesTipoRete"); 
		
		this.jPanelParametrosReportesAccionesTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRete.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRete.setName("jPanelParametrosReportesAccionesTipoRete"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRete = new JButtonMe();
		this.jButtonRecargarInformacionTipoRete.setText("Recargar");
		this.jButtonRecargarInformacionTipoRete.setToolTipText("Recargar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRete,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRete = new JButtonMe();
		this.jButtonProcesarInformacionTipoRete.setText("Procesar");
		this.jButtonProcesarInformacionTipoRete.setToolTipText("Procesar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRete.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRete.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRete.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRete.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRete.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRete.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRete.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRete.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRete.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRete.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRete.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRete.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRete.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRete.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRete.setText("Accion");
		this.jComboBoxTiposAccionesTipoRete.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRete.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRete.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRete=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRete.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRete.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRete.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRete = new JLabelMe();
		
		this.jLabelAccionesTipoRete.setText("Acciones");		
		this.jLabelAccionesTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRete = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRete.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRete.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRete = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRete.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRete.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRete = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRete.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRete.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRete = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRete.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRete.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRete = new JButtonMe();
		//this.jButtonAnterioresTipoRete.setText("<<");
        this.jButtonAnterioresTipoRete.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRete,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRete = new JButtonMe();
		//this.jButtonSiguientesTipoRete.setText(">>");
        this.jButtonSiguientesTipoRete.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRete,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRete = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRete.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRete.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRete,"nuevoguardarcambios_button","Nue",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRete";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRete"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRete";
		inputMap = this.jButtonRecargarInformacionTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRete"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRete";
		inputMap = this.jButtonSiguientesTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRete"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRete";
		inputMap = this.jButtonAnterioresTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRete"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRete();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRete.setMinimumSize(new Dimension(this.getWidth(),TipoReteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoReteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRete.setMaximumSize(new Dimension(this.getWidth(),TipoReteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoReteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRete.setPreferredSize(new Dimension(this.getWidth(),TipoReteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoReteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRete = new GridBagLayout();

			this.jPanelPaginacionTipoRete.setLayout(gridaBagLayoutPaginacionTipoRete);						
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 0;
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRete.add(this.jButtonAnterioresTipoRete, this.gridBagConstraintsTipoRete);
					
						
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRete.gridy = 0;
			
			this.jPanelPaginacionTipoRete.add(this.jButtonNuevoGuardarCambiosTipoRete, this.gridBagConstraintsTipoRete);
						
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRete.gridy = 0;
			this.jPanelPaginacionTipoRete.add(this.jButtonSiguientesTipoRete, this.gridBagConstraintsTipoRete);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 1;
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRete.add(this.jButtonNuevoTipoRete, this.gridBagConstraintsTipoRete);
						
			
			
			if(!this.tiporeteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRete = new GridBagConstraints();
				this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRete.gridy = 1;
				this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRete.add(this.jButtonGuardarCambiosTablaTipoRete, this.gridBagConstraintsTipoRete);
			}
			
			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 1;
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRete.add(this.jButtonDuplicarTipoRete, this.gridBagConstraintsTipoRete);
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 1;
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRete.add(this.jButtonCopiarTipoRete, this.gridBagConstraintsTipoRete);
		
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 1;
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRete.add(this.jButtonVerFormTipoRete, this.gridBagConstraintsTipoRete);
		
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 1;
			this.gridBagConstraintsTipoRete.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRete.add(this.jButtonCerrarTipoRete, this.gridBagConstraintsTipoRete);
		
		
		
		this.jButtonRecargarInformacionTipoRete.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRete.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRete.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRete.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRete.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRete.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRete.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRete.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRete.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRete.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRete.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRete.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRete.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRete.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRete.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRete.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRete.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRete.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRete.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRete.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRete.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRete.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRete.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRete.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRete.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRete.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRete.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRete = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRete = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRete = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRete = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRete = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRete = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRete.setLayout(gridaBagParametrosReportesTipoRete);
			this.jPanelParametrosReportesAccionesTipoRete.setLayout(gridaBagParametrosReportesAccionesTipoRete);
			
			
			this.jPanelParametrosAuxiliar1TipoRete.setLayout(gridaBagParametrosAuxiliar1TipoRete);
			this.jPanelParametrosAuxiliar2TipoRete.setLayout(gridaBagParametrosAuxiliar2TipoRete);
			this.jPanelParametrosAuxiliar3TipoRete.setLayout(gridaBagParametrosAuxiliar3TipoRete);
			this.jPanelParametrosAuxiliar4TipoRete.setLayout(gridaBagParametrosAuxiliar4TipoRete);
			//this.jPanelParametrosAuxiliar5TipoRete.setLayout(gridaBagParametrosAuxiliar2TipoRete);			
			
			
			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRete.add(this.jButtonRecargarInformacionTipoRete, this.gridBagConstraintsTipoRete);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRete.add(this.jComboBoxTiposPaginacionTipoRete, this.gridBagConstraintsTipoRete);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRete.add(this.jCheckBoxConAltoMaximoTablaTipoRete, this.gridBagConstraintsTipoRete);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRete.add(this.jComboBoxTiposArchivosReportesTipoRete, this.gridBagConstraintsTipoRete);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRete.add(this.jPanelParametrosAuxiliar1TipoRete, this.gridBagConstraintsTipoRete);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRete.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRete.add(this.jComboBoxTiposReportesTipoRete, this.gridBagConstraintsTipoRete);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRete.add(this.jPanelParametrosAuxiliar4TipoRete, this.gridBagConstraintsTipoRete);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRete.add(this.jComboBoxTiposReportesTipoRete, this.gridBagConstraintsTipoRete);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRete.add(this.jCheckBoxGenerarReporteTipoRete, this.gridBagConstraintsTipoRete);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRete.add(this.jPanelParametrosAuxiliar2TipoRete, this.gridBagConstraintsTipoRete);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRete.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRete.add(this.jLabelAccionesTipoRete, this.gridBagConstraintsTipoRete);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRete = new GridBagConstraints();
				this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRete.add(this.jButtonAbrirOrderByTipoRete, this.gridBagConstraintsTipoRete);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRete.add(this.jComboBoxTiposSeleccionarTipoRete, this.gridBagConstraintsTipoRete);			
			
			
			/*
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRete.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRete.add(this.jCheckBoxSeleccionarTodosTipoRete, this.gridBagConstraintsTipoRete);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRete.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRete.add(this.jCheckBoxSeleccionarTodosTipoRete, this.gridBagConstraintsTipoRete);															
				
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRete.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRete.add(this.jCheckBoxSeleccionadosTipoRete, this.gridBagConstraintsTipoRete);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRete.add(this.jPanelParametrosAuxiliar3TipoRete, this.gridBagConstraintsTipoRete);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRete.add(this.jComboBoxTiposAccionesTipoRete, this.gridBagConstraintsTipoRete);
	
				
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRete.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRete.add(this.jTextFieldValorCampoGeneralTipoRete, this.gridBagConstraintsTipoRete);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRete = new GridBagLayout();

			this.jScrollPanelDatosTipoRete.setLayout(gridaBagLayoutDatosTipoRete);
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = 0;
			this.gridBagConstraintsTipoRete.gridx = 0;
			
			this.jScrollPanelDatosTipoRete.add(this.jTableDatosTipoRete, this.gridBagConstraintsTipoRete);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRete.setViewportView(this.jTableDatosTipoRete);
		this.jTableDatosTipoRete.setFillsViewportHeight(true);
		this.jTableDatosTipoRete.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRete= new GridBagLayout();
		this.jPanelAccionesTipoRete.setLayout(gridaBagLayoutAccionesTipoRete);
		
		
		/*	
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx = 0;
			
		this.jPanelAccionesTipoRete.add(this.jButtonNuevoTipoRete, this.gridBagConstraintsTipoRete);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoRete= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoRete.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRete.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRete.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoRete.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoRete.setLayout(gridaBagLayoutBusquedaPorCodigoTipoRete);

		gridBagConstraintsTipoRete = new GridBagConstraints();
		gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRete.gridy = 0;
		gridBagConstraintsTipoRete.gridx = 0;
		jPanelBusquedaPorCodigoTipoRete.add(jLabelcodigoBusquedaPorCodigoTipoRete, gridBagConstraintsTipoRete);

		gridBagConstraintsTipoRete = new GridBagConstraints();
		gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRete.gridy = 0;
		gridBagConstraintsTipoRete.gridx = 1;
		jPanelBusquedaPorCodigoTipoRete.add(jTextFieldcodigoBusquedaPorCodigoTipoRete, gridBagConstraintsTipoRete);

		gridBagConstraintsTipoRete = new GridBagConstraints();
		gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRete.gridy = 1;
		gridBagConstraintsTipoRete.gridx =1;
		jPanelBusquedaPorCodigoTipoRete.add(jButtonBusquedaPorCodigoTipoRete, gridBagConstraintsTipoRete);

		jTabbedPaneBusquedasTipoRete.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoRete);
		jTabbedPaneBusquedasTipoRete.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoRete= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoRete.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRete.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRete.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoRete.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoRete.setLayout(gridaBagLayoutBusquedaPorNombreTipoRete);

		gridBagConstraintsTipoRete = new GridBagConstraints();
		gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRete.gridy = 0;
		gridBagConstraintsTipoRete.gridx = 0;
		jPanelBusquedaPorNombreTipoRete.add(jLabelnombreBusquedaPorNombreTipoRete, gridBagConstraintsTipoRete);

		gridBagConstraintsTipoRete = new GridBagConstraints();
		gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRete.gridy = 0;
		gridBagConstraintsTipoRete.gridx = 1;
		jPanelBusquedaPorNombreTipoRete.add(jTextAreanombreBusquedaPorNombreTipoRete, gridBagConstraintsTipoRete);

		gridBagConstraintsTipoRete = new GridBagConstraints();
		gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRete.gridy = 1;
		gridBagConstraintsTipoRete.gridx =1;
		jPanelBusquedaPorNombreTipoRete.add(jButtonBusquedaPorNombreTipoRete, gridBagConstraintsTipoRete);

		jTabbedPaneBusquedasTipoRete.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoRete);
		jTabbedPaneBusquedasTipoRete.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRete = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRete);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRete = new GridBagConstraints();						
			this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRete.gridx = 0;		
			//this.gridBagConstraintsTipoRete.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRete.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRete, this.gridBagConstraintsTipoRete);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRete.gridx = 0;		
		//this.gridBagConstraintsTipoRete.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRete.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRete);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRete.gridx = 0;		
			this.gridBagConstraintsTipoRete.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoRete.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoRete, this.gridBagConstraintsTipoRete);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRete, this.gridBagConstraintsTipoRete);								
		
		
		/*
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRete, this.gridBagConstraintsTipoRete);
		*/		
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRete.gridx =0;
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRete.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRete, this.gridBagConstraintsTipoRete);
				
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRete, this.gridBagConstraintsTipoRete);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoReteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRete= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRete = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRete.setLayout(gridaBagLayoutBusquedasParametrosTipoRete);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRete=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRete, this.gridBagConstraintsTipoRete);
			
			
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRete, this.gridBagConstraintsTipoRete);
		
			
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRete, this.gridBagConstraintsTipoRete);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRete;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRete() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRete = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRete.setName("jPanelReporteDinamicoTipoRete"); 
		
		this.jPanelReporteDinamicoTipoRete.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRete.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRete.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRete.setLayout(gridaBagLayoutReporteDinamicoTipoRete);
		
		
		this.jInternalFrameReporteDinamicoTipoRete= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRete = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRete= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRete.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRete.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRete.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRete.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRete.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRete.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRete.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRete.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRete.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rete(temporal)s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRete = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRete.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRete.add(this.jLabelColumnasSelectReporteTipoRete, this.gridBagConstraintsTipoRete);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRete = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRete.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRete.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRete.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRete.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRete.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRete=new JScrollPane(this.jListColumnasSelectReporteTipoRete);
			
			this.jScrollColumnasSelectReporteTipoRete.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRete.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRete.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRete.add(this.jListColumnasSelectReporteTipoRete, this.gridBagConstraintsTipoRete);
		this.jPanelReporteDinamicoTipoRete.add(this.jScrollColumnasSelectReporteTipoRete, this.gridBagConstraintsTipoRete);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRete = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRete.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRete = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRete.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRete.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRete.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRete.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRete.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRete=new JScrollPane(this.jListRelacionesSelectReporteTipoRete);
			
			this.jScrollRelacionesSelectReporteTipoRete.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRete.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRete.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoRete = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRete = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRete = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRete = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRete.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRete.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRete.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRete.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRete = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRete.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRete.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRete.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRete.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRete = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRete.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRete.add(this.jLabelGenerarExcelReporteDinamicoTipoRete, this.gridBagConstraintsTipoRete);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRete = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRete.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRete,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRete.setToolTipText("Generar EXCEL"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRete = new GridBagConstraints();
		//this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRete.add(this.jButtonGenerarExcelReporteDinamicoTipoRete, this.gridBagConstraintsTipoRete);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRete.add(this.jComboBoxTiposReportesDinamicoTipoRete, this.gridBagConstraintsTipoRete);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRete = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRete.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRete.add(this.jLabelTiposArchivoReporteDinamicoTipoRete, this.gridBagConstraintsTipoRete);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRete.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRete, this.gridBagConstraintsTipoRete);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRete = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRete.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRete,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRete.setToolTipText("Generar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRete.add(this.jButtonGenerarReporteDinamicoTipoRete, this.gridBagConstraintsTipoRete);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRete = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRete.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRete,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRete.setToolTipText("Cancelar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRete.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRete.add(this.jButtonCerrarReporteDinamicoTipoRete, this.gridBagConstraintsTipoRete);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRete = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRete= new JScrollPane(jPanelReporteDinamicoTipoRete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRete.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRete.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRete.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rete(temporal)s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRete.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRete.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRete.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRete);
		this.jInternalFrameReporteDinamicoTipoRete.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRete, this.gridBagConstraintsTipoRete);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRete() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRete = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRete.setName("jPanelImportacionTipoRete"); 
		
		this.jPanelImportacionTipoRete.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRete.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRete.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRete.setLayout(gridaBagLayoutImportacionTipoRete);
		
		
		this.jInternalFrameImportacionTipoRete= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRete= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRete = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRete= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRete.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRete.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRete.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRete.setResizable(true);
	    this.jInternalFrameImportacionTipoRete.setClosable(true);
	    this.jInternalFrameImportacionTipoRete.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRete.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRete.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRete.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRete.setResizable(true);
	    this.jInternalFrameImportacionTipoRete.setClosable(true);
	    this.jInternalFrameImportacionTipoRete.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRete.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRete.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRete.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rete(temporal)s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRete = new JLabelMe();

		this.jLabelArchivoImportacionTipoRete.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRete.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRete.add(this.jLabelArchivoImportacionTipoRete, this.gridBagConstraintsTipoRete);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRete = new JFileChooser();		
		this.jFileChooserImportacionTipoRete.setToolTipText("ESCOGER ARCHIVO"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRete = new JButtonMe();
		this.jButtonAbrirImportacionTipoRete.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRete,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRete.setToolTipText("Generar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRete.add(this.jButtonAbrirImportacionTipoRete, this.gridBagConstraintsTipoRete);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRete = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRete.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRete.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRete.add(this.jLabelPathArchivoImportacionTipoRete, this.gridBagConstraintsTipoRete);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRete=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRete.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRete.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRete.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRete.add(this.jTextFieldPathArchivoImportacionTipoRete, this.gridBagConstraintsTipoRete);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRete = new JButtonMe();
		this.jButtonGenerarImportacionTipoRete.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRete,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRete.setToolTipText("Generar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRete.add(this.jButtonGenerarImportacionTipoRete, this.gridBagConstraintsTipoRete);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRete = new JButtonMe();
		this.jButtonCerrarImportacionTipoRete.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRete,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRete.setToolTipText("Cancelar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRete.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRete.add(this.jButtonCerrarImportacionTipoRete, this.gridBagConstraintsTipoRete);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRete = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRete= new JScrollPane(jPanelImportacionTipoRete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRete.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRete.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRete.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRete);
		this.jInternalFrameImportacionTipoRete.getContentPane().add(this.jScrollPanelImportacionTipoRete, this.gridBagConstraintsTipoRete);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRete(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRete = new JButtonMe();
			this.jButtonAbrirOrderByTipoRete.setText("Orden");
			this.jButtonAbrirOrderByTipoRete.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRete,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRete";
			inputMap = this.jButtonAbrirOrderByTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRete"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRete = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRete.setName("jPanelOrderByTipoRete"); 
			
			this.jPanelOrderByTipoRete.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRete.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRete.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRete.setLayout(gridaBagLayoutOrderByTipoRete);
			
			
			this.jTableDatosTipoReteOrderBy = new JTableMe();        
			this.jTableDatosTipoReteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoReteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoReteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoReteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoReteOrderBy.setViewportView(this.jTableDatosTipoReteOrderBy);
			this.jTableDatosTipoReteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoReteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRete= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRete= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRete = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRete= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRete.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRete.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRete.setTitle("Orden");
			this.jInternalFrameOrderByTipoRete.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRete.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRete.setResizable(true);
			this.jInternalFrameOrderByTipoRete.setClosable(true);
			this.jInternalFrameOrderByTipoRete.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRete.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRete.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRete.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rete(temporal)s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRete.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRete.ipady =150;
				
			this.jPanelOrderByTipoRete.add(jScrollPanelDatosTipoReteOrderBy, this.gridBagConstraintsTipoRete);//this.jTableDatosTipoReteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRete = new JButtonMe();
			this.jButtonCerrarOrderByTipoRete.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRete,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRete.setToolTipText("Cancelar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRete.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRete.add(this.jButtonCerrarOrderByTipoRete, this.gridBagConstraintsTipoRete);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRete = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRete= new JScrollPane(jPanelOrderByTipoRete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRete.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRete.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRete.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRete);
			
			this.jInternalFrameOrderByTipoRete.getContentPane().add(this.jScrollPanelOrderByTipoRete, this.gridBagConstraintsTipoRete);			
		
		} else {
			this.jButtonAbrirOrderByTipoRete = new JButtonMe();
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
			&& this.tiporeteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRete.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRete.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRete.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRete.getRowHeight();//TipoReteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoReteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRete.isSelected()) {
					iHeightTable=TipoReteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoReteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoReteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoReteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRete.isSelected()) {
					iHeightTable=TipoReteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoReteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoReteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRete.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRete.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRete.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRete.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRete.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRete.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRete!=null && this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRete.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRete.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRete.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRete.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRete.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRete.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporeteLogic.getTipoRetes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRete> TraerTipoReteBeans(List<TipoRete> tiporetes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRete tiporete:tiporetes) {
					
				if(!(TipoReteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoReteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporete.setsDetalleGeneralEntityReporte(TipoReteConstantesFunciones.getTipoReteDescripcion(tiporete));
										
						
					
						
					
				} else  {
							
					//tiporete.setsDetalleGeneralEntityReporte(tiporete.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporetebeans.add(tiporetebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporetes;
    }
	//PARA REPORTES FIN
}
