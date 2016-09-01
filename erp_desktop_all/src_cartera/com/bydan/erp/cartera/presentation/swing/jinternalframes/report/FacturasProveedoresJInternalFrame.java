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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.FacturasProveedoresConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class FacturasProveedoresJInternalFrame extends FacturasProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturasProveedores;
	
	protected JMenuBar jmenuBarFacturasProveedores;
	
	protected JMenu jmenuFacturasProveedores;
	protected JMenu jmenuDatosFacturasProveedores;
	protected JMenu jmenuArchivoFacturasProveedores;
	protected JMenu jmenuAccionesFacturasProveedores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturasProveedores;	
	protected GridBagConstraints gridBagConstraintsFacturasProveedores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturasProveedoresDetalleFormJInternalFrame jInternalFrameDetalleFormFacturasProveedores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturasProveedores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturasProveedores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public FacturasProveedoresSessionBean facturasproveedoresSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturasProveedores> facturasproveedoress;		
	public List<FacturasProveedores> facturasproveedoressEliminados;	
	public List<FacturasProveedores> facturasproveedoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturasProveedores;		
	protected JButton jButtonAbrirOrderByFacturasProveedores;
	
	
	//protected JPanel jPanelOrderByFacturasProveedores;
	//public JScrollPane jScrollPanelOrderByFacturasProveedores;	
	//protected JButton jButtonCerrarOrderByFacturasProveedores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturasProveedoresLogic facturasproveedoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturasProveedores;
	public JScrollPane jScrollPanelDatosEdicionFacturasProveedores;
	public JScrollPane jScrollPanelDatosGeneralFacturasProveedores;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturasProveedoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturasProveedores;
	//public JScrollPane jScrollPanelImportacionFacturasProveedores;
	
	
	
	protected JPanel jPanelAccionesFacturasProveedores;
	
    protected JPanel jPanelPaginacionFacturasProveedores;
    protected JPanel jPanelParametrosReportesFacturasProveedores;
	protected JPanel jPanelParametrosReportesAccionesFacturasProveedores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar2FacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar3FacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar4FacturasProveedores;
	//protected JPanel jPanelParametrosAuxiliar5FacturasProveedores;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturasProveedores;
	//protected JPanel jPanelImportacionFacturasProveedores;
	
	
	public JTable jTableDatosFacturasProveedores;
	
	
	
	//public JTable jTableDatosFacturasProveedoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturasProveedores;
	protected JButton jButtonDuplicarFacturasProveedores;
	protected JButton jButtonCopiarFacturasProveedores;
	protected JButton jButtonVerFormFacturasProveedores;
	protected JButton jButtonNuevoRelacionesFacturasProveedores;
	protected JButton jButtonModificarFacturasProveedores;
	
    protected JButton jButtonGuardarCambiosTablaFacturasProveedores;
	protected JButton jButtonCerrarFacturasProveedores;
	
	
	protected JButton jButtonRecargarInformacionFacturasProveedores;
	protected JButton jButtonProcesarInformacionFacturasProveedores;
	
	
	protected JButton jButtonAnterioresFacturasProveedores;
	protected JButton jButtonSiguientesFacturasProveedores;
	protected JButton jButtonNuevoGuardarCambiosFacturasProveedores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturasProveedores;
	//protected JButton jButtonCerrarReporteDinamicoFacturasProveedores;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturasProveedores;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturasProveedores;
	//protected JButton jButtonGenerarImportacionFacturasProveedores;
	//protected JButton jButtonCerrarImportacionFacturasProveedores;
	//protected JFileChooser jFileChooserImportacionFacturasProveedores;
	//protected File fileImportacionFacturasProveedores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturasProveedores;
	protected JButton jButtonDuplicarToolBarFacturasProveedores;
	protected JButton jButtonNuevoRelacionesToolBarFacturasProveedores;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturasProveedores;
	protected JButton jButtonCopiarToolBarFacturasProveedores;
	protected JButton jButtonVerFormToolBarFacturasProveedores;
	public JButton jButtonGuardarCambiosTablaToolBarFacturasProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturasProveedores;
	protected JButton jButtonCerrarToolBarFacturasProveedores;
	
	protected JButton jButtonRecargarInformacionToolBarFacturasProveedores;
	protected JButton jButtonProcesarInformacionToolBarFacturasProveedores;
	protected JButton jButtonAnterioresToolBarFacturasProveedores;
	protected JButton jButtonSiguientesToolBarFacturasProveedores;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturasProveedores;
	protected JButton jButtonAbrirOrderByToolBarFacturasProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturasProveedores;
	protected JMenuItem jMenuItemDuplicarFacturasProveedores;
	protected JMenuItem jMenuItemNuevoRelacionesFacturasProveedores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturasProveedores;
	protected JMenuItem jMenuItemCopiarFacturasProveedores;
	protected JMenuItem jMenuItemVerFormFacturasProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturasProveedores;
	protected JMenuItem jMenuItemCerrarFacturasProveedores;
	protected JMenuItem jMenuItemDetalleCerrarFacturasProveedores;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturasProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturasProveedores;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturasProveedores;
	protected JMenuItem jMenuItemProcesarInformacionFacturasProveedores;
	protected JMenuItem jMenuItemAnterioresFacturasProveedores;
	protected JMenuItem jMenuItemSiguientesFacturasProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturasProveedores;
	protected JMenuItem jMenuItemAbrirOrderByFacturasProveedores;
	protected JMenuItem jMenuItemMostrarOcultarFacturasProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturasProveedores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturasProveedores;
	protected JCheckBox jCheckBoxSeleccionadosFacturasProveedores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturasProveedores;
	protected JCheckBox jCheckBoxConGraficoReporteFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturasProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturasProveedores;
	protected JTextField jTextFieldValorCampoGeneralFacturasProveedores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturasProveedores;
	//public JList<Reporte> jListColumnasSelectReporteFacturasProveedores;
	//public JScrollPane jScrollColumnasSelectReporteFacturasProveedores;
	
	//public JLabel jLabelRelacionesSelectReporteFacturasProveedores;
	//public JList<Reporte> jListRelacionesSelectReporteFacturasProveedores;
	//public JScrollPane jScrollRelacionesSelectReporteFacturasProveedores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturasProveedores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturasProveedores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturasProveedores;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturasProveedores;
	
		
	//public JLabel jLabelArchivoImportacionFacturasProveedores;	
	//public JLabel jLabelPathArchivoImportacionFacturasProveedores;
	//protected JTextField jTextFieldPathArchivoImportacionFacturasProveedores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturasProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturasProveedores;
	
	//public JLabel jLabelColumnaCategoriaValorFacturasProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturasProveedores;
	
	//public JLabel jLabelColumnasValoresGraficoFacturasProveedores;
	//public JList<Reporte> jListColumnasValoresGraficoFacturasProveedores;
	//public JScrollPane jScrollColumnasValoresGraficoFacturasProveedores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturasProveedores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturasProveedores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturasProveedores;
	public JPanel jPanelBusquedaFacturasProveedoresFacturasProveedores;
	public JButton jButtonBusquedaFacturasProveedoresFacturasProveedores;
	
	public JPanel jPanelid_clienteBusquedaFacturasProveedoresFacturasProveedores;
	public JLabel jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores;
	public JButton jButtonid_clienteBusquedaFacturasProveedoresFacturasProveedores= new JButtonMe();
	public JButton jButtonid_clienteBusquedaFacturasProveedoresFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_clienteBusquedaFacturasProveedoresFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores;
	public JLabel jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores;
	public JButton jButtonfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores;
	public JLabel jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores;
	public JButton jButtonfecha_emision_finBusquedaFacturasProveedoresFacturasProveedoresBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public FacturasProveedoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturasProveedoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturasProveedores)	{
		this.jButtonRecargarInformacionFacturasProveedores = jButtonRecargarInformacionFacturasProveedores;
	}
	
	public JButton getjButtonProcesarInformacionFacturasProveedores() {
		return this.jButtonProcesarInformacionFacturasProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturasProveedores)	{
		this.jButtonProcesarInformacionFacturasProveedores = jButtonProcesarInformacionFacturasProveedores;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturasProveedores() {
		return this.jButtonRecargarInformacionFacturasProveedores;
	}
	
	
	public List<FacturasProveedores> getfacturasproveedoress() {
		return this.facturasproveedoress;
	}

	public void setfacturasproveedoress(List<FacturasProveedores> facturasproveedoress) {
		this.facturasproveedoress = facturasproveedoress;
	}
	
	public List<FacturasProveedores> getfacturasproveedoressAux() {
		return this.facturasproveedoressAux;
	}

	public void setfacturasproveedoressAux(List<FacturasProveedores> facturasproveedoressAux) {
		this.facturasproveedoressAux = facturasproveedoressAux;
	}
	
	public List<FacturasProveedores> getfacturasproveedoressEliminados() {
		return this.facturasproveedoressEliminados;
	}

	public void setFacturasProveedoressEliminados(List<FacturasProveedores> facturasproveedoressEliminados) {
		this.facturasproveedoressEliminados = facturasproveedoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturasProveedores() {
		return jComboBoxTiposSeleccionarFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturasProveedores(
			JComboBox jComboBoxTiposSeleccionarFacturasProveedores) {
		this.jComboBoxTiposSeleccionarFacturasProveedores = jComboBoxTiposSeleccionarFacturasProveedores;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturasProveedores() {
		return jTextFieldValorCampoGeneralFacturasProveedores;
	}

	public void setjTextFieldValorCampoGeneralFacturasProveedores(
			JTextField jTextFieldValorCampoGeneralFacturasProveedores) {
		this.jTextFieldValorCampoGeneralFacturasProveedores = jTextFieldValorCampoGeneralFacturasProveedores;
	}

	public void setBorderResaltarValorCampoGeneralFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturasProveedores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturasProveedores() {
		return this.jCheckBoxSeleccionarTodosFacturasProveedores;
	}

	public void setjCheckBoxSeleccionarTodosFacturasProveedores(
			JCheckBox jCheckBoxSeleccionarTodosFacturasProveedores) {
		this.jCheckBoxSeleccionarTodosFacturasProveedores = jCheckBoxSeleccionarTodosFacturasProveedores;
	}

	public void setBorderResaltarSeleccionarTodosFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturasProveedores() {
		return this.jCheckBoxSeleccionadosFacturasProveedores;
	}

	public void setjCheckBoxSeleccionadosFacturasProveedores(
			JCheckBox jCheckBoxSeleccionadosFacturasProveedores) {
		this.jCheckBoxSeleccionadosFacturasProveedores = jCheckBoxSeleccionadosFacturasProveedores;
	}
	
	public void setBorderResaltarSeleccionadosFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturasProveedores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturasProveedores() {
		return this.jComboBoxTiposArchivosReportesFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturasProveedores(
			JComboBox jComboBoxTiposArchivosReportesFacturasProveedores) {
		this.jComboBoxTiposArchivosReportesFacturasProveedores = jComboBoxTiposArchivosReportesFacturasProveedores;
	}

	public void setBorderResaltarTiposArchivosReportesFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturasProveedores() {
		return this.jComboBoxTiposReportesFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturasProveedores(
			JComboBox jComboBoxTiposReportesFacturasProveedores) {
		this.jComboBoxTiposReportesFacturasProveedores = jComboBoxTiposReportesFacturasProveedores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturasProveedores() {
	//	return jComboBoxTiposReportesDinamicoFacturasProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturasProveedores(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturasProveedores) {
	//	this.jComboBoxTiposReportesDinamicoFacturasProveedores = jComboBoxTiposReportesDinamicoFacturasProveedores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturasProveedores() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturasProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturasProveedores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturasProveedores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores = jComboBoxTiposArchivosReportesDinamicoFacturasProveedores;
	//}
	
	public void setBorderResaltarTiposReportesFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturasProveedores() {
		return this.jComboBoxTiposGraficosReportesFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturasProveedores(
			JComboBox jComboBoxTiposGraficosReportesFacturasProveedores) {
		this.jComboBoxTiposGraficosReportesFacturasProveedores = jComboBoxTiposGraficosReportesFacturasProveedores;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturasProveedores() {
		return this.jComboBoxTiposPaginacionFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturasProveedores(
			JComboBox jComboBoxTiposPaginacionFacturasProveedores) {
		this.jComboBoxTiposPaginacionFacturasProveedores = jComboBoxTiposPaginacionFacturasProveedores;
	}
	
	public void setBorderResaltarTiposPaginacionFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturasProveedores() {
		return this.jComboBoxTiposRelacionesFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturasProveedores() {
		return this.jComboBoxTiposAccionesFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturasProveedores(
			JComboBox jComboBoxTiposRelacionesFacturasProveedores) {
		this.jComboBoxTiposRelacionesFacturasProveedores = jComboBoxTiposRelacionesFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturasProveedores(
			JComboBox jComboBoxTiposAccionesFacturasProveedores) {
		this.jComboBoxTiposAccionesFacturasProveedores = jComboBoxTiposAccionesFacturasProveedores;
	}
	
	public void setBorderResaltarTiposRelacionesFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturasProveedores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturasProveedores() {
	//	return jCheckBoxConGraficoDinamicoFacturasProveedores;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturasProveedores(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturasProveedores) {
	//	this.jCheckBoxConGraficoDinamicoFacturasProveedores = jCheckBoxConGraficoDinamicoFacturasProveedores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturasProveedores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturasProveedores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturasProveedores .setBorder(borderResaltar);		
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
		this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
		
		this.facturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturasproveedoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturasProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturas Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturasProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturasProveedores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"nuevo","nuevo","Nuevo"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"duplicar","duplicar","Duplicar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"copiar","copiar","Copiar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"ver_form","ver_form","Ver"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"recargar","recargar","Buscar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturasProveedores,this.jTtoolBarFacturasProveedores,
							"cerrar","cerrar","Salir"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturasProveedores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturasProveedores;
			
				this.jButtonProcesarInformacionToolBarFacturasProveedores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturasProveedores;
				
		//protected JButton jButtonModificarToolBarFacturasProveedores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturasProveedores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturasProveedores=new JMenuMe("General");
		this.jmenuArchivoFacturasProveedores=new JMenuMe("Archivo");
		this.jmenuAccionesFacturasProveedores=new JMenuMe("Acciones");
		this.jmenuDatosFacturasProveedores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturasProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturasProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturasProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturasProveedores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturasProveedores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturasProveedores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturasProveedores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturasProveedores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturasProveedores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturasProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturasProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturasProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturasProveedores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturasProveedores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturasProveedores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturasProveedores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturasProveedores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturasProveedores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturasProveedores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturasProveedores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturasProveedores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturasProveedores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturasProveedores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturasProveedores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturasProveedores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturasProveedores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturasProveedores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturasProveedores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturasProveedores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturasProveedores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturasProveedores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturasProveedores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturasProveedores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturasProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturasProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturasProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturasProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturasProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturasProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturasProveedores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturasProveedores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturasProveedores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturasProveedores.add(this.jMenuItemCerrarFacturasProveedores);
			
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemNuevoFacturasProveedores);
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemNuevoGuardarCambiosFacturasProveedores);
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemNuevoRelacionesFacturasProveedores);
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemGuardarCambiosTablaFacturasProveedores);		
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemDuplicarFacturasProveedores);		
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemCopiarFacturasProveedores);		
			this.jmenuAccionesFacturasProveedores.add(this.jMenuItemVerFormFacturasProveedores);		
			
			this.jmenuDatosFacturasProveedores.add(this.jMenuItemRecargarInformacionFacturasProveedores);				
			this.jmenuDatosFacturasProveedores.add(this.jMenuItemAnterioresFacturasProveedores);				
			this.jmenuDatosFacturasProveedores.add(this.jMenuItemSiguientesFacturasProveedores);				
			this.jmenuDatosFacturasProveedores.add(this.jMenuItemAbrirOrderByFacturasProveedores);				
			this.jmenuDatosFacturasProveedores.add(this.jMenuItemMostrarOcultarFacturasProveedores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturasProveedores.add(this.jMenuItemGuardarCambiosFacturasProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturasProveedores.add(this.jmenuArchivoFacturasProveedores);		
			this.jmenuBarFacturasProveedores.add(this.jmenuAccionesFacturasProveedores);		
			this.jmenuBarFacturasProveedores.add(this.jmenuDatosFacturasProveedores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturasProveedores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturasProveedores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaFacturasProveedoresFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaFacturasProveedoresFacturasProveedores.setToolTipText("Buscar Por Cliente Por Fecha Emision Inicio Por Fecha Emision Fin ");
		this.jButtonBusquedaFacturasProveedoresFacturasProveedores= new JButtonMe();
		this.jButtonBusquedaFacturasProveedoresFacturasProveedores.setText("Buscar");
		this.jButtonBusquedaFacturasProveedoresFacturasProveedores.setToolTipText("Buscar Por Cliente Por Fecha Emision Inicio Por Fecha Emision Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaFacturasProveedoresFacturasProveedores,"buscar_button","Buscar Por Cliente Por Fecha Emision Inicio Por Fecha Emision Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaFacturasProveedoresFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores = new JLabelMe();
		jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores.setText("Cliente :");
		jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores.setToolTipText("Cliente");
		jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores= new JComboBoxMe();
		jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores = new JLabelMe();
		jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setText("Fecha Emision Inicio :");
		jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setToolTipText("Fecha Emision Inicio");
		jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores = new JLabelMe();
		jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setText("Fecha Emision Fin :");
		jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setToolTipText("Fecha Emision Fin");
		jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasFacturasProveedores=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturasProveedores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasFacturasProveedores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasFacturasProveedores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturasProveedores = new FacturasProveedoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Facturas Proveedores DATOS");
			this.jInternalFrameDetalleFormFacturasProveedores = new FacturasProveedoresDetalleFormJInternalFrame(jDesktopPane,this.facturasproveedoresSessionBean.getConGuardarRelaciones(),this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturasProveedores = null;//new FacturasProveedoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturasProveedores= new GridBagLayout();
		
		
		this.jTableDatosFacturasProveedores = new JTableMe();      
		
		String sToolTipFacturasProveedores="";
		sToolTipFacturasProveedores=FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturasProveedores+="(Cartera.FacturasProveedores)";
		}
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturasProveedores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturasProveedores.setToolTipText(sToolTipFacturasProveedores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturasProveedores);
		this.jTableDatosFacturasProveedores.setAutoCreateRowSorter(true);
		this.jTableDatosFacturasProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturasProveedores.setRowSelectionAllowed(true);
		this.jTableDatosFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturasProveedores = new JButtonMe();
		this.jButtonDuplicarFacturasProveedores = new JButtonMe();
		this.jButtonCopiarFacturasProveedores = new JButtonMe();
		this.jButtonVerFormFacturasProveedores = new JButtonMe();
		this.jButtonNuevoRelacionesFacturasProveedores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturasProveedores = new JButtonMe();
		this.jButtonCerrarFacturasProveedores = new JButtonMe();
		
		this.jScrollPanelDatosFacturasProveedores = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturasProveedores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Facturas Proveedores";
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFacturasProveedores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturasProveedores=new ReporteDinamicoJInternalFrame(FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturasProveedores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturasProveedores=new ImportacionJInternalFrame(FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturasProveedores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturasProveedores = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturasProveedores.setText("Orden");
		this.jButtonAbrirOrderByFacturasProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasProveedores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasProveedores,false,this);
			
			//this.cargarOrderByFacturasProveedores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasProveedores,true,this);
			
			//this.cargarOrderByFacturasProveedores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturasProveedores.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosFacturasProveedores.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosFacturasProveedores.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosFacturasProveedores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasProveedores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturasProveedores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturasProveedores.setText("Nuevo");
		this.jButtonDuplicarFacturasProveedores.setText("Duplicar");
		this.jButtonCopiarFacturasProveedores.setText("Copiar");
		this.jButtonVerFormFacturasProveedores.setText("Ver");
		this.jButtonNuevoRelacionesFacturasProveedores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.setText("Guardar");
		this.jButtonCerrarFacturasProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturasProveedores,"nuevo_button","Nuevo",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturasProveedores,"duplicar_button","Duplicar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturasProveedores,"copiar_button","Copiar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturasProveedores,"ver_form","Ver",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturasProveedores,"nuevorelaciones_button","Nuevo Rel",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturasProveedores,"guardarcambiostabla_button","Guardar",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturasProveedores,"cerrar_button","Salir",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturasProveedores.setToolTipText("Nuevo"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturasProveedores.setToolTipText("Duplicar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturasProveedores.setToolTipText("Copiar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturasProveedores.setToolTipText("Ver"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturasProveedores.setToolTipText("Nuevo Rel"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.setToolTipText("Guardar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturasProveedores.setToolTipText("Salir"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturasProveedores";
		inputMap = this.jButtonNuevoFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturasProveedores"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturasProveedores";
		inputMap = this.jButtonDuplicarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturasProveedores"));
		
		//COPIAR
		sMapKey = "CopiarFacturasProveedores";
		inputMap = this.jButtonCopiarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturasProveedores"));
		
		//VEr FORM
		sMapKey = "VerFormFacturasProveedores";
		inputMap = this.jButtonVerFormFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturasProveedores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturasProveedores";
		inputMap = this.jButtonNuevoRelacionesFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturasProveedores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturasProveedores";
		inputMap = this.jButtonModificarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturasProveedores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturasProveedores";
		inputMap = this.jButtonCerrarFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturasProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturasProveedores";
		inputMap = this.jButtonGuardarCambiosTablaFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturasProveedores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturasProveedores.setName("jPanelParametrosReportesFacturasProveedores"); 
		
		this.jPanelParametrosReportesAccionesFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturasProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturasProveedores.setName("jPanelParametrosReportesAccionesFacturasProveedores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturasProveedores = new JButtonMe();
		this.jButtonRecargarInformacionFacturasProveedores.setText("Buscar");
		this.jButtonRecargarInformacionFacturasProveedores.setToolTipText("Buscar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturasProveedores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionFacturasProveedores.setVisible(false);
		
		
		this.jButtonProcesarInformacionFacturasProveedores = new JButtonMe();
		this.jButtonProcesarInformacionFacturasProveedores.setText("Procesar");
		this.jButtonProcesarInformacionFacturasProveedores.setToolTipText("Procesar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturasProveedores.setVisible(false);
			
		this.jButtonProcesarInformacionFacturasProveedores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasProveedores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturasProveedores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturasProveedores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposReportesFacturasProveedores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturasProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturasProveedores.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturasProveedores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturasProveedores.setText("Accion");
		this.jComboBoxTiposRelacionesFacturasProveedores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturasProveedores.setText("Accion");
		this.jComboBoxTiposAccionesFacturasProveedores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturasProveedores.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturasProveedores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturasProveedores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturasProveedores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasProveedores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturasProveedores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturasProveedores = new JLabelMe();
		
		this.jLabelAccionesFacturasProveedores.setText("Acciones");		
		this.jLabelAccionesFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturasProveedores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturasProveedores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturasProveedores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturasProveedores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturasProveedores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturasProveedores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturasProveedores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturasProveedores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturasProveedores.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturasProveedores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturasProveedores = new JButtonMe();
		//this.jButtonAnterioresFacturasProveedores.setText("<<");
        this.jButtonAnterioresFacturasProveedores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturasProveedores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturasProveedores = new JButtonMe();
		//this.jButtonSiguientesFacturasProveedores.setText(">>");
        this.jButtonSiguientesFacturasProveedores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturasProveedores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturasProveedores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturasProveedores.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturasProveedores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturasProveedores,"nuevoguardarcambios_button","Nue",this.facturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturasProveedores";
		inputMap = this.jButtonNuevoGuardarCambiosFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturasProveedores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturasProveedores";
		inputMap = this.jButtonRecargarInformacionFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturasProveedores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturasProveedores";
		inputMap = this.jButtonSiguientesFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturasProveedores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturasProveedores";
		inputMap = this.jButtonAnterioresFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturasProveedores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturasProveedores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturasProveedores.setMinimumSize(new Dimension(this.getWidth(),FacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasProveedores.setMaximumSize(new Dimension(this.getWidth(),FacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturasProveedores.setPreferredSize(new Dimension(this.getWidth(),FacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturasProveedores = new GridBagLayout();

			this.jPanelPaginacionFacturasProveedores.setLayout(gridaBagLayoutPaginacionFacturasProveedores);						
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 0;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonAnterioresFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
					
						
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasProveedores.gridy = 0;
			
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonNuevoGuardarCambiosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
						
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturasProveedores.gridy = 0;
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonSiguientesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 1;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonNuevoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
						
			
			
			if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturasProveedores.gridy = 1;
				this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturasProveedores.add(this.jButtonGuardarCambiosTablaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			}
			
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 1;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonDuplicarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 1;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonCopiarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 1;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonVerFormFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 1;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturasProveedores.add(this.jButtonCerrarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		
		this.jButtonRecargarInformacionFacturasProveedores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasProveedores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturasProveedores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturasProveedores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasProveedores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturasProveedores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturasProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturasProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturasProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturasProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturasProveedores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasProveedores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturasProveedores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturasProveedores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasProveedores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturasProveedores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturasProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturasProveedores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturasProveedores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasProveedores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturasProveedores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturasProveedores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturasProveedores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturasProveedores.setLayout(gridaBagParametrosReportesFacturasProveedores);
			this.jPanelParametrosReportesAccionesFacturasProveedores.setLayout(gridaBagParametrosReportesAccionesFacturasProveedores);
			
			
			this.jPanelParametrosAuxiliar1FacturasProveedores.setLayout(gridaBagParametrosAuxiliar1FacturasProveedores);
			this.jPanelParametrosAuxiliar2FacturasProveedores.setLayout(gridaBagParametrosAuxiliar2FacturasProveedores);
			this.jPanelParametrosAuxiliar3FacturasProveedores.setLayout(gridaBagParametrosAuxiliar3FacturasProveedores);
			this.jPanelParametrosAuxiliar4FacturasProveedores.setLayout(gridaBagParametrosAuxiliar4FacturasProveedores);
			//this.jPanelParametrosAuxiliar5FacturasProveedores.setLayout(gridaBagParametrosAuxiliar2FacturasProveedores);			
			
			
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasProveedores.add(this.jButtonRecargarInformacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasProveedores.add(this.jComboBoxTiposPaginacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasProveedores.add(this.jCheckBoxConAltoMaximoTablaFacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturasProveedores.add(this.jComboBoxTiposArchivosReportesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasProveedores.add(this.jPanelParametrosAuxiliar1FacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturasProveedores.add(this.jComboBoxTiposReportesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);																		
			
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturasProveedores.add(this.jComboBoxTiposGraficosReportesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasProveedores.add(this.jPanelParametrosAuxiliar4FacturasProveedores, this.gridBagConstraintsFacturasProveedores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasProveedores.add(this.jComboBoxTiposReportesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasProveedores.add(this.jCheckBoxGenerarReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasProveedores.add(this.jPanelParametrosAuxiliar2FacturasProveedores, this.gridBagConstraintsFacturasProveedores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasProveedores.add(this.jLabelAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturasProveedores.add(this.jButtonAbrirOrderByFacturasProveedores, this.gridBagConstraintsFacturasProveedores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasProveedores.add(this.jComboBoxTiposSeleccionarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
			
			
			/*
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasProveedores.add(this.jCheckBoxSeleccionarTodosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturasProveedores.add(this.jCheckBoxConGraficoReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasProveedores.add(this.jCheckBoxSeleccionarTodosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);															
				
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasProveedores.add(this.jCheckBoxSeleccionadosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);															
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturasProveedores.add(this.jCheckBoxConGraficoReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturasProveedores.add(this.jPanelParametrosAuxiliar3FacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturasProveedores.add(this.jComboBoxTiposAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturasProveedores = new GridBagLayout();

			this.jScrollPanelDatosFacturasProveedores.setLayout(gridaBagLayoutDatosFacturasProveedores);
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = 0;
			this.gridBagConstraintsFacturasProveedores.gridx = 0;
			
			this.jScrollPanelDatosFacturasProveedores.add(this.jTableDatosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturasProveedores.setViewportView(this.jTableDatosFacturasProveedores);
		this.jTableDatosFacturasProveedores.setFillsViewportHeight(true);
		this.jTableDatosFacturasProveedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesFacturasProveedores.setLayout(gridaBagLayoutAccionesFacturasProveedores);
		
		
		/*	
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = 0;
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
			
		this.jPanelAccionesFacturasProveedores.add(this.jButtonNuevoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaFacturasProveedoresFacturasProveedores= new GridBagLayout();
		gridaBagLayoutBusquedaFacturasProveedoresFacturasProveedores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaFacturasProveedoresFacturasProveedores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaFacturasProveedoresFacturasProveedores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaFacturasProveedoresFacturasProveedores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaFacturasProveedoresFacturasProveedores.setLayout(gridaBagLayoutBusquedaFacturasProveedoresFacturasProveedores);

		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 0;
		gridBagConstraintsFacturasProveedores.gridx = 0;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jLabelid_clienteBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);

		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 0;
		gridBagConstraintsFacturasProveedores.gridx = 1;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);


		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 1;
		gridBagConstraintsFacturasProveedores.gridx = 0;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jLabelfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);

		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 1;
		gridBagConstraintsFacturasProveedores.gridx = 1;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);


		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 2;
		gridBagConstraintsFacturasProveedores.gridx = 0;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jLabelfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);

		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 2;
		gridBagConstraintsFacturasProveedores.gridx = 1;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);

		gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturasProveedores.gridy = 3;
		gridBagConstraintsFacturasProveedores.gridx =1;
		jPanelBusquedaFacturasProveedoresFacturasProveedores.add(jButtonBusquedaFacturasProveedoresFacturasProveedores, gridBagConstraintsFacturasProveedores);

		jTabbedPaneBusquedasFacturasProveedores.addTab("1.-Por Cliente Por Fecha Emision Inicio Por Fecha Emision Fin ", jPanelBusquedaFacturasProveedoresFacturasProveedores);
		jTabbedPaneBusquedasFacturasProveedores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturasProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturasProveedores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();						
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasProveedores.gridx = 0;		
			//this.gridBagConstraintsFacturasProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturasProveedores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturasProveedores, this.gridBagConstraintsFacturasProveedores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturasProveedores.gridx = 0;		
		//this.gridBagConstraintsFacturasProveedores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturasProveedores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturasProveedores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturasProveedores.gridx = 0;		
			this.gridBagConstraintsFacturasProveedores.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturasProveedores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturasProveedores, this.gridBagConstraintsFacturasProveedores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);								
		
		
		/*
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		*/		
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturasProveedores.gridx =0;
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturasProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
				
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturasProveedores = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturasProveedores.setLayout(gridaBagLayoutBusquedasParametrosFacturasProveedores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturasProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
			
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturasProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturasProveedores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturasProveedores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturasProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturasProveedores.setName("jPanelReporteDinamicoFacturasProveedores"); 
		
		this.jPanelReporteDinamicoFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturasProveedores.setLayout(gridaBagLayoutReporteDinamicoFacturasProveedores);
		
		
		this.jInternalFrameReporteDinamicoFacturasProveedores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturasProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturasProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturasProveedores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturasProveedores.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturasProveedores.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturasProveedores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Proveedoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturasProveedores = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturasProveedores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelColumnasSelectReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturasProveedores = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturasProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturasProveedores=new JScrollPane(this.jListColumnasSelectReporteFacturasProveedores);
			
			this.jScrollColumnasSelectReporteFacturasProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturasProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturasProveedores.add(this.jListColumnasSelectReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jScrollColumnasSelectReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturasProveedores = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturasProveedores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturasProveedores = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturasProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturasProveedores=new JScrollPane(this.jListRelacionesSelectReporteFacturasProveedores);
			
			this.jScrollRelacionesSelectReporteFacturasProveedores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasProveedores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturasProveedores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturasProveedores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturasProveedores = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturasProveedores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturasProveedores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturasProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturasProveedores = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturasProveedores.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelConGraficoDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturasProveedores.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturasProveedores.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturasProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturasProveedores.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jCheckBoxConGraficoDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturasProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturasProveedores.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelColumnaCategoriaGraficoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jComboBoxColumnaCategoriaGraficoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturasProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturasProveedores.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelColumnaCategoriaValorFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturasProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jComboBoxColumnaCategoriaValorFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturasProveedores = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturasProveedores.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelColumnasValoresGraficoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturasProveedores = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturasProveedores.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturasProveedores=new JScrollPane(this.jListColumnasValoresGraficoFacturasProveedores);
			
			this.jScrollColumnasValoresGraficoFacturasProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturasProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturasProveedores.add(this.jListColumnasSelectReporteFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jScrollColumnasValoresGraficoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturasProveedores = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturasProveedores.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelTiposGraficosReportesDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturasProveedores.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jComboBoxTiposGraficosReportesDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturasProveedores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturasProveedores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelGenerarExcelReporteDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturasProveedores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturasProveedores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturasProveedores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturasProveedores.setToolTipText("Generar EXCEL"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturasProveedores.add(this.jButtonGenerarExcelReporteDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jComboBoxTiposReportesDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturasProveedores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturasProveedores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jLabelTiposArchivoReporteDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jComboBoxTiposArchivosReportesDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturasProveedores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturasProveedores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturasProveedores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturasProveedores.setToolTipText("Generar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jButtonGenerarReporteDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturasProveedores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturasProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturasProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturasProveedores.setToolTipText("Cancelar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturasProveedores.add(this.jButtonCerrarReporteDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturasProveedores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturasProveedores= new JScrollPane(jPanelReporteDinamicoFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Proveedoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturasProveedores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturasProveedores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturasProveedores);
		this.jInternalFrameReporteDinamicoFacturasProveedores.getContentPane().add(this.jScrollPanelReporteDinamicoFacturasProveedores, this.gridBagConstraintsFacturasProveedores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturasProveedores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturasProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturasProveedores.setName("jPanelImportacionFacturasProveedores"); 
		
		this.jPanelImportacionFacturasProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturasProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturasProveedores.setLayout(gridaBagLayoutImportacionFacturasProveedores);
		
		
		this.jInternalFrameImportacionFacturasProveedores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturasProveedores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturasProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturasProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturasProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasProveedores.setResizable(true);
	    this.jInternalFrameImportacionFacturasProveedores.setClosable(true);
	    this.jInternalFrameImportacionFacturasProveedores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturasProveedores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturasProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturasProveedores.setResizable(true);
	    this.jInternalFrameImportacionFacturasProveedores.setClosable(true);
	    this.jInternalFrameImportacionFacturasProveedores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturasProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturasProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Proveedoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturasProveedores = new JLabelMe();

		this.jLabelArchivoImportacionFacturasProveedores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasProveedores.add(this.jLabelArchivoImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturasProveedores = new JFileChooser();		
		this.jFileChooserImportacionFacturasProveedores.setToolTipText("ESCOGER ARCHIVO"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturasProveedores = new JButtonMe();
		this.jButtonAbrirImportacionFacturasProveedores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturasProveedores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturasProveedores.setToolTipText("Generar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasProveedores.add(this.jButtonAbrirImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturasProveedores = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturasProveedores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturasProveedores.add(this.jLabelPathArchivoImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturasProveedores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturasProveedores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasProveedores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturasProveedores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasProveedores.add(this.jTextFieldPathArchivoImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturasProveedores = new JButtonMe();
		this.jButtonGenerarImportacionFacturasProveedores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturasProveedores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturasProveedores.setToolTipText("Generar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasProveedores.add(this.jButtonGenerarImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturasProveedores = new JButtonMe();
		this.jButtonCerrarImportacionFacturasProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturasProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturasProveedores.setToolTipText("Cancelar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturasProveedores.add(this.jButtonCerrarImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturasProveedores = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturasProveedores= new JScrollPane(jPanelImportacionFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsFacturasProveedores.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturasProveedores.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturasProveedores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturasProveedores);
		this.jInternalFrameImportacionFacturasProveedores.getContentPane().add(this.jScrollPanelImportacionFacturasProveedores, this.gridBagConstraintsFacturasProveedores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturasProveedores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturasProveedores = new JButtonMe();
			this.jButtonAbrirOrderByFacturasProveedores.setText("Orden");
			this.jButtonAbrirOrderByFacturasProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturasProveedores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturasProveedores";
			inputMap = this.jButtonAbrirOrderByFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturasProveedores"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturasProveedores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturasProveedores.setName("jPanelOrderByFacturasProveedores"); 
			
			this.jPanelOrderByFacturasProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturasProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturasProveedores.setLayout(gridaBagLayoutOrderByFacturasProveedores);
			
			
			this.jTableDatosFacturasProveedoresOrderBy = new JTableMe();        
			this.jTableDatosFacturasProveedoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturasProveedoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturasProveedoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturasProveedoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturasProveedoresOrderBy.setViewportView(this.jTableDatosFacturasProveedoresOrderBy);
			this.jTableDatosFacturasProveedoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturasProveedoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturasProveedores= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturasProveedores= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturasProveedores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturasProveedores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturasProveedores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturasProveedores.setTitle("Orden");
			this.jInternalFrameOrderByFacturasProveedores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturasProveedores.setResizable(true);
			this.jInternalFrameOrderByFacturasProveedores.setClosable(true);
			this.jInternalFrameOrderByFacturasProveedores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturasProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturasProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas Proveedoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturasProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturasProveedores.ipady =150;
				
			this.jPanelOrderByFacturasProveedores.add(jScrollPanelDatosFacturasProveedoresOrderBy, this.gridBagConstraintsFacturasProveedores);//this.jTableDatosFacturasProveedoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturasProveedores = new JButtonMe();
			this.jButtonCerrarOrderByFacturasProveedores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturasProveedores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturasProveedores.setToolTipText("Cancelar"+" "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturasProveedores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturasProveedores.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturasProveedores.add(this.jButtonCerrarOrderByFacturasProveedores, this.gridBagConstraintsFacturasProveedores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturasProveedores = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturasProveedores= new JScrollPane(jPanelOrderByFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsFacturasProveedores.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturasProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturasProveedores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturasProveedores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturasProveedores);
			
			this.jInternalFrameOrderByFacturasProveedores.getContentPane().add(this.jScrollPanelOrderByFacturasProveedores, this.gridBagConstraintsFacturasProveedores);			
		
		} else {
			this.jButtonAbrirOrderByFacturasProveedores = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.facturasproveedoresSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosFacturasProveedores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturasProveedores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturasProveedores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosFacturasProveedores.getRowHeight();//FacturasProveedoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasProveedores.isSelected()) {
					iHeightTable=FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturasProveedores.isSelected()) {
					iHeightTable=FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturasProveedores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasProveedores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturasProveedores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturasProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturasProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturasProveedores!=null && this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy()!=null) {
			//if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturasProveedores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturasProveedores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturasProveedores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturasProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturasProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=facturasproveedoresLogic.getFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasproveedoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturasProveedores> TraerFacturasProveedoresBeans(List<FacturasProveedores> facturasproveedoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturasProveedores facturasproveedores:facturasproveedoress) {
					
				if(!(FacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturasproveedores.setsDetalleGeneralEntityReporte(FacturasProveedoresConstantesFunciones.getFacturasProveedoresDescripcion(facturasproveedores));
										
						
					
						
					
				} else  {
							
					//facturasproveedores.setsDetalleGeneralEntityReporte(facturasproveedores.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturasproveedoresbeans.add(facturasproveedoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturasproveedoress;
    }
	//PARA REPORTES FIN
}
