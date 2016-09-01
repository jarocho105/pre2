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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.contabilidad.util.EstadoAsientoContableCajaChicaConstantesFunciones;

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
public class EstadoAsientoContableCajaChicaJInternalFrame extends EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoAsientoContableCajaChica;
	
	protected JMenuBar jmenuBarEstadoAsientoContableCajaChica;
	
	protected JMenu jmenuEstadoAsientoContableCajaChica;
	protected JMenu jmenuDatosEstadoAsientoContableCajaChica;
	protected JMenu jmenuArchivoEstadoAsientoContableCajaChica;
	protected JMenu jmenuAccionesEstadoAsientoContableCajaChica;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoAsientoContableCajaChica;	
	protected GridBagConstraints gridBagConstraintsEstadoAsientoContableCajaChica;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoAsientoContableCajaChica;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoAsientoContableCajaChica;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicas;		
	public List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasEliminados;	
	public List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoAsientoContableCajaChica;		
	protected JButton jButtonAbrirOrderByEstadoAsientoContableCajaChica;
	
	
	//protected JPanel jPanelOrderByEstadoAsientoContableCajaChica;
	//public JScrollPane jScrollPanelOrderByEstadoAsientoContableCajaChica;	
	//protected JButton jButtonCerrarOrderByEstadoAsientoContableCajaChica;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoAsientoContableCajaChicaLogic estadoasientocontablecajachicaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosEdicionEstadoAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosGeneralEstadoAsientoContableCajaChica;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoAsientoContableCajaChicaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica;
	//public JScrollPane jScrollPanelImportacionEstadoAsientoContableCajaChica;
	
	
	
	protected JPanel jPanelAccionesEstadoAsientoContableCajaChica;
	
    protected JPanel jPanelPaginacionEstadoAsientoContableCajaChica;
    protected JPanel jPanelParametrosReportesEstadoAsientoContableCajaChica;
	protected JPanel jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar2EstadoAsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar3EstadoAsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar4EstadoAsientoContableCajaChica;
	//protected JPanel jPanelParametrosAuxiliar5EstadoAsientoContableCajaChica;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoAsientoContableCajaChica;
	//protected JPanel jPanelImportacionEstadoAsientoContableCajaChica;
	
	
	public JTable jTableDatosEstadoAsientoContableCajaChica;
	
	
	
	//public JTable jTableDatosEstadoAsientoContableCajaChicaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoAsientoContableCajaChica;
	protected JButton jButtonDuplicarEstadoAsientoContableCajaChica;
	protected JButton jButtonCopiarEstadoAsientoContableCajaChica;
	protected JButton jButtonVerFormEstadoAsientoContableCajaChica;
	protected JButton jButtonNuevoRelacionesEstadoAsientoContableCajaChica;
	protected JButton jButtonModificarEstadoAsientoContableCajaChica;
	
    protected JButton jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica;
	protected JButton jButtonCerrarEstadoAsientoContableCajaChica;
	
	
	protected JButton jButtonRecargarInformacionEstadoAsientoContableCajaChica;
	protected JButton jButtonProcesarInformacionEstadoAsientoContableCajaChica;
	
	
	protected JButton jButtonAnterioresEstadoAsientoContableCajaChica;
	protected JButton jButtonSiguientesEstadoAsientoContableCajaChica;
	protected JButton jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica;
	//protected JButton jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoAsientoContableCajaChica;
	//protected JButton jButtonGenerarImportacionEstadoAsientoContableCajaChica;
	//protected JButton jButtonCerrarImportacionEstadoAsientoContableCajaChica;
	//protected JFileChooser jFileChooserImportacionEstadoAsientoContableCajaChica;
	//protected File fileImportacionEstadoAsientoContableCajaChica;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonDuplicarToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonCopiarToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonVerFormToolBarEstadoAsientoContableCajaChica;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonCerrarToolBarEstadoAsientoContableCajaChica;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonProcesarInformacionToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonAnterioresToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonSiguientesToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonAbrirOrderByToolBarEstadoAsientoContableCajaChica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDuplicarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemCopiarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemVerFormEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemCerrarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleCerrarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemProcesarInformacionEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemAnterioresEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemSiguientesEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemAbrirOrderByEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemMostrarOcultarEstadoAsientoContableCajaChica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoAsientoContableCajaChica;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica;
	protected JCheckBox jCheckBoxSeleccionadosEstadoAsientoContableCajaChica;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica;
	protected JTextField jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoAsientoContableCajaChica;
	//public JList<Reporte> jListColumnasSelectReporteEstadoAsientoContableCajaChica;
	//public JScrollPane jScrollColumnasSelectReporteEstadoAsientoContableCajaChica;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoAsientoContableCajaChica;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoAsientoContableCajaChica;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoAsientoContableCajaChica;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoAsientoContableCajaChica;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica;
	
		
	//public JLabel jLabelArchivoImportacionEstadoAsientoContableCajaChica;	
	//public JLabel jLabelPathArchivoImportacionEstadoAsientoContableCajaChica;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoAsientoContableCajaChica;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoAsientoContableCajaChica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoAsientoContableCajaChica;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoAsientoContableCajaChica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoAsientoContableCajaChica;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoAsientoContableCajaChica;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoAsientoContableCajaChica;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoAsientoContableCajaChica;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoAsientoContableCajaChica;	
	
	
	
	
	
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
	public EstadoAsientoContableCajaChicaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoAsientoContableCajaChica)	{
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica = jButtonRecargarInformacionEstadoAsientoContableCajaChica;
	}
	
	public JButton getjButtonProcesarInformacionEstadoAsientoContableCajaChica() {
		return this.jButtonProcesarInformacionEstadoAsientoContableCajaChica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoAsientoContableCajaChica)	{
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica = jButtonProcesarInformacionEstadoAsientoContableCajaChica;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoAsientoContableCajaChica() {
		return this.jButtonRecargarInformacionEstadoAsientoContableCajaChica;
	}
	
	
	public List<EstadoAsientoContableCajaChica> getestadoasientocontablecajachicas() {
		return this.estadoasientocontablecajachicas;
	}

	public void setestadoasientocontablecajachicas(List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicas) {
		this.estadoasientocontablecajachicas = estadoasientocontablecajachicas;
	}
	
	public List<EstadoAsientoContableCajaChica> getestadoasientocontablecajachicasAux() {
		return this.estadoasientocontablecajachicasAux;
	}

	public void setestadoasientocontablecajachicasAux(List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasAux) {
		this.estadoasientocontablecajachicasAux = estadoasientocontablecajachicasAux;
	}
	
	public List<EstadoAsientoContableCajaChica> getestadoasientocontablecajachicasEliminados() {
		return this.estadoasientocontablecajachicasEliminados;
	}

	public void setEstadoAsientoContableCajaChicasEliminados(List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicasEliminados) {
		this.estadoasientocontablecajachicasEliminados = estadoasientocontablecajachicasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoAsientoContableCajaChica() {
		return jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica = jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoAsientoContableCajaChica() {
		return jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica;
	}

	public void setjTextFieldValorCampoGeneralEstadoAsientoContableCajaChica(
			JTextField jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica) {
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica = jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica;
	}

	public void setBorderResaltarValorCampoGeneralEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica() {
		return this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica;
	}

	public void setjCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica(
			JCheckBox jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica) {
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica = jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica;
	}

	public void setBorderResaltarSeleccionarTodosEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoAsientoContableCajaChica() {
		return this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica;
	}

	public void setjCheckBoxSeleccionadosEstadoAsientoContableCajaChica(
			JCheckBox jCheckBoxSeleccionadosEstadoAsientoContableCajaChica) {
		this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica = jCheckBoxSeleccionadosEstadoAsientoContableCajaChica;
	}
	
	public void setBorderResaltarSeleccionadosEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica = jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposReportesEstadoAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposReportesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica = jComboBoxTiposReportesEstadoAsientoContableCajaChica;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica() {
	//	return jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica) {
	//	this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica = jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica = jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica;
	//}
	
	public void setBorderResaltarTiposReportesEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica = jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposPaginacionEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica = jComboBoxTiposPaginacionEstadoAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposRelacionesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica = jComboBoxTiposRelacionesEstadoAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica = jComboBoxTiposAccionesEstadoAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica() {
	//	return jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica) {
	//	this.jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica = jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoAsientoContableCajaChica() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoAsientoContableCajaChica.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica .setBorder(borderResaltar);		
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
		this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
		
		this.estadoasientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoasientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoAsientoContableCajaChicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Asiento Contable Caja Chica MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoAsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoAsientoContableCajaChica= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"nuevo","nuevo","Nuevo"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"duplicar","duplicar","Duplicar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"copiar","copiar","Copiar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"ver_form","ver_form","Ver"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"recargar","recargar","Recargar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoAsientoContableCajaChica,this.jTtoolBarEstadoAsientoContableCajaChica,
							"cerrar","cerrar","Salir"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoAsientoContableCajaChica;
			
				this.jButtonProcesarInformacionToolBarEstadoAsientoContableCajaChica=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoAsientoContableCajaChica;
				
		//protected JButton jButtonModificarToolBarEstadoAsientoContableCajaChica;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoAsientoContableCajaChica=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoAsientoContableCajaChica=new JMenuMe("General");
		this.jmenuArchivoEstadoAsientoContableCajaChica=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoAsientoContableCajaChica=new JMenuMe("Acciones");
		this.jmenuDatosEstadoAsientoContableCajaChica=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoAsientoContableCajaChica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoAsientoContableCajaChica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoAsientoContableCajaChica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoAsientoContableCajaChica= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoAsientoContableCajaChica.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoAsientoContableCajaChica,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoAsientoContableCajaChica= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoAsientoContableCajaChica.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoAsientoContableCajaChica,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoAsientoContableCajaChica= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoAsientoContableCajaChica.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoAsientoContableCajaChica,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoAsientoContableCajaChica= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoAsientoContableCajaChica.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoAsientoContableCajaChica,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoAsientoContableCajaChica= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoAsientoContableCajaChica.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoAsientoContableCajaChica,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoAsientoContableCajaChica= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoAsientoContableCajaChica.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoAsientoContableCajaChica,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoAsientoContableCajaChica.add(this.jMenuItemCerrarEstadoAsientoContableCajaChica);
			
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemNuevoEstadoAsientoContableCajaChica);
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica);
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemNuevoRelacionesEstadoAsientoContableCajaChica);
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica);		
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemDuplicarEstadoAsientoContableCajaChica);		
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemCopiarEstadoAsientoContableCajaChica);		
			this.jmenuAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemVerFormEstadoAsientoContableCajaChica);		
			
			this.jmenuDatosEstadoAsientoContableCajaChica.add(this.jMenuItemRecargarInformacionEstadoAsientoContableCajaChica);				
			this.jmenuDatosEstadoAsientoContableCajaChica.add(this.jMenuItemAnterioresEstadoAsientoContableCajaChica);				
			this.jmenuDatosEstadoAsientoContableCajaChica.add(this.jMenuItemSiguientesEstadoAsientoContableCajaChica);				
			this.jmenuDatosEstadoAsientoContableCajaChica.add(this.jMenuItemAbrirOrderByEstadoAsientoContableCajaChica);				
			this.jmenuDatosEstadoAsientoContableCajaChica.add(this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoAsientoContableCajaChica.add(this.jmenuArchivoEstadoAsientoContableCajaChica);		
			this.jmenuBarEstadoAsientoContableCajaChica.add(this.jmenuAccionesEstadoAsientoContableCajaChica);		
			this.jmenuBarEstadoAsientoContableCajaChica.add(this.jmenuDatosEstadoAsientoContableCajaChica);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoAsientoContableCajaChica);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoAsientoContableCajaChica() {
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
			//this.jInternalFrameDetalleEstadoAsientoContableCajaChica = new EstadoAsientoContableCajaChicaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Asiento Contable Caja Chica DATOS");
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica = new EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(jDesktopPane,this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones(),this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoAsientoContableCajaChica = null;//new EstadoAsientoContableCajaChicaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoAsientoContableCajaChica= new GridBagLayout();
		
		
		this.jTableDatosEstadoAsientoContableCajaChica = new JTableMe();      
		
		String sToolTipEstadoAsientoContableCajaChica="";
		sToolTipEstadoAsientoContableCajaChica=EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoAsientoContableCajaChica+="(Contabilidad.EstadoAsientoContableCajaChica)";
		}
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoAsientoContableCajaChica+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoAsientoContableCajaChica.setToolTipText(sToolTipEstadoAsientoContableCajaChica);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoAsientoContableCajaChica);
		this.jTableDatosEstadoAsientoContableCajaChica.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoAsientoContableCajaChica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoAsientoContableCajaChica.setRowSelectionAllowed(true);
		this.jTableDatosEstadoAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonDuplicarEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonCopiarEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonVerFormEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarEstadoAsientoContableCajaChica = new JButtonMe();
		
		this.jScrollPanelDatosEstadoAsientoContableCajaChica = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Asiento Contable Caja Chica";
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contable Caja Chicas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesEstadoAsientoContableCajaChica.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica=new ReporteDinamicoJInternalFrame(EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoAsientoContableCajaChica();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoAsientoContableCajaChica=new ImportacionJInternalFrame(EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoAsientoContableCajaChica();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoAsientoContableCajaChica = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.setText("Orden");
		this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoAsientoContableCajaChica,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContableCajaChica,false,this);
			
			//this.cargarOrderByEstadoAsientoContableCajaChica(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContableCajaChica,true,this);
			
			//this.cargarOrderByEstadoAsientoContableCajaChica(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoAsientoContableCajaChica.setText("Nuevo");
		this.jButtonDuplicarEstadoAsientoContableCajaChica.setText("Duplicar");
		this.jButtonCopiarEstadoAsientoContableCajaChica.setText("Copiar");
		this.jButtonVerFormEstadoAsientoContableCajaChica.setText("Ver");
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.setText("Guardar");
		this.jButtonCerrarEstadoAsientoContableCajaChica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoAsientoContableCajaChica,"nuevo_button","Nuevo",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoAsientoContableCajaChica,"duplicar_button","Duplicar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoAsientoContableCajaChica,"copiar_button","Copiar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoAsientoContableCajaChica,"ver_form","Ver",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica,"nuevorelaciones_button","Nuevo Rel",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica,"guardarcambiostabla_button","Guardar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoAsientoContableCajaChica,"cerrar_button","Salir",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoAsientoContableCajaChica.setToolTipText("Nuevo"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoAsientoContableCajaChica.setToolTipText("Duplicar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoAsientoContableCajaChica.setToolTipText("Copiar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoAsientoContableCajaChica.setToolTipText("Ver"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.setToolTipText("Nuevo Rel"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.setToolTipText("Guardar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoAsientoContableCajaChica.setToolTipText("Salir"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoAsientoContableCajaChica"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonDuplicarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoAsientoContableCajaChica"));
		
		//COPIAR
		sMapKey = "CopiarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonCopiarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoAsientoContableCajaChica"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoAsientoContableCajaChica";
		inputMap = this.jButtonVerFormEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoAsientoContableCajaChica"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoAsientoContableCajaChica"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonModificarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoAsientoContableCajaChica"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonCerrarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoAsientoContableCajaChica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoAsientoContableCajaChica";
		inputMap = this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoAsientoContableCajaChica"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setName("jPanelParametrosReportesEstadoAsientoContableCajaChica"); 
		
		this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica.setName("jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.setText("Recargar");
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.setToolTipText("Recargar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoAsientoContableCajaChica,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica.setText("Procesar");
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica.setToolTipText("Procesar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoAsientoContableCajaChica = new JLabelMe();
		
		this.jLabelAccionesEstadoAsientoContableCajaChica.setText("Acciones");		
		this.jLabelAccionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoAsientoContableCajaChica = new JButtonMe();
		//this.jButtonAnterioresEstadoAsientoContableCajaChica.setText("<<");
        this.jButtonAnterioresEstadoAsientoContableCajaChica.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoAsientoContableCajaChica,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoAsientoContableCajaChica = new JButtonMe();
		//this.jButtonSiguientesEstadoAsientoContableCajaChica.setText(">>");
        this.jButtonSiguientesEstadoAsientoContableCajaChica.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoAsientoContableCajaChica,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica,"nuevoguardarcambios_button","Nue",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoAsientoContableCajaChica"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoAsientoContableCajaChica";
		inputMap = this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoAsientoContableCajaChica"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoAsientoContableCajaChica";
		inputMap = this.jButtonSiguientesEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoAsientoContableCajaChica"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoAsientoContableCajaChica";
		inputMap = this.jButtonAnterioresEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoAsientoContableCajaChica"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoAsientoContableCajaChica();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(this.getWidth(),EstadoAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(this.getWidth(),EstadoAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(this.getWidth(),EstadoAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoAsientoContableCajaChica = new GridBagLayout();

			this.jPanelPaginacionEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutPaginacionEstadoAsientoContableCajaChica);						
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonAnterioresEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
					
						
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
			
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonNuevoGuardarCambiosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
						
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonSiguientesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonNuevoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
						
			
			
			if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 1;
				this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			}
			
			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonDuplicarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonCopiarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonVerFormEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoAsientoContableCajaChica.add(this.jButtonCerrarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
		
		
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoAsientoContableCajaChica = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoAsientoContableCajaChica = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.setLayout(gridaBagParametrosReportesEstadoAsientoContableCajaChica);
			this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica.setLayout(gridaBagParametrosReportesAccionesEstadoAsientoContableCajaChica);
			
			
			this.jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar1EstadoAsientoContableCajaChica);
			this.jPanelParametrosAuxiliar2EstadoAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar2EstadoAsientoContableCajaChica);
			this.jPanelParametrosAuxiliar3EstadoAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar3EstadoAsientoContableCajaChica);
			this.jPanelParametrosAuxiliar4EstadoAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar4EstadoAsientoContableCajaChica);
			//this.jPanelParametrosAuxiliar5EstadoAsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar2EstadoAsientoContableCajaChica);			
			
			
			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jButtonRecargarInformacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica.add(this.jComboBoxTiposPaginacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica.add(this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica.add(this.jComboBoxTiposArchivosReportesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar1EstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoAsientoContableCajaChica.add(this.jComboBoxTiposReportesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar4EstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jComboBoxTiposReportesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jCheckBoxGenerarReporteEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar2EstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jLabelAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jButtonAbrirOrderByEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jComboBoxTiposSeleccionarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
			
			
			/*
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoAsientoContableCajaChica.add(this.jCheckBoxSeleccionarTodosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);															
				
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoAsientoContableCajaChica.add(this.jCheckBoxSeleccionadosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar3EstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
				
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContableCajaChica.add(this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoAsientoContableCajaChica = new GridBagLayout();

			this.jScrollPanelDatosEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutDatosEstadoAsientoContableCajaChica);
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
			
			this.jScrollPanelDatosEstadoAsientoContableCajaChica.add(this.jTableDatosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setViewportView(this.jTableDatosEstadoAsientoContableCajaChica);
		this.jTableDatosEstadoAsientoContableCajaChica.setFillsViewportHeight(true);
		this.jTableDatosEstadoAsientoContableCajaChica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesEstadoAsientoContableCajaChica);
		
		
		/*	
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
			
		this.jPanelAccionesEstadoAsientoContableCajaChica.add(this.jButtonNuevoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoAsientoContableCajaChica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoAsientoContableCajaChica);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();						
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;		
			//this.gridBagConstraintsEstadoAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;		
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);								
		
		
		/*
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		*/		
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
				
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoAsientoContableCajaChica = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutBusquedasParametrosEstadoAsientoContableCajaChica);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
			
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
			
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoAsientoContableCajaChica() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.setName("jPanelReporteDinamicoEstadoAsientoContableCajaChica"); 
		
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutReporteDinamicoEstadoAsientoContableCajaChica);
		
		
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contable Caja Chicas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoAsientoContableCajaChica = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoAsientoContableCajaChica.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jLabelColumnasSelectReporteEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoAsientoContableCajaChica = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica=new JScrollPane(this.jListColumnasSelectReporteEstadoAsientoContableCajaChica);
			
			this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jListColumnasSelectReporteEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoAsientoContableCajaChica = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoAsientoContableCajaChica.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoAsientoContableCajaChica=new JScrollPane(this.jListRelacionesSelectReporteEstadoAsientoContableCajaChica);
			
			this.jScrollRelacionesSelectReporteEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoAsientoContableCajaChica = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoAsientoContableCajaChica = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoAsientoContableCajaChica = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica.setToolTipText("Generar EXCEL"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jComboBoxTiposReportesDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica.setToolTipText("Generar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jButtonGenerarReporteDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica.setToolTipText("Cancelar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContableCajaChica.add(this.jButtonCerrarReporteDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica= new JScrollPane(jPanelReporteDinamicoEstadoAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contable Caja Chicas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoAsientoContableCajaChica);
		this.jInternalFrameReporteDinamicoEstadoAsientoContableCajaChica.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoAsientoContableCajaChica() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoAsientoContableCajaChica.setName("jPanelImportacionEstadoAsientoContableCajaChica"); 
		
		this.jPanelImportacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutImportacionEstadoAsientoContableCajaChica);
		
		
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoAsientoContableCajaChica= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contable Caja Chicas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoAsientoContableCajaChica = new JLabelMe();

		this.jLabelArchivoImportacionEstadoAsientoContableCajaChica.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoAsientoContableCajaChica.add(this.jLabelArchivoImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoAsientoContableCajaChica = new JFileChooser();		
		this.jFileChooserImportacionEstadoAsientoContableCajaChica.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonAbrirImportacionEstadoAsientoContableCajaChica.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoAsientoContableCajaChica,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoAsientoContableCajaChica.setToolTipText("Generar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContableCajaChica.add(this.jButtonAbrirImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoAsientoContableCajaChica = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoAsientoContableCajaChica.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoAsientoContableCajaChica.add(this.jLabelPathArchivoImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoAsientoContableCajaChica=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContableCajaChica.add(this.jTextFieldPathArchivoImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarImportacionEstadoAsientoContableCajaChica.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoAsientoContableCajaChica,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoAsientoContableCajaChica.setToolTipText("Generar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContableCajaChica.add(this.jButtonGenerarImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarImportacionEstadoAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoAsientoContableCajaChica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoAsientoContableCajaChica.setToolTipText("Cancelar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContableCajaChica.add(this.jButtonCerrarImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoAsientoContableCajaChica= new JScrollPane(jPanelImportacionEstadoAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoAsientoContableCajaChica);
		this.jInternalFrameImportacionEstadoAsientoContableCajaChica.getContentPane().add(this.jScrollPanelImportacionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoAsientoContableCajaChica(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica = new JButtonMe();
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.setText("Orden");
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoAsientoContableCajaChica,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoAsientoContableCajaChica";
			inputMap = this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoAsientoContableCajaChica"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoAsientoContableCajaChica = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoAsientoContableCajaChica.setName("jPanelOrderByEstadoAsientoContableCajaChica"); 
			
			this.jPanelOrderByEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutOrderByEstadoAsientoContableCajaChica);
			
			
			this.jTableDatosEstadoAsientoContableCajaChicaOrderBy = new JTableMe();        
			this.jTableDatosEstadoAsientoContableCajaChicaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoAsientoContableCajaChicaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoAsientoContableCajaChicaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoAsientoContableCajaChicaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoAsientoContableCajaChicaOrderBy.setViewportView(this.jTableDatosEstadoAsientoContableCajaChicaOrderBy);
			this.jTableDatosEstadoAsientoContableCajaChicaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoAsientoContableCajaChicaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoAsientoContableCajaChica = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoAsientoContableCajaChica= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setTitle("Orden");
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setResizable(true);
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setClosable(true);
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contable Caja Chicas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoAsientoContableCajaChica.ipady =150;
				
			this.jPanelOrderByEstadoAsientoContableCajaChica.add(jScrollPanelDatosEstadoAsientoContableCajaChicaOrderBy, this.gridBagConstraintsEstadoAsientoContableCajaChica);//this.jTableDatosEstadoAsientoContableCajaChicaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoAsientoContableCajaChica = new JButtonMe();
			this.jButtonCerrarOrderByEstadoAsientoContableCajaChica.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoAsientoContableCajaChica,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoAsientoContableCajaChica.setToolTipText("Cancelar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoAsientoContableCajaChica.add(this.jButtonCerrarOrderByEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoAsientoContableCajaChica = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoAsientoContableCajaChica= new JScrollPane(jPanelOrderByEstadoAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoAsientoContableCajaChica);
			
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getContentPane().add(this.jScrollPanelOrderByEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
		
		} else {
			this.jButtonAbrirOrderByEstadoAsientoContableCajaChica = new JButtonMe();
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
			&& this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoAsientoContableCajaChica.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoAsientoContableCajaChica.getRowHeight();//EstadoAsientoContableCajaChicaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.isSelected()) {
					iHeightTable=EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoAsientoContableCajaChica.isSelected()) {
					iHeightTable=EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoAsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoAsientoContableCajaChica!=null && this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoasientocontablecajachicaLogic.getEstadoAsientoContableCajaChicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoasientocontablecajachicas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoAsientoContableCajaChica> TraerEstadoAsientoContableCajaChicaBeans(List<EstadoAsientoContableCajaChica> estadoasientocontablecajachicas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoAsientoContableCajaChica estadoasientocontablecajachica:estadoasientocontablecajachicas) {
					
				if(!(EstadoAsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoAsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoasientocontablecajachica.setsDetalleGeneralEntityReporte(EstadoAsientoContableCajaChicaConstantesFunciones.getEstadoAsientoContableCajaChicaDescripcion(estadoasientocontablecajachica));
										
						
					
						
					
				} else  {
							
					//estadoasientocontablecajachica.setsDetalleGeneralEntityReporte(estadoasientocontablecajachica.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoasientocontablecajachicabeans.add(estadoasientocontablecajachicabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoasientocontablecajachicas;
    }
	//PARA REPORTES FIN
}
