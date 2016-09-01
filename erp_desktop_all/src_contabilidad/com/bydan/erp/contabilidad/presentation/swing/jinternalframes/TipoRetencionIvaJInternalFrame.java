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


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoRetencionIvaConstantesFunciones;

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
public class TipoRetencionIvaJInternalFrame extends TipoRetencionIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRetencionIva;
	
	protected JMenuBar jmenuBarTipoRetencionIva;
	
	protected JMenu jmenuTipoRetencionIva;
	protected JMenu jmenuDatosTipoRetencionIva;
	protected JMenu jmenuArchivoTipoRetencionIva;
	protected JMenu jmenuAccionesTipoRetencionIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRetencionIva;	
	protected GridBagConstraints gridBagConstraintsTipoRetencionIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRetencionIvaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRetencionIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRetencionIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRetencionIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRetencionIvaSessionBean tiporetencionivaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRetencionIva> tiporetencionivas;		
	public List<TipoRetencionIva> tiporetencionivasEliminados;	
	public List<TipoRetencionIva> tiporetencionivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRetencionIva;		
	protected JButton jButtonAbrirOrderByTipoRetencionIva;
	
	
	//protected JPanel jPanelOrderByTipoRetencionIva;
	//public JScrollPane jScrollPanelOrderByTipoRetencionIva;	
	//protected JButton jButtonCerrarOrderByTipoRetencionIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRetencionIvaLogic tiporetencionivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRetencionIva;
	public JScrollPane jScrollPanelDatosEdicionTipoRetencionIva;
	public JScrollPane jScrollPanelDatosGeneralTipoRetencionIva;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRetencionIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRetencionIva;
	//public JScrollPane jScrollPanelImportacionTipoRetencionIva;
	
	
	
	protected JPanel jPanelAccionesTipoRetencionIva;
	
    protected JPanel jPanelPaginacionTipoRetencionIva;
    protected JPanel jPanelParametrosReportesTipoRetencionIva;
	protected JPanel jPanelParametrosReportesAccionesTipoRetencionIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRetencionIva;
	protected JPanel jPanelParametrosAuxiliar2TipoRetencionIva;
	protected JPanel jPanelParametrosAuxiliar3TipoRetencionIva;
	protected JPanel jPanelParametrosAuxiliar4TipoRetencionIva;
	//protected JPanel jPanelParametrosAuxiliar5TipoRetencionIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRetencionIva;
	//protected JPanel jPanelImportacionTipoRetencionIva;
	
	
	public JTable jTableDatosTipoRetencionIva;
	
	
	
	//public JTable jTableDatosTipoRetencionIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRetencionIva;
	protected JButton jButtonDuplicarTipoRetencionIva;
	protected JButton jButtonCopiarTipoRetencionIva;
	protected JButton jButtonVerFormTipoRetencionIva;
	protected JButton jButtonNuevoRelacionesTipoRetencionIva;
	protected JButton jButtonModificarTipoRetencionIva;
	
    protected JButton jButtonGuardarCambiosTablaTipoRetencionIva;
	protected JButton jButtonCerrarTipoRetencionIva;
	
	
	protected JButton jButtonRecargarInformacionTipoRetencionIva;
	protected JButton jButtonProcesarInformacionTipoRetencionIva;
	
	
	protected JButton jButtonAnterioresTipoRetencionIva;
	protected JButton jButtonSiguientesTipoRetencionIva;
	protected JButton jButtonNuevoGuardarCambiosTipoRetencionIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRetencionIva;
	//protected JButton jButtonCerrarReporteDinamicoTipoRetencionIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRetencionIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRetencionIva;
	//protected JButton jButtonGenerarImportacionTipoRetencionIva;
	//protected JButton jButtonCerrarImportacionTipoRetencionIva;
	//protected JFileChooser jFileChooserImportacionTipoRetencionIva;
	//protected File fileImportacionTipoRetencionIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRetencionIva;
	protected JButton jButtonDuplicarToolBarTipoRetencionIva;
	protected JButton jButtonNuevoRelacionesToolBarTipoRetencionIva;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRetencionIva;
	protected JButton jButtonCopiarToolBarTipoRetencionIva;
	protected JButton jButtonVerFormToolBarTipoRetencionIva;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRetencionIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRetencionIva;
	protected JButton jButtonCerrarToolBarTipoRetencionIva;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRetencionIva;
	protected JButton jButtonProcesarInformacionToolBarTipoRetencionIva;
	protected JButton jButtonAnterioresToolBarTipoRetencionIva;
	protected JButton jButtonSiguientesToolBarTipoRetencionIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRetencionIva;
	protected JButton jButtonAbrirOrderByToolBarTipoRetencionIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRetencionIva;
	protected JMenuItem jMenuItemDuplicarTipoRetencionIva;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRetencionIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRetencionIva;
	protected JMenuItem jMenuItemCopiarTipoRetencionIva;
	protected JMenuItem jMenuItemVerFormTipoRetencionIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRetencionIva;
	protected JMenuItem jMenuItemCerrarTipoRetencionIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoRetencionIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRetencionIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRetencionIva;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRetencionIva;
	protected JMenuItem jMenuItemProcesarInformacionTipoRetencionIva;
	protected JMenuItem jMenuItemAnterioresTipoRetencionIva;
	protected JMenuItem jMenuItemSiguientesTipoRetencionIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRetencionIva;
	protected JMenuItem jMenuItemAbrirOrderByTipoRetencionIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoRetencionIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRetencionIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRetencionIva;
	protected JCheckBox jCheckBoxSeleccionadosTipoRetencionIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRetencionIva;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRetencionIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRetencionIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRetencionIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRetencionIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRetencionIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRetencionIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRetencionIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRetencionIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRetencionIva;
	protected JTextField jTextFieldValorCampoGeneralTipoRetencionIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRetencionIva;
	//public JList<Reporte> jListColumnasSelectReporteTipoRetencionIva;
	//public JScrollPane jScrollColumnasSelectReporteTipoRetencionIva;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRetencionIva;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRetencionIva;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRetencionIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRetencionIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRetencionIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRetencionIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRetencionIva;
	
		
	//public JLabel jLabelArchivoImportacionTipoRetencionIva;	
	//public JLabel jLabelPathArchivoImportacionTipoRetencionIva;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRetencionIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRetencionIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRetencionIva;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRetencionIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRetencionIva;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRetencionIva;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRetencionIva;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRetencionIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRetencionIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRetencionIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoRetencionIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRetencionIva)	{
		this.jButtonRecargarInformacionTipoRetencionIva = jButtonRecargarInformacionTipoRetencionIva;
	}
	
	public JButton getjButtonProcesarInformacionTipoRetencionIva() {
		return this.jButtonProcesarInformacionTipoRetencionIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRetencionIva)	{
		this.jButtonProcesarInformacionTipoRetencionIva = jButtonProcesarInformacionTipoRetencionIva;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRetencionIva() {
		return this.jButtonRecargarInformacionTipoRetencionIva;
	}
	
	
	public List<TipoRetencionIva> gettiporetencionivas() {
		return this.tiporetencionivas;
	}

	public void settiporetencionivas(List<TipoRetencionIva> tiporetencionivas) {
		this.tiporetencionivas = tiporetencionivas;
	}
	
	public List<TipoRetencionIva> gettiporetencionivasAux() {
		return this.tiporetencionivasAux;
	}

	public void settiporetencionivasAux(List<TipoRetencionIva> tiporetencionivasAux) {
		this.tiporetencionivasAux = tiporetencionivasAux;
	}
	
	public List<TipoRetencionIva> gettiporetencionivasEliminados() {
		return this.tiporetencionivasEliminados;
	}

	public void setTipoRetencionIvasEliminados(List<TipoRetencionIva> tiporetencionivasEliminados) {
		this.tiporetencionivasEliminados = tiporetencionivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRetencionIva() {
		return jComboBoxTiposSeleccionarTipoRetencionIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRetencionIva(
			JComboBox jComboBoxTiposSeleccionarTipoRetencionIva) {
		this.jComboBoxTiposSeleccionarTipoRetencionIva = jComboBoxTiposSeleccionarTipoRetencionIva;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRetencionIva() {
		return jTextFieldValorCampoGeneralTipoRetencionIva;
	}

	public void setjTextFieldValorCampoGeneralTipoRetencionIva(
			JTextField jTextFieldValorCampoGeneralTipoRetencionIva) {
		this.jTextFieldValorCampoGeneralTipoRetencionIva = jTextFieldValorCampoGeneralTipoRetencionIva;
	}

	public void setBorderResaltarValorCampoGeneralTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRetencionIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRetencionIva() {
		return this.jCheckBoxSeleccionarTodosTipoRetencionIva;
	}

	public void setjCheckBoxSeleccionarTodosTipoRetencionIva(
			JCheckBox jCheckBoxSeleccionarTodosTipoRetencionIva) {
		this.jCheckBoxSeleccionarTodosTipoRetencionIva = jCheckBoxSeleccionarTodosTipoRetencionIva;
	}

	public void setBorderResaltarSeleccionarTodosTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRetencionIva() {
		return this.jCheckBoxSeleccionadosTipoRetencionIva;
	}

	public void setjCheckBoxSeleccionadosTipoRetencionIva(
			JCheckBox jCheckBoxSeleccionadosTipoRetencionIva) {
		this.jCheckBoxSeleccionadosTipoRetencionIva = jCheckBoxSeleccionadosTipoRetencionIva;
	}
	
	public void setBorderResaltarSeleccionadosTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRetencionIva() {
		return this.jComboBoxTiposArchivosReportesTipoRetencionIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRetencionIva(
			JComboBox jComboBoxTiposArchivosReportesTipoRetencionIva) {
		this.jComboBoxTiposArchivosReportesTipoRetencionIva = jComboBoxTiposArchivosReportesTipoRetencionIva;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRetencionIva() {
		return this.jComboBoxTiposReportesTipoRetencionIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRetencionIva(
			JComboBox jComboBoxTiposReportesTipoRetencionIva) {
		this.jComboBoxTiposReportesTipoRetencionIva = jComboBoxTiposReportesTipoRetencionIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRetencionIva() {
	//	return jComboBoxTiposReportesDinamicoTipoRetencionIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRetencionIva(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRetencionIva) {
	//	this.jComboBoxTiposReportesDinamicoTipoRetencionIva = jComboBoxTiposReportesDinamicoTipoRetencionIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRetencionIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRetencionIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva = jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva;
	//}
	
	public void setBorderResaltarTiposReportesTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRetencionIva() {
		return this.jComboBoxTiposGraficosReportesTipoRetencionIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRetencionIva(
			JComboBox jComboBoxTiposGraficosReportesTipoRetencionIva) {
		this.jComboBoxTiposGraficosReportesTipoRetencionIva = jComboBoxTiposGraficosReportesTipoRetencionIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRetencionIva() {
		return this.jComboBoxTiposPaginacionTipoRetencionIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRetencionIva(
			JComboBox jComboBoxTiposPaginacionTipoRetencionIva) {
		this.jComboBoxTiposPaginacionTipoRetencionIva = jComboBoxTiposPaginacionTipoRetencionIva;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRetencionIva() {
		return this.jComboBoxTiposRelacionesTipoRetencionIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRetencionIva() {
		return this.jComboBoxTiposAccionesTipoRetencionIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRetencionIva(
			JComboBox jComboBoxTiposRelacionesTipoRetencionIva) {
		this.jComboBoxTiposRelacionesTipoRetencionIva = jComboBoxTiposRelacionesTipoRetencionIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRetencionIva(
			JComboBox jComboBoxTiposAccionesTipoRetencionIva) {
		this.jComboBoxTiposAccionesTipoRetencionIva = jComboBoxTiposAccionesTipoRetencionIva;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRetencionIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRetencionIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRetencionIva() {
	//	return jCheckBoxConGraficoDinamicoTipoRetencionIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRetencionIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRetencionIva) {
	//	this.jCheckBoxConGraficoDinamicoTipoRetencionIva = jCheckBoxConGraficoDinamicoTipoRetencionIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRetencionIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRetencionIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRetencionIva .setBorder(borderResaltar);		
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
		this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
		
		this.tiporetencionivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporetencionivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRetencionIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Retencion Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRetencionIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRetencionIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"nuevo","nuevo","Nuevo"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"duplicar","duplicar","Duplicar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"copiar","copiar","Copiar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"ver_form","ver_form","Ver"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"recargar","recargar","Recargar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRetencionIva,this.jTtoolBarTipoRetencionIva,
							"cerrar","cerrar","Salir"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRetencionIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRetencionIva;
			
				this.jButtonProcesarInformacionToolBarTipoRetencionIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRetencionIva;
				
		//protected JButton jButtonModificarToolBarTipoRetencionIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRetencionIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRetencionIva=new JMenuMe("General");
		this.jmenuArchivoTipoRetencionIva=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRetencionIva=new JMenuMe("Acciones");
		this.jmenuDatosTipoRetencionIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRetencionIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRetencionIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRetencionIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRetencionIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRetencionIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRetencionIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRetencionIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRetencionIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRetencionIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRetencionIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRetencionIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRetencionIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRetencionIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRetencionIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRetencionIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRetencionIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRetencionIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRetencionIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRetencionIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRetencionIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRetencionIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRetencionIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRetencionIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRetencionIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRetencionIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRetencionIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRetencionIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRetencionIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRetencionIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRetencionIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRetencionIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRetencionIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRetencionIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRetencionIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRetencionIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRetencionIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRetencionIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRetencionIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRetencionIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRetencionIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRetencionIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRetencionIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRetencionIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRetencionIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRetencionIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRetencionIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRetencionIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRetencionIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRetencionIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRetencionIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRetencionIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRetencionIva.add(this.jMenuItemCerrarTipoRetencionIva);
			
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemNuevoTipoRetencionIva);
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemNuevoGuardarCambiosTipoRetencionIva);
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemNuevoRelacionesTipoRetencionIva);
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemGuardarCambiosTablaTipoRetencionIva);		
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemDuplicarTipoRetencionIva);		
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemCopiarTipoRetencionIva);		
			this.jmenuAccionesTipoRetencionIva.add(this.jMenuItemVerFormTipoRetencionIva);		
			
			this.jmenuDatosTipoRetencionIva.add(this.jMenuItemRecargarInformacionTipoRetencionIva);				
			this.jmenuDatosTipoRetencionIva.add(this.jMenuItemAnterioresTipoRetencionIva);				
			this.jmenuDatosTipoRetencionIva.add(this.jMenuItemSiguientesTipoRetencionIva);				
			this.jmenuDatosTipoRetencionIva.add(this.jMenuItemAbrirOrderByTipoRetencionIva);				
			this.jmenuDatosTipoRetencionIva.add(this.jMenuItemMostrarOcultarTipoRetencionIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRetencionIva.add(this.jMenuItemGuardarCambiosTipoRetencionIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRetencionIva.add(this.jmenuArchivoTipoRetencionIva);		
			this.jmenuBarTipoRetencionIva.add(this.jmenuAccionesTipoRetencionIva);		
			this.jmenuBarTipoRetencionIva.add(this.jmenuDatosTipoRetencionIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRetencionIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRetencionIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoRetencionIva = new TipoRetencionIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Retencion Iva DATOS");
			this.jInternalFrameDetalleFormTipoRetencionIva = new TipoRetencionIvaDetalleFormJInternalFrame(jDesktopPane,this.tiporetencionivaSessionBean.getConGuardarRelaciones(),this.tiporetencionivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRetencionIva = null;//new TipoRetencionIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRetencionIva= new GridBagLayout();
		
		
		this.jTableDatosTipoRetencionIva = new JTableMe();      
		
		String sToolTipTipoRetencionIva="";
		sToolTipTipoRetencionIva=TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRetencionIva+="(Contabilidad.TipoRetencionIva)";
		}
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRetencionIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRetencionIva.setToolTipText(sToolTipTipoRetencionIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRetencionIva);
		this.jTableDatosTipoRetencionIva.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRetencionIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRetencionIva.setRowSelectionAllowed(true);
		this.jTableDatosTipoRetencionIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRetencionIva = new JButtonMe();
		this.jButtonDuplicarTipoRetencionIva = new JButtonMe();
		this.jButtonCopiarTipoRetencionIva = new JButtonMe();
		this.jButtonVerFormTipoRetencionIva = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRetencionIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva = new JButtonMe();
		this.jButtonCerrarTipoRetencionIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoRetencionIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRetencionIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Retencion Iva";
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRetencionIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRetencionIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoRetencionIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRetencionIva=new ReporteDinamicoJInternalFrame(TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRetencionIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRetencionIva=new ImportacionJInternalFrame(TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRetencionIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRetencionIva = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRetencionIva.setText("Orden");
		this.jButtonAbrirOrderByTipoRetencionIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRetencionIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRetencionIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionIva,false,this);
			
			//this.cargarOrderByTipoRetencionIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRetencionIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionIva,true,this);
			
			//this.cargarOrderByTipoRetencionIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRetencionIva.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRetencionIva.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoRetencionIva.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoRetencionIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRetencionIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRetencionIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRetencionIva.setText("Nuevo");
		this.jButtonDuplicarTipoRetencionIva.setText("Duplicar");
		this.jButtonCopiarTipoRetencionIva.setText("Copiar");
		this.jButtonVerFormTipoRetencionIva.setText("Ver");
		this.jButtonNuevoRelacionesTipoRetencionIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.setText("Guardar");
		this.jButtonCerrarTipoRetencionIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRetencionIva,"nuevo_button","Nuevo",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRetencionIva,"duplicar_button","Duplicar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRetencionIva,"copiar_button","Copiar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRetencionIva,"ver_form","Ver",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRetencionIva,"nuevorelaciones_button","Nuevo Rel",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRetencionIva,"guardarcambiostabla_button","Guardar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRetencionIva,"cerrar_button","Salir",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRetencionIva.setToolTipText("Nuevo"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRetencionIva.setToolTipText("Duplicar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRetencionIva.setToolTipText("Copiar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRetencionIva.setToolTipText("Ver"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRetencionIva.setToolTipText("Nuevo Rel"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.setToolTipText("Guardar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRetencionIva.setToolTipText("Salir"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRetencionIva";
		inputMap = this.jButtonNuevoTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRetencionIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRetencionIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRetencionIva";
		inputMap = this.jButtonDuplicarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRetencionIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRetencionIva"));
		
		//COPIAR
		sMapKey = "CopiarTipoRetencionIva";
		inputMap = this.jButtonCopiarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRetencionIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRetencionIva"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRetencionIva";
		inputMap = this.jButtonVerFormTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRetencionIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRetencionIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRetencionIva";
		inputMap = this.jButtonNuevoRelacionesTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRetencionIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRetencionIva";
		inputMap = this.jButtonModificarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRetencionIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRetencionIva";
		inputMap = this.jButtonCerrarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRetencionIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRetencionIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRetencionIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRetencionIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRetencionIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRetencionIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRetencionIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRetencionIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRetencionIva.setName("jPanelParametrosReportesTipoRetencionIva"); 
		
		this.jPanelParametrosReportesAccionesTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRetencionIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRetencionIva.setName("jPanelParametrosReportesAccionesTipoRetencionIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRetencionIva = new JButtonMe();
		this.jButtonRecargarInformacionTipoRetencionIva.setText("Recargar");
		this.jButtonRecargarInformacionTipoRetencionIva.setToolTipText("Recargar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRetencionIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRetencionIva = new JButtonMe();
		this.jButtonProcesarInformacionTipoRetencionIva.setText("Procesar");
		this.jButtonProcesarInformacionTipoRetencionIva.setToolTipText("Procesar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRetencionIva.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRetencionIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRetencionIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRetencionIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencionIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRetencionIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencionIva.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRetencionIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencionIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRetencionIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRetencionIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRetencionIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRetencionIva.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRetencionIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRetencionIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoRetencionIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRetencionIva.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRetencionIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRetencionIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRetencionIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRetencionIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRetencionIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRetencionIva = new JLabelMe();
		
		this.jLabelAccionesTipoRetencionIva.setText("Acciones");		
		this.jLabelAccionesTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRetencionIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRetencionIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRetencionIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRetencionIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRetencionIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRetencionIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRetencionIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRetencionIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRetencionIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRetencionIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRetencionIva = new JButtonMe();
		//this.jButtonAnterioresTipoRetencionIva.setText("<<");
        this.jButtonAnterioresTipoRetencionIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRetencionIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRetencionIva = new JButtonMe();
		//this.jButtonSiguientesTipoRetencionIva.setText(">>");
        this.jButtonSiguientesTipoRetencionIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRetencionIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRetencionIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRetencionIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRetencionIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRetencionIva,"nuevoguardarcambios_button","Nue",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRetencionIva";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRetencionIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRetencionIva";
		inputMap = this.jButtonRecargarInformacionTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRetencionIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRetencionIva";
		inputMap = this.jButtonSiguientesTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRetencionIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRetencionIva";
		inputMap = this.jButtonAnterioresTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRetencionIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRetencionIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRetencionIva.setMinimumSize(new Dimension(this.getWidth(),TipoRetencionIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRetencionIva.setMaximumSize(new Dimension(this.getWidth(),TipoRetencionIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRetencionIva.setPreferredSize(new Dimension(this.getWidth(),TipoRetencionIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRetencionIva = new GridBagLayout();

			this.jPanelPaginacionTipoRetencionIva.setLayout(gridaBagLayoutPaginacionTipoRetencionIva);						
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 0;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonAnterioresTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
					
						
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRetencionIva.gridy = 0;
			
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonNuevoGuardarCambiosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
						
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRetencionIva.gridy = 0;
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonSiguientesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonNuevoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRetencionIva.gridy = 1;
				this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRetencionIva.add(this.jButtonNuevoRelacionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			}
			
			
			if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRetencionIva.gridy = 1;
				this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRetencionIva.add(this.jButtonGuardarCambiosTablaTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			}
			
			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonDuplicarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonCopiarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonVerFormTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRetencionIva.add(this.jButtonCerrarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
		
		
		this.jButtonRecargarInformacionTipoRetencionIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRetencionIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRetencionIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRetencionIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRetencionIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRetencionIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRetencionIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRetencionIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRetencionIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRetencionIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRetencionIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRetencionIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRetencionIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRetencionIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRetencionIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRetencionIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRetencionIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRetencionIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRetencionIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRetencionIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRetencionIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRetencionIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRetencionIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRetencionIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRetencionIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRetencionIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRetencionIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRetencionIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRetencionIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRetencionIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRetencionIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRetencionIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRetencionIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRetencionIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRetencionIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRetencionIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRetencionIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRetencionIva.setLayout(gridaBagParametrosReportesTipoRetencionIva);
			this.jPanelParametrosReportesAccionesTipoRetencionIva.setLayout(gridaBagParametrosReportesAccionesTipoRetencionIva);
			
			
			this.jPanelParametrosAuxiliar1TipoRetencionIva.setLayout(gridaBagParametrosAuxiliar1TipoRetencionIva);
			this.jPanelParametrosAuxiliar2TipoRetencionIva.setLayout(gridaBagParametrosAuxiliar2TipoRetencionIva);
			this.jPanelParametrosAuxiliar3TipoRetencionIva.setLayout(gridaBagParametrosAuxiliar3TipoRetencionIva);
			this.jPanelParametrosAuxiliar4TipoRetencionIva.setLayout(gridaBagParametrosAuxiliar4TipoRetencionIva);
			//this.jPanelParametrosAuxiliar5TipoRetencionIva.setLayout(gridaBagParametrosAuxiliar2TipoRetencionIva);			
			
			
			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jButtonRecargarInformacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencionIva.add(this.jComboBoxTiposPaginacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencionIva.add(this.jCheckBoxConAltoMaximoTablaTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencionIva.add(this.jComboBoxTiposArchivosReportesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jPanelParametrosAuxiliar1TipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRetencionIva.add(this.jComboBoxTiposReportesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jPanelParametrosAuxiliar4TipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jComboBoxTiposReportesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jCheckBoxGenerarReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jPanelParametrosAuxiliar2TipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jLabelAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRetencionIva.add(this.jButtonAbrirOrderByTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jComboBoxTiposSeleccionarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
			
			
			/*
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jCheckBoxSeleccionarTodosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencionIva.add(this.jCheckBoxSeleccionarTodosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);															
				
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencionIva.add(this.jCheckBoxSeleccionadosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jPanelParametrosAuxiliar3TipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jComboBoxTiposRelacionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
				
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jComboBoxTiposAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
	
				
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionIva.add(this.jTextFieldValorCampoGeneralTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRetencionIva = new GridBagLayout();

			this.jScrollPanelDatosTipoRetencionIva.setLayout(gridaBagLayoutDatosTipoRetencionIva);
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = 0;
			this.gridBagConstraintsTipoRetencionIva.gridx = 0;
			
			this.jScrollPanelDatosTipoRetencionIva.add(this.jTableDatosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRetencionIva.setViewportView(this.jTableDatosTipoRetencionIva);
		this.jTableDatosTipoRetencionIva.setFillsViewportHeight(true);
		this.jTableDatosTipoRetencionIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRetencionIva= new GridBagLayout();
		this.jPanelAccionesTipoRetencionIva.setLayout(gridaBagLayoutAccionesTipoRetencionIva);
		
		
		/*	
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
			
		this.jPanelAccionesTipoRetencionIva.add(this.jButtonNuevoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRetencionIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRetencionIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencionIva.gridx = 0;		
			//this.gridBagConstraintsTipoRetencionIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRetencionIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;		
		//this.gridBagConstraintsTipoRetencionIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRetencionIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRetencionIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);								
		
		
		/*
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		*/		
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencionIva.gridx =0;
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRetencionIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
				
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRetencionIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRetencionIva = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRetencionIva.setLayout(gridaBagLayoutBusquedasParametrosTipoRetencionIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRetencionIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRetencionIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
			
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
			
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRetencionIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRetencionIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRetencionIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRetencionIva.setName("jPanelReporteDinamicoTipoRetencionIva"); 
		
		this.jPanelReporteDinamicoTipoRetencionIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRetencionIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRetencionIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRetencionIva.setLayout(gridaBagLayoutReporteDinamicoTipoRetencionIva);
		
		
		this.jInternalFrameReporteDinamicoTipoRetencionIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRetencionIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRetencionIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRetencionIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRetencionIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRetencionIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRetencionIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRetencionIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRetencionIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRetencionIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRetencionIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRetencionIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRetencionIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRetencionIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRetencionIva = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRetencionIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jLabelColumnasSelectReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRetencionIva = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRetencionIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRetencionIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRetencionIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRetencionIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRetencionIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRetencionIva=new JScrollPane(this.jListColumnasSelectReporteTipoRetencionIva);
			
			this.jScrollColumnasSelectReporteTipoRetencionIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRetencionIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRetencionIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRetencionIva.add(this.jListColumnasSelectReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jScrollColumnasSelectReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRetencionIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRetencionIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jLabelRelacionesSelectReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRetencionIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRetencionIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRetencionIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRetencionIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRetencionIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRetencionIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRetencionIva=new JScrollPane(this.jListRelacionesSelectReporteTipoRetencionIva);
			
			this.jScrollRelacionesSelectReporteTipoRetencionIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRetencionIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRetencionIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRetencionIva.add(this.jListRelacionesSelectReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jScrollRelacionesSelectReporteTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRetencionIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRetencionIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRetencionIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRetencionIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRetencionIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRetencionIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRetencionIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRetencionIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRetencionIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jLabelGenerarExcelReporteDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva.setToolTipText("Generar EXCEL"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRetencionIva.add(this.jButtonGenerarExcelReporteDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jComboBoxTiposReportesDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRetencionIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jLabelTiposArchivoReporteDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRetencionIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRetencionIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRetencionIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRetencionIva.setToolTipText("Generar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jButtonGenerarReporteDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRetencionIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRetencionIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRetencionIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRetencionIva.setToolTipText("Cancelar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionIva.add(this.jButtonCerrarReporteDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRetencionIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRetencionIva= new JScrollPane(jPanelReporteDinamicoTipoRetencionIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRetencionIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRetencionIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRetencionIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRetencionIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRetencionIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRetencionIva);
		this.jInternalFrameReporteDinamicoTipoRetencionIva.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRetencionIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRetencionIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRetencionIva.setName("jPanelImportacionTipoRetencionIva"); 
		
		this.jPanelImportacionTipoRetencionIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRetencionIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRetencionIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRetencionIva.setLayout(gridaBagLayoutImportacionTipoRetencionIva);
		
		
		this.jInternalFrameImportacionTipoRetencionIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRetencionIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRetencionIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRetencionIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRetencionIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRetencionIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRetencionIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRetencionIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRetencionIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRetencionIva.setResizable(true);
	    this.jInternalFrameImportacionTipoRetencionIva.setClosable(true);
	    this.jInternalFrameImportacionTipoRetencionIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRetencionIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRetencionIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRetencionIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRetencionIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRetencionIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRetencionIva.setResizable(true);
	    this.jInternalFrameImportacionTipoRetencionIva.setClosable(true);
	    this.jInternalFrameImportacionTipoRetencionIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRetencionIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRetencionIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRetencionIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRetencionIva = new JLabelMe();

		this.jLabelArchivoImportacionTipoRetencionIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRetencionIva.add(this.jLabelArchivoImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRetencionIva = new JFileChooser();		
		this.jFileChooserImportacionTipoRetencionIva.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRetencionIva = new JButtonMe();
		this.jButtonAbrirImportacionTipoRetencionIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRetencionIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRetencionIva.setToolTipText("Generar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionIva.add(this.jButtonAbrirImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRetencionIva = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRetencionIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRetencionIva.add(this.jLabelPathArchivoImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRetencionIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRetencionIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRetencionIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRetencionIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionIva.add(this.jTextFieldPathArchivoImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRetencionIva = new JButtonMe();
		this.jButtonGenerarImportacionTipoRetencionIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRetencionIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRetencionIva.setToolTipText("Generar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionIva.add(this.jButtonGenerarImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRetencionIva = new JButtonMe();
		this.jButtonCerrarImportacionTipoRetencionIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRetencionIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRetencionIva.setToolTipText("Cancelar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionIva.add(this.jButtonCerrarImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRetencionIva = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRetencionIva= new JScrollPane(jPanelImportacionTipoRetencionIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRetencionIva.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRetencionIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRetencionIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRetencionIva);
		this.jInternalFrameImportacionTipoRetencionIva.getContentPane().add(this.jScrollPanelImportacionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRetencionIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRetencionIva = new JButtonMe();
			this.jButtonAbrirOrderByTipoRetencionIva.setText("Orden");
			this.jButtonAbrirOrderByTipoRetencionIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRetencionIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRetencionIva";
			inputMap = this.jButtonAbrirOrderByTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRetencionIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRetencionIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRetencionIva.setName("jPanelOrderByTipoRetencionIva"); 
			
			this.jPanelOrderByTipoRetencionIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRetencionIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRetencionIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRetencionIva.setLayout(gridaBagLayoutOrderByTipoRetencionIva);
			
			
			this.jTableDatosTipoRetencionIvaOrderBy = new JTableMe();        
			this.jTableDatosTipoRetencionIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRetencionIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRetencionIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRetencionIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRetencionIvaOrderBy.setViewportView(this.jTableDatosTipoRetencionIvaOrderBy);
			this.jTableDatosTipoRetencionIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRetencionIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRetencionIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRetencionIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRetencionIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRetencionIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRetencionIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRetencionIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRetencionIva.setTitle("Orden");
			this.jInternalFrameOrderByTipoRetencionIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRetencionIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRetencionIva.setResizable(true);
			this.jInternalFrameOrderByTipoRetencionIva.setClosable(true);
			this.jInternalFrameOrderByTipoRetencionIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRetencionIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRetencionIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRetencionIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRetencionIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRetencionIva.ipady =150;
				
			this.jPanelOrderByTipoRetencionIva.add(jScrollPanelDatosTipoRetencionIvaOrderBy, this.gridBagConstraintsTipoRetencionIva);//this.jTableDatosTipoRetencionIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRetencionIva = new JButtonMe();
			this.jButtonCerrarOrderByTipoRetencionIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRetencionIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRetencionIva.setToolTipText("Cancelar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRetencionIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRetencionIva.add(this.jButtonCerrarOrderByTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRetencionIva = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRetencionIva= new JScrollPane(jPanelOrderByTipoRetencionIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRetencionIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRetencionIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRetencionIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRetencionIva);
			
			this.jInternalFrameOrderByTipoRetencionIva.getContentPane().add(this.jScrollPanelOrderByTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
		
		} else {
			this.jButtonAbrirOrderByTipoRetencionIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporetencionivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRetencionIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRetencionIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRetencionIva.getRowHeight();//TipoRetencionIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.isSelected()) {
					iHeightTable=TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRetencionIva.isSelected()) {
					iHeightTable=TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRetencionIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRetencionIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRetencionIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRetencionIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRetencionIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRetencionIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRetencionIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRetencionIva!=null && this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRetencionIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRetencionIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRetencionIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRetencionIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRetencionIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRetencionIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRetencionIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporetencionivaLogic.getTipoRetencionIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencionivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRetencionIva> TraerTipoRetencionIvaBeans(List<TipoRetencionIva> tiporetencionivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRetencionIva tiporetencioniva:tiporetencionivas) {
					
				if(!(TipoRetencionIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRetencionIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporetencioniva.setsDetalleGeneralEntityReporte(TipoRetencionIvaConstantesFunciones.getTipoRetencionIvaDescripcion(tiporetencioniva));
										
						
					
					

					if(tiporetencioniva.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{tiporetencioniva.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(tiporetencioniva.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tiporetencioniva.getTarjetaCreditos()!=null && Funciones.existeClass(classes,TarjetaCredito.class)) {
						try{tiporetencioniva.settarjetacreditosDescripcionReporte(new JRBeanCollectionDataSource(TarjetaCreditoJInternalFrame.TraerTarjetaCreditoBeans(tiporetencioniva.getTarjetaCreditos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporetencioniva.setsDetalleGeneralEntityReporte(tiporetencioniva.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporetencionivabeans.add(tiporetencionivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporetencionivas;
    }
	//PARA REPORTES FIN
}
