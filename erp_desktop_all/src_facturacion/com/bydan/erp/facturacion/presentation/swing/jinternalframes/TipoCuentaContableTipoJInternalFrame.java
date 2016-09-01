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
import com.bydan.erp.facturacion.util.TipoCuentaContableTipoConstantesFunciones;

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
public class TipoCuentaContableTipoJInternalFrame extends TipoCuentaContableTipoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCuentaContableTipo;
	
	protected JMenuBar jmenuBarTipoCuentaContableTipo;
	
	protected JMenu jmenuTipoCuentaContableTipo;
	protected JMenu jmenuDatosTipoCuentaContableTipo;
	protected JMenu jmenuArchivoTipoCuentaContableTipo;
	protected JMenu jmenuAccionesTipoCuentaContableTipo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaContableTipo;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaContableTipo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCuentaContableTipoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCuentaContableTipo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCuentaContableTipo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCuentaContableTipo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCuentaContableTipo> tipocuentacontabletipos;		
	public List<TipoCuentaContableTipo> tipocuentacontabletiposEliminados;	
	public List<TipoCuentaContableTipo> tipocuentacontabletiposAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCuentaContableTipo;		
	protected JButton jButtonAbrirOrderByTipoCuentaContableTipo;
	
	
	//protected JPanel jPanelOrderByTipoCuentaContableTipo;
	//public JScrollPane jScrollPanelOrderByTipoCuentaContableTipo;	
	//protected JButton jButtonCerrarOrderByTipoCuentaContableTipo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCuentaContableTipoLogic tipocuentacontabletipoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCuentaContableTipo;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaContableTipo;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaContableTipo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCuentaContableTipoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCuentaContableTipo;
	//public JScrollPane jScrollPanelImportacionTipoCuentaContableTipo;
	
	
	
	protected JPanel jPanelAccionesTipoCuentaContableTipo;
	
    protected JPanel jPanelPaginacionTipoCuentaContableTipo;
    protected JPanel jPanelParametrosReportesTipoCuentaContableTipo;
	protected JPanel jPanelParametrosReportesAccionesTipoCuentaContableTipo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCuentaContableTipo;
	protected JPanel jPanelParametrosAuxiliar2TipoCuentaContableTipo;
	protected JPanel jPanelParametrosAuxiliar3TipoCuentaContableTipo;
	protected JPanel jPanelParametrosAuxiliar4TipoCuentaContableTipo;
	//protected JPanel jPanelParametrosAuxiliar5TipoCuentaContableTipo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCuentaContableTipo;
	//protected JPanel jPanelImportacionTipoCuentaContableTipo;
	
	
	public JTable jTableDatosTipoCuentaContableTipo;
	
	
	
	//public JTable jTableDatosTipoCuentaContableTipoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCuentaContableTipo;
	protected JButton jButtonDuplicarTipoCuentaContableTipo;
	protected JButton jButtonCopiarTipoCuentaContableTipo;
	protected JButton jButtonVerFormTipoCuentaContableTipo;
	protected JButton jButtonNuevoRelacionesTipoCuentaContableTipo;
	protected JButton jButtonModificarTipoCuentaContableTipo;
	
    protected JButton jButtonGuardarCambiosTablaTipoCuentaContableTipo;
	protected JButton jButtonCerrarTipoCuentaContableTipo;
	
	
	protected JButton jButtonRecargarInformacionTipoCuentaContableTipo;
	protected JButton jButtonProcesarInformacionTipoCuentaContableTipo;
	
	
	protected JButton jButtonAnterioresTipoCuentaContableTipo;
	protected JButton jButtonSiguientesTipoCuentaContableTipo;
	protected JButton jButtonNuevoGuardarCambiosTipoCuentaContableTipo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCuentaContableTipo;
	//protected JButton jButtonCerrarReporteDinamicoTipoCuentaContableTipo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCuentaContableTipo;
	//protected JButton jButtonGenerarImportacionTipoCuentaContableTipo;
	//protected JButton jButtonCerrarImportacionTipoCuentaContableTipo;
	//protected JFileChooser jFileChooserImportacionTipoCuentaContableTipo;
	//protected File fileImportacionTipoCuentaContableTipo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaContableTipo;
	protected JButton jButtonDuplicarToolBarTipoCuentaContableTipo;
	protected JButton jButtonNuevoRelacionesToolBarTipoCuentaContableTipo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCuentaContableTipo;
	protected JButton jButtonCopiarToolBarTipoCuentaContableTipo;
	protected JButton jButtonVerFormToolBarTipoCuentaContableTipo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaContableTipo;
	protected JButton jButtonCerrarToolBarTipoCuentaContableTipo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCuentaContableTipo;
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaContableTipo;
	protected JButton jButtonAnterioresToolBarTipoCuentaContableTipo;
	protected JButton jButtonSiguientesToolBarTipoCuentaContableTipo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCuentaContableTipo;
	protected JButton jButtonAbrirOrderByToolBarTipoCuentaContableTipo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaContableTipo;
	protected JMenuItem jMenuItemDuplicarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCuentaContableTipo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCuentaContableTipo;
	protected JMenuItem jMenuItemCopiarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemVerFormTipoCuentaContableTipo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaContableTipo;
	protected JMenuItem jMenuItemCerrarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaContableTipo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCuentaContableTipo;
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaContableTipo;
	protected JMenuItem jMenuItemAnterioresTipoCuentaContableTipo;
	protected JMenuItem jMenuItemSiguientesTipoCuentaContableTipo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo;
	protected JMenuItem jMenuItemAbrirOrderByTipoCuentaContableTipo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaContableTipo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaContableTipo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCuentaContableTipo;
	protected JCheckBox jCheckBoxSeleccionadosTipoCuentaContableTipo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCuentaContableTipo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCuentaContableTipo;
	protected JTextField jTextFieldValorCampoGeneralTipoCuentaContableTipo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCuentaContableTipo;
	//public JList<Reporte> jListColumnasSelectReporteTipoCuentaContableTipo;
	//public JScrollPane jScrollColumnasSelectReporteTipoCuentaContableTipo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCuentaContableTipo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCuentaContableTipo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCuentaContableTipo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCuentaContableTipo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaContableTipo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo;
	
		
	//public JLabel jLabelArchivoImportacionTipoCuentaContableTipo;	
	//public JLabel jLabelPathArchivoImportacionTipoCuentaContableTipo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCuentaContableTipo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCuentaContableTipo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCuentaContableTipo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCuentaContableTipo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCuentaContableTipo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCuentaContableTipo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCuentaContableTipo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCuentaContableTipo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCuentaContableTipo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCuentaContableTipo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCuentaContableTipo;
	public JPanel jPanelBusquedaPorIdTipoCuentaContableTipo;
	public JButton jButtonBusquedaPorIdTipoCuentaContableTipo;
	public JPanel jPanelBusquedaPorNombreTipoCuentaContableTipo;
	public JButton jButtonBusquedaPorNombreTipoCuentaContableTipo;
	
	public JPanel jPanelIdIdBusquedaPorIdTipoCuentaContableTipo;
	public JLabel jLabelidBusquedaPorIdTipoCuentaContableTipo;
	public JTextFieldMe jTextFieldidTipoCuentaContableTipoBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoCuentaContableTipoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoCuentaContableTipo;
	public JLabel jLabelnombreBusquedaPorNombreTipoCuentaContableTipo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo;
	public JButton jButtonnombreBusquedaPorNombreTipoCuentaContableTipoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoCuentaContableTipoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCuentaContableTipo)	{
		this.jButtonRecargarInformacionTipoCuentaContableTipo = jButtonRecargarInformacionTipoCuentaContableTipo;
	}
	
	public JButton getjButtonProcesarInformacionTipoCuentaContableTipo() {
		return this.jButtonProcesarInformacionTipoCuentaContableTipo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaContableTipo)	{
		this.jButtonProcesarInformacionTipoCuentaContableTipo = jButtonProcesarInformacionTipoCuentaContableTipo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCuentaContableTipo() {
		return this.jButtonRecargarInformacionTipoCuentaContableTipo;
	}
	
	
	public List<TipoCuentaContableTipo> gettipocuentacontabletipos() {
		return this.tipocuentacontabletipos;
	}

	public void settipocuentacontabletipos(List<TipoCuentaContableTipo> tipocuentacontabletipos) {
		this.tipocuentacontabletipos = tipocuentacontabletipos;
	}
	
	public List<TipoCuentaContableTipo> gettipocuentacontabletiposAux() {
		return this.tipocuentacontabletiposAux;
	}

	public void settipocuentacontabletiposAux(List<TipoCuentaContableTipo> tipocuentacontabletiposAux) {
		this.tipocuentacontabletiposAux = tipocuentacontabletiposAux;
	}
	
	public List<TipoCuentaContableTipo> gettipocuentacontabletiposEliminados() {
		return this.tipocuentacontabletiposEliminados;
	}

	public void setTipoCuentaContableTiposEliminados(List<TipoCuentaContableTipo> tipocuentacontabletiposEliminados) {
		this.tipocuentacontabletiposEliminados = tipocuentacontabletiposEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCuentaContableTipo() {
		return jComboBoxTiposSeleccionarTipoCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCuentaContableTipo(
			JComboBox jComboBoxTiposSeleccionarTipoCuentaContableTipo) {
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo = jComboBoxTiposSeleccionarTipoCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCuentaContableTipo() {
		return jTextFieldValorCampoGeneralTipoCuentaContableTipo;
	}

	public void setjTextFieldValorCampoGeneralTipoCuentaContableTipo(
			JTextField jTextFieldValorCampoGeneralTipoCuentaContableTipo) {
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo = jTextFieldValorCampoGeneralTipoCuentaContableTipo;
	}

	public void setBorderResaltarValorCampoGeneralTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCuentaContableTipo() {
		return this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo;
	}

	public void setjCheckBoxSeleccionarTodosTipoCuentaContableTipo(
			JCheckBox jCheckBoxSeleccionarTodosTipoCuentaContableTipo) {
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo = jCheckBoxSeleccionarTodosTipoCuentaContableTipo;
	}

	public void setBorderResaltarSeleccionarTodosTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCuentaContableTipo() {
		return this.jCheckBoxSeleccionadosTipoCuentaContableTipo;
	}

	public void setjCheckBoxSeleccionadosTipoCuentaContableTipo(
			JCheckBox jCheckBoxSeleccionadosTipoCuentaContableTipo) {
		this.jCheckBoxSeleccionadosTipoCuentaContableTipo = jCheckBoxSeleccionadosTipoCuentaContableTipo;
	}
	
	public void setBorderResaltarSeleccionadosTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCuentaContableTipo() {
		return this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposArchivosReportesTipoCuentaContableTipo) {
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo = jComboBoxTiposArchivosReportesTipoCuentaContableTipo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCuentaContableTipo() {
		return this.jComboBoxTiposReportesTipoCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposReportesTipoCuentaContableTipo) {
		this.jComboBoxTiposReportesTipoCuentaContableTipo = jComboBoxTiposReportesTipoCuentaContableTipo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCuentaContableTipo() {
	//	return jComboBoxTiposReportesDinamicoTipoCuentaContableTipo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCuentaContableTipo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCuentaContableTipo) {
	//	this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo = jComboBoxTiposReportesDinamicoTipoCuentaContableTipo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo = jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo;
	//}
	
	public void setBorderResaltarTiposReportesTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCuentaContableTipo() {
		return this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposGraficosReportesTipoCuentaContableTipo) {
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo = jComboBoxTiposGraficosReportesTipoCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCuentaContableTipo() {
		return this.jComboBoxTiposPaginacionTipoCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCuentaContableTipo(
			JComboBox jComboBoxTiposPaginacionTipoCuentaContableTipo) {
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo = jComboBoxTiposPaginacionTipoCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCuentaContableTipo() {
		return this.jComboBoxTiposRelacionesTipoCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaContableTipo() {
		return this.jComboBoxTiposAccionesTipoCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposRelacionesTipoCuentaContableTipo) {
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo = jComboBoxTiposRelacionesTipoCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposAccionesTipoCuentaContableTipo) {
		this.jComboBoxTiposAccionesTipoCuentaContableTipo = jComboBoxTiposAccionesTipoCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCuentaContableTipo() {
	//	return jCheckBoxConGraficoDinamicoTipoCuentaContableTipo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCuentaContableTipo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCuentaContableTipo) {
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaContableTipo = jCheckBoxConGraficoDinamicoTipoCuentaContableTipo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCuentaContableTipo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCuentaContableTipo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCuentaContableTipo .setBorder(borderResaltar);		
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
		this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
		
		this.tipocuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaContableTipoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Contable Tipo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCuentaContableTipo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"nuevo","nuevo","Nuevo"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"duplicar","duplicar","Duplicar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"copiar","copiar","Copiar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"ver_form","ver_form","Ver"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"recargar","recargar","Recargar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCuentaContableTipo,this.jTtoolBarTipoCuentaContableTipo,
							"cerrar","cerrar","Salir"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCuentaContableTipo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCuentaContableTipo;
			
				this.jButtonProcesarInformacionToolBarTipoCuentaContableTipo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCuentaContableTipo;
				
		//protected JButton jButtonModificarToolBarTipoCuentaContableTipo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCuentaContableTipo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCuentaContableTipo=new JMenuMe("General");
		this.jmenuArchivoTipoCuentaContableTipo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCuentaContableTipo=new JMenuMe("Acciones");
		this.jmenuDatosTipoCuentaContableTipo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaContableTipo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaContableTipo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaContableTipo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCuentaContableTipo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCuentaContableTipo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCuentaContableTipo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCuentaContableTipo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCuentaContableTipo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCuentaContableTipo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCuentaContableTipo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaContableTipo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaContableTipo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCuentaContableTipo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCuentaContableTipo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCuentaContableTipo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCuentaContableTipo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCuentaContableTipo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCuentaContableTipo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaContableTipo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaContableTipo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaContableTipo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCuentaContableTipo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCuentaContableTipo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCuentaContableTipo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCuentaContableTipo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCuentaContableTipo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCuentaContableTipo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCuentaContableTipo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCuentaContableTipo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCuentaContableTipo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCuentaContableTipo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCuentaContableTipo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCuentaContableTipo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCuentaContableTipo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCuentaContableTipo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCuentaContableTipo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCuentaContableTipo.add(this.jMenuItemCerrarTipoCuentaContableTipo);
			
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemNuevoTipoCuentaContableTipo);
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo);
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemNuevoRelacionesTipoCuentaContableTipo);
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemGuardarCambiosTablaTipoCuentaContableTipo);		
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemDuplicarTipoCuentaContableTipo);		
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemCopiarTipoCuentaContableTipo);		
			this.jmenuAccionesTipoCuentaContableTipo.add(this.jMenuItemVerFormTipoCuentaContableTipo);		
			
			this.jmenuDatosTipoCuentaContableTipo.add(this.jMenuItemRecargarInformacionTipoCuentaContableTipo);				
			this.jmenuDatosTipoCuentaContableTipo.add(this.jMenuItemAnterioresTipoCuentaContableTipo);				
			this.jmenuDatosTipoCuentaContableTipo.add(this.jMenuItemSiguientesTipoCuentaContableTipo);				
			this.jmenuDatosTipoCuentaContableTipo.add(this.jMenuItemAbrirOrderByTipoCuentaContableTipo);				
			this.jmenuDatosTipoCuentaContableTipo.add(this.jMenuItemMostrarOcultarTipoCuentaContableTipo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCuentaContableTipo.add(this.jMenuItemGuardarCambiosTipoCuentaContableTipo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCuentaContableTipo.add(this.jmenuArchivoTipoCuentaContableTipo);		
			this.jmenuBarTipoCuentaContableTipo.add(this.jmenuAccionesTipoCuentaContableTipo);		
			this.jmenuBarTipoCuentaContableTipo.add(this.jmenuDatosTipoCuentaContableTipo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCuentaContableTipo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCuentaContableTipo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdTipoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoCuentaContableTipo.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoCuentaContableTipo= new JButtonMe();
		this.jButtonBusquedaPorIdTipoCuentaContableTipo.setText("Buscar");
		this.jButtonBusquedaPorIdTipoCuentaContableTipo.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoCuentaContableTipo,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoCuentaContableTipo = new JLabelMe();
		jLabelidBusquedaPorIdTipoCuentaContableTipo.setText("Id :");
		jLabelidBusquedaPorIdTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidTipoCuentaContableTipoBusquedaPorId= new JTextFieldMe();
		jTextFieldidTipoCuentaContableTipoBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCuentaContableTipoBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCuentaContableTipoBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoCuentaContableTipo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoCuentaContableTipo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoCuentaContableTipo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoCuentaContableTipo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoCuentaContableTipo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoCuentaContableTipo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoCuentaContableTipo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoCuentaContableTipo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCuentaContableTipo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCuentaContableTipo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuentaContableTipo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCuentaContableTipo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCuentaContableTipo = new TipoCuentaContableTipoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cuenta Contable Tipo DATOS");
			this.jInternalFrameDetalleFormTipoCuentaContableTipo = new TipoCuentaContableTipoDetalleFormJInternalFrame(jDesktopPane,this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones(),this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCuentaContableTipo = null;//new TipoCuentaContableTipoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaContableTipo= new GridBagLayout();
		
		
		this.jTableDatosTipoCuentaContableTipo = new JTableMe();      
		
		String sToolTipTipoCuentaContableTipo="";
		sToolTipTipoCuentaContableTipo=TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaContableTipo+="(Facturacion.TipoCuentaContableTipo)";
		}
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaContableTipo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCuentaContableTipo.setToolTipText(sToolTipTipoCuentaContableTipo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCuentaContableTipo);
		this.jTableDatosTipoCuentaContableTipo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCuentaContableTipo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCuentaContableTipo.setRowSelectionAllowed(true);
		this.jTableDatosTipoCuentaContableTipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCuentaContableTipo = new JButtonMe();
		this.jButtonDuplicarTipoCuentaContableTipo = new JButtonMe();
		this.jButtonCopiarTipoCuentaContableTipo = new JButtonMe();
		this.jButtonVerFormTipoCuentaContableTipo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCuentaContableTipo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarTipoCuentaContableTipo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaContableTipo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCuentaContableTipo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Contable Tipo";
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Contable Tipos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaContableTipo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaContableTipo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCuentaContableTipo=new ReporteDinamicoJInternalFrame(TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCuentaContableTipo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCuentaContableTipo=new ImportacionJInternalFrame(TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCuentaContableTipo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCuentaContableTipo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCuentaContableTipo.setText("Orden");
		this.jButtonAbrirOrderByTipoCuentaContableTipo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaContableTipo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaContableTipo,false,this);
			
			//this.cargarOrderByTipoCuentaContableTipo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaContableTipo,true,this);
			
			//this.cargarOrderByTipoCuentaContableTipo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCuentaContableTipo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoCuentaContableTipo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoCuentaContableTipo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoCuentaContableTipo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaContableTipo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCuentaContableTipo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCuentaContableTipo.setText("Nuevo");
		this.jButtonDuplicarTipoCuentaContableTipo.setText("Duplicar");
		this.jButtonCopiarTipoCuentaContableTipo.setText("Copiar");
		this.jButtonVerFormTipoCuentaContableTipo.setText("Ver");
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.setText("Guardar");
		this.jButtonCerrarTipoCuentaContableTipo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaContableTipo,"nuevo_button","Nuevo",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCuentaContableTipo,"duplicar_button","Duplicar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCuentaContableTipo,"copiar_button","Copiar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCuentaContableTipo,"ver_form","Ver",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCuentaContableTipo,"nuevorelaciones_button","Nuevo Rel",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaContableTipo,"guardarcambiostabla_button","Guardar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaContableTipo,"cerrar_button","Salir",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCuentaContableTipo.setToolTipText("Nuevo"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCuentaContableTipo.setToolTipText("Duplicar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCuentaContableTipo.setToolTipText("Copiar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCuentaContableTipo.setToolTipText("Ver"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.setToolTipText("Nuevo Rel"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.setToolTipText("Guardar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaContableTipo.setToolTipText("Salir"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaContableTipo";
		inputMap = this.jButtonNuevoTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaContableTipo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCuentaContableTipo";
		inputMap = this.jButtonDuplicarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCuentaContableTipo"));
		
		//COPIAR
		sMapKey = "CopiarTipoCuentaContableTipo";
		inputMap = this.jButtonCopiarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCuentaContableTipo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCuentaContableTipo";
		inputMap = this.jButtonVerFormTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCuentaContableTipo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCuentaContableTipo";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCuentaContableTipo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCuentaContableTipo";
		inputMap = this.jButtonModificarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCuentaContableTipo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaContableTipo";
		inputMap = this.jButtonCerrarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaContableTipo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaContableTipo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaContableTipo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCuentaContableTipo.setName("jPanelParametrosReportesTipoCuentaContableTipo"); 
		
		this.jPanelParametrosReportesAccionesTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCuentaContableTipo.setName("jPanelParametrosReportesAccionesTipoCuentaContableTipo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCuentaContableTipo = new JButtonMe();
		this.jButtonRecargarInformacionTipoCuentaContableTipo.setText("Recargar");
		this.jButtonRecargarInformacionTipoCuentaContableTipo.setToolTipText("Recargar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCuentaContableTipo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCuentaContableTipo = new JButtonMe();
		this.jButtonProcesarInformacionTipoCuentaContableTipo.setText("Procesar");
		this.jButtonProcesarInformacionTipoCuentaContableTipo.setToolTipText("Procesar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCuentaContableTipo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCuentaContableTipo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaContableTipo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCuentaContableTipo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCuentaContableTipo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCuentaContableTipo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCuentaContableTipo = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaContableTipo.setText("Acciones");		
		this.jLabelAccionesTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCuentaContableTipo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCuentaContableTipo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCuentaContableTipo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCuentaContableTipo = new JButtonMe();
		//this.jButtonAnterioresTipoCuentaContableTipo.setText("<<");
        this.jButtonAnterioresTipoCuentaContableTipo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCuentaContableTipo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCuentaContableTipo = new JButtonMe();
		//this.jButtonSiguientesTipoCuentaContableTipo.setText(">>");
        this.jButtonSiguientesTipoCuentaContableTipo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCuentaContableTipo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo,"nuevoguardarcambios_button","Nue",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCuentaContableTipo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCuentaContableTipo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCuentaContableTipo";
		inputMap = this.jButtonRecargarInformacionTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCuentaContableTipo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCuentaContableTipo";
		inputMap = this.jButtonSiguientesTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCuentaContableTipo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCuentaContableTipo";
		inputMap = this.jButtonAnterioresTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCuentaContableTipo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCuentaContableTipo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCuentaContableTipo.setMinimumSize(new Dimension(this.getWidth(),TipoCuentaContableTipoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaContableTipoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaContableTipo.setMaximumSize(new Dimension(this.getWidth(),TipoCuentaContableTipoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaContableTipoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCuentaContableTipo.setPreferredSize(new Dimension(this.getWidth(),TipoCuentaContableTipoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCuentaContableTipoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCuentaContableTipo = new GridBagLayout();

			this.jPanelPaginacionTipoCuentaContableTipo.setLayout(gridaBagLayoutPaginacionTipoCuentaContableTipo);						
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonAnterioresTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
					
						
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
			
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonNuevoGuardarCambiosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
						
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonSiguientesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonNuevoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
				this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonNuevoRelacionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			}
			
			
			if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
				this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonGuardarCambiosTablaTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			}
			
			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonDuplicarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonCopiarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonVerFormTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCuentaContableTipo.add(this.jButtonCerrarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
		
		
		this.jButtonRecargarInformacionTipoCuentaContableTipo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaContableTipo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCuentaContableTipo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCuentaContableTipo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaContableTipo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCuentaContableTipo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCuentaContableTipo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCuentaContableTipo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaContableTipo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCuentaContableTipo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCuentaContableTipo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCuentaContableTipo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCuentaContableTipo.setLayout(gridaBagParametrosReportesTipoCuentaContableTipo);
			this.jPanelParametrosReportesAccionesTipoCuentaContableTipo.setLayout(gridaBagParametrosReportesAccionesTipoCuentaContableTipo);
			
			
			this.jPanelParametrosAuxiliar1TipoCuentaContableTipo.setLayout(gridaBagParametrosAuxiliar1TipoCuentaContableTipo);
			this.jPanelParametrosAuxiliar2TipoCuentaContableTipo.setLayout(gridaBagParametrosAuxiliar2TipoCuentaContableTipo);
			this.jPanelParametrosAuxiliar3TipoCuentaContableTipo.setLayout(gridaBagParametrosAuxiliar3TipoCuentaContableTipo);
			this.jPanelParametrosAuxiliar4TipoCuentaContableTipo.setLayout(gridaBagParametrosAuxiliar4TipoCuentaContableTipo);
			//this.jPanelParametrosAuxiliar5TipoCuentaContableTipo.setLayout(gridaBagParametrosAuxiliar2TipoCuentaContableTipo);			
			
			
			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jButtonRecargarInformacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaContableTipo.add(this.jComboBoxTiposPaginacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaContableTipo.add(this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCuentaContableTipo.add(this.jComboBoxTiposArchivosReportesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jPanelParametrosAuxiliar1TipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCuentaContableTipo.add(this.jComboBoxTiposReportesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jPanelParametrosAuxiliar4TipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jComboBoxTiposReportesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jCheckBoxGenerarReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jPanelParametrosAuxiliar2TipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jLabelAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jButtonAbrirOrderByTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jComboBoxTiposSeleccionarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
			
			
			/*
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaContableTipo.add(this.jCheckBoxSeleccionarTodosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);															
				
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCuentaContableTipo.add(this.jCheckBoxSeleccionadosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jPanelParametrosAuxiliar3TipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jComboBoxTiposRelacionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
				
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jComboBoxTiposAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
	
				
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCuentaContableTipo.add(this.jTextFieldValorCampoGeneralTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCuentaContableTipo = new GridBagLayout();

			this.jScrollPanelDatosTipoCuentaContableTipo.setLayout(gridaBagLayoutDatosTipoCuentaContableTipo);
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
			
			this.jScrollPanelDatosTipoCuentaContableTipo.add(this.jTableDatosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCuentaContableTipo.setViewportView(this.jTableDatosTipoCuentaContableTipo);
		this.jTableDatosTipoCuentaContableTipo.setFillsViewportHeight(true);
		this.jTableDatosTipoCuentaContableTipo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaContableTipo= new GridBagLayout();
		this.jPanelAccionesTipoCuentaContableTipo.setLayout(gridaBagLayoutAccionesTipoCuentaContableTipo);
		
		
		/*	
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
			
		this.jPanelAccionesTipoCuentaContableTipo.add(this.jButtonNuevoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdTipoCuentaContableTipo= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoCuentaContableTipo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoCuentaContableTipo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoCuentaContableTipo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoCuentaContableTipo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoCuentaContableTipo.setLayout(gridaBagLayoutBusquedaPorIdTipoCuentaContableTipo);

		gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
		jPanelBusquedaPorIdTipoCuentaContableTipo.add(jLabelidBusquedaPorIdTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);

		gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		gridBagConstraintsTipoCuentaContableTipo.gridx = 1;
		jPanelBusquedaPorIdTipoCuentaContableTipo.add(jTextFieldidTipoCuentaContableTipoBusquedaPorId, gridBagConstraintsTipoCuentaContableTipo);

		gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
		gridBagConstraintsTipoCuentaContableTipo.gridx =1;
		jPanelBusquedaPorIdTipoCuentaContableTipo.add(jButtonBusquedaPorIdTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);

		jTabbedPaneBusquedasTipoCuentaContableTipo.addTab("1.-Por Id ", jPanelBusquedaPorIdTipoCuentaContableTipo);
		jTabbedPaneBusquedasTipoCuentaContableTipo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoCuentaContableTipo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoCuentaContableTipo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCuentaContableTipo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCuentaContableTipo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoCuentaContableTipo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoCuentaContableTipo.setLayout(gridaBagLayoutBusquedaPorNombreTipoCuentaContableTipo);

		gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
		jPanelBusquedaPorNombreTipoCuentaContableTipo.add(jLabelnombreBusquedaPorNombreTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);

		gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		gridBagConstraintsTipoCuentaContableTipo.gridx = 1;
		jPanelBusquedaPorNombreTipoCuentaContableTipo.add(jTextAreanombreBusquedaPorNombreTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);

		gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCuentaContableTipo.gridy = 1;
		gridBagConstraintsTipoCuentaContableTipo.gridx =1;
		jPanelBusquedaPorNombreTipoCuentaContableTipo.add(jButtonBusquedaPorNombreTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);

		jTabbedPaneBusquedasTipoCuentaContableTipo.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoCuentaContableTipo);
		jTabbedPaneBusquedasTipoCuentaContableTipo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaContableTipo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaContableTipo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaContableTipo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;		
		//this.gridBagConstraintsTipoCuentaContableTipo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCuentaContableTipo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;		
			this.gridBagConstraintsTipoCuentaContableTipo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);								
		
		
		/*
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		*/		
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =0;
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaContableTipo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
				
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaContableTipo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCuentaContableTipo.setLayout(gridaBagLayoutBusquedasParametrosTipoCuentaContableTipo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
			
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
			
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCuentaContableTipo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCuentaContableTipo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCuentaContableTipo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCuentaContableTipo.setName("jPanelReporteDinamicoTipoCuentaContableTipo"); 
		
		this.jPanelReporteDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCuentaContableTipo.setLayout(gridaBagLayoutReporteDinamicoTipoCuentaContableTipo);
		
		
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCuentaContableTipo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaContableTipo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Contable Tipos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCuentaContableTipo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCuentaContableTipo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jLabelColumnasSelectReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCuentaContableTipo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCuentaContableTipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCuentaContableTipo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCuentaContableTipo=new JScrollPane(this.jListColumnasSelectReporteTipoCuentaContableTipo);
			
			this.jScrollColumnasSelectReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jListColumnasSelectReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jScrollColumnasSelectReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCuentaContableTipo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCuentaContableTipo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jLabelRelacionesSelectReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCuentaContableTipo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCuentaContableTipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCuentaContableTipo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCuentaContableTipo=new JScrollPane(this.jListRelacionesSelectReporteTipoCuentaContableTipo);
			
			this.jScrollRelacionesSelectReporteTipoCuentaContableTipo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaContableTipo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCuentaContableTipo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jListRelacionesSelectReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jScrollRelacionesSelectReporteTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCuentaContableTipo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCuentaContableTipo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCuentaContableTipo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jLabelGenerarExcelReporteDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo.setToolTipText("Generar EXCEL"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jButtonGenerarExcelReporteDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jComboBoxTiposReportesDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jLabelTiposArchivoReporteDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo.setToolTipText("Generar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jButtonGenerarReporteDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo.setToolTipText("Cancelar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCuentaContableTipo.add(this.jButtonCerrarReporteDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCuentaContableTipo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCuentaContableTipo= new JScrollPane(jPanelReporteDinamicoTipoCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Contable Tipos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCuentaContableTipo);
		this.jInternalFrameReporteDinamicoTipoCuentaContableTipo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCuentaContableTipo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCuentaContableTipo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCuentaContableTipo.setName("jPanelImportacionTipoCuentaContableTipo"); 
		
		this.jPanelImportacionTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCuentaContableTipo.setLayout(gridaBagLayoutImportacionTipoCuentaContableTipo);
		
		
		this.jInternalFrameImportacionTipoCuentaContableTipo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCuentaContableTipo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCuentaContableTipo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCuentaContableTipo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaContableTipo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCuentaContableTipo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setResizable(true);
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setClosable(true);
	    this.jInternalFrameImportacionTipoCuentaContableTipo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Contable Tipos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCuentaContableTipo = new JLabelMe();

		this.jLabelArchivoImportacionTipoCuentaContableTipo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaContableTipo.add(this.jLabelArchivoImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCuentaContableTipo = new JFileChooser();		
		this.jFileChooserImportacionTipoCuentaContableTipo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCuentaContableTipo = new JButtonMe();
		this.jButtonAbrirImportacionTipoCuentaContableTipo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCuentaContableTipo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCuentaContableTipo.setToolTipText("Generar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaContableTipo.add(this.jButtonAbrirImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCuentaContableTipo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCuentaContableTipo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCuentaContableTipo.add(this.jLabelPathArchivoImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCuentaContableTipo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCuentaContableTipo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaContableTipo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCuentaContableTipo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaContableTipo.add(this.jTextFieldPathArchivoImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCuentaContableTipo = new JButtonMe();
		this.jButtonGenerarImportacionTipoCuentaContableTipo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCuentaContableTipo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCuentaContableTipo.setToolTipText("Generar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaContableTipo.add(this.jButtonGenerarImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarImportacionTipoCuentaContableTipo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCuentaContableTipo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCuentaContableTipo.setToolTipText("Cancelar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCuentaContableTipo.add(this.jButtonCerrarImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCuentaContableTipo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCuentaContableTipo= new JScrollPane(jPanelImportacionTipoCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCuentaContableTipo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCuentaContableTipo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCuentaContableTipo);
		this.jInternalFrameImportacionTipoCuentaContableTipo.getContentPane().add(this.jScrollPanelImportacionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCuentaContableTipo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCuentaContableTipo = new JButtonMe();
			this.jButtonAbrirOrderByTipoCuentaContableTipo.setText("Orden");
			this.jButtonAbrirOrderByTipoCuentaContableTipo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCuentaContableTipo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCuentaContableTipo";
			inputMap = this.jButtonAbrirOrderByTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCuentaContableTipo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCuentaContableTipo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCuentaContableTipo.setName("jPanelOrderByTipoCuentaContableTipo"); 
			
			this.jPanelOrderByTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCuentaContableTipo.setLayout(gridaBagLayoutOrderByTipoCuentaContableTipo);
			
			
			this.jTableDatosTipoCuentaContableTipoOrderBy = new JTableMe();        
			this.jTableDatosTipoCuentaContableTipoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCuentaContableTipoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCuentaContableTipoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCuentaContableTipoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCuentaContableTipoOrderBy.setViewportView(this.jTableDatosTipoCuentaContableTipoOrderBy);
			this.jTableDatosTipoCuentaContableTipoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCuentaContableTipoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCuentaContableTipo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCuentaContableTipo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCuentaContableTipo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCuentaContableTipo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCuentaContableTipo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCuentaContableTipo.setTitle("Orden");
			this.jInternalFrameOrderByTipoCuentaContableTipo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCuentaContableTipo.setResizable(true);
			this.jInternalFrameOrderByTipoCuentaContableTipo.setClosable(true);
			this.jInternalFrameOrderByTipoCuentaContableTipo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Contable Tipos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCuentaContableTipo.ipady =150;
				
			this.jPanelOrderByTipoCuentaContableTipo.add(jScrollPanelDatosTipoCuentaContableTipoOrderBy, this.gridBagConstraintsTipoCuentaContableTipo);//this.jTableDatosTipoCuentaContableTipoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCuentaContableTipo = new JButtonMe();
			this.jButtonCerrarOrderByTipoCuentaContableTipo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCuentaContableTipo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCuentaContableTipo.setToolTipText("Cancelar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCuentaContableTipo.add(this.jButtonCerrarOrderByTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCuentaContableTipo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCuentaContableTipo= new JScrollPane(jPanelOrderByTipoCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCuentaContableTipo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCuentaContableTipo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCuentaContableTipo);
			
			this.jInternalFrameOrderByTipoCuentaContableTipo.getContentPane().add(this.jScrollPanelOrderByTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
		
		} else {
			this.jButtonAbrirOrderByTipoCuentaContableTipo = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCuentaContableTipo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCuentaContableTipo.getRowHeight();//TipoCuentaContableTipoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.isSelected()) {
					iHeightTable=TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCuentaContableTipo.isSelected()) {
					iHeightTable=TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCuentaContableTipo!=null && this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCuentaContableTipo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCuentaContableTipo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCuentaContableTipo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCuentaContableTipo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocuentacontabletipoLogic.getTipoCuentaContableTipos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentacontabletipos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCuentaContableTipo> TraerTipoCuentaContableTipoBeans(List<TipoCuentaContableTipo> tipocuentacontabletipos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCuentaContableTipo tipocuentacontabletipo:tipocuentacontabletipos) {
					
				if(!(TipoCuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocuentacontabletipo.setsDetalleGeneralEntityReporte(TipoCuentaContableTipoConstantesFunciones.getTipoCuentaContableTipoDescripcion(tipocuentacontabletipo));
										
						
					
					

					if(tipocuentacontabletipo.getCuentaContableTipos()!=null && Funciones.existeClass(classes,CuentaContableTipo.class)) {
						try{tipocuentacontabletipo.setcuentacontabletiposDescripcionReporte(new JRBeanCollectionDataSource(CuentaContableTipoJInternalFrame.TraerCuentaContableTipoBeans(tipocuentacontabletipo.getCuentaContableTipos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocuentacontabletipo.setsDetalleGeneralEntityReporte(tipocuentacontabletipo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocuentacontabletipobeans.add(tipocuentacontabletipobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocuentacontabletipos;
    }
	//PARA REPORTES FIN
}
