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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.EstadoAsientoContableConstantesFunciones;

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
public class EstadoAsientoContableJInternalFrame extends EstadoAsientoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoAsientoContable;
	
	protected JMenuBar jmenuBarEstadoAsientoContable;
	
	protected JMenu jmenuEstadoAsientoContable;
	protected JMenu jmenuDatosEstadoAsientoContable;
	protected JMenu jmenuArchivoEstadoAsientoContable;
	protected JMenu jmenuAccionesEstadoAsientoContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoAsientoContable;	
	protected GridBagConstraints gridBagConstraintsEstadoAsientoContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoAsientoContableDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoAsientoContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoAsientoContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoAsientoContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorgeneral="";
	
	public EstadoAsientoContableSessionBean estadoasientocontableSessionBean;
		
	
	
	public ColorGeneralSessionBean colorgeneralSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoAsientoContable> estadoasientocontables;		
	public List<EstadoAsientoContable> estadoasientocontablesEliminados;	
	public List<EstadoAsientoContable> estadoasientocontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoAsientoContable;		
	protected JButton jButtonAbrirOrderByEstadoAsientoContable;
	
	
	//protected JPanel jPanelOrderByEstadoAsientoContable;
	//public JScrollPane jScrollPanelOrderByEstadoAsientoContable;	
	//protected JButton jButtonCerrarOrderByEstadoAsientoContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoAsientoContableLogic estadoasientocontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoAsientoContable;
	public JScrollPane jScrollPanelDatosEdicionEstadoAsientoContable;
	public JScrollPane jScrollPanelDatosGeneralEstadoAsientoContable;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoAsientoContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoAsientoContable;
	//public JScrollPane jScrollPanelImportacionEstadoAsientoContable;
	
	
	
	protected JPanel jPanelAccionesEstadoAsientoContable;
	
    protected JPanel jPanelPaginacionEstadoAsientoContable;
    protected JPanel jPanelParametrosReportesEstadoAsientoContable;
	protected JPanel jPanelParametrosReportesAccionesEstadoAsientoContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoAsientoContable;
	protected JPanel jPanelParametrosAuxiliar2EstadoAsientoContable;
	protected JPanel jPanelParametrosAuxiliar3EstadoAsientoContable;
	protected JPanel jPanelParametrosAuxiliar4EstadoAsientoContable;
	//protected JPanel jPanelParametrosAuxiliar5EstadoAsientoContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoAsientoContable;
	//protected JPanel jPanelImportacionEstadoAsientoContable;
	
	
	public JTable jTableDatosEstadoAsientoContable;
	
	
	
	//public JTable jTableDatosEstadoAsientoContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoAsientoContable;
	protected JButton jButtonDuplicarEstadoAsientoContable;
	protected JButton jButtonCopiarEstadoAsientoContable;
	protected JButton jButtonVerFormEstadoAsientoContable;
	protected JButton jButtonNuevoRelacionesEstadoAsientoContable;
	protected JButton jButtonModificarEstadoAsientoContable;
	
    protected JButton jButtonGuardarCambiosTablaEstadoAsientoContable;
	protected JButton jButtonCerrarEstadoAsientoContable;
	
	
	protected JButton jButtonRecargarInformacionEstadoAsientoContable;
	protected JButton jButtonProcesarInformacionEstadoAsientoContable;
	
	
	protected JButton jButtonAnterioresEstadoAsientoContable;
	protected JButton jButtonSiguientesEstadoAsientoContable;
	protected JButton jButtonNuevoGuardarCambiosEstadoAsientoContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoAsientoContable;
	//protected JButton jButtonCerrarReporteDinamicoEstadoAsientoContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoAsientoContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoAsientoContable;
	//protected JButton jButtonGenerarImportacionEstadoAsientoContable;
	//protected JButton jButtonCerrarImportacionEstadoAsientoContable;
	//protected JFileChooser jFileChooserImportacionEstadoAsientoContable;
	//protected File fileImportacionEstadoAsientoContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoAsientoContable;
	protected JButton jButtonDuplicarToolBarEstadoAsientoContable;
	protected JButton jButtonNuevoRelacionesToolBarEstadoAsientoContable;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoAsientoContable;
	protected JButton jButtonCopiarToolBarEstadoAsientoContable;
	protected JButton jButtonVerFormToolBarEstadoAsientoContable;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoAsientoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoAsientoContable;
	protected JButton jButtonCerrarToolBarEstadoAsientoContable;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoAsientoContable;
	protected JButton jButtonProcesarInformacionToolBarEstadoAsientoContable;
	protected JButton jButtonAnterioresToolBarEstadoAsientoContable;
	protected JButton jButtonSiguientesToolBarEstadoAsientoContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoAsientoContable;
	protected JButton jButtonAbrirOrderByToolBarEstadoAsientoContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoAsientoContable;
	protected JMenuItem jMenuItemDuplicarEstadoAsientoContable;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoAsientoContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoAsientoContable;
	protected JMenuItem jMenuItemCopiarEstadoAsientoContable;
	protected JMenuItem jMenuItemVerFormEstadoAsientoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoAsientoContable;
	protected JMenuItem jMenuItemCerrarEstadoAsientoContable;
	protected JMenuItem jMenuItemDetalleCerrarEstadoAsientoContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoAsientoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoAsientoContable;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoAsientoContable;
	protected JMenuItem jMenuItemProcesarInformacionEstadoAsientoContable;
	protected JMenuItem jMenuItemAnterioresEstadoAsientoContable;
	protected JMenuItem jMenuItemSiguientesEstadoAsientoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoAsientoContable;
	protected JMenuItem jMenuItemAbrirOrderByEstadoAsientoContable;
	protected JMenuItem jMenuItemMostrarOcultarEstadoAsientoContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoAsientoContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoAsientoContable;
	protected JCheckBox jCheckBoxSeleccionadosEstadoAsientoContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoAsientoContable;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoAsientoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoAsientoContable;
	protected JTextField jTextFieldValorCampoGeneralEstadoAsientoContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoAsientoContable;
	//public JList<Reporte> jListColumnasSelectReporteEstadoAsientoContable;
	//public JScrollPane jScrollColumnasSelectReporteEstadoAsientoContable;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoAsientoContable;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoAsientoContable;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoAsientoContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoAsientoContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoAsientoContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoAsientoContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoAsientoContable;
	
		
	//public JLabel jLabelArchivoImportacionEstadoAsientoContable;	
	//public JLabel jLabelPathArchivoImportacionEstadoAsientoContable;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoAsientoContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoAsientoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoAsientoContable;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoAsientoContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoAsientoContable;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoAsientoContable;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoAsientoContable;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoAsientoContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoAsientoContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoAsientoContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadoAsientoContable;
	public JPanel jPanelFK_IdColorGeneralEstadoAsientoContable;
	public JButton jButtonFK_IdColorGeneralEstadoAsientoContable;
	
	public JPanel jPanelid_color_generalFK_IdColorGeneralEstadoAsientoContable;
	public JLabel jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable;
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoAsientoContable= new JButtonMe();
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoAsientoContableBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoAsientoContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoAsientoContable)	{
		this.jButtonRecargarInformacionEstadoAsientoContable = jButtonRecargarInformacionEstadoAsientoContable;
	}
	
	public JButton getjButtonProcesarInformacionEstadoAsientoContable() {
		return this.jButtonProcesarInformacionEstadoAsientoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoAsientoContable)	{
		this.jButtonProcesarInformacionEstadoAsientoContable = jButtonProcesarInformacionEstadoAsientoContable;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoAsientoContable() {
		return this.jButtonRecargarInformacionEstadoAsientoContable;
	}
	
	
	public List<EstadoAsientoContable> getestadoasientocontables() {
		return this.estadoasientocontables;
	}

	public void setestadoasientocontables(List<EstadoAsientoContable> estadoasientocontables) {
		this.estadoasientocontables = estadoasientocontables;
	}
	
	public List<EstadoAsientoContable> getestadoasientocontablesAux() {
		return this.estadoasientocontablesAux;
	}

	public void setestadoasientocontablesAux(List<EstadoAsientoContable> estadoasientocontablesAux) {
		this.estadoasientocontablesAux = estadoasientocontablesAux;
	}
	
	public List<EstadoAsientoContable> getestadoasientocontablesEliminados() {
		return this.estadoasientocontablesEliminados;
	}

	public void setEstadoAsientoContablesEliminados(List<EstadoAsientoContable> estadoasientocontablesEliminados) {
		this.estadoasientocontablesEliminados = estadoasientocontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoAsientoContable() {
		return jComboBoxTiposSeleccionarEstadoAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoAsientoContable(
			JComboBox jComboBoxTiposSeleccionarEstadoAsientoContable) {
		this.jComboBoxTiposSeleccionarEstadoAsientoContable = jComboBoxTiposSeleccionarEstadoAsientoContable;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoAsientoContable() {
		return jTextFieldValorCampoGeneralEstadoAsientoContable;
	}

	public void setjTextFieldValorCampoGeneralEstadoAsientoContable(
			JTextField jTextFieldValorCampoGeneralEstadoAsientoContable) {
		this.jTextFieldValorCampoGeneralEstadoAsientoContable = jTextFieldValorCampoGeneralEstadoAsientoContable;
	}

	public void setBorderResaltarValorCampoGeneralEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoAsientoContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoAsientoContable() {
		return this.jCheckBoxSeleccionarTodosEstadoAsientoContable;
	}

	public void setjCheckBoxSeleccionarTodosEstadoAsientoContable(
			JCheckBox jCheckBoxSeleccionarTodosEstadoAsientoContable) {
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable = jCheckBoxSeleccionarTodosEstadoAsientoContable;
	}

	public void setBorderResaltarSeleccionarTodosEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoAsientoContable() {
		return this.jCheckBoxSeleccionadosEstadoAsientoContable;
	}

	public void setjCheckBoxSeleccionadosEstadoAsientoContable(
			JCheckBox jCheckBoxSeleccionadosEstadoAsientoContable) {
		this.jCheckBoxSeleccionadosEstadoAsientoContable = jCheckBoxSeleccionadosEstadoAsientoContable;
	}
	
	public void setBorderResaltarSeleccionadosEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoAsientoContable() {
		return this.jComboBoxTiposArchivosReportesEstadoAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoAsientoContable(
			JComboBox jComboBoxTiposArchivosReportesEstadoAsientoContable) {
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable = jComboBoxTiposArchivosReportesEstadoAsientoContable;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoAsientoContable() {
		return this.jComboBoxTiposReportesEstadoAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoAsientoContable(
			JComboBox jComboBoxTiposReportesEstadoAsientoContable) {
		this.jComboBoxTiposReportesEstadoAsientoContable = jComboBoxTiposReportesEstadoAsientoContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoAsientoContable() {
	//	return jComboBoxTiposReportesDinamicoEstadoAsientoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoAsientoContable(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoAsientoContable) {
	//	this.jComboBoxTiposReportesDinamicoEstadoAsientoContable = jComboBoxTiposReportesDinamicoEstadoAsientoContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable = jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable;
	//}
	
	public void setBorderResaltarTiposReportesEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoAsientoContable() {
		return this.jComboBoxTiposGraficosReportesEstadoAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoAsientoContable(
			JComboBox jComboBoxTiposGraficosReportesEstadoAsientoContable) {
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable = jComboBoxTiposGraficosReportesEstadoAsientoContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoAsientoContable() {
		return this.jComboBoxTiposPaginacionEstadoAsientoContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoAsientoContable(
			JComboBox jComboBoxTiposPaginacionEstadoAsientoContable) {
		this.jComboBoxTiposPaginacionEstadoAsientoContable = jComboBoxTiposPaginacionEstadoAsientoContable;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoAsientoContable() {
		return this.jComboBoxTiposRelacionesEstadoAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoAsientoContable() {
		return this.jComboBoxTiposAccionesEstadoAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoAsientoContable(
			JComboBox jComboBoxTiposRelacionesEstadoAsientoContable) {
		this.jComboBoxTiposRelacionesEstadoAsientoContable = jComboBoxTiposRelacionesEstadoAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoAsientoContable(
			JComboBox jComboBoxTiposAccionesEstadoAsientoContable) {
		this.jComboBoxTiposAccionesEstadoAsientoContable = jComboBoxTiposAccionesEstadoAsientoContable;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoAsientoContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoAsientoContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoAsientoContable() {
	//	return jCheckBoxConGraficoDinamicoEstadoAsientoContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoAsientoContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoAsientoContable) {
	//	this.jCheckBoxConGraficoDinamicoEstadoAsientoContable = jCheckBoxConGraficoDinamicoEstadoAsientoContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoAsientoContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoAsientoContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoAsientoContable .setBorder(borderResaltar);		
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
		this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
		
		this.estadoasientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoasientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoasientocontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoAsientoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoAsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoAsientoContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"nuevo","nuevo","Nuevo"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"duplicar","duplicar","Duplicar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"copiar","copiar","Copiar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"ver_form","ver_form","Ver"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"recargar","recargar","Recargar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,
							"cerrar","cerrar","Salir"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoAsientoContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoAsientoContable;
			
				this.jButtonProcesarInformacionToolBarEstadoAsientoContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoAsientoContable;
				
		//protected JButton jButtonModificarToolBarEstadoAsientoContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoAsientoContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoAsientoContable=new JMenuMe("General");
		this.jmenuArchivoEstadoAsientoContable=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoAsientoContable=new JMenuMe("Acciones");
		this.jmenuDatosEstadoAsientoContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoAsientoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoAsientoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoAsientoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoAsientoContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoAsientoContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoAsientoContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoAsientoContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoAsientoContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoAsientoContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoAsientoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoAsientoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoAsientoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoAsientoContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoAsientoContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoAsientoContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoAsientoContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoAsientoContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoAsientoContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoAsientoContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoAsientoContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoAsientoContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoAsientoContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoAsientoContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoAsientoContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoAsientoContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoAsientoContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoAsientoContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoAsientoContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoAsientoContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoAsientoContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoAsientoContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoAsientoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoAsientoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoAsientoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoAsientoContable.add(this.jMenuItemCerrarEstadoAsientoContable);
			
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemNuevoEstadoAsientoContable);
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable);
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemNuevoRelacionesEstadoAsientoContable);
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemGuardarCambiosTablaEstadoAsientoContable);		
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemDuplicarEstadoAsientoContable);		
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemCopiarEstadoAsientoContable);		
			this.jmenuAccionesEstadoAsientoContable.add(this.jMenuItemVerFormEstadoAsientoContable);		
			
			this.jmenuDatosEstadoAsientoContable.add(this.jMenuItemRecargarInformacionEstadoAsientoContable);				
			this.jmenuDatosEstadoAsientoContable.add(this.jMenuItemAnterioresEstadoAsientoContable);				
			this.jmenuDatosEstadoAsientoContable.add(this.jMenuItemSiguientesEstadoAsientoContable);				
			this.jmenuDatosEstadoAsientoContable.add(this.jMenuItemAbrirOrderByEstadoAsientoContable);				
			this.jmenuDatosEstadoAsientoContable.add(this.jMenuItemMostrarOcultarEstadoAsientoContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoAsientoContable.add(this.jMenuItemGuardarCambiosEstadoAsientoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoAsientoContable.add(this.jmenuArchivoEstadoAsientoContable);		
			this.jmenuBarEstadoAsientoContable.add(this.jmenuAccionesEstadoAsientoContable);		
			this.jmenuBarEstadoAsientoContable.add(this.jmenuDatosEstadoAsientoContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoAsientoContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoAsientoContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdColorGeneralEstadoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdColorGeneralEstadoAsientoContable.setToolTipText("Buscar Por Color General ");
		this.jButtonFK_IdColorGeneralEstadoAsientoContable= new JButtonMe();
		this.jButtonFK_IdColorGeneralEstadoAsientoContable.setText("Buscar");
		this.jButtonFK_IdColorGeneralEstadoAsientoContable.setToolTipText("Buscar Por Color General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdColorGeneralEstadoAsientoContable,"buscar_button","Buscar Por Color General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdColorGeneralEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable = new JLabelMe();
		jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable.setText("Color General :");
		jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable.setToolTipText("Color General");
		jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable= new JComboBoxMe();
		jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstadoAsientoContable=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadoAsientoContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoAsientoContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoAsientoContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadoAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadoAsientoContable = new EstadoAsientoContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Asiento Contable DATOS");
			this.jInternalFrameDetalleFormEstadoAsientoContable = new EstadoAsientoContableDetalleFormJInternalFrame(jDesktopPane,this.estadoasientocontableSessionBean.getConGuardarRelaciones(),this.estadoasientocontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoAsientoContable = null;//new EstadoAsientoContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoAsientoContable= new GridBagLayout();
		
		
		this.jTableDatosEstadoAsientoContable = new JTableMe();      
		
		String sToolTipEstadoAsientoContable="";
		sToolTipEstadoAsientoContable=EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoAsientoContable+="(Contabilidad.EstadoAsientoContable)";
		}
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoAsientoContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoAsientoContable.setToolTipText(sToolTipEstadoAsientoContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoAsientoContable);
		this.jTableDatosEstadoAsientoContable.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoAsientoContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoAsientoContable.setRowSelectionAllowed(true);
		this.jTableDatosEstadoAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoAsientoContable = new JButtonMe();
		this.jButtonDuplicarEstadoAsientoContable = new JButtonMe();
		this.jButtonCopiarEstadoAsientoContable = new JButtonMe();
		this.jButtonVerFormEstadoAsientoContable = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoAsientoContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable = new JButtonMe();
		this.jButtonCerrarEstadoAsientoContable = new JButtonMe();
		
		this.jScrollPanelDatosEstadoAsientoContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoAsientoContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Asiento Contable";
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesEstadoAsientoContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoAsientoContable=new ReporteDinamicoJInternalFrame(EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoAsientoContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoAsientoContable=new ImportacionJInternalFrame(EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoAsientoContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoAsientoContable = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoAsientoContable.setText("Orden");
		this.jButtonAbrirOrderByEstadoAsientoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoAsientoContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContable,false,this);
			
			//this.cargarOrderByEstadoAsientoContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContable,true,this);
			
			//this.cargarOrderByEstadoAsientoContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoAsientoContable.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoAsientoContable.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoAsientoContable.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoAsientoContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoAsientoContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoAsientoContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoAsientoContable.setText("Nuevo");
		this.jButtonDuplicarEstadoAsientoContable.setText("Duplicar");
		this.jButtonCopiarEstadoAsientoContable.setText("Copiar");
		this.jButtonVerFormEstadoAsientoContable.setText("Ver");
		this.jButtonNuevoRelacionesEstadoAsientoContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.setText("Guardar");
		this.jButtonCerrarEstadoAsientoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoAsientoContable,"nuevo_button","Nuevo",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoAsientoContable,"duplicar_button","Duplicar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoAsientoContable,"copiar_button","Copiar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoAsientoContable,"ver_form","Ver",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoAsientoContable,"nuevorelaciones_button","Nuevo Rel",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoAsientoContable,"guardarcambiostabla_button","Guardar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoAsientoContable,"cerrar_button","Salir",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoAsientoContable.setToolTipText("Nuevo"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoAsientoContable.setToolTipText("Duplicar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoAsientoContable.setToolTipText("Copiar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoAsientoContable.setToolTipText("Ver"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoAsientoContable.setToolTipText("Nuevo Rel"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.setToolTipText("Guardar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoAsientoContable.setToolTipText("Salir"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoAsientoContable";
		inputMap = this.jButtonNuevoEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoAsientoContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoAsientoContable";
		inputMap = this.jButtonDuplicarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoAsientoContable"));
		
		//COPIAR
		sMapKey = "CopiarEstadoAsientoContable";
		inputMap = this.jButtonCopiarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoAsientoContable"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoAsientoContable";
		inputMap = this.jButtonVerFormEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoAsientoContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoAsientoContable";
		inputMap = this.jButtonNuevoRelacionesEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoAsientoContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoAsientoContable";
		inputMap = this.jButtonModificarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoAsientoContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoAsientoContable";
		inputMap = this.jButtonCerrarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoAsientoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoAsientoContable";
		inputMap = this.jButtonGuardarCambiosTablaEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoAsientoContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoAsientoContable.setName("jPanelParametrosReportesEstadoAsientoContable"); 
		
		this.jPanelParametrosReportesAccionesEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoAsientoContable.setName("jPanelParametrosReportesAccionesEstadoAsientoContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoAsientoContable = new JButtonMe();
		this.jButtonRecargarInformacionEstadoAsientoContable.setText("Recargar");
		this.jButtonRecargarInformacionEstadoAsientoContable.setToolTipText("Recargar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoAsientoContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoAsientoContable = new JButtonMe();
		this.jButtonProcesarInformacionEstadoAsientoContable.setText("Procesar");
		this.jButtonProcesarInformacionEstadoAsientoContable.setToolTipText("Procesar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoAsientoContable.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoAsientoContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoAsientoContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoAsientoContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoAsientoContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoAsientoContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoAsientoContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoAsientoContable.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoAsientoContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoAsientoContable.setText("Accion");
		this.jComboBoxTiposAccionesEstadoAsientoContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoAsientoContable.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoAsientoContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoAsientoContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoAsientoContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoAsientoContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoAsientoContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoAsientoContable = new JLabelMe();
		
		this.jLabelAccionesEstadoAsientoContable.setText("Acciones");		
		this.jLabelAccionesEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoAsientoContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoAsientoContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoAsientoContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoAsientoContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoAsientoContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoAsientoContable = new JButtonMe();
		//this.jButtonAnterioresEstadoAsientoContable.setText("<<");
        this.jButtonAnterioresEstadoAsientoContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoAsientoContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoAsientoContable = new JButtonMe();
		//this.jButtonSiguientesEstadoAsientoContable.setText(">>");
        this.jButtonSiguientesEstadoAsientoContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoAsientoContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoAsientoContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoAsientoContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoAsientoContable,"nuevoguardarcambios_button","Nue",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoAsientoContable";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoAsientoContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoAsientoContable";
		inputMap = this.jButtonRecargarInformacionEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoAsientoContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoAsientoContable";
		inputMap = this.jButtonSiguientesEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoAsientoContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoAsientoContable";
		inputMap = this.jButtonAnterioresEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoAsientoContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoAsientoContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoAsientoContable.setMinimumSize(new Dimension(this.getWidth(),EstadoAsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoAsientoContable.setMaximumSize(new Dimension(this.getWidth(),EstadoAsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoAsientoContable.setPreferredSize(new Dimension(this.getWidth(),EstadoAsientoContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAsientoContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoAsientoContable = new GridBagLayout();

			this.jPanelPaginacionEstadoAsientoContable.setLayout(gridaBagLayoutPaginacionEstadoAsientoContable);						
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonAnterioresEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
					
						
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
			
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonNuevoGuardarCambiosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
						
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonSiguientesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonNuevoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
				this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonNuevoRelacionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			}
			
			
			if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
				this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonGuardarCambiosTablaEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			}
			
			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonDuplicarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonCopiarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonVerFormEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 1;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoAsientoContable.add(this.jButtonCerrarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
		
		
		this.jButtonRecargarInformacionEstadoAsientoContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoAsientoContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoAsientoContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoAsientoContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoAsientoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoAsientoContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoAsientoContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoAsientoContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoAsientoContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoAsientoContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoAsientoContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoAsientoContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoAsientoContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoAsientoContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoAsientoContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoAsientoContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoAsientoContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoAsientoContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoAsientoContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoAsientoContable.setLayout(gridaBagParametrosReportesEstadoAsientoContable);
			this.jPanelParametrosReportesAccionesEstadoAsientoContable.setLayout(gridaBagParametrosReportesAccionesEstadoAsientoContable);
			
			
			this.jPanelParametrosAuxiliar1EstadoAsientoContable.setLayout(gridaBagParametrosAuxiliar1EstadoAsientoContable);
			this.jPanelParametrosAuxiliar2EstadoAsientoContable.setLayout(gridaBagParametrosAuxiliar2EstadoAsientoContable);
			this.jPanelParametrosAuxiliar3EstadoAsientoContable.setLayout(gridaBagParametrosAuxiliar3EstadoAsientoContable);
			this.jPanelParametrosAuxiliar4EstadoAsientoContable.setLayout(gridaBagParametrosAuxiliar4EstadoAsientoContable);
			//this.jPanelParametrosAuxiliar5EstadoAsientoContable.setLayout(gridaBagParametrosAuxiliar2EstadoAsientoContable);			
			
			
			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jButtonRecargarInformacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAsientoContable.add(this.jComboBoxTiposPaginacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAsientoContable.add(this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAsientoContable.add(this.jComboBoxTiposArchivosReportesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jPanelParametrosAuxiliar1EstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoAsientoContable.add(this.jComboBoxTiposReportesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jPanelParametrosAuxiliar4EstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jComboBoxTiposReportesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jCheckBoxGenerarReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jPanelParametrosAuxiliar2EstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jLabelAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoAsientoContable.add(this.jButtonAbrirOrderByEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jComboBoxTiposSeleccionarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
			
			
			/*
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jCheckBoxSeleccionarTodosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoAsientoContable.add(this.jCheckBoxSeleccionarTodosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);															
				
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoAsientoContable.add(this.jCheckBoxSeleccionadosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jPanelParametrosAuxiliar3EstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jComboBoxTiposRelacionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
				
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAsientoContable.add(this.jComboBoxTiposAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoAsientoContable = new GridBagLayout();

			this.jScrollPanelDatosEstadoAsientoContable.setLayout(gridaBagLayoutDatosEstadoAsientoContable);
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
			
			this.jScrollPanelDatosEstadoAsientoContable.add(this.jTableDatosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoAsientoContable.setViewportView(this.jTableDatosEstadoAsientoContable);
		this.jTableDatosEstadoAsientoContable.setFillsViewportHeight(true);
		this.jTableDatosEstadoAsientoContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoAsientoContable= new GridBagLayout();
		this.jPanelAccionesEstadoAsientoContable.setLayout(gridaBagLayoutAccionesEstadoAsientoContable);
		
		
		/*	
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
			
		this.jPanelAccionesEstadoAsientoContable.add(this.jButtonNuevoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdColorGeneralEstadoAsientoContable= new GridBagLayout();
		gridaBagLayoutFK_IdColorGeneralEstadoAsientoContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdColorGeneralEstadoAsientoContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdColorGeneralEstadoAsientoContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdColorGeneralEstadoAsientoContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdColorGeneralEstadoAsientoContable.setLayout(gridaBagLayoutFK_IdColorGeneralEstadoAsientoContable);

		gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoAsientoContable.gridy = 0;
		gridBagConstraintsEstadoAsientoContable.gridx = 0;
		jPanelFK_IdColorGeneralEstadoAsientoContable.add(jLabelid_color_generalFK_IdColorGeneralEstadoAsientoContable, gridBagConstraintsEstadoAsientoContable);

		gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoAsientoContable.gridy = 0;
		gridBagConstraintsEstadoAsientoContable.gridx = 1;
		jPanelFK_IdColorGeneralEstadoAsientoContable.add(jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable, gridBagConstraintsEstadoAsientoContable);

		gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoAsientoContable.gridy = 1;
		gridBagConstraintsEstadoAsientoContable.gridx =1;
		jPanelFK_IdColorGeneralEstadoAsientoContable.add(jButtonFK_IdColorGeneralEstadoAsientoContable, gridBagConstraintsEstadoAsientoContable);

		jTabbedPaneBusquedasEstadoAsientoContable.addTab("1.-Por Color General ", jPanelFK_IdColorGeneralEstadoAsientoContable);
		jTabbedPaneBusquedasEstadoAsientoContable.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoAsientoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoAsientoContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();						
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;		
			//this.gridBagConstraintsEstadoAsientoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoAsientoContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;		
		//this.gridBagConstraintsEstadoAsientoContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoAsientoContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoAsientoContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;		
			this.gridBagConstraintsEstadoAsientoContable.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadoAsientoContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);								
		
		
		/*
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		*/		
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoAsientoContable.gridx =0;
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoAsientoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
				
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoAsientoContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoAsientoContable = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoAsientoContable.setLayout(gridaBagLayoutBusquedasParametrosEstadoAsientoContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoAsientoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
			
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
			
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoAsientoContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoAsientoContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoAsientoContable.setName("jPanelReporteDinamicoEstadoAsientoContable"); 
		
		this.jPanelReporteDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoAsientoContable.setLayout(gridaBagLayoutReporteDinamicoEstadoAsientoContable);
		
		
		this.jInternalFrameReporteDinamicoEstadoAsientoContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoAsientoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoAsientoContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoAsientoContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoAsientoContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoAsientoContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoAsientoContable = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoAsientoContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jLabelColumnasSelectReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoAsientoContable = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoAsientoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoAsientoContable=new JScrollPane(this.jListColumnasSelectReporteEstadoAsientoContable);
			
			this.jScrollColumnasSelectReporteEstadoAsientoContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoAsientoContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoAsientoContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jListColumnasSelectReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jScrollColumnasSelectReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoAsientoContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoAsientoContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jLabelRelacionesSelectReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoAsientoContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoAsientoContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoAsientoContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoAsientoContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoAsientoContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoAsientoContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoAsientoContable=new JScrollPane(this.jListRelacionesSelectReporteEstadoAsientoContable);
			
			this.jScrollRelacionesSelectReporteEstadoAsientoContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoAsientoContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoAsientoContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jListRelacionesSelectReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jScrollRelacionesSelectReporteEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoAsientoContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoAsientoContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoAsientoContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jLabelGenerarExcelReporteDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable.setToolTipText("Generar EXCEL"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jComboBoxTiposReportesDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jLabelTiposArchivoReporteDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoAsientoContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoAsientoContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoAsientoContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoAsientoContable.setToolTipText("Generar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jButtonGenerarReporteDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoAsientoContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoAsientoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoAsientoContable.setToolTipText("Cancelar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAsientoContable.add(this.jButtonCerrarReporteDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoAsientoContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoAsientoContable= new JScrollPane(jPanelReporteDinamicoEstadoAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoAsientoContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoAsientoContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoAsientoContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoAsientoContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoAsientoContable);
		this.jInternalFrameReporteDinamicoEstadoAsientoContable.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoAsientoContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoAsientoContable.setName("jPanelImportacionEstadoAsientoContable"); 
		
		this.jPanelImportacionEstadoAsientoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoAsientoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoAsientoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoAsientoContable.setLayout(gridaBagLayoutImportacionEstadoAsientoContable);
		
		
		this.jInternalFrameImportacionEstadoAsientoContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoAsientoContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoAsientoContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoAsientoContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoAsientoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoAsientoContable.setResizable(true);
	    this.jInternalFrameImportacionEstadoAsientoContable.setClosable(true);
	    this.jInternalFrameImportacionEstadoAsientoContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoAsientoContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoAsientoContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoAsientoContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoAsientoContable.setResizable(true);
	    this.jInternalFrameImportacionEstadoAsientoContable.setClosable(true);
	    this.jInternalFrameImportacionEstadoAsientoContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoAsientoContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoAsientoContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoAsientoContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoAsientoContable = new JLabelMe();

		this.jLabelArchivoImportacionEstadoAsientoContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoAsientoContable.add(this.jLabelArchivoImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoAsientoContable = new JFileChooser();		
		this.jFileChooserImportacionEstadoAsientoContable.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoAsientoContable = new JButtonMe();
		this.jButtonAbrirImportacionEstadoAsientoContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoAsientoContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoAsientoContable.setToolTipText("Generar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContable.add(this.jButtonAbrirImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoAsientoContable = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoAsientoContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoAsientoContable.add(this.jLabelPathArchivoImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoAsientoContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoAsientoContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoAsientoContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoAsientoContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContable.add(this.jTextFieldPathArchivoImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoAsientoContable = new JButtonMe();
		this.jButtonGenerarImportacionEstadoAsientoContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoAsientoContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoAsientoContable.setToolTipText("Generar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContable.add(this.jButtonGenerarImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoAsientoContable = new JButtonMe();
		this.jButtonCerrarImportacionEstadoAsientoContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoAsientoContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoAsientoContable.setToolTipText("Cancelar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAsientoContable.add(this.jButtonCerrarImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoAsientoContable = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoAsientoContable= new JScrollPane(jPanelImportacionEstadoAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoAsientoContable.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoAsientoContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoAsientoContable);
		this.jInternalFrameImportacionEstadoAsientoContable.getContentPane().add(this.jScrollPanelImportacionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoAsientoContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoAsientoContable = new JButtonMe();
			this.jButtonAbrirOrderByEstadoAsientoContable.setText("Orden");
			this.jButtonAbrirOrderByEstadoAsientoContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoAsientoContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoAsientoContable";
			inputMap = this.jButtonAbrirOrderByEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoAsientoContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoAsientoContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoAsientoContable.setName("jPanelOrderByEstadoAsientoContable"); 
			
			this.jPanelOrderByEstadoAsientoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoAsientoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoAsientoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoAsientoContable.setLayout(gridaBagLayoutOrderByEstadoAsientoContable);
			
			
			this.jTableDatosEstadoAsientoContableOrderBy = new JTableMe();        
			this.jTableDatosEstadoAsientoContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoAsientoContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoAsientoContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoAsientoContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoAsientoContableOrderBy.setViewportView(this.jTableDatosEstadoAsientoContableOrderBy);
			this.jTableDatosEstadoAsientoContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoAsientoContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoAsientoContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoAsientoContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoAsientoContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoAsientoContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoAsientoContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoAsientoContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoAsientoContable.setTitle("Orden");
			this.jInternalFrameOrderByEstadoAsientoContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoAsientoContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoAsientoContable.setResizable(true);
			this.jInternalFrameOrderByEstadoAsientoContable.setClosable(true);
			this.jInternalFrameOrderByEstadoAsientoContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoAsientoContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoAsientoContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoAsientoContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoAsientoContable.ipady =150;
				
			this.jPanelOrderByEstadoAsientoContable.add(jScrollPanelDatosEstadoAsientoContableOrderBy, this.gridBagConstraintsEstadoAsientoContable);//this.jTableDatosEstadoAsientoContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoAsientoContable = new JButtonMe();
			this.jButtonCerrarOrderByEstadoAsientoContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoAsientoContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoAsientoContable.setToolTipText("Cancelar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoAsientoContable.add(this.jButtonCerrarOrderByEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoAsientoContable = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoAsientoContable= new JScrollPane(jPanelOrderByEstadoAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoAsientoContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoAsientoContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoAsientoContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoAsientoContable);
			
			this.jInternalFrameOrderByEstadoAsientoContable.getContentPane().add(this.jScrollPanelOrderByEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
		
		} else {
			this.jButtonAbrirOrderByEstadoAsientoContable = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoasientocontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoAsientoContable.getRowHeight();//EstadoAsientoContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.isSelected()) {
					iHeightTable=EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoAsientoContable.isSelected()) {
					iHeightTable=EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoAsientoContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoAsientoContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoAsientoContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoAsientoContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoAsientoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoAsientoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoAsientoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoAsientoContable!=null && this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoAsientoContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoAsientoContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoAsientoContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoAsientoContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoAsientoContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoAsientoContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoasientocontableLogic.getEstadoAsientoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoasientocontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoAsientoContable> TraerEstadoAsientoContableBeans(List<EstadoAsientoContable> estadoasientocontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoAsientoContable estadoasientocontable:estadoasientocontables) {
					
				if(!(EstadoAsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoAsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoasientocontable.setsDetalleGeneralEntityReporte(EstadoAsientoContableConstantesFunciones.getEstadoAsientoContableDescripcion(estadoasientocontable));
										
						
					
					

					if(estadoasientocontable.getParametroContabilidadDefectos()!=null && Funciones.existeClass(classes,ParametroContabilidadDefecto.class)) {
						try{estadoasientocontable.setparametrocontabilidaddefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroContabilidadDefectoJInternalFrame.TraerParametroContabilidadDefectoBeans(estadoasientocontable.getParametroContabilidadDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoasientocontable.setsDetalleGeneralEntityReporte(estadoasientocontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoasientocontablebeans.add(estadoasientocontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoasientocontables;
    }
	//PARA REPORTES FIN
}
