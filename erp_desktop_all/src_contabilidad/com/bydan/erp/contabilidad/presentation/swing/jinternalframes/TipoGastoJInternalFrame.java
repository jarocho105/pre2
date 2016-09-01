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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoGastoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoGastoJInternalFrame extends TipoGastoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGasto;
	
	protected JMenuBar jmenuBarTipoGasto;
	
	protected JMenu jmenuTipoGasto;
	protected JMenu jmenuDatosTipoGasto;
	protected JMenu jmenuArchivoTipoGasto;
	protected JMenu jmenuAccionesTipoGasto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGasto;	
	protected GridBagConstraints gridBagConstraintsTipoGasto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGastoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGasto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGasto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGasto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGastoSessionBean tipogastoSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGasto> tipogastos;		
	public List<TipoGasto> tipogastosEliminados;	
	public List<TipoGasto> tipogastosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGasto;		
	protected JButton jButtonAbrirOrderByTipoGasto;
	
	
	//protected JPanel jPanelOrderByTipoGasto;
	//public JScrollPane jScrollPanelOrderByTipoGasto;	
	//protected JButton jButtonCerrarOrderByTipoGasto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGastoLogic tipogastoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGasto;
	public JScrollPane jScrollPanelDatosEdicionTipoGasto;
	public JScrollPane jScrollPanelDatosGeneralTipoGasto;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGastoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGasto;
	//public JScrollPane jScrollPanelImportacionTipoGasto;
	
	
	
	protected JPanel jPanelAccionesTipoGasto;
	
    protected JPanel jPanelPaginacionTipoGasto;
    protected JPanel jPanelParametrosReportesTipoGasto;
	protected JPanel jPanelParametrosReportesAccionesTipoGasto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGasto;
	protected JPanel jPanelParametrosAuxiliar2TipoGasto;
	protected JPanel jPanelParametrosAuxiliar3TipoGasto;
	protected JPanel jPanelParametrosAuxiliar4TipoGasto;
	//protected JPanel jPanelParametrosAuxiliar5TipoGasto;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGasto;
	//protected JPanel jPanelImportacionTipoGasto;
	
	
	public JTable jTableDatosTipoGasto;
	
	
	
	//public JTable jTableDatosTipoGastoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGasto;
	protected JButton jButtonDuplicarTipoGasto;
	protected JButton jButtonCopiarTipoGasto;
	protected JButton jButtonVerFormTipoGasto;
	protected JButton jButtonNuevoRelacionesTipoGasto;
	protected JButton jButtonModificarTipoGasto;
	
    protected JButton jButtonGuardarCambiosTablaTipoGasto;
	protected JButton jButtonCerrarTipoGasto;
	
	
	protected JButton jButtonRecargarInformacionTipoGasto;
	protected JButton jButtonProcesarInformacionTipoGasto;
	
	
	protected JButton jButtonAnterioresTipoGasto;
	protected JButton jButtonSiguientesTipoGasto;
	protected JButton jButtonNuevoGuardarCambiosTipoGasto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGasto;
	//protected JButton jButtonCerrarReporteDinamicoTipoGasto;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGasto;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGasto;
	//protected JButton jButtonGenerarImportacionTipoGasto;
	//protected JButton jButtonCerrarImportacionTipoGasto;
	//protected JFileChooser jFileChooserImportacionTipoGasto;
	//protected File fileImportacionTipoGasto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGasto;
	protected JButton jButtonDuplicarToolBarTipoGasto;
	protected JButton jButtonNuevoRelacionesToolBarTipoGasto;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGasto;
	protected JButton jButtonCopiarToolBarTipoGasto;
	protected JButton jButtonVerFormToolBarTipoGasto;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGasto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGasto;
	protected JButton jButtonCerrarToolBarTipoGasto;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGasto;
	protected JButton jButtonProcesarInformacionToolBarTipoGasto;
	protected JButton jButtonAnterioresToolBarTipoGasto;
	protected JButton jButtonSiguientesToolBarTipoGasto;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGasto;
	protected JButton jButtonAbrirOrderByToolBarTipoGasto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGasto;
	protected JMenuItem jMenuItemDuplicarTipoGasto;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGasto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGasto;
	protected JMenuItem jMenuItemCopiarTipoGasto;
	protected JMenuItem jMenuItemVerFormTipoGasto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGasto;
	protected JMenuItem jMenuItemCerrarTipoGasto;
	protected JMenuItem jMenuItemDetalleCerrarTipoGasto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGasto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGasto;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGasto;
	protected JMenuItem jMenuItemProcesarInformacionTipoGasto;
	protected JMenuItem jMenuItemAnterioresTipoGasto;
	protected JMenuItem jMenuItemSiguientesTipoGasto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGasto;
	protected JMenuItem jMenuItemAbrirOrderByTipoGasto;
	protected JMenuItem jMenuItemMostrarOcultarTipoGasto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGasto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGasto;
	protected JCheckBox jCheckBoxSeleccionadosTipoGasto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGasto;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGasto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGasto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGasto;
	protected JTextField jTextFieldValorCampoGeneralTipoGasto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGasto;
	//public JList<Reporte> jListColumnasSelectReporteTipoGasto;
	//public JScrollPane jScrollColumnasSelectReporteTipoGasto;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGasto;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGasto;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGasto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGasto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGasto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGasto;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGasto;
	
		
	//public JLabel jLabelArchivoImportacionTipoGasto;	
	//public JLabel jLabelPathArchivoImportacionTipoGasto;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGasto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGasto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGasto;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGasto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGasto;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGasto;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGasto;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGasto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGasto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGasto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGasto;
	public JPanel jPanelBusquedaPorIdTipoGasto;
	public JButton jButtonBusquedaPorIdTipoGasto;
	public JPanel jPanelBusquedaPorNombreTipoGasto;
	public JButton jButtonBusquedaPorNombreTipoGasto;
	public JPanel jPanelFK_IdPaisTipoGasto;
	public JButton jButtonFK_IdPaisTipoGasto;
	
	public JPanel jPanelIdIdBusquedaPorIdTipoGasto;
	public JLabel jLabelidBusquedaPorIdTipoGasto;
	public JTextFieldMe jLabelidTipoGastoBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoGasto;
	public JLabel jLabelnombreBusquedaPorNombreTipoGasto;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoGasto;
	public JButton jButtonnombreBusquedaPorNombreTipoGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoGasto;
	public JLabel jLabelid_paisFK_IdPaisTipoGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoGasto;
	public JButton jButtonid_paisFK_IdPaisTipoGasto= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGastoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGastoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoGastoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGasto)	{
		this.jButtonRecargarInformacionTipoGasto = jButtonRecargarInformacionTipoGasto;
	}
	
	public JButton getjButtonProcesarInformacionTipoGasto() {
		return this.jButtonProcesarInformacionTipoGasto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGasto)	{
		this.jButtonProcesarInformacionTipoGasto = jButtonProcesarInformacionTipoGasto;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGasto() {
		return this.jButtonRecargarInformacionTipoGasto;
	}
	
	
	public List<TipoGasto> gettipogastos() {
		return this.tipogastos;
	}

	public void settipogastos(List<TipoGasto> tipogastos) {
		this.tipogastos = tipogastos;
	}
	
	public List<TipoGasto> gettipogastosAux() {
		return this.tipogastosAux;
	}

	public void settipogastosAux(List<TipoGasto> tipogastosAux) {
		this.tipogastosAux = tipogastosAux;
	}
	
	public List<TipoGasto> gettipogastosEliminados() {
		return this.tipogastosEliminados;
	}

	public void setTipoGastosEliminados(List<TipoGasto> tipogastosEliminados) {
		this.tipogastosEliminados = tipogastosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGasto() {
		return jComboBoxTiposSeleccionarTipoGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGasto(
			JComboBox jComboBoxTiposSeleccionarTipoGasto) {
		this.jComboBoxTiposSeleccionarTipoGasto = jComboBoxTiposSeleccionarTipoGasto;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGasto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGasto() {
		return jTextFieldValorCampoGeneralTipoGasto;
	}

	public void setjTextFieldValorCampoGeneralTipoGasto(
			JTextField jTextFieldValorCampoGeneralTipoGasto) {
		this.jTextFieldValorCampoGeneralTipoGasto = jTextFieldValorCampoGeneralTipoGasto;
	}

	public void setBorderResaltarValorCampoGeneralTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGasto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGasto() {
		return this.jCheckBoxSeleccionarTodosTipoGasto;
	}

	public void setjCheckBoxSeleccionarTodosTipoGasto(
			JCheckBox jCheckBoxSeleccionarTodosTipoGasto) {
		this.jCheckBoxSeleccionarTodosTipoGasto = jCheckBoxSeleccionarTodosTipoGasto;
	}

	public void setBorderResaltarSeleccionarTodosTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGasto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGasto() {
		return this.jCheckBoxSeleccionadosTipoGasto;
	}

	public void setjCheckBoxSeleccionadosTipoGasto(
			JCheckBox jCheckBoxSeleccionadosTipoGasto) {
		this.jCheckBoxSeleccionadosTipoGasto = jCheckBoxSeleccionadosTipoGasto;
	}
	
	public void setBorderResaltarSeleccionadosTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGasto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGasto() {
		return this.jComboBoxTiposArchivosReportesTipoGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGasto(
			JComboBox jComboBoxTiposArchivosReportesTipoGasto) {
		this.jComboBoxTiposArchivosReportesTipoGasto = jComboBoxTiposArchivosReportesTipoGasto;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGasto() {
		return this.jComboBoxTiposReportesTipoGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGasto(
			JComboBox jComboBoxTiposReportesTipoGasto) {
		this.jComboBoxTiposReportesTipoGasto = jComboBoxTiposReportesTipoGasto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGasto() {
	//	return jComboBoxTiposReportesDinamicoTipoGasto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGasto(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGasto) {
	//	this.jComboBoxTiposReportesDinamicoTipoGasto = jComboBoxTiposReportesDinamicoTipoGasto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGasto() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGasto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGasto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGasto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGasto = jComboBoxTiposArchivosReportesDinamicoTipoGasto;
	//}
	
	public void setBorderResaltarTiposReportesTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGasto() {
		return this.jComboBoxTiposGraficosReportesTipoGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGasto(
			JComboBox jComboBoxTiposGraficosReportesTipoGasto) {
		this.jComboBoxTiposGraficosReportesTipoGasto = jComboBoxTiposGraficosReportesTipoGasto;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGasto() {
		return this.jComboBoxTiposPaginacionTipoGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGasto(
			JComboBox jComboBoxTiposPaginacionTipoGasto) {
		this.jComboBoxTiposPaginacionTipoGasto = jComboBoxTiposPaginacionTipoGasto;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGasto() {
		return this.jComboBoxTiposRelacionesTipoGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGasto() {
		return this.jComboBoxTiposAccionesTipoGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGasto(
			JComboBox jComboBoxTiposRelacionesTipoGasto) {
		this.jComboBoxTiposRelacionesTipoGasto = jComboBoxTiposRelacionesTipoGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGasto(
			JComboBox jComboBoxTiposAccionesTipoGasto) {
		this.jComboBoxTiposAccionesTipoGasto = jComboBoxTiposAccionesTipoGasto;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGasto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGasto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGasto() {
	//	return jCheckBoxConGraficoDinamicoTipoGasto;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGasto(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGasto) {
	//	this.jCheckBoxConGraficoDinamicoTipoGasto = jCheckBoxConGraficoDinamicoTipoGasto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGasto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGasto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGasto .setBorder(borderResaltar);		
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
		this.tipogastoSessionBean=new TipoGastoSessionBean();
		
		this.tipogastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGastoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGasto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"nuevo","nuevo","Nuevo"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"duplicar","duplicar","Duplicar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"copiar","copiar","Copiar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"ver_form","ver_form","Ver"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"recargar","recargar","Recargar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGasto,this.jTtoolBarTipoGasto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGasto,this.jTtoolBarTipoGasto,
							"cerrar","cerrar","Salir"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGasto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGasto;
			
				this.jButtonProcesarInformacionToolBarTipoGasto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGasto;
				
		//protected JButton jButtonModificarToolBarTipoGasto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGasto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGasto=new JMenuMe("General");
		this.jmenuArchivoTipoGasto=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGasto=new JMenuMe("Acciones");
		this.jmenuDatosTipoGasto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGasto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGasto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGasto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGasto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGasto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGasto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGasto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGasto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGasto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGasto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGasto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGasto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGasto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGasto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGasto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGasto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGasto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGasto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGasto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGasto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGasto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGasto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGasto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGasto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGasto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGasto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGasto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGasto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGasto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGasto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGasto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGasto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGasto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGasto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGasto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGasto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGasto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGasto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGasto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGasto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGasto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGasto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGasto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGasto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGasto.add(this.jMenuItemCerrarTipoGasto);
			
			this.jmenuAccionesTipoGasto.add(this.jMenuItemNuevoTipoGasto);
			this.jmenuAccionesTipoGasto.add(this.jMenuItemNuevoGuardarCambiosTipoGasto);
			this.jmenuAccionesTipoGasto.add(this.jMenuItemNuevoRelacionesTipoGasto);
			this.jmenuAccionesTipoGasto.add(this.jMenuItemGuardarCambiosTablaTipoGasto);		
			this.jmenuAccionesTipoGasto.add(this.jMenuItemDuplicarTipoGasto);		
			this.jmenuAccionesTipoGasto.add(this.jMenuItemCopiarTipoGasto);		
			this.jmenuAccionesTipoGasto.add(this.jMenuItemVerFormTipoGasto);		
			
			this.jmenuDatosTipoGasto.add(this.jMenuItemRecargarInformacionTipoGasto);				
			this.jmenuDatosTipoGasto.add(this.jMenuItemAnterioresTipoGasto);				
			this.jmenuDatosTipoGasto.add(this.jMenuItemSiguientesTipoGasto);				
			this.jmenuDatosTipoGasto.add(this.jMenuItemAbrirOrderByTipoGasto);				
			this.jmenuDatosTipoGasto.add(this.jMenuItemMostrarOcultarTipoGasto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGasto.add(this.jMenuItemGuardarCambiosTipoGasto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGasto.add(this.jmenuArchivoTipoGasto);		
			this.jmenuBarTipoGasto.add(this.jmenuAccionesTipoGasto);		
			this.jmenuBarTipoGasto.add(this.jmenuDatosTipoGasto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGasto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGasto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdTipoGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoGasto.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoGasto= new JButtonMe();
		this.jButtonBusquedaPorIdTipoGasto.setText("Buscar");
		this.jButtonBusquedaPorIdTipoGasto.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoGasto,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoGasto = new JLabelMe();
		jLabelidBusquedaPorIdTipoGasto.setText("Id :");
		jLabelidBusquedaPorIdTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTipoGastoBusquedaPorId= new JTextFieldMe();
		jLabelidTipoGastoBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGastoBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGastoBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoGasto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoGasto= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoGasto.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoGasto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoGasto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoGasto = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoGasto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoGasto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoGasto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoGasto.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoGasto= new JButtonMe();
		this.jButtonFK_IdPaisTipoGasto.setText("Buscar");
		this.jButtonFK_IdPaisTipoGasto.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoGasto,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoGasto = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoGasto.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoGasto.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoGasto= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGasto=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGasto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGasto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGasto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGasto = new TipoGastoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Gasto  DATOS");
			this.jInternalFrameDetalleFormTipoGasto = new TipoGastoDetalleFormJInternalFrame(jDesktopPane,this.tipogastoSessionBean.getConGuardarRelaciones(),this.tipogastoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGasto = null;//new TipoGastoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGasto= new GridBagLayout();
		
		
		this.jTableDatosTipoGasto = new JTableMe();      
		
		String sToolTipTipoGasto="";
		sToolTipTipoGasto=TipoGastoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGasto+="(Contabilidad.TipoGasto)";
		}
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGasto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGasto.setToolTipText(sToolTipTipoGasto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGasto);
		this.jTableDatosTipoGasto.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGasto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGasto.setRowSelectionAllowed(true);
		this.jTableDatosTipoGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGasto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGasto = new JButtonMe();
		this.jButtonDuplicarTipoGasto = new JButtonMe();
		this.jButtonCopiarTipoGasto = new JButtonMe();
		this.jButtonVerFormTipoGasto = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGasto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGasto = new JButtonMe();
		this.jButtonCerrarTipoGasto = new JButtonMe();
		
		this.jScrollPanelDatosTipoGasto = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGasto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto ";
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGasto.setToolTipText("Acciones");
        this.jPanelAccionesTipoGasto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGasto=new ReporteDinamicoJInternalFrame(TipoGastoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGasto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGasto=new ImportacionJInternalFrame(TipoGastoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGasto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGasto = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGasto.setText("Orden");
		this.jButtonAbrirOrderByTipoGasto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGasto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGasto,false,this);
			
			//this.cargarOrderByTipoGasto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGasto,true,this);
			
			//this.cargarOrderByTipoGasto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGasto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGasto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGasto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGasto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGasto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGasto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGasto.setText("Nuevo");
		this.jButtonDuplicarTipoGasto.setText("Duplicar");
		this.jButtonCopiarTipoGasto.setText("Copiar");
		this.jButtonVerFormTipoGasto.setText("Ver");
		this.jButtonNuevoRelacionesTipoGasto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGasto.setText("Guardar");
		this.jButtonCerrarTipoGasto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGasto,"nuevo_button","Nuevo",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGasto,"duplicar_button","Duplicar",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGasto,"copiar_button","Copiar",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGasto,"ver_form","Ver",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGasto,"nuevorelaciones_button","Nuevo Rel",this.tipogastoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGasto,"guardarcambiostabla_button","Guardar",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGasto,"cerrar_button","Salir",this.tipogastoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGasto.setToolTipText("Nuevo"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGasto.setToolTipText("Duplicar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGasto.setToolTipText("Copiar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGasto.setToolTipText("Ver"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGasto.setToolTipText("Nuevo Rel"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGasto.setToolTipText("Guardar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGasto.setToolTipText("Salir"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGasto";
		inputMap = this.jButtonNuevoTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGasto"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGasto";
		inputMap = this.jButtonDuplicarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGasto"));
		
		//COPIAR
		sMapKey = "CopiarTipoGasto";
		inputMap = this.jButtonCopiarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGasto"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGasto";
		inputMap = this.jButtonVerFormTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGasto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGasto";
		inputMap = this.jButtonNuevoRelacionesTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGasto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGasto";
		inputMap = this.jButtonModificarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGasto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGasto";
		inputMap = this.jButtonCerrarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGasto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGasto";
		inputMap = this.jButtonGuardarCambiosTablaTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGasto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGasto.setName("jPanelParametrosReportesTipoGasto"); 
		
		this.jPanelParametrosReportesAccionesTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGasto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGasto.setName("jPanelParametrosReportesAccionesTipoGasto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGasto = new JButtonMe();
		this.jButtonRecargarInformacionTipoGasto.setText("Recargar");
		this.jButtonRecargarInformacionTipoGasto.setToolTipText("Recargar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGasto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGasto = new JButtonMe();
		this.jButtonProcesarInformacionTipoGasto.setText("Procesar");
		this.jButtonProcesarInformacionTipoGasto.setToolTipText("Procesar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGasto.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGasto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGasto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGasto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGasto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGasto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGasto.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGasto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGasto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGasto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGasto.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGasto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGasto.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGasto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGasto.setText("Accion");
		this.jComboBoxTiposAccionesTipoGasto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGasto.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGasto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGasto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGasto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGasto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGasto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGasto = new JLabelMe();
		
		this.jLabelAccionesTipoGasto.setText("Acciones");		
		this.jLabelAccionesTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGasto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGasto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGasto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGasto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGasto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGasto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGasto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGasto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGasto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGasto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGasto.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGasto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGasto = new JButtonMe();
		//this.jButtonAnterioresTipoGasto.setText("<<");
        this.jButtonAnterioresTipoGasto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGasto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGasto = new JButtonMe();
		//this.jButtonSiguientesTipoGasto.setText(">>");
        this.jButtonSiguientesTipoGasto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGasto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGasto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGasto.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGasto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGasto,"nuevoguardarcambios_button","Nue",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGasto";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGasto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGasto";
		inputMap = this.jButtonRecargarInformacionTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGasto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGasto";
		inputMap = this.jButtonSiguientesTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGasto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGasto";
		inputMap = this.jButtonAnterioresTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGasto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGasto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGasto.setMinimumSize(new Dimension(this.getWidth(),TipoGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGasto.setMaximumSize(new Dimension(this.getWidth(),TipoGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGasto.setPreferredSize(new Dimension(this.getWidth(),TipoGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGastoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGasto = new GridBagLayout();

			this.jPanelPaginacionTipoGasto.setLayout(gridaBagLayoutPaginacionTipoGasto);						
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 0;
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGasto.add(this.jButtonAnterioresTipoGasto, this.gridBagConstraintsTipoGasto);
					
						
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGasto.gridy = 0;
			
			this.jPanelPaginacionTipoGasto.add(this.jButtonNuevoGuardarCambiosTipoGasto, this.gridBagConstraintsTipoGasto);
						
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGasto.gridy = 0;
			this.jPanelPaginacionTipoGasto.add(this.jButtonSiguientesTipoGasto, this.gridBagConstraintsTipoGasto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 1;
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGasto.add(this.jButtonNuevoTipoGasto, this.gridBagConstraintsTipoGasto);
						
			
			
			if(!this.tipogastoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGasto = new GridBagConstraints();
				this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGasto.gridy = 1;
				this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGasto.add(this.jButtonGuardarCambiosTablaTipoGasto, this.gridBagConstraintsTipoGasto);
			}
			
			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 1;
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGasto.add(this.jButtonDuplicarTipoGasto, this.gridBagConstraintsTipoGasto);
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 1;
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGasto.add(this.jButtonCopiarTipoGasto, this.gridBagConstraintsTipoGasto);
		
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 1;
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGasto.add(this.jButtonVerFormTipoGasto, this.gridBagConstraintsTipoGasto);
		
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 1;
			this.gridBagConstraintsTipoGasto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGasto.add(this.jButtonCerrarTipoGasto, this.gridBagConstraintsTipoGasto);
		
		
		
		this.jButtonRecargarInformacionTipoGasto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGasto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGasto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGasto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGasto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGasto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGasto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGasto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGasto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGasto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGasto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGasto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGasto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGasto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGasto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGasto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGasto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGasto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGasto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGasto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGasto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGasto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGasto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGasto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGasto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGasto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGasto.setLayout(gridaBagParametrosReportesTipoGasto);
			this.jPanelParametrosReportesAccionesTipoGasto.setLayout(gridaBagParametrosReportesAccionesTipoGasto);
			
			
			this.jPanelParametrosAuxiliar1TipoGasto.setLayout(gridaBagParametrosAuxiliar1TipoGasto);
			this.jPanelParametrosAuxiliar2TipoGasto.setLayout(gridaBagParametrosAuxiliar2TipoGasto);
			this.jPanelParametrosAuxiliar3TipoGasto.setLayout(gridaBagParametrosAuxiliar3TipoGasto);
			this.jPanelParametrosAuxiliar4TipoGasto.setLayout(gridaBagParametrosAuxiliar4TipoGasto);
			//this.jPanelParametrosAuxiliar5TipoGasto.setLayout(gridaBagParametrosAuxiliar2TipoGasto);			
			
			
			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGasto.add(this.jButtonRecargarInformacionTipoGasto, this.gridBagConstraintsTipoGasto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGasto.add(this.jComboBoxTiposPaginacionTipoGasto, this.gridBagConstraintsTipoGasto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGasto.add(this.jCheckBoxConAltoMaximoTablaTipoGasto, this.gridBagConstraintsTipoGasto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGasto.add(this.jComboBoxTiposArchivosReportesTipoGasto, this.gridBagConstraintsTipoGasto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGasto.add(this.jPanelParametrosAuxiliar1TipoGasto, this.gridBagConstraintsTipoGasto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGasto.add(this.jComboBoxTiposReportesTipoGasto, this.gridBagConstraintsTipoGasto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGasto.add(this.jPanelParametrosAuxiliar4TipoGasto, this.gridBagConstraintsTipoGasto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGasto.add(this.jComboBoxTiposReportesTipoGasto, this.gridBagConstraintsTipoGasto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGasto.add(this.jCheckBoxGenerarReporteTipoGasto, this.gridBagConstraintsTipoGasto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGasto.add(this.jPanelParametrosAuxiliar2TipoGasto, this.gridBagConstraintsTipoGasto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGasto.add(this.jLabelAccionesTipoGasto, this.gridBagConstraintsTipoGasto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGasto = new GridBagConstraints();
				this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGasto.add(this.jButtonAbrirOrderByTipoGasto, this.gridBagConstraintsTipoGasto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGasto.add(this.jComboBoxTiposSeleccionarTipoGasto, this.gridBagConstraintsTipoGasto);			
			
			
			/*
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGasto.add(this.jCheckBoxSeleccionarTodosTipoGasto, this.gridBagConstraintsTipoGasto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGasto.add(this.jCheckBoxSeleccionarTodosTipoGasto, this.gridBagConstraintsTipoGasto);															
				
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGasto.add(this.jCheckBoxSeleccionadosTipoGasto, this.gridBagConstraintsTipoGasto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGasto.add(this.jPanelParametrosAuxiliar3TipoGasto, this.gridBagConstraintsTipoGasto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGasto.add(this.jComboBoxTiposAccionesTipoGasto, this.gridBagConstraintsTipoGasto);
	
				
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGasto.add(this.jTextFieldValorCampoGeneralTipoGasto, this.gridBagConstraintsTipoGasto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGasto = new GridBagLayout();

			this.jScrollPanelDatosTipoGasto.setLayout(gridaBagLayoutDatosTipoGasto);
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = 0;
			this.gridBagConstraintsTipoGasto.gridx = 0;
			
			this.jScrollPanelDatosTipoGasto.add(this.jTableDatosTipoGasto, this.gridBagConstraintsTipoGasto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGasto.setViewportView(this.jTableDatosTipoGasto);
		this.jTableDatosTipoGasto.setFillsViewportHeight(true);
		this.jTableDatosTipoGasto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGasto= new GridBagLayout();
		this.jPanelAccionesTipoGasto.setLayout(gridaBagLayoutAccionesTipoGasto);
		
		
		/*	
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = 0;
		this.gridBagConstraintsTipoGasto.gridx = 0;
			
		this.jPanelAccionesTipoGasto.add(this.jButtonNuevoTipoGasto, this.gridBagConstraintsTipoGasto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdTipoGasto= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoGasto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoGasto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoGasto.setLayout(gridaBagLayoutBusquedaPorIdTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 0;
		gridBagConstraintsTipoGasto.gridx = 0;
		jPanelBusquedaPorIdTipoGasto.add(jLabelidBusquedaPorIdTipoGasto, gridBagConstraintsTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 0;
		gridBagConstraintsTipoGasto.gridx = 1;
		jPanelBusquedaPorIdTipoGasto.add(jLabelidTipoGastoBusquedaPorId, gridBagConstraintsTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 1;
		gridBagConstraintsTipoGasto.gridx =1;
		jPanelBusquedaPorIdTipoGasto.add(jButtonBusquedaPorIdTipoGasto, gridBagConstraintsTipoGasto);

		jTabbedPaneBusquedasTipoGasto.addTab("1.-Por Id ", jPanelBusquedaPorIdTipoGasto);
		jTabbedPaneBusquedasTipoGasto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoGasto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoGasto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGasto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoGasto.setLayout(gridaBagLayoutBusquedaPorNombreTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 0;
		gridBagConstraintsTipoGasto.gridx = 0;
		jPanelBusquedaPorNombreTipoGasto.add(jLabelnombreBusquedaPorNombreTipoGasto, gridBagConstraintsTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 0;
		gridBagConstraintsTipoGasto.gridx = 1;
		jPanelBusquedaPorNombreTipoGasto.add(jTextAreanombreBusquedaPorNombreTipoGasto, gridBagConstraintsTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 1;
		gridBagConstraintsTipoGasto.gridx =1;
		jPanelBusquedaPorNombreTipoGasto.add(jButtonBusquedaPorNombreTipoGasto, gridBagConstraintsTipoGasto);

		jTabbedPaneBusquedasTipoGasto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoGasto);
		jTabbedPaneBusquedasTipoGasto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoGasto= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoGasto.setLayout(gridaBagLayoutFK_IdPaisTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 0;
		gridBagConstraintsTipoGasto.gridx = 0;
		jPanelFK_IdPaisTipoGasto.add(jLabelid_paisFK_IdPaisTipoGasto, gridBagConstraintsTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 0;
		gridBagConstraintsTipoGasto.gridx = 1;
		jPanelFK_IdPaisTipoGasto.add(jComboBoxid_paisFK_IdPaisTipoGasto, gridBagConstraintsTipoGasto);

		gridBagConstraintsTipoGasto = new GridBagConstraints();
		gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGasto.gridy = 1;
		gridBagConstraintsTipoGasto.gridx =1;
		jPanelFK_IdPaisTipoGasto.add(jButtonFK_IdPaisTipoGasto, gridBagConstraintsTipoGasto);

		jTabbedPaneBusquedasTipoGasto.addTab("3.-Por Pais ", jPanelFK_IdPaisTipoGasto);
		jTabbedPaneBusquedasTipoGasto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGasto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGasto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();						
			this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGasto.gridx = 0;		
			//this.gridBagConstraintsTipoGasto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGasto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGasto, this.gridBagConstraintsTipoGasto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGasto.gridx = 0;		
		//this.gridBagConstraintsTipoGasto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGasto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGasto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGasto.gridx = 0;		
			this.gridBagConstraintsTipoGasto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGasto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGasto, this.gridBagConstraintsTipoGasto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGasto, this.gridBagConstraintsTipoGasto);								
		
		
		/*
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGasto, this.gridBagConstraintsTipoGasto);
		*/		
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGasto.gridx =0;
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGasto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGasto, this.gridBagConstraintsTipoGasto);
				
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGasto, this.gridBagConstraintsTipoGasto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGasto = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGasto.setLayout(gridaBagLayoutBusquedasParametrosTipoGasto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGasto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGasto, this.gridBagConstraintsTipoGasto);
			
			
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGasto, this.gridBagConstraintsTipoGasto);
		
			
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGasto, this.gridBagConstraintsTipoGasto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGasto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGasto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGasto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGasto.setName("jPanelReporteDinamicoTipoGasto"); 
		
		this.jPanelReporteDinamicoTipoGasto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGasto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGasto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGasto.setLayout(gridaBagLayoutReporteDinamicoTipoGasto);
		
		
		this.jInternalFrameReporteDinamicoTipoGasto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGasto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGasto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGasto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGasto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGasto.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGasto.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGasto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGasto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGasto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGasto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGasto = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGasto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGasto.add(this.jLabelColumnasSelectReporteTipoGasto, this.gridBagConstraintsTipoGasto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGasto = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGasto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGasto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGasto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGasto=new JScrollPane(this.jListColumnasSelectReporteTipoGasto);
			
			this.jScrollColumnasSelectReporteTipoGasto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGasto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGasto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGasto.add(this.jListColumnasSelectReporteTipoGasto, this.gridBagConstraintsTipoGasto);
		this.jPanelReporteDinamicoTipoGasto.add(this.jScrollColumnasSelectReporteTipoGasto, this.gridBagConstraintsTipoGasto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGasto = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGasto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGasto = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGasto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGasto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGasto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGasto=new JScrollPane(this.jListRelacionesSelectReporteTipoGasto);
			
			this.jScrollRelacionesSelectReporteTipoGasto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGasto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGasto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGasto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGasto = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGasto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGasto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGasto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGasto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGasto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGasto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGasto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGasto.add(this.jLabelGenerarExcelReporteDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGasto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGasto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGasto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGasto.setToolTipText("Generar EXCEL"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		//this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGasto.add(this.jButtonGenerarExcelReporteDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGasto.add(this.jComboBoxTiposReportesDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGasto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGasto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGasto.add(this.jLabelTiposArchivoReporteDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGasto.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGasto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGasto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGasto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGasto.setToolTipText("Generar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGasto.add(this.jButtonGenerarReporteDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGasto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGasto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGasto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGasto.setToolTipText("Cancelar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGasto.add(this.jButtonCerrarReporteDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGasto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGasto= new JScrollPane(jPanelReporteDinamicoTipoGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGasto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGasto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGasto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGasto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGasto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGasto);
		this.jInternalFrameReporteDinamicoTipoGasto.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGasto, this.gridBagConstraintsTipoGasto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGasto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGasto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGasto.setName("jPanelImportacionTipoGasto"); 
		
		this.jPanelImportacionTipoGasto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGasto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGasto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGasto.setLayout(gridaBagLayoutImportacionTipoGasto);
		
		
		this.jInternalFrameImportacionTipoGasto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGasto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGasto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGasto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGasto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGasto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGasto.setResizable(true);
	    this.jInternalFrameImportacionTipoGasto.setClosable(true);
	    this.jInternalFrameImportacionTipoGasto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGasto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGasto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGasto.setResizable(true);
	    this.jInternalFrameImportacionTipoGasto.setClosable(true);
	    this.jInternalFrameImportacionTipoGasto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGasto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGasto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGasto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGasto = new JLabelMe();

		this.jLabelArchivoImportacionTipoGasto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGasto.add(this.jLabelArchivoImportacionTipoGasto, this.gridBagConstraintsTipoGasto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGasto = new JFileChooser();		
		this.jFileChooserImportacionTipoGasto.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGasto = new JButtonMe();
		this.jButtonAbrirImportacionTipoGasto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGasto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGasto.setToolTipText("Generar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGasto.add(this.jButtonAbrirImportacionTipoGasto, this.gridBagConstraintsTipoGasto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGasto = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGasto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGasto.add(this.jLabelPathArchivoImportacionTipoGasto, this.gridBagConstraintsTipoGasto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGasto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGasto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGasto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGasto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGasto.add(this.jTextFieldPathArchivoImportacionTipoGasto, this.gridBagConstraintsTipoGasto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGasto = new JButtonMe();
		this.jButtonGenerarImportacionTipoGasto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGasto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGasto.setToolTipText("Generar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGasto.add(this.jButtonGenerarImportacionTipoGasto, this.gridBagConstraintsTipoGasto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGasto = new JButtonMe();
		this.jButtonCerrarImportacionTipoGasto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGasto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGasto.setToolTipText("Cancelar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGasto.add(this.jButtonCerrarImportacionTipoGasto, this.gridBagConstraintsTipoGasto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGasto = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGasto= new JScrollPane(jPanelImportacionTipoGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGasto.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGasto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGasto);
		this.jInternalFrameImportacionTipoGasto.getContentPane().add(this.jScrollPanelImportacionTipoGasto, this.gridBagConstraintsTipoGasto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGasto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGasto = new JButtonMe();
			this.jButtonAbrirOrderByTipoGasto.setText("Orden");
			this.jButtonAbrirOrderByTipoGasto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGasto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGasto";
			inputMap = this.jButtonAbrirOrderByTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGasto"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGasto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGasto.setName("jPanelOrderByTipoGasto"); 
			
			this.jPanelOrderByTipoGasto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGasto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGasto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGasto.setLayout(gridaBagLayoutOrderByTipoGasto);
			
			
			this.jTableDatosTipoGastoOrderBy = new JTableMe();        
			this.jTableDatosTipoGastoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGastoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGastoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGastoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGastoOrderBy.setViewportView(this.jTableDatosTipoGastoOrderBy);
			this.jTableDatosTipoGastoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGastoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGasto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGasto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGasto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGasto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGasto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGasto.setTitle("Orden");
			this.jInternalFrameOrderByTipoGasto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGasto.setResizable(true);
			this.jInternalFrameOrderByTipoGasto.setClosable(true);
			this.jInternalFrameOrderByTipoGasto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGasto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGasto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGasto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGasto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGasto.ipady =150;
				
			this.jPanelOrderByTipoGasto.add(jScrollPanelDatosTipoGastoOrderBy, this.gridBagConstraintsTipoGasto);//this.jTableDatosTipoGastoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGasto = new JButtonMe();
			this.jButtonCerrarOrderByTipoGasto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGasto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGasto.setToolTipText("Cancelar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGasto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGasto.add(this.jButtonCerrarOrderByTipoGasto, this.gridBagConstraintsTipoGasto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGasto = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGasto= new JScrollPane(jPanelOrderByTipoGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGasto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGasto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGasto);
			
			this.jInternalFrameOrderByTipoGasto.getContentPane().add(this.jScrollPanelOrderByTipoGasto, this.gridBagConstraintsTipoGasto);			
		
		} else {
			this.jButtonAbrirOrderByTipoGasto = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogastoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGasto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGasto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGasto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGasto.getRowHeight();//TipoGastoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGasto.isSelected()) {
					iHeightTable=TipoGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGasto.isSelected()) {
					iHeightTable=TipoGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGasto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGasto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGasto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGasto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGasto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGasto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGasto!=null && this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGasto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGasto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGasto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGasto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGasto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGasto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogastoLogic.getTipoGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGasto> TraerTipoGastoBeans(List<TipoGasto> tipogastos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGasto tipogasto:tipogastos) {
					
				if(!(TipoGastoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGastoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogasto.setsDetalleGeneralEntityReporte(TipoGastoConstantesFunciones.getTipoGastoDescripcion(tipogasto));
										
						
					
						
					
				} else  {
							
					//tipogasto.setsDetalleGeneralEntityReporte(tipogasto.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogastobeans.add(tipogastobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogastos;
    }
	//PARA REPORTES FIN
}
