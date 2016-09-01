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
import com.bydan.erp.inventario.util.RecargoCompraConstantesFunciones;

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
public class RecargoCompraJInternalFrame extends RecargoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRecargoCompra;
	
	protected JMenuBar jmenuBarRecargoCompra;
	
	protected JMenu jmenuRecargoCompra;
	protected JMenu jmenuDatosRecargoCompra;
	protected JMenu jmenuArchivoRecargoCompra;
	protected JMenu jmenuAccionesRecargoCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRecargoCompra;	
	protected GridBagConstraints gridBagConstraintsRecargoCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RecargoCompraDetalleFormJInternalFrame jInternalFrameDetalleFormRecargoCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRecargoCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRecargoCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public RecargoCompraSessionBean recargocompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RecargoCompra> recargocompras;		
	public List<RecargoCompra> recargocomprasEliminados;	
	public List<RecargoCompra> recargocomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRecargoCompra;		
	protected JButton jButtonAbrirOrderByRecargoCompra;
	
	
	//protected JPanel jPanelOrderByRecargoCompra;
	//public JScrollPane jScrollPanelOrderByRecargoCompra;	
	//protected JButton jButtonCerrarOrderByRecargoCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RecargoCompraLogic recargocompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRecargoCompra;
	public JScrollPane jScrollPanelDatosEdicionRecargoCompra;
	public JScrollPane jScrollPanelDatosGeneralRecargoCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosRecargoCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRecargoCompra;
	//public JScrollPane jScrollPanelImportacionRecargoCompra;
	
	
	
	protected JPanel jPanelAccionesRecargoCompra;
	
    protected JPanel jPanelPaginacionRecargoCompra;
    protected JPanel jPanelParametrosReportesRecargoCompra;
	protected JPanel jPanelParametrosReportesAccionesRecargoCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RecargoCompra;
	protected JPanel jPanelParametrosAuxiliar2RecargoCompra;
	protected JPanel jPanelParametrosAuxiliar3RecargoCompra;
	protected JPanel jPanelParametrosAuxiliar4RecargoCompra;
	//protected JPanel jPanelParametrosAuxiliar5RecargoCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoRecargoCompra;
	//protected JPanel jPanelImportacionRecargoCompra;
	
	
	public JTable jTableDatosRecargoCompra;
	
	
	
	//public JTable jTableDatosRecargoCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRecargoCompra;
	protected JButton jButtonDuplicarRecargoCompra;
	protected JButton jButtonCopiarRecargoCompra;
	protected JButton jButtonVerFormRecargoCompra;
	protected JButton jButtonNuevoRelacionesRecargoCompra;
	protected JButton jButtonModificarRecargoCompra;
	
    protected JButton jButtonGuardarCambiosTablaRecargoCompra;
	protected JButton jButtonCerrarRecargoCompra;
	
	
	protected JButton jButtonRecargarInformacionRecargoCompra;
	protected JButton jButtonProcesarInformacionRecargoCompra;
	
	
	protected JButton jButtonAnterioresRecargoCompra;
	protected JButton jButtonSiguientesRecargoCompra;
	protected JButton jButtonNuevoGuardarCambiosRecargoCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRecargoCompra;
	//protected JButton jButtonCerrarReporteDinamicoRecargoCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoRecargoCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionRecargoCompra;
	//protected JButton jButtonGenerarImportacionRecargoCompra;
	//protected JButton jButtonCerrarImportacionRecargoCompra;
	//protected JFileChooser jFileChooserImportacionRecargoCompra;
	//protected File fileImportacionRecargoCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRecargoCompra;
	protected JButton jButtonDuplicarToolBarRecargoCompra;
	protected JButton jButtonNuevoRelacionesToolBarRecargoCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarRecargoCompra;
	protected JButton jButtonCopiarToolBarRecargoCompra;
	protected JButton jButtonVerFormToolBarRecargoCompra;
	public JButton jButtonGuardarCambiosTablaToolBarRecargoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarRecargoCompra;
	protected JButton jButtonCerrarToolBarRecargoCompra;
	
	protected JButton jButtonRecargarInformacionToolBarRecargoCompra;
	protected JButton jButtonProcesarInformacionToolBarRecargoCompra;
	protected JButton jButtonAnterioresToolBarRecargoCompra;
	protected JButton jButtonSiguientesToolBarRecargoCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarRecargoCompra;
	protected JButton jButtonAbrirOrderByToolBarRecargoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRecargoCompra;
	protected JMenuItem jMenuItemDuplicarRecargoCompra;
	protected JMenuItem jMenuItemNuevoRelacionesRecargoCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRecargoCompra;
	protected JMenuItem jMenuItemCopiarRecargoCompra;
	protected JMenuItem jMenuItemVerFormRecargoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaRecargoCompra;
	protected JMenuItem jMenuItemCerrarRecargoCompra;
	protected JMenuItem jMenuItemDetalleCerrarRecargoCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRecargoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarRecargoCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionRecargoCompra;
	protected JMenuItem jMenuItemProcesarInformacionRecargoCompra;
	protected JMenuItem jMenuItemAnterioresRecargoCompra;
	protected JMenuItem jMenuItemSiguientesRecargoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRecargoCompra;
	protected JMenuItem jMenuItemAbrirOrderByRecargoCompra;
	protected JMenuItem jMenuItemMostrarOcultarRecargoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRecargoCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRecargoCompra;
	protected JCheckBox jCheckBoxSeleccionadosRecargoCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRecargoCompra;
	protected JCheckBox jCheckBoxConGraficoReporteRecargoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRecargoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRecargoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRecargoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRecargoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRecargoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRecargoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRecargoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRecargoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRecargoCompra;
	protected JTextField jTextFieldValorCampoGeneralRecargoCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRecargoCompra;
	//public JList<Reporte> jListColumnasSelectReporteRecargoCompra;
	//public JScrollPane jScrollColumnasSelectReporteRecargoCompra;
	
	//public JLabel jLabelRelacionesSelectReporteRecargoCompra;
	//public JList<Reporte> jListRelacionesSelectReporteRecargoCompra;
	//public JScrollPane jScrollRelacionesSelectReporteRecargoCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRecargoCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRecargoCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRecargoCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoRecargoCompra;
	
		
	//public JLabel jLabelArchivoImportacionRecargoCompra;	
	//public JLabel jLabelPathArchivoImportacionRecargoCompra;
	//protected JTextField jTextFieldPathArchivoImportacionRecargoCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRecargoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRecargoCompra;
	
	//public JLabel jLabelColumnaCategoriaValorRecargoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRecargoCompra;
	
	//public JLabel jLabelColumnasValoresGraficoRecargoCompra;
	//public JList<Reporte> jListColumnasValoresGraficoRecargoCompra;
	//public JScrollPane jScrollColumnasValoresGraficoRecargoCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRecargoCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRecargoCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRecargoCompra;
	public JPanel jPanelBusquedaPorNombreRecargoCompra;
	public JButton jButtonBusquedaPorNombreRecargoCompra;
	public JPanel jPanelFK_IdCuentaContableCreditoRecargoCompra;
	public JButton jButtonFK_IdCuentaContableCreditoRecargoCompra;
	public JPanel jPanelFK_IdCuentaContableDebitoRecargoCompra;
	public JButton jButtonFK_IdCuentaContableDebitoRecargoCompra;
	
	public JPanel jPanelnombreBusquedaPorNombreRecargoCompra;
	public JLabel jLabelnombreBusquedaPorNombreRecargoCompra;
	public JTextField jTextFieldnombreBusquedaPorNombreRecargoCompra;
	public JButton jButtonnombreBusquedaPorNombreRecargoCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra;
	
	public JPanel jPanelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra;
	public JLabel jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra;
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra;
	
	
	
	
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
	public RecargoCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRecargoCompra)	{
		this.jButtonRecargarInformacionRecargoCompra = jButtonRecargarInformacionRecargoCompra;
	}
	
	public JButton getjButtonProcesarInformacionRecargoCompra() {
		return this.jButtonProcesarInformacionRecargoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRecargoCompra)	{
		this.jButtonProcesarInformacionRecargoCompra = jButtonProcesarInformacionRecargoCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionRecargoCompra() {
		return this.jButtonRecargarInformacionRecargoCompra;
	}
	
	
	public List<RecargoCompra> getrecargocompras() {
		return this.recargocompras;
	}

	public void setrecargocompras(List<RecargoCompra> recargocompras) {
		this.recargocompras = recargocompras;
	}
	
	public List<RecargoCompra> getrecargocomprasAux() {
		return this.recargocomprasAux;
	}

	public void setrecargocomprasAux(List<RecargoCompra> recargocomprasAux) {
		this.recargocomprasAux = recargocomprasAux;
	}
	
	public List<RecargoCompra> getrecargocomprasEliminados() {
		return this.recargocomprasEliminados;
	}

	public void setRecargoComprasEliminados(List<RecargoCompra> recargocomprasEliminados) {
		this.recargocomprasEliminados = recargocomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRecargoCompra() {
		return jComboBoxTiposSeleccionarRecargoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRecargoCompra(
			JComboBox jComboBoxTiposSeleccionarRecargoCompra) {
		this.jComboBoxTiposSeleccionarRecargoCompra = jComboBoxTiposSeleccionarRecargoCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRecargoCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRecargoCompra() {
		return jTextFieldValorCampoGeneralRecargoCompra;
	}

	public void setjTextFieldValorCampoGeneralRecargoCompra(
			JTextField jTextFieldValorCampoGeneralRecargoCompra) {
		this.jTextFieldValorCampoGeneralRecargoCompra = jTextFieldValorCampoGeneralRecargoCompra;
	}

	public void setBorderResaltarValorCampoGeneralRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRecargoCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRecargoCompra() {
		return this.jCheckBoxSeleccionarTodosRecargoCompra;
	}

	public void setjCheckBoxSeleccionarTodosRecargoCompra(
			JCheckBox jCheckBoxSeleccionarTodosRecargoCompra) {
		this.jCheckBoxSeleccionarTodosRecargoCompra = jCheckBoxSeleccionarTodosRecargoCompra;
	}

	public void setBorderResaltarSeleccionarTodosRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRecargoCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRecargoCompra() {
		return this.jCheckBoxSeleccionadosRecargoCompra;
	}

	public void setjCheckBoxSeleccionadosRecargoCompra(
			JCheckBox jCheckBoxSeleccionadosRecargoCompra) {
		this.jCheckBoxSeleccionadosRecargoCompra = jCheckBoxSeleccionadosRecargoCompra;
	}
	
	public void setBorderResaltarSeleccionadosRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRecargoCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRecargoCompra() {
		return this.jComboBoxTiposArchivosReportesRecargoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRecargoCompra(
			JComboBox jComboBoxTiposArchivosReportesRecargoCompra) {
		this.jComboBoxTiposArchivosReportesRecargoCompra = jComboBoxTiposArchivosReportesRecargoCompra;
	}

	public void setBorderResaltarTiposArchivosReportesRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRecargoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRecargoCompra() {
		return this.jComboBoxTiposReportesRecargoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRecargoCompra(
			JComboBox jComboBoxTiposReportesRecargoCompra) {
		this.jComboBoxTiposReportesRecargoCompra = jComboBoxTiposReportesRecargoCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRecargoCompra() {
	//	return jComboBoxTiposReportesDinamicoRecargoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRecargoCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoRecargoCompra) {
	//	this.jComboBoxTiposReportesDinamicoRecargoCompra = jComboBoxTiposReportesDinamicoRecargoCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRecargoCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoRecargoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRecargoCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRecargoCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra = jComboBoxTiposArchivosReportesDinamicoRecargoCompra;
	//}
	
	public void setBorderResaltarTiposReportesRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRecargoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRecargoCompra() {
		return this.jComboBoxTiposGraficosReportesRecargoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRecargoCompra(
			JComboBox jComboBoxTiposGraficosReportesRecargoCompra) {
		this.jComboBoxTiposGraficosReportesRecargoCompra = jComboBoxTiposGraficosReportesRecargoCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRecargoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRecargoCompra() {
		return this.jComboBoxTiposPaginacionRecargoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRecargoCompra(
			JComboBox jComboBoxTiposPaginacionRecargoCompra) {
		this.jComboBoxTiposPaginacionRecargoCompra = jComboBoxTiposPaginacionRecargoCompra;
	}
	
	public void setBorderResaltarTiposPaginacionRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRecargoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRecargoCompra() {
		return this.jComboBoxTiposRelacionesRecargoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRecargoCompra() {
		return this.jComboBoxTiposAccionesRecargoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRecargoCompra(
			JComboBox jComboBoxTiposRelacionesRecargoCompra) {
		this.jComboBoxTiposRelacionesRecargoCompra = jComboBoxTiposRelacionesRecargoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRecargoCompra(
			JComboBox jComboBoxTiposAccionesRecargoCompra) {
		this.jComboBoxTiposAccionesRecargoCompra = jComboBoxTiposAccionesRecargoCompra;
	}
	
	public void setBorderResaltarTiposRelacionesRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRecargoCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRecargoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRecargoCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRecargoCompra() {
	//	return jCheckBoxConGraficoDinamicoRecargoCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoRecargoCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoRecargoCompra) {
	//	this.jCheckBoxConGraficoDinamicoRecargoCompra = jCheckBoxConGraficoDinamicoRecargoCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRecargoCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRecargoCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRecargoCompra .setBorder(borderResaltar);		
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
		this.recargocompraSessionBean=new RecargoCompraSessionBean();
		
		this.recargocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recargocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.recargocompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RecargoCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RecargoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RecargoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RecargoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RecargoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Recargo Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
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
		
		RecargoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRecargoCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"nuevo","nuevo","Nuevo"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"duplicar","duplicar","Duplicar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"copiar","copiar","Copiar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"ver_form","ver_form","Ver"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"recargar","recargar","Recargar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRecargoCompra,this.jTtoolBarRecargoCompra,
							"cerrar","cerrar","Salir"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRecargoCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRecargoCompra;
			
				this.jButtonProcesarInformacionToolBarRecargoCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRecargoCompra;
				
		//protected JButton jButtonModificarToolBarRecargoCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRecargoCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRecargoCompra=new JMenuMe("General");
		this.jmenuArchivoRecargoCompra=new JMenuMe("Archivo");
		this.jmenuAccionesRecargoCompra=new JMenuMe("Acciones");
		this.jmenuDatosRecargoCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRecargoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRecargoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRecargoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRecargoCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRecargoCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRecargoCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRecargoCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRecargoCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRecargoCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRecargoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRecargoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRecargoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRecargoCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRecargoCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRecargoCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRecargoCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRecargoCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRecargoCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRecargoCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRecargoCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRecargoCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRecargoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRecargoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRecargoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRecargoCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRecargoCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRecargoCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRecargoCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRecargoCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRecargoCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRecargoCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRecargoCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRecargoCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRecargoCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRecargoCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRecargoCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRecargoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRecargoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRecargoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRecargoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRecargoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRecargoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRecargoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRecargoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRecargoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRecargoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRecargoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRecargoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRecargoCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRecargoCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRecargoCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRecargoCompra.add(this.jMenuItemCerrarRecargoCompra);
			
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemNuevoRecargoCompra);
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemNuevoGuardarCambiosRecargoCompra);
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemNuevoRelacionesRecargoCompra);
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemGuardarCambiosTablaRecargoCompra);		
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemDuplicarRecargoCompra);		
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemCopiarRecargoCompra);		
			this.jmenuAccionesRecargoCompra.add(this.jMenuItemVerFormRecargoCompra);		
			
			this.jmenuDatosRecargoCompra.add(this.jMenuItemRecargarInformacionRecargoCompra);				
			this.jmenuDatosRecargoCompra.add(this.jMenuItemAnterioresRecargoCompra);				
			this.jmenuDatosRecargoCompra.add(this.jMenuItemSiguientesRecargoCompra);				
			this.jmenuDatosRecargoCompra.add(this.jMenuItemAbrirOrderByRecargoCompra);				
			this.jmenuDatosRecargoCompra.add(this.jMenuItemMostrarOcultarRecargoCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRecargoCompra.add(this.jMenuItemGuardarCambiosRecargoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRecargoCompra.add(this.jmenuArchivoRecargoCompra);		
			this.jmenuBarRecargoCompra.add(this.jmenuAccionesRecargoCompra);		
			this.jmenuBarRecargoCompra.add(this.jmenuDatosRecargoCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRecargoCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRecargoCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreRecargoCompra.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreRecargoCompra= new JButtonMe();
		this.jButtonBusquedaPorNombreRecargoCompra.setText("Buscar");
		this.jButtonBusquedaPorNombreRecargoCompra.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreRecargoCompra,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreRecargoCompra = new JLabelMe();
		jLabelnombreBusquedaPorNombreRecargoCompra.setText("Nombre :");
		jLabelnombreBusquedaPorNombreRecargoCompra.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreRecargoCompra= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCreditoRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoRecargoCompra.setToolTipText("Buscar Por Cuenta C. Credito ");
		this.jButtonFK_IdCuentaContableCreditoRecargoCompra= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoRecargoCompra.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoRecargoCompra.setToolTipText("Buscar Por Cuenta C. Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoRecargoCompra,"buscar_button","Buscar Por Cuenta C. Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setText("Cuenta C. Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setToolTipText("Cuenta C. Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.setFocusable(false);

		this.jPanelFK_IdCuentaContableDebitoRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDebitoRecargoCompra.setToolTipText("Buscar Por Cuenta C. Debito ");
		this.jButtonFK_IdCuentaContableDebitoRecargoCompra= new JButtonMe();
		this.jButtonFK_IdCuentaContableDebitoRecargoCompra.setText("Buscar");
		this.jButtonFK_IdCuentaContableDebitoRecargoCompra.setToolTipText("Buscar Por Cuenta C. Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDebitoRecargoCompra,"buscar_button","Buscar Por Cuenta C. Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDebitoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra = new JLabelMe();
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setText("Cuenta C. Debito :");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setToolTipText("Cuenta C. Debito");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.setFocusable(false);


		this.jTabbedPaneBusquedasRecargoCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasRecargoCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRecargoCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRecargoCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRecargoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRecargoCompra = new RecargoCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Recargo Compra DATOS");
			this.jInternalFrameDetalleFormRecargoCompra = new RecargoCompraDetalleFormJInternalFrame(jDesktopPane,this.recargocompraSessionBean.getConGuardarRelaciones(),this.recargocompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRecargoCompra = null;//new RecargoCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRecargoCompra= new GridBagLayout();
		
		
		this.jTableDatosRecargoCompra = new JTableMe();      
		
		String sToolTipRecargoCompra="";
		sToolTipRecargoCompra=RecargoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRecargoCompra+="(Inventario.RecargoCompra)";
		}
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipRecargoCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRecargoCompra.setToolTipText(sToolTipRecargoCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRecargoCompra);
		this.jTableDatosRecargoCompra.setAutoCreateRowSorter(true);
		this.jTableDatosRecargoCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRecargoCompra.setRowSelectionAllowed(true);
		this.jTableDatosRecargoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRecargoCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRecargoCompra = new JButtonMe();
		this.jButtonDuplicarRecargoCompra = new JButtonMe();
		this.jButtonCopiarRecargoCompra = new JButtonMe();
		this.jButtonVerFormRecargoCompra = new JButtonMe();
		this.jButtonNuevoRelacionesRecargoCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRecargoCompra = new JButtonMe();
		this.jButtonCerrarRecargoCompra = new JButtonMe();
		
		this.jScrollPanelDatosRecargoCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralRecargoCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Recargo Compra";
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recargo Compraes" + this.sPath));
		} else {
			this.jScrollPanelDatosRecargoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRecargoCompra.setToolTipText("Acciones");
        this.jPanelAccionesRecargoCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRecargoCompra=new ReporteDinamicoJInternalFrame(RecargoCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRecargoCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRecargoCompra=new ImportacionJInternalFrame(RecargoCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRecargoCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRecargoCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByRecargoCompra.setText("Orden");
		this.jButtonAbrirOrderByRecargoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRecargoCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRecargoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecargoCompra,false,this);
			
			//this.cargarOrderByRecargoCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRecargoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecargoCompra,true,this);
			
			//this.cargarOrderByRecargoCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRecargoCompra.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosRecargoCompra.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosRecargoCompra.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosRecargoCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRecargoCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRecargoCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRecargoCompra.setText("Nuevo");
		this.jButtonDuplicarRecargoCompra.setText("Duplicar");
		this.jButtonCopiarRecargoCompra.setText("Copiar");
		this.jButtonVerFormRecargoCompra.setText("Ver");
		this.jButtonNuevoRelacionesRecargoCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRecargoCompra.setText("Guardar");
		this.jButtonCerrarRecargoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRecargoCompra,"nuevo_button","Nuevo",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRecargoCompra,"duplicar_button","Duplicar",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRecargoCompra,"copiar_button","Copiar",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRecargoCompra,"ver_form","Ver",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRecargoCompra,"nuevorelaciones_button","Nuevo Rel",this.recargocompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRecargoCompra,"guardarcambiostabla_button","Guardar",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRecargoCompra,"cerrar_button","Salir",this.recargocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRecargoCompra.setToolTipText("Nuevo"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRecargoCompra.setToolTipText("Duplicar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRecargoCompra.setToolTipText("Copiar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRecargoCompra.setToolTipText("Ver"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRecargoCompra.setToolTipText("Nuevo Rel"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRecargoCompra.setToolTipText("Guardar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRecargoCompra.setToolTipText("Salir"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRecargoCompra";
		inputMap = this.jButtonNuevoRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRecargoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRecargoCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarRecargoCompra";
		inputMap = this.jButtonDuplicarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRecargoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRecargoCompra"));
		
		//COPIAR
		sMapKey = "CopiarRecargoCompra";
		inputMap = this.jButtonCopiarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRecargoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRecargoCompra"));
		
		//VEr FORM
		sMapKey = "VerFormRecargoCompra";
		inputMap = this.jButtonVerFormRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRecargoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRecargoCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRecargoCompra";
		inputMap = this.jButtonNuevoRelacionesRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRecargoCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRecargoCompra";
		inputMap = this.jButtonModificarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRecargoCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRecargoCompra";
		inputMap = this.jButtonCerrarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRecargoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRecargoCompra";
		inputMap = this.jButtonGuardarCambiosTablaRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRecargoCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RecargoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RecargoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RecargoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RecargoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RecargoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRecargoCompra.setName("jPanelParametrosReportesRecargoCompra"); 
		
		this.jPanelParametrosReportesAccionesRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRecargoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRecargoCompra.setName("jPanelParametrosReportesAccionesRecargoCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRecargoCompra = new JButtonMe();
		this.jButtonRecargarInformacionRecargoCompra.setText("Recargar");
		this.jButtonRecargarInformacionRecargoCompra.setToolTipText("Recargar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRecargoCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRecargoCompra = new JButtonMe();
		this.jButtonProcesarInformacionRecargoCompra.setText("Procesar");
		this.jButtonProcesarInformacionRecargoCompra.setToolTipText("Procesar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRecargoCompra.setVisible(false);
			
		this.jButtonProcesarInformacionRecargoCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRecargoCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRecargoCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRecargoCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRecargoCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRecargoCompra.setText("TIPO");       
		this.jComboBoxTiposReportesRecargoCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRecargoCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRecargoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRecargoCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionRecargoCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRecargoCompra.setText("Accion");
		this.jComboBoxTiposRelacionesRecargoCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRecargoCompra.setText("Accion");
		this.jComboBoxTiposAccionesRecargoCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRecargoCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarRecargoCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRecargoCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRecargoCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRecargoCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRecargoCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRecargoCompra = new JLabelMe();
		
		this.jLabelAccionesRecargoCompra.setText("Acciones");		
		this.jLabelAccionesRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRecargoCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRecargoCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRecargoCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRecargoCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRecargoCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRecargoCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRecargoCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRecargoCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRecargoCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRecargoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRecargoCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteRecargoCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRecargoCompra = new JButtonMe();
		//this.jButtonAnterioresRecargoCompra.setText("<<");
        this.jButtonAnterioresRecargoCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRecargoCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRecargoCompra = new JButtonMe();
		//this.jButtonSiguientesRecargoCompra.setText(">>");
        this.jButtonSiguientesRecargoCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRecargoCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRecargoCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRecargoCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosRecargoCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRecargoCompra,"nuevoguardarcambios_button","Nue",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRecargoCompra";
		inputMap = this.jButtonNuevoGuardarCambiosRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRecargoCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRecargoCompra";
		inputMap = this.jButtonRecargarInformacionRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRecargoCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRecargoCompra";
		inputMap = this.jButtonSiguientesRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRecargoCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRecargoCompra";
		inputMap = this.jButtonAnterioresRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRecargoCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRecargoCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRecargoCompra.setMinimumSize(new Dimension(this.getWidth(),RecargoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RecargoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRecargoCompra.setMaximumSize(new Dimension(this.getWidth(),RecargoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RecargoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRecargoCompra.setPreferredSize(new Dimension(this.getWidth(),RecargoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RecargoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRecargoCompra = new GridBagLayout();

			this.jPanelPaginacionRecargoCompra.setLayout(gridaBagLayoutPaginacionRecargoCompra);						
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 0;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRecargoCompra.add(this.jButtonAnterioresRecargoCompra, this.gridBagConstraintsRecargoCompra);
					
						
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRecargoCompra.gridy = 0;
			
			this.jPanelPaginacionRecargoCompra.add(this.jButtonNuevoGuardarCambiosRecargoCompra, this.gridBagConstraintsRecargoCompra);
						
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRecargoCompra.gridy = 0;
			this.jPanelPaginacionRecargoCompra.add(this.jButtonSiguientesRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 1;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecargoCompra.add(this.jButtonNuevoRecargoCompra, this.gridBagConstraintsRecargoCompra);
						
			
			
			if(!this.recargocompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
				this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRecargoCompra.gridy = 1;
				this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRecargoCompra.add(this.jButtonGuardarCambiosTablaRecargoCompra, this.gridBagConstraintsRecargoCompra);
			}
			
			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 1;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecargoCompra.add(this.jButtonDuplicarRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 1;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecargoCompra.add(this.jButtonCopiarRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 1;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRecargoCompra.add(this.jButtonVerFormRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 1;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRecargoCompra.add(this.jButtonCerrarRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
		
		
		this.jButtonRecargarInformacionRecargoCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRecargoCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRecargoCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRecargoCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRecargoCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRecargoCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRecargoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRecargoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRecargoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRecargoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRecargoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRecargoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRecargoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRecargoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRecargoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRecargoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRecargoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRecargoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRecargoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecargoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecargoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRecargoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRecargoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRecargoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRecargoCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRecargoCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRecargoCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRecargoCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRecargoCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRecargoCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRecargoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRecargoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRecargoCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRecargoCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRecargoCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRecargoCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRecargoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRecargoCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RecargoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RecargoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RecargoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RecargoCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRecargoCompra.setLayout(gridaBagParametrosReportesRecargoCompra);
			this.jPanelParametrosReportesAccionesRecargoCompra.setLayout(gridaBagParametrosReportesAccionesRecargoCompra);
			
			
			this.jPanelParametrosAuxiliar1RecargoCompra.setLayout(gridaBagParametrosAuxiliar1RecargoCompra);
			this.jPanelParametrosAuxiliar2RecargoCompra.setLayout(gridaBagParametrosAuxiliar2RecargoCompra);
			this.jPanelParametrosAuxiliar3RecargoCompra.setLayout(gridaBagParametrosAuxiliar3RecargoCompra);
			this.jPanelParametrosAuxiliar4RecargoCompra.setLayout(gridaBagParametrosAuxiliar4RecargoCompra);
			//this.jPanelParametrosAuxiliar5RecargoCompra.setLayout(gridaBagParametrosAuxiliar2RecargoCompra);			
			
			
			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecargoCompra.add(this.jButtonRecargarInformacionRecargoCompra, this.gridBagConstraintsRecargoCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RecargoCompra.add(this.jComboBoxTiposPaginacionRecargoCompra, this.gridBagConstraintsRecargoCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RecargoCompra.add(this.jCheckBoxConAltoMaximoTablaRecargoCompra, this.gridBagConstraintsRecargoCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RecargoCompra.add(this.jComboBoxTiposArchivosReportesRecargoCompra, this.gridBagConstraintsRecargoCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecargoCompra.add(this.jPanelParametrosAuxiliar1RecargoCompra, this.gridBagConstraintsRecargoCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecargoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RecargoCompra.add(this.jComboBoxTiposReportesRecargoCompra, this.gridBagConstraintsRecargoCompra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecargoCompra.add(this.jPanelParametrosAuxiliar4RecargoCompra, this.gridBagConstraintsRecargoCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecargoCompra.add(this.jComboBoxTiposReportesRecargoCompra, this.gridBagConstraintsRecargoCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecargoCompra.add(this.jCheckBoxGenerarReporteRecargoCompra, this.gridBagConstraintsRecargoCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecargoCompra.add(this.jPanelParametrosAuxiliar2RecargoCompra, this.gridBagConstraintsRecargoCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecargoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecargoCompra.add(this.jLabelAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
				this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRecargoCompra.add(this.jButtonAbrirOrderByRecargoCompra, this.gridBagConstraintsRecargoCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecargoCompra.add(this.jComboBoxTiposSeleccionarRecargoCompra, this.gridBagConstraintsRecargoCompra);			
			
			
			/*
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRecargoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRecargoCompra.add(this.jCheckBoxSeleccionarTodosRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecargoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RecargoCompra.add(this.jCheckBoxSeleccionarTodosRecargoCompra, this.gridBagConstraintsRecargoCompra);															
				
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRecargoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RecargoCompra.add(this.jCheckBoxSeleccionadosRecargoCompra, this.gridBagConstraintsRecargoCompra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRecargoCompra.add(this.jPanelParametrosAuxiliar3RecargoCompra, this.gridBagConstraintsRecargoCompra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecargoCompra.add(this.jComboBoxTiposAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);
	
				
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRecargoCompra.add(this.jTextFieldValorCampoGeneralRecargoCompra, this.gridBagConstraintsRecargoCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRecargoCompra = new GridBagLayout();

			this.jScrollPanelDatosRecargoCompra.setLayout(gridaBagLayoutDatosRecargoCompra);
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = 0;
			this.gridBagConstraintsRecargoCompra.gridx = 0;
			
			this.jScrollPanelDatosRecargoCompra.add(this.jTableDatosRecargoCompra, this.gridBagConstraintsRecargoCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRecargoCompra.setViewportView(this.jTableDatosRecargoCompra);
		this.jTableDatosRecargoCompra.setFillsViewportHeight(true);
		this.jTableDatosRecargoCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRecargoCompra= new GridBagLayout();
		this.jPanelAccionesRecargoCompra.setLayout(gridaBagLayoutAccionesRecargoCompra);
		
		
		/*	
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 0;
			
		this.jPanelAccionesRecargoCompra.add(this.jButtonNuevoRecargoCompra, this.gridBagConstraintsRecargoCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreRecargoCompra= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreRecargoCompra.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreRecargoCompra.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreRecargoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreRecargoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreRecargoCompra.setLayout(gridaBagLayoutBusquedaPorNombreRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 0;
		jPanelBusquedaPorNombreRecargoCompra.add(jLabelnombreBusquedaPorNombreRecargoCompra, gridBagConstraintsRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 1;
		jPanelBusquedaPorNombreRecargoCompra.add(jTextFieldnombreBusquedaPorNombreRecargoCompra, gridBagConstraintsRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 1;
		gridBagConstraintsRecargoCompra.gridx =1;
		jPanelBusquedaPorNombreRecargoCompra.add(jButtonBusquedaPorNombreRecargoCompra, gridBagConstraintsRecargoCompra);

		jTabbedPaneBusquedasRecargoCompra.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreRecargoCompra);
		jTabbedPaneBusquedasRecargoCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoRecargoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoRecargoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoRecargoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoRecargoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoRecargoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoRecargoCompra.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 0;
		jPanelFK_IdCuentaContableCreditoRecargoCompra.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra, gridBagConstraintsRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 1;
		jPanelFK_IdCuentaContableCreditoRecargoCompra.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra, gridBagConstraintsRecargoCompra);


		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 0;
		jPanelFK_IdCuentaContableCreditoRecargoCompra.add(this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra, gridBagConstraintsRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 1;
		gridBagConstraintsRecargoCompra.gridx =1;
		jPanelFK_IdCuentaContableCreditoRecargoCompra.add(jButtonFK_IdCuentaContableCreditoRecargoCompra, gridBagConstraintsRecargoCompra);

		jTabbedPaneBusquedasRecargoCompra.addTab("2.-Por Cuenta C. Credito ", jPanelFK_IdCuentaContableCreditoRecargoCompra);
		jTabbedPaneBusquedasRecargoCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDebitoRecargoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDebitoRecargoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoRecargoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoRecargoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDebitoRecargoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDebitoRecargoCompra.setLayout(gridaBagLayoutFK_IdCuentaContableDebitoRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 0;
		jPanelFK_IdCuentaContableDebitoRecargoCompra.add(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra, gridBagConstraintsRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 1;
		jPanelFK_IdCuentaContableDebitoRecargoCompra.add(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra, gridBagConstraintsRecargoCompra);


		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsRecargoCompra.gridy = 0;
		gridBagConstraintsRecargoCompra.gridx = 0;
		jPanelFK_IdCuentaContableDebitoRecargoCompra.add(this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra, gridBagConstraintsRecargoCompra);

		gridBagConstraintsRecargoCompra = new GridBagConstraints();
		gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRecargoCompra.gridy = 1;
		gridBagConstraintsRecargoCompra.gridx =1;
		jPanelFK_IdCuentaContableDebitoRecargoCompra.add(jButtonFK_IdCuentaContableDebitoRecargoCompra, gridBagConstraintsRecargoCompra);

		jTabbedPaneBusquedasRecargoCompra.addTab("3.-Por Cuenta C. Debito ", jPanelFK_IdCuentaContableDebitoRecargoCompra);
		jTabbedPaneBusquedasRecargoCompra.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRecargoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRecargoCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();						
			this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRecargoCompra.gridx = 0;		
			//this.gridBagConstraintsRecargoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRecargoCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRecargoCompra, this.gridBagConstraintsRecargoCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRecargoCompra.gridx = 0;		
		//this.gridBagConstraintsRecargoCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRecargoCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRecargoCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRecargoCompra.gridx = 0;		
			this.gridBagConstraintsRecargoCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRecargoCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRecargoCompra, this.gridBagConstraintsRecargoCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRecargoCompra, this.gridBagConstraintsRecargoCompra);								
		
		
		/*
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);
		*/		
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRecargoCompra.gridx =0;
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRecargoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRecargoCompra, this.gridBagConstraintsRecargoCompra);
				
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRecargoCompra, this.gridBagConstraintsRecargoCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRecargoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRecargoCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosRecargoCompra.setLayout(gridaBagLayoutBusquedasParametrosRecargoCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRecargoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRecargoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecargoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecargoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
			
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
			
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRecargoCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRecargoCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRecargoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRecargoCompra.setName("jPanelReporteDinamicoRecargoCompra"); 
		
		this.jPanelReporteDinamicoRecargoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRecargoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRecargoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRecargoCompra.setLayout(gridaBagLayoutReporteDinamicoRecargoCompra);
		
		
		this.jInternalFrameReporteDinamicoRecargoCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRecargoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRecargoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRecargoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRecargoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRecargoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRecargoCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRecargoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRecargoCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoRecargoCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoRecargoCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRecargoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRecargoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRecargoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recargo Compraes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRecargoCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteRecargoCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRecargoCompra.add(this.jLabelColumnasSelectReporteRecargoCompra, this.gridBagConstraintsRecargoCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRecargoCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteRecargoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRecargoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRecargoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRecargoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRecargoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRecargoCompra=new JScrollPane(this.jListColumnasSelectReporteRecargoCompra);
			
			this.jScrollColumnasSelectReporteRecargoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRecargoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRecargoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRecargoCompra.add(this.jListColumnasSelectReporteRecargoCompra, this.gridBagConstraintsRecargoCompra);
		this.jPanelReporteDinamicoRecargoCompra.add(this.jScrollColumnasSelectReporteRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRecargoCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteRecargoCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRecargoCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteRecargoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRecargoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRecargoCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRecargoCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRecargoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRecargoCompra=new JScrollPane(this.jListRelacionesSelectReporteRecargoCompra);
			
			this.jScrollRelacionesSelectReporteRecargoCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRecargoCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRecargoCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRecargoCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRecargoCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoRecargoCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRecargoCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRecargoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRecargoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRecargoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRecargoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRecargoCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRecargoCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecargoCompra.add(this.jLabelGenerarExcelReporteDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRecargoCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRecargoCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRecargoCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRecargoCompra.setToolTipText("Generar EXCEL"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRecargoCompra.add(this.jButtonGenerarExcelReporteDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecargoCompra.add(this.jComboBoxTiposReportesDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRecargoCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRecargoCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRecargoCompra.add(this.jLabelTiposArchivoReporteDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecargoCompra.add(this.jComboBoxTiposArchivosReportesDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRecargoCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRecargoCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRecargoCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRecargoCompra.setToolTipText("Generar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecargoCompra.add(this.jButtonGenerarReporteDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRecargoCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRecargoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRecargoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRecargoCompra.setToolTipText("Cancelar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRecargoCompra.add(this.jButtonCerrarReporteDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRecargoCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRecargoCompra= new JScrollPane(jPanelReporteDinamicoRecargoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRecargoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRecargoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRecargoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recargo Compraes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRecargoCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRecargoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRecargoCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRecargoCompra);
		this.jInternalFrameReporteDinamicoRecargoCompra.getContentPane().add(this.jScrollPanelReporteDinamicoRecargoCompra, this.gridBagConstraintsRecargoCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRecargoCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRecargoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRecargoCompra.setName("jPanelImportacionRecargoCompra"); 
		
		this.jPanelImportacionRecargoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRecargoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRecargoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRecargoCompra.setLayout(gridaBagLayoutImportacionRecargoCompra);
		
		
		this.jInternalFrameImportacionRecargoCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRecargoCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRecargoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRecargoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRecargoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRecargoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRecargoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRecargoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRecargoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRecargoCompra.setResizable(true);
	    this.jInternalFrameImportacionRecargoCompra.setClosable(true);
	    this.jInternalFrameImportacionRecargoCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRecargoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRecargoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRecargoCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRecargoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRecargoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRecargoCompra.setResizable(true);
	    this.jInternalFrameImportacionRecargoCompra.setClosable(true);
	    this.jInternalFrameImportacionRecargoCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRecargoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRecargoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRecargoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recargo Compraes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRecargoCompra = new JLabelMe();

		this.jLabelArchivoImportacionRecargoCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRecargoCompra.add(this.jLabelArchivoImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRecargoCompra = new JFileChooser();		
		this.jFileChooserImportacionRecargoCompra.setToolTipText("ESCOGER ARCHIVO"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRecargoCompra = new JButtonMe();
		this.jButtonAbrirImportacionRecargoCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRecargoCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRecargoCompra.setToolTipText("Generar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecargoCompra.add(this.jButtonAbrirImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRecargoCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionRecargoCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRecargoCompra.add(this.jLabelPathArchivoImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRecargoCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRecargoCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRecargoCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRecargoCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecargoCompra.add(this.jTextFieldPathArchivoImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRecargoCompra = new JButtonMe();
		this.jButtonGenerarImportacionRecargoCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRecargoCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRecargoCompra.setToolTipText("Generar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecargoCompra.add(this.jButtonGenerarImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRecargoCompra = new JButtonMe();
		this.jButtonCerrarImportacionRecargoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRecargoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRecargoCompra.setToolTipText("Cancelar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRecargoCompra.add(this.jButtonCerrarImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRecargoCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionRecargoCompra= new JScrollPane(jPanelImportacionRecargoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsRecargoCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRecargoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRecargoCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRecargoCompra);
		this.jInternalFrameImportacionRecargoCompra.getContentPane().add(this.jScrollPanelImportacionRecargoCompra, this.gridBagConstraintsRecargoCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRecargoCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRecargoCompra = new JButtonMe();
			this.jButtonAbrirOrderByRecargoCompra.setText("Orden");
			this.jButtonAbrirOrderByRecargoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRecargoCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRecargoCompra";
			inputMap = this.jButtonAbrirOrderByRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRecargoCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByRecargoCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRecargoCompra.setName("jPanelOrderByRecargoCompra"); 
			
			this.jPanelOrderByRecargoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRecargoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRecargoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRecargoCompra.setLayout(gridaBagLayoutOrderByRecargoCompra);
			
			
			this.jTableDatosRecargoCompraOrderBy = new JTableMe();        
			this.jTableDatosRecargoCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRecargoCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRecargoCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRecargoCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRecargoCompraOrderBy.setViewportView(this.jTableDatosRecargoCompraOrderBy);
			this.jTableDatosRecargoCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRecargoCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRecargoCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRecargoCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRecargoCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRecargoCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRecargoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRecargoCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRecargoCompra.setTitle("Orden");
			this.jInternalFrameOrderByRecargoCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRecargoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRecargoCompra.setResizable(true);
			this.jInternalFrameOrderByRecargoCompra.setClosable(true);
			this.jInternalFrameOrderByRecargoCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRecargoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRecargoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRecargoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recargo Compraes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRecargoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRecargoCompra.ipady =150;
				
			this.jPanelOrderByRecargoCompra.add(jScrollPanelDatosRecargoCompraOrderBy, this.gridBagConstraintsRecargoCompra);//this.jTableDatosRecargoCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRecargoCompra = new JButtonMe();
			this.jButtonCerrarOrderByRecargoCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRecargoCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRecargoCompra.setToolTipText("Cancelar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRecargoCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRecargoCompra.add(this.jButtonCerrarOrderByRecargoCompra, this.gridBagConstraintsRecargoCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRecargoCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByRecargoCompra= new JScrollPane(jPanelOrderByRecargoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsRecargoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRecargoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRecargoCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRecargoCompra);
			
			this.jInternalFrameOrderByRecargoCompra.getContentPane().add(this.jScrollPanelOrderByRecargoCompra, this.gridBagConstraintsRecargoCompra);			
		
		} else {
			this.jButtonAbrirOrderByRecargoCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.recargocompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRecargoCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRecargoCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRecargoCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRecargoCompra.getRowHeight();//RecargoCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RecargoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRecargoCompra.isSelected()) {
					iHeightTable=RecargoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RecargoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RecargoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RecargoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRecargoCompra.isSelected()) {
					iHeightTable=RecargoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RecargoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RecargoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRecargoCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRecargoCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRecargoCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRecargoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRecargoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRecargoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRecargoCompra!=null && this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRecargoCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRecargoCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRecargoCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRecargoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRecargoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRecargoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=recargocompraLogic.getRecargoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recargocompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RecargoCompra> TraerRecargoCompraBeans(List<RecargoCompra> recargocompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(RecargoCompra recargocompra:recargocompras) {
					
				if(!(RecargoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RecargoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					recargocompra.setsDetalleGeneralEntityReporte(RecargoCompraConstantesFunciones.getRecargoCompraDescripcion(recargocompra));
										
					recargocompra.setes_servicio_descripcion(RecargoCompraConstantesFunciones.getes_servicioDescripcion(recargocompra));	
					
						
					
				} else  {
							
					//recargocompra.setsDetalleGeneralEntityReporte(recargocompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//recargocomprabeans.add(recargocomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return recargocompras;
    }
	//PARA REPORTES FIN
}
