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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ProvinciaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ProvinciaJInternalFrame extends ProvinciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProvincia;
	
	protected JMenuBar jmenuBarProvincia;
	
	protected JMenu jmenuProvincia;
	protected JMenu jmenuDatosProvincia;
	protected JMenu jmenuArchivoProvincia;
	protected JMenu jmenuAccionesProvincia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProvincia;	
	protected GridBagConstraints gridBagConstraintsProvincia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProvinciaDetalleFormJInternalFrame jInternalFrameDetalleFormProvincia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProvincia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProvincia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";
	
	public ProvinciaSessionBean provinciaSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Provincia> provincias;		
	public List<Provincia> provinciasEliminados;	
	public List<Provincia> provinciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProvincia;		
	protected JButton jButtonAbrirOrderByProvincia;
	
	
	//protected JPanel jPanelOrderByProvincia;
	//public JScrollPane jScrollPanelOrderByProvincia;	
	//protected JButton jButtonCerrarOrderByProvincia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProvinciaLogic provinciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProvincia;
	public JScrollPane jScrollPanelDatosEdicionProvincia;
	public JScrollPane jScrollPanelDatosGeneralProvincia;
    
	
	
	//public JScrollPane jScrollPanelDatosProvinciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProvincia;
	//public JScrollPane jScrollPanelImportacionProvincia;
	
	
	
	protected JPanel jPanelAccionesProvincia;
	
    protected JPanel jPanelPaginacionProvincia;
    protected JPanel jPanelParametrosReportesProvincia;
	protected JPanel jPanelParametrosReportesAccionesProvincia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Provincia;
	protected JPanel jPanelParametrosAuxiliar2Provincia;
	protected JPanel jPanelParametrosAuxiliar3Provincia;
	protected JPanel jPanelParametrosAuxiliar4Provincia;
	//protected JPanel jPanelParametrosAuxiliar5Provincia;
	
	
	
	//protected JPanel jPanelReporteDinamicoProvincia;
	//protected JPanel jPanelImportacionProvincia;
	
	
	public JTable jTableDatosProvincia;
	
	
	
	//public JTable jTableDatosProvinciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProvincia;
	protected JButton jButtonDuplicarProvincia;
	protected JButton jButtonCopiarProvincia;
	protected JButton jButtonVerFormProvincia;
	protected JButton jButtonNuevoRelacionesProvincia;
	protected JButton jButtonModificarProvincia;
	
    protected JButton jButtonGuardarCambiosTablaProvincia;
	protected JButton jButtonCerrarProvincia;
	
	
	protected JButton jButtonRecargarInformacionProvincia;
	protected JButton jButtonProcesarInformacionProvincia;
	
	
	protected JButton jButtonAnterioresProvincia;
	protected JButton jButtonSiguientesProvincia;
	protected JButton jButtonNuevoGuardarCambiosProvincia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProvincia;
	//protected JButton jButtonCerrarReporteDinamicoProvincia;
	//protected JButton jButtonGenerarExcelReporteDinamicoProvincia;	
	
	
	
	//protected JButton jButtonAbrirImportacionProvincia;
	//protected JButton jButtonGenerarImportacionProvincia;
	//protected JButton jButtonCerrarImportacionProvincia;
	//protected JFileChooser jFileChooserImportacionProvincia;
	//protected File fileImportacionProvincia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProvincia;
	protected JButton jButtonDuplicarToolBarProvincia;
	protected JButton jButtonNuevoRelacionesToolBarProvincia;
	
	
	public JButton jButtonGuardarCambiosToolBarProvincia;
	protected JButton jButtonCopiarToolBarProvincia;
	protected JButton jButtonVerFormToolBarProvincia;
	public JButton jButtonGuardarCambiosTablaToolBarProvincia;
	protected JButton jButtonMostrarOcultarTablaToolBarProvincia;
	protected JButton jButtonCerrarToolBarProvincia;
	
	protected JButton jButtonRecargarInformacionToolBarProvincia;
	protected JButton jButtonProcesarInformacionToolBarProvincia;
	protected JButton jButtonAnterioresToolBarProvincia;
	protected JButton jButtonSiguientesToolBarProvincia;
	protected JButton jButtonNuevoGuardarCambiosToolBarProvincia;
	protected JButton jButtonAbrirOrderByToolBarProvincia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProvincia;
	protected JMenuItem jMenuItemDuplicarProvincia;
	protected JMenuItem jMenuItemNuevoRelacionesProvincia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProvincia;
	protected JMenuItem jMenuItemCopiarProvincia;
	protected JMenuItem jMenuItemVerFormProvincia;
	protected JMenuItem jMenuItemGuardarCambiosTablaProvincia;
	protected JMenuItem jMenuItemCerrarProvincia;
	protected JMenuItem jMenuItemDetalleCerrarProvincia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProvincia;
	protected JMenuItem jMenuItemDetalleMostarOcultarProvincia;
	
	protected JMenuItem jMenuItemRecargarInformacionProvincia;
	protected JMenuItem jMenuItemProcesarInformacionProvincia;
	protected JMenuItem jMenuItemAnterioresProvincia;
	protected JMenuItem jMenuItemSiguientesProvincia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProvincia;
	protected JMenuItem jMenuItemAbrirOrderByProvincia;
	protected JMenuItem jMenuItemMostrarOcultarProvincia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProvincia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProvincia;
	protected JCheckBox jCheckBoxSeleccionadosProvincia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProvincia;
	protected JCheckBox jCheckBoxConGraficoReporteProvincia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProvincia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProvincia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProvincia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProvincia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProvincia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProvincia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProvincia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProvincia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProvincia;
	protected JTextField jTextFieldValorCampoGeneralProvincia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProvincia;
	//public JList<Reporte> jListColumnasSelectReporteProvincia;
	//public JScrollPane jScrollColumnasSelectReporteProvincia;
	
	//public JLabel jLabelRelacionesSelectReporteProvincia;
	//public JList<Reporte> jListRelacionesSelectReporteProvincia;
	//public JScrollPane jScrollRelacionesSelectReporteProvincia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProvincia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProvincia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProvincia;
	//public JLabel jLabelTiposArchivoReporteDinamicoProvincia;
	
		
	//public JLabel jLabelArchivoImportacionProvincia;	
	//public JLabel jLabelPathArchivoImportacionProvincia;
	//protected JTextField jTextFieldPathArchivoImportacionProvincia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProvincia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProvincia;
	
	//public JLabel jLabelColumnaCategoriaValorProvincia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProvincia;
	
	//public JLabel jLabelColumnasValoresGraficoProvincia;
	//public JList<Reporte> jListColumnasValoresGraficoProvincia;
	//public JScrollPane jScrollColumnasValoresGraficoProvincia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProvincia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProvincia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProvincia;
	public JPanel jPanelBusquedaPorIdPaisPorNombreProvincia;
	public JButton jButtonBusquedaPorIdPaisPorNombreProvincia;
	public JPanel jPanelFK_IdPaisProvincia;
	public JButton jButtonFK_IdPaisProvincia;
	
	public JPanel jPanelid_paisBusquedaPorIdPaisPorNombreProvincia;
	public JLabel jLabelid_paisBusquedaPorIdPaisPorNombreProvincia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia;
	public JButton jButtonid_paisBusquedaPorIdPaisPorNombreProvincia= new JButtonMe();
	public JButton jButtonid_paisBusquedaPorIdPaisPorNombreProvinciaUpdate= new JButtonMe();
	public JButton jButtonid_paisBusquedaPorIdPaisPorNombreProvinciaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdPaisPorNombreProvincia;
	public JLabel jLabelnombreBusquedaPorIdPaisPorNombreProvincia;
	public JTextArea jTextAreanombreBusquedaPorIdPaisPorNombreProvincia;
	public JButton jButtonnombreBusquedaPorIdPaisPorNombreProvinciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisProvincia;
	public JLabel jLabelid_paisFK_IdPaisProvincia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisProvincia;
	public JButton jButtonid_paisFK_IdPaisProvincia= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisProvinciaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisProvinciaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProvinciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProvinciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProvincia)	{
		this.jButtonRecargarInformacionProvincia = jButtonRecargarInformacionProvincia;
	}
	
	public JButton getjButtonProcesarInformacionProvincia() {
		return this.jButtonProcesarInformacionProvincia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProvincia)	{
		this.jButtonProcesarInformacionProvincia = jButtonProcesarInformacionProvincia;
	}
	
	
	public JButton getjButtonRecargarInformacionProvincia() {
		return this.jButtonRecargarInformacionProvincia;
	}
	
	
	public List<Provincia> getprovincias() {
		return this.provincias;
	}

	public void setprovincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	public List<Provincia> getprovinciasAux() {
		return this.provinciasAux;
	}

	public void setprovinciasAux(List<Provincia> provinciasAux) {
		this.provinciasAux = provinciasAux;
	}
	
	public List<Provincia> getprovinciasEliminados() {
		return this.provinciasEliminados;
	}

	public void setProvinciasEliminados(List<Provincia> provinciasEliminados) {
		this.provinciasEliminados = provinciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProvincia() {
		return jComboBoxTiposSeleccionarProvincia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProvincia(
			JComboBox jComboBoxTiposSeleccionarProvincia) {
		this.jComboBoxTiposSeleccionarProvincia = jComboBoxTiposSeleccionarProvincia;
	}
	
	public void setBorderResaltarTiposSeleccionarProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProvincia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProvincia() {
		return jTextFieldValorCampoGeneralProvincia;
	}

	public void setjTextFieldValorCampoGeneralProvincia(
			JTextField jTextFieldValorCampoGeneralProvincia) {
		this.jTextFieldValorCampoGeneralProvincia = jTextFieldValorCampoGeneralProvincia;
	}

	public void setBorderResaltarValorCampoGeneralProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProvincia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProvincia() {
		return this.jCheckBoxSeleccionarTodosProvincia;
	}

	public void setjCheckBoxSeleccionarTodosProvincia(
			JCheckBox jCheckBoxSeleccionarTodosProvincia) {
		this.jCheckBoxSeleccionarTodosProvincia = jCheckBoxSeleccionarTodosProvincia;
	}

	public void setBorderResaltarSeleccionarTodosProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProvincia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProvincia() {
		return this.jCheckBoxSeleccionadosProvincia;
	}

	public void setjCheckBoxSeleccionadosProvincia(
			JCheckBox jCheckBoxSeleccionadosProvincia) {
		this.jCheckBoxSeleccionadosProvincia = jCheckBoxSeleccionadosProvincia;
	}
	
	public void setBorderResaltarSeleccionadosProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProvincia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProvincia() {
		return this.jComboBoxTiposArchivosReportesProvincia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProvincia(
			JComboBox jComboBoxTiposArchivosReportesProvincia) {
		this.jComboBoxTiposArchivosReportesProvincia = jComboBoxTiposArchivosReportesProvincia;
	}

	public void setBorderResaltarTiposArchivosReportesProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProvincia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProvincia() {
		return this.jComboBoxTiposReportesProvincia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProvincia(
			JComboBox jComboBoxTiposReportesProvincia) {
		this.jComboBoxTiposReportesProvincia = jComboBoxTiposReportesProvincia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProvincia() {
	//	return jComboBoxTiposReportesDinamicoProvincia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProvincia(
	//		JComboBox jComboBoxTiposReportesDinamicoProvincia) {
	//	this.jComboBoxTiposReportesDinamicoProvincia = jComboBoxTiposReportesDinamicoProvincia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProvincia() {
	//	return jComboBoxTiposArchivosReportesDinamicoProvincia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProvincia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProvincia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProvincia = jComboBoxTiposArchivosReportesDinamicoProvincia;
	//}
	
	public void setBorderResaltarTiposReportesProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProvincia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProvincia() {
		return this.jComboBoxTiposGraficosReportesProvincia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProvincia(
			JComboBox jComboBoxTiposGraficosReportesProvincia) {
		this.jComboBoxTiposGraficosReportesProvincia = jComboBoxTiposGraficosReportesProvincia;
	}
	
	public void setBorderResaltarTiposGraficosReportesProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProvincia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProvincia() {
		return this.jComboBoxTiposPaginacionProvincia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProvincia(
			JComboBox jComboBoxTiposPaginacionProvincia) {
		this.jComboBoxTiposPaginacionProvincia = jComboBoxTiposPaginacionProvincia;
	}
	
	public void setBorderResaltarTiposPaginacionProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProvincia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProvincia() {
		return this.jComboBoxTiposRelacionesProvincia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProvincia() {
		return this.jComboBoxTiposAccionesProvincia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProvincia(
			JComboBox jComboBoxTiposRelacionesProvincia) {
		this.jComboBoxTiposRelacionesProvincia = jComboBoxTiposRelacionesProvincia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProvincia(
			JComboBox jComboBoxTiposAccionesProvincia) {
		this.jComboBoxTiposAccionesProvincia = jComboBoxTiposAccionesProvincia;
	}
	
	public void setBorderResaltarTiposRelacionesProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProvincia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProvincia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProvincia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProvincia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProvincia() {
	//	return jCheckBoxConGraficoDinamicoProvincia;
	//}

	//public void setjCheckBoxConGraficoDinamicoProvincia(
	//		JCheckBox jCheckBoxConGraficoDinamicoProvincia) {
	//	this.jCheckBoxConGraficoDinamicoProvincia = jCheckBoxConGraficoDinamicoProvincia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProvincia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProvincia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProvincia .setBorder(borderResaltar);		
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
		this.provinciaSessionBean=new ProvinciaSessionBean();
		
		this.provinciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.provinciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.provinciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProvinciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Provincia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Provincia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProvincia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProvincia,this.jTtoolBarProvincia,
							"nuevo","nuevo","Nuevo"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProvincia,this.jTtoolBarProvincia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProvincia,this.jTtoolBarProvincia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProvincia,this.jTtoolBarProvincia,
							"duplicar","duplicar","Duplicar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProvincia,this.jTtoolBarProvincia,
							"copiar","copiar","Copiar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProvincia,this.jTtoolBarProvincia,
							"ver_form","ver_form","Ver"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProvincia,this.jTtoolBarProvincia,
							"recargar","recargar","Recargar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProvincia,this.jTtoolBarProvincia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProvincia,this.jTtoolBarProvincia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProvincia,this.jTtoolBarProvincia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProvincia,this.jTtoolBarProvincia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProvincia,this.jTtoolBarProvincia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProvincia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProvincia,this.jTtoolBarProvincia,
							"cerrar","cerrar","Salir"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProvincia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProvincia;
			
				this.jButtonProcesarInformacionToolBarProvincia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProvincia;
				
		//protected JButton jButtonModificarToolBarProvincia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProvincia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProvincia=new JMenuMe("General");
		this.jmenuArchivoProvincia=new JMenuMe("Archivo");
		this.jmenuAccionesProvincia=new JMenuMe("Acciones");
		this.jmenuDatosProvincia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProvincia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProvincia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProvincia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProvincia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProvincia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProvincia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProvincia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProvincia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProvincia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProvincia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProvincia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProvincia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProvincia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProvincia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProvincia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProvincia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProvincia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProvincia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProvincia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProvincia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProvincia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProvincia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProvincia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProvincia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProvincia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProvincia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProvincia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProvincia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProvincia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProvincia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProvincia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProvincia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProvincia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProvincia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProvincia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProvincia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProvincia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProvincia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProvincia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProvincia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProvincia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProvincia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProvincia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProvincia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProvincia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProvincia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProvincia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProvincia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProvincia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProvincia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProvincia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProvincia.add(this.jMenuItemCerrarProvincia);
			
			this.jmenuAccionesProvincia.add(this.jMenuItemNuevoProvincia);
			this.jmenuAccionesProvincia.add(this.jMenuItemNuevoGuardarCambiosProvincia);
			this.jmenuAccionesProvincia.add(this.jMenuItemNuevoRelacionesProvincia);
			this.jmenuAccionesProvincia.add(this.jMenuItemGuardarCambiosTablaProvincia);		
			this.jmenuAccionesProvincia.add(this.jMenuItemDuplicarProvincia);		
			this.jmenuAccionesProvincia.add(this.jMenuItemCopiarProvincia);		
			this.jmenuAccionesProvincia.add(this.jMenuItemVerFormProvincia);		
			
			this.jmenuDatosProvincia.add(this.jMenuItemRecargarInformacionProvincia);				
			this.jmenuDatosProvincia.add(this.jMenuItemAnterioresProvincia);				
			this.jmenuDatosProvincia.add(this.jMenuItemSiguientesProvincia);				
			this.jmenuDatosProvincia.add(this.jMenuItemAbrirOrderByProvincia);				
			this.jmenuDatosProvincia.add(this.jMenuItemMostrarOcultarProvincia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProvincia.add(this.jMenuItemGuardarCambiosProvincia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProvincia.add(this.jmenuArchivoProvincia);		
			this.jmenuBarProvincia.add(this.jmenuAccionesProvincia);		
			this.jmenuBarProvincia.add(this.jmenuDatosProvincia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProvincia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProvincia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdPaisPorNombreProvincia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdPaisPorNombreProvincia.setToolTipText("Buscar Por Pais Por Nombre ");
		this.jButtonBusquedaPorIdPaisPorNombreProvincia= new JButtonMe();
		this.jButtonBusquedaPorIdPaisPorNombreProvincia.setText("Buscar");
		this.jButtonBusquedaPorIdPaisPorNombreProvincia.setToolTipText("Buscar Por Pais Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdPaisPorNombreProvincia,"buscar_button","Buscar Por Pais Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdPaisPorNombreProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisBusquedaPorIdPaisPorNombreProvincia = new JLabelMe();
		jLabelid_paisBusquedaPorIdPaisPorNombreProvincia.setText("Pais :");
		jLabelid_paisBusquedaPorIdPaisPorNombreProvincia.setToolTipText("Pais");
		jLabelid_paisBusquedaPorIdPaisPorNombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaPorIdPaisPorNombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaPorIdPaisPorNombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisBusquedaPorIdPaisPorNombreProvincia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia= new JComboBoxMe();
		jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdPaisPorNombreProvincia = new JLabelMe();
		jLabelnombreBusquedaPorIdPaisPorNombreProvincia.setText("Nombre :");
		jLabelnombreBusquedaPorIdPaisPorNombreProvincia.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdPaisPorNombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdPaisPorNombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdPaisPorNombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdPaisPorNombreProvincia,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorIdPaisPorNombreProvincia= new JTextAreaMe();
		jTextAreanombreBusquedaPorIdPaisPorNombreProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdPaisPorNombreProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdPaisPorNombreProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorIdPaisPorNombreProvincia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisProvincia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisProvincia.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisProvincia= new JButtonMe();
		this.jButtonFK_IdPaisProvincia.setText("Buscar");
		this.jButtonFK_IdPaisProvincia.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisProvincia,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisProvincia = new JLabelMe();
		jLabelid_paisFK_IdPaisProvincia.setText("Pais :");
		jLabelid_paisFK_IdPaisProvincia.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisProvincia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisProvincia= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisProvincia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProvincia=new JTabbedPane();


		this.jTabbedPaneBusquedasProvincia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProvincia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProvincia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProvincia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProvincia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProvincia = new ProvinciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Provincia DATOS");
			this.jInternalFrameDetalleFormProvincia = new ProvinciaDetalleFormJInternalFrame(jDesktopPane,this.provinciaSessionBean.getConGuardarRelaciones(),this.provinciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProvincia = null;//new ProvinciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProvincia= new GridBagLayout();
		
		
		this.jTableDatosProvincia = new JTableMe();      
		
		String sToolTipProvincia="";
		sToolTipProvincia=ProvinciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProvincia+="(Seguridad.Provincia)";
		}
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProvincia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProvincia.setToolTipText(sToolTipProvincia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProvincia);
		this.jTableDatosProvincia.setAutoCreateRowSorter(true);
		this.jTableDatosProvincia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProvincia.setRowSelectionAllowed(true);
		this.jTableDatosProvincia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProvincia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProvincia = new JButtonMe();
		this.jButtonDuplicarProvincia = new JButtonMe();
		this.jButtonCopiarProvincia = new JButtonMe();
		this.jButtonVerFormProvincia = new JButtonMe();
		this.jButtonNuevoRelacionesProvincia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProvincia = new JButtonMe();
		this.jButtonCerrarProvincia = new JButtonMe();
		
		this.jScrollPanelDatosProvincia = new JScrollPane();   
        this.jScrollPanelDatosGeneralProvincia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Provincia";
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provinciaes" + this.sPath));
		} else {
			this.jScrollPanelDatosProvincia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProvincia.setToolTipText("Acciones");
        this.jPanelAccionesProvincia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProvincia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProvincia=new ReporteDinamicoJInternalFrame(ProvinciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProvincia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProvincia=new ImportacionJInternalFrame(ProvinciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProvincia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProvincia = new JButtonMe();
		
		this.jButtonAbrirOrderByProvincia.setText("Orden");
		this.jButtonAbrirOrderByProvincia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProvincia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProvincia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvincia,false,this);
			
			//this.cargarOrderByProvincia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProvincia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvincia,true,this);
			
			//this.cargarOrderByProvincia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProvincia.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProvincia.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProvincia.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProvincia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProvincia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProvincia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProvincia.setText("Nuevo");
		this.jButtonDuplicarProvincia.setText("Duplicar");
		this.jButtonCopiarProvincia.setText("Copiar");
		this.jButtonVerFormProvincia.setText("Ver");
		this.jButtonNuevoRelacionesProvincia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProvincia.setText("Guardar");
		this.jButtonCerrarProvincia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProvincia,"nuevo_button","Nuevo",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProvincia,"duplicar_button","Duplicar",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProvincia,"copiar_button","Copiar",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProvincia,"ver_form","Ver",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProvincia,"nuevorelaciones_button","Nuevo Rel",this.provinciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProvincia,"guardarcambiostabla_button","Guardar",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProvincia,"cerrar_button","Salir",this.provinciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProvincia.setToolTipText("Nuevo"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProvincia.setToolTipText("Duplicar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProvincia.setToolTipText("Copiar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProvincia.setToolTipText("Ver"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProvincia.setToolTipText("Nuevo Rel"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProvincia.setToolTipText("Guardar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProvincia.setToolTipText("Salir"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProvincia";
		inputMap = this.jButtonNuevoProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProvincia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProvincia"));
		
		//DUPLICAR
		sMapKey = "DuplicarProvincia";
		inputMap = this.jButtonDuplicarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProvincia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProvincia"));
		
		//COPIAR
		sMapKey = "CopiarProvincia";
		inputMap = this.jButtonCopiarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProvincia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProvincia"));
		
		//VEr FORM
		sMapKey = "VerFormProvincia";
		inputMap = this.jButtonVerFormProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProvincia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProvincia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProvincia";
		inputMap = this.jButtonNuevoRelacionesProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProvincia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProvincia";
		inputMap = this.jButtonModificarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProvincia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProvincia";
		inputMap = this.jButtonCerrarProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProvincia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProvincia";
		inputMap = this.jButtonGuardarCambiosTablaProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProvincia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Provincia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Provincia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Provincia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Provincia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Provincia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProvincia.setName("jPanelParametrosReportesProvincia"); 
		
		this.jPanelParametrosReportesAccionesProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProvincia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProvincia.setName("jPanelParametrosReportesAccionesProvincia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProvincia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProvincia = new JButtonMe();
		this.jButtonRecargarInformacionProvincia.setText("Recargar");
		this.jButtonRecargarInformacionProvincia.setToolTipText("Recargar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProvincia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProvincia = new JButtonMe();
		this.jButtonProcesarInformacionProvincia.setText("Procesar");
		this.jButtonProcesarInformacionProvincia.setToolTipText("Procesar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProvincia.setVisible(false);
			
		this.jButtonProcesarInformacionProvincia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProvincia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProvincia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProvincia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProvincia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProvincia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProvincia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProvincia.setText("TIPO");       
		this.jComboBoxTiposReportesProvincia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProvincia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProvincia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProvincia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProvincia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProvincia.setText("Paginacion");
		this.jComboBoxTiposPaginacionProvincia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProvincia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProvincia.setText("Accion");
		this.jComboBoxTiposRelacionesProvincia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProvincia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProvincia.setText("Accion");
		this.jComboBoxTiposAccionesProvincia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProvincia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProvincia.setText("Accion");
		this.jComboBoxTiposSeleccionarProvincia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProvincia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProvincia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProvincia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProvincia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProvincia = new JLabelMe();
		
		this.jLabelAccionesProvincia.setText("Acciones");		
		this.jLabelAccionesProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProvincia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProvincia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProvincia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProvincia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProvincia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProvincia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProvincia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProvincia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProvincia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProvincia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProvincia.setText("Graf.");
		this.jCheckBoxConGraficoReporteProvincia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProvincia = new JButtonMe();
		//this.jButtonAnterioresProvincia.setText("<<");
        this.jButtonAnterioresProvincia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProvincia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProvincia = new JButtonMe();
		//this.jButtonSiguientesProvincia.setText(">>");
        this.jButtonSiguientesProvincia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProvincia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProvincia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProvincia.setText("Nue");
        this.jButtonNuevoGuardarCambiosProvincia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProvincia,"nuevoguardarcambios_button","Nue",this.provinciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProvincia";
		inputMap = this.jButtonNuevoGuardarCambiosProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProvincia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProvincia";
		inputMap = this.jButtonRecargarInformacionProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProvincia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProvincia";
		inputMap = this.jButtonSiguientesProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProvincia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProvincia";
		inputMap = this.jButtonAnterioresProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProvincia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProvincia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProvincia.setMinimumSize(new Dimension(this.getWidth(),ProvinciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProvinciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProvincia.setMaximumSize(new Dimension(this.getWidth(),ProvinciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProvinciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProvincia.setPreferredSize(new Dimension(this.getWidth(),ProvinciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProvinciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProvincia = new GridBagLayout();

			this.jPanelPaginacionProvincia.setLayout(gridaBagLayoutPaginacionProvincia);						
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 0;
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProvincia.add(this.jButtonAnterioresProvincia, this.gridBagConstraintsProvincia);
					
						
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProvincia.gridy = 0;
			
			this.jPanelPaginacionProvincia.add(this.jButtonNuevoGuardarCambiosProvincia, this.gridBagConstraintsProvincia);
						
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProvincia.gridy = 0;
			this.jPanelPaginacionProvincia.add(this.jButtonSiguientesProvincia, this.gridBagConstraintsProvincia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 1;
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvincia.add(this.jButtonNuevoProvincia, this.gridBagConstraintsProvincia);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsProvincia = new GridBagConstraints();
				this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProvincia.gridy = 1;
				this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionProvincia.add(this.jButtonNuevoRelacionesProvincia, this.gridBagConstraintsProvincia);
			}
			
			
			if(!this.provinciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProvincia = new GridBagConstraints();
				this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProvincia.gridy = 1;
				this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProvincia.add(this.jButtonGuardarCambiosTablaProvincia, this.gridBagConstraintsProvincia);
			}
			
			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 1;
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvincia.add(this.jButtonDuplicarProvincia, this.gridBagConstraintsProvincia);
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 1;
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvincia.add(this.jButtonCopiarProvincia, this.gridBagConstraintsProvincia);
		
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 1;
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProvincia.add(this.jButtonVerFormProvincia, this.gridBagConstraintsProvincia);
		
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 1;
			this.gridBagConstraintsProvincia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProvincia.add(this.jButtonCerrarProvincia, this.gridBagConstraintsProvincia);
		
		
		
		this.jButtonRecargarInformacionProvincia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProvincia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProvincia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProvincia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProvincia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProvincia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProvincia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProvincia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProvincia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProvincia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProvincia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProvincia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProvincia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProvincia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProvincia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProvincia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProvincia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProvincia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProvincia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProvincia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvincia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProvincia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProvincia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProvincia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProvincia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProvincia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProvincia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProvincia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProvincia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProvincia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProvincia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProvincia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProvincia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProvincia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProvincia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProvincia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProvincia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProvincia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProvincia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProvincia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Provincia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Provincia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Provincia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Provincia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProvincia.setLayout(gridaBagParametrosReportesProvincia);
			this.jPanelParametrosReportesAccionesProvincia.setLayout(gridaBagParametrosReportesAccionesProvincia);
			
			
			this.jPanelParametrosAuxiliar1Provincia.setLayout(gridaBagParametrosAuxiliar1Provincia);
			this.jPanelParametrosAuxiliar2Provincia.setLayout(gridaBagParametrosAuxiliar2Provincia);
			this.jPanelParametrosAuxiliar3Provincia.setLayout(gridaBagParametrosAuxiliar3Provincia);
			this.jPanelParametrosAuxiliar4Provincia.setLayout(gridaBagParametrosAuxiliar4Provincia);
			//this.jPanelParametrosAuxiliar5Provincia.setLayout(gridaBagParametrosAuxiliar2Provincia);			
			
			
			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvincia.add(this.jButtonRecargarInformacionProvincia, this.gridBagConstraintsProvincia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Provincia.add(this.jComboBoxTiposPaginacionProvincia, this.gridBagConstraintsProvincia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Provincia.add(this.jCheckBoxConAltoMaximoTablaProvincia, this.gridBagConstraintsProvincia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Provincia.add(this.jComboBoxTiposArchivosReportesProvincia, this.gridBagConstraintsProvincia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvincia.add(this.jPanelParametrosAuxiliar1Provincia, this.gridBagConstraintsProvincia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvincia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Provincia.add(this.jComboBoxTiposReportesProvincia, this.gridBagConstraintsProvincia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvincia.add(this.jPanelParametrosAuxiliar4Provincia, this.gridBagConstraintsProvincia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvincia.add(this.jComboBoxTiposReportesProvincia, this.gridBagConstraintsProvincia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvincia.add(this.jCheckBoxGenerarReporteProvincia, this.gridBagConstraintsProvincia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvincia.add(this.jPanelParametrosAuxiliar2Provincia, this.gridBagConstraintsProvincia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvincia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvincia.add(this.jLabelAccionesProvincia, this.gridBagConstraintsProvincia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProvincia = new GridBagConstraints();
				this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProvincia.add(this.jButtonAbrirOrderByProvincia, this.gridBagConstraintsProvincia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvincia.add(this.jComboBoxTiposSeleccionarProvincia, this.gridBagConstraintsProvincia);			
			
			
			/*
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProvincia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProvincia.add(this.jCheckBoxSeleccionarTodosProvincia, this.gridBagConstraintsProvincia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvincia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Provincia.add(this.jCheckBoxSeleccionarTodosProvincia, this.gridBagConstraintsProvincia);															
				
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProvincia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Provincia.add(this.jCheckBoxSeleccionadosProvincia, this.gridBagConstraintsProvincia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProvincia.add(this.jPanelParametrosAuxiliar3Provincia, this.gridBagConstraintsProvincia);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvincia.add(this.jComboBoxTiposRelacionesProvincia, this.gridBagConstraintsProvincia);
				
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvincia.add(this.jComboBoxTiposAccionesProvincia, this.gridBagConstraintsProvincia);
	
				
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProvincia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProvincia.add(this.jTextFieldValorCampoGeneralProvincia, this.gridBagConstraintsProvincia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProvincia = new GridBagLayout();

			this.jScrollPanelDatosProvincia.setLayout(gridaBagLayoutDatosProvincia);
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = 0;
			this.gridBagConstraintsProvincia.gridx = 0;
			
			this.jScrollPanelDatosProvincia.add(this.jTableDatosProvincia, this.gridBagConstraintsProvincia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProvincia.setViewportView(this.jTableDatosProvincia);
		this.jTableDatosProvincia.setFillsViewportHeight(true);
		this.jTableDatosProvincia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProvincia= new GridBagLayout();
		this.jPanelAccionesProvincia.setLayout(gridaBagLayoutAccionesProvincia);
		
		
		/*	
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = 0;
		this.gridBagConstraintsProvincia.gridx = 0;
			
		this.jPanelAccionesProvincia.add(this.jButtonNuevoProvincia, this.gridBagConstraintsProvincia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdPaisPorNombreProvincia= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdPaisPorNombreProvincia.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdPaisPorNombreProvincia.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdPaisPorNombreProvincia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdPaisPorNombreProvincia.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdPaisPorNombreProvincia.setLayout(gridaBagLayoutBusquedaPorIdPaisPorNombreProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 0;
		gridBagConstraintsProvincia.gridx = 0;
		jPanelBusquedaPorIdPaisPorNombreProvincia.add(jLabelid_paisBusquedaPorIdPaisPorNombreProvincia, gridBagConstraintsProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 0;
		gridBagConstraintsProvincia.gridx = 1;
		jPanelBusquedaPorIdPaisPorNombreProvincia.add(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia, gridBagConstraintsProvincia);


		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 1;
		gridBagConstraintsProvincia.gridx = 0;
		jPanelBusquedaPorIdPaisPorNombreProvincia.add(jLabelnombreBusquedaPorIdPaisPorNombreProvincia, gridBagConstraintsProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 1;
		gridBagConstraintsProvincia.gridx = 1;
		jPanelBusquedaPorIdPaisPorNombreProvincia.add(jTextAreanombreBusquedaPorIdPaisPorNombreProvincia, gridBagConstraintsProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 2;
		gridBagConstraintsProvincia.gridx =1;
		jPanelBusquedaPorIdPaisPorNombreProvincia.add(jButtonBusquedaPorIdPaisPorNombreProvincia, gridBagConstraintsProvincia);

		jTabbedPaneBusquedasProvincia.addTab("1.-Por Pais Por Nombre ", jPanelBusquedaPorIdPaisPorNombreProvincia);
		jTabbedPaneBusquedasProvincia.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisProvincia= new GridBagLayout();
		gridaBagLayoutFK_IdPaisProvincia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisProvincia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisProvincia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisProvincia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisProvincia.setLayout(gridaBagLayoutFK_IdPaisProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 0;
		gridBagConstraintsProvincia.gridx = 0;
		jPanelFK_IdPaisProvincia.add(jLabelid_paisFK_IdPaisProvincia, gridBagConstraintsProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 0;
		gridBagConstraintsProvincia.gridx = 1;
		jPanelFK_IdPaisProvincia.add(jComboBoxid_paisFK_IdPaisProvincia, gridBagConstraintsProvincia);

		gridBagConstraintsProvincia = new GridBagConstraints();
		gridBagConstraintsProvincia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProvincia.gridy = 1;
		gridBagConstraintsProvincia.gridx =1;
		jPanelFK_IdPaisProvincia.add(jButtonFK_IdPaisProvincia, gridBagConstraintsProvincia);

		jTabbedPaneBusquedasProvincia.addTab("2.-Por Pais ", jPanelFK_IdPaisProvincia);
		jTabbedPaneBusquedasProvincia.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProvincia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProvincia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProvincia = new GridBagConstraints();						
			this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProvincia.gridx = 0;		
			//this.gridBagConstraintsProvincia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProvincia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProvincia, this.gridBagConstraintsProvincia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProvincia.gridx = 0;		
		//this.gridBagConstraintsProvincia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProvincia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProvincia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProvincia.gridx = 0;		
			this.gridBagConstraintsProvincia.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProvincia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProvincia, this.gridBagConstraintsProvincia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProvincia, this.gridBagConstraintsProvincia);								
		
		
		/*
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProvincia, this.gridBagConstraintsProvincia);
		*/		
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProvincia.gridx =0;
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProvincia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProvincia, this.gridBagConstraintsProvincia);
				
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProvincia, this.gridBagConstraintsProvincia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProvincia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProvincia = new GridBagLayout();
			this.jPanelBusquedasParametrosProvincia.setLayout(gridaBagLayoutBusquedasParametrosProvincia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProvincia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProvincia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvincia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProvincia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProvincia, this.gridBagConstraintsProvincia);
			
			
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProvincia, this.gridBagConstraintsProvincia);
		
			
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProvincia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProvincia, this.gridBagConstraintsProvincia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProvincia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProvincia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProvincia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProvincia.setName("jPanelReporteDinamicoProvincia"); 
		
		this.jPanelReporteDinamicoProvincia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProvincia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProvincia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProvincia.setLayout(gridaBagLayoutReporteDinamicoProvincia);
		
		
		this.jInternalFrameReporteDinamicoProvincia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProvincia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProvincia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProvincia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProvincia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProvincia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProvincia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProvincia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProvincia.setResizable(true);
	    this.jInternalFrameReporteDinamicoProvincia.setClosable(true);
	    this.jInternalFrameReporteDinamicoProvincia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProvincia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProvincia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProvincia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provinciaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProvincia = new JLabelMe();

		this.jLabelColumnasSelectReporteProvincia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProvincia.add(this.jLabelColumnasSelectReporteProvincia, this.gridBagConstraintsProvincia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProvincia = new JList<Reporte>();
		this.jListColumnasSelectReporteProvincia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProvincia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProvincia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProvincia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProvincia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProvincia=new JScrollPane(this.jListColumnasSelectReporteProvincia);
			
			this.jScrollColumnasSelectReporteProvincia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProvincia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProvincia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProvincia.add(this.jListColumnasSelectReporteProvincia, this.gridBagConstraintsProvincia);
		this.jPanelReporteDinamicoProvincia.add(this.jScrollColumnasSelectReporteProvincia, this.gridBagConstraintsProvincia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProvincia = new JLabelMe();

		this.jLabelRelacionesSelectReporteProvincia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProvincia.add(this.jLabelRelacionesSelectReporteProvincia, this.gridBagConstraintsProvincia);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProvincia = new JList<Reporte>();
		this.jListRelacionesSelectReporteProvincia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProvincia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProvincia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProvincia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProvincia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProvincia=new JScrollPane(this.jListRelacionesSelectReporteProvincia);
			
			this.jScrollRelacionesSelectReporteProvincia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProvincia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProvincia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProvincia.add(this.jListRelacionesSelectReporteProvincia, this.gridBagConstraintsProvincia);
		this.jPanelReporteDinamicoProvincia.add(this.jScrollRelacionesSelectReporteProvincia, this.gridBagConstraintsProvincia);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoProvincia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProvincia = new JComboBoxMe();
		this.jListColumnasValoresGraficoProvincia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProvincia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProvincia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProvincia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProvincia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProvincia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProvincia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProvincia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProvincia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProvincia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProvincia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProvincia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProvincia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvincia.add(this.jLabelGenerarExcelReporteDinamicoProvincia, this.gridBagConstraintsProvincia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProvincia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProvincia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProvincia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProvincia.setToolTipText("Generar EXCEL"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProvincia = new GridBagConstraints();
		//this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProvincia.add(this.jButtonGenerarExcelReporteDinamicoProvincia, this.gridBagConstraintsProvincia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvincia.add(this.jComboBoxTiposReportesDinamicoProvincia, this.gridBagConstraintsProvincia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProvincia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProvincia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProvincia.add(this.jLabelTiposArchivoReporteDinamicoProvincia, this.gridBagConstraintsProvincia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvincia.add(this.jComboBoxTiposArchivosReportesDinamicoProvincia, this.gridBagConstraintsProvincia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProvincia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProvincia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProvincia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProvincia.setToolTipText("Generar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvincia.add(this.jButtonGenerarReporteDinamicoProvincia, this.gridBagConstraintsProvincia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProvincia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProvincia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProvincia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProvincia.setToolTipText("Cancelar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProvincia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProvincia.add(this.jButtonCerrarReporteDinamicoProvincia, this.gridBagConstraintsProvincia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProvincia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProvincia= new JScrollPane(jPanelReporteDinamicoProvincia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProvincia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProvincia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProvincia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provinciaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProvincia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProvincia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProvincia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProvincia);
		this.jInternalFrameReporteDinamicoProvincia.getContentPane().add(this.jScrollPanelReporteDinamicoProvincia, this.gridBagConstraintsProvincia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProvincia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProvincia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProvincia.setName("jPanelImportacionProvincia"); 
		
		this.jPanelImportacionProvincia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProvincia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProvincia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProvincia.setLayout(gridaBagLayoutImportacionProvincia);
		
		
		this.jInternalFrameImportacionProvincia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProvincia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProvincia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProvincia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProvincia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProvincia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProvincia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProvincia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProvincia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProvincia.setResizable(true);
	    this.jInternalFrameImportacionProvincia.setClosable(true);
	    this.jInternalFrameImportacionProvincia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProvincia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProvincia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProvincia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProvincia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProvincia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProvincia.setResizable(true);
	    this.jInternalFrameImportacionProvincia.setClosable(true);
	    this.jInternalFrameImportacionProvincia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProvincia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProvincia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProvincia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provinciaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProvincia = new JLabelMe();

		this.jLabelArchivoImportacionProvincia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYImportacion;		
		this.gridBagConstraintsProvincia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProvincia.add(this.jLabelArchivoImportacionProvincia, this.gridBagConstraintsProvincia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProvincia = new JFileChooser();		
		this.jFileChooserImportacionProvincia.setToolTipText("ESCOGER ARCHIVO"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProvincia = new JButtonMe();
		this.jButtonAbrirImportacionProvincia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProvincia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProvincia.setToolTipText("Generar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYImportacion;
		this.gridBagConstraintsProvincia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvincia.add(this.jButtonAbrirImportacionProvincia, this.gridBagConstraintsProvincia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProvincia = new JLabelMe();

		this.jLabelPathArchivoImportacionProvincia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProvincia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProvincia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProvincia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProvincia.gridy = iPosYImportacion;		
		this.gridBagConstraintsProvincia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProvincia.add(this.jLabelPathArchivoImportacionProvincia, this.gridBagConstraintsProvincia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProvincia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProvincia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProvincia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProvincia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYImportacion;
		this.gridBagConstraintsProvincia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvincia.add(this.jTextFieldPathArchivoImportacionProvincia, this.gridBagConstraintsProvincia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProvincia = new JButtonMe();
		this.jButtonGenerarImportacionProvincia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProvincia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProvincia.setToolTipText("Generar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYImportacion;
		this.gridBagConstraintsProvincia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvincia.add(this.jButtonGenerarImportacionProvincia, this.gridBagConstraintsProvincia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProvincia = new JButtonMe();
		this.jButtonCerrarImportacionProvincia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProvincia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProvincia.setToolTipText("Cancelar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProvincia.gridy = iPosYImportacion;
		this.gridBagConstraintsProvincia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProvincia.add(this.jButtonCerrarImportacionProvincia, this.gridBagConstraintsProvincia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProvincia = new GridBagLayout();
		
		this.jScrollPanelImportacionProvincia= new JScrollPane(jPanelImportacionProvincia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProvincia = new GridBagConstraints();
		this.gridBagConstraintsProvincia.gridy =iPosYImportacion;
		this.gridBagConstraintsProvincia.gridx =iPosXImportacion;
		this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProvincia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProvincia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProvincia);
		this.jInternalFrameImportacionProvincia.getContentPane().add(this.jScrollPanelImportacionProvincia, this.gridBagConstraintsProvincia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProvincia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProvincia = new JButtonMe();
			this.jButtonAbrirOrderByProvincia.setText("Orden");
			this.jButtonAbrirOrderByProvincia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProvincia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProvincia";
			inputMap = this.jButtonAbrirOrderByProvincia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProvincia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProvincia"));
		
		
			GridBagLayout gridaBagLayoutOrderByProvincia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProvincia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProvincia.setName("jPanelOrderByProvincia"); 
			
			this.jPanelOrderByProvincia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProvincia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProvincia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProvincia.setLayout(gridaBagLayoutOrderByProvincia);
			
			
			this.jTableDatosProvinciaOrderBy = new JTableMe();        
			this.jTableDatosProvinciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProvinciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProvinciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProvinciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProvinciaOrderBy.setViewportView(this.jTableDatosProvinciaOrderBy);
			this.jTableDatosProvinciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProvinciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProvincia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProvincia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProvincia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProvincia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProvincia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProvincia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProvincia.setTitle("Orden");
			this.jInternalFrameOrderByProvincia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProvincia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProvincia.setResizable(true);
			this.jInternalFrameOrderByProvincia.setClosable(true);
			this.jInternalFrameOrderByProvincia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProvincia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProvincia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProvincia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Provinciaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProvincia.gridx =iPosXOrderBy;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProvincia.ipady =150;
				
			this.jPanelOrderByProvincia.add(jScrollPanelDatosProvinciaOrderBy, this.gridBagConstraintsProvincia);//this.jTableDatosProvinciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProvincia = new JButtonMe();
			this.jButtonCerrarOrderByProvincia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProvincia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProvincia.setToolTipText("Cancelar"+" "+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProvincia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProvincia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProvincia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProvincia.add(this.jButtonCerrarOrderByProvincia, this.gridBagConstraintsProvincia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProvincia = new GridBagLayout();
			
			this.jScrollPanelOrderByProvincia= new JScrollPane(jPanelOrderByProvincia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProvincia = new GridBagConstraints();
			this.gridBagConstraintsProvincia.gridy =iPosYOrderBy;
			this.gridBagConstraintsProvincia.gridx =iPosXOrderBy;
			this.gridBagConstraintsProvincia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProvincia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProvincia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProvincia);
			
			this.jInternalFrameOrderByProvincia.getContentPane().add(this.jScrollPanelOrderByProvincia, this.gridBagConstraintsProvincia);			
		
		} else {
			this.jButtonAbrirOrderByProvincia = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=700;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.provinciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProvincia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProvincia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProvincia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProvincia.getRowHeight();//ProvinciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProvinciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProvincia.isSelected()) {
					iHeightTable=ProvinciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProvinciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProvinciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProvinciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProvincia.isSelected()) {
					iHeightTable=ProvinciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProvinciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProvinciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProvincia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProvincia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProvincia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProvincia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProvincia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProvincia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProvincia!=null && this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy()!=null) {
			//if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProvincia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProvincia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProvincia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProvincia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProvincia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProvincia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=provinciaLogic.getProvincias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=provincias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Provincia> TraerProvinciaBeans(List<Provincia> provincias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Provincia provincia:provincias) {
					
				if(!(ProvinciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProvinciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					provincia.setsDetalleGeneralEntityReporte(ProvinciaConstantesFunciones.getProvinciaDescripcion(provincia));
										
						
					
					

					if(provincia.getCiudads()!=null && Funciones.existeClass(classes,Ciudad.class)) {
						try{provincia.setciudadsDescripcionReporte(new JRBeanCollectionDataSource(CiudadJInternalFrame.TraerCiudadBeans(provincia.getCiudads(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(provincia.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{provincia.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(provincia.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(provincia.getCantons()!=null && Funciones.existeClass(classes,Canton.class)) {
						try{provincia.setcantonsDescripcionReporte(new JRBeanCollectionDataSource(CantonJInternalFrame.TraerCantonBeans(provincia.getCantons(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(provincia.getBarrios()!=null && Funciones.existeClass(classes,Barrio.class)) {
						try{provincia.setbarriosDescripcionReporte(new JRBeanCollectionDataSource(BarrioJInternalFrame.TraerBarrioBeans(provincia.getBarrios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(provincia.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{provincia.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(provincia.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(provincia.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{provincia.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(provincia.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(provincia.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{provincia.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(provincia.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//provincia.setsDetalleGeneralEntityReporte(provincia.getsDetalleGeneralEntityReporte());
										
				}
				
				//provinciabeans.add(provinciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return provincias;
    }
	//PARA REPORTES FIN
}
