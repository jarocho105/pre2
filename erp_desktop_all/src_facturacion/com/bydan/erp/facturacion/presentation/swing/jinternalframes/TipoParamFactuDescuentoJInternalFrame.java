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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoParamFactuDescuentoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoParamFactuDescuentoJInternalFrame extends TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoParamFactuDescuento;
	
	protected JMenuBar jmenuBarTipoParamFactuDescuento;
	
	protected JMenu jmenuTipoParamFactuDescuento;
	protected JMenu jmenuDatosTipoParamFactuDescuento;
	protected JMenu jmenuArchivoTipoParamFactuDescuento;
	protected JMenu jmenuAccionesTipoParamFactuDescuento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuDescuento;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuDescuento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoParamFactuDescuentoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoParamFactuDescuento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoParamFactuDescuento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoParamFactuDescuento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoParamFactuDescuento> tipoparamfactudescuentos;		
	public List<TipoParamFactuDescuento> tipoparamfactudescuentosEliminados;	
	public List<TipoParamFactuDescuento> tipoparamfactudescuentosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoParamFactuDescuento;		
	protected JButton jButtonAbrirOrderByTipoParamFactuDescuento;
	
	
	//protected JPanel jPanelOrderByTipoParamFactuDescuento;
	//public JScrollPane jScrollPanelOrderByTipoParamFactuDescuento;	
	//protected JButton jButtonCerrarOrderByTipoParamFactuDescuento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoParamFactuDescuentoLogic tipoparamfactudescuentoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoParamFactuDescuento;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuDescuento;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuDescuento;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoParamFactuDescuentoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoParamFactuDescuento;
	//public JScrollPane jScrollPanelImportacionTipoParamFactuDescuento;
	
	
	
	protected JPanel jPanelAccionesTipoParamFactuDescuento;
	
    protected JPanel jPanelPaginacionTipoParamFactuDescuento;
    protected JPanel jPanelParametrosReportesTipoParamFactuDescuento;
	protected JPanel jPanelParametrosReportesAccionesTipoParamFactuDescuento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoParamFactuDescuento;
	protected JPanel jPanelParametrosAuxiliar2TipoParamFactuDescuento;
	protected JPanel jPanelParametrosAuxiliar3TipoParamFactuDescuento;
	protected JPanel jPanelParametrosAuxiliar4TipoParamFactuDescuento;
	//protected JPanel jPanelParametrosAuxiliar5TipoParamFactuDescuento;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoParamFactuDescuento;
	//protected JPanel jPanelImportacionTipoParamFactuDescuento;
	
	
	public JTable jTableDatosTipoParamFactuDescuento;
	
	
	
	//public JTable jTableDatosTipoParamFactuDescuentoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoParamFactuDescuento;
	protected JButton jButtonDuplicarTipoParamFactuDescuento;
	protected JButton jButtonCopiarTipoParamFactuDescuento;
	protected JButton jButtonVerFormTipoParamFactuDescuento;
	protected JButton jButtonNuevoRelacionesTipoParamFactuDescuento;
	protected JButton jButtonModificarTipoParamFactuDescuento;
	
    protected JButton jButtonGuardarCambiosTablaTipoParamFactuDescuento;
	protected JButton jButtonCerrarTipoParamFactuDescuento;
	
	
	protected JButton jButtonRecargarInformacionTipoParamFactuDescuento;
	protected JButton jButtonProcesarInformacionTipoParamFactuDescuento;
	
	
	protected JButton jButtonAnterioresTipoParamFactuDescuento;
	protected JButton jButtonSiguientesTipoParamFactuDescuento;
	protected JButton jButtonNuevoGuardarCambiosTipoParamFactuDescuento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoParamFactuDescuento;
	//protected JButton jButtonCerrarReporteDinamicoTipoParamFactuDescuento;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoParamFactuDescuento;
	//protected JButton jButtonGenerarImportacionTipoParamFactuDescuento;
	//protected JButton jButtonCerrarImportacionTipoParamFactuDescuento;
	//protected JFileChooser jFileChooserImportacionTipoParamFactuDescuento;
	//protected File fileImportacionTipoParamFactuDescuento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuDescuento;
	protected JButton jButtonDuplicarToolBarTipoParamFactuDescuento;
	protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuDescuento;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoParamFactuDescuento;
	protected JButton jButtonCopiarToolBarTipoParamFactuDescuento;
	protected JButton jButtonVerFormToolBarTipoParamFactuDescuento;
	public JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuDescuento;
	protected JButton jButtonCerrarToolBarTipoParamFactuDescuento;
	
	protected JButton jButtonRecargarInformacionToolBarTipoParamFactuDescuento;
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuDescuento;
	protected JButton jButtonAnterioresToolBarTipoParamFactuDescuento;
	protected JButton jButtonSiguientesToolBarTipoParamFactuDescuento;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoParamFactuDescuento;
	protected JButton jButtonAbrirOrderByToolBarTipoParamFactuDescuento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuDescuento;
	protected JMenuItem jMenuItemDuplicarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemNuevoRelacionesTipoParamFactuDescuento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuDescuento;
	protected JMenuItem jMenuItemCopiarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemVerFormTipoParamFactuDescuento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuDescuento;
	protected JMenuItem jMenuItemCerrarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuDescuento;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoParamFactuDescuento;
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuDescuento;
	protected JMenuItem jMenuItemAnterioresTipoParamFactuDescuento;
	protected JMenuItem jMenuItemSiguientesTipoParamFactuDescuento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento;
	protected JMenuItem jMenuItemAbrirOrderByTipoParamFactuDescuento;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuDescuento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuDescuento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuDescuento;
	protected JCheckBox jCheckBoxSeleccionadosTipoParamFactuDescuento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento;
	protected JCheckBox jCheckBoxConGraficoReporteTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoParamFactuDescuento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoParamFactuDescuento;
	protected JTextField jTextFieldValorCampoGeneralTipoParamFactuDescuento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoParamFactuDescuento;
	//public JList<Reporte> jListColumnasSelectReporteTipoParamFactuDescuento;
	//public JScrollPane jScrollColumnasSelectReporteTipoParamFactuDescuento;
	
	//public JLabel jLabelRelacionesSelectReporteTipoParamFactuDescuento;
	//public JList<Reporte> jListRelacionesSelectReporteTipoParamFactuDescuento;
	//public JScrollPane jScrollRelacionesSelectReporteTipoParamFactuDescuento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoParamFactuDescuento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuDescuento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento;
	
		
	//public JLabel jLabelArchivoImportacionTipoParamFactuDescuento;	
	//public JLabel jLabelPathArchivoImportacionTipoParamFactuDescuento;
	//protected JTextField jTextFieldPathArchivoImportacionTipoParamFactuDescuento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoParamFactuDescuento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoParamFactuDescuento;
	
	//public JLabel jLabelColumnaCategoriaValorTipoParamFactuDescuento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoParamFactuDescuento;
	
	//public JLabel jLabelColumnasValoresGraficoTipoParamFactuDescuento;
	//public JList<Reporte> jListColumnasValoresGraficoTipoParamFactuDescuento;
	//public JScrollPane jScrollColumnasValoresGraficoTipoParamFactuDescuento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoParamFactuDescuento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoParamFactuDescuento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoParamFactuDescuento;
	public JPanel jPanelBusquedaPorNombreTipoParamFactuDescuento;
	public JButton jButtonBusquedaPorNombreTipoParamFactuDescuento;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoParamFactuDescuento;
	public JLabel jLabelnombreBusquedaPorNombreTipoParamFactuDescuento;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento;
	public JButton jButtonnombreBusquedaPorNombreTipoParamFactuDescuentoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoParamFactuDescuentoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoParamFactuDescuento)	{
		this.jButtonRecargarInformacionTipoParamFactuDescuento = jButtonRecargarInformacionTipoParamFactuDescuento;
	}
	
	public JButton getjButtonProcesarInformacionTipoParamFactuDescuento() {
		return this.jButtonProcesarInformacionTipoParamFactuDescuento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuDescuento)	{
		this.jButtonProcesarInformacionTipoParamFactuDescuento = jButtonProcesarInformacionTipoParamFactuDescuento;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoParamFactuDescuento() {
		return this.jButtonRecargarInformacionTipoParamFactuDescuento;
	}
	
	
	public List<TipoParamFactuDescuento> gettipoparamfactudescuentos() {
		return this.tipoparamfactudescuentos;
	}

	public void settipoparamfactudescuentos(List<TipoParamFactuDescuento> tipoparamfactudescuentos) {
		this.tipoparamfactudescuentos = tipoparamfactudescuentos;
	}
	
	public List<TipoParamFactuDescuento> gettipoparamfactudescuentosAux() {
		return this.tipoparamfactudescuentosAux;
	}

	public void settipoparamfactudescuentosAux(List<TipoParamFactuDescuento> tipoparamfactudescuentosAux) {
		this.tipoparamfactudescuentosAux = tipoparamfactudescuentosAux;
	}
	
	public List<TipoParamFactuDescuento> gettipoparamfactudescuentosEliminados() {
		return this.tipoparamfactudescuentosEliminados;
	}

	public void setTipoParamFactuDescuentosEliminados(List<TipoParamFactuDescuento> tipoparamfactudescuentosEliminados) {
		this.tipoparamfactudescuentosEliminados = tipoparamfactudescuentosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoParamFactuDescuento() {
		return jComboBoxTiposSeleccionarTipoParamFactuDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoParamFactuDescuento(
			JComboBox jComboBoxTiposSeleccionarTipoParamFactuDescuento) {
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento = jComboBoxTiposSeleccionarTipoParamFactuDescuento;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoParamFactuDescuento() {
		return jTextFieldValorCampoGeneralTipoParamFactuDescuento;
	}

	public void setjTextFieldValorCampoGeneralTipoParamFactuDescuento(
			JTextField jTextFieldValorCampoGeneralTipoParamFactuDescuento) {
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento = jTextFieldValorCampoGeneralTipoParamFactuDescuento;
	}

	public void setBorderResaltarValorCampoGeneralTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoParamFactuDescuento() {
		return this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento;
	}

	public void setjCheckBoxSeleccionarTodosTipoParamFactuDescuento(
			JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuDescuento) {
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento = jCheckBoxSeleccionarTodosTipoParamFactuDescuento;
	}

	public void setBorderResaltarSeleccionarTodosTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoParamFactuDescuento() {
		return this.jCheckBoxSeleccionadosTipoParamFactuDescuento;
	}

	public void setjCheckBoxSeleccionadosTipoParamFactuDescuento(
			JCheckBox jCheckBoxSeleccionadosTipoParamFactuDescuento) {
		this.jCheckBoxSeleccionadosTipoParamFactuDescuento = jCheckBoxSeleccionadosTipoParamFactuDescuento;
	}
	
	public void setBorderResaltarSeleccionadosTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoParamFactuDescuento() {
		return this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposArchivosReportesTipoParamFactuDescuento) {
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento = jComboBoxTiposArchivosReportesTipoParamFactuDescuento;
	}

	public void setBorderResaltarTiposArchivosReportesTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoParamFactuDescuento() {
		return this.jComboBoxTiposReportesTipoParamFactuDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposReportesTipoParamFactuDescuento) {
		this.jComboBoxTiposReportesTipoParamFactuDescuento = jComboBoxTiposReportesTipoParamFactuDescuento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoParamFactuDescuento() {
	//	return jComboBoxTiposReportesDinamicoTipoParamFactuDescuento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoParamFactuDescuento(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuDescuento) {
	//	this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento = jComboBoxTiposReportesDinamicoTipoParamFactuDescuento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento = jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento;
	//}
	
	public void setBorderResaltarTiposReportesTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoParamFactuDescuento() {
		return this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposGraficosReportesTipoParamFactuDescuento) {
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento = jComboBoxTiposGraficosReportesTipoParamFactuDescuento;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoParamFactuDescuento() {
		return this.jComboBoxTiposPaginacionTipoParamFactuDescuento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoParamFactuDescuento(
			JComboBox jComboBoxTiposPaginacionTipoParamFactuDescuento) {
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento = jComboBoxTiposPaginacionTipoParamFactuDescuento;
	}
	
	public void setBorderResaltarTiposPaginacionTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoParamFactuDescuento() {
		return this.jComboBoxTiposRelacionesTipoParamFactuDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuDescuento() {
		return this.jComboBoxTiposAccionesTipoParamFactuDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuDescuento) {
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento = jComboBoxTiposRelacionesTipoParamFactuDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposAccionesTipoParamFactuDescuento) {
		this.jComboBoxTiposAccionesTipoParamFactuDescuento = jComboBoxTiposAccionesTipoParamFactuDescuento;
	}
	
	public void setBorderResaltarTiposRelacionesTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoParamFactuDescuento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoParamFactuDescuento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoParamFactuDescuento() {
	//	return jCheckBoxConGraficoDinamicoTipoParamFactuDescuento;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoParamFactuDescuento(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuDescuento) {
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuDescuento = jCheckBoxConGraficoDinamicoTipoParamFactuDescuento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoParamFactuDescuento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoParamFactuDescuento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuDescuento .setBorder(borderResaltar);		
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
		this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
		
		this.tipoparamfactudescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactudescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoParamFactuDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoParamFactuDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuDescuentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Descuento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoParamFactuDescuentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoParamFactuDescuento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"nuevo","nuevo","Nuevo"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"duplicar","duplicar","Duplicar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"copiar","copiar","Copiar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"ver_form","ver_form","Ver"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"recargar","recargar","Recargar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,
							"cerrar","cerrar","Salir"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuDescuento;
			
				this.jButtonProcesarInformacionToolBarTipoParamFactuDescuento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoParamFactuDescuento;
				
		//protected JButton jButtonModificarToolBarTipoParamFactuDescuento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoParamFactuDescuento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoParamFactuDescuento=new JMenuMe("General");
		this.jmenuArchivoTipoParamFactuDescuento=new JMenuMe("Archivo");
		this.jmenuAccionesTipoParamFactuDescuento=new JMenuMe("Acciones");
		this.jmenuDatosTipoParamFactuDescuento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuDescuento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuDescuento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuDescuento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoParamFactuDescuento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoParamFactuDescuento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoParamFactuDescuento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoParamFactuDescuento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoParamFactuDescuento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoParamFactuDescuento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoParamFactuDescuento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuDescuento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuDescuento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoParamFactuDescuento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoParamFactuDescuento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoParamFactuDescuento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoParamFactuDescuento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoParamFactuDescuento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoParamFactuDescuento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuDescuento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuDescuento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuDescuento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoParamFactuDescuento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoParamFactuDescuento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoParamFactuDescuento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoParamFactuDescuento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoParamFactuDescuento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoParamFactuDescuento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoParamFactuDescuento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoParamFactuDescuento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoParamFactuDescuento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoParamFactuDescuento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoParamFactuDescuento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoParamFactuDescuento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoParamFactuDescuento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoParamFactuDescuento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoParamFactuDescuento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuDescuento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoParamFactuDescuento.add(this.jMenuItemCerrarTipoParamFactuDescuento);
			
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemNuevoTipoParamFactuDescuento);
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento);
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemNuevoRelacionesTipoParamFactuDescuento);
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento);		
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemDuplicarTipoParamFactuDescuento);		
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemCopiarTipoParamFactuDescuento);		
			this.jmenuAccionesTipoParamFactuDescuento.add(this.jMenuItemVerFormTipoParamFactuDescuento);		
			
			this.jmenuDatosTipoParamFactuDescuento.add(this.jMenuItemRecargarInformacionTipoParamFactuDescuento);				
			this.jmenuDatosTipoParamFactuDescuento.add(this.jMenuItemAnterioresTipoParamFactuDescuento);				
			this.jmenuDatosTipoParamFactuDescuento.add(this.jMenuItemSiguientesTipoParamFactuDescuento);				
			this.jmenuDatosTipoParamFactuDescuento.add(this.jMenuItemAbrirOrderByTipoParamFactuDescuento);				
			this.jmenuDatosTipoParamFactuDescuento.add(this.jMenuItemMostrarOcultarTipoParamFactuDescuento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoParamFactuDescuento.add(this.jMenuItemGuardarCambiosTipoParamFactuDescuento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoParamFactuDescuento.add(this.jmenuArchivoTipoParamFactuDescuento);		
			this.jmenuBarTipoParamFactuDescuento.add(this.jmenuAccionesTipoParamFactuDescuento);		
			this.jmenuBarTipoParamFactuDescuento.add(this.jmenuDatosTipoParamFactuDescuento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoParamFactuDescuento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoParamFactuDescuento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoParamFactuDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoParamFactuDescuento.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoParamFactuDescuento= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoParamFactuDescuento.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoParamFactuDescuento.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoParamFactuDescuento,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoParamFactuDescuento = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoParamFactuDescuento.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoParamFactuDescuento.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoParamFactuDescuento=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoParamFactuDescuento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuDescuento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuDescuento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoParamFactuDescuento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoParamFactuDescuento = new TipoParamFactuDescuentoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Descuento DATOS");
			this.jInternalFrameDetalleFormTipoParamFactuDescuento = new TipoParamFactuDescuentoDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones(),this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento = null;//new TipoParamFactuDescuentoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuDescuento= new GridBagLayout();
		
		
		this.jTableDatosTipoParamFactuDescuento = new JTableMe();      
		
		String sToolTipTipoParamFactuDescuento="";
		sToolTipTipoParamFactuDescuento=TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuDescuento+="(Facturacion.TipoParamFactuDescuento)";
		}
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuDescuento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoParamFactuDescuento.setToolTipText(sToolTipTipoParamFactuDescuento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoParamFactuDescuento);
		this.jTableDatosTipoParamFactuDescuento.setAutoCreateRowSorter(true);
		this.jTableDatosTipoParamFactuDescuento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoParamFactuDescuento.setRowSelectionAllowed(true);
		this.jTableDatosTipoParamFactuDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoParamFactuDescuento = new JButtonMe();
		this.jButtonDuplicarTipoParamFactuDescuento = new JButtonMe();
		this.jButtonCopiarTipoParamFactuDescuento = new JButtonMe();
		this.jButtonVerFormTipoParamFactuDescuento = new JButtonMe();
		this.jButtonNuevoRelacionesTipoParamFactuDescuento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento = new JButtonMe();
		this.jButtonCerrarTipoParamFactuDescuento = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuDescuento = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoParamFactuDescuento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Descuento";
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descuentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuDescuento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuDescuento.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuDescuento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoParamFactuDescuento=new ReporteDinamicoJInternalFrame(TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoParamFactuDescuento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoParamFactuDescuento=new ImportacionJInternalFrame(TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoParamFactuDescuento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoParamFactuDescuento = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoParamFactuDescuento.setText("Orden");
		this.jButtonAbrirOrderByTipoParamFactuDescuento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuDescuento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuDescuento,false,this);
			
			//this.cargarOrderByTipoParamFactuDescuento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuDescuento,true,this);
			
			//this.cargarOrderByTipoParamFactuDescuento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoParamFactuDescuento.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuDescuento.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuDescuento.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoParamFactuDescuento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuDescuento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuDescuento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoParamFactuDescuento.setText("Nuevo");
		this.jButtonDuplicarTipoParamFactuDescuento.setText("Duplicar");
		this.jButtonCopiarTipoParamFactuDescuento.setText("Copiar");
		this.jButtonVerFormTipoParamFactuDescuento.setText("Ver");
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.setText("Guardar");
		this.jButtonCerrarTipoParamFactuDescuento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuDescuento,"nuevo_button","Nuevo",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoParamFactuDescuento,"duplicar_button","Duplicar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoParamFactuDescuento,"copiar_button","Copiar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoParamFactuDescuento,"ver_form","Ver",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoParamFactuDescuento,"nuevorelaciones_button","Nuevo Rel",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuDescuento,"guardarcambiostabla_button","Guardar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuDescuento,"cerrar_button","Salir",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoParamFactuDescuento.setToolTipText("Nuevo"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoParamFactuDescuento.setToolTipText("Duplicar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoParamFactuDescuento.setToolTipText("Copiar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoParamFactuDescuento.setToolTipText("Ver"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.setToolTipText("Nuevo Rel"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.setToolTipText("Guardar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuDescuento.setToolTipText("Salir"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuDescuento";
		inputMap = this.jButtonNuevoTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuDescuento"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoParamFactuDescuento";
		inputMap = this.jButtonDuplicarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoParamFactuDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoParamFactuDescuento"));
		
		//COPIAR
		sMapKey = "CopiarTipoParamFactuDescuento";
		inputMap = this.jButtonCopiarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoParamFactuDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoParamFactuDescuento"));
		
		//VEr FORM
		sMapKey = "VerFormTipoParamFactuDescuento";
		inputMap = this.jButtonVerFormTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoParamFactuDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoParamFactuDescuento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoParamFactuDescuento";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoParamFactuDescuento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoParamFactuDescuento";
		inputMap = this.jButtonModificarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoParamFactuDescuento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuDescuento";
		inputMap = this.jButtonCerrarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuDescuento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuDescuento";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuDescuento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoParamFactuDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoParamFactuDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoParamFactuDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoParamFactuDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoParamFactuDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoParamFactuDescuento.setName("jPanelParametrosReportesTipoParamFactuDescuento"); 
		
		this.jPanelParametrosReportesAccionesTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoParamFactuDescuento.setName("jPanelParametrosReportesAccionesTipoParamFactuDescuento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoParamFactuDescuento = new JButtonMe();
		this.jButtonRecargarInformacionTipoParamFactuDescuento.setText("Recargar");
		this.jButtonRecargarInformacionTipoParamFactuDescuento.setToolTipText("Recargar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoParamFactuDescuento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoParamFactuDescuento = new JButtonMe();
		this.jButtonProcesarInformacionTipoParamFactuDescuento.setText("Procesar");
		this.jButtonProcesarInformacionTipoParamFactuDescuento.setToolTipText("Procesar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoParamFactuDescuento.setVisible(false);
			
		this.jButtonProcesarInformacionTipoParamFactuDescuento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuDescuento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuDescuento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setText("TIPO");       
		this.jComboBoxTiposReportesTipoParamFactuDescuento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoParamFactuDescuento.setText("Accion");
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuDescuento.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoParamFactuDescuento = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuDescuento.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoParamFactuDescuento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoParamFactuDescuento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoParamFactuDescuento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoParamFactuDescuento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoParamFactuDescuento = new JButtonMe();
		//this.jButtonAnterioresTipoParamFactuDescuento.setText("<<");
        this.jButtonAnterioresTipoParamFactuDescuento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoParamFactuDescuento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoParamFactuDescuento = new JButtonMe();
		//this.jButtonSiguientesTipoParamFactuDescuento.setText(">>");
        this.jButtonSiguientesTipoParamFactuDescuento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoParamFactuDescuento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento,"nuevoguardarcambios_button","Nue",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoParamFactuDescuento";
		inputMap = this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoParamFactuDescuento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoParamFactuDescuento";
		inputMap = this.jButtonRecargarInformacionTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoParamFactuDescuento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoParamFactuDescuento";
		inputMap = this.jButtonSiguientesTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoParamFactuDescuento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoParamFactuDescuento";
		inputMap = this.jButtonAnterioresTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoParamFactuDescuento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoParamFactuDescuento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoParamFactuDescuento.setMinimumSize(new Dimension(this.getWidth(),TipoParamFactuDescuentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuDescuentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuDescuento.setMaximumSize(new Dimension(this.getWidth(),TipoParamFactuDescuentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuDescuentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuDescuento.setPreferredSize(new Dimension(this.getWidth(),TipoParamFactuDescuentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuDescuentoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoParamFactuDescuento = new GridBagLayout();

			this.jPanelPaginacionTipoParamFactuDescuento.setLayout(gridaBagLayoutPaginacionTipoParamFactuDescuento);						
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonAnterioresTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
					
						
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
			
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
						
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonSiguientesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonNuevoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
						
			
			
			if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
				this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonGuardarCambiosTablaTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			}
			
			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonDuplicarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonCopiarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonVerFormTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoParamFactuDescuento.add(this.jButtonCerrarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuDescuento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuDescuento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuDescuento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoParamFactuDescuento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuDescuento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuDescuento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoParamFactuDescuento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuDescuento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuDescuento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoParamFactuDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoParamFactuDescuento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoParamFactuDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoParamFactuDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoParamFactuDescuento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoParamFactuDescuento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoParamFactuDescuento.setLayout(gridaBagParametrosReportesTipoParamFactuDescuento);
			this.jPanelParametrosReportesAccionesTipoParamFactuDescuento.setLayout(gridaBagParametrosReportesAccionesTipoParamFactuDescuento);
			
			
			this.jPanelParametrosAuxiliar1TipoParamFactuDescuento.setLayout(gridaBagParametrosAuxiliar1TipoParamFactuDescuento);
			this.jPanelParametrosAuxiliar2TipoParamFactuDescuento.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuDescuento);
			this.jPanelParametrosAuxiliar3TipoParamFactuDescuento.setLayout(gridaBagParametrosAuxiliar3TipoParamFactuDescuento);
			this.jPanelParametrosAuxiliar4TipoParamFactuDescuento.setLayout(gridaBagParametrosAuxiliar4TipoParamFactuDescuento);
			//this.jPanelParametrosAuxiliar5TipoParamFactuDescuento.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuDescuento);			
			
			
			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jButtonRecargarInformacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuDescuento.add(this.jComboBoxTiposPaginacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuDescuento.add(this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuDescuento.add(this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jPanelParametrosAuxiliar1TipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoParamFactuDescuento.add(this.jComboBoxTiposReportesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jPanelParametrosAuxiliar4TipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jComboBoxTiposReportesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jCheckBoxGenerarReporteTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jPanelParametrosAuxiliar2TipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jLabelAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jButtonAbrirOrderByTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jComboBoxTiposSeleccionarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
			
			
			/*
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuDescuento.add(this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);															
				
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuDescuento.add(this.jCheckBoxSeleccionadosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jPanelParametrosAuxiliar3TipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jComboBoxTiposRelacionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
				
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jComboBoxTiposAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
	
				
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuDescuento.add(this.jTextFieldValorCampoGeneralTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoParamFactuDescuento = new GridBagLayout();

			this.jScrollPanelDatosTipoParamFactuDescuento.setLayout(gridaBagLayoutDatosTipoParamFactuDescuento);
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
			
			this.jScrollPanelDatosTipoParamFactuDescuento.add(this.jTableDatosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoParamFactuDescuento.setViewportView(this.jTableDatosTipoParamFactuDescuento);
		this.jTableDatosTipoParamFactuDescuento.setFillsViewportHeight(true);
		this.jTableDatosTipoParamFactuDescuento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuDescuento= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuDescuento.setLayout(gridaBagLayoutAccionesTipoParamFactuDescuento);
		
		
		/*	
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
			
		this.jPanelAccionesTipoParamFactuDescuento.add(this.jButtonNuevoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoParamFactuDescuento= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoParamFactuDescuento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuDescuento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuDescuento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuDescuento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoParamFactuDescuento.setLayout(gridaBagLayoutBusquedaPorNombreTipoParamFactuDescuento);

		gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
		gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
		jPanelBusquedaPorNombreTipoParamFactuDescuento.add(jLabelnombreBusquedaPorNombreTipoParamFactuDescuento, gridBagConstraintsTipoParamFactuDescuento);

		gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
		gridBagConstraintsTipoParamFactuDescuento.gridx = 1;
		jPanelBusquedaPorNombreTipoParamFactuDescuento.add(jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento, gridBagConstraintsTipoParamFactuDescuento);

		gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuDescuento.gridy = 1;
		gridBagConstraintsTipoParamFactuDescuento.gridx =1;
		jPanelBusquedaPorNombreTipoParamFactuDescuento.add(jButtonBusquedaPorNombreTipoParamFactuDescuento, gridBagConstraintsTipoParamFactuDescuento);

		jTabbedPaneBusquedasTipoParamFactuDescuento.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoParamFactuDescuento);
		jTabbedPaneBusquedasTipoParamFactuDescuento.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuDescuento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuDescuento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuDescuento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;		
		//this.gridBagConstraintsTipoParamFactuDescuento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoParamFactuDescuento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;		
			this.gridBagConstraintsTipoParamFactuDescuento.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);								
		
		
		/*
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		*/		
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =0;
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuDescuento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
				
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoParamFactuDescuento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuDescuento = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoParamFactuDescuento.setLayout(gridaBagLayoutBusquedasParametrosTipoParamFactuDescuento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
			
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
			
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoParamFactuDescuento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoParamFactuDescuento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoParamFactuDescuento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoParamFactuDescuento.setName("jPanelReporteDinamicoTipoParamFactuDescuento"); 
		
		this.jPanelReporteDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoParamFactuDescuento.setLayout(gridaBagLayoutReporteDinamicoTipoParamFactuDescuento);
		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoParamFactuDescuento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuDescuento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descuentos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoParamFactuDescuento = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoParamFactuDescuento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jLabelColumnasSelectReporteTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoParamFactuDescuento = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoParamFactuDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoParamFactuDescuento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoParamFactuDescuento=new JScrollPane(this.jListColumnasSelectReporteTipoParamFactuDescuento);
			
			this.jScrollColumnasSelectReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jListColumnasSelectReporteTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jScrollColumnasSelectReporteTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoParamFactuDescuento = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoParamFactuDescuento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoParamFactuDescuento = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoParamFactuDescuento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoParamFactuDescuento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoParamFactuDescuento=new JScrollPane(this.jListRelacionesSelectReporteTipoParamFactuDescuento);
			
			this.jScrollRelacionesSelectReporteTipoParamFactuDescuento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuDescuento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuDescuento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoParamFactuDescuento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoParamFactuDescuento = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoParamFactuDescuento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jLabelGenerarExcelReporteDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento.setToolTipText("Generar EXCEL"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jComboBoxTiposReportesDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jLabelTiposArchivoReporteDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento.setToolTipText("Generar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento.setToolTipText("Cancelar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuDescuento.add(this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuDescuento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoParamFactuDescuento= new JScrollPane(jPanelReporteDinamicoTipoParamFactuDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descuentos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuDescuento);
		this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getContentPane().add(this.jScrollPanelReporteDinamicoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoParamFactuDescuento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoParamFactuDescuento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoParamFactuDescuento.setName("jPanelImportacionTipoParamFactuDescuento"); 
		
		this.jPanelImportacionTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoParamFactuDescuento.setLayout(gridaBagLayoutImportacionTipoParamFactuDescuento);
		
		
		this.jInternalFrameImportacionTipoParamFactuDescuento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoParamFactuDescuento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoParamFactuDescuento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuDescuento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoParamFactuDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuDescuento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoParamFactuDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuDescuento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuDescuento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descuentos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoParamFactuDescuento = new JLabelMe();

		this.jLabelArchivoImportacionTipoParamFactuDescuento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuDescuento.add(this.jLabelArchivoImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoParamFactuDescuento = new JFileChooser();		
		this.jFileChooserImportacionTipoParamFactuDescuento.setToolTipText("ESCOGER ARCHIVO"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoParamFactuDescuento = new JButtonMe();
		this.jButtonAbrirImportacionTipoParamFactuDescuento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoParamFactuDescuento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoParamFactuDescuento.setToolTipText("Generar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuDescuento.add(this.jButtonAbrirImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoParamFactuDescuento = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoParamFactuDescuento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuDescuento.add(this.jLabelPathArchivoImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoParamFactuDescuento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoParamFactuDescuento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuDescuento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuDescuento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuDescuento.add(this.jTextFieldPathArchivoImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoParamFactuDescuento = new JButtonMe();
		this.jButtonGenerarImportacionTipoParamFactuDescuento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoParamFactuDescuento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoParamFactuDescuento.setToolTipText("Generar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuDescuento.add(this.jButtonGenerarImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoParamFactuDescuento = new JButtonMe();
		this.jButtonCerrarImportacionTipoParamFactuDescuento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoParamFactuDescuento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoParamFactuDescuento.setToolTipText("Cancelar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuDescuento.add(this.jButtonCerrarImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoParamFactuDescuento = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoParamFactuDescuento= new JScrollPane(jPanelImportacionTipoParamFactuDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoParamFactuDescuento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoParamFactuDescuento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoParamFactuDescuento);
		this.jInternalFrameImportacionTipoParamFactuDescuento.getContentPane().add(this.jScrollPanelImportacionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoParamFactuDescuento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoParamFactuDescuento = new JButtonMe();
			this.jButtonAbrirOrderByTipoParamFactuDescuento.setText("Orden");
			this.jButtonAbrirOrderByTipoParamFactuDescuento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuDescuento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoParamFactuDescuento";
			inputMap = this.jButtonAbrirOrderByTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoParamFactuDescuento"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoParamFactuDescuento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoParamFactuDescuento.setName("jPanelOrderByTipoParamFactuDescuento"); 
			
			this.jPanelOrderByTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoParamFactuDescuento.setLayout(gridaBagLayoutOrderByTipoParamFactuDescuento);
			
			
			this.jTableDatosTipoParamFactuDescuentoOrderBy = new JTableMe();        
			this.jTableDatosTipoParamFactuDescuentoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuDescuentoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoParamFactuDescuentoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoParamFactuDescuentoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoParamFactuDescuentoOrderBy.setViewportView(this.jTableDatosTipoParamFactuDescuentoOrderBy);
			this.jTableDatosTipoParamFactuDescuentoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoParamFactuDescuentoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoParamFactuDescuento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoParamFactuDescuento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoParamFactuDescuento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoParamFactuDescuento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoParamFactuDescuento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoParamFactuDescuento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoParamFactuDescuento.setTitle("Orden");
			this.jInternalFrameOrderByTipoParamFactuDescuento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoParamFactuDescuento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoParamFactuDescuento.setResizable(true);
			this.jInternalFrameOrderByTipoParamFactuDescuento.setClosable(true);
			this.jInternalFrameOrderByTipoParamFactuDescuento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descuentos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoParamFactuDescuento.ipady =150;
				
			this.jPanelOrderByTipoParamFactuDescuento.add(jScrollPanelDatosTipoParamFactuDescuentoOrderBy, this.gridBagConstraintsTipoParamFactuDescuento);//this.jTableDatosTipoParamFactuDescuentoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoParamFactuDescuento = new JButtonMe();
			this.jButtonCerrarOrderByTipoParamFactuDescuento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoParamFactuDescuento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoParamFactuDescuento.setToolTipText("Cancelar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoParamFactuDescuento.add(this.jButtonCerrarOrderByTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoParamFactuDescuento = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoParamFactuDescuento= new JScrollPane(jPanelOrderByTipoParamFactuDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoParamFactuDescuento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoParamFactuDescuento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoParamFactuDescuento);
			
			this.jInternalFrameOrderByTipoParamFactuDescuento.getContentPane().add(this.jScrollPanelOrderByTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
		
		} else {
			this.jButtonAbrirOrderByTipoParamFactuDescuento = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoParamFactuDescuento.getRowHeight();//TipoParamFactuDescuentoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.isSelected()) {
					iHeightTable=TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuDescuento.isSelected()) {
					iHeightTable=TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuDescuentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoParamFactuDescuento!=null && this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoParamFactuDescuento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoParamFactuDescuento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoParamFactuDescuento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactudescuentos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoParamFactuDescuento> TraerTipoParamFactuDescuentoBeans(List<TipoParamFactuDescuento> tipoparamfactudescuentos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoParamFactuDescuento tipoparamfactudescuento:tipoparamfactudescuentos) {
					
				if(!(TipoParamFactuDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoParamFactuDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoparamfactudescuento.setsDetalleGeneralEntityReporte(TipoParamFactuDescuentoConstantesFunciones.getTipoParamFactuDescuentoDescripcion(tipoparamfactudescuento));
										
						
					
						
					
				} else  {
							
					//tipoparamfactudescuento.setsDetalleGeneralEntityReporte(tipoparamfactudescuento.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoparamfactudescuentobeans.add(tipoparamfactudescuentobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoparamfactudescuentos;
    }
	//PARA REPORTES FIN
}
