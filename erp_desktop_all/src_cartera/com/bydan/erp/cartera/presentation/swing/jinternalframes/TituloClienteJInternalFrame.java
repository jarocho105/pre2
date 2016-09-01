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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.cartera.util.TituloClienteConstantesFunciones;

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
public class TituloClienteJInternalFrame extends TituloClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTituloCliente;
	
	protected JMenuBar jmenuBarTituloCliente;
	
	protected JMenu jmenuTituloCliente;
	protected JMenu jmenuDatosTituloCliente;
	protected JMenu jmenuArchivoTituloCliente;
	protected JMenu jmenuAccionesTituloCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTituloCliente;	
	protected GridBagConstraints gridBagConstraintsTituloCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TituloClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTituloCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTituloCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTituloCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TituloClienteSessionBean tituloclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TituloCliente> tituloclientes;		
	public List<TituloCliente> tituloclientesEliminados;	
	public List<TituloCliente> tituloclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTituloCliente;		
	protected JButton jButtonAbrirOrderByTituloCliente;
	
	
	//protected JPanel jPanelOrderByTituloCliente;
	//public JScrollPane jScrollPanelOrderByTituloCliente;	
	//protected JButton jButtonCerrarOrderByTituloCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TituloClienteLogic tituloclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTituloCliente;
	public JScrollPane jScrollPanelDatosEdicionTituloCliente;
	public JScrollPane jScrollPanelDatosGeneralTituloCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTituloClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTituloCliente;
	//public JScrollPane jScrollPanelImportacionTituloCliente;
	
	
	
	protected JPanel jPanelAccionesTituloCliente;
	
    protected JPanel jPanelPaginacionTituloCliente;
    protected JPanel jPanelParametrosReportesTituloCliente;
	protected JPanel jPanelParametrosReportesAccionesTituloCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TituloCliente;
	protected JPanel jPanelParametrosAuxiliar2TituloCliente;
	protected JPanel jPanelParametrosAuxiliar3TituloCliente;
	protected JPanel jPanelParametrosAuxiliar4TituloCliente;
	//protected JPanel jPanelParametrosAuxiliar5TituloCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTituloCliente;
	//protected JPanel jPanelImportacionTituloCliente;
	
	
	public JTable jTableDatosTituloCliente;
	
	
	
	//public JTable jTableDatosTituloClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTituloCliente;
	protected JButton jButtonDuplicarTituloCliente;
	protected JButton jButtonCopiarTituloCliente;
	protected JButton jButtonVerFormTituloCliente;
	protected JButton jButtonNuevoRelacionesTituloCliente;
	protected JButton jButtonModificarTituloCliente;
	
    protected JButton jButtonGuardarCambiosTablaTituloCliente;
	protected JButton jButtonCerrarTituloCliente;
	
	
	protected JButton jButtonRecargarInformacionTituloCliente;
	protected JButton jButtonProcesarInformacionTituloCliente;
	
	
	protected JButton jButtonAnterioresTituloCliente;
	protected JButton jButtonSiguientesTituloCliente;
	protected JButton jButtonNuevoGuardarCambiosTituloCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTituloCliente;
	//protected JButton jButtonCerrarReporteDinamicoTituloCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTituloCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTituloCliente;
	//protected JButton jButtonGenerarImportacionTituloCliente;
	//protected JButton jButtonCerrarImportacionTituloCliente;
	//protected JFileChooser jFileChooserImportacionTituloCliente;
	//protected File fileImportacionTituloCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTituloCliente;
	protected JButton jButtonDuplicarToolBarTituloCliente;
	protected JButton jButtonNuevoRelacionesToolBarTituloCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTituloCliente;
	protected JButton jButtonCopiarToolBarTituloCliente;
	protected JButton jButtonVerFormToolBarTituloCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTituloCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTituloCliente;
	protected JButton jButtonCerrarToolBarTituloCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTituloCliente;
	protected JButton jButtonProcesarInformacionToolBarTituloCliente;
	protected JButton jButtonAnterioresToolBarTituloCliente;
	protected JButton jButtonSiguientesToolBarTituloCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTituloCliente;
	protected JButton jButtonAbrirOrderByToolBarTituloCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTituloCliente;
	protected JMenuItem jMenuItemDuplicarTituloCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTituloCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTituloCliente;
	protected JMenuItem jMenuItemCopiarTituloCliente;
	protected JMenuItem jMenuItemVerFormTituloCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTituloCliente;
	protected JMenuItem jMenuItemCerrarTituloCliente;
	protected JMenuItem jMenuItemDetalleCerrarTituloCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTituloCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTituloCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTituloCliente;
	protected JMenuItem jMenuItemProcesarInformacionTituloCliente;
	protected JMenuItem jMenuItemAnterioresTituloCliente;
	protected JMenuItem jMenuItemSiguientesTituloCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTituloCliente;
	protected JMenuItem jMenuItemAbrirOrderByTituloCliente;
	protected JMenuItem jMenuItemMostrarOcultarTituloCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTituloCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTituloCliente;
	protected JCheckBox jCheckBoxSeleccionadosTituloCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTituloCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTituloCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTituloCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTituloCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTituloCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTituloCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTituloCliente;
	protected JTextField jTextFieldValorCampoGeneralTituloCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTituloCliente;
	//public JList<Reporte> jListColumnasSelectReporteTituloCliente;
	//public JScrollPane jScrollColumnasSelectReporteTituloCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTituloCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTituloCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTituloCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTituloCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTituloCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTituloCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTituloCliente;
	
		
	//public JLabel jLabelArchivoImportacionTituloCliente;	
	//public JLabel jLabelPathArchivoImportacionTituloCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTituloCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTituloCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTituloCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTituloCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTituloCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTituloCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTituloCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTituloCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTituloCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTituloCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTituloCliente;
	public JPanel jPanelBusquedaPorCodigoTituloCliente;
	public JButton jButtonBusquedaPorCodigoTituloCliente;
	public JPanel jPanelBusquedaPorNombreTituloCliente;
	public JButton jButtonBusquedaPorNombreTituloCliente;
	public JPanel jPanelBusquedaPorSiglasTituloCliente;
	public JButton jButtonBusquedaPorSiglasTituloCliente;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTituloCliente;
	public JLabel jLabelcodigoBusquedaPorCodigoTituloCliente;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTituloCliente;
	public JButton jButtoncodigoBusquedaPorCodigoTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTituloCliente;
	public JLabel jLabelnombreBusquedaPorNombreTituloCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreTituloCliente;
	public JButton jButtonnombreBusquedaPorNombreTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasTituloCliente;
	public JLabel jLabelsiglasBusquedaPorSiglasTituloCliente;
	public JTextField jTextFieldsiglasBusquedaPorSiglasTituloCliente;
	public JButton jButtonsiglasBusquedaPorSiglasTituloClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TituloClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTituloCliente)	{
		this.jButtonRecargarInformacionTituloCliente = jButtonRecargarInformacionTituloCliente;
	}
	
	public JButton getjButtonProcesarInformacionTituloCliente() {
		return this.jButtonProcesarInformacionTituloCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTituloCliente)	{
		this.jButtonProcesarInformacionTituloCliente = jButtonProcesarInformacionTituloCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTituloCliente() {
		return this.jButtonRecargarInformacionTituloCliente;
	}
	
	
	public List<TituloCliente> gettituloclientes() {
		return this.tituloclientes;
	}

	public void settituloclientes(List<TituloCliente> tituloclientes) {
		this.tituloclientes = tituloclientes;
	}
	
	public List<TituloCliente> gettituloclientesAux() {
		return this.tituloclientesAux;
	}

	public void settituloclientesAux(List<TituloCliente> tituloclientesAux) {
		this.tituloclientesAux = tituloclientesAux;
	}
	
	public List<TituloCliente> gettituloclientesEliminados() {
		return this.tituloclientesEliminados;
	}

	public void setTituloClientesEliminados(List<TituloCliente> tituloclientesEliminados) {
		this.tituloclientesEliminados = tituloclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTituloCliente() {
		return jComboBoxTiposSeleccionarTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTituloCliente(
			JComboBox jComboBoxTiposSeleccionarTituloCliente) {
		this.jComboBoxTiposSeleccionarTituloCliente = jComboBoxTiposSeleccionarTituloCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTituloCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTituloCliente() {
		return jTextFieldValorCampoGeneralTituloCliente;
	}

	public void setjTextFieldValorCampoGeneralTituloCliente(
			JTextField jTextFieldValorCampoGeneralTituloCliente) {
		this.jTextFieldValorCampoGeneralTituloCliente = jTextFieldValorCampoGeneralTituloCliente;
	}

	public void setBorderResaltarValorCampoGeneralTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTituloCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTituloCliente() {
		return this.jCheckBoxSeleccionarTodosTituloCliente;
	}

	public void setjCheckBoxSeleccionarTodosTituloCliente(
			JCheckBox jCheckBoxSeleccionarTodosTituloCliente) {
		this.jCheckBoxSeleccionarTodosTituloCliente = jCheckBoxSeleccionarTodosTituloCliente;
	}

	public void setBorderResaltarSeleccionarTodosTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTituloCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTituloCliente() {
		return this.jCheckBoxSeleccionadosTituloCliente;
	}

	public void setjCheckBoxSeleccionadosTituloCliente(
			JCheckBox jCheckBoxSeleccionadosTituloCliente) {
		this.jCheckBoxSeleccionadosTituloCliente = jCheckBoxSeleccionadosTituloCliente;
	}
	
	public void setBorderResaltarSeleccionadosTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTituloCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTituloCliente() {
		return this.jComboBoxTiposArchivosReportesTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTituloCliente(
			JComboBox jComboBoxTiposArchivosReportesTituloCliente) {
		this.jComboBoxTiposArchivosReportesTituloCliente = jComboBoxTiposArchivosReportesTituloCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTituloCliente() {
		return this.jComboBoxTiposReportesTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTituloCliente(
			JComboBox jComboBoxTiposReportesTituloCliente) {
		this.jComboBoxTiposReportesTituloCliente = jComboBoxTiposReportesTituloCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTituloCliente() {
	//	return jComboBoxTiposReportesDinamicoTituloCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTituloCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTituloCliente) {
	//	this.jComboBoxTiposReportesDinamicoTituloCliente = jComboBoxTiposReportesDinamicoTituloCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTituloCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTituloCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTituloCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTituloCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTituloCliente = jComboBoxTiposArchivosReportesDinamicoTituloCliente;
	//}
	
	public void setBorderResaltarTiposReportesTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTituloCliente() {
		return this.jComboBoxTiposGraficosReportesTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTituloCliente(
			JComboBox jComboBoxTiposGraficosReportesTituloCliente) {
		this.jComboBoxTiposGraficosReportesTituloCliente = jComboBoxTiposGraficosReportesTituloCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTituloCliente() {
		return this.jComboBoxTiposPaginacionTituloCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTituloCliente(
			JComboBox jComboBoxTiposPaginacionTituloCliente) {
		this.jComboBoxTiposPaginacionTituloCliente = jComboBoxTiposPaginacionTituloCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTituloCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTituloCliente() {
		return this.jComboBoxTiposRelacionesTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTituloCliente() {
		return this.jComboBoxTiposAccionesTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTituloCliente(
			JComboBox jComboBoxTiposRelacionesTituloCliente) {
		this.jComboBoxTiposRelacionesTituloCliente = jComboBoxTiposRelacionesTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTituloCliente(
			JComboBox jComboBoxTiposAccionesTituloCliente) {
		this.jComboBoxTiposAccionesTituloCliente = jComboBoxTiposAccionesTituloCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTituloCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTituloCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTituloCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTituloCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTituloCliente() {
	//	return jCheckBoxConGraficoDinamicoTituloCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTituloCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTituloCliente) {
	//	this.jCheckBoxConGraficoDinamicoTituloCliente = jCheckBoxConGraficoDinamicoTituloCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTituloCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTituloCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTituloCliente .setBorder(borderResaltar);		
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
		this.tituloclienteSessionBean=new TituloClienteSessionBean();
		
		this.tituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tituloclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TituloClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Comercial Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TituloClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTituloCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"nuevo","nuevo","Nuevo"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"duplicar","duplicar","Duplicar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"copiar","copiar","Copiar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"ver_form","ver_form","Ver"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"recargar","recargar","Recargar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTituloCliente,this.jTtoolBarTituloCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTituloCliente,this.jTtoolBarTituloCliente,
							"cerrar","cerrar","Salir"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTituloCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTituloCliente;
			
				this.jButtonProcesarInformacionToolBarTituloCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTituloCliente;
				
		//protected JButton jButtonModificarToolBarTituloCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTituloCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTituloCliente=new JMenuMe("General");
		this.jmenuArchivoTituloCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTituloCliente=new JMenuMe("Acciones");
		this.jmenuDatosTituloCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTituloCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTituloCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTituloCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTituloCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTituloCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTituloCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTituloCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTituloCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTituloCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTituloCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTituloCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTituloCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTituloCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTituloCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTituloCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTituloCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTituloCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTituloCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTituloCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTituloCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTituloCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTituloCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTituloCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTituloCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTituloCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTituloCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTituloCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTituloCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTituloCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTituloCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTituloCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTituloCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTituloCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTituloCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTituloCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTituloCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTituloCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTituloCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTituloCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTituloCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTituloCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTituloCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTituloCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTituloCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTituloCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTituloCliente.add(this.jMenuItemCerrarTituloCliente);
			
			this.jmenuAccionesTituloCliente.add(this.jMenuItemNuevoTituloCliente);
			this.jmenuAccionesTituloCliente.add(this.jMenuItemNuevoGuardarCambiosTituloCliente);
			this.jmenuAccionesTituloCliente.add(this.jMenuItemNuevoRelacionesTituloCliente);
			this.jmenuAccionesTituloCliente.add(this.jMenuItemGuardarCambiosTablaTituloCliente);		
			this.jmenuAccionesTituloCliente.add(this.jMenuItemDuplicarTituloCliente);		
			this.jmenuAccionesTituloCliente.add(this.jMenuItemCopiarTituloCliente);		
			this.jmenuAccionesTituloCliente.add(this.jMenuItemVerFormTituloCliente);		
			
			this.jmenuDatosTituloCliente.add(this.jMenuItemRecargarInformacionTituloCliente);				
			this.jmenuDatosTituloCliente.add(this.jMenuItemAnterioresTituloCliente);				
			this.jmenuDatosTituloCliente.add(this.jMenuItemSiguientesTituloCliente);				
			this.jmenuDatosTituloCliente.add(this.jMenuItemAbrirOrderByTituloCliente);				
			this.jmenuDatosTituloCliente.add(this.jMenuItemMostrarOcultarTituloCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTituloCliente.add(this.jMenuItemGuardarCambiosTituloCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTituloCliente.add(this.jmenuArchivoTituloCliente);		
			this.jmenuBarTituloCliente.add(this.jmenuAccionesTituloCliente);		
			this.jmenuBarTituloCliente.add(this.jmenuDatosTituloCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTituloCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTituloCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTituloCliente.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTituloCliente= new JButtonMe();
		this.jButtonBusquedaPorCodigoTituloCliente.setText("Buscar");
		this.jButtonBusquedaPorCodigoTituloCliente.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTituloCliente,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTituloCliente = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTituloCliente.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTituloCliente.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTituloCliente= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTituloCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTituloCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreTituloCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreTituloCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTituloCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTituloCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreTituloCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTituloCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTituloCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasTituloCliente.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasTituloCliente= new JButtonMe();
		this.jButtonBusquedaPorSiglasTituloCliente.setText("Buscar");
		this.jButtonBusquedaPorSiglasTituloCliente.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasTituloCliente,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasTituloCliente = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasTituloCliente.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasTituloCliente.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasTituloCliente= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTituloCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasTituloCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTituloCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTituloCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTituloCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTituloCliente = new TituloClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Comercial Cliente DATOS");
			this.jInternalFrameDetalleFormTituloCliente = new TituloClienteDetalleFormJInternalFrame(jDesktopPane,this.tituloclienteSessionBean.getConGuardarRelaciones(),this.tituloclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTituloCliente = null;//new TituloClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTituloCliente= new GridBagLayout();
		
		
		this.jTableDatosTituloCliente = new JTableMe();      
		
		String sToolTipTituloCliente="";
		sToolTipTituloCliente=TituloClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTituloCliente+="(Cartera.TituloCliente)";
		}
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTituloCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTituloCliente.setToolTipText(sToolTipTituloCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTituloCliente);
		this.jTableDatosTituloCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTituloCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTituloCliente.setRowSelectionAllowed(true);
		this.jTableDatosTituloCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTituloCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTituloCliente = new JButtonMe();
		this.jButtonDuplicarTituloCliente = new JButtonMe();
		this.jButtonCopiarTituloCliente = new JButtonMe();
		this.jButtonVerFormTituloCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTituloCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTituloCliente = new JButtonMe();
		this.jButtonCerrarTituloCliente = new JButtonMe();
		
		this.jScrollPanelDatosTituloCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTituloCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Comercial Cliente";
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comercial Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTituloCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTituloCliente.setToolTipText("Acciones");
        this.jPanelAccionesTituloCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTituloCliente=new ReporteDinamicoJInternalFrame(TituloClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTituloCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTituloCliente=new ImportacionJInternalFrame(TituloClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTituloCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTituloCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTituloCliente.setText("Orden");
		this.jButtonAbrirOrderByTituloCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTituloCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTituloCliente,false,this);
			
			//this.cargarOrderByTituloCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTituloCliente,true,this);
			
			//this.cargarOrderByTituloCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTituloCliente.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTituloCliente.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTituloCliente.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTituloCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTituloCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTituloCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTituloCliente.setText("Nuevo");
		this.jButtonDuplicarTituloCliente.setText("Duplicar");
		this.jButtonCopiarTituloCliente.setText("Copiar");
		this.jButtonVerFormTituloCliente.setText("Ver");
		this.jButtonNuevoRelacionesTituloCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTituloCliente.setText("Guardar");
		this.jButtonCerrarTituloCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTituloCliente,"nuevo_button","Nuevo",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTituloCliente,"duplicar_button","Duplicar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTituloCliente,"copiar_button","Copiar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTituloCliente,"ver_form","Ver",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTituloCliente,"nuevorelaciones_button","Nuevo Rel",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTituloCliente,"guardarcambiostabla_button","Guardar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTituloCliente,"cerrar_button","Salir",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTituloCliente.setToolTipText("Nuevo"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTituloCliente.setToolTipText("Duplicar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTituloCliente.setToolTipText("Copiar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTituloCliente.setToolTipText("Ver"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTituloCliente.setToolTipText("Nuevo Rel"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTituloCliente.setToolTipText("Guardar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTituloCliente.setToolTipText("Salir"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTituloCliente";
		inputMap = this.jButtonNuevoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTituloCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTituloCliente";
		inputMap = this.jButtonDuplicarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTituloCliente"));
		
		//COPIAR
		sMapKey = "CopiarTituloCliente";
		inputMap = this.jButtonCopiarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTituloCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTituloCliente";
		inputMap = this.jButtonVerFormTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTituloCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTituloCliente";
		inputMap = this.jButtonNuevoRelacionesTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTituloCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTituloCliente";
		inputMap = this.jButtonModificarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTituloCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTituloCliente";
		inputMap = this.jButtonCerrarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTituloCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTituloCliente";
		inputMap = this.jButtonGuardarCambiosTablaTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTituloCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTituloCliente.setName("jPanelParametrosReportesTituloCliente"); 
		
		this.jPanelParametrosReportesAccionesTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTituloCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTituloCliente.setName("jPanelParametrosReportesAccionesTituloCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTituloCliente = new JButtonMe();
		this.jButtonRecargarInformacionTituloCliente.setText("Recargar");
		this.jButtonRecargarInformacionTituloCliente.setToolTipText("Recargar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTituloCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTituloCliente = new JButtonMe();
		this.jButtonProcesarInformacionTituloCliente.setText("Procesar");
		this.jButtonProcesarInformacionTituloCliente.setToolTipText("Procesar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTituloCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTituloCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTituloCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTituloCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTituloCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTituloCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTituloCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTituloCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTituloCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTituloCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTituloCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTituloCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTituloCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTituloCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTituloCliente.setText("Accion");
		this.jComboBoxTiposAccionesTituloCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTituloCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTituloCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTituloCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTituloCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTituloCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTituloCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTituloCliente = new JLabelMe();
		
		this.jLabelAccionesTituloCliente.setText("Acciones");		
		this.jLabelAccionesTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTituloCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTituloCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTituloCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTituloCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTituloCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTituloCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTituloCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTituloCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTituloCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTituloCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTituloCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTituloCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTituloCliente = new JButtonMe();
		//this.jButtonAnterioresTituloCliente.setText("<<");
        this.jButtonAnterioresTituloCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTituloCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTituloCliente = new JButtonMe();
		//this.jButtonSiguientesTituloCliente.setText(">>");
        this.jButtonSiguientesTituloCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTituloCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTituloCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTituloCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTituloCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTituloCliente,"nuevoguardarcambios_button","Nue",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTituloCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTituloCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTituloCliente";
		inputMap = this.jButtonRecargarInformacionTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTituloCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTituloCliente";
		inputMap = this.jButtonSiguientesTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTituloCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTituloCliente";
		inputMap = this.jButtonAnterioresTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTituloCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTituloCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTituloCliente.setMinimumSize(new Dimension(this.getWidth(),TituloClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TituloClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTituloCliente.setMaximumSize(new Dimension(this.getWidth(),TituloClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TituloClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTituloCliente.setPreferredSize(new Dimension(this.getWidth(),TituloClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TituloClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTituloCliente = new GridBagLayout();

			this.jPanelPaginacionTituloCliente.setLayout(gridaBagLayoutPaginacionTituloCliente);						
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 0;
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTituloCliente.add(this.jButtonAnterioresTituloCliente, this.gridBagConstraintsTituloCliente);
					
						
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTituloCliente.gridy = 0;
			
			this.jPanelPaginacionTituloCliente.add(this.jButtonNuevoGuardarCambiosTituloCliente, this.gridBagConstraintsTituloCliente);
						
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTituloCliente.gridy = 0;
			this.jPanelPaginacionTituloCliente.add(this.jButtonSiguientesTituloCliente, this.gridBagConstraintsTituloCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 1;
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTituloCliente.add(this.jButtonNuevoTituloCliente, this.gridBagConstraintsTituloCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTituloCliente.gridy = 1;
				this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTituloCliente.add(this.jButtonNuevoRelacionesTituloCliente, this.gridBagConstraintsTituloCliente);
			}
			
			
			if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTituloCliente.gridy = 1;
				this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTituloCliente.add(this.jButtonGuardarCambiosTablaTituloCliente, this.gridBagConstraintsTituloCliente);
			}
			
			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 1;
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTituloCliente.add(this.jButtonDuplicarTituloCliente, this.gridBagConstraintsTituloCliente);
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 1;
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTituloCliente.add(this.jButtonCopiarTituloCliente, this.gridBagConstraintsTituloCliente);
		
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 1;
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTituloCliente.add(this.jButtonVerFormTituloCliente, this.gridBagConstraintsTituloCliente);
		
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 1;
			this.gridBagConstraintsTituloCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTituloCliente.add(this.jButtonCerrarTituloCliente, this.gridBagConstraintsTituloCliente);
		
		
		
		this.jButtonRecargarInformacionTituloCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTituloCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTituloCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTituloCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTituloCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTituloCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTituloCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTituloCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTituloCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTituloCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTituloCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTituloCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTituloCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTituloCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTituloCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTituloCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTituloCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTituloCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTituloCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTituloCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTituloCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTituloCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTituloCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTituloCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTituloCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTituloCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTituloCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTituloCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TituloCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TituloCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTituloCliente.setLayout(gridaBagParametrosReportesTituloCliente);
			this.jPanelParametrosReportesAccionesTituloCliente.setLayout(gridaBagParametrosReportesAccionesTituloCliente);
			
			
			this.jPanelParametrosAuxiliar1TituloCliente.setLayout(gridaBagParametrosAuxiliar1TituloCliente);
			this.jPanelParametrosAuxiliar2TituloCliente.setLayout(gridaBagParametrosAuxiliar2TituloCliente);
			this.jPanelParametrosAuxiliar3TituloCliente.setLayout(gridaBagParametrosAuxiliar3TituloCliente);
			this.jPanelParametrosAuxiliar4TituloCliente.setLayout(gridaBagParametrosAuxiliar4TituloCliente);
			//this.jPanelParametrosAuxiliar5TituloCliente.setLayout(gridaBagParametrosAuxiliar2TituloCliente);			
			
			
			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTituloCliente.add(this.jButtonRecargarInformacionTituloCliente, this.gridBagConstraintsTituloCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TituloCliente.add(this.jComboBoxTiposPaginacionTituloCliente, this.gridBagConstraintsTituloCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TituloCliente.add(this.jCheckBoxConAltoMaximoTablaTituloCliente, this.gridBagConstraintsTituloCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TituloCliente.add(this.jComboBoxTiposArchivosReportesTituloCliente, this.gridBagConstraintsTituloCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTituloCliente.add(this.jPanelParametrosAuxiliar1TituloCliente, this.gridBagConstraintsTituloCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTituloCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TituloCliente.add(this.jComboBoxTiposReportesTituloCliente, this.gridBagConstraintsTituloCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTituloCliente.add(this.jPanelParametrosAuxiliar4TituloCliente, this.gridBagConstraintsTituloCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTituloCliente.add(this.jComboBoxTiposReportesTituloCliente, this.gridBagConstraintsTituloCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTituloCliente.add(this.jCheckBoxGenerarReporteTituloCliente, this.gridBagConstraintsTituloCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTituloCliente.add(this.jPanelParametrosAuxiliar2TituloCliente, this.gridBagConstraintsTituloCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTituloCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTituloCliente.add(this.jLabelAccionesTituloCliente, this.gridBagConstraintsTituloCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTituloCliente.add(this.jButtonAbrirOrderByTituloCliente, this.gridBagConstraintsTituloCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTituloCliente.add(this.jComboBoxTiposSeleccionarTituloCliente, this.gridBagConstraintsTituloCliente);			
			
			
			/*
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTituloCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTituloCliente.add(this.jCheckBoxSeleccionarTodosTituloCliente, this.gridBagConstraintsTituloCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTituloCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TituloCliente.add(this.jCheckBoxSeleccionarTodosTituloCliente, this.gridBagConstraintsTituloCliente);															
				
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTituloCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TituloCliente.add(this.jCheckBoxSeleccionadosTituloCliente, this.gridBagConstraintsTituloCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTituloCliente.add(this.jPanelParametrosAuxiliar3TituloCliente, this.gridBagConstraintsTituloCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTituloCliente.add(this.jComboBoxTiposRelacionesTituloCliente, this.gridBagConstraintsTituloCliente);
				
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTituloCliente.add(this.jComboBoxTiposAccionesTituloCliente, this.gridBagConstraintsTituloCliente);
	
				
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTituloCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTituloCliente.add(this.jTextFieldValorCampoGeneralTituloCliente, this.gridBagConstraintsTituloCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTituloCliente = new GridBagLayout();

			this.jScrollPanelDatosTituloCliente.setLayout(gridaBagLayoutDatosTituloCliente);
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = 0;
			this.gridBagConstraintsTituloCliente.gridx = 0;
			
			this.jScrollPanelDatosTituloCliente.add(this.jTableDatosTituloCliente, this.gridBagConstraintsTituloCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTituloCliente.setViewportView(this.jTableDatosTituloCliente);
		this.jTableDatosTituloCliente.setFillsViewportHeight(true);
		this.jTableDatosTituloCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTituloCliente= new GridBagLayout();
		this.jPanelAccionesTituloCliente.setLayout(gridaBagLayoutAccionesTituloCliente);
		
		
		/*	
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = 0;
			
		this.jPanelAccionesTituloCliente.add(this.jButtonNuevoTituloCliente, this.gridBagConstraintsTituloCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTituloCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTituloCliente.setLayout(gridaBagLayoutBusquedaPorCodigoTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 0;
		gridBagConstraintsTituloCliente.gridx = 0;
		jPanelBusquedaPorCodigoTituloCliente.add(jLabelcodigoBusquedaPorCodigoTituloCliente, gridBagConstraintsTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 0;
		gridBagConstraintsTituloCliente.gridx = 1;
		jPanelBusquedaPorCodigoTituloCliente.add(jTextFieldcodigoBusquedaPorCodigoTituloCliente, gridBagConstraintsTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 1;
		gridBagConstraintsTituloCliente.gridx =1;
		jPanelBusquedaPorCodigoTituloCliente.add(jButtonBusquedaPorCodigoTituloCliente, gridBagConstraintsTituloCliente);

		jTabbedPaneBusquedasTituloCliente.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTituloCliente);
		jTabbedPaneBusquedasTituloCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTituloCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTituloCliente.setLayout(gridaBagLayoutBusquedaPorNombreTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 0;
		gridBagConstraintsTituloCliente.gridx = 0;
		jPanelBusquedaPorNombreTituloCliente.add(jLabelnombreBusquedaPorNombreTituloCliente, gridBagConstraintsTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 0;
		gridBagConstraintsTituloCliente.gridx = 1;
		jPanelBusquedaPorNombreTituloCliente.add(jTextAreanombreBusquedaPorNombreTituloCliente, gridBagConstraintsTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 1;
		gridBagConstraintsTituloCliente.gridx =1;
		jPanelBusquedaPorNombreTituloCliente.add(jButtonBusquedaPorNombreTituloCliente, gridBagConstraintsTituloCliente);

		jTabbedPaneBusquedasTituloCliente.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTituloCliente);
		jTabbedPaneBusquedasTituloCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasTituloCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasTituloCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTituloCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTituloCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasTituloCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasTituloCliente.setLayout(gridaBagLayoutBusquedaPorSiglasTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 0;
		gridBagConstraintsTituloCliente.gridx = 0;
		jPanelBusquedaPorSiglasTituloCliente.add(jLabelsiglasBusquedaPorSiglasTituloCliente, gridBagConstraintsTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 0;
		gridBagConstraintsTituloCliente.gridx = 1;
		jPanelBusquedaPorSiglasTituloCliente.add(jTextFieldsiglasBusquedaPorSiglasTituloCliente, gridBagConstraintsTituloCliente);

		gridBagConstraintsTituloCliente = new GridBagConstraints();
		gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTituloCliente.gridy = 1;
		gridBagConstraintsTituloCliente.gridx =1;
		jPanelBusquedaPorSiglasTituloCliente.add(jButtonBusquedaPorSiglasTituloCliente, gridBagConstraintsTituloCliente);

		jTabbedPaneBusquedasTituloCliente.addTab("3.-Por Siglas ", jPanelBusquedaPorSiglasTituloCliente);
		jTabbedPaneBusquedasTituloCliente.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTituloCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTituloCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();						
			this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTituloCliente.gridx = 0;		
			//this.gridBagConstraintsTituloCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTituloCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTituloCliente, this.gridBagConstraintsTituloCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTituloCliente.gridx = 0;		
		//this.gridBagConstraintsTituloCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTituloCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTituloCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTituloCliente.gridx = 0;		
			this.gridBagConstraintsTituloCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTituloCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTituloCliente, this.gridBagConstraintsTituloCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTituloCliente, this.gridBagConstraintsTituloCliente);								
		
		
		/*
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTituloCliente, this.gridBagConstraintsTituloCliente);
		*/		
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTituloCliente.gridx =0;
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTituloCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTituloCliente, this.gridBagConstraintsTituloCliente);
				
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTituloCliente, this.gridBagConstraintsTituloCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTituloCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTituloCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTituloCliente.setLayout(gridaBagLayoutBusquedasParametrosTituloCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTituloCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTituloCliente, this.gridBagConstraintsTituloCliente);
			
			
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTituloCliente, this.gridBagConstraintsTituloCliente);
		
			
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTituloCliente, this.gridBagConstraintsTituloCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTituloCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTituloCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTituloCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTituloCliente.setName("jPanelReporteDinamicoTituloCliente"); 
		
		this.jPanelReporteDinamicoTituloCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTituloCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTituloCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTituloCliente.setLayout(gridaBagLayoutReporteDinamicoTituloCliente);
		
		
		this.jInternalFrameReporteDinamicoTituloCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTituloCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTituloCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTituloCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTituloCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTituloCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTituloCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTituloCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTituloCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTituloCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTituloCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTituloCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comercial Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTituloCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTituloCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTituloCliente.add(this.jLabelColumnasSelectReporteTituloCliente, this.gridBagConstraintsTituloCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTituloCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTituloCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTituloCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTituloCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTituloCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTituloCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTituloCliente=new JScrollPane(this.jListColumnasSelectReporteTituloCliente);
			
			this.jScrollColumnasSelectReporteTituloCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTituloCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTituloCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTituloCliente.add(this.jListColumnasSelectReporteTituloCliente, this.gridBagConstraintsTituloCliente);
		this.jPanelReporteDinamicoTituloCliente.add(this.jScrollColumnasSelectReporteTituloCliente, this.gridBagConstraintsTituloCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTituloCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTituloCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTituloCliente.add(this.jLabelRelacionesSelectReporteTituloCliente, this.gridBagConstraintsTituloCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTituloCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTituloCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTituloCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTituloCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTituloCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTituloCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTituloCliente=new JScrollPane(this.jListRelacionesSelectReporteTituloCliente);
			
			this.jScrollRelacionesSelectReporteTituloCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTituloCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTituloCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTituloCliente.add(this.jListRelacionesSelectReporteTituloCliente, this.gridBagConstraintsTituloCliente);
		this.jPanelReporteDinamicoTituloCliente.add(this.jScrollRelacionesSelectReporteTituloCliente, this.gridBagConstraintsTituloCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTituloCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTituloCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTituloCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTituloCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTituloCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTituloCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTituloCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTituloCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTituloCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTituloCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTituloCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTituloCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTituloCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTituloCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTituloCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTituloCliente.add(this.jLabelGenerarExcelReporteDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTituloCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTituloCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTituloCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTituloCliente.setToolTipText("Generar EXCEL"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTituloCliente.add(this.jButtonGenerarExcelReporteDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTituloCliente.add(this.jComboBoxTiposReportesDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTituloCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTituloCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTituloCliente.add(this.jLabelTiposArchivoReporteDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTituloCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTituloCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTituloCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTituloCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTituloCliente.setToolTipText("Generar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTituloCliente.add(this.jButtonGenerarReporteDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTituloCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTituloCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTituloCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTituloCliente.setToolTipText("Cancelar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTituloCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTituloCliente.add(this.jButtonCerrarReporteDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTituloCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTituloCliente= new JScrollPane(jPanelReporteDinamicoTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTituloCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTituloCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTituloCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comercial Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTituloCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTituloCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTituloCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTituloCliente);
		this.jInternalFrameReporteDinamicoTituloCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTituloCliente, this.gridBagConstraintsTituloCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTituloCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTituloCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTituloCliente.setName("jPanelImportacionTituloCliente"); 
		
		this.jPanelImportacionTituloCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTituloCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTituloCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTituloCliente.setLayout(gridaBagLayoutImportacionTituloCliente);
		
		
		this.jInternalFrameImportacionTituloCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTituloCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTituloCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTituloCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTituloCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTituloCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTituloCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTituloCliente.setResizable(true);
	    this.jInternalFrameImportacionTituloCliente.setClosable(true);
	    this.jInternalFrameImportacionTituloCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTituloCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTituloCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTituloCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTituloCliente.setResizable(true);
	    this.jInternalFrameImportacionTituloCliente.setClosable(true);
	    this.jInternalFrameImportacionTituloCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTituloCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTituloCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTituloCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comercial Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTituloCliente = new JLabelMe();

		this.jLabelArchivoImportacionTituloCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTituloCliente.add(this.jLabelArchivoImportacionTituloCliente, this.gridBagConstraintsTituloCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTituloCliente = new JFileChooser();		
		this.jFileChooserImportacionTituloCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTituloCliente = new JButtonMe();
		this.jButtonAbrirImportacionTituloCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTituloCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTituloCliente.setToolTipText("Generar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTituloCliente.add(this.jButtonAbrirImportacionTituloCliente, this.gridBagConstraintsTituloCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTituloCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTituloCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTituloCliente.add(this.jLabelPathArchivoImportacionTituloCliente, this.gridBagConstraintsTituloCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTituloCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTituloCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTituloCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTituloCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTituloCliente.add(this.jTextFieldPathArchivoImportacionTituloCliente, this.gridBagConstraintsTituloCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTituloCliente = new JButtonMe();
		this.jButtonGenerarImportacionTituloCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTituloCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTituloCliente.setToolTipText("Generar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTituloCliente.add(this.jButtonGenerarImportacionTituloCliente, this.gridBagConstraintsTituloCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTituloCliente = new JButtonMe();
		this.jButtonCerrarImportacionTituloCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTituloCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTituloCliente.setToolTipText("Cancelar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTituloCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTituloCliente.add(this.jButtonCerrarImportacionTituloCliente, this.gridBagConstraintsTituloCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTituloCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTituloCliente= new JScrollPane(jPanelImportacionTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTituloCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTituloCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTituloCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTituloCliente);
		this.jInternalFrameImportacionTituloCliente.getContentPane().add(this.jScrollPanelImportacionTituloCliente, this.gridBagConstraintsTituloCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTituloCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTituloCliente = new JButtonMe();
			this.jButtonAbrirOrderByTituloCliente.setText("Orden");
			this.jButtonAbrirOrderByTituloCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTituloCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTituloCliente";
			inputMap = this.jButtonAbrirOrderByTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTituloCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTituloCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTituloCliente.setName("jPanelOrderByTituloCliente"); 
			
			this.jPanelOrderByTituloCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTituloCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTituloCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTituloCliente.setLayout(gridaBagLayoutOrderByTituloCliente);
			
			
			this.jTableDatosTituloClienteOrderBy = new JTableMe();        
			this.jTableDatosTituloClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTituloClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTituloClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTituloClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTituloClienteOrderBy.setViewportView(this.jTableDatosTituloClienteOrderBy);
			this.jTableDatosTituloClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTituloClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTituloCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTituloCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTituloCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTituloCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTituloCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTituloCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTituloCliente.setTitle("Orden");
			this.jInternalFrameOrderByTituloCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTituloCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTituloCliente.setResizable(true);
			this.jInternalFrameOrderByTituloCliente.setClosable(true);
			this.jInternalFrameOrderByTituloCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTituloCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTituloCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTituloCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comercial Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTituloCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTituloCliente.ipady =150;
				
			this.jPanelOrderByTituloCliente.add(jScrollPanelDatosTituloClienteOrderBy, this.gridBagConstraintsTituloCliente);//this.jTableDatosTituloClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTituloCliente = new JButtonMe();
			this.jButtonCerrarOrderByTituloCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTituloCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTituloCliente.setToolTipText("Cancelar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTituloCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTituloCliente.add(this.jButtonCerrarOrderByTituloCliente, this.gridBagConstraintsTituloCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTituloCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTituloCliente= new JScrollPane(jPanelOrderByTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTituloCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTituloCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTituloCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTituloCliente);
			
			this.jInternalFrameOrderByTituloCliente.getContentPane().add(this.jScrollPanelOrderByTituloCliente, this.gridBagConstraintsTituloCliente);			
		
		} else {
			this.jButtonAbrirOrderByTituloCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tituloclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTituloCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTituloCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTituloCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTituloCliente.getRowHeight();//TituloClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTituloCliente.isSelected()) {
					iHeightTable=TituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTituloCliente.isSelected()) {
					iHeightTable=TituloClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TituloClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTituloCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTituloCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTituloCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTituloCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTituloCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTituloCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTituloCliente!=null && this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTituloCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTituloCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTituloCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTituloCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTituloCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTituloCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tituloclienteLogic.getTituloClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tituloclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TituloCliente> TraerTituloClienteBeans(List<TituloCliente> tituloclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TituloCliente titulocliente:tituloclientes) {
					
				if(!(TituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					titulocliente.setsDetalleGeneralEntityReporte(TituloClienteConstantesFunciones.getTituloClienteDescripcion(titulocliente));
										
						
					
					

					if(titulocliente.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{titulocliente.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(titulocliente.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//titulocliente.setsDetalleGeneralEntityReporte(titulocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tituloclientebeans.add(tituloclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tituloclientes;
    }
	//PARA REPORTES FIN
}
