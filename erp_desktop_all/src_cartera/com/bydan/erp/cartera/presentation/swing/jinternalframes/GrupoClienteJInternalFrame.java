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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
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
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.cartera.util.GrupoClienteConstantesFunciones;

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
public class GrupoClienteJInternalFrame extends GrupoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGrupoCliente;
	
	protected JMenuBar jmenuBarGrupoCliente;
	
	protected JMenu jmenuGrupoCliente;
	protected JMenu jmenuDatosGrupoCliente;
	protected JMenu jmenuArchivoGrupoCliente;
	protected JMenu jmenuAccionesGrupoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoCliente;	
	protected GridBagConstraints gridBagConstraintsGrupoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GrupoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormGrupoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGrupoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGrupoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public GrupoClienteSessionBean grupoclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GrupoCliente> grupoclientes;		
	public List<GrupoCliente> grupoclientesEliminados;	
	public List<GrupoCliente> grupoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGrupoCliente;		
	protected JButton jButtonAbrirOrderByGrupoCliente;
	
	
	//protected JPanel jPanelOrderByGrupoCliente;
	//public JScrollPane jScrollPanelOrderByGrupoCliente;	
	//protected JButton jButtonCerrarOrderByGrupoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GrupoClienteLogic grupoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGrupoCliente;
	public JScrollPane jScrollPanelDatosEdicionGrupoCliente;
	public JScrollPane jScrollPanelDatosGeneralGrupoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosGrupoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGrupoCliente;
	//public JScrollPane jScrollPanelImportacionGrupoCliente;
	
	
	
	protected JPanel jPanelAccionesGrupoCliente;
	
    protected JPanel jPanelPaginacionGrupoCliente;
    protected JPanel jPanelParametrosReportesGrupoCliente;
	protected JPanel jPanelParametrosReportesAccionesGrupoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GrupoCliente;
	protected JPanel jPanelParametrosAuxiliar2GrupoCliente;
	protected JPanel jPanelParametrosAuxiliar3GrupoCliente;
	protected JPanel jPanelParametrosAuxiliar4GrupoCliente;
	//protected JPanel jPanelParametrosAuxiliar5GrupoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoGrupoCliente;
	//protected JPanel jPanelImportacionGrupoCliente;
	
	
	public JTable jTableDatosGrupoCliente;
	
	
	
	//public JTable jTableDatosGrupoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGrupoCliente;
	protected JButton jButtonDuplicarGrupoCliente;
	protected JButton jButtonCopiarGrupoCliente;
	protected JButton jButtonVerFormGrupoCliente;
	protected JButton jButtonNuevoRelacionesGrupoCliente;
	protected JButton jButtonModificarGrupoCliente;
	
    protected JButton jButtonGuardarCambiosTablaGrupoCliente;
	protected JButton jButtonCerrarGrupoCliente;
	
	
	protected JButton jButtonRecargarInformacionGrupoCliente;
	protected JButton jButtonProcesarInformacionGrupoCliente;
	
	
	protected JButton jButtonAnterioresGrupoCliente;
	protected JButton jButtonSiguientesGrupoCliente;
	protected JButton jButtonNuevoGuardarCambiosGrupoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGrupoCliente;
	//protected JButton jButtonCerrarReporteDinamicoGrupoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoGrupoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionGrupoCliente;
	//protected JButton jButtonGenerarImportacionGrupoCliente;
	//protected JButton jButtonCerrarImportacionGrupoCliente;
	//protected JFileChooser jFileChooserImportacionGrupoCliente;
	//protected File fileImportacionGrupoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoCliente;
	protected JButton jButtonDuplicarToolBarGrupoCliente;
	protected JButton jButtonNuevoRelacionesToolBarGrupoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarGrupoCliente;
	protected JButton jButtonCopiarToolBarGrupoCliente;
	protected JButton jButtonVerFormToolBarGrupoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarGrupoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoCliente;
	protected JButton jButtonCerrarToolBarGrupoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarGrupoCliente;
	protected JButton jButtonProcesarInformacionToolBarGrupoCliente;
	protected JButton jButtonAnterioresToolBarGrupoCliente;
	protected JButton jButtonSiguientesToolBarGrupoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarGrupoCliente;
	protected JButton jButtonAbrirOrderByToolBarGrupoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoCliente;
	protected JMenuItem jMenuItemDuplicarGrupoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesGrupoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGrupoCliente;
	protected JMenuItem jMenuItemCopiarGrupoCliente;
	protected JMenuItem jMenuItemVerFormGrupoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoCliente;
	protected JMenuItem jMenuItemCerrarGrupoCliente;
	protected JMenuItem jMenuItemDetalleCerrarGrupoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGrupoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionGrupoCliente;
	protected JMenuItem jMenuItemProcesarInformacionGrupoCliente;
	protected JMenuItem jMenuItemAnterioresGrupoCliente;
	protected JMenuItem jMenuItemSiguientesGrupoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoCliente;
	protected JMenuItem jMenuItemAbrirOrderByGrupoCliente;
	protected JMenuItem jMenuItemMostrarOcultarGrupoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGrupoCliente;
	protected JCheckBox jCheckBoxSeleccionadosGrupoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGrupoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteGrupoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGrupoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGrupoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGrupoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGrupoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGrupoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGrupoCliente;
	protected JTextField jTextFieldValorCampoGeneralGrupoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGrupoCliente;
	//public JList<Reporte> jListColumnasSelectReporteGrupoCliente;
	//public JScrollPane jScrollColumnasSelectReporteGrupoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteGrupoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteGrupoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteGrupoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGrupoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGrupoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGrupoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoGrupoCliente;
	
		
	//public JLabel jLabelArchivoImportacionGrupoCliente;	
	//public JLabel jLabelPathArchivoImportacionGrupoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionGrupoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGrupoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGrupoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorGrupoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGrupoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoGrupoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoGrupoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoGrupoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGrupoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGrupoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGrupoCliente;
	public JPanel jPanelBusquedaPorCodigoGrupoCliente;
	public JButton jButtonBusquedaPorCodigoGrupoCliente;
	public JPanel jPanelBusquedaPorNombreGrupoCliente;
	public JButton jButtonBusquedaPorNombreGrupoCliente;
	public JPanel jPanelBusquedaPorSiglasGrupoCliente;
	public JButton jButtonBusquedaPorSiglasGrupoCliente;
	
	public JPanel jPanelcodigoBusquedaPorCodigoGrupoCliente;
	public JLabel jLabelcodigoBusquedaPorCodigoGrupoCliente;
	public JTextField jTextFieldcodigoBusquedaPorCodigoGrupoCliente;
	public JButton jButtoncodigoBusquedaPorCodigoGrupoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreGrupoCliente;
	public JLabel jLabelnombreBusquedaPorNombreGrupoCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreGrupoCliente;
	public JButton jButtonnombreBusquedaPorNombreGrupoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasGrupoCliente;
	public JLabel jLabelsiglasBusquedaPorSiglasGrupoCliente;
	public JTextField jTextFieldsiglasBusquedaPorSiglasGrupoCliente;
	public JButton jButtonsiglasBusquedaPorSiglasGrupoClienteBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public GrupoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGrupoCliente)	{
		this.jButtonRecargarInformacionGrupoCliente = jButtonRecargarInformacionGrupoCliente;
	}
	
	public JButton getjButtonProcesarInformacionGrupoCliente() {
		return this.jButtonProcesarInformacionGrupoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoCliente)	{
		this.jButtonProcesarInformacionGrupoCliente = jButtonProcesarInformacionGrupoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionGrupoCliente() {
		return this.jButtonRecargarInformacionGrupoCliente;
	}
	
	
	public List<GrupoCliente> getgrupoclientes() {
		return this.grupoclientes;
	}

	public void setgrupoclientes(List<GrupoCliente> grupoclientes) {
		this.grupoclientes = grupoclientes;
	}
	
	public List<GrupoCliente> getgrupoclientesAux() {
		return this.grupoclientesAux;
	}

	public void setgrupoclientesAux(List<GrupoCliente> grupoclientesAux) {
		this.grupoclientesAux = grupoclientesAux;
	}
	
	public List<GrupoCliente> getgrupoclientesEliminados() {
		return this.grupoclientesEliminados;
	}

	public void setGrupoClientesEliminados(List<GrupoCliente> grupoclientesEliminados) {
		this.grupoclientesEliminados = grupoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGrupoCliente() {
		return jComboBoxTiposSeleccionarGrupoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGrupoCliente(
			JComboBox jComboBoxTiposSeleccionarGrupoCliente) {
		this.jComboBoxTiposSeleccionarGrupoCliente = jComboBoxTiposSeleccionarGrupoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGrupoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGrupoCliente() {
		return jTextFieldValorCampoGeneralGrupoCliente;
	}

	public void setjTextFieldValorCampoGeneralGrupoCliente(
			JTextField jTextFieldValorCampoGeneralGrupoCliente) {
		this.jTextFieldValorCampoGeneralGrupoCliente = jTextFieldValorCampoGeneralGrupoCliente;
	}

	public void setBorderResaltarValorCampoGeneralGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGrupoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGrupoCliente() {
		return this.jCheckBoxSeleccionarTodosGrupoCliente;
	}

	public void setjCheckBoxSeleccionarTodosGrupoCliente(
			JCheckBox jCheckBoxSeleccionarTodosGrupoCliente) {
		this.jCheckBoxSeleccionarTodosGrupoCliente = jCheckBoxSeleccionarTodosGrupoCliente;
	}

	public void setBorderResaltarSeleccionarTodosGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGrupoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGrupoCliente() {
		return this.jCheckBoxSeleccionadosGrupoCliente;
	}

	public void setjCheckBoxSeleccionadosGrupoCliente(
			JCheckBox jCheckBoxSeleccionadosGrupoCliente) {
		this.jCheckBoxSeleccionadosGrupoCliente = jCheckBoxSeleccionadosGrupoCliente;
	}
	
	public void setBorderResaltarSeleccionadosGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGrupoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGrupoCliente() {
		return this.jComboBoxTiposArchivosReportesGrupoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGrupoCliente(
			JComboBox jComboBoxTiposArchivosReportesGrupoCliente) {
		this.jComboBoxTiposArchivosReportesGrupoCliente = jComboBoxTiposArchivosReportesGrupoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGrupoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGrupoCliente() {
		return this.jComboBoxTiposReportesGrupoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGrupoCliente(
			JComboBox jComboBoxTiposReportesGrupoCliente) {
		this.jComboBoxTiposReportesGrupoCliente = jComboBoxTiposReportesGrupoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGrupoCliente() {
	//	return jComboBoxTiposReportesDinamicoGrupoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGrupoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoGrupoCliente) {
	//	this.jComboBoxTiposReportesDinamicoGrupoCliente = jComboBoxTiposReportesDinamicoGrupoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGrupoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoGrupoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGrupoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente = jComboBoxTiposArchivosReportesDinamicoGrupoCliente;
	//}
	
	public void setBorderResaltarTiposReportesGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGrupoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGrupoCliente() {
		return this.jComboBoxTiposGraficosReportesGrupoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGrupoCliente(
			JComboBox jComboBoxTiposGraficosReportesGrupoCliente) {
		this.jComboBoxTiposGraficosReportesGrupoCliente = jComboBoxTiposGraficosReportesGrupoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGrupoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGrupoCliente() {
		return this.jComboBoxTiposPaginacionGrupoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGrupoCliente(
			JComboBox jComboBoxTiposPaginacionGrupoCliente) {
		this.jComboBoxTiposPaginacionGrupoCliente = jComboBoxTiposPaginacionGrupoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGrupoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGrupoCliente() {
		return this.jComboBoxTiposRelacionesGrupoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoCliente() {
		return this.jComboBoxTiposAccionesGrupoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoCliente(
			JComboBox jComboBoxTiposRelacionesGrupoCliente) {
		this.jComboBoxTiposRelacionesGrupoCliente = jComboBoxTiposRelacionesGrupoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoCliente(
			JComboBox jComboBoxTiposAccionesGrupoCliente) {
		this.jComboBoxTiposAccionesGrupoCliente = jComboBoxTiposAccionesGrupoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGrupoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGrupoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGrupoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGrupoCliente() {
	//	return jCheckBoxConGraficoDinamicoGrupoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoGrupoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoGrupoCliente) {
	//	this.jCheckBoxConGraficoDinamicoGrupoCliente = jCheckBoxConGraficoDinamicoGrupoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGrupoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGrupoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGrupoCliente .setBorder(borderResaltar);		
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
		this.grupoclienteSessionBean=new GrupoClienteSessionBean();
		
		this.grupoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		GrupoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGrupoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"nuevo","nuevo","Nuevo"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"duplicar","duplicar","Duplicar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"copiar","copiar","Copiar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"ver_form","ver_form","Ver"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"recargar","recargar","Recargar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGrupoCliente,this.jTtoolBarGrupoCliente,
							"cerrar","cerrar","Salir"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGrupoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGrupoCliente;
			
				this.jButtonProcesarInformacionToolBarGrupoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGrupoCliente;
				
		//protected JButton jButtonModificarToolBarGrupoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGrupoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGrupoCliente=new JMenuMe("General");
		this.jmenuArchivoGrupoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesGrupoCliente=new JMenuMe("Acciones");
		this.jmenuDatosGrupoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGrupoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGrupoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGrupoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGrupoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGrupoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGrupoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGrupoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGrupoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGrupoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGrupoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGrupoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGrupoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGrupoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGrupoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGrupoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGrupoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGrupoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGrupoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGrupoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGrupoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGrupoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGrupoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGrupoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGrupoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGrupoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGrupoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGrupoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGrupoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGrupoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGrupoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGrupoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGrupoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGrupoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGrupoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGrupoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGrupoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGrupoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGrupoCliente.add(this.jMenuItemCerrarGrupoCliente);
			
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemNuevoGrupoCliente);
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemNuevoGuardarCambiosGrupoCliente);
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemNuevoRelacionesGrupoCliente);
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemGuardarCambiosTablaGrupoCliente);		
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemDuplicarGrupoCliente);		
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemCopiarGrupoCliente);		
			this.jmenuAccionesGrupoCliente.add(this.jMenuItemVerFormGrupoCliente);		
			
			this.jmenuDatosGrupoCliente.add(this.jMenuItemRecargarInformacionGrupoCliente);				
			this.jmenuDatosGrupoCliente.add(this.jMenuItemAnterioresGrupoCliente);				
			this.jmenuDatosGrupoCliente.add(this.jMenuItemSiguientesGrupoCliente);				
			this.jmenuDatosGrupoCliente.add(this.jMenuItemAbrirOrderByGrupoCliente);				
			this.jmenuDatosGrupoCliente.add(this.jMenuItemMostrarOcultarGrupoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGrupoCliente.add(this.jMenuItemGuardarCambiosGrupoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGrupoCliente.add(this.jmenuArchivoGrupoCliente);		
			this.jmenuBarGrupoCliente.add(this.jmenuAccionesGrupoCliente);		
			this.jmenuBarGrupoCliente.add(this.jmenuDatosGrupoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGrupoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGrupoCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoGrupoCliente.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoGrupoCliente= new JButtonMe();
		this.jButtonBusquedaPorCodigoGrupoCliente.setText("Buscar");
		this.jButtonBusquedaPorCodigoGrupoCliente.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoGrupoCliente,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoGrupoCliente = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoGrupoCliente.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoGrupoCliente.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoGrupoCliente= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreGrupoCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreGrupoCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreGrupoCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreGrupoCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreGrupoCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreGrupoCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreGrupoCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreGrupoCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreGrupoCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasGrupoCliente.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasGrupoCliente= new JButtonMe();
		this.jButtonBusquedaPorSiglasGrupoCliente.setText("Buscar");
		this.jButtonBusquedaPorSiglasGrupoCliente.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasGrupoCliente,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasGrupoCliente = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasGrupoCliente.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasGrupoCliente.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasGrupoCliente= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGrupoCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasGrupoCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGrupoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGrupoCliente = new GrupoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Grupo Cliente DATOS");
			this.jInternalFrameDetalleFormGrupoCliente = new GrupoClienteDetalleFormJInternalFrame(jDesktopPane,this.grupoclienteSessionBean.getConGuardarRelaciones(),this.grupoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGrupoCliente = null;//new GrupoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoCliente= new GridBagLayout();
		
		
		this.jTableDatosGrupoCliente = new JTableMe();      
		
		String sToolTipGrupoCliente="";
		sToolTipGrupoCliente=GrupoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoCliente+="(Cartera.GrupoCliente)";
		}
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGrupoCliente.setToolTipText(sToolTipGrupoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGrupoCliente);
		this.jTableDatosGrupoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosGrupoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGrupoCliente.setRowSelectionAllowed(true);
		this.jTableDatosGrupoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGrupoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGrupoCliente = new JButtonMe();
		this.jButtonDuplicarGrupoCliente = new JButtonMe();
		this.jButtonCopiarGrupoCliente = new JButtonMe();
		this.jButtonVerFormGrupoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesGrupoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGrupoCliente = new JButtonMe();
		this.jButtonCerrarGrupoCliente = new JButtonMe();
		
		this.jScrollPanelDatosGrupoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralGrupoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Cliente";
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoCliente.setToolTipText("Acciones");
        this.jPanelAccionesGrupoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGrupoCliente=new ReporteDinamicoJInternalFrame(GrupoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGrupoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGrupoCliente=new ImportacionJInternalFrame(GrupoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGrupoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGrupoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByGrupoCliente.setText("Orden");
		this.jButtonAbrirOrderByGrupoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoCliente,false,this);
			
			//this.cargarOrderByGrupoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoCliente,true,this);
			
			//this.cargarOrderByGrupoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGrupoCliente.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosGrupoCliente.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosGrupoCliente.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosGrupoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGrupoCliente.setText("Nuevo");
		this.jButtonDuplicarGrupoCliente.setText("Duplicar");
		this.jButtonCopiarGrupoCliente.setText("Copiar");
		this.jButtonVerFormGrupoCliente.setText("Ver");
		this.jButtonNuevoRelacionesGrupoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGrupoCliente.setText("Guardar");
		this.jButtonCerrarGrupoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoCliente,"nuevo_button","Nuevo",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGrupoCliente,"duplicar_button","Duplicar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGrupoCliente,"copiar_button","Copiar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGrupoCliente,"ver_form","Ver",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGrupoCliente,"nuevorelaciones_button","Nuevo Rel",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoCliente,"guardarcambiostabla_button","Guardar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoCliente,"cerrar_button","Salir",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGrupoCliente.setToolTipText("Nuevo"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGrupoCliente.setToolTipText("Duplicar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGrupoCliente.setToolTipText("Copiar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGrupoCliente.setToolTipText("Ver"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGrupoCliente.setToolTipText("Nuevo Rel"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGrupoCliente.setToolTipText("Guardar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoCliente.setToolTipText("Salir"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoCliente";
		inputMap = this.jButtonNuevoGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarGrupoCliente";
		inputMap = this.jButtonDuplicarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGrupoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGrupoCliente"));
		
		//COPIAR
		sMapKey = "CopiarGrupoCliente";
		inputMap = this.jButtonCopiarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGrupoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGrupoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormGrupoCliente";
		inputMap = this.jButtonVerFormGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGrupoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGrupoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGrupoCliente";
		inputMap = this.jButtonNuevoRelacionesGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGrupoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGrupoCliente";
		inputMap = this.jButtonModificarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGrupoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGrupoCliente";
		inputMap = this.jButtonCerrarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoCliente";
		inputMap = this.jButtonGuardarCambiosTablaGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GrupoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GrupoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GrupoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GrupoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GrupoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGrupoCliente.setName("jPanelParametrosReportesGrupoCliente"); 
		
		this.jPanelParametrosReportesAccionesGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGrupoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGrupoCliente.setName("jPanelParametrosReportesAccionesGrupoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGrupoCliente = new JButtonMe();
		this.jButtonRecargarInformacionGrupoCliente.setText("Recargar");
		this.jButtonRecargarInformacionGrupoCliente.setToolTipText("Recargar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGrupoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGrupoCliente = new JButtonMe();
		this.jButtonProcesarInformacionGrupoCliente.setText("Procesar");
		this.jButtonProcesarInformacionGrupoCliente.setToolTipText("Procesar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGrupoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionGrupoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGrupoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesGrupoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGrupoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGrupoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionGrupoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGrupoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesGrupoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoCliente.setText("Accion");
		this.jComboBoxTiposAccionesGrupoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGrupoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarGrupoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGrupoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGrupoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGrupoCliente = new JLabelMe();
		
		this.jLabelAccionesGrupoCliente.setText("Acciones");		
		this.jLabelAccionesGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGrupoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGrupoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGrupoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGrupoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGrupoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGrupoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGrupoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGrupoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGrupoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGrupoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGrupoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteGrupoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGrupoCliente = new JButtonMe();
		//this.jButtonAnterioresGrupoCliente.setText("<<");
        this.jButtonAnterioresGrupoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGrupoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGrupoCliente = new JButtonMe();
		//this.jButtonSiguientesGrupoCliente.setText(">>");
        this.jButtonSiguientesGrupoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGrupoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGrupoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGrupoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosGrupoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGrupoCliente,"nuevoguardarcambios_button","Nue",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGrupoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGrupoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGrupoCliente";
		inputMap = this.jButtonRecargarInformacionGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGrupoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGrupoCliente";
		inputMap = this.jButtonSiguientesGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGrupoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGrupoCliente";
		inputMap = this.jButtonAnterioresGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGrupoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGrupoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGrupoCliente.setMinimumSize(new Dimension(this.getWidth(),GrupoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoCliente.setMaximumSize(new Dimension(this.getWidth(),GrupoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoCliente.setPreferredSize(new Dimension(this.getWidth(),GrupoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGrupoCliente = new GridBagLayout();

			this.jPanelPaginacionGrupoCliente.setLayout(gridaBagLayoutPaginacionGrupoCliente);						
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 0;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGrupoCliente.add(this.jButtonAnterioresGrupoCliente, this.gridBagConstraintsGrupoCliente);
					
						
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoCliente.gridy = 0;
			
			this.jPanelPaginacionGrupoCliente.add(this.jButtonNuevoGuardarCambiosGrupoCliente, this.gridBagConstraintsGrupoCliente);
						
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoCliente.gridy = 0;
			this.jPanelPaginacionGrupoCliente.add(this.jButtonSiguientesGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 1;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoCliente.add(this.jButtonNuevoGrupoCliente, this.gridBagConstraintsGrupoCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
				this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoCliente.gridy = 1;
				this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGrupoCliente.add(this.jButtonNuevoRelacionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
			}
			
			
			if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
				this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoCliente.gridy = 1;
				this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGrupoCliente.add(this.jButtonGuardarCambiosTablaGrupoCliente, this.gridBagConstraintsGrupoCliente);
			}
			
			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 1;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoCliente.add(this.jButtonDuplicarGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 1;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoCliente.add(this.jButtonCopiarGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 1;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoCliente.add(this.jButtonVerFormGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 1;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGrupoCliente.add(this.jButtonCerrarGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
		
		
		this.jButtonRecargarInformacionGrupoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGrupoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGrupoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGrupoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGrupoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGrupoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGrupoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGrupoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGrupoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGrupoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGrupoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGrupoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGrupoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGrupoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GrupoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GrupoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GrupoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GrupoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGrupoCliente.setLayout(gridaBagParametrosReportesGrupoCliente);
			this.jPanelParametrosReportesAccionesGrupoCliente.setLayout(gridaBagParametrosReportesAccionesGrupoCliente);
			
			
			this.jPanelParametrosAuxiliar1GrupoCliente.setLayout(gridaBagParametrosAuxiliar1GrupoCliente);
			this.jPanelParametrosAuxiliar2GrupoCliente.setLayout(gridaBagParametrosAuxiliar2GrupoCliente);
			this.jPanelParametrosAuxiliar3GrupoCliente.setLayout(gridaBagParametrosAuxiliar3GrupoCliente);
			this.jPanelParametrosAuxiliar4GrupoCliente.setLayout(gridaBagParametrosAuxiliar4GrupoCliente);
			//this.jPanelParametrosAuxiliar5GrupoCliente.setLayout(gridaBagParametrosAuxiliar2GrupoCliente);			
			
			
			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoCliente.add(this.jButtonRecargarInformacionGrupoCliente, this.gridBagConstraintsGrupoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoCliente.add(this.jComboBoxTiposPaginacionGrupoCliente, this.gridBagConstraintsGrupoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoCliente.add(this.jCheckBoxConAltoMaximoTablaGrupoCliente, this.gridBagConstraintsGrupoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoCliente.add(this.jComboBoxTiposArchivosReportesGrupoCliente, this.gridBagConstraintsGrupoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoCliente.add(this.jPanelParametrosAuxiliar1GrupoCliente, this.gridBagConstraintsGrupoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GrupoCliente.add(this.jComboBoxTiposReportesGrupoCliente, this.gridBagConstraintsGrupoCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoCliente.add(this.jPanelParametrosAuxiliar4GrupoCliente, this.gridBagConstraintsGrupoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoCliente.add(this.jComboBoxTiposReportesGrupoCliente, this.gridBagConstraintsGrupoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoCliente.add(this.jCheckBoxGenerarReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoCliente.add(this.jPanelParametrosAuxiliar2GrupoCliente, this.gridBagConstraintsGrupoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoCliente.add(this.jLabelAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
				this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGrupoCliente.add(this.jButtonAbrirOrderByGrupoCliente, this.gridBagConstraintsGrupoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoCliente.add(this.jComboBoxTiposSeleccionarGrupoCliente, this.gridBagConstraintsGrupoCliente);			
			
			
			/*
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoCliente.add(this.jCheckBoxSeleccionarTodosGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoCliente.add(this.jCheckBoxSeleccionarTodosGrupoCliente, this.gridBagConstraintsGrupoCliente);															
				
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoCliente.add(this.jCheckBoxSeleccionadosGrupoCliente, this.gridBagConstraintsGrupoCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoCliente.add(this.jPanelParametrosAuxiliar3GrupoCliente, this.gridBagConstraintsGrupoCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoCliente.add(this.jComboBoxTiposRelacionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
				
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoCliente.add(this.jComboBoxTiposAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
	
				
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoCliente.add(this.jTextFieldValorCampoGeneralGrupoCliente, this.gridBagConstraintsGrupoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGrupoCliente = new GridBagLayout();

			this.jScrollPanelDatosGrupoCliente.setLayout(gridaBagLayoutDatosGrupoCliente);
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = 0;
			this.gridBagConstraintsGrupoCliente.gridx = 0;
			
			this.jScrollPanelDatosGrupoCliente.add(this.jTableDatosGrupoCliente, this.gridBagConstraintsGrupoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGrupoCliente.setViewportView(this.jTableDatosGrupoCliente);
		this.jTableDatosGrupoCliente.setFillsViewportHeight(true);
		this.jTableDatosGrupoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGrupoCliente= new GridBagLayout();
		this.jPanelAccionesGrupoCliente.setLayout(gridaBagLayoutAccionesGrupoCliente);
		
		
		/*	
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 0;
			
		this.jPanelAccionesGrupoCliente.add(this.jButtonNuevoGrupoCliente, this.gridBagConstraintsGrupoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoGrupoCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoGrupoCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoGrupoCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoGrupoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoGrupoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoGrupoCliente.setLayout(gridaBagLayoutBusquedaPorCodigoGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 0;
		gridBagConstraintsGrupoCliente.gridx = 0;
		jPanelBusquedaPorCodigoGrupoCliente.add(jLabelcodigoBusquedaPorCodigoGrupoCliente, gridBagConstraintsGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 0;
		gridBagConstraintsGrupoCliente.gridx = 1;
		jPanelBusquedaPorCodigoGrupoCliente.add(jTextFieldcodigoBusquedaPorCodigoGrupoCliente, gridBagConstraintsGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 1;
		gridBagConstraintsGrupoCliente.gridx =1;
		jPanelBusquedaPorCodigoGrupoCliente.add(jButtonBusquedaPorCodigoGrupoCliente, gridBagConstraintsGrupoCliente);

		jTabbedPaneBusquedasGrupoCliente.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoGrupoCliente);
		jTabbedPaneBusquedasGrupoCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreGrupoCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreGrupoCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreGrupoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreGrupoCliente.setLayout(gridaBagLayoutBusquedaPorNombreGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 0;
		gridBagConstraintsGrupoCliente.gridx = 0;
		jPanelBusquedaPorNombreGrupoCliente.add(jLabelnombreBusquedaPorNombreGrupoCliente, gridBagConstraintsGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 0;
		gridBagConstraintsGrupoCliente.gridx = 1;
		jPanelBusquedaPorNombreGrupoCliente.add(jTextAreanombreBusquedaPorNombreGrupoCliente, gridBagConstraintsGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 1;
		gridBagConstraintsGrupoCliente.gridx =1;
		jPanelBusquedaPorNombreGrupoCliente.add(jButtonBusquedaPorNombreGrupoCliente, gridBagConstraintsGrupoCliente);

		jTabbedPaneBusquedasGrupoCliente.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreGrupoCliente);
		jTabbedPaneBusquedasGrupoCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasGrupoCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasGrupoCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasGrupoCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasGrupoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasGrupoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasGrupoCliente.setLayout(gridaBagLayoutBusquedaPorSiglasGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 0;
		gridBagConstraintsGrupoCliente.gridx = 0;
		jPanelBusquedaPorSiglasGrupoCliente.add(jLabelsiglasBusquedaPorSiglasGrupoCliente, gridBagConstraintsGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 0;
		gridBagConstraintsGrupoCliente.gridx = 1;
		jPanelBusquedaPorSiglasGrupoCliente.add(jTextFieldsiglasBusquedaPorSiglasGrupoCliente, gridBagConstraintsGrupoCliente);

		gridBagConstraintsGrupoCliente = new GridBagConstraints();
		gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoCliente.gridy = 1;
		gridBagConstraintsGrupoCliente.gridx =1;
		jPanelBusquedaPorSiglasGrupoCliente.add(jButtonBusquedaPorSiglasGrupoCliente, gridBagConstraintsGrupoCliente);

		jTabbedPaneBusquedasGrupoCliente.addTab("3.-Por Siglas ", jPanelBusquedaPorSiglasGrupoCliente);
		jTabbedPaneBusquedasGrupoCliente.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();						
			this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoCliente.gridx = 0;		
			//this.gridBagConstraintsGrupoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGrupoCliente, this.gridBagConstraintsGrupoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGrupoCliente.gridx = 0;		
		//this.gridBagConstraintsGrupoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGrupoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGrupoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoCliente.gridx = 0;		
			this.gridBagConstraintsGrupoCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGrupoCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGrupoCliente, this.gridBagConstraintsGrupoCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGrupoCliente, this.gridBagConstraintsGrupoCliente);								
		
		
		/*
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
		*/		
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoCliente.gridx =0;
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoCliente, this.gridBagConstraintsGrupoCliente);
				
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGrupoCliente, this.gridBagConstraintsGrupoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGrupoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosGrupoCliente.setLayout(gridaBagLayoutBusquedasParametrosGrupoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGrupoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
			
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
			
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGrupoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGrupoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGrupoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGrupoCliente.setName("jPanelReporteDinamicoGrupoCliente"); 
		
		this.jPanelReporteDinamicoGrupoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGrupoCliente.setLayout(gridaBagLayoutReporteDinamicoGrupoCliente);
		
		
		this.jInternalFrameReporteDinamicoGrupoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGrupoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGrupoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGrupoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGrupoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGrupoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGrupoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGrupoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoGrupoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoGrupoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGrupoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGrupoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteGrupoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoCliente.add(this.jLabelColumnasSelectReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGrupoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteGrupoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGrupoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGrupoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGrupoCliente=new JScrollPane(this.jListColumnasSelectReporteGrupoCliente);
			
			this.jScrollColumnasSelectReporteGrupoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoCliente.add(this.jListColumnasSelectReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
		this.jPanelReporteDinamicoGrupoCliente.add(this.jScrollColumnasSelectReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGrupoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteGrupoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoCliente.add(this.jLabelRelacionesSelectReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGrupoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteGrupoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGrupoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGrupoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGrupoCliente=new JScrollPane(this.jListRelacionesSelectReporteGrupoCliente);
			
			this.jScrollRelacionesSelectReporteGrupoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoCliente.add(this.jListRelacionesSelectReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
		this.jPanelReporteDinamicoGrupoCliente.add(this.jScrollRelacionesSelectReporteGrupoCliente, this.gridBagConstraintsGrupoCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGrupoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGrupoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoGrupoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGrupoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGrupoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGrupoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGrupoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGrupoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoCliente.add(this.jLabelGenerarExcelReporteDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGrupoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGrupoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGrupoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGrupoCliente.setToolTipText("Generar EXCEL"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGrupoCliente.add(this.jButtonGenerarExcelReporteDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoCliente.add(this.jComboBoxTiposReportesDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGrupoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGrupoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoCliente.add(this.jLabelTiposArchivoReporteDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGrupoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGrupoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGrupoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGrupoCliente.setToolTipText("Generar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoCliente.add(this.jButtonGenerarReporteDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGrupoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGrupoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGrupoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGrupoCliente.setToolTipText("Cancelar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoCliente.add(this.jButtonCerrarReporteDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGrupoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGrupoCliente= new JScrollPane(jPanelReporteDinamicoGrupoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGrupoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGrupoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGrupoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGrupoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGrupoCliente);
		this.jInternalFrameReporteDinamicoGrupoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoGrupoCliente, this.gridBagConstraintsGrupoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGrupoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGrupoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGrupoCliente.setName("jPanelImportacionGrupoCliente"); 
		
		this.jPanelImportacionGrupoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGrupoCliente.setLayout(gridaBagLayoutImportacionGrupoCliente);
		
		
		this.jInternalFrameImportacionGrupoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGrupoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGrupoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGrupoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGrupoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoCliente.setResizable(true);
	    this.jInternalFrameImportacionGrupoCliente.setClosable(true);
	    this.jInternalFrameImportacionGrupoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGrupoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGrupoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoCliente.setResizable(true);
	    this.jInternalFrameImportacionGrupoCliente.setClosable(true);
	    this.jInternalFrameImportacionGrupoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGrupoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGrupoCliente = new JLabelMe();

		this.jLabelArchivoImportacionGrupoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoCliente.add(this.jLabelArchivoImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGrupoCliente = new JFileChooser();		
		this.jFileChooserImportacionGrupoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGrupoCliente = new JButtonMe();
		this.jButtonAbrirImportacionGrupoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGrupoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGrupoCliente.setToolTipText("Generar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoCliente.add(this.jButtonAbrirImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGrupoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionGrupoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoCliente.add(this.jLabelPathArchivoImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGrupoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGrupoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoCliente.add(this.jTextFieldPathArchivoImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGrupoCliente = new JButtonMe();
		this.jButtonGenerarImportacionGrupoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGrupoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGrupoCliente.setToolTipText("Generar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoCliente.add(this.jButtonGenerarImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGrupoCliente = new JButtonMe();
		this.jButtonCerrarImportacionGrupoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGrupoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGrupoCliente.setToolTipText("Cancelar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoCliente.add(this.jButtonCerrarImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGrupoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionGrupoCliente= new JScrollPane(jPanelImportacionGrupoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsGrupoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGrupoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGrupoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGrupoCliente);
		this.jInternalFrameImportacionGrupoCliente.getContentPane().add(this.jScrollPanelImportacionGrupoCliente, this.gridBagConstraintsGrupoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGrupoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGrupoCliente = new JButtonMe();
			this.jButtonAbrirOrderByGrupoCliente.setText("Orden");
			this.jButtonAbrirOrderByGrupoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGrupoCliente";
			inputMap = this.jButtonAbrirOrderByGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGrupoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByGrupoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGrupoCliente.setName("jPanelOrderByGrupoCliente"); 
			
			this.jPanelOrderByGrupoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGrupoCliente.setLayout(gridaBagLayoutOrderByGrupoCliente);
			
			
			this.jTableDatosGrupoClienteOrderBy = new JTableMe();        
			this.jTableDatosGrupoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGrupoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGrupoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGrupoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGrupoClienteOrderBy.setViewportView(this.jTableDatosGrupoClienteOrderBy);
			this.jTableDatosGrupoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGrupoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGrupoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGrupoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGrupoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGrupoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGrupoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGrupoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGrupoCliente.setTitle("Orden");
			this.jInternalFrameOrderByGrupoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGrupoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGrupoCliente.setResizable(true);
			this.jInternalFrameOrderByGrupoCliente.setClosable(true);
			this.jInternalFrameOrderByGrupoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGrupoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGrupoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGrupoCliente.ipady =150;
				
			this.jPanelOrderByGrupoCliente.add(jScrollPanelDatosGrupoClienteOrderBy, this.gridBagConstraintsGrupoCliente);//this.jTableDatosGrupoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGrupoCliente = new JButtonMe();
			this.jButtonCerrarOrderByGrupoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGrupoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGrupoCliente.setToolTipText("Cancelar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGrupoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGrupoCliente.add(this.jButtonCerrarOrderByGrupoCliente, this.gridBagConstraintsGrupoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGrupoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByGrupoCliente= new JScrollPane(jPanelOrderByGrupoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsGrupoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGrupoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGrupoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGrupoCliente);
			
			this.jInternalFrameOrderByGrupoCliente.getContentPane().add(this.jScrollPanelOrderByGrupoCliente, this.gridBagConstraintsGrupoCliente);			
		
		} else {
			this.jButtonAbrirOrderByGrupoCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.grupoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGrupoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGrupoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGrupoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGrupoCliente.getRowHeight();//GrupoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GrupoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoCliente.isSelected()) {
					iHeightTable=GrupoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GrupoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoCliente.isSelected()) {
					iHeightTable=GrupoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGrupoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGrupoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGrupoCliente!=null && this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGrupoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGrupoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGrupoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGrupoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGrupoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=grupoclienteLogic.getGrupoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GrupoCliente> TraerGrupoClienteBeans(List<GrupoCliente> grupoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(GrupoCliente grupocliente:grupoclientes) {
					
				if(!(GrupoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GrupoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					grupocliente.setsDetalleGeneralEntityReporte(GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupocliente));
										
					grupocliente.setes_prove_descripcion(GrupoClienteConstantesFunciones.getes_proveDescripcion(grupocliente));	
					
					

					if(grupocliente.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{grupocliente.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(grupocliente.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(grupocliente.getGrupoClienteFormaPagos()!=null && Funciones.existeClass(classes,GrupoClienteFormaPago.class)) {
						try{grupocliente.setgrupoclienteformapagosDescripcionReporte(new JRBeanCollectionDataSource(GrupoClienteFormaPagoJInternalFrame.TraerGrupoClienteFormaPagoBeans(grupocliente.getGrupoClienteFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//grupocliente.setsDetalleGeneralEntityReporte(grupocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//grupoclientebeans.add(grupoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return grupoclientes;
    }
	//PARA REPORTES FIN
}
