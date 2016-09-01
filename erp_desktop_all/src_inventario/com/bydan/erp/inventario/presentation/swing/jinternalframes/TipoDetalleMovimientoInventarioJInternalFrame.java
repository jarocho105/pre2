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
import com.bydan.erp.inventario.util.TipoDetalleMovimientoInventarioConstantesFunciones;

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
public class TipoDetalleMovimientoInventarioJInternalFrame extends TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarTipoDetalleMovimientoInventario;
	
	protected JMenu jmenuTipoDetalleMovimientoInventario;
	protected JMenu jmenuDatosTipoDetalleMovimientoInventario;
	protected JMenu jmenuArchivoTipoDetalleMovimientoInventario;
	protected JMenu jmenuAccionesTipoDetalleMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetalleMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsTipoDetalleMovimientoInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDetalleMovimientoInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDetalleMovimientoInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios;		
	public List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosEliminados;	
	public List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDetalleMovimientoInventario;		
	protected JButton jButtonAbrirOrderByTipoDetalleMovimientoInventario;
	
	
	//protected JPanel jPanelOrderByTipoDetalleMovimientoInventario;
	//public JScrollPane jScrollPanelOrderByTipoDetalleMovimientoInventario;	
	//protected JButton jButtonCerrarOrderByTipoDetalleMovimientoInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDetalleMovimientoInventarioLogic tipodetallemovimientoinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionTipoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralTipoDetalleMovimientoInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDetalleMovimientoInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario;
	//public JScrollPane jScrollPanelImportacionTipoDetalleMovimientoInventario;
	
	
	
	protected JPanel jPanelAccionesTipoDetalleMovimientoInventario;
	
    protected JPanel jPanelPaginacionTipoDetalleMovimientoInventario;
    protected JPanel jPanelParametrosReportesTipoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar2TipoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar3TipoDetalleMovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar4TipoDetalleMovimientoInventario;
	//protected JPanel jPanelParametrosAuxiliar5TipoDetalleMovimientoInventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDetalleMovimientoInventario;
	//protected JPanel jPanelImportacionTipoDetalleMovimientoInventario;
	
	
	public JTable jTableDatosTipoDetalleMovimientoInventario;
	
	
	
	//public JTable jTableDatosTipoDetalleMovimientoInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDetalleMovimientoInventario;
	protected JButton jButtonDuplicarTipoDetalleMovimientoInventario;
	protected JButton jButtonCopiarTipoDetalleMovimientoInventario;
	protected JButton jButtonVerFormTipoDetalleMovimientoInventario;
	protected JButton jButtonNuevoRelacionesTipoDetalleMovimientoInventario;
	protected JButton jButtonModificarTipoDetalleMovimientoInventario;
	
    protected JButton jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario;
	protected JButton jButtonCerrarTipoDetalleMovimientoInventario;
	
	
	protected JButton jButtonRecargarInformacionTipoDetalleMovimientoInventario;
	protected JButton jButtonProcesarInformacionTipoDetalleMovimientoInventario;
	
	
	protected JButton jButtonAnterioresTipoDetalleMovimientoInventario;
	protected JButton jButtonSiguientesTipoDetalleMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario;
	//protected JButton jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDetalleMovimientoInventario;
	//protected JButton jButtonGenerarImportacionTipoDetalleMovimientoInventario;
	//protected JButton jButtonCerrarImportacionTipoDetalleMovimientoInventario;
	//protected JFileChooser jFileChooserImportacionTipoDetalleMovimientoInventario;
	//protected File fileImportacionTipoDetalleMovimientoInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonDuplicarToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonCopiarToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonVerFormToolBarTipoDetalleMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonCerrarToolBarTipoDetalleMovimientoInventario;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonProcesarInformacionToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonAnterioresToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonSiguientesToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonAbrirOrderByToolBarTipoDetalleMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDuplicarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCopiarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemVerFormTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCerrarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemProcesarInformacionTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemAnterioresTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemSiguientesTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemAbrirOrderByTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetalleMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetalleMovimientoInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxSeleccionadosTipoDetalleMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario;
	protected JTextField jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDetalleMovimientoInventario;
	//public JList<Reporte> jListColumnasSelectReporteTipoDetalleMovimientoInventario;
	//public JScrollPane jScrollColumnasSelectReporteTipoDetalleMovimientoInventario;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDetalleMovimientoInventario;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDetalleMovimientoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario;
	
		
	//public JLabel jLabelArchivoImportacionTipoDetalleMovimientoInventario;	
	//public JLabel jLabelPathArchivoImportacionTipoDetalleMovimientoInventario;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDetalleMovimientoInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDetalleMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDetalleMovimientoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDetalleMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDetalleMovimientoInventario;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDetalleMovimientoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDetalleMovimientoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDetalleMovimientoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDetalleMovimientoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDetalleMovimientoInventario;	
	
	
	
	
	
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
	public TipoDetalleMovimientoInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDetalleMovimientoInventario)	{
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario = jButtonRecargarInformacionTipoDetalleMovimientoInventario;
	}
	
	public JButton getjButtonProcesarInformacionTipoDetalleMovimientoInventario() {
		return this.jButtonProcesarInformacionTipoDetalleMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetalleMovimientoInventario)	{
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario = jButtonProcesarInformacionTipoDetalleMovimientoInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDetalleMovimientoInventario() {
		return this.jButtonRecargarInformacionTipoDetalleMovimientoInventario;
	}
	
	
	public List<TipoDetalleMovimientoInventario> gettipodetallemovimientoinventarios() {
		return this.tipodetallemovimientoinventarios;
	}

	public void settipodetallemovimientoinventarios(List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios) {
		this.tipodetallemovimientoinventarios = tipodetallemovimientoinventarios;
	}
	
	public List<TipoDetalleMovimientoInventario> gettipodetallemovimientoinventariosAux() {
		return this.tipodetallemovimientoinventariosAux;
	}

	public void settipodetallemovimientoinventariosAux(List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosAux) {
		this.tipodetallemovimientoinventariosAux = tipodetallemovimientoinventariosAux;
	}
	
	public List<TipoDetalleMovimientoInventario> gettipodetallemovimientoinventariosEliminados() {
		return this.tipodetallemovimientoinventariosEliminados;
	}

	public void setTipoDetalleMovimientoInventariosEliminados(List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosEliminados) {
		this.tipodetallemovimientoinventariosEliminados = tipodetallemovimientoinventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDetalleMovimientoInventario() {
		return jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario = jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDetalleMovimientoInventario() {
		return jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario;
	}

	public void setjTextFieldValorCampoGeneralTipoDetalleMovimientoInventario(
			JTextField jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario) {
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario = jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario;
	}

	public void setBorderResaltarValorCampoGeneralTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario() {
		return this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario;
	}

	public void setjCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario(
			JCheckBox jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario) {
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario = jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario;
	}

	public void setBorderResaltarSeleccionarTodosTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDetalleMovimientoInventario() {
		return this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario;
	}

	public void setjCheckBoxSeleccionadosTipoDetalleMovimientoInventario(
			JCheckBox jCheckBoxSeleccionadosTipoDetalleMovimientoInventario) {
		this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario = jCheckBoxSeleccionadosTipoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarSeleccionadosTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario = jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposReportesTipoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposReportesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario = jComboBoxTiposReportesTipoDetalleMovimientoInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario() {
	//	return jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario) {
	//	this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario = jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario = jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario;
	//}
	
	public void setBorderResaltarTiposReportesTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario = jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposPaginacionTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario = jComboBoxTiposPaginacionTipoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario = jComboBoxTiposRelacionesTipoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario = jComboBoxTiposAccionesTipoDetalleMovimientoInventario;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDetalleMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario() {
	//	return jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario) {
	//	this.jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario = jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDetalleMovimientoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDetalleMovimientoInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario .setBorder(borderResaltar);		
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
		this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
		
		this.tipodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetalleMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDetalleMovimientoInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"nuevo","nuevo","Nuevo"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"duplicar","duplicar","Duplicar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"copiar","copiar","Copiar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"ver_form","ver_form","Ver"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"recargar","recargar","Recargar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,
							"cerrar","cerrar","Salir"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario;
			
				this.jButtonProcesarInformacionToolBarTipoDetalleMovimientoInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDetalleMovimientoInventario;
				
		//protected JButton jButtonModificarToolBarTipoDetalleMovimientoInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDetalleMovimientoInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDetalleMovimientoInventario=new JMenuMe("General");
		this.jmenuArchivoTipoDetalleMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDetalleMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDatosTipoDetalleMovimientoInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetalleMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetalleMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetalleMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDetalleMovimientoInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDetalleMovimientoInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDetalleMovimientoInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDetalleMovimientoInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDetalleMovimientoInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDetalleMovimientoInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDetalleMovimientoInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDetalleMovimientoInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDetalleMovimientoInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDetalleMovimientoInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDetalleMovimientoInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDetalleMovimientoInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDetalleMovimientoInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDetalleMovimientoInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDetalleMovimientoInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDetalleMovimientoInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDetalleMovimientoInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDetalleMovimientoInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDetalleMovimientoInventario.add(this.jMenuItemCerrarTipoDetalleMovimientoInventario);
			
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemNuevoTipoDetalleMovimientoInventario);
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario);
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario);
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario);		
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemDuplicarTipoDetalleMovimientoInventario);		
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemCopiarTipoDetalleMovimientoInventario);		
			this.jmenuAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemVerFormTipoDetalleMovimientoInventario);		
			
			this.jmenuDatosTipoDetalleMovimientoInventario.add(this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario);				
			this.jmenuDatosTipoDetalleMovimientoInventario.add(this.jMenuItemAnterioresTipoDetalleMovimientoInventario);				
			this.jmenuDatosTipoDetalleMovimientoInventario.add(this.jMenuItemSiguientesTipoDetalleMovimientoInventario);				
			this.jmenuDatosTipoDetalleMovimientoInventario.add(this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario);				
			this.jmenuDatosTipoDetalleMovimientoInventario.add(this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDetalleMovimientoInventario.add(this.jmenuArchivoTipoDetalleMovimientoInventario);		
			this.jmenuBarTipoDetalleMovimientoInventario.add(this.jmenuAccionesTipoDetalleMovimientoInventario);		
			this.jmenuBarTipoDetalleMovimientoInventario.add(this.jmenuDatosTipoDetalleMovimientoInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDetalleMovimientoInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDetalleMovimientoInventario() {
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
			//this.jInternalFrameDetalleTipoDetalleMovimientoInventario = new TipoDetalleMovimientoInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Costo DATOS");
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario = new TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario = null;//new TipoDetalleMovimientoInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetalleMovimientoInventario= new GridBagLayout();
		
		
		this.jTableDatosTipoDetalleMovimientoInventario = new JTableMe();      
		
		String sToolTipTipoDetalleMovimientoInventario="";
		sToolTipTipoDetalleMovimientoInventario=TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetalleMovimientoInventario+="(Inventario.TipoDetalleMovimientoInventario)";
		}
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetalleMovimientoInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDetalleMovimientoInventario.setToolTipText(sToolTipTipoDetalleMovimientoInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDetalleMovimientoInventario);
		this.jTableDatosTipoDetalleMovimientoInventario.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDetalleMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDetalleMovimientoInventario.setRowSelectionAllowed(true);
		this.jTableDatosTipoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonDuplicarTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCopiarTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonVerFormTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarTipoDetalleMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetalleMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo";
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetalleMovimientoInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario=new ReporteDinamicoJInternalFrame(TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDetalleMovimientoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDetalleMovimientoInventario=new ImportacionJInternalFrame(TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDetalleMovimientoInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDetalleMovimientoInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.setText("Orden");
		this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetalleMovimientoInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleMovimientoInventario,false,this);
			
			//this.cargarOrderByTipoDetalleMovimientoInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleMovimientoInventario,true,this);
			
			//this.cargarOrderByTipoDetalleMovimientoInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDetalleMovimientoInventario.setText("Nuevo");
		this.jButtonDuplicarTipoDetalleMovimientoInventario.setText("Duplicar");
		this.jButtonCopiarTipoDetalleMovimientoInventario.setText("Copiar");
		this.jButtonVerFormTipoDetalleMovimientoInventario.setText("Ver");
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.setText("Guardar");
		this.jButtonCerrarTipoDetalleMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetalleMovimientoInventario,"nuevo_button","Nuevo",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDetalleMovimientoInventario,"duplicar_button","Duplicar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDetalleMovimientoInventario,"copiar_button","Copiar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDetalleMovimientoInventario,"ver_form","Ver",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario,"nuevorelaciones_button","Nuevo Rel",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetalleMovimientoInventario,"cerrar_button","Salir",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDetalleMovimientoInventario.setToolTipText("Nuevo"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDetalleMovimientoInventario.setToolTipText("Duplicar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDetalleMovimientoInventario.setToolTipText("Copiar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDetalleMovimientoInventario.setToolTipText("Ver"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.setToolTipText("Nuevo Rel"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.setToolTipText("Guardar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetalleMovimientoInventario.setToolTipText("Salir"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetalleMovimientoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonDuplicarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDetalleMovimientoInventario"));
		
		//COPIAR
		sMapKey = "CopiarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonCopiarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDetalleMovimientoInventario"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDetalleMovimientoInventario";
		inputMap = this.jButtonVerFormTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDetalleMovimientoInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDetalleMovimientoInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonModificarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDetalleMovimientoInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetalleMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetalleMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetalleMovimientoInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setName("jPanelParametrosReportesTipoDetalleMovimientoInventario"); 
		
		this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario.setName("jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.setText("Recargar");
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.setToolTipText("Recargar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDetalleMovimientoInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario.setText("Procesar");
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario.setToolTipText("Procesar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDetalleMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesTipoDetalleMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDetalleMovimientoInventario = new JButtonMe();
		//this.jButtonAnterioresTipoDetalleMovimientoInventario.setText("<<");
        this.jButtonAnterioresTipoDetalleMovimientoInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDetalleMovimientoInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDetalleMovimientoInventario = new JButtonMe();
		//this.jButtonSiguientesTipoDetalleMovimientoInventario.setText(">>");
        this.jButtonSiguientesTipoDetalleMovimientoInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDetalleMovimientoInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario,"nuevoguardarcambios_button","Nue",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDetalleMovimientoInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDetalleMovimientoInventario";
		inputMap = this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDetalleMovimientoInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDetalleMovimientoInventario";
		inputMap = this.jButtonSiguientesTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDetalleMovimientoInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDetalleMovimientoInventario";
		inputMap = this.jButtonAnterioresTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDetalleMovimientoInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDetalleMovimientoInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),TipoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),TipoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),TipoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetalleMovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDetalleMovimientoInventario = new GridBagLayout();

			this.jPanelPaginacionTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutPaginacionTipoDetalleMovimientoInventario);						
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonAnterioresTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
					
						
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
			
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
						
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonSiguientesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonNuevoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			}
			
			
			if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			}
			
			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonDuplicarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonCopiarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonVerFormTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 1;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDetalleMovimientoInventario.add(this.jButtonCerrarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
		
		
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDetalleMovimientoInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDetalleMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDetalleMovimientoInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setLayout(gridaBagParametrosReportesTipoDetalleMovimientoInventario);
			this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario.setLayout(gridaBagParametrosReportesAccionesTipoDetalleMovimientoInventario);
			
			
			this.jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar1TipoDetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar2TipoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2TipoDetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar3TipoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar3TipoDetalleMovimientoInventario);
			this.jPanelParametrosAuxiliar4TipoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar4TipoDetalleMovimientoInventario);
			//this.jPanelParametrosAuxiliar5TipoDetalleMovimientoInventario.setLayout(gridaBagParametrosAuxiliar2TipoDetalleMovimientoInventario);			
			
			
			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jButtonRecargarInformacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario.add(this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario.add(this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario.add(this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar1TipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar4TipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jCheckBoxGenerarReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar2TipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jLabelAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jButtonAbrirOrderByTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
			
			
			/*
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetalleMovimientoInventario.add(this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);															
				
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetalleMovimientoInventario.add(this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jPanelParametrosAuxiliar3TipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
				
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.add(this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDetalleMovimientoInventario = new GridBagLayout();

			this.jScrollPanelDatosTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutDatosTipoDetalleMovimientoInventario);
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
			
			this.jScrollPanelDatosTipoDetalleMovimientoInventario.add(this.jTableDatosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setViewportView(this.jTableDatosTipoDetalleMovimientoInventario);
		this.jTableDatosTipoDetalleMovimientoInventario.setFillsViewportHeight(true);
		this.jTableDatosTipoDetalleMovimientoInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesTipoDetalleMovimientoInventario);
		
		
		/*	
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
			
		this.jPanelAccionesTipoDetalleMovimientoInventario.add(this.jButtonNuevoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetalleMovimientoInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsTipoDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;		
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);								
		
		
		/*
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		*/		
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
				
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDetalleMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetalleMovimientoInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutBusquedasParametrosTipoDetalleMovimientoInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
			
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDetalleMovimientoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.setName("jPanelReporteDinamicoTipoDetalleMovimientoInventario"); 
		
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutReporteDinamicoTipoDetalleMovimientoInventario);
		
		
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDetalleMovimientoInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jLabelColumnasSelectReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDetalleMovimientoInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario=new JScrollPane(this.jListColumnasSelectReporteTipoDetalleMovimientoInventario);
			
			this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jListColumnasSelectReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jLabelRelacionesSelectReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario=new JScrollPane(this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario);
			
			this.jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jListRelacionesSelectReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jScrollRelacionesSelectReporteTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDetalleMovimientoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDetalleMovimientoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jLabelGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.setToolTipText("Generar EXCEL"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jComboBoxTiposReportesDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jLabelTiposArchivoReporteDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario.setToolTipText("Generar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleMovimientoInventario.add(this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario= new JScrollPane(jPanelReporteDinamicoTipoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDetalleMovimientoInventario);
		this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDetalleMovimientoInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDetalleMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDetalleMovimientoInventario.setName("jPanelImportacionTipoDetalleMovimientoInventario"); 
		
		this.jPanelImportacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutImportacionTipoDetalleMovimientoInventario);
		
		
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDetalleMovimientoInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDetalleMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelArchivoImportacionTipoDetalleMovimientoInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetalleMovimientoInventario.add(this.jLabelArchivoImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDetalleMovimientoInventario = new JFileChooser();		
		this.jFileChooserImportacionTipoDetalleMovimientoInventario.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonAbrirImportacionTipoDetalleMovimientoInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDetalleMovimientoInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDetalleMovimientoInventario.setToolTipText("Generar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleMovimientoInventario.add(this.jButtonAbrirImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDetalleMovimientoInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDetalleMovimientoInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetalleMovimientoInventario.add(this.jLabelPathArchivoImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDetalleMovimientoInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleMovimientoInventario.add(this.jTextFieldPathArchivoImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGenerarImportacionTipoDetalleMovimientoInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDetalleMovimientoInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDetalleMovimientoInventario.setToolTipText("Generar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleMovimientoInventario.add(this.jButtonGenerarImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarImportacionTipoDetalleMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDetalleMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleMovimientoInventario.add(this.jButtonCerrarImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDetalleMovimientoInventario= new JScrollPane(jPanelImportacionTipoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDetalleMovimientoInventario);
		this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelImportacionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDetalleMovimientoInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario = new JButtonMe();
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.setText("Orden");
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetalleMovimientoInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDetalleMovimientoInventario";
			inputMap = this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDetalleMovimientoInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDetalleMovimientoInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDetalleMovimientoInventario.setName("jPanelOrderByTipoDetalleMovimientoInventario"); 
			
			this.jPanelOrderByTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutOrderByTipoDetalleMovimientoInventario);
			
			
			this.jTableDatosTipoDetalleMovimientoInventarioOrderBy = new JTableMe();        
			this.jTableDatosTipoDetalleMovimientoInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDetalleMovimientoInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDetalleMovimientoInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDetalleMovimientoInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDetalleMovimientoInventarioOrderBy.setViewportView(this.jTableDatosTipoDetalleMovimientoInventarioOrderBy);
			this.jTableDatosTipoDetalleMovimientoInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDetalleMovimientoInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDetalleMovimientoInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDetalleMovimientoInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setTitle("Orden");
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setResizable(true);
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setClosable(true);
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDetalleMovimientoInventario.ipady =150;
				
			this.jPanelOrderByTipoDetalleMovimientoInventario.add(jScrollPanelDatosTipoDetalleMovimientoInventarioOrderBy, this.gridBagConstraintsTipoDetalleMovimientoInventario);//this.jTableDatosTipoDetalleMovimientoInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDetalleMovimientoInventario = new JButtonMe();
			this.jButtonCerrarOrderByTipoDetalleMovimientoInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDetalleMovimientoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDetalleMovimientoInventario.add(this.jButtonCerrarOrderByTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDetalleMovimientoInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDetalleMovimientoInventario= new JScrollPane(jPanelOrderByTipoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDetalleMovimientoInventario);
			
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getContentPane().add(this.jScrollPanelOrderByTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
		
		} else {
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario = new JButtonMe();
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
			&& this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDetalleMovimientoInventario.getRowHeight();//TipoDetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.isSelected()) {
					iHeightTable=TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetalleMovimientoInventario.isSelected()) {
					iHeightTable=TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetalleMovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDetalleMovimientoInventario!=null && this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetallemovimientoinventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDetalleMovimientoInventario> TraerTipoDetalleMovimientoInventarioBeans(List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:tipodetallemovimientoinventarios) {
					
				if(!(TipoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodetallemovimientoinventario.setsDetalleGeneralEntityReporte(TipoDetalleMovimientoInventarioConstantesFunciones.getTipoDetalleMovimientoInventarioDescripcion(tipodetallemovimientoinventario));
										
						
					
					

					if(tipodetallemovimientoinventario.getDetalleMovimientoInventarios()!=null && Funciones.existeClass(classes,DetalleMovimientoInventario.class)) {
						try{tipodetallemovimientoinventario.setdetallemovimientoinventariosDescripcionReporte(new JRBeanCollectionDataSource(DetalleMovimientoInventarioJInternalFrame.TraerDetalleMovimientoInventarioBeans(tipodetallemovimientoinventario.getDetalleMovimientoInventarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodetallemovimientoinventario.setsDetalleGeneralEntityReporte(tipodetallemovimientoinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodetallemovimientoinventariobeans.add(tipodetallemovimientoinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodetallemovimientoinventarios;
    }
	//PARA REPORTES FIN
}
