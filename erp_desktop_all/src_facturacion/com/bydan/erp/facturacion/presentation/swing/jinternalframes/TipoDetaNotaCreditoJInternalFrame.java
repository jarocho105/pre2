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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoConstantesFunciones;

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
public class TipoDetaNotaCreditoJInternalFrame extends TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDetaNotaCredito;
	
	protected JMenuBar jmenuBarTipoDetaNotaCredito;
	
	protected JMenu jmenuTipoDetaNotaCredito;
	protected JMenu jmenuDatosTipoDetaNotaCredito;
	protected JMenu jmenuArchivoTipoDetaNotaCredito;
	protected JMenu jmenuAccionesTipoDetaNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetaNotaCredito;	
	protected GridBagConstraints gridBagConstraintsTipoDetaNotaCredito;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDetaNotaCreditoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDetaNotaCredito;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDetaNotaCredito;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDetaNotaCredito;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDetaNotaCredito> tipodetanotacreditos;		
	public List<TipoDetaNotaCredito> tipodetanotacreditosEliminados;	
	public List<TipoDetaNotaCredito> tipodetanotacreditosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDetaNotaCredito;		
	protected JButton jButtonAbrirOrderByTipoDetaNotaCredito;
	
	
	//protected JPanel jPanelOrderByTipoDetaNotaCredito;
	//public JScrollPane jScrollPanelOrderByTipoDetaNotaCredito;	
	//protected JButton jButtonCerrarOrderByTipoDetaNotaCredito;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDetaNotaCreditoLogic tipodetanotacreditoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDetaNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionTipoDetaNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralTipoDetaNotaCredito;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDetaNotaCreditoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDetaNotaCredito;
	//public JScrollPane jScrollPanelImportacionTipoDetaNotaCredito;
	
	
	
	protected JPanel jPanelAccionesTipoDetaNotaCredito;
	
    protected JPanel jPanelPaginacionTipoDetaNotaCredito;
    protected JPanel jPanelParametrosReportesTipoDetaNotaCredito;
	protected JPanel jPanelParametrosReportesAccionesTipoDetaNotaCredito;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDetaNotaCredito;
	protected JPanel jPanelParametrosAuxiliar2TipoDetaNotaCredito;
	protected JPanel jPanelParametrosAuxiliar3TipoDetaNotaCredito;
	protected JPanel jPanelParametrosAuxiliar4TipoDetaNotaCredito;
	//protected JPanel jPanelParametrosAuxiliar5TipoDetaNotaCredito;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDetaNotaCredito;
	//protected JPanel jPanelImportacionTipoDetaNotaCredito;
	
	
	public JTable jTableDatosTipoDetaNotaCredito;
	
	
	
	//public JTable jTableDatosTipoDetaNotaCreditoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDetaNotaCredito;
	protected JButton jButtonDuplicarTipoDetaNotaCredito;
	protected JButton jButtonCopiarTipoDetaNotaCredito;
	protected JButton jButtonVerFormTipoDetaNotaCredito;
	protected JButton jButtonNuevoRelacionesTipoDetaNotaCredito;
	protected JButton jButtonModificarTipoDetaNotaCredito;
	
    protected JButton jButtonGuardarCambiosTablaTipoDetaNotaCredito;
	protected JButton jButtonCerrarTipoDetaNotaCredito;
	
	
	protected JButton jButtonRecargarInformacionTipoDetaNotaCredito;
	protected JButton jButtonProcesarInformacionTipoDetaNotaCredito;
	
	
	protected JButton jButtonAnterioresTipoDetaNotaCredito;
	protected JButton jButtonSiguientesTipoDetaNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosTipoDetaNotaCredito;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDetaNotaCredito;
	//protected JButton jButtonCerrarReporteDinamicoTipoDetaNotaCredito;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDetaNotaCredito;
	//protected JButton jButtonGenerarImportacionTipoDetaNotaCredito;
	//protected JButton jButtonCerrarImportacionTipoDetaNotaCredito;
	//protected JFileChooser jFileChooserImportacionTipoDetaNotaCredito;
	//protected File fileImportacionTipoDetaNotaCredito;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetaNotaCredito;
	protected JButton jButtonDuplicarToolBarTipoDetaNotaCredito;
	protected JButton jButtonNuevoRelacionesToolBarTipoDetaNotaCredito;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDetaNotaCredito;
	protected JButton jButtonCopiarToolBarTipoDetaNotaCredito;
	protected JButton jButtonVerFormToolBarTipoDetaNotaCredito;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetaNotaCredito;
	protected JButton jButtonCerrarToolBarTipoDetaNotaCredito;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDetaNotaCredito;
	protected JButton jButtonProcesarInformacionToolBarTipoDetaNotaCredito;
	protected JButton jButtonAnterioresToolBarTipoDetaNotaCredito;
	protected JButton jButtonSiguientesToolBarTipoDetaNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDetaNotaCredito;
	protected JButton jButtonAbrirOrderByToolBarTipoDetaNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetaNotaCredito;
	protected JMenuItem jMenuItemDuplicarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDetaNotaCredito;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDetaNotaCredito;
	protected JMenuItem jMenuItemCopiarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemVerFormTipoDetaNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetaNotaCredito;
	protected JMenuItem jMenuItemCerrarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetaNotaCredito;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDetaNotaCredito;
	protected JMenuItem jMenuItemProcesarInformacionTipoDetaNotaCredito;
	protected JMenuItem jMenuItemAnterioresTipoDetaNotaCredito;
	protected JMenuItem jMenuItemSiguientesTipoDetaNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito;
	protected JMenuItem jMenuItemAbrirOrderByTipoDetaNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetaNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetaNotaCredito;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDetaNotaCredito;
	protected JCheckBox jCheckBoxSeleccionadosTipoDetaNotaCredito;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDetaNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDetaNotaCredito;
	protected JTextField jTextFieldValorCampoGeneralTipoDetaNotaCredito;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDetaNotaCredito;
	//public JList<Reporte> jListColumnasSelectReporteTipoDetaNotaCredito;
	//public JScrollPane jScrollColumnasSelectReporteTipoDetaNotaCredito;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDetaNotaCredito;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDetaNotaCredito;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDetaNotaCredito;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDetaNotaCredito;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDetaNotaCredito;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito;
	
		
	//public JLabel jLabelArchivoImportacionTipoDetaNotaCredito;	
	//public JLabel jLabelPathArchivoImportacionTipoDetaNotaCredito;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDetaNotaCredito;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDetaNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDetaNotaCredito;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDetaNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDetaNotaCredito;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDetaNotaCredito;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDetaNotaCredito;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDetaNotaCredito;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDetaNotaCredito;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDetaNotaCredito;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDetaNotaCredito;
	public JPanel jPanelBusquedaPorCodigoTipoDetaNotaCredito;
	public JButton jButtonBusquedaPorCodigoTipoDetaNotaCredito;
	public JPanel jPanelBusquedaPorNombreTipoDetaNotaCredito;
	public JButton jButtonBusquedaPorNombreTipoDetaNotaCredito;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDetaNotaCredito;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDetaNotaCredito;
	public JLabel jLabelnombreBusquedaPorNombreTipoDetaNotaCredito;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito;
	public JButton jButtonnombreBusquedaPorNombreTipoDetaNotaCreditoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoDetaNotaCreditoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDetaNotaCredito)	{
		this.jButtonRecargarInformacionTipoDetaNotaCredito = jButtonRecargarInformacionTipoDetaNotaCredito;
	}
	
	public JButton getjButtonProcesarInformacionTipoDetaNotaCredito() {
		return this.jButtonProcesarInformacionTipoDetaNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetaNotaCredito)	{
		this.jButtonProcesarInformacionTipoDetaNotaCredito = jButtonProcesarInformacionTipoDetaNotaCredito;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDetaNotaCredito() {
		return this.jButtonRecargarInformacionTipoDetaNotaCredito;
	}
	
	
	public List<TipoDetaNotaCredito> gettipodetanotacreditos() {
		return this.tipodetanotacreditos;
	}

	public void settipodetanotacreditos(List<TipoDetaNotaCredito> tipodetanotacreditos) {
		this.tipodetanotacreditos = tipodetanotacreditos;
	}
	
	public List<TipoDetaNotaCredito> gettipodetanotacreditosAux() {
		return this.tipodetanotacreditosAux;
	}

	public void settipodetanotacreditosAux(List<TipoDetaNotaCredito> tipodetanotacreditosAux) {
		this.tipodetanotacreditosAux = tipodetanotacreditosAux;
	}
	
	public List<TipoDetaNotaCredito> gettipodetanotacreditosEliminados() {
		return this.tipodetanotacreditosEliminados;
	}

	public void setTipoDetaNotaCreditosEliminados(List<TipoDetaNotaCredito> tipodetanotacreditosEliminados) {
		this.tipodetanotacreditosEliminados = tipodetanotacreditosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDetaNotaCredito() {
		return jComboBoxTiposSeleccionarTipoDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDetaNotaCredito(
			JComboBox jComboBoxTiposSeleccionarTipoDetaNotaCredito) {
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito = jComboBoxTiposSeleccionarTipoDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDetaNotaCredito() {
		return jTextFieldValorCampoGeneralTipoDetaNotaCredito;
	}

	public void setjTextFieldValorCampoGeneralTipoDetaNotaCredito(
			JTextField jTextFieldValorCampoGeneralTipoDetaNotaCredito) {
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito = jTextFieldValorCampoGeneralTipoDetaNotaCredito;
	}

	public void setBorderResaltarValorCampoGeneralTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDetaNotaCredito() {
		return this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito;
	}

	public void setjCheckBoxSeleccionarTodosTipoDetaNotaCredito(
			JCheckBox jCheckBoxSeleccionarTodosTipoDetaNotaCredito) {
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito = jCheckBoxSeleccionarTodosTipoDetaNotaCredito;
	}

	public void setBorderResaltarSeleccionarTodosTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDetaNotaCredito() {
		return this.jCheckBoxSeleccionadosTipoDetaNotaCredito;
	}

	public void setjCheckBoxSeleccionadosTipoDetaNotaCredito(
			JCheckBox jCheckBoxSeleccionadosTipoDetaNotaCredito) {
		this.jCheckBoxSeleccionadosTipoDetaNotaCredito = jCheckBoxSeleccionadosTipoDetaNotaCredito;
	}
	
	public void setBorderResaltarSeleccionadosTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDetaNotaCredito() {
		return this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposArchivosReportesTipoDetaNotaCredito) {
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito = jComboBoxTiposArchivosReportesTipoDetaNotaCredito;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDetaNotaCredito() {
		return this.jComboBoxTiposReportesTipoDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposReportesTipoDetaNotaCredito) {
		this.jComboBoxTiposReportesTipoDetaNotaCredito = jComboBoxTiposReportesTipoDetaNotaCredito;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDetaNotaCredito() {
	//	return jComboBoxTiposReportesDinamicoTipoDetaNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDetaNotaCredito(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDetaNotaCredito) {
	//	this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito = jComboBoxTiposReportesDinamicoTipoDetaNotaCredito;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito = jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito;
	//}
	
	public void setBorderResaltarTiposReportesTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDetaNotaCredito() {
		return this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposGraficosReportesTipoDetaNotaCredito) {
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito = jComboBoxTiposGraficosReportesTipoDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDetaNotaCredito() {
		return this.jComboBoxTiposPaginacionTipoDetaNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDetaNotaCredito(
			JComboBox jComboBoxTiposPaginacionTipoDetaNotaCredito) {
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito = jComboBoxTiposPaginacionTipoDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDetaNotaCredito() {
		return this.jComboBoxTiposRelacionesTipoDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetaNotaCredito() {
		return this.jComboBoxTiposAccionesTipoDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposRelacionesTipoDetaNotaCredito) {
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito = jComboBoxTiposRelacionesTipoDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposAccionesTipoDetaNotaCredito) {
		this.jComboBoxTiposAccionesTipoDetaNotaCredito = jComboBoxTiposAccionesTipoDetaNotaCredito;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDetaNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDetaNotaCredito .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDetaNotaCredito() {
	//	return jCheckBoxConGraficoDinamicoTipoDetaNotaCredito;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDetaNotaCredito(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDetaNotaCredito) {
	//	this.jCheckBoxConGraficoDinamicoTipoDetaNotaCredito = jCheckBoxConGraficoDinamicoTipoDetaNotaCredito;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDetaNotaCredito() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDetaNotaCredito.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDetaNotaCredito .setBorder(borderResaltar);		
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
		this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
		
		this.tipodetanotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetanotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetaNotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Detalle Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDetaNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDetaNotaCredito= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"nuevo","nuevo","Nuevo"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"duplicar","duplicar","Duplicar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"copiar","copiar","Copiar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"ver_form","ver_form","Ver"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"recargar","recargar","Recargar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDetaNotaCredito,this.jTtoolBarTipoDetaNotaCredito,
							"cerrar","cerrar","Salir"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDetaNotaCredito=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDetaNotaCredito;
			
				this.jButtonProcesarInformacionToolBarTipoDetaNotaCredito=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDetaNotaCredito;
				
		//protected JButton jButtonModificarToolBarTipoDetaNotaCredito;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDetaNotaCredito=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDetaNotaCredito=new JMenuMe("General");
		this.jmenuArchivoTipoDetaNotaCredito=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDetaNotaCredito=new JMenuMe("Acciones");
		this.jmenuDatosTipoDetaNotaCredito=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetaNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetaNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetaNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDetaNotaCredito= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDetaNotaCredito.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDetaNotaCredito,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDetaNotaCredito= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDetaNotaCredito.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDetaNotaCredito,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDetaNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetaNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetaNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDetaNotaCredito= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDetaNotaCredito.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDetaNotaCredito,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDetaNotaCredito= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDetaNotaCredito.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDetaNotaCredito,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetaNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetaNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetaNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDetaNotaCredito= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDetaNotaCredito.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDetaNotaCredito,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDetaNotaCredito= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDetaNotaCredito.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDetaNotaCredito,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDetaNotaCredito= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDetaNotaCredito.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDetaNotaCredito,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDetaNotaCredito= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDetaNotaCredito.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDetaNotaCredito,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDetaNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDetaNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDetaNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDetaNotaCredito.add(this.jMenuItemCerrarTipoDetaNotaCredito);
			
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemNuevoTipoDetaNotaCredito);
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito);
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemNuevoRelacionesTipoDetaNotaCredito);
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemGuardarCambiosTablaTipoDetaNotaCredito);		
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemDuplicarTipoDetaNotaCredito);		
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemCopiarTipoDetaNotaCredito);		
			this.jmenuAccionesTipoDetaNotaCredito.add(this.jMenuItemVerFormTipoDetaNotaCredito);		
			
			this.jmenuDatosTipoDetaNotaCredito.add(this.jMenuItemRecargarInformacionTipoDetaNotaCredito);				
			this.jmenuDatosTipoDetaNotaCredito.add(this.jMenuItemAnterioresTipoDetaNotaCredito);				
			this.jmenuDatosTipoDetaNotaCredito.add(this.jMenuItemSiguientesTipoDetaNotaCredito);				
			this.jmenuDatosTipoDetaNotaCredito.add(this.jMenuItemAbrirOrderByTipoDetaNotaCredito);				
			this.jmenuDatosTipoDetaNotaCredito.add(this.jMenuItemMostrarOcultarTipoDetaNotaCredito);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDetaNotaCredito.add(this.jMenuItemGuardarCambiosTipoDetaNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDetaNotaCredito.add(this.jmenuArchivoTipoDetaNotaCredito);		
			this.jmenuBarTipoDetaNotaCredito.add(this.jmenuAccionesTipoDetaNotaCredito);		
			this.jmenuBarTipoDetaNotaCredito.add(this.jmenuDatosTipoDetaNotaCredito);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDetaNotaCredito);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDetaNotaCredito() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDetaNotaCredito.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDetaNotaCredito= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDetaNotaCredito.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDetaNotaCredito.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDetaNotaCredito,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDetaNotaCredito.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDetaNotaCredito= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDetaNotaCredito.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDetaNotaCredito.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDetaNotaCredito,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDetaNotaCredito = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDetaNotaCredito.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDetaNotaCredito.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDetaNotaCredito=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDetaNotaCredito.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDetaNotaCredito.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDetaNotaCredito.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDetaNotaCredito = new TipoDetaNotaCreditoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Detalle Nota Credito DATOS");
			this.jInternalFrameDetalleFormTipoDetaNotaCredito = new TipoDetaNotaCreditoDetalleFormJInternalFrame(jDesktopPane,this.tipodetanotacreditoSessionBean.getConGuardarRelaciones(),this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDetaNotaCredito = null;//new TipoDetaNotaCreditoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetaNotaCredito= new GridBagLayout();
		
		
		this.jTableDatosTipoDetaNotaCredito = new JTableMe();      
		
		String sToolTipTipoDetaNotaCredito="";
		sToolTipTipoDetaNotaCredito=TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetaNotaCredito+="(Facturacion.TipoDetaNotaCredito)";
		}
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetaNotaCredito+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDetaNotaCredito.setToolTipText(sToolTipTipoDetaNotaCredito);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDetaNotaCredito);
		this.jTableDatosTipoDetaNotaCredito.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDetaNotaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDetaNotaCredito.setRowSelectionAllowed(true);
		this.jTableDatosTipoDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDetaNotaCredito = new JButtonMe();
		this.jButtonDuplicarTipoDetaNotaCredito = new JButtonMe();
		this.jButtonCopiarTipoDetaNotaCredito = new JButtonMe();
		this.jButtonVerFormTipoDetaNotaCredito = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDetaNotaCredito = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarTipoDetaNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetaNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDetaNotaCredito = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Detalle Nota Credito";
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetaNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetaNotaCredito.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDetaNotaCredito=new ReporteDinamicoJInternalFrame(TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDetaNotaCredito();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDetaNotaCredito=new ImportacionJInternalFrame(TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDetaNotaCredito();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDetaNotaCredito = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDetaNotaCredito.setText("Orden");
		this.jButtonAbrirOrderByTipoDetaNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetaNotaCredito,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetaNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaNotaCredito,false,this);
			
			//this.cargarOrderByTipoDetaNotaCredito(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetaNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaNotaCredito,true,this);
			
			//this.cargarOrderByTipoDetaNotaCredito(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDetaNotaCredito.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetaNotaCredito.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetaNotaCredito.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDetaNotaCredito.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetaNotaCredito.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetaNotaCredito.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDetaNotaCredito.setText("Nuevo");
		this.jButtonDuplicarTipoDetaNotaCredito.setText("Duplicar");
		this.jButtonCopiarTipoDetaNotaCredito.setText("Copiar");
		this.jButtonVerFormTipoDetaNotaCredito.setText("Ver");
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.setText("Guardar");
		this.jButtonCerrarTipoDetaNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetaNotaCredito,"nuevo_button","Nuevo",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDetaNotaCredito,"duplicar_button","Duplicar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDetaNotaCredito,"copiar_button","Copiar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDetaNotaCredito,"ver_form","Ver",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDetaNotaCredito,"nuevorelaciones_button","Nuevo Rel",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetaNotaCredito,"guardarcambiostabla_button","Guardar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetaNotaCredito,"cerrar_button","Salir",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDetaNotaCredito.setToolTipText("Nuevo"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDetaNotaCredito.setToolTipText("Duplicar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDetaNotaCredito.setToolTipText("Copiar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDetaNotaCredito.setToolTipText("Ver"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.setToolTipText("Nuevo Rel"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.setToolTipText("Guardar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetaNotaCredito.setToolTipText("Salir"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetaNotaCredito";
		inputMap = this.jButtonNuevoTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetaNotaCredito"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDetaNotaCredito";
		inputMap = this.jButtonDuplicarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDetaNotaCredito"));
		
		//COPIAR
		sMapKey = "CopiarTipoDetaNotaCredito";
		inputMap = this.jButtonCopiarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDetaNotaCredito"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDetaNotaCredito";
		inputMap = this.jButtonVerFormTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDetaNotaCredito"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDetaNotaCredito";
		inputMap = this.jButtonNuevoRelacionesTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDetaNotaCredito"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDetaNotaCredito";
		inputMap = this.jButtonModificarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDetaNotaCredito"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDetaNotaCredito";
		inputMap = this.jButtonCerrarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetaNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetaNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetaNotaCredito"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDetaNotaCredito.setName("jPanelParametrosReportesTipoDetaNotaCredito"); 
		
		this.jPanelParametrosReportesAccionesTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDetaNotaCredito.setName("jPanelParametrosReportesAccionesTipoDetaNotaCredito"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDetaNotaCredito = new JButtonMe();
		this.jButtonRecargarInformacionTipoDetaNotaCredito.setText("Recargar");
		this.jButtonRecargarInformacionTipoDetaNotaCredito.setToolTipText("Recargar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDetaNotaCredito,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDetaNotaCredito = new JButtonMe();
		this.jButtonProcesarInformacionTipoDetaNotaCredito.setText("Procesar");
		this.jButtonProcesarInformacionTipoDetaNotaCredito.setToolTipText("Procesar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDetaNotaCredito.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDetaNotaCredito.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetaNotaCredito.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetaNotaCredito.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDetaNotaCredito.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetaNotaCredito.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDetaNotaCredito = new JLabelMe();
		
		this.jLabelAccionesTipoDetaNotaCredito.setText("Acciones");		
		this.jLabelAccionesTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDetaNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDetaNotaCredito.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDetaNotaCredito.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDetaNotaCredito = new JButtonMe();
		//this.jButtonAnterioresTipoDetaNotaCredito.setText("<<");
        this.jButtonAnterioresTipoDetaNotaCredito.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDetaNotaCredito,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDetaNotaCredito = new JButtonMe();
		//this.jButtonSiguientesTipoDetaNotaCredito.setText(">>");
        this.jButtonSiguientesTipoDetaNotaCredito.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDetaNotaCredito,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito,"nuevoguardarcambios_button","Nue",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDetaNotaCredito";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDetaNotaCredito"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDetaNotaCredito";
		inputMap = this.jButtonRecargarInformacionTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDetaNotaCredito"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDetaNotaCredito";
		inputMap = this.jButtonSiguientesTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDetaNotaCredito"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDetaNotaCredito";
		inputMap = this.jButtonAnterioresTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDetaNotaCredito"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDetaNotaCredito();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDetaNotaCredito.setMinimumSize(new Dimension(this.getWidth(),TipoDetaNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetaNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetaNotaCredito.setMaximumSize(new Dimension(this.getWidth(),TipoDetaNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetaNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetaNotaCredito.setPreferredSize(new Dimension(this.getWidth(),TipoDetaNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetaNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDetaNotaCredito = new GridBagLayout();

			this.jPanelPaginacionTipoDetaNotaCredito.setLayout(gridaBagLayoutPaginacionTipoDetaNotaCredito);						
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonAnterioresTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
					
						
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
			
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonNuevoGuardarCambiosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
						
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonSiguientesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonNuevoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
						
			
			
			if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
				this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonGuardarCambiosTablaTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			}
			
			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonDuplicarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonCopiarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonVerFormTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDetaNotaCredito.add(this.jButtonCerrarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
		
		
		this.jButtonRecargarInformacionTipoDetaNotaCredito.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetaNotaCredito.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetaNotaCredito.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetaNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetaNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDetaNotaCredito.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetaNotaCredito.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetaNotaCredito.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDetaNotaCredito = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDetaNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDetaNotaCredito = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDetaNotaCredito.setLayout(gridaBagParametrosReportesTipoDetaNotaCredito);
			this.jPanelParametrosReportesAccionesTipoDetaNotaCredito.setLayout(gridaBagParametrosReportesAccionesTipoDetaNotaCredito);
			
			
			this.jPanelParametrosAuxiliar1TipoDetaNotaCredito.setLayout(gridaBagParametrosAuxiliar1TipoDetaNotaCredito);
			this.jPanelParametrosAuxiliar2TipoDetaNotaCredito.setLayout(gridaBagParametrosAuxiliar2TipoDetaNotaCredito);
			this.jPanelParametrosAuxiliar3TipoDetaNotaCredito.setLayout(gridaBagParametrosAuxiliar3TipoDetaNotaCredito);
			this.jPanelParametrosAuxiliar4TipoDetaNotaCredito.setLayout(gridaBagParametrosAuxiliar4TipoDetaNotaCredito);
			//this.jPanelParametrosAuxiliar5TipoDetaNotaCredito.setLayout(gridaBagParametrosAuxiliar2TipoDetaNotaCredito);			
			
			
			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jButtonRecargarInformacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetaNotaCredito.add(this.jComboBoxTiposPaginacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetaNotaCredito.add(this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetaNotaCredito.add(this.jComboBoxTiposArchivosReportesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jPanelParametrosAuxiliar1TipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDetaNotaCredito.add(this.jComboBoxTiposReportesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jPanelParametrosAuxiliar4TipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jComboBoxTiposReportesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jCheckBoxGenerarReporteTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jPanelParametrosAuxiliar2TipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jLabelAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jButtonAbrirOrderByTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jComboBoxTiposSeleccionarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
			
			
			/*
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetaNotaCredito.add(this.jCheckBoxSeleccionarTodosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);															
				
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetaNotaCredito.add(this.jCheckBoxSeleccionadosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jPanelParametrosAuxiliar3TipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jComboBoxTiposRelacionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
				
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jComboBoxTiposAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
	
				
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaNotaCredito.add(this.jTextFieldValorCampoGeneralTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDetaNotaCredito = new GridBagLayout();

			this.jScrollPanelDatosTipoDetaNotaCredito.setLayout(gridaBagLayoutDatosTipoDetaNotaCredito);
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
			
			this.jScrollPanelDatosTipoDetaNotaCredito.add(this.jTableDatosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDetaNotaCredito.setViewportView(this.jTableDatosTipoDetaNotaCredito);
		this.jTableDatosTipoDetaNotaCredito.setFillsViewportHeight(true);
		this.jTableDatosTipoDetaNotaCredito.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDetaNotaCredito= new GridBagLayout();
		this.jPanelAccionesTipoDetaNotaCredito.setLayout(gridaBagLayoutAccionesTipoDetaNotaCredito);
		
		
		/*	
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
			
		this.jPanelAccionesTipoDetaNotaCredito.add(this.jButtonNuevoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDetaNotaCredito.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDetaNotaCredito);

		gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
		jPanelBusquedaPorCodigoTipoDetaNotaCredito.add(jLabelcodigoBusquedaPorCodigoTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);

		gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		gridBagConstraintsTipoDetaNotaCredito.gridx = 1;
		jPanelBusquedaPorCodigoTipoDetaNotaCredito.add(jTextFieldcodigoBusquedaPorCodigoTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);

		gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
		gridBagConstraintsTipoDetaNotaCredito.gridx =1;
		jPanelBusquedaPorCodigoTipoDetaNotaCredito.add(jButtonBusquedaPorCodigoTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);

		jTabbedPaneBusquedasTipoDetaNotaCredito.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDetaNotaCredito);
		jTabbedPaneBusquedasTipoDetaNotaCredito.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDetaNotaCredito= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDetaNotaCredito.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDetaNotaCredito.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDetaNotaCredito.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDetaNotaCredito.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDetaNotaCredito.setLayout(gridaBagLayoutBusquedaPorNombreTipoDetaNotaCredito);

		gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
		jPanelBusquedaPorNombreTipoDetaNotaCredito.add(jLabelnombreBusquedaPorNombreTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);

		gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		gridBagConstraintsTipoDetaNotaCredito.gridx = 1;
		jPanelBusquedaPorNombreTipoDetaNotaCredito.add(jTextAreanombreBusquedaPorNombreTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);

		gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaNotaCredito.gridy = 1;
		gridBagConstraintsTipoDetaNotaCredito.gridx =1;
		jPanelBusquedaPorNombreTipoDetaNotaCredito.add(jButtonBusquedaPorNombreTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);

		jTabbedPaneBusquedasTipoDetaNotaCredito.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoDetaNotaCredito);
		jTabbedPaneBusquedasTipoDetaNotaCredito.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetaNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetaNotaCredito);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;		
			//this.gridBagConstraintsTipoDetaNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;		
		//this.gridBagConstraintsTipoDetaNotaCredito.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDetaNotaCredito);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;		
			this.gridBagConstraintsTipoDetaNotaCredito.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);								
		
		
		/*
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		*/		
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =0;
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetaNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
				
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDetaNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetaNotaCredito = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDetaNotaCredito.setLayout(gridaBagLayoutBusquedasParametrosTipoDetaNotaCredito);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
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
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
			
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
			
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDetaNotaCredito;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDetaNotaCredito() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDetaNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDetaNotaCredito.setName("jPanelReporteDinamicoTipoDetaNotaCredito"); 
		
		this.jPanelReporteDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDetaNotaCredito.setLayout(gridaBagLayoutReporteDinamicoTipoDetaNotaCredito);
		
		
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDetaNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetaNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDetaNotaCredito = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDetaNotaCredito.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jLabelColumnasSelectReporteTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDetaNotaCredito = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDetaNotaCredito=new JScrollPane(this.jListColumnasSelectReporteTipoDetaNotaCredito);
			
			this.jScrollColumnasSelectReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jListColumnasSelectReporteTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jScrollColumnasSelectReporteTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDetaNotaCredito = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDetaNotaCredito.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDetaNotaCredito = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDetaNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDetaNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDetaNotaCredito=new JScrollPane(this.jListRelacionesSelectReporteTipoDetaNotaCredito);
			
			this.jScrollRelacionesSelectReporteTipoDetaNotaCredito.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetaNotaCredito.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetaNotaCredito.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDetaNotaCredito = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDetaNotaCredito = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDetaNotaCredito = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jLabelGenerarExcelReporteDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito.setToolTipText("Generar EXCEL"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jButtonGenerarExcelReporteDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jComboBoxTiposReportesDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jLabelTiposArchivoReporteDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito.setToolTipText("Generar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jButtonGenerarReporteDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito.setToolTipText("Cancelar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaNotaCredito.add(this.jButtonCerrarReporteDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDetaNotaCredito = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDetaNotaCredito= new JScrollPane(jPanelReporteDinamicoTipoDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDetaNotaCredito);
		this.jInternalFrameReporteDinamicoTipoDetaNotaCredito.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDetaNotaCredito() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDetaNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDetaNotaCredito.setName("jPanelImportacionTipoDetaNotaCredito"); 
		
		this.jPanelImportacionTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDetaNotaCredito.setLayout(gridaBagLayoutImportacionTipoDetaNotaCredito);
		
		
		this.jInternalFrameImportacionTipoDetaNotaCredito= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDetaNotaCredito= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDetaNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetaNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetaNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetaNotaCredito.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionTipoDetaNotaCredito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDetaNotaCredito = new JLabelMe();

		this.jLabelArchivoImportacionTipoDetaNotaCredito.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetaNotaCredito.add(this.jLabelArchivoImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDetaNotaCredito = new JFileChooser();		
		this.jFileChooserImportacionTipoDetaNotaCredito.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDetaNotaCredito = new JButtonMe();
		this.jButtonAbrirImportacionTipoDetaNotaCredito.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDetaNotaCredito,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDetaNotaCredito.setToolTipText("Generar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaNotaCredito.add(this.jButtonAbrirImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDetaNotaCredito = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDetaNotaCredito.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetaNotaCredito.add(this.jLabelPathArchivoImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDetaNotaCredito=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDetaNotaCredito.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetaNotaCredito.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetaNotaCredito.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaNotaCredito.add(this.jTextFieldPathArchivoImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDetaNotaCredito = new JButtonMe();
		this.jButtonGenerarImportacionTipoDetaNotaCredito.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDetaNotaCredito,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDetaNotaCredito.setToolTipText("Generar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaNotaCredito.add(this.jButtonGenerarImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarImportacionTipoDetaNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDetaNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDetaNotaCredito.setToolTipText("Cancelar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaNotaCredito.add(this.jButtonCerrarImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDetaNotaCredito = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDetaNotaCredito= new JScrollPane(jPanelImportacionTipoDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDetaNotaCredito);
		this.jInternalFrameImportacionTipoDetaNotaCredito.getContentPane().add(this.jScrollPanelImportacionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDetaNotaCredito(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDetaNotaCredito = new JButtonMe();
			this.jButtonAbrirOrderByTipoDetaNotaCredito.setText("Orden");
			this.jButtonAbrirOrderByTipoDetaNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetaNotaCredito,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDetaNotaCredito";
			inputMap = this.jButtonAbrirOrderByTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDetaNotaCredito"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDetaNotaCredito = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDetaNotaCredito.setName("jPanelOrderByTipoDetaNotaCredito"); 
			
			this.jPanelOrderByTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDetaNotaCredito.setLayout(gridaBagLayoutOrderByTipoDetaNotaCredito);
			
			
			this.jTableDatosTipoDetaNotaCreditoOrderBy = new JTableMe();        
			this.jTableDatosTipoDetaNotaCreditoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDetaNotaCreditoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDetaNotaCreditoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDetaNotaCreditoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDetaNotaCreditoOrderBy.setViewportView(this.jTableDatosTipoDetaNotaCreditoOrderBy);
			this.jTableDatosTipoDetaNotaCreditoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDetaNotaCreditoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDetaNotaCredito= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDetaNotaCredito= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDetaNotaCredito = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDetaNotaCredito= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDetaNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDetaNotaCredito.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDetaNotaCredito.setTitle("Orden");
			this.jInternalFrameOrderByTipoDetaNotaCredito.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDetaNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDetaNotaCredito.setResizable(true);
			this.jInternalFrameOrderByTipoDetaNotaCredito.setClosable(true);
			this.jInternalFrameOrderByTipoDetaNotaCredito.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDetaNotaCredito.ipady =150;
				
			this.jPanelOrderByTipoDetaNotaCredito.add(jScrollPanelDatosTipoDetaNotaCreditoOrderBy, this.gridBagConstraintsTipoDetaNotaCredito);//this.jTableDatosTipoDetaNotaCreditoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDetaNotaCredito = new JButtonMe();
			this.jButtonCerrarOrderByTipoDetaNotaCredito.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDetaNotaCredito,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDetaNotaCredito.setToolTipText("Cancelar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDetaNotaCredito.add(this.jButtonCerrarOrderByTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDetaNotaCredito = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDetaNotaCredito= new JScrollPane(jPanelOrderByTipoDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDetaNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDetaNotaCredito.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDetaNotaCredito);
			
			this.jInternalFrameOrderByTipoDetaNotaCredito.getContentPane().add(this.jScrollPanelOrderByTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
		
		} else {
			this.jButtonAbrirOrderByTipoDetaNotaCredito = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDetaNotaCredito.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDetaNotaCredito.getRowHeight();//TipoDetaNotaCreditoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.isSelected()) {
					iHeightTable=TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetaNotaCredito.isSelected()) {
					iHeightTable=TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetaNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDetaNotaCredito!=null && this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDetaNotaCredito.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDetaNotaCredito.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDetaNotaCredito.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDetaNotaCredito.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodetanotacreditoLogic.getTipoDetaNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetanotacreditos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDetaNotaCredito> TraerTipoDetaNotaCreditoBeans(List<TipoDetaNotaCredito> tipodetanotacreditos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDetaNotaCredito tipodetanotacredito:tipodetanotacreditos) {
					
				if(!(TipoDetaNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDetaNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodetanotacredito.setsDetalleGeneralEntityReporte(TipoDetaNotaCreditoConstantesFunciones.getTipoDetaNotaCreditoDescripcion(tipodetanotacredito));
										
						
					
						
					
				} else  {
							
					//tipodetanotacredito.setsDetalleGeneralEntityReporte(tipodetanotacredito.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodetanotacreditobeans.add(tipodetanotacreditobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodetanotacreditos;
    }
	//PARA REPORTES FIN
}
