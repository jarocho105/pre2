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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.EstadoRegistroFormaPagoBancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class EstadoRegistroFormaPagoBancoJInternalFrame extends EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoRegistroFormaPagoBanco;
	
	protected JMenuBar jmenuBarEstadoRegistroFormaPagoBanco;
	
	protected JMenu jmenuEstadoRegistroFormaPagoBanco;
	protected JMenu jmenuDatosEstadoRegistroFormaPagoBanco;
	protected JMenu jmenuArchivoEstadoRegistroFormaPagoBanco;
	protected JMenu jmenuAccionesEstadoRegistroFormaPagoBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRegistroFormaPagoBanco;	
	protected GridBagConstraints gridBagConstraintsEstadoRegistroFormaPagoBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoRegistroFormaPagoBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos;		
	public List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosEliminados;	
	public List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoRegistroFormaPagoBanco;		
	protected JButton jButtonAbrirOrderByEstadoRegistroFormaPagoBanco;
	
	
	//protected JPanel jPanelOrderByEstadoRegistroFormaPagoBanco;
	//public JScrollPane jScrollPanelOrderByEstadoRegistroFormaPagoBanco;	
	//protected JButton jButtonCerrarOrderByEstadoRegistroFormaPagoBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoRegistroFormaPagoBancoLogic estadoregistroformapagobancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoRegistroFormaPagoBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco;
	//public JScrollPane jScrollPanelImportacionEstadoRegistroFormaPagoBanco;
	
	
	
	protected JPanel jPanelAccionesEstadoRegistroFormaPagoBanco;
	
    protected JPanel jPanelPaginacionEstadoRegistroFormaPagoBanco;
    protected JPanel jPanelParametrosReportesEstadoRegistroFormaPagoBanco;
	protected JPanel jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco;
	protected JPanel jPanelParametrosAuxiliar2EstadoRegistroFormaPagoBanco;
	protected JPanel jPanelParametrosAuxiliar3EstadoRegistroFormaPagoBanco;
	protected JPanel jPanelParametrosAuxiliar4EstadoRegistroFormaPagoBanco;
	//protected JPanel jPanelParametrosAuxiliar5EstadoRegistroFormaPagoBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoRegistroFormaPagoBanco;
	//protected JPanel jPanelImportacionEstadoRegistroFormaPagoBanco;
	
	
	public JTable jTableDatosEstadoRegistroFormaPagoBanco;
	
	
	
	//public JTable jTableDatosEstadoRegistroFormaPagoBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoRegistroFormaPagoBanco;
	protected JButton jButtonDuplicarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCopiarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonVerFormEstadoRegistroFormaPagoBanco;
	protected JButton jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco;
	protected JButton jButtonModificarEstadoRegistroFormaPagoBanco;
	
    protected JButton jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCerrarEstadoRegistroFormaPagoBanco;
	
	
	protected JButton jButtonRecargarInformacionEstadoRegistroFormaPagoBanco;
	protected JButton jButtonProcesarInformacionEstadoRegistroFormaPagoBanco;
	
	
	protected JButton jButtonAnterioresEstadoRegistroFormaPagoBanco;
	protected JButton jButtonSiguientesEstadoRegistroFormaPagoBanco;
	protected JButton jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco;
	//protected JButton jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoRegistroFormaPagoBanco;
	//protected JButton jButtonGenerarImportacionEstadoRegistroFormaPagoBanco;
	//protected JButton jButtonCerrarImportacionEstadoRegistroFormaPagoBanco;
	//protected JFileChooser jFileChooserImportacionEstadoRegistroFormaPagoBanco;
	//protected File fileImportacionEstadoRegistroFormaPagoBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonDuplicarToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCopiarToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonVerFormToolBarEstadoRegistroFormaPagoBanco;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonCerrarToolBarEstadoRegistroFormaPagoBanco;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonProcesarInformacionToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonAnterioresToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonSiguientesToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco;
	protected JButton jButtonAbrirOrderByToolBarEstadoRegistroFormaPagoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDuplicarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCopiarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemVerFormEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCerrarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemProcesarInformacionEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemAnterioresEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemSiguientesEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRegistroFormaPagoBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoRegistroFormaPagoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco;
	protected JTextField jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco;
	//public JList<Reporte> jListColumnasSelectReporteEstadoRegistroFormaPagoBanco;
	//public JScrollPane jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoRegistroFormaPagoBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco;
	
		
	//public JLabel jLabelArchivoImportacionEstadoRegistroFormaPagoBanco;	
	//public JLabel jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoRegistroFormaPagoBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoRegistroFormaPagoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoRegistroFormaPagoBanco;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoRegistroFormaPagoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoRegistroFormaPagoBanco;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoRegistroFormaPagoBanco;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoRegistroFormaPagoBanco;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoRegistroFormaPagoBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoRegistroFormaPagoBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoRegistroFormaPagoBanco;	
	
	
	
	
	
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
	public EstadoRegistroFormaPagoBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRegistroFormaPagoBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoRegistroFormaPagoBanco)	{
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco = jButtonRecargarInformacionEstadoRegistroFormaPagoBanco;
	}
	
	public JButton getjButtonProcesarInformacionEstadoRegistroFormaPagoBanco() {
		return this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRegistroFormaPagoBanco)	{
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco = jButtonProcesarInformacionEstadoRegistroFormaPagoBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoRegistroFormaPagoBanco() {
		return this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco;
	}
	
	
	public List<EstadoRegistroFormaPagoBanco> getestadoregistroformapagobancos() {
		return this.estadoregistroformapagobancos;
	}

	public void setestadoregistroformapagobancos(List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos) {
		this.estadoregistroformapagobancos = estadoregistroformapagobancos;
	}
	
	public List<EstadoRegistroFormaPagoBanco> getestadoregistroformapagobancosAux() {
		return this.estadoregistroformapagobancosAux;
	}

	public void setestadoregistroformapagobancosAux(List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosAux) {
		this.estadoregistroformapagobancosAux = estadoregistroformapagobancosAux;
	}
	
	public List<EstadoRegistroFormaPagoBanco> getestadoregistroformapagobancosEliminados() {
		return this.estadoregistroformapagobancosEliminados;
	}

	public void setEstadoRegistroFormaPagoBancosEliminados(List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosEliminados) {
		this.estadoregistroformapagobancosEliminados = estadoregistroformapagobancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco() {
		return jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco = jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco() {
		return jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco;
	}

	public void setjTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco(
			JTextField jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco) {
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco = jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco;
	}

	public void setBorderResaltarValorCampoGeneralEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco() {
		return this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco;
	}

	public void setjCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco(
			JCheckBox jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco) {
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco = jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco;
	}

	public void setBorderResaltarSeleccionarTodosEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco() {
		return this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco;
	}

	public void setjCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco(
			JCheckBox jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco) {
		this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco = jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarSeleccionadosEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco = jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposReportesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco = jComboBoxTiposReportesEstadoRegistroFormaPagoBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco() {
	//	return jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco) {
	//	this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco = jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco = jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco;
	//}
	
	public void setBorderResaltarTiposReportesEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco = jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco = jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRegistroFormaPagoBanco() {
		return this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco = jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco) {
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco = jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco() {
	//	return jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco) {
	//	this.jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco = jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoRegistroFormaPagoBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoRegistroFormaPagoBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco .setBorder(borderResaltar);		
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
		this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
		
		this.estadoregistroformapagobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoregistroformapagobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRegistroFormaPagoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Registro Forma Pago Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoRegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoRegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoRegistroFormaPagoBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"nuevo","nuevo","Nuevo"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"duplicar","duplicar","Duplicar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"copiar","copiar","Copiar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"ver_form","ver_form","Ver"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"recargar","recargar","Recargar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,
							"cerrar","cerrar","Salir"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco;
			
				this.jButtonProcesarInformacionToolBarEstadoRegistroFormaPagoBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoRegistroFormaPagoBanco;
				
		//protected JButton jButtonModificarToolBarEstadoRegistroFormaPagoBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoRegistroFormaPagoBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoRegistroFormaPagoBanco=new JMenuMe("General");
		this.jmenuArchivoEstadoRegistroFormaPagoBanco=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoRegistroFormaPagoBanco=new JMenuMe("Acciones");
		this.jmenuDatosEstadoRegistroFormaPagoBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRegistroFormaPagoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRegistroFormaPagoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRegistroFormaPagoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoRegistroFormaPagoBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoRegistroFormaPagoBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoRegistroFormaPagoBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoRegistroFormaPagoBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoRegistroFormaPagoBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoRegistroFormaPagoBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRegistroFormaPagoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRegistroFormaPagoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRegistroFormaPagoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoRegistroFormaPagoBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoRegistroFormaPagoBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoRegistroFormaPagoBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoRegistroFormaPagoBanco.add(this.jMenuItemCerrarEstadoRegistroFormaPagoBanco);
			
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemNuevoEstadoRegistroFormaPagoBanco);
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco);
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco);
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco);		
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco);		
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemCopiarEstadoRegistroFormaPagoBanco);		
			this.jmenuAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemVerFormEstadoRegistroFormaPagoBanco);		
			
			this.jmenuDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco);				
			this.jmenuDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco);				
			this.jmenuDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco);				
			this.jmenuDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco);				
			this.jmenuDatosEstadoRegistroFormaPagoBanco.add(this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoRegistroFormaPagoBanco.add(this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoRegistroFormaPagoBanco.add(this.jmenuArchivoEstadoRegistroFormaPagoBanco);		
			this.jmenuBarEstadoRegistroFormaPagoBanco.add(this.jmenuAccionesEstadoRegistroFormaPagoBanco);		
			this.jmenuBarEstadoRegistroFormaPagoBanco.add(this.jmenuDatosEstadoRegistroFormaPagoBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoRegistroFormaPagoBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoRegistroFormaPagoBanco() {
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
			//this.jInternalFrameDetalleEstadoRegistroFormaPagoBanco = new EstadoRegistroFormaPagoBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Registro Forma Pago Banco DATOS");
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco = new EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(jDesktopPane,this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones(),this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco = null;//new EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRegistroFormaPagoBanco= new GridBagLayout();
		
		
		this.jTableDatosEstadoRegistroFormaPagoBanco = new JTableMe();      
		
		String sToolTipEstadoRegistroFormaPagoBanco="";
		sToolTipEstadoRegistroFormaPagoBanco=EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRegistroFormaPagoBanco+="(Tesoreria.EstadoRegistroFormaPagoBanco)";
		}
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRegistroFormaPagoBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.setToolTipText(sToolTipEstadoRegistroFormaPagoBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoRegistroFormaPagoBanco);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoRegistroFormaPagoBanco.setRowSelectionAllowed(true);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonDuplicarEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCopiarEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonVerFormEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarEstadoRegistroFormaPagoBanco = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Registro Forma Pago Banco";
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Registro Forma Pago Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRegistroFormaPagoBanco.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRegistroFormaPagoBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco=new ReporteDinamicoJInternalFrame(EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoRegistroFormaPagoBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco=new ImportacionJInternalFrame(EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoRegistroFormaPagoBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.setText("Orden");
		this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco,false,this);
			
			//this.cargarOrderByEstadoRegistroFormaPagoBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco,true,this);
			
			//this.cargarOrderByEstadoRegistroFormaPagoBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoRegistroFormaPagoBanco.setText("Nuevo");
		this.jButtonDuplicarEstadoRegistroFormaPagoBanco.setText("Duplicar");
		this.jButtonCopiarEstadoRegistroFormaPagoBanco.setText("Copiar");
		this.jButtonVerFormEstadoRegistroFormaPagoBanco.setText("Ver");
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setText("Guardar");
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRegistroFormaPagoBanco,"nuevo_button","Nuevo",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoRegistroFormaPagoBanco,"duplicar_button","Duplicar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoRegistroFormaPagoBanco,"copiar_button","Copiar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoRegistroFormaPagoBanco,"ver_form","Ver",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco,"nuevorelaciones_button","Nuevo Rel",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco,"guardarcambiostabla_button","Guardar",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRegistroFormaPagoBanco,"cerrar_button","Salir",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.setToolTipText("Nuevo"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoRegistroFormaPagoBanco.setToolTipText("Duplicar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoRegistroFormaPagoBanco.setToolTipText("Copiar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoRegistroFormaPagoBanco.setToolTipText("Ver"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.setToolTipText("Nuevo Rel"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setToolTipText("Guardar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.setToolTipText("Salir"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRegistroFormaPagoBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonDuplicarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoRegistroFormaPagoBanco"));
		
		//COPIAR
		sMapKey = "CopiarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonCopiarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoRegistroFormaPagoBanco"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonVerFormEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoRegistroFormaPagoBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoRegistroFormaPagoBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonModificarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoRegistroFormaPagoBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonCerrarEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRegistroFormaPagoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRegistroFormaPagoBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setName("jPanelParametrosReportesEstadoRegistroFormaPagoBanco"); 
		
		this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco.setName("jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.setText("Recargar");
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.setToolTipText("Recargar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco.setText("Procesar");
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco.setToolTipText("Procesar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoRegistroFormaPagoBanco = new JLabelMe();
		
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setText("Acciones");		
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoRegistroFormaPagoBanco = new JButtonMe();
		//this.jButtonAnterioresEstadoRegistroFormaPagoBanco.setText("<<");
        this.jButtonAnterioresEstadoRegistroFormaPagoBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoRegistroFormaPagoBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoRegistroFormaPagoBanco = new JButtonMe();
		//this.jButtonSiguientesEstadoRegistroFormaPagoBanco.setText(">>");
        this.jButtonSiguientesEstadoRegistroFormaPagoBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoRegistroFormaPagoBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco,"nuevoguardarcambios_button","Nue",this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoRegistroFormaPagoBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoRegistroFormaPagoBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonSiguientesEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoRegistroFormaPagoBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonAnterioresEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoRegistroFormaPagoBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoRegistroFormaPagoBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(this.getWidth(),EstadoRegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(this.getWidth(),EstadoRegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(this.getWidth(),EstadoRegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoRegistroFormaPagoBanco = new GridBagLayout();

			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutPaginacionEstadoRegistroFormaPagoBanco);						
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonAnterioresEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
					
						
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
			
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
						
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonSiguientesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonNuevoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			}
			
			
			if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			}
			
			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonDuplicarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonCopiarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonVerFormEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.add(this.jButtonCerrarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
		
		
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoRegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoRegistroFormaPagoBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoRegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoRegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoRegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoRegistroFormaPagoBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosReportesEstadoRegistroFormaPagoBanco);
			this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosReportesAccionesEstadoRegistroFormaPagoBanco);
			
			
			this.jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar1EstadoRegistroFormaPagoBanco);
			this.jPanelParametrosAuxiliar2EstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar2EstadoRegistroFormaPagoBanco);
			this.jPanelParametrosAuxiliar3EstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar3EstadoRegistroFormaPagoBanco);
			this.jPanelParametrosAuxiliar4EstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar4EstadoRegistroFormaPagoBanco);
			//this.jPanelParametrosAuxiliar5EstadoRegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar2EstadoRegistroFormaPagoBanco);			
			
			
			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco.add(this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar1EstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar4EstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jCheckBoxGenerarReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar2EstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jLabelAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
			
			
			/*
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRegistroFormaPagoBanco.add(this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);															
				
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRegistroFormaPagoBanco.add(this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar3EstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
				
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoRegistroFormaPagoBanco = new GridBagLayout();

			this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutDatosEstadoRegistroFormaPagoBanco);
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
			
			this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.add(this.jTableDatosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setViewportView(this.jTableDatosEstadoRegistroFormaPagoBanco);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setFillsViewportHeight(true);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoRegistroFormaPagoBanco= new GridBagLayout();
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutAccionesEstadoRegistroFormaPagoBanco);
		
		
		/*	
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
			
		this.jPanelAccionesEstadoRegistroFormaPagoBanco.add(this.jButtonNuevoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRegistroFormaPagoBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;		
			//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;		
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);								
		
		
		/*
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		*/		
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =0;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
				
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRegistroFormaPagoBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutBusquedasParametrosEstadoRegistroFormaPagoBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
			
			
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
			
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoRegistroFormaPagoBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoRegistroFormaPagoBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoRegistroFormaPagoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setName("jPanelReporteDinamicoEstadoRegistroFormaPagoBanco"); 
		
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutReporteDinamicoEstadoRegistroFormaPagoBanco);
		
		
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Registro Forma Pago Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jLabelColumnasSelectReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco=new JScrollPane(this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco);
			
			this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jListColumnasSelectReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jLabelRelacionesSelectReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco=new JScrollPane(this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco);
			
			this.jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jListRelacionesSelectReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jScrollRelacionesSelectReporteEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoRegistroFormaPagoBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoRegistroFormaPagoBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jLabelGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.setToolTipText("Generar EXCEL"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposReportesDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jLabelTiposArchivoReporteDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco.setToolTipText("Generar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRegistroFormaPagoBanco.add(this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco= new JScrollPane(jPanelReporteDinamicoEstadoRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Registro Forma Pago Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoRegistroFormaPagoBanco);
		this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoRegistroFormaPagoBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoRegistroFormaPagoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.setName("jPanelImportacionEstadoRegistroFormaPagoBanco"); 
		
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutImportacionEstadoRegistroFormaPagoBanco);
		
		
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setResizable(true);
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setClosable(true);
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setResizable(true);
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setClosable(true);
	    this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Registro Forma Pago Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelArchivoImportacionEstadoRegistroFormaPagoBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.add(this.jLabelArchivoImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoRegistroFormaPagoBanco = new JFileChooser();		
		this.jFileChooserImportacionEstadoRegistroFormaPagoBanco.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonAbrirImportacionEstadoRegistroFormaPagoBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoRegistroFormaPagoBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoRegistroFormaPagoBanco.setToolTipText("Generar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.add(this.jButtonAbrirImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.add(this.jLabelPathArchivoImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoRegistroFormaPagoBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.add(this.jTextFieldPathArchivoImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGenerarImportacionEstadoRegistroFormaPagoBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoRegistroFormaPagoBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoRegistroFormaPagoBanco.setToolTipText("Generar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.add(this.jButtonGenerarImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarImportacionEstadoRegistroFormaPagoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoRegistroFormaPagoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRegistroFormaPagoBanco.add(this.jButtonCerrarImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco= new JScrollPane(jPanelImportacionEstadoRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoRegistroFormaPagoBanco);
		this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getContentPane().add(this.jScrollPanelImportacionEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoRegistroFormaPagoBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco = new JButtonMe();
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.setText("Orden");
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoRegistroFormaPagoBanco";
			inputMap = this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoRegistroFormaPagoBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoRegistroFormaPagoBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.setName("jPanelOrderByEstadoRegistroFormaPagoBanco"); 
			
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.setLayout(gridaBagLayoutOrderByEstadoRegistroFormaPagoBanco);
			
			
			this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy = new JTableMe();        
			this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoRegistroFormaPagoBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoRegistroFormaPagoBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoRegistroFormaPagoBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoRegistroFormaPagoBancoOrderBy.setViewportView(this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy);
			this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoRegistroFormaPagoBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setTitle("Orden");
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setResizable(true);
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setClosable(true);
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Registro Forma Pago Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoRegistroFormaPagoBanco.ipady =150;
				
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.add(jScrollPanelDatosEstadoRegistroFormaPagoBancoOrderBy, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);//this.jTableDatosEstadoRegistroFormaPagoBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoRegistroFormaPagoBanco = new JButtonMe();
			this.jButtonCerrarOrderByEstadoRegistroFormaPagoBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoRegistroFormaPagoBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoRegistroFormaPagoBanco.add(this.jButtonCerrarOrderByEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoRegistroFormaPagoBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco= new JScrollPane(jPanelOrderByEstadoRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoRegistroFormaPagoBanco);
			
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getContentPane().add(this.jScrollPanelOrderByEstadoRegistroFormaPagoBanco, this.gridBagConstraintsEstadoRegistroFormaPagoBanco);			
		
		} else {
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco = new JButtonMe();
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
			&& this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoRegistroFormaPagoBanco.getRowHeight();//EstadoRegistroFormaPagoBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.isSelected()) {
					iHeightTable=EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRegistroFormaPagoBanco.isSelected()) {
					iHeightTable=EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco!=null && this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoregistroformapagobancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoRegistroFormaPagoBanco> TraerEstadoRegistroFormaPagoBancoBeans(List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:estadoregistroformapagobancos) {
					
				if(!(EstadoRegistroFormaPagoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoRegistroFormaPagoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoregistroformapagobanco.setsDetalleGeneralEntityReporte(EstadoRegistroFormaPagoBancoConstantesFunciones.getEstadoRegistroFormaPagoBancoDescripcion(estadoregistroformapagobanco));
										
						
					
					

					if(estadoregistroformapagobanco.getRegistroFormaPagoBancos()!=null && Funciones.existeClass(classes,RegistroFormaPagoBanco.class)) {
						try{estadoregistroformapagobanco.setregistroformapagobancosDescripcionReporte(new JRBeanCollectionDataSource(RegistroFormaPagoBancoJInternalFrame.TraerRegistroFormaPagoBancoBeans(estadoregistroformapagobanco.getRegistroFormaPagoBancos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoregistroformapagobanco.setsDetalleGeneralEntityReporte(estadoregistroformapagobanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoregistroformapagobancobeans.add(estadoregistroformapagobancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoregistroformapagobancos;
    }
	//PARA REPORTES FIN
}
