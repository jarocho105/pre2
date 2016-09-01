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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoTituloClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoTituloClienteJInternalFrame extends TipoTituloClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTituloCliente;
	
	protected JMenuBar jmenuBarTipoTituloCliente;
	
	protected JMenu jmenuTipoTituloCliente;
	protected JMenu jmenuDatosTipoTituloCliente;
	protected JMenu jmenuArchivoTipoTituloCliente;
	protected JMenu jmenuAccionesTipoTituloCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTituloCliente;	
	protected GridBagConstraints gridBagConstraintsTipoTituloCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTituloClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTituloCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTituloCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTituloCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoTituloClienteSessionBean tipotituloclienteSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTituloCliente> tipotituloclientes;		
	public List<TipoTituloCliente> tipotituloclientesEliminados;	
	public List<TipoTituloCliente> tipotituloclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTituloCliente;		
	protected JButton jButtonAbrirOrderByTipoTituloCliente;
	
	
	//protected JPanel jPanelOrderByTipoTituloCliente;
	//public JScrollPane jScrollPanelOrderByTipoTituloCliente;	
	//protected JButton jButtonCerrarOrderByTipoTituloCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTituloClienteLogic tipotituloclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTituloCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoTituloCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoTituloCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTituloClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTituloCliente;
	//public JScrollPane jScrollPanelImportacionTipoTituloCliente;
	
	
	
	protected JPanel jPanelAccionesTipoTituloCliente;
	
    protected JPanel jPanelPaginacionTipoTituloCliente;
    protected JPanel jPanelParametrosReportesTipoTituloCliente;
	protected JPanel jPanelParametrosReportesAccionesTipoTituloCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTituloCliente;
	protected JPanel jPanelParametrosAuxiliar2TipoTituloCliente;
	protected JPanel jPanelParametrosAuxiliar3TipoTituloCliente;
	protected JPanel jPanelParametrosAuxiliar4TipoTituloCliente;
	//protected JPanel jPanelParametrosAuxiliar5TipoTituloCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTituloCliente;
	//protected JPanel jPanelImportacionTipoTituloCliente;
	
	
	public JTable jTableDatosTipoTituloCliente;
	
	
	
	//public JTable jTableDatosTipoTituloClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTituloCliente;
	protected JButton jButtonDuplicarTipoTituloCliente;
	protected JButton jButtonCopiarTipoTituloCliente;
	protected JButton jButtonVerFormTipoTituloCliente;
	protected JButton jButtonNuevoRelacionesTipoTituloCliente;
	protected JButton jButtonModificarTipoTituloCliente;
	
    protected JButton jButtonGuardarCambiosTablaTipoTituloCliente;
	protected JButton jButtonCerrarTipoTituloCliente;
	
	
	protected JButton jButtonRecargarInformacionTipoTituloCliente;
	protected JButton jButtonProcesarInformacionTipoTituloCliente;
	
	
	protected JButton jButtonAnterioresTipoTituloCliente;
	protected JButton jButtonSiguientesTipoTituloCliente;
	protected JButton jButtonNuevoGuardarCambiosTipoTituloCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTituloCliente;
	//protected JButton jButtonCerrarReporteDinamicoTipoTituloCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTituloCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTituloCliente;
	//protected JButton jButtonGenerarImportacionTipoTituloCliente;
	//protected JButton jButtonCerrarImportacionTipoTituloCliente;
	//protected JFileChooser jFileChooserImportacionTipoTituloCliente;
	//protected File fileImportacionTipoTituloCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTituloCliente;
	protected JButton jButtonDuplicarToolBarTipoTituloCliente;
	protected JButton jButtonNuevoRelacionesToolBarTipoTituloCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTituloCliente;
	protected JButton jButtonCopiarToolBarTipoTituloCliente;
	protected JButton jButtonVerFormToolBarTipoTituloCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTituloCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTituloCliente;
	protected JButton jButtonCerrarToolBarTipoTituloCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTituloCliente;
	protected JButton jButtonProcesarInformacionToolBarTipoTituloCliente;
	protected JButton jButtonAnterioresToolBarTipoTituloCliente;
	protected JButton jButtonSiguientesToolBarTipoTituloCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTituloCliente;
	protected JButton jButtonAbrirOrderByToolBarTipoTituloCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTituloCliente;
	protected JMenuItem jMenuItemDuplicarTipoTituloCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTituloCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTituloCliente;
	protected JMenuItem jMenuItemCopiarTipoTituloCliente;
	protected JMenuItem jMenuItemVerFormTipoTituloCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTituloCliente;
	protected JMenuItem jMenuItemCerrarTipoTituloCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoTituloCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTituloCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTituloCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTituloCliente;
	protected JMenuItem jMenuItemProcesarInformacionTipoTituloCliente;
	protected JMenuItem jMenuItemAnterioresTipoTituloCliente;
	protected JMenuItem jMenuItemSiguientesTipoTituloCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTituloCliente;
	protected JMenuItem jMenuItemAbrirOrderByTipoTituloCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoTituloCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTituloCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTituloCliente;
	protected JCheckBox jCheckBoxSeleccionadosTipoTituloCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTituloCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTituloCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTituloCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTituloCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTituloCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTituloCliente;
	protected JTextField jTextFieldValorCampoGeneralTipoTituloCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTituloCliente;
	//public JList<Reporte> jListColumnasSelectReporteTipoTituloCliente;
	//public JScrollPane jScrollColumnasSelectReporteTipoTituloCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTituloCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTituloCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTituloCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTituloCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTituloCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTituloCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTituloCliente;
	
		
	//public JLabel jLabelArchivoImportacionTipoTituloCliente;	
	//public JLabel jLabelPathArchivoImportacionTipoTituloCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTituloCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTituloCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTituloCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTituloCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTituloCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTituloCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTituloCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTituloCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTituloCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTituloCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoTituloCliente;
	public JPanel jPanelBusquedaPorIdTipoTituloCliente;
	public JButton jButtonBusquedaPorIdTipoTituloCliente;
	public JPanel jPanelBusquedaPorNombreTipoTituloCliente;
	public JButton jButtonBusquedaPorNombreTipoTituloCliente;
	public JPanel jPanelBusquedaPorSiglasTipoTituloCliente;
	public JButton jButtonBusquedaPorSiglasTipoTituloCliente;
	public JPanel jPanelFK_IdPaisTipoTituloCliente;
	public JButton jButtonFK_IdPaisTipoTituloCliente;
	
	public JPanel jPanelIdIdBusquedaPorIdTipoTituloCliente;
	public JLabel jLabelidBusquedaPorIdTipoTituloCliente;
	public JTextFieldMe jTextFieldidTipoTituloClienteBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoTituloCliente;
	public JLabel jLabelnombreBusquedaPorNombreTipoTituloCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoTituloCliente;
	public JButton jButtonnombreBusquedaPorNombreTipoTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasTipoTituloCliente;
	public JLabel jLabelsiglasBusquedaPorSiglasTipoTituloCliente;
	public JTextField jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente;
	public JButton jButtonsiglasBusquedaPorSiglasTipoTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoTituloCliente;
	public JLabel jLabelid_paisFK_IdPaisTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoTituloCliente;
	public JButton jButtonid_paisFK_IdPaisTipoTituloCliente= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoTituloClienteUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoTituloClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoTituloClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTituloCliente)	{
		this.jButtonRecargarInformacionTipoTituloCliente = jButtonRecargarInformacionTipoTituloCliente;
	}
	
	public JButton getjButtonProcesarInformacionTipoTituloCliente() {
		return this.jButtonProcesarInformacionTipoTituloCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTituloCliente)	{
		this.jButtonProcesarInformacionTipoTituloCliente = jButtonProcesarInformacionTipoTituloCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTituloCliente() {
		return this.jButtonRecargarInformacionTipoTituloCliente;
	}
	
	
	public List<TipoTituloCliente> gettipotituloclientes() {
		return this.tipotituloclientes;
	}

	public void settipotituloclientes(List<TipoTituloCliente> tipotituloclientes) {
		this.tipotituloclientes = tipotituloclientes;
	}
	
	public List<TipoTituloCliente> gettipotituloclientesAux() {
		return this.tipotituloclientesAux;
	}

	public void settipotituloclientesAux(List<TipoTituloCliente> tipotituloclientesAux) {
		this.tipotituloclientesAux = tipotituloclientesAux;
	}
	
	public List<TipoTituloCliente> gettipotituloclientesEliminados() {
		return this.tipotituloclientesEliminados;
	}

	public void setTipoTituloClientesEliminados(List<TipoTituloCliente> tipotituloclientesEliminados) {
		this.tipotituloclientesEliminados = tipotituloclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTituloCliente() {
		return jComboBoxTiposSeleccionarTipoTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTituloCliente(
			JComboBox jComboBoxTiposSeleccionarTipoTituloCliente) {
		this.jComboBoxTiposSeleccionarTipoTituloCliente = jComboBoxTiposSeleccionarTipoTituloCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTituloCliente() {
		return jTextFieldValorCampoGeneralTipoTituloCliente;
	}

	public void setjTextFieldValorCampoGeneralTipoTituloCliente(
			JTextField jTextFieldValorCampoGeneralTipoTituloCliente) {
		this.jTextFieldValorCampoGeneralTipoTituloCliente = jTextFieldValorCampoGeneralTipoTituloCliente;
	}

	public void setBorderResaltarValorCampoGeneralTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTituloCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTituloCliente() {
		return this.jCheckBoxSeleccionarTodosTipoTituloCliente;
	}

	public void setjCheckBoxSeleccionarTodosTipoTituloCliente(
			JCheckBox jCheckBoxSeleccionarTodosTipoTituloCliente) {
		this.jCheckBoxSeleccionarTodosTipoTituloCliente = jCheckBoxSeleccionarTodosTipoTituloCliente;
	}

	public void setBorderResaltarSeleccionarTodosTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTituloCliente() {
		return this.jCheckBoxSeleccionadosTipoTituloCliente;
	}

	public void setjCheckBoxSeleccionadosTipoTituloCliente(
			JCheckBox jCheckBoxSeleccionadosTipoTituloCliente) {
		this.jCheckBoxSeleccionadosTipoTituloCliente = jCheckBoxSeleccionadosTipoTituloCliente;
	}
	
	public void setBorderResaltarSeleccionadosTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTituloCliente() {
		return this.jComboBoxTiposArchivosReportesTipoTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTituloCliente(
			JComboBox jComboBoxTiposArchivosReportesTipoTituloCliente) {
		this.jComboBoxTiposArchivosReportesTipoTituloCliente = jComboBoxTiposArchivosReportesTipoTituloCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTituloCliente() {
		return this.jComboBoxTiposReportesTipoTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTituloCliente(
			JComboBox jComboBoxTiposReportesTipoTituloCliente) {
		this.jComboBoxTiposReportesTipoTituloCliente = jComboBoxTiposReportesTipoTituloCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTituloCliente() {
	//	return jComboBoxTiposReportesDinamicoTipoTituloCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTituloCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTituloCliente) {
	//	this.jComboBoxTiposReportesDinamicoTipoTituloCliente = jComboBoxTiposReportesDinamicoTipoTituloCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTituloCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTituloCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente = jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente;
	//}
	
	public void setBorderResaltarTiposReportesTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTituloCliente() {
		return this.jComboBoxTiposGraficosReportesTipoTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTituloCliente(
			JComboBox jComboBoxTiposGraficosReportesTipoTituloCliente) {
		this.jComboBoxTiposGraficosReportesTipoTituloCliente = jComboBoxTiposGraficosReportesTipoTituloCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTituloCliente() {
		return this.jComboBoxTiposPaginacionTipoTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTituloCliente(
			JComboBox jComboBoxTiposPaginacionTipoTituloCliente) {
		this.jComboBoxTiposPaginacionTipoTituloCliente = jComboBoxTiposPaginacionTipoTituloCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTituloCliente() {
		return this.jComboBoxTiposRelacionesTipoTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTituloCliente() {
		return this.jComboBoxTiposAccionesTipoTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTituloCliente(
			JComboBox jComboBoxTiposRelacionesTipoTituloCliente) {
		this.jComboBoxTiposRelacionesTipoTituloCliente = jComboBoxTiposRelacionesTipoTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTituloCliente(
			JComboBox jComboBoxTiposAccionesTipoTituloCliente) {
		this.jComboBoxTiposAccionesTipoTituloCliente = jComboBoxTiposAccionesTipoTituloCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTituloCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTituloCliente() {
	//	return jCheckBoxConGraficoDinamicoTipoTituloCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTituloCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTituloCliente) {
	//	this.jCheckBoxConGraficoDinamicoTipoTituloCliente = jCheckBoxConGraficoDinamicoTipoTituloCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTituloCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTituloCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTituloCliente .setBorder(borderResaltar);		
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
		this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
		
		this.tipotituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotituloclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTituloClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Titulo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTituloClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTituloCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"nuevo","nuevo","Nuevo"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"duplicar","duplicar","Duplicar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"copiar","copiar","Copiar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"ver_form","ver_form","Ver"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"recargar","recargar","Recargar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTituloCliente,this.jTtoolBarTipoTituloCliente,
							"cerrar","cerrar","Salir"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTituloCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTituloCliente;
			
				this.jButtonProcesarInformacionToolBarTipoTituloCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTituloCliente;
				
		//protected JButton jButtonModificarToolBarTipoTituloCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTituloCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTituloCliente=new JMenuMe("General");
		this.jmenuArchivoTipoTituloCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTituloCliente=new JMenuMe("Acciones");
		this.jmenuDatosTipoTituloCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTituloCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTituloCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTituloCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTituloCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTituloCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTituloCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTituloCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTituloCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTituloCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTituloCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTituloCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTituloCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTituloCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTituloCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTituloCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTituloCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTituloCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTituloCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTituloCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTituloCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTituloCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTituloCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTituloCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTituloCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTituloCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTituloCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTituloCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTituloCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTituloCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTituloCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTituloCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTituloCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTituloCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTituloCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTituloCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTituloCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTituloCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTituloCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTituloCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTituloCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTituloCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTituloCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTituloCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTituloCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTituloCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTituloCliente.add(this.jMenuItemCerrarTipoTituloCliente);
			
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemNuevoTipoTituloCliente);
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemNuevoGuardarCambiosTipoTituloCliente);
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemNuevoRelacionesTipoTituloCliente);
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemGuardarCambiosTablaTipoTituloCliente);		
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemDuplicarTipoTituloCliente);		
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemCopiarTipoTituloCliente);		
			this.jmenuAccionesTipoTituloCliente.add(this.jMenuItemVerFormTipoTituloCliente);		
			
			this.jmenuDatosTipoTituloCliente.add(this.jMenuItemRecargarInformacionTipoTituloCliente);				
			this.jmenuDatosTipoTituloCliente.add(this.jMenuItemAnterioresTipoTituloCliente);				
			this.jmenuDatosTipoTituloCliente.add(this.jMenuItemSiguientesTipoTituloCliente);				
			this.jmenuDatosTipoTituloCliente.add(this.jMenuItemAbrirOrderByTipoTituloCliente);				
			this.jmenuDatosTipoTituloCliente.add(this.jMenuItemMostrarOcultarTipoTituloCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTituloCliente.add(this.jMenuItemGuardarCambiosTipoTituloCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTituloCliente.add(this.jmenuArchivoTipoTituloCliente);		
			this.jmenuBarTipoTituloCliente.add(this.jmenuAccionesTipoTituloCliente);		
			this.jmenuBarTipoTituloCliente.add(this.jmenuDatosTipoTituloCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTituloCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTituloCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoTituloCliente.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoTituloCliente= new JButtonMe();
		this.jButtonBusquedaPorIdTipoTituloCliente.setText("Buscar");
		this.jButtonBusquedaPorIdTipoTituloCliente.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoTituloCliente,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoTituloCliente = new JLabelMe();
		jLabelidBusquedaPorIdTipoTituloCliente.setText("Id :");
		jLabelidBusquedaPorIdTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidTipoTituloClienteBusquedaPorId= new JTextFieldMe();
		jTextFieldidTipoTituloClienteBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTituloClienteBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTituloClienteBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoTituloCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoTituloCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoTituloCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoTituloCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoTituloCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoTituloCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoTituloCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoTituloCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoTituloCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasTipoTituloCliente.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasTipoTituloCliente= new JButtonMe();
		this.jButtonBusquedaPorSiglasTipoTituloCliente.setText("Buscar");
		this.jButtonBusquedaPorSiglasTipoTituloCliente.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasTipoTituloCliente,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasTipoTituloCliente = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasTipoTituloCliente.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasTipoTituloCliente.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoTituloCliente.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoTituloCliente= new JButtonMe();
		this.jButtonFK_IdPaisTipoTituloCliente.setText("Buscar");
		this.jButtonFK_IdPaisTipoTituloCliente.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoTituloCliente,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoTituloCliente = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoTituloCliente.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoTituloCliente.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoTituloCliente= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoTituloCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoTituloCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTituloCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTituloCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoTituloCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoTituloCliente = new TipoTituloClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Titulo Cliente DATOS");
			this.jInternalFrameDetalleFormTipoTituloCliente = new TipoTituloClienteDetalleFormJInternalFrame(jDesktopPane,this.tipotituloclienteSessionBean.getConGuardarRelaciones(),this.tipotituloclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTituloCliente = null;//new TipoTituloClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTituloCliente= new GridBagLayout();
		
		
		this.jTableDatosTipoTituloCliente = new JTableMe();      
		
		String sToolTipTipoTituloCliente="";
		sToolTipTipoTituloCliente=TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTituloCliente+="(Cartera.TipoTituloCliente)";
		}
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTituloCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTituloCliente.setToolTipText(sToolTipTipoTituloCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTituloCliente);
		this.jTableDatosTipoTituloCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTituloCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTituloCliente.setRowSelectionAllowed(true);
		this.jTableDatosTipoTituloCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTituloCliente = new JButtonMe();
		this.jButtonDuplicarTipoTituloCliente = new JButtonMe();
		this.jButtonCopiarTipoTituloCliente = new JButtonMe();
		this.jButtonVerFormTipoTituloCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTituloCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente = new JButtonMe();
		this.jButtonCerrarTipoTituloCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoTituloCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTituloCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Titulo Cliente";
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Titulo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTituloCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTituloCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoTituloCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTituloCliente=new ReporteDinamicoJInternalFrame(TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTituloCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTituloCliente=new ImportacionJInternalFrame(TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTituloCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTituloCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTituloCliente.setText("Orden");
		this.jButtonAbrirOrderByTipoTituloCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTituloCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTituloCliente,false,this);
			
			//this.cargarOrderByTipoTituloCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTituloCliente,true,this);
			
			//this.cargarOrderByTipoTituloCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTituloCliente.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTituloCliente.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTituloCliente.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoTituloCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTituloCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTituloCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTituloCliente.setText("Nuevo");
		this.jButtonDuplicarTipoTituloCliente.setText("Duplicar");
		this.jButtonCopiarTipoTituloCliente.setText("Copiar");
		this.jButtonVerFormTipoTituloCliente.setText("Ver");
		this.jButtonNuevoRelacionesTipoTituloCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.setText("Guardar");
		this.jButtonCerrarTipoTituloCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTituloCliente,"nuevo_button","Nuevo",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTituloCliente,"duplicar_button","Duplicar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTituloCliente,"copiar_button","Copiar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTituloCliente,"ver_form","Ver",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTituloCliente,"nuevorelaciones_button","Nuevo Rel",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTituloCliente,"guardarcambiostabla_button","Guardar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTituloCliente,"cerrar_button","Salir",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTituloCliente.setToolTipText("Nuevo"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTituloCliente.setToolTipText("Duplicar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTituloCliente.setToolTipText("Copiar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTituloCliente.setToolTipText("Ver"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTituloCliente.setToolTipText("Nuevo Rel"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.setToolTipText("Guardar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTituloCliente.setToolTipText("Salir"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTituloCliente";
		inputMap = this.jButtonNuevoTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTituloCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTituloCliente";
		inputMap = this.jButtonDuplicarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTituloCliente"));
		
		//COPIAR
		sMapKey = "CopiarTipoTituloCliente";
		inputMap = this.jButtonCopiarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTituloCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTituloCliente";
		inputMap = this.jButtonVerFormTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTituloCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTituloCliente";
		inputMap = this.jButtonNuevoRelacionesTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTituloCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTituloCliente";
		inputMap = this.jButtonModificarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTituloCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTituloCliente";
		inputMap = this.jButtonCerrarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTituloCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTituloCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTituloCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTituloCliente.setName("jPanelParametrosReportesTipoTituloCliente"); 
		
		this.jPanelParametrosReportesAccionesTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTituloCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTituloCliente.setName("jPanelParametrosReportesAccionesTipoTituloCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTituloCliente = new JButtonMe();
		this.jButtonRecargarInformacionTipoTituloCliente.setText("Recargar");
		this.jButtonRecargarInformacionTipoTituloCliente.setToolTipText("Recargar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTituloCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTituloCliente = new JButtonMe();
		this.jButtonProcesarInformacionTipoTituloCliente.setText("Procesar");
		this.jButtonProcesarInformacionTipoTituloCliente.setToolTipText("Procesar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTituloCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTituloCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTituloCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTituloCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTituloCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTituloCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTituloCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTituloCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTituloCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTituloCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTituloCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTituloCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTituloCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTituloCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTituloCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoTituloCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTituloCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTituloCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTituloCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTituloCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTituloCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTituloCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTituloCliente = new JLabelMe();
		
		this.jLabelAccionesTipoTituloCliente.setText("Acciones");		
		this.jLabelAccionesTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTituloCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTituloCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTituloCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTituloCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTituloCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTituloCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTituloCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTituloCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTituloCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTituloCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTituloCliente = new JButtonMe();
		//this.jButtonAnterioresTipoTituloCliente.setText("<<");
        this.jButtonAnterioresTipoTituloCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTituloCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTituloCliente = new JButtonMe();
		//this.jButtonSiguientesTipoTituloCliente.setText(">>");
        this.jButtonSiguientesTipoTituloCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTituloCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTituloCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTituloCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTituloCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTituloCliente,"nuevoguardarcambios_button","Nue",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTituloCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTituloCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTituloCliente";
		inputMap = this.jButtonRecargarInformacionTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTituloCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTituloCliente";
		inputMap = this.jButtonSiguientesTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTituloCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTituloCliente";
		inputMap = this.jButtonAnterioresTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTituloCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTituloCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTituloCliente.setMinimumSize(new Dimension(this.getWidth(),TipoTituloClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTituloClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTituloCliente.setMaximumSize(new Dimension(this.getWidth(),TipoTituloClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTituloClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTituloCliente.setPreferredSize(new Dimension(this.getWidth(),TipoTituloClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTituloClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTituloCliente = new GridBagLayout();

			this.jPanelPaginacionTipoTituloCliente.setLayout(gridaBagLayoutPaginacionTipoTituloCliente);						
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 0;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonAnterioresTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
					
						
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTituloCliente.gridy = 0;
			
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonNuevoGuardarCambiosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
						
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTituloCliente.gridy = 0;
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonSiguientesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 1;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonNuevoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
						
			
			
			if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTituloCliente.gridy = 1;
				this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTituloCliente.add(this.jButtonGuardarCambiosTablaTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			}
			
			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 1;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonDuplicarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 1;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonCopiarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 1;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonVerFormTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 1;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTituloCliente.add(this.jButtonCerrarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
		
		
		this.jButtonRecargarInformacionTipoTituloCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTituloCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTituloCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTituloCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTituloCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTituloCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTituloCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTituloCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTituloCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTituloCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTituloCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTituloCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTituloCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTituloCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTituloCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTituloCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTituloCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTituloCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTituloCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTituloCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTituloCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTituloCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTituloCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTituloCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTituloCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTituloCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTituloCliente.setLayout(gridaBagParametrosReportesTipoTituloCliente);
			this.jPanelParametrosReportesAccionesTipoTituloCliente.setLayout(gridaBagParametrosReportesAccionesTipoTituloCliente);
			
			
			this.jPanelParametrosAuxiliar1TipoTituloCliente.setLayout(gridaBagParametrosAuxiliar1TipoTituloCliente);
			this.jPanelParametrosAuxiliar2TipoTituloCliente.setLayout(gridaBagParametrosAuxiliar2TipoTituloCliente);
			this.jPanelParametrosAuxiliar3TipoTituloCliente.setLayout(gridaBagParametrosAuxiliar3TipoTituloCliente);
			this.jPanelParametrosAuxiliar4TipoTituloCliente.setLayout(gridaBagParametrosAuxiliar4TipoTituloCliente);
			//this.jPanelParametrosAuxiliar5TipoTituloCliente.setLayout(gridaBagParametrosAuxiliar2TipoTituloCliente);			
			
			
			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jButtonRecargarInformacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTituloCliente.add(this.jComboBoxTiposPaginacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTituloCliente.add(this.jCheckBoxConAltoMaximoTablaTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTituloCliente.add(this.jComboBoxTiposArchivosReportesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jPanelParametrosAuxiliar1TipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTituloCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTituloCliente.add(this.jComboBoxTiposReportesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jPanelParametrosAuxiliar4TipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jComboBoxTiposReportesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jCheckBoxGenerarReporteTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jPanelParametrosAuxiliar2TipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTituloCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jLabelAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTituloCliente.add(this.jButtonAbrirOrderByTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jComboBoxTiposSeleccionarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
			
			
			/*
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTituloCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jCheckBoxSeleccionarTodosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTituloCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTituloCliente.add(this.jCheckBoxSeleccionarTodosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);															
				
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTituloCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTituloCliente.add(this.jCheckBoxSeleccionadosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jPanelParametrosAuxiliar3TipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTituloCliente.add(this.jComboBoxTiposAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTituloCliente = new GridBagLayout();

			this.jScrollPanelDatosTipoTituloCliente.setLayout(gridaBagLayoutDatosTipoTituloCliente);
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = 0;
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;
			
			this.jScrollPanelDatosTipoTituloCliente.add(this.jTableDatosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTituloCliente.setViewportView(this.jTableDatosTipoTituloCliente);
		this.jTableDatosTipoTituloCliente.setFillsViewportHeight(true);
		this.jTableDatosTipoTituloCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTituloCliente= new GridBagLayout();
		this.jPanelAccionesTipoTituloCliente.setLayout(gridaBagLayoutAccionesTipoTituloCliente);
		
		
		/*	
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
			
		this.jPanelAccionesTipoTituloCliente.add(this.jButtonNuevoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdTipoTituloCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoTituloCliente.setLayout(gridaBagLayoutBusquedaPorIdTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 0;
		jPanelBusquedaPorIdTipoTituloCliente.add(jLabelidBusquedaPorIdTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 1;
		jPanelBusquedaPorIdTipoTituloCliente.add(jTextFieldidTipoTituloClienteBusquedaPorId, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 1;
		gridBagConstraintsTipoTituloCliente.gridx =1;
		jPanelBusquedaPorIdTipoTituloCliente.add(jButtonBusquedaPorIdTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		jTabbedPaneBusquedasTipoTituloCliente.addTab("1.-Por Id ", jPanelBusquedaPorIdTipoTituloCliente);
		jTabbedPaneBusquedasTipoTituloCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoTituloCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoTituloCliente.setLayout(gridaBagLayoutBusquedaPorNombreTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 0;
		jPanelBusquedaPorNombreTipoTituloCliente.add(jLabelnombreBusquedaPorNombreTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 1;
		jPanelBusquedaPorNombreTipoTituloCliente.add(jTextAreanombreBusquedaPorNombreTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 1;
		gridBagConstraintsTipoTituloCliente.gridx =1;
		jPanelBusquedaPorNombreTipoTituloCliente.add(jButtonBusquedaPorNombreTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		jTabbedPaneBusquedasTipoTituloCliente.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoTituloCliente);
		jTabbedPaneBusquedasTipoTituloCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasTipoTituloCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasTipoTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTipoTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTipoTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasTipoTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasTipoTituloCliente.setLayout(gridaBagLayoutBusquedaPorSiglasTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 0;
		jPanelBusquedaPorSiglasTipoTituloCliente.add(jLabelsiglasBusquedaPorSiglasTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 1;
		jPanelBusquedaPorSiglasTipoTituloCliente.add(jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 1;
		gridBagConstraintsTipoTituloCliente.gridx =1;
		jPanelBusquedaPorSiglasTipoTituloCliente.add(jButtonBusquedaPorSiglasTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		jTabbedPaneBusquedasTipoTituloCliente.addTab("3.-Por Siglas ", jPanelBusquedaPorSiglasTipoTituloCliente);
		jTabbedPaneBusquedasTipoTituloCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoTituloCliente= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoTituloCliente.setLayout(gridaBagLayoutFK_IdPaisTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 0;
		jPanelFK_IdPaisTipoTituloCliente.add(jLabelid_paisFK_IdPaisTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 0;
		gridBagConstraintsTipoTituloCliente.gridx = 1;
		jPanelFK_IdPaisTipoTituloCliente.add(jComboBoxid_paisFK_IdPaisTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTituloCliente.gridy = 1;
		gridBagConstraintsTipoTituloCliente.gridx =1;
		jPanelFK_IdPaisTipoTituloCliente.add(jButtonFK_IdPaisTipoTituloCliente, gridBagConstraintsTipoTituloCliente);

		jTabbedPaneBusquedasTipoTituloCliente.addTab("4.-Por Pais ", jPanelFK_IdPaisTipoTituloCliente);
		jTabbedPaneBusquedasTipoTituloCliente.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTituloCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTituloCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;		
			//this.gridBagConstraintsTipoTituloCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTituloCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;		
		//this.gridBagConstraintsTipoTituloCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTituloCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTituloCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;		
			this.gridBagConstraintsTipoTituloCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoTituloCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);								
		
		
		/*
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		*/		
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTituloCliente.gridx =0;
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTituloCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
				
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTituloCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTituloCliente.setLayout(gridaBagLayoutBusquedasParametrosTipoTituloCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTituloCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
			
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
			
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTituloCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTituloCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTituloCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTituloCliente.setName("jPanelReporteDinamicoTipoTituloCliente"); 
		
		this.jPanelReporteDinamicoTipoTituloCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTituloCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTituloCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTituloCliente.setLayout(gridaBagLayoutReporteDinamicoTipoTituloCliente);
		
		
		this.jInternalFrameReporteDinamicoTipoTituloCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTituloCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTituloCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTituloCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTituloCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTituloCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTituloCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTituloCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTituloCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTituloCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTituloCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTituloCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Titulo Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTituloCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTituloCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jLabelColumnasSelectReporteTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTituloCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTituloCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTituloCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTituloCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTituloCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTituloCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTituloCliente=new JScrollPane(this.jListColumnasSelectReporteTipoTituloCliente);
			
			this.jScrollColumnasSelectReporteTipoTituloCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTituloCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTituloCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTituloCliente.add(this.jListColumnasSelectReporteTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jScrollColumnasSelectReporteTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTituloCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTituloCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTituloCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTituloCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTituloCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTituloCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTituloCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTituloCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTituloCliente=new JScrollPane(this.jListRelacionesSelectReporteTipoTituloCliente);
			
			this.jScrollRelacionesSelectReporteTipoTituloCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTituloCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTituloCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoTituloCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTituloCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTituloCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTituloCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTituloCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTituloCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTituloCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTituloCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTituloCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTituloCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jLabelGenerarExcelReporteDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente.setToolTipText("Generar EXCEL"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTituloCliente.add(this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jComboBoxTiposReportesDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTituloCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTituloCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jLabelTiposArchivoReporteDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTituloCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTituloCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTituloCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTituloCliente.setToolTipText("Generar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jButtonGenerarReporteDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTituloCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTituloCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTituloCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTituloCliente.setToolTipText("Cancelar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTituloCliente.add(this.jButtonCerrarReporteDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTituloCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTituloCliente= new JScrollPane(jPanelReporteDinamicoTipoTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTituloCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTituloCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTituloCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Titulo Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTituloCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTituloCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTituloCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTituloCliente);
		this.jInternalFrameReporteDinamicoTipoTituloCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTituloCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTituloCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTituloCliente.setName("jPanelImportacionTipoTituloCliente"); 
		
		this.jPanelImportacionTipoTituloCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTituloCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTituloCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTituloCliente.setLayout(gridaBagLayoutImportacionTipoTituloCliente);
		
		
		this.jInternalFrameImportacionTipoTituloCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTituloCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTituloCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTituloCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTituloCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTituloCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTituloCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTituloCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoTituloCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoTituloCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTituloCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTituloCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTituloCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTituloCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoTituloCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoTituloCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTituloCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTituloCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTituloCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Titulo Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTituloCliente = new JLabelMe();

		this.jLabelArchivoImportacionTipoTituloCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTituloCliente.add(this.jLabelArchivoImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTituloCliente = new JFileChooser();		
		this.jFileChooserImportacionTipoTituloCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTituloCliente = new JButtonMe();
		this.jButtonAbrirImportacionTipoTituloCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTituloCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTituloCliente.setToolTipText("Generar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTituloCliente.add(this.jButtonAbrirImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTituloCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTituloCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTituloCliente.add(this.jLabelPathArchivoImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTituloCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTituloCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTituloCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTituloCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTituloCliente.add(this.jTextFieldPathArchivoImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTituloCliente = new JButtonMe();
		this.jButtonGenerarImportacionTipoTituloCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTituloCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTituloCliente.setToolTipText("Generar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTituloCliente.add(this.jButtonGenerarImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTituloCliente = new JButtonMe();
		this.jButtonCerrarImportacionTipoTituloCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTituloCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTituloCliente.setToolTipText("Cancelar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTituloCliente.add(this.jButtonCerrarImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTituloCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTituloCliente= new JScrollPane(jPanelImportacionTipoTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTituloCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTituloCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTituloCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTituloCliente);
		this.jInternalFrameImportacionTipoTituloCliente.getContentPane().add(this.jScrollPanelImportacionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTituloCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTituloCliente = new JButtonMe();
			this.jButtonAbrirOrderByTipoTituloCliente.setText("Orden");
			this.jButtonAbrirOrderByTipoTituloCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTituloCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTituloCliente";
			inputMap = this.jButtonAbrirOrderByTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTituloCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTituloCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTituloCliente.setName("jPanelOrderByTipoTituloCliente"); 
			
			this.jPanelOrderByTipoTituloCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTituloCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTituloCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTituloCliente.setLayout(gridaBagLayoutOrderByTipoTituloCliente);
			
			
			this.jTableDatosTipoTituloClienteOrderBy = new JTableMe();        
			this.jTableDatosTipoTituloClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTituloClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTituloClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTituloClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTituloClienteOrderBy.setViewportView(this.jTableDatosTipoTituloClienteOrderBy);
			this.jTableDatosTipoTituloClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTituloClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTituloCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTituloCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTituloCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTituloCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTituloCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTituloCliente.setTitle("Orden");
			this.jInternalFrameOrderByTipoTituloCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTituloCliente.setResizable(true);
			this.jInternalFrameOrderByTipoTituloCliente.setClosable(true);
			this.jInternalFrameOrderByTipoTituloCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTituloCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTituloCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTituloCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Titulo Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTituloCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTituloCliente.ipady =150;
				
			this.jPanelOrderByTipoTituloCliente.add(jScrollPanelDatosTipoTituloClienteOrderBy, this.gridBagConstraintsTipoTituloCliente);//this.jTableDatosTipoTituloClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTituloCliente = new JButtonMe();
			this.jButtonCerrarOrderByTipoTituloCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTituloCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTituloCliente.setToolTipText("Cancelar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTituloCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTituloCliente.add(this.jButtonCerrarOrderByTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTituloCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTituloCliente= new JScrollPane(jPanelOrderByTipoTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTituloCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTituloCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTituloCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTituloCliente);
			
			this.jInternalFrameOrderByTipoTituloCliente.getContentPane().add(this.jScrollPanelOrderByTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
		
		} else {
			this.jButtonAbrirOrderByTipoTituloCliente = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipotituloclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTituloCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTituloCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTituloCliente.getRowHeight();//TipoTituloClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.isSelected()) {
					iHeightTable=TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTituloCliente.isSelected()) {
					iHeightTable=TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTituloCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTituloCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTituloCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTituloCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTituloCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTituloCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTituloCliente!=null && this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTituloCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTituloCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTituloCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTituloCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTituloCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTituloCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipotituloclienteLogic.getTipoTituloClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotituloclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTituloCliente> TraerTipoTituloClienteBeans(List<TipoTituloCliente> tipotituloclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTituloCliente tipotitulocliente:tipotituloclientes) {
					
				if(!(TipoTituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipotitulocliente.setsDetalleGeneralEntityReporte(TipoTituloClienteConstantesFunciones.getTipoTituloClienteDescripcion(tipotitulocliente));
										
						
					
						
					
				} else  {
							
					//tipotitulocliente.setsDetalleGeneralEntityReporte(tipotitulocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipotituloclientebeans.add(tipotituloclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipotituloclientes;
    }
	//PARA REPORTES FIN
}
