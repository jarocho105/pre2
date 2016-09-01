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
import com.bydan.erp.inventario.util.EstadoDetalleMovimientoInventarioConstantesFunciones;

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
public class EstadoDetalleMovimientoInventarioJInternalFrame extends EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarEstadoDetalleMovimientoInventario;
	
	protected JMenu jmenuEstadoDetalleMovimientoInventario;
	protected JMenu jmenuDatosEstadoDetalleMovimientoInventario;
	protected JMenu jmenuArchivoEstadoDetalleMovimientoInventario;
	protected JMenu jmenuAccionesEstadoDetalleMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleMovimientoInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetalleMovimientoInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetalleMovimientoInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios;		
	public List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosEliminados;	
	public List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetalleMovimientoInventario;		
	protected JButton jButtonAbrirOrderByEstadoDetalleMovimientoInventario;
	
	
	//protected JPanel jPanelOrderByEstadoDetalleMovimientoInventario;
	//public JScrollPane jScrollPanelOrderByEstadoDetalleMovimientoInventario;	
	//protected JButton jButtonCerrarOrderByEstadoDetalleMovimientoInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetalleMovimientoInventarioLogic estadodetallemovimientoinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetalleMovimientoInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario;
	//public JScrollPane jScrollPanelImportacionEstadoDetalleMovimientoInventario;
	
	
	
	protected JPanel jPanelAccionesEstadoDetalleMovimientoInventario;
	
    protected JPanel jPanelPaginacionEstadoDetalleMovimientoInventario;
    protected JPanel jPanelParametrosReportesEstadoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetalleMovimientoInventario;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetalleMovimientoInventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetalleMovimientoInventario;
	//protected JPanel jPanelImportacionEstadoDetalleMovimientoInventario;
	
	
	public JTable jTableDatosEstadoDetalleMovimientoInventario;
	
	
	
	//public JTable jTableDatosEstadoDetalleMovimientoInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetalleMovimientoInventario;
	protected JButton jButtonDuplicarEstadoDetalleMovimientoInventario;
	protected JButton jButtonCopiarEstadoDetalleMovimientoInventario;
	protected JButton jButtonVerFormEstadoDetalleMovimientoInventario;
	protected JButton jButtonNuevoRelacionesEstadoDetalleMovimientoInventario;
	protected JButton jButtonModificarEstadoDetalleMovimientoInventario;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario;
	protected JButton jButtonCerrarEstadoDetalleMovimientoInventario;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetalleMovimientoInventario;
	protected JButton jButtonProcesarInformacionEstadoDetalleMovimientoInventario;
	
	
	protected JButton jButtonAnterioresEstadoDetalleMovimientoInventario;
	protected JButton jButtonSiguientesEstadoDetalleMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetalleMovimientoInventario;
	//protected JButton jButtonGenerarImportacionEstadoDetalleMovimientoInventario;
	//protected JButton jButtonCerrarImportacionEstadoDetalleMovimientoInventario;
	//protected JFileChooser jFileChooserImportacionEstadoDetalleMovimientoInventario;
	//protected File fileImportacionEstadoDetalleMovimientoInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonDuplicarToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonCopiarToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonVerFormToolBarEstadoDetalleMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonCerrarToolBarEstadoDetalleMovimientoInventario;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonAnterioresToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonSiguientesToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetalleMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDuplicarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCopiarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemVerFormEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCerrarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemAnterioresEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemSiguientesEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleMovimientoInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetalleMovimientoInventario;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetalleMovimientoInventario;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetalleMovimientoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetalleMovimientoInventario;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetalleMovimientoInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetalleMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetalleMovimientoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetalleMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetalleMovimientoInventario;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetalleMovimientoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetalleMovimientoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetalleMovimientoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetalleMovimientoInventario;	
	
	
	
	
	
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
	public EstadoDetalleMovimientoInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleMovimientoInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetalleMovimientoInventario)	{
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario = jButtonRecargarInformacionEstadoDetalleMovimientoInventario;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetalleMovimientoInventario() {
		return this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleMovimientoInventario)	{
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario = jButtonProcesarInformacionEstadoDetalleMovimientoInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetalleMovimientoInventario() {
		return this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario;
	}
	
	
	public List<EstadoDetalleMovimientoInventario> getestadodetallemovimientoinventarios() {
		return this.estadodetallemovimientoinventarios;
	}

	public void setestadodetallemovimientoinventarios(List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios) {
		this.estadodetallemovimientoinventarios = estadodetallemovimientoinventarios;
	}
	
	public List<EstadoDetalleMovimientoInventario> getestadodetallemovimientoinventariosAux() {
		return this.estadodetallemovimientoinventariosAux;
	}

	public void setestadodetallemovimientoinventariosAux(List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosAux) {
		this.estadodetallemovimientoinventariosAux = estadodetallemovimientoinventariosAux;
	}
	
	public List<EstadoDetalleMovimientoInventario> getestadodetallemovimientoinventariosEliminados() {
		return this.estadodetallemovimientoinventariosEliminados;
	}

	public void setEstadoDetalleMovimientoInventariosEliminados(List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosEliminados) {
		this.estadodetallemovimientoinventariosEliminados = estadodetallemovimientoinventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario() {
		return jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario = jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario() {
		return jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario(
			JTextField jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario) {
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario = jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario() {
		return this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario) {
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario = jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetalleMovimientoInventario() {
		return this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario;
	}

	public void setjCheckBoxSeleccionadosEstadoDetalleMovimientoInventario(
			JCheckBox jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario) {
		this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario = jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario = jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposReportesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario = jComboBoxTiposReportesEstadoDetalleMovimientoInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario = jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario = jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario = jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario = jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario = jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesEstadoDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario = jComboBoxTiposAccionesEstadoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario = jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetalleMovimientoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetalleMovimientoInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario .setBorder(borderResaltar);		
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
		this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
		
		this.estadodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetalleMovimientoInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"copiar","copiar","Copiar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"ver_form","ver_form","Ver"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"recargar","recargar","Recargar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,
							"cerrar","cerrar","Salir"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario;
			
				this.jButtonProcesarInformacionToolBarEstadoDetalleMovimientoInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetalleMovimientoInventario;
				
		//protected JButton jButtonModificarToolBarEstadoDetalleMovimientoInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetalleMovimientoInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetalleMovimientoInventario=new JMenuMe("General");
		this.jmenuArchivoEstadoDetalleMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetalleMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetalleMovimientoInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetalleMovimientoInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetalleMovimientoInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetalleMovimientoInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetalleMovimientoInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetalleMovimientoInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetalleMovimientoInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetalleMovimientoInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetalleMovimientoInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetalleMovimientoInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetalleMovimientoInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetalleMovimientoInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetalleMovimientoInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetalleMovimientoInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetalleMovimientoInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetalleMovimientoInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetalleMovimientoInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetalleMovimientoInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetalleMovimientoInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetalleMovimientoInventario.add(this.jMenuItemCerrarEstadoDetalleMovimientoInventario);
			
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemNuevoEstadoDetalleMovimientoInventario);
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario);
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario);
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario);		
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemDuplicarEstadoDetalleMovimientoInventario);		
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemCopiarEstadoDetalleMovimientoInventario);		
			this.jmenuAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemVerFormEstadoDetalleMovimientoInventario);		
			
			this.jmenuDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario);				
			this.jmenuDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemAnterioresEstadoDetalleMovimientoInventario);				
			this.jmenuDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemSiguientesEstadoDetalleMovimientoInventario);				
			this.jmenuDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario);				
			this.jmenuDatosEstadoDetalleMovimientoInventario.add(this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetalleMovimientoInventario.add(this.jmenuArchivoEstadoDetalleMovimientoInventario);		
			this.jmenuBarEstadoDetalleMovimientoInventario.add(this.jmenuAccionesEstadoDetalleMovimientoInventario);		
			this.jmenuBarEstadoDetalleMovimientoInventario.add(this.jmenuDatosEstadoDetalleMovimientoInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetalleMovimientoInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetalleMovimientoInventario() {
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
			//this.jInternalFrameDetalleEstadoDetalleMovimientoInventario = new EstadoDetalleMovimientoInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Movimiento Inventario DATOS");
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario = new EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario = null;//new EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleMovimientoInventario= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetalleMovimientoInventario = new JTableMe();      
		
		String sToolTipEstadoDetalleMovimientoInventario="";
		sToolTipEstadoDetalleMovimientoInventario=EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleMovimientoInventario+="(Inventario.EstadoDetalleMovimientoInventario)";
		}
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleMovimientoInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetalleMovimientoInventario.setToolTipText(sToolTipEstadoDetalleMovimientoInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetalleMovimientoInventario);
		this.jTableDatosEstadoDetalleMovimientoInventario.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetalleMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetalleMovimientoInventario.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonDuplicarEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCopiarEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonVerFormEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarEstadoDetalleMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Movimiento Inventario";
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleMovimientoInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario=new ReporteDinamicoJInternalFrame(EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetalleMovimientoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetalleMovimientoInventario=new ImportacionJInternalFrame(EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetalleMovimientoInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario,false,this);
			
			//this.cargarOrderByEstadoDetalleMovimientoInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario,true,this);
			
			//this.cargarOrderByEstadoDetalleMovimientoInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetalleMovimientoInventario.setText("Nuevo");
		this.jButtonDuplicarEstadoDetalleMovimientoInventario.setText("Duplicar");
		this.jButtonCopiarEstadoDetalleMovimientoInventario.setText("Copiar");
		this.jButtonVerFormEstadoDetalleMovimientoInventario.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.setText("Guardar");
		this.jButtonCerrarEstadoDetalleMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleMovimientoInventario,"nuevo_button","Nuevo",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetalleMovimientoInventario,"duplicar_button","Duplicar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetalleMovimientoInventario,"copiar_button","Copiar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetalleMovimientoInventario,"ver_form","Ver",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario,"nuevorelaciones_button","Nuevo Rel",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleMovimientoInventario,"cerrar_button","Salir",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetalleMovimientoInventario.setToolTipText("Nuevo"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetalleMovimientoInventario.setToolTipText("Duplicar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetalleMovimientoInventario.setToolTipText("Copiar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetalleMovimientoInventario.setToolTipText("Ver"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.setToolTipText("Nuevo Rel"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.setToolTipText("Guardar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleMovimientoInventario.setToolTipText("Salir"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleMovimientoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonDuplicarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetalleMovimientoInventario"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonCopiarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetalleMovimientoInventario"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonVerFormEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetalleMovimientoInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetalleMovimientoInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonModificarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetalleMovimientoInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleMovimientoInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setName("jPanelParametrosReportesEstadoDetalleMovimientoInventario"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario.setName("jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.setToolTipText("Recargar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario.setToolTipText("Procesar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetalleMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetalleMovimientoInventario = new JButtonMe();
		//this.jButtonAnterioresEstadoDetalleMovimientoInventario.setText("<<");
        this.jButtonAnterioresEstadoDetalleMovimientoInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetalleMovimientoInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetalleMovimientoInventario = new JButtonMe();
		//this.jButtonSiguientesEstadoDetalleMovimientoInventario.setText(">>");
        this.jButtonSiguientesEstadoDetalleMovimientoInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetalleMovimientoInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario,"nuevoguardarcambios_button","Nue",this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetalleMovimientoInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetalleMovimientoInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonSiguientesEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetalleMovimientoInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonAnterioresEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetalleMovimientoInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetalleMovimientoInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),EstadoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),EstadoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),EstadoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetalleMovimientoInventario = new GridBagLayout();

			this.jPanelPaginacionEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutPaginacionEstadoDetalleMovimientoInventario);						
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonAnterioresEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
					
						
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
			
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
						
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonSiguientesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonNuevoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			}
			
			
			if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			}
			
			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonDuplicarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonCopiarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonVerFormEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.add(this.jButtonCerrarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetalleMovimientoInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetalleMovimientoInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosReportesEstadoDetalleMovimientoInventario);
			this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosReportesAccionesEstadoDetalleMovimientoInventario);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar1EstadoDetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar2EstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar3EstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar3EstadoDetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar4EstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar4EstadoDetalleMovimientoInventario);
			//this.jPanelParametrosAuxiliar5EstadoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleMovimientoInventario);			
			
			
			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario.add(this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario.add(this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario.add(this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar1EstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar4EstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jCheckBoxGenerarReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar2EstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jLabelAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
			
			
			/*
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleMovimientoInventario.add(this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);															
				
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleMovimientoInventario.add(this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar3EstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
				
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
	
				
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.add(this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetalleMovimientoInventario = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutDatosEstadoDetalleMovimientoInventario);
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetalleMovimientoInventario.add(this.jTableDatosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setViewportView(this.jTableDatosEstadoDetalleMovimientoInventario);
		this.jTableDatosEstadoDetalleMovimientoInventario.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetalleMovimientoInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesEstadoDetalleMovimientoInventario);
		
		
		/*	
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
			
		this.jPanelAccionesEstadoDetalleMovimientoInventario.add(this.jButtonNuevoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleMovimientoInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;		
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);								
		
		
		/*
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		*/		
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =0;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
				
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleMovimientoInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetalleMovimientoInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
			
			
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetalleMovimientoInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetalleMovimientoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.setName("jPanelReporteDinamicoEstadoDetalleMovimientoInventario"); 
		
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutReporteDinamicoEstadoDetalleMovimientoInventario);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Movimiento Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jLabelColumnasSelectReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario=new JScrollPane(this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario);
			
			this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jListColumnasSelectReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jLabelRelacionesSelectReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario);
			
			this.jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jListRelacionesSelectReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jScrollRelacionesSelectReporteEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetalleMovimientoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetalleMovimientoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.setToolTipText("Generar EXCEL"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario.setToolTipText("Generar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleMovimientoInventario.add(this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario= new JScrollPane(jPanelReporteDinamicoEstadoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Movimiento Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleMovimientoInventario);
		this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetalleMovimientoInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetalleMovimientoInventario.setName("jPanelImportacionEstadoDetalleMovimientoInventario"); 
		
		this.jPanelImportacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutImportacionEstadoDetalleMovimientoInventario);
		
		
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetalleMovimientoInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Movimiento Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetalleMovimientoInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleMovimientoInventario.add(this.jLabelArchivoImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetalleMovimientoInventario = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetalleMovimientoInventario.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetalleMovimientoInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetalleMovimientoInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetalleMovimientoInventario.setToolTipText("Generar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleMovimientoInventario.add(this.jButtonAbrirImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleMovimientoInventario.add(this.jLabelPathArchivoImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetalleMovimientoInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleMovimientoInventario.add(this.jTextFieldPathArchivoImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetalleMovimientoInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetalleMovimientoInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetalleMovimientoInventario.setToolTipText("Generar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleMovimientoInventario.add(this.jButtonGenerarImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetalleMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleMovimientoInventario.add(this.jButtonCerrarImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetalleMovimientoInventario= new JScrollPane(jPanelImportacionEstadoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetalleMovimientoInventario);
		this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelImportacionEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetalleMovimientoInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetalleMovimientoInventario";
			inputMap = this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetalleMovimientoInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetalleMovimientoInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetalleMovimientoInventario.setName("jPanelOrderByEstadoDetalleMovimientoInventario"); 
			
			this.jPanelOrderByEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetalleMovimientoInventario.setLayout(gridaBagLayoutOrderByEstadoDetalleMovimientoInventario);
			
			
			this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleMovimientoInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetalleMovimientoInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetalleMovimientoInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetalleMovimientoInventarioOrderBy.setViewportView(this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy);
			this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetalleMovimientoInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetalleMovimientoInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setResizable(true);
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setClosable(true);
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Movimiento Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetalleMovimientoInventario.ipady =150;
				
			this.jPanelOrderByEstadoDetalleMovimientoInventario.add(jScrollPanelDatosEstadoDetalleMovimientoInventarioOrderBy, this.gridBagConstraintsEstadoDetalleMovimientoInventario);//this.jTableDatosEstadoDetalleMovimientoInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetalleMovimientoInventario = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetalleMovimientoInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetalleMovimientoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetalleMovimientoInventario.add(this.jButtonCerrarOrderByEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetalleMovimientoInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetalleMovimientoInventario= new JScrollPane(jPanelOrderByEstadoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetalleMovimientoInventario);
			
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelOrderByEstadoDetalleMovimientoInventario, this.gridBagConstraintsEstadoDetalleMovimientoInventario);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario = new JButtonMe();
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
			&& this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetalleMovimientoInventario.getRowHeight();//EstadoDetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.isSelected()) {
					iHeightTable=EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleMovimientoInventario.isSelected()) {
					iHeightTable=EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario!=null && this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetallemovimientoinventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetalleMovimientoInventario> TraerEstadoDetalleMovimientoInventarioBeans(List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:estadodetallemovimientoinventarios) {
					
				if(!(EstadoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetallemovimientoinventario.setsDetalleGeneralEntityReporte(EstadoDetalleMovimientoInventarioConstantesFunciones.getEstadoDetalleMovimientoInventarioDescripcion(estadodetallemovimientoinventario));
										
						
					
					

					if(estadodetallemovimientoinventario.getDetalleMovimientoInventarios()!=null && Funciones.existeClass(classes,DetalleMovimientoInventario.class)) {
						try{estadodetallemovimientoinventario.setdetallemovimientoinventariosDescripcionReporte(new JRBeanCollectionDataSource(DetalleMovimientoInventarioJInternalFrame.TraerDetalleMovimientoInventarioBeans(estadodetallemovimientoinventario.getDetalleMovimientoInventarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodetallemovimientoinventario.setsDetalleGeneralEntityReporte(estadodetallemovimientoinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetallemovimientoinventariobeans.add(estadodetallemovimientoinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetallemovimientoinventarios;
    }
	//PARA REPORTES FIN
}
