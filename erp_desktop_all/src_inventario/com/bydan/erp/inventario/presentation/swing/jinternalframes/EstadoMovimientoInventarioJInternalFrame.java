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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.EstadoMovimientoInventarioConstantesFunciones;

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
public class EstadoMovimientoInventarioJInternalFrame extends EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoMovimientoInventario;
	
	protected JMenuBar jmenuBarEstadoMovimientoInventario;
	
	protected JMenu jmenuEstadoMovimientoInventario;
	protected JMenu jmenuDatosEstadoMovimientoInventario;
	protected JMenu jmenuArchivoEstadoMovimientoInventario;
	protected JMenu jmenuAccionesEstadoMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoMovimientoInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoMovimientoInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoMovimientoInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoMovimientoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoMovimientoInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoMovimientoInventario> estadomovimientoinventarios;		
	public List<EstadoMovimientoInventario> estadomovimientoinventariosEliminados;	
	public List<EstadoMovimientoInventario> estadomovimientoinventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoMovimientoInventario;		
	protected JButton jButtonAbrirOrderByEstadoMovimientoInventario;
	
	
	//protected JPanel jPanelOrderByEstadoMovimientoInventario;
	//public JScrollPane jScrollPanelOrderByEstadoMovimientoInventario;	
	//protected JButton jButtonCerrarOrderByEstadoMovimientoInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoMovimientoInventarioLogic estadomovimientoinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoMovimientoInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoMovimientoInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoMovimientoInventario;
	//public JScrollPane jScrollPanelImportacionEstadoMovimientoInventario;
	
	
	
	protected JPanel jPanelAccionesEstadoMovimientoInventario;
	
    protected JPanel jPanelPaginacionEstadoMovimientoInventario;
    protected JPanel jPanelParametrosReportesEstadoMovimientoInventario;
	protected JPanel jPanelParametrosReportesAccionesEstadoMovimientoInventario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar2EstadoMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar3EstadoMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar4EstadoMovimientoInventario;
	//protected JPanel jPanelParametrosAuxiliar5EstadoMovimientoInventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoMovimientoInventario;
	//protected JPanel jPanelImportacionEstadoMovimientoInventario;
	
	
	public JTable jTableDatosEstadoMovimientoInventario;
	
	
	
	//public JTable jTableDatosEstadoMovimientoInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoMovimientoInventario;
	protected JButton jButtonDuplicarEstadoMovimientoInventario;
	protected JButton jButtonCopiarEstadoMovimientoInventario;
	protected JButton jButtonVerFormEstadoMovimientoInventario;
	protected JButton jButtonNuevoRelacionesEstadoMovimientoInventario;
	protected JButton jButtonModificarEstadoMovimientoInventario;
	
    protected JButton jButtonGuardarCambiosTablaEstadoMovimientoInventario;
	protected JButton jButtonCerrarEstadoMovimientoInventario;
	
	
	protected JButton jButtonRecargarInformacionEstadoMovimientoInventario;
	protected JButton jButtonProcesarInformacionEstadoMovimientoInventario;
	
	
	protected JButton jButtonAnterioresEstadoMovimientoInventario;
	protected JButton jButtonSiguientesEstadoMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosEstadoMovimientoInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoMovimientoInventario;
	//protected JButton jButtonCerrarReporteDinamicoEstadoMovimientoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoMovimientoInventario;
	//protected JButton jButtonGenerarImportacionEstadoMovimientoInventario;
	//protected JButton jButtonCerrarImportacionEstadoMovimientoInventario;
	//protected JFileChooser jFileChooserImportacionEstadoMovimientoInventario;
	//protected File fileImportacionEstadoMovimientoInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoMovimientoInventario;
	protected JButton jButtonDuplicarToolBarEstadoMovimientoInventario;
	protected JButton jButtonNuevoRelacionesToolBarEstadoMovimientoInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoMovimientoInventario;
	protected JButton jButtonCopiarToolBarEstadoMovimientoInventario;
	protected JButton jButtonVerFormToolBarEstadoMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoMovimientoInventario;
	protected JButton jButtonCerrarToolBarEstadoMovimientoInventario;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoMovimientoInventario;
	protected JButton jButtonProcesarInformacionToolBarEstadoMovimientoInventario;
	protected JButton jButtonAnterioresToolBarEstadoMovimientoInventario;
	protected JButton jButtonSiguientesToolBarEstadoMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoMovimientoInventario;
	protected JButton jButtonAbrirOrderByToolBarEstadoMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoMovimientoInventario;
	protected JMenuItem jMenuItemDuplicarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoMovimientoInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoMovimientoInventario;
	protected JMenuItem jMenuItemCopiarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemVerFormEstadoMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoMovimientoInventario;
	protected JMenuItem jMenuItemCerrarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoMovimientoInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoMovimientoInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoMovimientoInventario;
	protected JMenuItem jMenuItemProcesarInformacionEstadoMovimientoInventario;
	protected JMenuItem jMenuItemAnterioresEstadoMovimientoInventario;
	protected JMenuItem jMenuItemSiguientesEstadoMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario;
	protected JMenuItem jMenuItemAbrirOrderByEstadoMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoMovimientoInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoMovimientoInventario;
	protected JCheckBox jCheckBoxSeleccionadosEstadoMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoMovimientoInventario;
	protected JTextField jTextFieldValorCampoGeneralEstadoMovimientoInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoMovimientoInventario;
	//public JList<Reporte> jListColumnasSelectReporteEstadoMovimientoInventario;
	//public JScrollPane jScrollColumnasSelectReporteEstadoMovimientoInventario;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoMovimientoInventario;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoMovimientoInventario;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoMovimientoInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoMovimientoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoMovimientoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario;
	
		
	//public JLabel jLabelArchivoImportacionEstadoMovimientoInventario;	
	//public JLabel jLabelPathArchivoImportacionEstadoMovimientoInventario;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoMovimientoInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoMovimientoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoMovimientoInventario;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoMovimientoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoMovimientoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoMovimientoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoMovimientoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoMovimientoInventario;	
	
	
	
	
	
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
	public EstadoMovimientoInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoMovimientoInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoMovimientoInventario)	{
		this.jButtonRecargarInformacionEstadoMovimientoInventario = jButtonRecargarInformacionEstadoMovimientoInventario;
	}
	
	public JButton getjButtonProcesarInformacionEstadoMovimientoInventario() {
		return this.jButtonProcesarInformacionEstadoMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoMovimientoInventario)	{
		this.jButtonProcesarInformacionEstadoMovimientoInventario = jButtonProcesarInformacionEstadoMovimientoInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoMovimientoInventario() {
		return this.jButtonRecargarInformacionEstadoMovimientoInventario;
	}
	
	
	public List<EstadoMovimientoInventario> getestadomovimientoinventarios() {
		return this.estadomovimientoinventarios;
	}

	public void setestadomovimientoinventarios(List<EstadoMovimientoInventario> estadomovimientoinventarios) {
		this.estadomovimientoinventarios = estadomovimientoinventarios;
	}
	
	public List<EstadoMovimientoInventario> getestadomovimientoinventariosAux() {
		return this.estadomovimientoinventariosAux;
	}

	public void setestadomovimientoinventariosAux(List<EstadoMovimientoInventario> estadomovimientoinventariosAux) {
		this.estadomovimientoinventariosAux = estadomovimientoinventariosAux;
	}
	
	public List<EstadoMovimientoInventario> getestadomovimientoinventariosEliminados() {
		return this.estadomovimientoinventariosEliminados;
	}

	public void setEstadoMovimientoInventariosEliminados(List<EstadoMovimientoInventario> estadomovimientoinventariosEliminados) {
		this.estadomovimientoinventariosEliminados = estadomovimientoinventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoMovimientoInventario() {
		return jComboBoxTiposSeleccionarEstadoMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoMovimientoInventario(
			JComboBox jComboBoxTiposSeleccionarEstadoMovimientoInventario) {
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario = jComboBoxTiposSeleccionarEstadoMovimientoInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoMovimientoInventario() {
		return jTextFieldValorCampoGeneralEstadoMovimientoInventario;
	}

	public void setjTextFieldValorCampoGeneralEstadoMovimientoInventario(
			JTextField jTextFieldValorCampoGeneralEstadoMovimientoInventario) {
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario = jTextFieldValorCampoGeneralEstadoMovimientoInventario;
	}

	public void setBorderResaltarValorCampoGeneralEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoMovimientoInventario() {
		return this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario;
	}

	public void setjCheckBoxSeleccionarTodosEstadoMovimientoInventario(
			JCheckBox jCheckBoxSeleccionarTodosEstadoMovimientoInventario) {
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario = jCheckBoxSeleccionarTodosEstadoMovimientoInventario;
	}

	public void setBorderResaltarSeleccionarTodosEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoMovimientoInventario() {
		return this.jCheckBoxSeleccionadosEstadoMovimientoInventario;
	}

	public void setjCheckBoxSeleccionadosEstadoMovimientoInventario(
			JCheckBox jCheckBoxSeleccionadosEstadoMovimientoInventario) {
		this.jCheckBoxSeleccionadosEstadoMovimientoInventario = jCheckBoxSeleccionadosEstadoMovimientoInventario;
	}
	
	public void setBorderResaltarSeleccionadosEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoMovimientoInventario() {
		return this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposArchivosReportesEstadoMovimientoInventario) {
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario = jComboBoxTiposArchivosReportesEstadoMovimientoInventario;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoMovimientoInventario() {
		return this.jComboBoxTiposReportesEstadoMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposReportesEstadoMovimientoInventario) {
		this.jComboBoxTiposReportesEstadoMovimientoInventario = jComboBoxTiposReportesEstadoMovimientoInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoMovimientoInventario() {
	//	return jComboBoxTiposReportesDinamicoEstadoMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoMovimientoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoMovimientoInventario) {
	//	this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario = jComboBoxTiposReportesDinamicoEstadoMovimientoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario = jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario;
	//}
	
	public void setBorderResaltarTiposReportesEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoMovimientoInventario() {
		return this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposGraficosReportesEstadoMovimientoInventario) {
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario = jComboBoxTiposGraficosReportesEstadoMovimientoInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoMovimientoInventario() {
		return this.jComboBoxTiposPaginacionEstadoMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoMovimientoInventario(
			JComboBox jComboBoxTiposPaginacionEstadoMovimientoInventario) {
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario = jComboBoxTiposPaginacionEstadoMovimientoInventario;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoMovimientoInventario() {
		return this.jComboBoxTiposRelacionesEstadoMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoMovimientoInventario() {
		return this.jComboBoxTiposAccionesEstadoMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesEstadoMovimientoInventario) {
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario = jComboBoxTiposRelacionesEstadoMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoMovimientoInventario(
			JComboBox jComboBoxTiposAccionesEstadoMovimientoInventario) {
		this.jComboBoxTiposAccionesEstadoMovimientoInventario = jComboBoxTiposAccionesEstadoMovimientoInventario;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoMovimientoInventario() {
	//	return jCheckBoxConGraficoDinamicoEstadoMovimientoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoMovimientoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoMovimientoInventario) {
	//	this.jCheckBoxConGraficoDinamicoEstadoMovimientoInventario = jCheckBoxConGraficoDinamicoEstadoMovimientoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoMovimientoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoMovimientoInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoMovimientoInventario .setBorder(borderResaltar);		
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
		this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
		
		this.estadomovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadomovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoMovimientoInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"nuevo","nuevo","Nuevo"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"duplicar","duplicar","Duplicar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"copiar","copiar","Copiar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"ver_form","ver_form","Ver"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"recargar","recargar","Recargar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,
							"cerrar","cerrar","Salir"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoMovimientoInventario;
			
				this.jButtonProcesarInformacionToolBarEstadoMovimientoInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoMovimientoInventario;
				
		//protected JButton jButtonModificarToolBarEstadoMovimientoInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoMovimientoInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoMovimientoInventario=new JMenuMe("General");
		this.jmenuArchivoEstadoMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDatosEstadoMovimientoInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoMovimientoInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoMovimientoInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoMovimientoInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoMovimientoInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoMovimientoInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoMovimientoInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoMovimientoInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoMovimientoInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoMovimientoInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoMovimientoInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoMovimientoInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoMovimientoInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoMovimientoInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoMovimientoInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoMovimientoInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoMovimientoInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoMovimientoInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoMovimientoInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoMovimientoInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoMovimientoInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoMovimientoInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoMovimientoInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoMovimientoInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoMovimientoInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoMovimientoInventario.add(this.jMenuItemCerrarEstadoMovimientoInventario);
			
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemNuevoEstadoMovimientoInventario);
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario);
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemNuevoRelacionesEstadoMovimientoInventario);
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario);		
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemDuplicarEstadoMovimientoInventario);		
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemCopiarEstadoMovimientoInventario);		
			this.jmenuAccionesEstadoMovimientoInventario.add(this.jMenuItemVerFormEstadoMovimientoInventario);		
			
			this.jmenuDatosEstadoMovimientoInventario.add(this.jMenuItemRecargarInformacionEstadoMovimientoInventario);				
			this.jmenuDatosEstadoMovimientoInventario.add(this.jMenuItemAnterioresEstadoMovimientoInventario);				
			this.jmenuDatosEstadoMovimientoInventario.add(this.jMenuItemSiguientesEstadoMovimientoInventario);				
			this.jmenuDatosEstadoMovimientoInventario.add(this.jMenuItemAbrirOrderByEstadoMovimientoInventario);				
			this.jmenuDatosEstadoMovimientoInventario.add(this.jMenuItemMostrarOcultarEstadoMovimientoInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoMovimientoInventario.add(this.jMenuItemGuardarCambiosEstadoMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoMovimientoInventario.add(this.jmenuArchivoEstadoMovimientoInventario);		
			this.jmenuBarEstadoMovimientoInventario.add(this.jmenuAccionesEstadoMovimientoInventario);		
			this.jmenuBarEstadoMovimientoInventario.add(this.jmenuDatosEstadoMovimientoInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoMovimientoInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoMovimientoInventario() {
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
			//this.jInternalFrameDetalleEstadoMovimientoInventario = new EstadoMovimientoInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Movimiento Inventario DATOS");
			this.jInternalFrameDetalleFormEstadoMovimientoInventario = new EstadoMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones(),this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario = null;//new EstadoMovimientoInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoMovimientoInventario= new GridBagLayout();
		
		
		this.jTableDatosEstadoMovimientoInventario = new JTableMe();      
		
		String sToolTipEstadoMovimientoInventario="";
		sToolTipEstadoMovimientoInventario=EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoMovimientoInventario+="(Inventario.EstadoMovimientoInventario)";
		}
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoMovimientoInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoMovimientoInventario.setToolTipText(sToolTipEstadoMovimientoInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoMovimientoInventario);
		this.jTableDatosEstadoMovimientoInventario.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoMovimientoInventario.setRowSelectionAllowed(true);
		this.jTableDatosEstadoMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoMovimientoInventario = new JButtonMe();
		this.jButtonDuplicarEstadoMovimientoInventario = new JButtonMe();
		this.jButtonCopiarEstadoMovimientoInventario = new JButtonMe();
		this.jButtonVerFormEstadoMovimientoInventario = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoMovimientoInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario = new JButtonMe();
		this.jButtonCerrarEstadoMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoMovimientoInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Movimiento Inventario";
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoMovimientoInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoMovimientoInventario=new ReporteDinamicoJInternalFrame(EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoMovimientoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoMovimientoInventario=new ImportacionJInternalFrame(EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoMovimientoInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoMovimientoInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoMovimientoInventario.setText("Orden");
		this.jButtonAbrirOrderByEstadoMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoMovimientoInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoMovimientoInventario,false,this);
			
			//this.cargarOrderByEstadoMovimientoInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoMovimientoInventario,true,this);
			
			//this.cargarOrderByEstadoMovimientoInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoMovimientoInventario.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoMovimientoInventario.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoMovimientoInventario.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoMovimientoInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoMovimientoInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoMovimientoInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoMovimientoInventario.setText("Nuevo");
		this.jButtonDuplicarEstadoMovimientoInventario.setText("Duplicar");
		this.jButtonCopiarEstadoMovimientoInventario.setText("Copiar");
		this.jButtonVerFormEstadoMovimientoInventario.setText("Ver");
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.setText("Guardar");
		this.jButtonCerrarEstadoMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoMovimientoInventario,"nuevo_button","Nuevo",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoMovimientoInventario,"duplicar_button","Duplicar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoMovimientoInventario,"copiar_button","Copiar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoMovimientoInventario,"ver_form","Ver",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoMovimientoInventario,"nuevorelaciones_button","Nuevo Rel",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoMovimientoInventario,"guardarcambiostabla_button","Guardar",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoMovimientoInventario,"cerrar_button","Salir",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoMovimientoInventario.setToolTipText("Nuevo"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoMovimientoInventario.setToolTipText("Duplicar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoMovimientoInventario.setToolTipText("Copiar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoMovimientoInventario.setToolTipText("Ver"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.setToolTipText("Nuevo Rel"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.setToolTipText("Guardar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoMovimientoInventario.setToolTipText("Salir"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoMovimientoInventario";
		inputMap = this.jButtonNuevoEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoMovimientoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoMovimientoInventario";
		inputMap = this.jButtonDuplicarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoMovimientoInventario"));
		
		//COPIAR
		sMapKey = "CopiarEstadoMovimientoInventario";
		inputMap = this.jButtonCopiarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoMovimientoInventario"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoMovimientoInventario";
		inputMap = this.jButtonVerFormEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoMovimientoInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoMovimientoInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoMovimientoInventario";
		inputMap = this.jButtonModificarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoMovimientoInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoMovimientoInventario";
		inputMap = this.jButtonCerrarEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoMovimientoInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoMovimientoInventario.setName("jPanelParametrosReportesEstadoMovimientoInventario"); 
		
		this.jPanelParametrosReportesAccionesEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoMovimientoInventario.setName("jPanelParametrosReportesAccionesEstadoMovimientoInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoMovimientoInventario = new JButtonMe();
		this.jButtonRecargarInformacionEstadoMovimientoInventario.setText("Recargar");
		this.jButtonRecargarInformacionEstadoMovimientoInventario.setToolTipText("Recargar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoMovimientoInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoMovimientoInventario = new JButtonMe();
		this.jButtonProcesarInformacionEstadoMovimientoInventario.setText("Procesar");
		this.jButtonProcesarInformacionEstadoMovimientoInventario.setToolTipText("Procesar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoMovimientoInventario.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoMovimientoInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoMovimientoInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoMovimientoInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoMovimientoInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoMovimientoInventario.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoMovimientoInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoMovimientoInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoMovimientoInventario = new JButtonMe();
		//this.jButtonAnterioresEstadoMovimientoInventario.setText("<<");
        this.jButtonAnterioresEstadoMovimientoInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoMovimientoInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoMovimientoInventario = new JButtonMe();
		//this.jButtonSiguientesEstadoMovimientoInventario.setText(">>");
        this.jButtonSiguientesEstadoMovimientoInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoMovimientoInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario,"nuevoguardarcambios_button","Nue",this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoMovimientoInventario";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoMovimientoInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoMovimientoInventario";
		inputMap = this.jButtonRecargarInformacionEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoMovimientoInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoMovimientoInventario";
		inputMap = this.jButtonSiguientesEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoMovimientoInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoMovimientoInventario";
		inputMap = this.jButtonAnterioresEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoMovimientoInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoMovimientoInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),EstadoMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),EstadoMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),EstadoMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoMovimientoInventario = new GridBagLayout();

			this.jPanelPaginacionEstadoMovimientoInventario.setLayout(gridaBagLayoutPaginacionEstadoMovimientoInventario);						
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonAnterioresEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
					
						
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
			
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
						
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonSiguientesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonNuevoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
				this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonNuevoRelacionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			}
			
			
			if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
				this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonGuardarCambiosTablaEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			}
			
			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonDuplicarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonCopiarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonVerFormEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 1;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoMovimientoInventario.add(this.jButtonCerrarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
		
		
		this.jButtonRecargarInformacionEstadoMovimientoInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoMovimientoInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoMovimientoInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoMovimientoInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoMovimientoInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoMovimientoInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoMovimientoInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoMovimientoInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoMovimientoInventario.setLayout(gridaBagParametrosReportesEstadoMovimientoInventario);
			this.jPanelParametrosReportesAccionesEstadoMovimientoInventario.setLayout(gridaBagParametrosReportesAccionesEstadoMovimientoInventario);
			
			
			this.jPanelParametrosAuxiliar1EstadoMovimientoInventario.setLayout(gridaBagParametrosAuxiliar1EstadoMovimientoInventario);
			this.jPanelParametrosAuxiliar2EstadoMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2EstadoMovimientoInventario);
			this.jPanelParametrosAuxiliar3EstadoMovimientoInventario.setLayout(gridaBagParametrosAuxiliar3EstadoMovimientoInventario);
			this.jPanelParametrosAuxiliar4EstadoMovimientoInventario.setLayout(gridaBagParametrosAuxiliar4EstadoMovimientoInventario);
			//this.jPanelParametrosAuxiliar5EstadoMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2EstadoMovimientoInventario);			
			
			
			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jButtonRecargarInformacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoMovimientoInventario.add(this.jComboBoxTiposPaginacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoMovimientoInventario.add(this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoMovimientoInventario.add(this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jPanelParametrosAuxiliar1EstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoMovimientoInventario.add(this.jComboBoxTiposReportesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jPanelParametrosAuxiliar4EstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jComboBoxTiposReportesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jCheckBoxGenerarReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jPanelParametrosAuxiliar2EstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jLabelAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jButtonAbrirOrderByEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jComboBoxTiposSeleccionarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
			
			
			/*
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoMovimientoInventario.add(this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);															
				
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoMovimientoInventario.add(this.jCheckBoxSeleccionadosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jPanelParametrosAuxiliar3EstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jComboBoxTiposRelacionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
				
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jComboBoxTiposAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
	
				
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoMovimientoInventario.add(this.jTextFieldValorCampoGeneralEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoMovimientoInventario = new GridBagLayout();

			this.jScrollPanelDatosEstadoMovimientoInventario.setLayout(gridaBagLayoutDatosEstadoMovimientoInventario);
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
			
			this.jScrollPanelDatosEstadoMovimientoInventario.add(this.jTableDatosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoMovimientoInventario.setViewportView(this.jTableDatosEstadoMovimientoInventario);
		this.jTableDatosEstadoMovimientoInventario.setFillsViewportHeight(true);
		this.jTableDatosEstadoMovimientoInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesEstadoMovimientoInventario.setLayout(gridaBagLayoutAccionesEstadoMovimientoInventario);
		
		
		/*	
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = 0;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
			
		this.jPanelAccionesEstadoMovimientoInventario.add(this.jButtonNuevoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoMovimientoInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;		
		//this.gridBagConstraintsEstadoMovimientoInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoMovimientoInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoMovimientoInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);								
		
		
		/*
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		*/		
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =0;
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
				
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoMovimientoInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoMovimientoInventario.setLayout(gridaBagLayoutBusquedasParametrosEstadoMovimientoInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
			
			
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
			
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoMovimientoInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoMovimientoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoMovimientoInventario.setName("jPanelReporteDinamicoEstadoMovimientoInventario"); 
		
		this.jPanelReporteDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoMovimientoInventario.setLayout(gridaBagLayoutReporteDinamicoEstadoMovimientoInventario);
		
		
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Movimiento Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoMovimientoInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoMovimientoInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jLabelColumnasSelectReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoMovimientoInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoMovimientoInventario=new JScrollPane(this.jListColumnasSelectReporteEstadoMovimientoInventario);
			
			this.jScrollColumnasSelectReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jListColumnasSelectReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jScrollColumnasSelectReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoMovimientoInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoMovimientoInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jLabelRelacionesSelectReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoMovimientoInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoMovimientoInventario=new JScrollPane(this.jListRelacionesSelectReporteEstadoMovimientoInventario);
			
			this.jScrollRelacionesSelectReporteEstadoMovimientoInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoMovimientoInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoMovimientoInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jListRelacionesSelectReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jScrollRelacionesSelectReporteEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoMovimientoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoMovimientoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoMovimientoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jLabelGenerarExcelReporteDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario.setToolTipText("Generar EXCEL"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jComboBoxTiposReportesDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jLabelTiposArchivoReporteDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario.setToolTipText("Generar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoMovimientoInventario.add(this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoMovimientoInventario= new JScrollPane(jPanelReporteDinamicoEstadoMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Movimiento Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoMovimientoInventario);
		this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoMovimientoInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoMovimientoInventario.setName("jPanelImportacionEstadoMovimientoInventario"); 
		
		this.jPanelImportacionEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoMovimientoInventario.setLayout(gridaBagLayoutImportacionEstadoMovimientoInventario);
		
		
		this.jInternalFrameImportacionEstadoMovimientoInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoMovimientoInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoMovimientoInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoMovimientoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Movimiento Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoMovimientoInventario = new JLabelMe();

		this.jLabelArchivoImportacionEstadoMovimientoInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoMovimientoInventario.add(this.jLabelArchivoImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoMovimientoInventario = new JFileChooser();		
		this.jFileChooserImportacionEstadoMovimientoInventario.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoMovimientoInventario = new JButtonMe();
		this.jButtonAbrirImportacionEstadoMovimientoInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoMovimientoInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoMovimientoInventario.setToolTipText("Generar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoMovimientoInventario.add(this.jButtonAbrirImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoMovimientoInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoMovimientoInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoMovimientoInventario.add(this.jLabelPathArchivoImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoMovimientoInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoMovimientoInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoMovimientoInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoMovimientoInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoMovimientoInventario.add(this.jTextFieldPathArchivoImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoMovimientoInventario = new JButtonMe();
		this.jButtonGenerarImportacionEstadoMovimientoInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoMovimientoInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoMovimientoInventario.setToolTipText("Generar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoMovimientoInventario.add(this.jButtonGenerarImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoMovimientoInventario = new JButtonMe();
		this.jButtonCerrarImportacionEstadoMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoMovimientoInventario.add(this.jButtonCerrarImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoMovimientoInventario= new JScrollPane(jPanelImportacionEstadoMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoMovimientoInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoMovimientoInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoMovimientoInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoMovimientoInventario);
		this.jInternalFrameImportacionEstadoMovimientoInventario.getContentPane().add(this.jScrollPanelImportacionEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoMovimientoInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoMovimientoInventario = new JButtonMe();
			this.jButtonAbrirOrderByEstadoMovimientoInventario.setText("Orden");
			this.jButtonAbrirOrderByEstadoMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoMovimientoInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoMovimientoInventario";
			inputMap = this.jButtonAbrirOrderByEstadoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoMovimientoInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoMovimientoInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoMovimientoInventario.setName("jPanelOrderByEstadoMovimientoInventario"); 
			
			this.jPanelOrderByEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoMovimientoInventario.setLayout(gridaBagLayoutOrderByEstadoMovimientoInventario);
			
			
			this.jTableDatosEstadoMovimientoInventarioOrderBy = new JTableMe();        
			this.jTableDatosEstadoMovimientoInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoMovimientoInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoMovimientoInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoMovimientoInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoMovimientoInventarioOrderBy.setViewportView(this.jTableDatosEstadoMovimientoInventarioOrderBy);
			this.jTableDatosEstadoMovimientoInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoMovimientoInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoMovimientoInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoMovimientoInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoMovimientoInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoMovimientoInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoMovimientoInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoMovimientoInventario.setTitle("Orden");
			this.jInternalFrameOrderByEstadoMovimientoInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoMovimientoInventario.setResizable(true);
			this.jInternalFrameOrderByEstadoMovimientoInventario.setClosable(true);
			this.jInternalFrameOrderByEstadoMovimientoInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Movimiento Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoMovimientoInventario.ipady =150;
				
			this.jPanelOrderByEstadoMovimientoInventario.add(jScrollPanelDatosEstadoMovimientoInventarioOrderBy, this.gridBagConstraintsEstadoMovimientoInventario);//this.jTableDatosEstadoMovimientoInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoMovimientoInventario = new JButtonMe();
			this.jButtonCerrarOrderByEstadoMovimientoInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoMovimientoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoMovimientoInventario.setToolTipText("Cancelar"+" "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoMovimientoInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoMovimientoInventario.add(this.jButtonCerrarOrderByEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoMovimientoInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoMovimientoInventario= new JScrollPane(jPanelOrderByEstadoMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoMovimientoInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoMovimientoInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoMovimientoInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoMovimientoInventario);
			
			this.jInternalFrameOrderByEstadoMovimientoInventario.getContentPane().add(this.jScrollPanelOrderByEstadoMovimientoInventario, this.gridBagConstraintsEstadoMovimientoInventario);			
		
		} else {
			this.jButtonAbrirOrderByEstadoMovimientoInventario = new JButtonMe();
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
			&& this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoMovimientoInventario.getRowHeight();//EstadoMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.isSelected()) {
					iHeightTable=EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoMovimientoInventario.isSelected()) {
					iHeightTable=EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoMovimientoInventario!=null && this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoMovimientoInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoMovimientoInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoMovimientoInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadomovimientoinventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoMovimientoInventario> TraerEstadoMovimientoInventarioBeans(List<EstadoMovimientoInventario> estadomovimientoinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoMovimientoInventario estadomovimientoinventario:estadomovimientoinventarios) {
					
				if(!(EstadoMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadomovimientoinventario.setsDetalleGeneralEntityReporte(EstadoMovimientoInventarioConstantesFunciones.getEstadoMovimientoInventarioDescripcion(estadomovimientoinventario));
										
						
					
					

					if(estadomovimientoinventario.getMovimientoInventarios()!=null && Funciones.existeClass(classes,MovimientoInventario.class)) {
						try{estadomovimientoinventario.setmovimientoinventariosDescripcionReporte(new JRBeanCollectionDataSource(MovimientoInventarioJInternalFrame.TraerMovimientoInventarioBeans(estadomovimientoinventario.getMovimientoInventarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadomovimientoinventario.setsDetalleGeneralEntityReporte(estadomovimientoinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadomovimientoinventariobeans.add(estadomovimientoinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadomovimientoinventarios;
    }
	//PARA REPORTES FIN
}
