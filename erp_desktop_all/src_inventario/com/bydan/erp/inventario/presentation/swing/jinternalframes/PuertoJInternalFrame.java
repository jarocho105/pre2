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


import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
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
import com.bydan.erp.inventario.util.PuertoConstantesFunciones;

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
public class PuertoJInternalFrame extends PuertoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPuerto;
	
	protected JMenuBar jmenuBarPuerto;
	
	protected JMenu jmenuPuerto;
	protected JMenu jmenuDatosPuerto;
	protected JMenu jmenuArchivoPuerto;
	protected JMenu jmenuAccionesPuerto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPuerto;	
	protected GridBagConstraints gridBagConstraintsPuerto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PuertoDetalleFormJInternalFrame jInternalFrameDetalleFormPuerto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPuerto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPuerto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoPuertoBeanSwingJInternalFrame tipopuertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopuerto="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public PuertoSessionBean puertoSessionBean;
		
	
	
	public TipoPuertoSessionBean tipopuertoSessionBean;
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Puerto> puertos;		
	public List<Puerto> puertosEliminados;	
	public List<Puerto> puertosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPuerto;		
	protected JButton jButtonAbrirOrderByPuerto;
	
	
	//protected JPanel jPanelOrderByPuerto;
	//public JScrollPane jScrollPanelOrderByPuerto;	
	//protected JButton jButtonCerrarOrderByPuerto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PuertoLogic puertoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPuerto;
	public JScrollPane jScrollPanelDatosEdicionPuerto;
	public JScrollPane jScrollPanelDatosGeneralPuerto;
    
	
	
	//public JScrollPane jScrollPanelDatosPuertoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPuerto;
	//public JScrollPane jScrollPanelImportacionPuerto;
	
	
	
	protected JPanel jPanelAccionesPuerto;
	
    protected JPanel jPanelPaginacionPuerto;
    protected JPanel jPanelParametrosReportesPuerto;
	protected JPanel jPanelParametrosReportesAccionesPuerto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Puerto;
	protected JPanel jPanelParametrosAuxiliar2Puerto;
	protected JPanel jPanelParametrosAuxiliar3Puerto;
	protected JPanel jPanelParametrosAuxiliar4Puerto;
	//protected JPanel jPanelParametrosAuxiliar5Puerto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPuerto;
	//protected JPanel jPanelImportacionPuerto;
	
	
	public JTable jTableDatosPuerto;
	
	
	
	//public JTable jTableDatosPuertoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPuerto;
	protected JButton jButtonDuplicarPuerto;
	protected JButton jButtonCopiarPuerto;
	protected JButton jButtonVerFormPuerto;
	protected JButton jButtonNuevoRelacionesPuerto;
	protected JButton jButtonModificarPuerto;
	
    protected JButton jButtonGuardarCambiosTablaPuerto;
	protected JButton jButtonCerrarPuerto;
	
	
	protected JButton jButtonRecargarInformacionPuerto;
	protected JButton jButtonProcesarInformacionPuerto;
	
	
	protected JButton jButtonAnterioresPuerto;
	protected JButton jButtonSiguientesPuerto;
	protected JButton jButtonNuevoGuardarCambiosPuerto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPuerto;
	//protected JButton jButtonCerrarReporteDinamicoPuerto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPuerto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPuerto;
	//protected JButton jButtonGenerarImportacionPuerto;
	//protected JButton jButtonCerrarImportacionPuerto;
	//protected JFileChooser jFileChooserImportacionPuerto;
	//protected File fileImportacionPuerto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPuerto;
	protected JButton jButtonDuplicarToolBarPuerto;
	protected JButton jButtonNuevoRelacionesToolBarPuerto;
	
	
	public JButton jButtonGuardarCambiosToolBarPuerto;
	protected JButton jButtonCopiarToolBarPuerto;
	protected JButton jButtonVerFormToolBarPuerto;
	public JButton jButtonGuardarCambiosTablaToolBarPuerto;
	protected JButton jButtonMostrarOcultarTablaToolBarPuerto;
	protected JButton jButtonCerrarToolBarPuerto;
	
	protected JButton jButtonRecargarInformacionToolBarPuerto;
	protected JButton jButtonProcesarInformacionToolBarPuerto;
	protected JButton jButtonAnterioresToolBarPuerto;
	protected JButton jButtonSiguientesToolBarPuerto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPuerto;
	protected JButton jButtonAbrirOrderByToolBarPuerto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPuerto;
	protected JMenuItem jMenuItemDuplicarPuerto;
	protected JMenuItem jMenuItemNuevoRelacionesPuerto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPuerto;
	protected JMenuItem jMenuItemCopiarPuerto;
	protected JMenuItem jMenuItemVerFormPuerto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPuerto;
	protected JMenuItem jMenuItemCerrarPuerto;
	protected JMenuItem jMenuItemDetalleCerrarPuerto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPuerto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPuerto;
	
	protected JMenuItem jMenuItemRecargarInformacionPuerto;
	protected JMenuItem jMenuItemProcesarInformacionPuerto;
	protected JMenuItem jMenuItemAnterioresPuerto;
	protected JMenuItem jMenuItemSiguientesPuerto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPuerto;
	protected JMenuItem jMenuItemAbrirOrderByPuerto;
	protected JMenuItem jMenuItemMostrarOcultarPuerto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPuerto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPuerto;
	protected JCheckBox jCheckBoxSeleccionadosPuerto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPuerto;
	protected JCheckBox jCheckBoxConGraficoReportePuerto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPuerto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPuerto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPuerto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPuerto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPuerto;
	protected JTextField jTextFieldValorCampoGeneralPuerto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePuerto;
	//public JList<Reporte> jListColumnasSelectReportePuerto;
	//public JScrollPane jScrollColumnasSelectReportePuerto;
	
	//public JLabel jLabelRelacionesSelectReportePuerto;
	//public JList<Reporte> jListRelacionesSelectReportePuerto;
	//public JScrollPane jScrollRelacionesSelectReportePuerto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPuerto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPuerto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPuerto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPuerto;
	
		
	//public JLabel jLabelArchivoImportacionPuerto;	
	//public JLabel jLabelPathArchivoImportacionPuerto;
	//protected JTextField jTextFieldPathArchivoImportacionPuerto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPuerto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPuerto;
	
	//public JLabel jLabelColumnaCategoriaValorPuerto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPuerto;
	
	//public JLabel jLabelColumnasValoresGraficoPuerto;
	//public JList<Reporte> jListColumnasValoresGraficoPuerto;
	//public JScrollPane jScrollColumnasValoresGraficoPuerto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPuerto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPuerto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPuerto;
	public JPanel jPanelBusquedaPorNombrePuerto;
	public JButton jButtonBusquedaPorNombrePuerto;
	public JPanel jPanelFK_IdPaisPuerto;
	public JButton jButtonFK_IdPaisPuerto;
	public JPanel jPanelFK_IdTipoPuertoPuerto;
	public JButton jButtonFK_IdTipoPuertoPuerto;
	
	public JPanel jPanelnombreBusquedaPorNombrePuerto;
	public JLabel jLabelnombreBusquedaPorNombrePuerto;
	public JTextArea jTextAreanombreBusquedaPorNombrePuerto;
	public JButton jButtonnombreBusquedaPorNombrePuertoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisPuerto;
	public JLabel jLabelid_paisFK_IdPaisPuerto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisPuerto;
	public JButton jButtonid_paisFK_IdPaisPuerto= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPuertoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPuertoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_puertoFK_IdTipoPuertoPuerto;
	public JLabel jLabelid_tipo_puertoFK_IdTipoPuertoPuerto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto;
	public JButton jButtonid_tipo_puertoFK_IdTipoPuertoPuerto= new JButtonMe();
	public JButton jButtonid_tipo_puertoFK_IdTipoPuertoPuertoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_puertoFK_IdTipoPuertoPuertoBusqueda= new JButtonMe();

	
	
	
	
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
	public PuertoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPuerto)	{
		this.jButtonRecargarInformacionPuerto = jButtonRecargarInformacionPuerto;
	}
	
	public JButton getjButtonProcesarInformacionPuerto() {
		return this.jButtonProcesarInformacionPuerto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPuerto)	{
		this.jButtonProcesarInformacionPuerto = jButtonProcesarInformacionPuerto;
	}
	
	
	public JButton getjButtonRecargarInformacionPuerto() {
		return this.jButtonRecargarInformacionPuerto;
	}
	
	
	public List<Puerto> getpuertos() {
		return this.puertos;
	}

	public void setpuertos(List<Puerto> puertos) {
		this.puertos = puertos;
	}
	
	public List<Puerto> getpuertosAux() {
		return this.puertosAux;
	}

	public void setpuertosAux(List<Puerto> puertosAux) {
		this.puertosAux = puertosAux;
	}
	
	public List<Puerto> getpuertosEliminados() {
		return this.puertosEliminados;
	}

	public void setPuertosEliminados(List<Puerto> puertosEliminados) {
		this.puertosEliminados = puertosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPuerto() {
		return jComboBoxTiposSeleccionarPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPuerto(
			JComboBox jComboBoxTiposSeleccionarPuerto) {
		this.jComboBoxTiposSeleccionarPuerto = jComboBoxTiposSeleccionarPuerto;
	}
	
	public void setBorderResaltarTiposSeleccionarPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPuerto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPuerto() {
		return jTextFieldValorCampoGeneralPuerto;
	}

	public void setjTextFieldValorCampoGeneralPuerto(
			JTextField jTextFieldValorCampoGeneralPuerto) {
		this.jTextFieldValorCampoGeneralPuerto = jTextFieldValorCampoGeneralPuerto;
	}

	public void setBorderResaltarValorCampoGeneralPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPuerto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPuerto() {
		return this.jCheckBoxSeleccionarTodosPuerto;
	}

	public void setjCheckBoxSeleccionarTodosPuerto(
			JCheckBox jCheckBoxSeleccionarTodosPuerto) {
		this.jCheckBoxSeleccionarTodosPuerto = jCheckBoxSeleccionarTodosPuerto;
	}

	public void setBorderResaltarSeleccionarTodosPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPuerto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPuerto() {
		return this.jCheckBoxSeleccionadosPuerto;
	}

	public void setjCheckBoxSeleccionadosPuerto(
			JCheckBox jCheckBoxSeleccionadosPuerto) {
		this.jCheckBoxSeleccionadosPuerto = jCheckBoxSeleccionadosPuerto;
	}
	
	public void setBorderResaltarSeleccionadosPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPuerto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPuerto() {
		return this.jComboBoxTiposArchivosReportesPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPuerto(
			JComboBox jComboBoxTiposArchivosReportesPuerto) {
		this.jComboBoxTiposArchivosReportesPuerto = jComboBoxTiposArchivosReportesPuerto;
	}

	public void setBorderResaltarTiposArchivosReportesPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPuerto() {
		return this.jComboBoxTiposReportesPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPuerto(
			JComboBox jComboBoxTiposReportesPuerto) {
		this.jComboBoxTiposReportesPuerto = jComboBoxTiposReportesPuerto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPuerto() {
	//	return jComboBoxTiposReportesDinamicoPuerto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPuerto(
	//		JComboBox jComboBoxTiposReportesDinamicoPuerto) {
	//	this.jComboBoxTiposReportesDinamicoPuerto = jComboBoxTiposReportesDinamicoPuerto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPuerto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPuerto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPuerto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPuerto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPuerto = jComboBoxTiposArchivosReportesDinamicoPuerto;
	//}
	
	public void setBorderResaltarTiposReportesPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPuerto() {
		return this.jComboBoxTiposGraficosReportesPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPuerto(
			JComboBox jComboBoxTiposGraficosReportesPuerto) {
		this.jComboBoxTiposGraficosReportesPuerto = jComboBoxTiposGraficosReportesPuerto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPuerto() {
		return this.jComboBoxTiposPaginacionPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPuerto(
			JComboBox jComboBoxTiposPaginacionPuerto) {
		this.jComboBoxTiposPaginacionPuerto = jComboBoxTiposPaginacionPuerto;
	}
	
	public void setBorderResaltarTiposPaginacionPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPuerto() {
		return this.jComboBoxTiposRelacionesPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPuerto() {
		return this.jComboBoxTiposAccionesPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPuerto(
			JComboBox jComboBoxTiposRelacionesPuerto) {
		this.jComboBoxTiposRelacionesPuerto = jComboBoxTiposRelacionesPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPuerto(
			JComboBox jComboBoxTiposAccionesPuerto) {
		this.jComboBoxTiposAccionesPuerto = jComboBoxTiposAccionesPuerto;
	}
	
	public void setBorderResaltarTiposRelacionesPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPuerto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPuerto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPuerto() {
	//	return jCheckBoxConGraficoDinamicoPuerto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPuerto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPuerto) {
	//	this.jCheckBoxConGraficoDinamicoPuerto = jCheckBoxConGraficoDinamicoPuerto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPuerto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPuerto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPuerto .setBorder(borderResaltar);		
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
		this.puertoSessionBean=new PuertoSessionBean();
		
		this.puertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.puertoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PuertoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PuertoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PuertoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Puerto MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
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
		
		PuertoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPuerto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPuerto,this.jTtoolBarPuerto,
							"nuevo","nuevo","Nuevo"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPuerto,this.jTtoolBarPuerto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPuerto,this.jTtoolBarPuerto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPuerto,this.jTtoolBarPuerto,
							"duplicar","duplicar","Duplicar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPuerto,this.jTtoolBarPuerto,
							"copiar","copiar","Copiar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPuerto,this.jTtoolBarPuerto,
							"ver_form","ver_form","Ver"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuerto,this.jTtoolBarPuerto,
							"recargar","recargar","Recargar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuerto,this.jTtoolBarPuerto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuerto,this.jTtoolBarPuerto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPuerto,this.jTtoolBarPuerto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPuerto,this.jTtoolBarPuerto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPuerto,this.jTtoolBarPuerto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPuerto,this.jTtoolBarPuerto,
							"cerrar","cerrar","Salir"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPuerto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPuerto;
			
				this.jButtonProcesarInformacionToolBarPuerto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPuerto;
				
		//protected JButton jButtonModificarToolBarPuerto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPuerto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPuerto=new JMenuMe("General");
		this.jmenuArchivoPuerto=new JMenuMe("Archivo");
		this.jmenuAccionesPuerto=new JMenuMe("Acciones");
		this.jmenuDatosPuerto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPuerto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPuerto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPuerto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPuerto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPuerto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPuerto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPuerto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPuerto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPuerto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPuerto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPuerto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPuerto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPuerto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPuerto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPuerto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPuerto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPuerto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPuerto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPuerto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPuerto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPuerto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPuerto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPuerto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPuerto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPuerto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPuerto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPuerto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPuerto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPuerto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPuerto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPuerto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPuerto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPuerto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPuerto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPuerto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPuerto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPuerto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPuerto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPuerto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPuerto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPuerto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPuerto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPuerto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPuerto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPuerto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPuerto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPuerto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPuerto.add(this.jMenuItemCerrarPuerto);
			
			this.jmenuAccionesPuerto.add(this.jMenuItemNuevoPuerto);
			this.jmenuAccionesPuerto.add(this.jMenuItemNuevoGuardarCambiosPuerto);
			this.jmenuAccionesPuerto.add(this.jMenuItemNuevoRelacionesPuerto);
			this.jmenuAccionesPuerto.add(this.jMenuItemGuardarCambiosTablaPuerto);		
			this.jmenuAccionesPuerto.add(this.jMenuItemDuplicarPuerto);		
			this.jmenuAccionesPuerto.add(this.jMenuItemCopiarPuerto);		
			this.jmenuAccionesPuerto.add(this.jMenuItemVerFormPuerto);		
			
			this.jmenuDatosPuerto.add(this.jMenuItemRecargarInformacionPuerto);				
			this.jmenuDatosPuerto.add(this.jMenuItemAnterioresPuerto);				
			this.jmenuDatosPuerto.add(this.jMenuItemSiguientesPuerto);				
			this.jmenuDatosPuerto.add(this.jMenuItemAbrirOrderByPuerto);				
			this.jmenuDatosPuerto.add(this.jMenuItemMostrarOcultarPuerto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPuerto.add(this.jMenuItemGuardarCambiosPuerto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPuerto.add(this.jmenuArchivoPuerto);		
			this.jmenuBarPuerto.add(this.jmenuAccionesPuerto);		
			this.jmenuBarPuerto.add(this.jmenuDatosPuerto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPuerto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPuerto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombrePuerto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePuerto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePuerto= new JButtonMe();
		this.jButtonBusquedaPorNombrePuerto.setText("Buscar");
		this.jButtonBusquedaPorNombrePuerto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePuerto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePuerto = new JLabelMe();
		jLabelnombreBusquedaPorNombrePuerto.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePuerto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePuerto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombrePuerto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombrePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombrePuerto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisPuerto.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisPuerto= new JButtonMe();
		this.jButtonFK_IdPaisPuerto.setText("Buscar");
		this.jButtonFK_IdPaisPuerto.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisPuerto,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisPuerto = new JLabelMe();
		jLabelid_paisFK_IdPaisPuerto.setText("Pais :");
		jLabelid_paisFK_IdPaisPuerto.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisPuerto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisPuerto= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisPuerto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPuertoPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPuertoPuerto.setToolTipText("Buscar Por Tipo Puerto ");
		this.jButtonFK_IdTipoPuertoPuerto= new JButtonMe();
		this.jButtonFK_IdTipoPuertoPuerto.setText("Buscar");
		this.jButtonFK_IdTipoPuertoPuerto.setToolTipText("Buscar Por Tipo Puerto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPuertoPuerto,"buscar_button","Buscar Por Tipo Puerto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPuertoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_puertoFK_IdTipoPuertoPuerto = new JLabelMe();
		jLabelid_tipo_puertoFK_IdTipoPuertoPuerto.setText("Tipo Puerto :");
		jLabelid_tipo_puertoFK_IdTipoPuertoPuerto.setToolTipText("Tipo Puerto");
		jLabelid_tipo_puertoFK_IdTipoPuertoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_puertoFK_IdTipoPuertoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_puertoFK_IdTipoPuertoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_puertoFK_IdTipoPuertoPuerto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto= new JComboBoxMe();
		jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPuerto=new JTabbedPane();


		this.jTabbedPaneBusquedasPuerto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPuerto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPuerto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPuerto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPuerto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePuerto = new PuertoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Puerto DATOS");
			this.jInternalFrameDetalleFormPuerto = new PuertoDetalleFormJInternalFrame(jDesktopPane,this.puertoSessionBean.getConGuardarRelaciones(),this.puertoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPuerto = null;//new PuertoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPuerto= new GridBagLayout();
		
		
		this.jTableDatosPuerto = new JTableMe();      
		
		String sToolTipPuerto="";
		sToolTipPuerto=PuertoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPuerto+="(Inventario.Puerto)";
		}
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPuerto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPuerto.setToolTipText(sToolTipPuerto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPuerto);
		this.jTableDatosPuerto.setAutoCreateRowSorter(true);
		this.jTableDatosPuerto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPuerto.setRowSelectionAllowed(true);
		this.jTableDatosPuerto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPuerto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPuerto = new JButtonMe();
		this.jButtonDuplicarPuerto = new JButtonMe();
		this.jButtonCopiarPuerto = new JButtonMe();
		this.jButtonVerFormPuerto = new JButtonMe();
		this.jButtonNuevoRelacionesPuerto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPuerto = new JButtonMe();
		this.jButtonCerrarPuerto = new JButtonMe();
		
		this.jScrollPanelDatosPuerto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPuerto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Puerto";
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puertoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPuerto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPuerto.setToolTipText("Acciones");
        this.jPanelAccionesPuerto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPuerto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPuerto=new ReporteDinamicoJInternalFrame(PuertoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPuerto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPuerto=new ImportacionJInternalFrame(PuertoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPuerto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPuerto = new JButtonMe();
		
		this.jButtonAbrirOrderByPuerto.setText("Orden");
		this.jButtonAbrirOrderByPuerto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPuerto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuerto,false,this);
			
			//this.cargarOrderByPuerto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuerto,true,this);
			
			//this.cargarOrderByPuerto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPuerto.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosPuerto.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosPuerto.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosPuerto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPuerto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPuerto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPuerto.setText("Nuevo");
		this.jButtonDuplicarPuerto.setText("Duplicar");
		this.jButtonCopiarPuerto.setText("Copiar");
		this.jButtonVerFormPuerto.setText("Ver");
		this.jButtonNuevoRelacionesPuerto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPuerto.setText("Guardar");
		this.jButtonCerrarPuerto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPuerto,"nuevo_button","Nuevo",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPuerto,"duplicar_button","Duplicar",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPuerto,"copiar_button","Copiar",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPuerto,"ver_form","Ver",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPuerto,"nuevorelaciones_button","Nuevo Rel",this.puertoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPuerto,"guardarcambiostabla_button","Guardar",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPuerto,"cerrar_button","Salir",this.puertoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPuerto.setToolTipText("Nuevo"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPuerto.setToolTipText("Duplicar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPuerto.setToolTipText("Copiar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPuerto.setToolTipText("Ver"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPuerto.setToolTipText("Nuevo Rel"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPuerto.setToolTipText("Guardar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPuerto.setToolTipText("Salir"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPuerto";
		inputMap = this.jButtonNuevoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPuerto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPuerto";
		inputMap = this.jButtonDuplicarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPuerto"));
		
		//COPIAR
		sMapKey = "CopiarPuerto";
		inputMap = this.jButtonCopiarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPuerto"));
		
		//VEr FORM
		sMapKey = "VerFormPuerto";
		inputMap = this.jButtonVerFormPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPuerto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPuerto";
		inputMap = this.jButtonNuevoRelacionesPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPuerto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPuerto";
		inputMap = this.jButtonModificarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPuerto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPuerto";
		inputMap = this.jButtonCerrarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPuerto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPuerto";
		inputMap = this.jButtonGuardarCambiosTablaPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPuerto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Puerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Puerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Puerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Puerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Puerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPuerto.setName("jPanelParametrosReportesPuerto"); 
		
		this.jPanelParametrosReportesAccionesPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPuerto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPuerto.setName("jPanelParametrosReportesAccionesPuerto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPuerto = new JButtonMe();
		this.jButtonRecargarInformacionPuerto.setText("Recargar");
		this.jButtonRecargarInformacionPuerto.setToolTipText("Recargar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPuerto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPuerto = new JButtonMe();
		this.jButtonProcesarInformacionPuerto.setText("Procesar");
		this.jButtonProcesarInformacionPuerto.setToolTipText("Procesar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPuerto.setVisible(false);
			
		this.jButtonProcesarInformacionPuerto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPuerto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPuerto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPuerto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuerto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPuerto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPuerto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuerto.setText("TIPO");       
		this.jComboBoxTiposReportesPuerto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPuerto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuerto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPuerto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPuerto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPuerto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPuerto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPuerto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPuerto.setText("Accion");
		this.jComboBoxTiposRelacionesPuerto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPuerto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPuerto.setText("Accion");
		this.jComboBoxTiposAccionesPuerto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPuerto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPuerto.setText("Accion");
		this.jComboBoxTiposSeleccionarPuerto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPuerto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPuerto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPuerto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPuerto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPuerto = new JLabelMe();
		
		this.jLabelAccionesPuerto.setText("Acciones");		
		this.jLabelAccionesPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPuerto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPuerto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPuerto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPuerto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPuerto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPuerto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPuerto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPuerto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPuerto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePuerto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePuerto.setText("Graf.");
		this.jCheckBoxConGraficoReportePuerto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPuerto = new JButtonMe();
		//this.jButtonAnterioresPuerto.setText("<<");
        this.jButtonAnterioresPuerto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPuerto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPuerto = new JButtonMe();
		//this.jButtonSiguientesPuerto.setText(">>");
        this.jButtonSiguientesPuerto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPuerto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPuerto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPuerto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPuerto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPuerto,"nuevoguardarcambios_button","Nue",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPuerto";
		inputMap = this.jButtonNuevoGuardarCambiosPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPuerto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPuerto";
		inputMap = this.jButtonRecargarInformacionPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPuerto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPuerto";
		inputMap = this.jButtonSiguientesPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPuerto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPuerto";
		inputMap = this.jButtonAnterioresPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPuerto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPuerto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPuerto.setMinimumSize(new Dimension(this.getWidth(),PuertoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuertoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPuerto.setMaximumSize(new Dimension(this.getWidth(),PuertoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuertoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPuerto.setPreferredSize(new Dimension(this.getWidth(),PuertoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuertoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPuerto = new GridBagLayout();

			this.jPanelPaginacionPuerto.setLayout(gridaBagLayoutPaginacionPuerto);						
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 0;
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPuerto.add(this.jButtonAnterioresPuerto, this.gridBagConstraintsPuerto);
					
						
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPuerto.gridy = 0;
			
			this.jPanelPaginacionPuerto.add(this.jButtonNuevoGuardarCambiosPuerto, this.gridBagConstraintsPuerto);
						
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPuerto.gridy = 0;
			this.jPanelPaginacionPuerto.add(this.jButtonSiguientesPuerto, this.gridBagConstraintsPuerto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 1;
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuerto.add(this.jButtonNuevoPuerto, this.gridBagConstraintsPuerto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPuerto = new GridBagConstraints();
				this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPuerto.gridy = 1;
				this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPuerto.add(this.jButtonNuevoRelacionesPuerto, this.gridBagConstraintsPuerto);
			}
			
			
			if(!this.puertoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPuerto = new GridBagConstraints();
				this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPuerto.gridy = 1;
				this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPuerto.add(this.jButtonGuardarCambiosTablaPuerto, this.gridBagConstraintsPuerto);
			}
			
			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 1;
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuerto.add(this.jButtonDuplicarPuerto, this.gridBagConstraintsPuerto);
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 1;
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuerto.add(this.jButtonCopiarPuerto, this.gridBagConstraintsPuerto);
		
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 1;
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuerto.add(this.jButtonVerFormPuerto, this.gridBagConstraintsPuerto);
		
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 1;
			this.gridBagConstraintsPuerto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPuerto.add(this.jButtonCerrarPuerto, this.gridBagConstraintsPuerto);
		
		
		
		this.jButtonRecargarInformacionPuerto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPuerto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPuerto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPuerto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPuerto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPuerto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPuerto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPuerto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPuerto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPuerto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPuerto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPuerto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPuerto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPuerto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPuerto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPuerto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPuerto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPuerto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPuerto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePuerto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePuerto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePuerto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePuerto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPuerto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPuerto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPuerto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPuerto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPuerto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPuerto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPuerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPuerto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Puerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Puerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Puerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Puerto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPuerto.setLayout(gridaBagParametrosReportesPuerto);
			this.jPanelParametrosReportesAccionesPuerto.setLayout(gridaBagParametrosReportesAccionesPuerto);
			
			
			this.jPanelParametrosAuxiliar1Puerto.setLayout(gridaBagParametrosAuxiliar1Puerto);
			this.jPanelParametrosAuxiliar2Puerto.setLayout(gridaBagParametrosAuxiliar2Puerto);
			this.jPanelParametrosAuxiliar3Puerto.setLayout(gridaBagParametrosAuxiliar3Puerto);
			this.jPanelParametrosAuxiliar4Puerto.setLayout(gridaBagParametrosAuxiliar4Puerto);
			//this.jPanelParametrosAuxiliar5Puerto.setLayout(gridaBagParametrosAuxiliar2Puerto);			
			
			
			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuerto.add(this.jButtonRecargarInformacionPuerto, this.gridBagConstraintsPuerto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Puerto.add(this.jComboBoxTiposPaginacionPuerto, this.gridBagConstraintsPuerto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Puerto.add(this.jCheckBoxConAltoMaximoTablaPuerto, this.gridBagConstraintsPuerto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Puerto.add(this.jComboBoxTiposArchivosReportesPuerto, this.gridBagConstraintsPuerto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuerto.add(this.jPanelParametrosAuxiliar1Puerto, this.gridBagConstraintsPuerto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuerto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Puerto.add(this.jComboBoxTiposReportesPuerto, this.gridBagConstraintsPuerto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuerto.add(this.jPanelParametrosAuxiliar4Puerto, this.gridBagConstraintsPuerto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuerto.add(this.jComboBoxTiposReportesPuerto, this.gridBagConstraintsPuerto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuerto.add(this.jCheckBoxGenerarReportePuerto, this.gridBagConstraintsPuerto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuerto.add(this.jPanelParametrosAuxiliar2Puerto, this.gridBagConstraintsPuerto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuerto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuerto.add(this.jLabelAccionesPuerto, this.gridBagConstraintsPuerto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPuerto = new GridBagConstraints();
				this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPuerto.add(this.jButtonAbrirOrderByPuerto, this.gridBagConstraintsPuerto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuerto.add(this.jComboBoxTiposSeleccionarPuerto, this.gridBagConstraintsPuerto);			
			
			
			/*
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuerto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuerto.add(this.jCheckBoxSeleccionarTodosPuerto, this.gridBagConstraintsPuerto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuerto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Puerto.add(this.jCheckBoxSeleccionarTodosPuerto, this.gridBagConstraintsPuerto);															
				
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuerto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Puerto.add(this.jCheckBoxSeleccionadosPuerto, this.gridBagConstraintsPuerto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuerto.add(this.jPanelParametrosAuxiliar3Puerto, this.gridBagConstraintsPuerto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuerto.add(this.jComboBoxTiposRelacionesPuerto, this.gridBagConstraintsPuerto);
				
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuerto.add(this.jComboBoxTiposAccionesPuerto, this.gridBagConstraintsPuerto);
	
				
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuerto.add(this.jTextFieldValorCampoGeneralPuerto, this.gridBagConstraintsPuerto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPuerto = new GridBagLayout();

			this.jScrollPanelDatosPuerto.setLayout(gridaBagLayoutDatosPuerto);
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = 0;
			this.gridBagConstraintsPuerto.gridx = 0;
			
			this.jScrollPanelDatosPuerto.add(this.jTableDatosPuerto, this.gridBagConstraintsPuerto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPuerto.setViewportView(this.jTableDatosPuerto);
		this.jTableDatosPuerto.setFillsViewportHeight(true);
		this.jTableDatosPuerto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPuerto= new GridBagLayout();
		this.jPanelAccionesPuerto.setLayout(gridaBagLayoutAccionesPuerto);
		
		
		/*	
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 0;
			
		this.jPanelAccionesPuerto.add(this.jButtonNuevoPuerto, this.gridBagConstraintsPuerto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombrePuerto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePuerto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePuerto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePuerto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePuerto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePuerto.setLayout(gridaBagLayoutBusquedaPorNombrePuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 0;
		gridBagConstraintsPuerto.gridx = 0;
		jPanelBusquedaPorNombrePuerto.add(jLabelnombreBusquedaPorNombrePuerto, gridBagConstraintsPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 0;
		gridBagConstraintsPuerto.gridx = 1;
		jPanelBusquedaPorNombrePuerto.add(jTextAreanombreBusquedaPorNombrePuerto, gridBagConstraintsPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 1;
		gridBagConstraintsPuerto.gridx =1;
		jPanelBusquedaPorNombrePuerto.add(jButtonBusquedaPorNombrePuerto, gridBagConstraintsPuerto);

		jTabbedPaneBusquedasPuerto.addTab("1.-Por Nombre ", jPanelBusquedaPorNombrePuerto);
		jTabbedPaneBusquedasPuerto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisPuerto= new GridBagLayout();
		gridaBagLayoutFK_IdPaisPuerto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisPuerto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisPuerto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisPuerto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisPuerto.setLayout(gridaBagLayoutFK_IdPaisPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 0;
		gridBagConstraintsPuerto.gridx = 0;
		jPanelFK_IdPaisPuerto.add(jLabelid_paisFK_IdPaisPuerto, gridBagConstraintsPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 0;
		gridBagConstraintsPuerto.gridx = 1;
		jPanelFK_IdPaisPuerto.add(jComboBoxid_paisFK_IdPaisPuerto, gridBagConstraintsPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 1;
		gridBagConstraintsPuerto.gridx =1;
		jPanelFK_IdPaisPuerto.add(jButtonFK_IdPaisPuerto, gridBagConstraintsPuerto);

		jTabbedPaneBusquedasPuerto.addTab("2.-Por Pais ", jPanelFK_IdPaisPuerto);
		jTabbedPaneBusquedasPuerto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoPuertoPuerto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPuertoPuerto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPuertoPuerto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPuertoPuerto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPuertoPuerto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPuertoPuerto.setLayout(gridaBagLayoutFK_IdTipoPuertoPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 0;
		gridBagConstraintsPuerto.gridx = 0;
		jPanelFK_IdTipoPuertoPuerto.add(jLabelid_tipo_puertoFK_IdTipoPuertoPuerto, gridBagConstraintsPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 0;
		gridBagConstraintsPuerto.gridx = 1;
		jPanelFK_IdTipoPuertoPuerto.add(jComboBoxid_tipo_puertoFK_IdTipoPuertoPuerto, gridBagConstraintsPuerto);

		gridBagConstraintsPuerto = new GridBagConstraints();
		gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPuerto.gridy = 1;
		gridBagConstraintsPuerto.gridx =1;
		jPanelFK_IdTipoPuertoPuerto.add(jButtonFK_IdTipoPuertoPuerto, gridBagConstraintsPuerto);

		jTabbedPaneBusquedasPuerto.addTab("3.-Por Tipo Puerto ", jPanelFK_IdTipoPuertoPuerto);
		jTabbedPaneBusquedasPuerto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPuerto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPuerto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.puertoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPuerto = new GridBagConstraints();						
			this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuerto.gridx = 0;		
			//this.gridBagConstraintsPuerto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPuerto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPuerto, this.gridBagConstraintsPuerto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPuerto.gridx = 0;		
		//this.gridBagConstraintsPuerto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPuerto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPuerto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuerto.gridx = 0;		
			this.gridBagConstraintsPuerto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPuerto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPuerto, this.gridBagConstraintsPuerto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPuerto, this.gridBagConstraintsPuerto);								
		
		
		/*
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPuerto, this.gridBagConstraintsPuerto);
		*/		
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPuerto.gridx =0;
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPuerto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPuerto, this.gridBagConstraintsPuerto);
				
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPuerto, this.gridBagConstraintsPuerto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PuertoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPuerto = new GridBagLayout();
			this.jPanelBusquedasParametrosPuerto.setLayout(gridaBagLayoutBusquedasParametrosPuerto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPuerto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPuerto, this.gridBagConstraintsPuerto);
			
			
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPuerto, this.gridBagConstraintsPuerto);
		
			
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPuerto, this.gridBagConstraintsPuerto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPuerto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPuerto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPuerto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPuerto.setName("jPanelReporteDinamicoPuerto"); 
		
		this.jPanelReporteDinamicoPuerto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPuerto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPuerto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPuerto.setLayout(gridaBagLayoutReporteDinamicoPuerto);
		
		
		this.jInternalFrameReporteDinamicoPuerto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPuerto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePuerto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPuerto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPuerto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPuerto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPuerto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPuerto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPuerto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPuerto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPuerto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPuerto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puertoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePuerto = new JLabelMe();

		this.jLabelColumnasSelectReportePuerto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPuerto.add(this.jLabelColumnasSelectReportePuerto, this.gridBagConstraintsPuerto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePuerto = new JList<Reporte>();
		this.jListColumnasSelectReportePuerto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePuerto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePuerto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePuerto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePuerto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePuerto=new JScrollPane(this.jListColumnasSelectReportePuerto);
			
			this.jScrollColumnasSelectReportePuerto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePuerto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePuerto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPuerto.add(this.jListColumnasSelectReportePuerto, this.gridBagConstraintsPuerto);
		this.jPanelReporteDinamicoPuerto.add(this.jScrollColumnasSelectReportePuerto, this.gridBagConstraintsPuerto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePuerto = new JLabelMe();

		this.jLabelRelacionesSelectReportePuerto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPuerto.add(this.jLabelRelacionesSelectReportePuerto, this.gridBagConstraintsPuerto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePuerto = new JList<Reporte>();
		this.jListRelacionesSelectReportePuerto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePuerto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePuerto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePuerto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePuerto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePuerto=new JScrollPane(this.jListRelacionesSelectReportePuerto);
			
			this.jScrollRelacionesSelectReportePuerto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePuerto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePuerto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPuerto.add(this.jListRelacionesSelectReportePuerto, this.gridBagConstraintsPuerto);
		this.jPanelReporteDinamicoPuerto.add(this.jScrollRelacionesSelectReportePuerto, this.gridBagConstraintsPuerto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPuerto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPuerto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPuerto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPuerto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPuerto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPuerto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPuerto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPuerto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPuerto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPuerto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPuerto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPuerto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPuerto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPuerto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPuerto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPuerto.add(this.jLabelGenerarExcelReporteDinamicoPuerto, this.gridBagConstraintsPuerto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPuerto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPuerto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPuerto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPuerto.setToolTipText("Generar EXCEL"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPuerto.add(this.jButtonGenerarExcelReporteDinamicoPuerto, this.gridBagConstraintsPuerto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuerto.add(this.jComboBoxTiposReportesDinamicoPuerto, this.gridBagConstraintsPuerto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPuerto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPuerto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPuerto.add(this.jLabelTiposArchivoReporteDinamicoPuerto, this.gridBagConstraintsPuerto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuerto.add(this.jComboBoxTiposArchivosReportesDinamicoPuerto, this.gridBagConstraintsPuerto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPuerto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPuerto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPuerto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPuerto.setToolTipText("Generar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuerto.add(this.jButtonGenerarReporteDinamicoPuerto, this.gridBagConstraintsPuerto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPuerto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPuerto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPuerto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPuerto.setToolTipText("Cancelar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuerto.add(this.jButtonCerrarReporteDinamicoPuerto, this.gridBagConstraintsPuerto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPuerto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPuerto= new JScrollPane(jPanelReporteDinamicoPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPuerto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPuerto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPuerto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puertoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPuerto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPuerto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPuerto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPuerto);
		this.jInternalFrameReporteDinamicoPuerto.getContentPane().add(this.jScrollPanelReporteDinamicoPuerto, this.gridBagConstraintsPuerto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPuerto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPuerto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPuerto.setName("jPanelImportacionPuerto"); 
		
		this.jPanelImportacionPuerto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPuerto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPuerto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPuerto.setLayout(gridaBagLayoutImportacionPuerto);
		
		
		this.jInternalFrameImportacionPuerto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPuerto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPuerto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePuerto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPuerto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPuerto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPuerto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPuerto.setResizable(true);
	    this.jInternalFrameImportacionPuerto.setClosable(true);
	    this.jInternalFrameImportacionPuerto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPuerto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPuerto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPuerto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPuerto.setResizable(true);
	    this.jInternalFrameImportacionPuerto.setClosable(true);
	    this.jInternalFrameImportacionPuerto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPuerto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPuerto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPuerto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puertoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPuerto = new JLabelMe();

		this.jLabelArchivoImportacionPuerto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPuerto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPuerto.add(this.jLabelArchivoImportacionPuerto, this.gridBagConstraintsPuerto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPuerto = new JFileChooser();		
		this.jFileChooserImportacionPuerto.setToolTipText("ESCOGER ARCHIVO"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPuerto = new JButtonMe();
		this.jButtonAbrirImportacionPuerto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPuerto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPuerto.setToolTipText("Generar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuerto.add(this.jButtonAbrirImportacionPuerto, this.gridBagConstraintsPuerto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPuerto = new JLabelMe();

		this.jLabelPathArchivoImportacionPuerto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPuerto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPuerto.add(this.jLabelPathArchivoImportacionPuerto, this.gridBagConstraintsPuerto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPuerto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPuerto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPuerto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPuerto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuerto.add(this.jTextFieldPathArchivoImportacionPuerto, this.gridBagConstraintsPuerto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPuerto = new JButtonMe();
		this.jButtonGenerarImportacionPuerto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPuerto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPuerto.setToolTipText("Generar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuerto.add(this.jButtonGenerarImportacionPuerto, this.gridBagConstraintsPuerto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPuerto = new JButtonMe();
		this.jButtonCerrarImportacionPuerto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPuerto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPuerto.setToolTipText("Cancelar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuerto.add(this.jButtonCerrarImportacionPuerto, this.gridBagConstraintsPuerto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPuerto = new GridBagLayout();
		
		this.jScrollPanelImportacionPuerto= new JScrollPane(jPanelImportacionPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy =iPosYImportacion;
		this.gridBagConstraintsPuerto.gridx =iPosXImportacion;
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPuerto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPuerto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPuerto);
		this.jInternalFrameImportacionPuerto.getContentPane().add(this.jScrollPanelImportacionPuerto, this.gridBagConstraintsPuerto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPuerto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPuerto = new JButtonMe();
			this.jButtonAbrirOrderByPuerto.setText("Orden");
			this.jButtonAbrirOrderByPuerto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPuerto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPuerto";
			inputMap = this.jButtonAbrirOrderByPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPuerto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPuerto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPuerto.setName("jPanelOrderByPuerto"); 
			
			this.jPanelOrderByPuerto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPuerto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPuerto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPuerto.setLayout(gridaBagLayoutOrderByPuerto);
			
			
			this.jTableDatosPuertoOrderBy = new JTableMe();        
			this.jTableDatosPuertoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPuertoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPuertoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPuertoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPuertoOrderBy.setViewportView(this.jTableDatosPuertoOrderBy);
			this.jTableDatosPuertoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPuertoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPuerto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPuerto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPuerto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePuerto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPuerto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPuerto.setTitle("Orden");
			this.jInternalFrameOrderByPuerto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPuerto.setResizable(true);
			this.jInternalFrameOrderByPuerto.setClosable(true);
			this.jInternalFrameOrderByPuerto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPuerto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPuerto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPuerto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puertoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPuerto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPuerto.ipady =150;
				
			this.jPanelOrderByPuerto.add(jScrollPanelDatosPuertoOrderBy, this.gridBagConstraintsPuerto);//this.jTableDatosPuertoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPuerto = new JButtonMe();
			this.jButtonCerrarOrderByPuerto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPuerto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPuerto.setToolTipText("Cancelar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPuerto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPuerto.add(this.jButtonCerrarOrderByPuerto, this.gridBagConstraintsPuerto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPuerto = new GridBagLayout();
			
			this.jScrollPanelOrderByPuerto= new JScrollPane(jPanelOrderByPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPuerto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPuerto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPuerto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPuerto);
			
			this.jInternalFrameOrderByPuerto.getContentPane().add(this.jScrollPanelOrderByPuerto, this.gridBagConstraintsPuerto);			
		
		} else {
			this.jButtonAbrirOrderByPuerto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.puertoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPuerto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPuerto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPuerto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPuerto.getRowHeight();//PuertoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPuerto.isSelected()) {
					iHeightTable=PuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPuerto.isSelected()) {
					iHeightTable=PuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPuerto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPuerto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPuerto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPuerto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPuerto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPuerto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPuerto!=null && this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy()!=null) {
			//if(!this.puertoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPuerto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPuerto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPuerto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPuerto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPuerto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPuerto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPuerto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=puertoLogic.getPuertos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puertos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Puerto> TraerPuertoBeans(List<Puerto> puertos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Puerto puerto:puertos) {
					
				if(!(PuertoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PuertoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					puerto.setsDetalleGeneralEntityReporte(PuertoConstantesFunciones.getPuertoDescripcion(puerto));
										
					puerto.setes_local_descripcion(PuertoConstantesFunciones.getes_localDescripcion(puerto));	
					
					

					if(puerto.getPedidoCompraImpors()!=null && Funciones.existeClass(classes,PedidoCompraImpor.class)) {
						try{puerto.setpedidocompraimporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoCompraImporJInternalFrame.TraerPedidoCompraImporBeans(puerto.getPedidoCompraImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(puerto.getLiquidacionImpors()!=null && Funciones.existeClass(classes,LiquidacionImpor.class)) {
						try{puerto.setliquidacionimporsDescripcionReporte(new JRBeanCollectionDataSource(LiquidacionImporJInternalFrame.TraerLiquidacionImporBeans(puerto.getLiquidacionImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(puerto.getEmbarcadors()!=null && Funciones.existeClass(classes,Embarcador.class)) {
						try{puerto.setembarcadorsDescripcionReporte(new JRBeanCollectionDataSource(EmbarcadorJInternalFrame.TraerEmbarcadorBeans(puerto.getEmbarcadors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//puerto.setsDetalleGeneralEntityReporte(puerto.getsDetalleGeneralEntityReporte());
										
				}
				
				//puertobeans.add(puertobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return puertos;
    }
	//PARA REPORTES FIN
}
