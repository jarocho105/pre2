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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoPrioridadPedidoConstantesFunciones;

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
public class TipoPrioridadPedidoJInternalFrame extends TipoPrioridadPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPrioridadPedido;
	
	protected JMenuBar jmenuBarTipoPrioridadPedido;
	
	protected JMenu jmenuTipoPrioridadPedido;
	protected JMenu jmenuDatosTipoPrioridadPedido;
	protected JMenu jmenuArchivoTipoPrioridadPedido;
	protected JMenu jmenuAccionesTipoPrioridadPedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrioridadPedido;	
	protected GridBagConstraints gridBagConstraintsTipoPrioridadPedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPrioridadPedidoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPrioridadPedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPrioridadPedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPrioridadPedido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoPrioridadPedidoSessionBean tipoprioridadpedidoSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPrioridadPedido> tipoprioridadpedidos;		
	public List<TipoPrioridadPedido> tipoprioridadpedidosEliminados;	
	public List<TipoPrioridadPedido> tipoprioridadpedidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPrioridadPedido;		
	protected JButton jButtonAbrirOrderByTipoPrioridadPedido;
	
	
	//protected JPanel jPanelOrderByTipoPrioridadPedido;
	//public JScrollPane jScrollPanelOrderByTipoPrioridadPedido;	
	//protected JButton jButtonCerrarOrderByTipoPrioridadPedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPrioridadPedidoLogic tipoprioridadpedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPrioridadPedido;
	public JScrollPane jScrollPanelDatosEdicionTipoPrioridadPedido;
	public JScrollPane jScrollPanelDatosGeneralTipoPrioridadPedido;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPrioridadPedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPrioridadPedido;
	//public JScrollPane jScrollPanelImportacionTipoPrioridadPedido;
	
	
	
	protected JPanel jPanelAccionesTipoPrioridadPedido;
	
    protected JPanel jPanelPaginacionTipoPrioridadPedido;
    protected JPanel jPanelParametrosReportesTipoPrioridadPedido;
	protected JPanel jPanelParametrosReportesAccionesTipoPrioridadPedido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPrioridadPedido;
	protected JPanel jPanelParametrosAuxiliar2TipoPrioridadPedido;
	protected JPanel jPanelParametrosAuxiliar3TipoPrioridadPedido;
	protected JPanel jPanelParametrosAuxiliar4TipoPrioridadPedido;
	//protected JPanel jPanelParametrosAuxiliar5TipoPrioridadPedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPrioridadPedido;
	//protected JPanel jPanelImportacionTipoPrioridadPedido;
	
	
	public JTable jTableDatosTipoPrioridadPedido;
	
	
	
	//public JTable jTableDatosTipoPrioridadPedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPrioridadPedido;
	protected JButton jButtonDuplicarTipoPrioridadPedido;
	protected JButton jButtonCopiarTipoPrioridadPedido;
	protected JButton jButtonVerFormTipoPrioridadPedido;
	protected JButton jButtonNuevoRelacionesTipoPrioridadPedido;
	protected JButton jButtonModificarTipoPrioridadPedido;
	
    protected JButton jButtonGuardarCambiosTablaTipoPrioridadPedido;
	protected JButton jButtonCerrarTipoPrioridadPedido;
	
	
	protected JButton jButtonRecargarInformacionTipoPrioridadPedido;
	protected JButton jButtonProcesarInformacionTipoPrioridadPedido;
	
	
	protected JButton jButtonAnterioresTipoPrioridadPedido;
	protected JButton jButtonSiguientesTipoPrioridadPedido;
	protected JButton jButtonNuevoGuardarCambiosTipoPrioridadPedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPrioridadPedido;
	//protected JButton jButtonCerrarReporteDinamicoTipoPrioridadPedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPrioridadPedido;
	//protected JButton jButtonGenerarImportacionTipoPrioridadPedido;
	//protected JButton jButtonCerrarImportacionTipoPrioridadPedido;
	//protected JFileChooser jFileChooserImportacionTipoPrioridadPedido;
	//protected File fileImportacionTipoPrioridadPedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrioridadPedido;
	protected JButton jButtonDuplicarToolBarTipoPrioridadPedido;
	protected JButton jButtonNuevoRelacionesToolBarTipoPrioridadPedido;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPrioridadPedido;
	protected JButton jButtonCopiarToolBarTipoPrioridadPedido;
	protected JButton jButtonVerFormToolBarTipoPrioridadPedido;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrioridadPedido;
	protected JButton jButtonCerrarToolBarTipoPrioridadPedido;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPrioridadPedido;
	protected JButton jButtonProcesarInformacionToolBarTipoPrioridadPedido;
	protected JButton jButtonAnterioresToolBarTipoPrioridadPedido;
	protected JButton jButtonSiguientesToolBarTipoPrioridadPedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPrioridadPedido;
	protected JButton jButtonAbrirOrderByToolBarTipoPrioridadPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrioridadPedido;
	protected JMenuItem jMenuItemDuplicarTipoPrioridadPedido;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPrioridadPedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPrioridadPedido;
	protected JMenuItem jMenuItemCopiarTipoPrioridadPedido;
	protected JMenuItem jMenuItemVerFormTipoPrioridadPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrioridadPedido;
	protected JMenuItem jMenuItemCerrarTipoPrioridadPedido;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrioridadPedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPrioridadPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrioridadPedido;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPrioridadPedido;
	protected JMenuItem jMenuItemProcesarInformacionTipoPrioridadPedido;
	protected JMenuItem jMenuItemAnterioresTipoPrioridadPedido;
	protected JMenuItem jMenuItemSiguientesTipoPrioridadPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrioridadPedido;
	protected JMenuItem jMenuItemAbrirOrderByTipoPrioridadPedido;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrioridadPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrioridadPedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPrioridadPedido;
	protected JCheckBox jCheckBoxSeleccionadosTipoPrioridadPedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPrioridadPedido;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPrioridadPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPrioridadPedido;
	protected JTextField jTextFieldValorCampoGeneralTipoPrioridadPedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPrioridadPedido;
	//public JList<Reporte> jListColumnasSelectReporteTipoPrioridadPedido;
	//public JScrollPane jScrollColumnasSelectReporteTipoPrioridadPedido;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPrioridadPedido;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPrioridadPedido;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPrioridadPedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPrioridadPedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPrioridadPedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido;
	
		
	//public JLabel jLabelArchivoImportacionTipoPrioridadPedido;	
	//public JLabel jLabelPathArchivoImportacionTipoPrioridadPedido;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPrioridadPedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPrioridadPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPrioridadPedido;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPrioridadPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPrioridadPedido;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPrioridadPedido;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPrioridadPedido;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPrioridadPedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPrioridadPedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPrioridadPedido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPrioridadPedido;
	public JPanel jPanelBusquedaPorNombreTipoPrioridadPedido;
	public JButton jButtonBusquedaPorNombreTipoPrioridadPedido;
	public JPanel jPanelFK_IdPaisTipoPrioridadPedido;
	public JButton jButtonFK_IdPaisTipoPrioridadPedido;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoPrioridadPedido;
	public JLabel jLabelnombreBusquedaPorNombreTipoPrioridadPedido;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoPrioridadPedido;
	public JButton jButtonnombreBusquedaPorNombreTipoPrioridadPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoPrioridadPedido;
	public JLabel jLabelid_paisFK_IdPaisTipoPrioridadPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoPrioridadPedido;
	public JButton jButtonid_paisFK_IdPaisTipoPrioridadPedido= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoPrioridadPedidoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoPrioridadPedidoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoPrioridadPedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadPedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPrioridadPedido)	{
		this.jButtonRecargarInformacionTipoPrioridadPedido = jButtonRecargarInformacionTipoPrioridadPedido;
	}
	
	public JButton getjButtonProcesarInformacionTipoPrioridadPedido() {
		return this.jButtonProcesarInformacionTipoPrioridadPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrioridadPedido)	{
		this.jButtonProcesarInformacionTipoPrioridadPedido = jButtonProcesarInformacionTipoPrioridadPedido;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPrioridadPedido() {
		return this.jButtonRecargarInformacionTipoPrioridadPedido;
	}
	
	
	public List<TipoPrioridadPedido> gettipoprioridadpedidos() {
		return this.tipoprioridadpedidos;
	}

	public void settipoprioridadpedidos(List<TipoPrioridadPedido> tipoprioridadpedidos) {
		this.tipoprioridadpedidos = tipoprioridadpedidos;
	}
	
	public List<TipoPrioridadPedido> gettipoprioridadpedidosAux() {
		return this.tipoprioridadpedidosAux;
	}

	public void settipoprioridadpedidosAux(List<TipoPrioridadPedido> tipoprioridadpedidosAux) {
		this.tipoprioridadpedidosAux = tipoprioridadpedidosAux;
	}
	
	public List<TipoPrioridadPedido> gettipoprioridadpedidosEliminados() {
		return this.tipoprioridadpedidosEliminados;
	}

	public void setTipoPrioridadPedidosEliminados(List<TipoPrioridadPedido> tipoprioridadpedidosEliminados) {
		this.tipoprioridadpedidosEliminados = tipoprioridadpedidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPrioridadPedido() {
		return jComboBoxTiposSeleccionarTipoPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPrioridadPedido(
			JComboBox jComboBoxTiposSeleccionarTipoPrioridadPedido) {
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido = jComboBoxTiposSeleccionarTipoPrioridadPedido;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPrioridadPedido() {
		return jTextFieldValorCampoGeneralTipoPrioridadPedido;
	}

	public void setjTextFieldValorCampoGeneralTipoPrioridadPedido(
			JTextField jTextFieldValorCampoGeneralTipoPrioridadPedido) {
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido = jTextFieldValorCampoGeneralTipoPrioridadPedido;
	}

	public void setBorderResaltarValorCampoGeneralTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPrioridadPedido() {
		return this.jCheckBoxSeleccionarTodosTipoPrioridadPedido;
	}

	public void setjCheckBoxSeleccionarTodosTipoPrioridadPedido(
			JCheckBox jCheckBoxSeleccionarTodosTipoPrioridadPedido) {
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido = jCheckBoxSeleccionarTodosTipoPrioridadPedido;
	}

	public void setBorderResaltarSeleccionarTodosTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPrioridadPedido() {
		return this.jCheckBoxSeleccionadosTipoPrioridadPedido;
	}

	public void setjCheckBoxSeleccionadosTipoPrioridadPedido(
			JCheckBox jCheckBoxSeleccionadosTipoPrioridadPedido) {
		this.jCheckBoxSeleccionadosTipoPrioridadPedido = jCheckBoxSeleccionadosTipoPrioridadPedido;
	}
	
	public void setBorderResaltarSeleccionadosTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPrioridadPedido() {
		return this.jComboBoxTiposArchivosReportesTipoPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPrioridadPedido(
			JComboBox jComboBoxTiposArchivosReportesTipoPrioridadPedido) {
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido = jComboBoxTiposArchivosReportesTipoPrioridadPedido;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPrioridadPedido() {
		return this.jComboBoxTiposReportesTipoPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPrioridadPedido(
			JComboBox jComboBoxTiposReportesTipoPrioridadPedido) {
		this.jComboBoxTiposReportesTipoPrioridadPedido = jComboBoxTiposReportesTipoPrioridadPedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPrioridadPedido() {
	//	return jComboBoxTiposReportesDinamicoTipoPrioridadPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPrioridadPedido(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPrioridadPedido) {
	//	this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido = jComboBoxTiposReportesDinamicoTipoPrioridadPedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido = jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido;
	//}
	
	public void setBorderResaltarTiposReportesTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPrioridadPedido() {
		return this.jComboBoxTiposGraficosReportesTipoPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPrioridadPedido(
			JComboBox jComboBoxTiposGraficosReportesTipoPrioridadPedido) {
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido = jComboBoxTiposGraficosReportesTipoPrioridadPedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPrioridadPedido() {
		return this.jComboBoxTiposPaginacionTipoPrioridadPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPrioridadPedido(
			JComboBox jComboBoxTiposPaginacionTipoPrioridadPedido) {
		this.jComboBoxTiposPaginacionTipoPrioridadPedido = jComboBoxTiposPaginacionTipoPrioridadPedido;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPrioridadPedido() {
		return this.jComboBoxTiposRelacionesTipoPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrioridadPedido() {
		return this.jComboBoxTiposAccionesTipoPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrioridadPedido(
			JComboBox jComboBoxTiposRelacionesTipoPrioridadPedido) {
		this.jComboBoxTiposRelacionesTipoPrioridadPedido = jComboBoxTiposRelacionesTipoPrioridadPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrioridadPedido(
			JComboBox jComboBoxTiposAccionesTipoPrioridadPedido) {
		this.jComboBoxTiposAccionesTipoPrioridadPedido = jComboBoxTiposAccionesTipoPrioridadPedido;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPrioridadPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPrioridadPedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPrioridadPedido() {
	//	return jCheckBoxConGraficoDinamicoTipoPrioridadPedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPrioridadPedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPrioridadPedido) {
	//	this.jCheckBoxConGraficoDinamicoTipoPrioridadPedido = jCheckBoxConGraficoDinamicoTipoPrioridadPedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPrioridadPedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPrioridadPedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPrioridadPedido .setBorder(borderResaltar);		
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
		this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
		
		this.tipoprioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrioridadPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrioridadPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prioridad Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPrioridadPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPrioridadPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPrioridadPedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"nuevo","nuevo","Nuevo"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"duplicar","duplicar","Duplicar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"copiar","copiar","Copiar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"ver_form","ver_form","Ver"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"recargar","recargar","Recargar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPrioridadPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,
							"cerrar","cerrar","Salir"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPrioridadPedido;
			
				this.jButtonProcesarInformacionToolBarTipoPrioridadPedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPrioridadPedido;
				
		//protected JButton jButtonModificarToolBarTipoPrioridadPedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPrioridadPedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPrioridadPedido=new JMenuMe("General");
		this.jmenuArchivoTipoPrioridadPedido=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPrioridadPedido=new JMenuMe("Acciones");
		this.jmenuDatosTipoPrioridadPedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrioridadPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrioridadPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrioridadPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPrioridadPedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPrioridadPedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPrioridadPedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPrioridadPedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPrioridadPedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPrioridadPedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPrioridadPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrioridadPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrioridadPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPrioridadPedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPrioridadPedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPrioridadPedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPrioridadPedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPrioridadPedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPrioridadPedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrioridadPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrioridadPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrioridadPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPrioridadPedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPrioridadPedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPrioridadPedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPrioridadPedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPrioridadPedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPrioridadPedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPrioridadPedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPrioridadPedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPrioridadPedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPrioridadPedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPrioridadPedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPrioridadPedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPrioridadPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPrioridadPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPrioridadPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPrioridadPedido.add(this.jMenuItemCerrarTipoPrioridadPedido);
			
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemNuevoTipoPrioridadPedido);
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido);
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemNuevoRelacionesTipoPrioridadPedido);
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido);		
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemDuplicarTipoPrioridadPedido);		
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemCopiarTipoPrioridadPedido);		
			this.jmenuAccionesTipoPrioridadPedido.add(this.jMenuItemVerFormTipoPrioridadPedido);		
			
			this.jmenuDatosTipoPrioridadPedido.add(this.jMenuItemRecargarInformacionTipoPrioridadPedido);				
			this.jmenuDatosTipoPrioridadPedido.add(this.jMenuItemAnterioresTipoPrioridadPedido);				
			this.jmenuDatosTipoPrioridadPedido.add(this.jMenuItemSiguientesTipoPrioridadPedido);				
			this.jmenuDatosTipoPrioridadPedido.add(this.jMenuItemAbrirOrderByTipoPrioridadPedido);				
			this.jmenuDatosTipoPrioridadPedido.add(this.jMenuItemMostrarOcultarTipoPrioridadPedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPrioridadPedido.add(this.jMenuItemGuardarCambiosTipoPrioridadPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPrioridadPedido.add(this.jmenuArchivoTipoPrioridadPedido);		
			this.jmenuBarTipoPrioridadPedido.add(this.jmenuAccionesTipoPrioridadPedido);		
			this.jmenuBarTipoPrioridadPedido.add(this.jmenuDatosTipoPrioridadPedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPrioridadPedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPrioridadPedido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoPrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoPrioridadPedido.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoPrioridadPedido= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoPrioridadPedido.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoPrioridadPedido.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoPrioridadPedido,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoPrioridadPedido = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoPrioridadPedido.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoPrioridadPedido.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoPrioridadPedido= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoPrioridadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoPrioridadPedido.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoPrioridadPedido= new JButtonMe();
		this.jButtonFK_IdPaisTipoPrioridadPedido.setText("Buscar");
		this.jButtonFK_IdPaisTipoPrioridadPedido.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoPrioridadPedido,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoPrioridadPedido = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoPrioridadPedido.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoPrioridadPedido.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoPrioridadPedido= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoPrioridadPedido=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPrioridadPedido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrioridadPedido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrioridadPedido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPrioridadPedido = new TipoPrioridadPedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Prioridad Pedido DATOS");
			this.jInternalFrameDetalleFormTipoPrioridadPedido = new TipoPrioridadPedidoDetalleFormJInternalFrame(jDesktopPane,this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones(),this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPrioridadPedido = null;//new TipoPrioridadPedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrioridadPedido= new GridBagLayout();
		
		
		this.jTableDatosTipoPrioridadPedido = new JTableMe();      
		
		String sToolTipTipoPrioridadPedido="";
		sToolTipTipoPrioridadPedido=TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrioridadPedido+="(Inventario.TipoPrioridadPedido)";
		}
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrioridadPedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPrioridadPedido.setToolTipText(sToolTipTipoPrioridadPedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPrioridadPedido);
		this.jTableDatosTipoPrioridadPedido.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPrioridadPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPrioridadPedido.setRowSelectionAllowed(true);
		this.jTableDatosTipoPrioridadPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPrioridadPedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPrioridadPedido = new JButtonMe();
		this.jButtonDuplicarTipoPrioridadPedido = new JButtonMe();
		this.jButtonCopiarTipoPrioridadPedido = new JButtonMe();
		this.jButtonVerFormTipoPrioridadPedido = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPrioridadPedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido = new JButtonMe();
		this.jButtonCerrarTipoPrioridadPedido = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrioridadPedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPrioridadPedido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prioridad Pedido";
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrioridadPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrioridadPedido.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrioridadPedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPrioridadPedido=new ReporteDinamicoJInternalFrame(TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPrioridadPedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPrioridadPedido=new ImportacionJInternalFrame(TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPrioridadPedido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPrioridadPedido = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPrioridadPedido.setText("Orden");
		this.jButtonAbrirOrderByTipoPrioridadPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrioridadPedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadPedido,false,this);
			
			//this.cargarOrderByTipoPrioridadPedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadPedido,true,this);
			
			//this.cargarOrderByTipoPrioridadPedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPrioridadPedido.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPrioridadPedido.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPrioridadPedido.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPrioridadPedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrioridadPedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrioridadPedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPrioridadPedido.setText("Nuevo");
		this.jButtonDuplicarTipoPrioridadPedido.setText("Duplicar");
		this.jButtonCopiarTipoPrioridadPedido.setText("Copiar");
		this.jButtonVerFormTipoPrioridadPedido.setText("Ver");
		this.jButtonNuevoRelacionesTipoPrioridadPedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.setText("Guardar");
		this.jButtonCerrarTipoPrioridadPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrioridadPedido,"nuevo_button","Nuevo",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPrioridadPedido,"duplicar_button","Duplicar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPrioridadPedido,"copiar_button","Copiar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPrioridadPedido,"ver_form","Ver",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPrioridadPedido,"nuevorelaciones_button","Nuevo Rel",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrioridadPedido,"guardarcambiostabla_button","Guardar",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrioridadPedido,"cerrar_button","Salir",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPrioridadPedido.setToolTipText("Nuevo"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPrioridadPedido.setToolTipText("Duplicar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPrioridadPedido.setToolTipText("Copiar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPrioridadPedido.setToolTipText("Ver"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPrioridadPedido.setToolTipText("Nuevo Rel"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.setToolTipText("Guardar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrioridadPedido.setToolTipText("Salir"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrioridadPedido";
		inputMap = this.jButtonNuevoTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrioridadPedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPrioridadPedido";
		inputMap = this.jButtonDuplicarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPrioridadPedido"));
		
		//COPIAR
		sMapKey = "CopiarTipoPrioridadPedido";
		inputMap = this.jButtonCopiarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPrioridadPedido"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPrioridadPedido";
		inputMap = this.jButtonVerFormTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPrioridadPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPrioridadPedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPrioridadPedido";
		inputMap = this.jButtonNuevoRelacionesTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPrioridadPedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPrioridadPedido";
		inputMap = this.jButtonModificarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPrioridadPedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPrioridadPedido";
		inputMap = this.jButtonCerrarTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrioridadPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrioridadPedido";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrioridadPedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPrioridadPedido.setName("jPanelParametrosReportesTipoPrioridadPedido"); 
		
		this.jPanelParametrosReportesAccionesTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPrioridadPedido.setName("jPanelParametrosReportesAccionesTipoPrioridadPedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPrioridadPedido = new JButtonMe();
		this.jButtonRecargarInformacionTipoPrioridadPedido.setText("Recargar");
		this.jButtonRecargarInformacionTipoPrioridadPedido.setToolTipText("Recargar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPrioridadPedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPrioridadPedido = new JButtonMe();
		this.jButtonProcesarInformacionTipoPrioridadPedido.setText("Procesar");
		this.jButtonProcesarInformacionTipoPrioridadPedido.setToolTipText("Procesar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPrioridadPedido.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPrioridadPedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrioridadPedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrioridadPedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPrioridadPedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPrioridadPedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPrioridadPedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPrioridadPedido.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPrioridadPedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrioridadPedido.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPrioridadPedido.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPrioridadPedido = new JLabelMe();
		
		this.jLabelAccionesTipoPrioridadPedido.setText("Acciones");		
		this.jLabelAccionesTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPrioridadPedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPrioridadPedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPrioridadPedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPrioridadPedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPrioridadPedido.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPrioridadPedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPrioridadPedido = new JButtonMe();
		//this.jButtonAnterioresTipoPrioridadPedido.setText("<<");
        this.jButtonAnterioresTipoPrioridadPedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPrioridadPedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPrioridadPedido = new JButtonMe();
		//this.jButtonSiguientesTipoPrioridadPedido.setText(">>");
        this.jButtonSiguientesTipoPrioridadPedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPrioridadPedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadPedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPrioridadPedido,"nuevoguardarcambios_button","Nue",this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPrioridadPedido";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPrioridadPedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPrioridadPedido";
		inputMap = this.jButtonRecargarInformacionTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPrioridadPedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPrioridadPedido";
		inputMap = this.jButtonSiguientesTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPrioridadPedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPrioridadPedido";
		inputMap = this.jButtonAnterioresTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPrioridadPedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPrioridadPedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPrioridadPedido.setMinimumSize(new Dimension(this.getWidth(),TipoPrioridadPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrioridadPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrioridadPedido.setMaximumSize(new Dimension(this.getWidth(),TipoPrioridadPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrioridadPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrioridadPedido.setPreferredSize(new Dimension(this.getWidth(),TipoPrioridadPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrioridadPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPrioridadPedido = new GridBagLayout();

			this.jPanelPaginacionTipoPrioridadPedido.setLayout(gridaBagLayoutPaginacionTipoPrioridadPedido);						
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonAnterioresTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
					
						
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
			
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonNuevoGuardarCambiosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
						
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonSiguientesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 1;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonNuevoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
						
			
			
			if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrioridadPedido.gridy = 1;
				this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonGuardarCambiosTablaTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			}
			
			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 1;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonDuplicarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 1;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonCopiarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 1;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonVerFormTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 1;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPrioridadPedido.add(this.jButtonCerrarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
		
		
		this.jButtonRecargarInformacionTipoPrioridadPedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrioridadPedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrioridadPedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPrioridadPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrioridadPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrioridadPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPrioridadPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrioridadPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrioridadPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPrioridadPedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrioridadPedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrioridadPedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPrioridadPedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrioridadPedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrioridadPedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPrioridadPedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPrioridadPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPrioridadPedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPrioridadPedido.setLayout(gridaBagParametrosReportesTipoPrioridadPedido);
			this.jPanelParametrosReportesAccionesTipoPrioridadPedido.setLayout(gridaBagParametrosReportesAccionesTipoPrioridadPedido);
			
			
			this.jPanelParametrosAuxiliar1TipoPrioridadPedido.setLayout(gridaBagParametrosAuxiliar1TipoPrioridadPedido);
			this.jPanelParametrosAuxiliar2TipoPrioridadPedido.setLayout(gridaBagParametrosAuxiliar2TipoPrioridadPedido);
			this.jPanelParametrosAuxiliar3TipoPrioridadPedido.setLayout(gridaBagParametrosAuxiliar3TipoPrioridadPedido);
			this.jPanelParametrosAuxiliar4TipoPrioridadPedido.setLayout(gridaBagParametrosAuxiliar4TipoPrioridadPedido);
			//this.jPanelParametrosAuxiliar5TipoPrioridadPedido.setLayout(gridaBagParametrosAuxiliar2TipoPrioridadPedido);			
			
			
			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jButtonRecargarInformacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrioridadPedido.add(this.jComboBoxTiposPaginacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrioridadPedido.add(this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrioridadPedido.add(this.jComboBoxTiposArchivosReportesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jPanelParametrosAuxiliar1TipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPrioridadPedido.add(this.jComboBoxTiposReportesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jPanelParametrosAuxiliar4TipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jComboBoxTiposReportesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jCheckBoxGenerarReporteTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jPanelParametrosAuxiliar2TipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jLabelAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jButtonAbrirOrderByTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jComboBoxTiposSeleccionarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
			
			
			/*
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jCheckBoxSeleccionarTodosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrioridadPedido.add(this.jCheckBoxSeleccionarTodosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);															
				
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrioridadPedido.add(this.jCheckBoxSeleccionadosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jPanelParametrosAuxiliar3TipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadPedido.add(this.jComboBoxTiposAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPrioridadPedido = new GridBagLayout();

			this.jScrollPanelDatosTipoPrioridadPedido.setLayout(gridaBagLayoutDatosTipoPrioridadPedido);
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
			
			this.jScrollPanelDatosTipoPrioridadPedido.add(this.jTableDatosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPrioridadPedido.setViewportView(this.jTableDatosTipoPrioridadPedido);
		this.jTableDatosTipoPrioridadPedido.setFillsViewportHeight(true);
		this.jTableDatosTipoPrioridadPedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPrioridadPedido= new GridBagLayout();
		this.jPanelAccionesTipoPrioridadPedido.setLayout(gridaBagLayoutAccionesTipoPrioridadPedido);
		
		
		/*	
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
			
		this.jPanelAccionesTipoPrioridadPedido.add(this.jButtonNuevoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoPrioridadPedido= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoPrioridadPedido.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoPrioridadPedido.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoPrioridadPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoPrioridadPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoPrioridadPedido.setLayout(gridaBagLayoutBusquedaPorNombreTipoPrioridadPedido);

		gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		gridBagConstraintsTipoPrioridadPedido.gridx = 0;
		jPanelBusquedaPorNombreTipoPrioridadPedido.add(jLabelnombreBusquedaPorNombreTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);

		gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		gridBagConstraintsTipoPrioridadPedido.gridx = 1;
		jPanelBusquedaPorNombreTipoPrioridadPedido.add(jTextAreanombreBusquedaPorNombreTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);

		gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrioridadPedido.gridy = 1;
		gridBagConstraintsTipoPrioridadPedido.gridx =1;
		jPanelBusquedaPorNombreTipoPrioridadPedido.add(jButtonBusquedaPorNombreTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);

		jTabbedPaneBusquedasTipoPrioridadPedido.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoPrioridadPedido);
		jTabbedPaneBusquedasTipoPrioridadPedido.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoPrioridadPedido= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoPrioridadPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoPrioridadPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoPrioridadPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoPrioridadPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoPrioridadPedido.setLayout(gridaBagLayoutFK_IdPaisTipoPrioridadPedido);

		gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		gridBagConstraintsTipoPrioridadPedido.gridx = 0;
		jPanelFK_IdPaisTipoPrioridadPedido.add(jLabelid_paisFK_IdPaisTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);

		gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrioridadPedido.gridy = 0;
		gridBagConstraintsTipoPrioridadPedido.gridx = 1;
		jPanelFK_IdPaisTipoPrioridadPedido.add(jComboBoxid_paisFK_IdPaisTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);

		gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrioridadPedido.gridy = 1;
		gridBagConstraintsTipoPrioridadPedido.gridx =1;
		jPanelFK_IdPaisTipoPrioridadPedido.add(jButtonFK_IdPaisTipoPrioridadPedido, gridBagConstraintsTipoPrioridadPedido);

		jTabbedPaneBusquedasTipoPrioridadPedido.addTab("2.-Por Pais ", jPanelFK_IdPaisTipoPrioridadPedido);
		jTabbedPaneBusquedasTipoPrioridadPedido.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrioridadPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrioridadPedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;		
			//this.gridBagConstraintsTipoPrioridadPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrioridadPedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;		
		//this.gridBagConstraintsTipoPrioridadPedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPrioridadPedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPrioridadPedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;		
			this.gridBagConstraintsTipoPrioridadPedido.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoPrioridadPedido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);								
		
		
		/*
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		*/		
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrioridadPedido.gridx =0;
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrioridadPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
				
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPrioridadPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrioridadPedido = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPrioridadPedido.setLayout(gridaBagLayoutBusquedasParametrosTipoPrioridadPedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPrioridadPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
			
			
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
			
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPrioridadPedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPrioridadPedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPrioridadPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPrioridadPedido.setName("jPanelReporteDinamicoTipoPrioridadPedido"); 
		
		this.jPanelReporteDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPrioridadPedido.setLayout(gridaBagLayoutReporteDinamicoTipoPrioridadPedido);
		
		
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPrioridadPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrioridadPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPrioridadPedido = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPrioridadPedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jLabelColumnasSelectReporteTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPrioridadPedido = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPrioridadPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPrioridadPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPrioridadPedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrioridadPedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrioridadPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPrioridadPedido=new JScrollPane(this.jListColumnasSelectReporteTipoPrioridadPedido);
			
			this.jScrollColumnasSelectReporteTipoPrioridadPedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrioridadPedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrioridadPedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jListColumnasSelectReporteTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jScrollColumnasSelectReporteTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPrioridadPedido = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPrioridadPedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPrioridadPedido = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPrioridadPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPrioridadPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPrioridadPedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrioridadPedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrioridadPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPrioridadPedido=new JScrollPane(this.jListRelacionesSelectReporteTipoPrioridadPedido);
			
			this.jScrollRelacionesSelectReporteTipoPrioridadPedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrioridadPedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrioridadPedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoPrioridadPedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPrioridadPedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPrioridadPedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jLabelGenerarExcelReporteDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido.setToolTipText("Generar EXCEL"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jComboBoxTiposReportesDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jLabelTiposArchivoReporteDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPrioridadPedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPrioridadPedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPrioridadPedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPrioridadPedido.setToolTipText("Generar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jButtonGenerarReporteDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPrioridadPedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPrioridadPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPrioridadPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPrioridadPedido.setToolTipText("Cancelar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadPedido.add(this.jButtonCerrarReporteDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPrioridadPedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPrioridadPedido= new JScrollPane(jPanelReporteDinamicoTipoPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadPedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPrioridadPedido);
		this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPrioridadPedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPrioridadPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPrioridadPedido.setName("jPanelImportacionTipoPrioridadPedido"); 
		
		this.jPanelImportacionTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPrioridadPedido.setLayout(gridaBagLayoutImportacionTipoPrioridadPedido);
		
		
		this.jInternalFrameImportacionTipoPrioridadPedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPrioridadPedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPrioridadPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrioridadPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrioridadPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrioridadPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPrioridadPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrioridadPedido.setResizable(true);
	    this.jInternalFrameImportacionTipoPrioridadPedido.setClosable(true);
	    this.jInternalFrameImportacionTipoPrioridadPedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrioridadPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrioridadPedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPrioridadPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrioridadPedido.setResizable(true);
	    this.jInternalFrameImportacionTipoPrioridadPedido.setClosable(true);
	    this.jInternalFrameImportacionTipoPrioridadPedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPrioridadPedido = new JLabelMe();

		this.jLabelArchivoImportacionTipoPrioridadPedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrioridadPedido.add(this.jLabelArchivoImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPrioridadPedido = new JFileChooser();		
		this.jFileChooserImportacionTipoPrioridadPedido.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPrioridadPedido = new JButtonMe();
		this.jButtonAbrirImportacionTipoPrioridadPedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPrioridadPedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPrioridadPedido.setToolTipText("Generar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadPedido.add(this.jButtonAbrirImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPrioridadPedido = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPrioridadPedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPrioridadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrioridadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrioridadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrioridadPedido.add(this.jLabelPathArchivoImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPrioridadPedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPrioridadPedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrioridadPedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrioridadPedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadPedido.add(this.jTextFieldPathArchivoImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPrioridadPedido = new JButtonMe();
		this.jButtonGenerarImportacionTipoPrioridadPedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPrioridadPedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPrioridadPedido.setToolTipText("Generar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadPedido.add(this.jButtonGenerarImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPrioridadPedido = new JButtonMe();
		this.jButtonCerrarImportacionTipoPrioridadPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPrioridadPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPrioridadPedido.setToolTipText("Cancelar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadPedido.add(this.jButtonCerrarImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPrioridadPedido = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPrioridadPedido= new JScrollPane(jPanelImportacionTipoPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadPedido.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadPedido.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPrioridadPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPrioridadPedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPrioridadPedido);
		this.jInternalFrameImportacionTipoPrioridadPedido.getContentPane().add(this.jScrollPanelImportacionTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPrioridadPedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPrioridadPedido = new JButtonMe();
			this.jButtonAbrirOrderByTipoPrioridadPedido.setText("Orden");
			this.jButtonAbrirOrderByTipoPrioridadPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrioridadPedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPrioridadPedido";
			inputMap = this.jButtonAbrirOrderByTipoPrioridadPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPrioridadPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPrioridadPedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPrioridadPedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPrioridadPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPrioridadPedido.setName("jPanelOrderByTipoPrioridadPedido"); 
			
			this.jPanelOrderByTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPrioridadPedido.setLayout(gridaBagLayoutOrderByTipoPrioridadPedido);
			
			
			this.jTableDatosTipoPrioridadPedidoOrderBy = new JTableMe();        
			this.jTableDatosTipoPrioridadPedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPrioridadPedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPrioridadPedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPrioridadPedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPrioridadPedidoOrderBy.setViewportView(this.jTableDatosTipoPrioridadPedidoOrderBy);
			this.jTableDatosTipoPrioridadPedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPrioridadPedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPrioridadPedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPrioridadPedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPrioridadPedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPrioridadPedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPrioridadPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPrioridadPedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPrioridadPedido.setTitle("Orden");
			this.jInternalFrameOrderByTipoPrioridadPedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPrioridadPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPrioridadPedido.setResizable(true);
			this.jInternalFrameOrderByTipoPrioridadPedido.setClosable(true);
			this.jInternalFrameOrderByTipoPrioridadPedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPrioridadPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPrioridadPedido.ipady =150;
				
			this.jPanelOrderByTipoPrioridadPedido.add(jScrollPanelDatosTipoPrioridadPedidoOrderBy, this.gridBagConstraintsTipoPrioridadPedido);//this.jTableDatosTipoPrioridadPedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPrioridadPedido = new JButtonMe();
			this.jButtonCerrarOrderByTipoPrioridadPedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPrioridadPedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPrioridadPedido.setToolTipText("Cancelar"+" "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPrioridadPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadPedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPrioridadPedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPrioridadPedido.add(this.jButtonCerrarOrderByTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPrioridadPedido = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPrioridadPedido= new JScrollPane(jPanelOrderByTipoPrioridadPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPrioridadPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadPedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPrioridadPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrioridadPedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPrioridadPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPrioridadPedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPrioridadPedido);
			
			this.jInternalFrameOrderByTipoPrioridadPedido.getContentPane().add(this.jScrollPanelOrderByTipoPrioridadPedido, this.gridBagConstraintsTipoPrioridadPedido);			
		
		} else {
			this.jButtonAbrirOrderByTipoPrioridadPedido = new JButtonMe();
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
			&& this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPrioridadPedido.getRowHeight();//TipoPrioridadPedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.isSelected()) {
					iHeightTable=TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrioridadPedido.isSelected()) {
					iHeightTable=TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrioridadPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPrioridadPedido!=null && this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPrioridadPedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPrioridadPedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPrioridadPedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPrioridadPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrioridadPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrioridadPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprioridadpedidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPrioridadPedido> TraerTipoPrioridadPedidoBeans(List<TipoPrioridadPedido> tipoprioridadpedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPrioridadPedido tipoprioridadpedido:tipoprioridadpedidos) {
					
				if(!(TipoPrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprioridadpedido.setsDetalleGeneralEntityReporte(TipoPrioridadPedidoConstantesFunciones.getTipoPrioridadPedidoDescripcion(tipoprioridadpedido));
										
						
					
						
					
				} else  {
							
					//tipoprioridadpedido.setsDetalleGeneralEntityReporte(tipoprioridadpedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprioridadpedidobeans.add(tipoprioridadpedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprioridadpedidos;
    }
	//PARA REPORTES FIN
}
