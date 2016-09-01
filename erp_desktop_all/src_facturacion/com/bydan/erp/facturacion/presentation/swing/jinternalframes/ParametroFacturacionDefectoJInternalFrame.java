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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroFacturacionDefectoConstantesFunciones;

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
public class ParametroFacturacionDefectoJInternalFrame extends ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFacturacionDefecto;
	
	protected JMenuBar jmenuBarParametroFacturacionDefecto;
	
	protected JMenu jmenuParametroFacturacionDefecto;
	protected JMenu jmenuDatosParametroFacturacionDefecto;
	protected JMenu jmenuArchivoParametroFacturacionDefecto;
	protected JMenu jmenuAccionesParametroFacturacionDefecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFacturacionDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroFacturacionDefecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFacturacionDefectoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFacturacionDefecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFacturacionDefecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFacturacionDefecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";
	
	public ParametroFacturacionDefectoSessionBean parametrofacturaciondefectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFacturacionDefecto> parametrofacturaciondefectos;		
	public List<ParametroFacturacionDefecto> parametrofacturaciondefectosEliminados;	
	public List<ParametroFacturacionDefecto> parametrofacturaciondefectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFacturacionDefecto;		
	protected JButton jButtonAbrirOrderByParametroFacturacionDefecto;
	
	
	//protected JPanel jPanelOrderByParametroFacturacionDefecto;
	//public JScrollPane jScrollPanelOrderByParametroFacturacionDefecto;	
	//protected JButton jButtonCerrarOrderByParametroFacturacionDefecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFacturacionDefectoLogic parametrofacturaciondefectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFacturacionDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroFacturacionDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroFacturacionDefecto;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFacturacionDefectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFacturacionDefecto;
	//public JScrollPane jScrollPanelImportacionParametroFacturacionDefecto;
	
	
	
	protected JPanel jPanelAccionesParametroFacturacionDefecto;
	
    protected JPanel jPanelPaginacionParametroFacturacionDefecto;
    protected JPanel jPanelParametrosReportesParametroFacturacionDefecto;
	protected JPanel jPanelParametrosReportesAccionesParametroFacturacionDefecto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFacturacionDefecto;
	protected JPanel jPanelParametrosAuxiliar2ParametroFacturacionDefecto;
	protected JPanel jPanelParametrosAuxiliar3ParametroFacturacionDefecto;
	protected JPanel jPanelParametrosAuxiliar4ParametroFacturacionDefecto;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFacturacionDefecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFacturacionDefecto;
	//protected JPanel jPanelImportacionParametroFacturacionDefecto;
	
	
	public JTable jTableDatosParametroFacturacionDefecto;
	
	
	
	//public JTable jTableDatosParametroFacturacionDefectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFacturacionDefecto;
	protected JButton jButtonDuplicarParametroFacturacionDefecto;
	protected JButton jButtonCopiarParametroFacturacionDefecto;
	protected JButton jButtonVerFormParametroFacturacionDefecto;
	protected JButton jButtonNuevoRelacionesParametroFacturacionDefecto;
	protected JButton jButtonModificarParametroFacturacionDefecto;
	
    protected JButton jButtonGuardarCambiosTablaParametroFacturacionDefecto;
	protected JButton jButtonCerrarParametroFacturacionDefecto;
	
	
	protected JButton jButtonRecargarInformacionParametroFacturacionDefecto;
	protected JButton jButtonProcesarInformacionParametroFacturacionDefecto;
	
	
	protected JButton jButtonAnterioresParametroFacturacionDefecto;
	protected JButton jButtonSiguientesParametroFacturacionDefecto;
	protected JButton jButtonNuevoGuardarCambiosParametroFacturacionDefecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFacturacionDefecto;
	//protected JButton jButtonCerrarReporteDinamicoParametroFacturacionDefecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFacturacionDefecto;
	//protected JButton jButtonGenerarImportacionParametroFacturacionDefecto;
	//protected JButton jButtonCerrarImportacionParametroFacturacionDefecto;
	//protected JFileChooser jFileChooserImportacionParametroFacturacionDefecto;
	//protected File fileImportacionParametroFacturacionDefecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFacturacionDefecto;
	protected JButton jButtonDuplicarToolBarParametroFacturacionDefecto;
	protected JButton jButtonNuevoRelacionesToolBarParametroFacturacionDefecto;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFacturacionDefecto;
	protected JButton jButtonCopiarToolBarParametroFacturacionDefecto;
	protected JButton jButtonVerFormToolBarParametroFacturacionDefecto;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFacturacionDefecto;
	protected JButton jButtonCerrarToolBarParametroFacturacionDefecto;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFacturacionDefecto;
	protected JButton jButtonProcesarInformacionToolBarParametroFacturacionDefecto;
	protected JButton jButtonAnterioresToolBarParametroFacturacionDefecto;
	protected JButton jButtonSiguientesToolBarParametroFacturacionDefecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFacturacionDefecto;
	protected JButton jButtonAbrirOrderByToolBarParametroFacturacionDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFacturacionDefecto;
	protected JMenuItem jMenuItemDuplicarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFacturacionDefecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFacturacionDefecto;
	protected JMenuItem jMenuItemCopiarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemVerFormParametroFacturacionDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFacturacionDefecto;
	protected JMenuItem jMenuItemCerrarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFacturacionDefecto;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFacturacionDefecto;
	protected JMenuItem jMenuItemProcesarInformacionParametroFacturacionDefecto;
	protected JMenuItem jMenuItemAnterioresParametroFacturacionDefecto;
	protected JMenuItem jMenuItemSiguientesParametroFacturacionDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto;
	protected JMenuItem jMenuItemAbrirOrderByParametroFacturacionDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroFacturacionDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFacturacionDefecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFacturacionDefecto;
	protected JCheckBox jCheckBoxSeleccionadosParametroFacturacionDefecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFacturacionDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFacturacionDefecto;
	protected JTextField jTextFieldValorCampoGeneralParametroFacturacionDefecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFacturacionDefecto;
	//public JList<Reporte> jListColumnasSelectReporteParametroFacturacionDefecto;
	//public JScrollPane jScrollColumnasSelectReporteParametroFacturacionDefecto;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFacturacionDefecto;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFacturacionDefecto;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFacturacionDefecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFacturacionDefecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFacturacionDefecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto;
	
		
	//public JLabel jLabelArchivoImportacionParametroFacturacionDefecto;	
	//public JLabel jLabelPathArchivoImportacionParametroFacturacionDefecto;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFacturacionDefecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFacturacionDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFacturacionDefecto;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFacturacionDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFacturacionDefecto;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFacturacionDefecto;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFacturacionDefecto;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFacturacionDefecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFacturacionDefecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFacturacionDefecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFacturacionDefecto;
	public JPanel jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto;
	public JButton jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto;
	
	public JPanel jPanelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto;
	public JLabel jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto;
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefectoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroFacturacionDefectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFacturacionDefecto)	{
		this.jButtonRecargarInformacionParametroFacturacionDefecto = jButtonRecargarInformacionParametroFacturacionDefecto;
	}
	
	public JButton getjButtonProcesarInformacionParametroFacturacionDefecto() {
		return this.jButtonProcesarInformacionParametroFacturacionDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFacturacionDefecto)	{
		this.jButtonProcesarInformacionParametroFacturacionDefecto = jButtonProcesarInformacionParametroFacturacionDefecto;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFacturacionDefecto() {
		return this.jButtonRecargarInformacionParametroFacturacionDefecto;
	}
	
	
	public List<ParametroFacturacionDefecto> getparametrofacturaciondefectos() {
		return this.parametrofacturaciondefectos;
	}

	public void setparametrofacturaciondefectos(List<ParametroFacturacionDefecto> parametrofacturaciondefectos) {
		this.parametrofacturaciondefectos = parametrofacturaciondefectos;
	}
	
	public List<ParametroFacturacionDefecto> getparametrofacturaciondefectosAux() {
		return this.parametrofacturaciondefectosAux;
	}

	public void setparametrofacturaciondefectosAux(List<ParametroFacturacionDefecto> parametrofacturaciondefectosAux) {
		this.parametrofacturaciondefectosAux = parametrofacturaciondefectosAux;
	}
	
	public List<ParametroFacturacionDefecto> getparametrofacturaciondefectosEliminados() {
		return this.parametrofacturaciondefectosEliminados;
	}

	public void setParametroFacturacionDefectosEliminados(List<ParametroFacturacionDefecto> parametrofacturaciondefectosEliminados) {
		this.parametrofacturaciondefectosEliminados = parametrofacturaciondefectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFacturacionDefecto() {
		return jComboBoxTiposSeleccionarParametroFacturacionDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFacturacionDefecto(
			JComboBox jComboBoxTiposSeleccionarParametroFacturacionDefecto) {
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto = jComboBoxTiposSeleccionarParametroFacturacionDefecto;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFacturacionDefecto() {
		return jTextFieldValorCampoGeneralParametroFacturacionDefecto;
	}

	public void setjTextFieldValorCampoGeneralParametroFacturacionDefecto(
			JTextField jTextFieldValorCampoGeneralParametroFacturacionDefecto) {
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto = jTextFieldValorCampoGeneralParametroFacturacionDefecto;
	}

	public void setBorderResaltarValorCampoGeneralParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFacturacionDefecto() {
		return this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto;
	}

	public void setjCheckBoxSeleccionarTodosParametroFacturacionDefecto(
			JCheckBox jCheckBoxSeleccionarTodosParametroFacturacionDefecto) {
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto = jCheckBoxSeleccionarTodosParametroFacturacionDefecto;
	}

	public void setBorderResaltarSeleccionarTodosParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFacturacionDefecto() {
		return this.jCheckBoxSeleccionadosParametroFacturacionDefecto;
	}

	public void setjCheckBoxSeleccionadosParametroFacturacionDefecto(
			JCheckBox jCheckBoxSeleccionadosParametroFacturacionDefecto) {
		this.jCheckBoxSeleccionadosParametroFacturacionDefecto = jCheckBoxSeleccionadosParametroFacturacionDefecto;
	}
	
	public void setBorderResaltarSeleccionadosParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFacturacionDefecto() {
		return this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposArchivosReportesParametroFacturacionDefecto) {
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto = jComboBoxTiposArchivosReportesParametroFacturacionDefecto;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFacturacionDefecto() {
		return this.jComboBoxTiposReportesParametroFacturacionDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposReportesParametroFacturacionDefecto) {
		this.jComboBoxTiposReportesParametroFacturacionDefecto = jComboBoxTiposReportesParametroFacturacionDefecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFacturacionDefecto() {
	//	return jComboBoxTiposReportesDinamicoParametroFacturacionDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFacturacionDefecto(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFacturacionDefecto) {
	//	this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto = jComboBoxTiposReportesDinamicoParametroFacturacionDefecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto = jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto;
	//}
	
	public void setBorderResaltarTiposReportesParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFacturacionDefecto() {
		return this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposGraficosReportesParametroFacturacionDefecto) {
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto = jComboBoxTiposGraficosReportesParametroFacturacionDefecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFacturacionDefecto() {
		return this.jComboBoxTiposPaginacionParametroFacturacionDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFacturacionDefecto(
			JComboBox jComboBoxTiposPaginacionParametroFacturacionDefecto) {
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto = jComboBoxTiposPaginacionParametroFacturacionDefecto;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFacturacionDefecto() {
		return this.jComboBoxTiposRelacionesParametroFacturacionDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFacturacionDefecto() {
		return this.jComboBoxTiposAccionesParametroFacturacionDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposRelacionesParametroFacturacionDefecto) {
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto = jComboBoxTiposRelacionesParametroFacturacionDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposAccionesParametroFacturacionDefecto) {
		this.jComboBoxTiposAccionesParametroFacturacionDefecto = jComboBoxTiposAccionesParametroFacturacionDefecto;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFacturacionDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFacturacionDefecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFacturacionDefecto() {
	//	return jCheckBoxConGraficoDinamicoParametroFacturacionDefecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFacturacionDefecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFacturacionDefecto) {
	//	this.jCheckBoxConGraficoDinamicoParametroFacturacionDefecto = jCheckBoxConGraficoDinamicoParametroFacturacionDefecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFacturacionDefecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFacturacionDefecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFacturacionDefecto .setBorder(borderResaltar);		
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
		this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
		
		this.parametrofacturaciondefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofacturaciondefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFacturacionDefectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFacturacionDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFacturacionDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFacturacionDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFacturacionDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Facturacion Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFacturacionDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFacturacionDefecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"nuevo","nuevo","Nuevo"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"duplicar","duplicar","Duplicar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"copiar","copiar","Copiar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"ver_form","ver_form","Ver"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"recargar","recargar","Recargar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,
							"cerrar","cerrar","Salir"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFacturacionDefecto;
			
				this.jButtonProcesarInformacionToolBarParametroFacturacionDefecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFacturacionDefecto;
				
		//protected JButton jButtonModificarToolBarParametroFacturacionDefecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFacturacionDefecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFacturacionDefecto=new JMenuMe("General");
		this.jmenuArchivoParametroFacturacionDefecto=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFacturacionDefecto=new JMenuMe("Acciones");
		this.jmenuDatosParametroFacturacionDefecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFacturacionDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFacturacionDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFacturacionDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFacturacionDefecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFacturacionDefecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFacturacionDefecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFacturacionDefecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFacturacionDefecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFacturacionDefecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFacturacionDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFacturacionDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFacturacionDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFacturacionDefecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFacturacionDefecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFacturacionDefecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFacturacionDefecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFacturacionDefecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFacturacionDefecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFacturacionDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFacturacionDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFacturacionDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFacturacionDefecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFacturacionDefecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFacturacionDefecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFacturacionDefecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFacturacionDefecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFacturacionDefecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFacturacionDefecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFacturacionDefecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFacturacionDefecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFacturacionDefecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFacturacionDefecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFacturacionDefecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFacturacionDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFacturacionDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFacturacionDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFacturacionDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFacturacionDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFacturacionDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFacturacionDefecto.add(this.jMenuItemCerrarParametroFacturacionDefecto);
			
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemNuevoParametroFacturacionDefecto);
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto);
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemNuevoRelacionesParametroFacturacionDefecto);
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto);		
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemDuplicarParametroFacturacionDefecto);		
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemCopiarParametroFacturacionDefecto);		
			this.jmenuAccionesParametroFacturacionDefecto.add(this.jMenuItemVerFormParametroFacturacionDefecto);		
			
			this.jmenuDatosParametroFacturacionDefecto.add(this.jMenuItemRecargarInformacionParametroFacturacionDefecto);				
			this.jmenuDatosParametroFacturacionDefecto.add(this.jMenuItemAnterioresParametroFacturacionDefecto);				
			this.jmenuDatosParametroFacturacionDefecto.add(this.jMenuItemSiguientesParametroFacturacionDefecto);				
			this.jmenuDatosParametroFacturacionDefecto.add(this.jMenuItemAbrirOrderByParametroFacturacionDefecto);				
			this.jmenuDatosParametroFacturacionDefecto.add(this.jMenuItemMostrarOcultarParametroFacturacionDefecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFacturacionDefecto.add(this.jMenuItemGuardarCambiosParametroFacturacionDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFacturacionDefecto.add(this.jmenuArchivoParametroFacturacionDefecto);		
			this.jmenuBarParametroFacturacionDefecto.add(this.jmenuAccionesParametroFacturacionDefecto);		
			this.jmenuBarParametroFacturacionDefecto.add(this.jmenuDatosParametroFacturacionDefecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFacturacionDefecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFacturacionDefecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto.setToolTipText("Buscar Por T. Via Transporte ");
		this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto= new JButtonMe();
		this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto.setText("Buscar");
		this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto.setToolTipText("Buscar Por T. Via Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto,"buscar_button","Buscar Por T. Via Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto = new JLabelMe();
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setText("T. Via Transporte :");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setToolTipText("T. Via Transporte");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFacturacionDefecto=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFacturacionDefecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFacturacionDefecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFacturacionDefecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFacturacionDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFacturacionDefecto = new ParametroFacturacionDefectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Facturacion Defecto DATOS");
			this.jInternalFrameDetalleFormParametroFacturacionDefecto = new ParametroFacturacionDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones(),this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto = null;//new ParametroFacturacionDefectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFacturacionDefecto= new GridBagLayout();
		
		
		this.jTableDatosParametroFacturacionDefecto = new JTableMe();      
		
		String sToolTipParametroFacturacionDefecto="";
		sToolTipParametroFacturacionDefecto=ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFacturacionDefecto+="(Facturacion.ParametroFacturacionDefecto)";
		}
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFacturacionDefecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFacturacionDefecto.setToolTipText(sToolTipParametroFacturacionDefecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFacturacionDefecto);
		this.jTableDatosParametroFacturacionDefecto.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFacturacionDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFacturacionDefecto.setRowSelectionAllowed(true);
		this.jTableDatosParametroFacturacionDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFacturacionDefecto = new JButtonMe();
		this.jButtonDuplicarParametroFacturacionDefecto = new JButtonMe();
		this.jButtonCopiarParametroFacturacionDefecto = new JButtonMe();
		this.jButtonVerFormParametroFacturacionDefecto = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFacturacionDefecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto = new JButtonMe();
		this.jButtonCerrarParametroFacturacionDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroFacturacionDefecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFacturacionDefecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Facturacion Defecto";
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Facturacion Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFacturacionDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFacturacionDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroFacturacionDefecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroFacturacionDefecto=new ReporteDinamicoJInternalFrame(ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFacturacionDefecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFacturacionDefecto=new ImportacionJInternalFrame(ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFacturacionDefecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFacturacionDefecto = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFacturacionDefecto.setText("Orden");
		this.jButtonAbrirOrderByParametroFacturacionDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFacturacionDefecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFacturacionDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFacturacionDefecto,false,this);
			
			//this.cargarOrderByParametroFacturacionDefecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFacturacionDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFacturacionDefecto,true,this);
			
			//this.cargarOrderByParametroFacturacionDefecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFacturacionDefecto.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosParametroFacturacionDefecto.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosParametroFacturacionDefecto.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosParametroFacturacionDefecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFacturacionDefecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFacturacionDefecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFacturacionDefecto.setText("Nuevo");
		this.jButtonDuplicarParametroFacturacionDefecto.setText("Duplicar");
		this.jButtonCopiarParametroFacturacionDefecto.setText("Copiar");
		this.jButtonVerFormParametroFacturacionDefecto.setText("Ver");
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.setText("Guardar");
		this.jButtonCerrarParametroFacturacionDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFacturacionDefecto,"nuevo_button","Nuevo",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFacturacionDefecto,"duplicar_button","Duplicar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFacturacionDefecto,"copiar_button","Copiar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFacturacionDefecto,"ver_form","Ver",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFacturacionDefecto,"nuevorelaciones_button","Nuevo Rel",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFacturacionDefecto,"guardarcambiostabla_button","Guardar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFacturacionDefecto,"cerrar_button","Salir",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFacturacionDefecto.setToolTipText("Nuevo"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFacturacionDefecto.setToolTipText("Duplicar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFacturacionDefecto.setToolTipText("Copiar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFacturacionDefecto.setToolTipText("Ver"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.setToolTipText("Nuevo Rel"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.setToolTipText("Guardar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFacturacionDefecto.setToolTipText("Salir"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFacturacionDefecto";
		inputMap = this.jButtonNuevoParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFacturacionDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFacturacionDefecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFacturacionDefecto";
		inputMap = this.jButtonDuplicarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFacturacionDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFacturacionDefecto"));
		
		//COPIAR
		sMapKey = "CopiarParametroFacturacionDefecto";
		inputMap = this.jButtonCopiarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFacturacionDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFacturacionDefecto"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFacturacionDefecto";
		inputMap = this.jButtonVerFormParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFacturacionDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFacturacionDefecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFacturacionDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFacturacionDefecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFacturacionDefecto";
		inputMap = this.jButtonModificarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFacturacionDefecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFacturacionDefecto";
		inputMap = this.jButtonCerrarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFacturacionDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFacturacionDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFacturacionDefecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFacturacionDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFacturacionDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFacturacionDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFacturacionDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFacturacionDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFacturacionDefecto.setName("jPanelParametrosReportesParametroFacturacionDefecto"); 
		
		this.jPanelParametrosReportesAccionesParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFacturacionDefecto.setName("jPanelParametrosReportesAccionesParametroFacturacionDefecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFacturacionDefecto = new JButtonMe();
		this.jButtonRecargarInformacionParametroFacturacionDefecto.setText("Recargar");
		this.jButtonRecargarInformacionParametroFacturacionDefecto.setToolTipText("Recargar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFacturacionDefecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFacturacionDefecto = new JButtonMe();
		this.jButtonProcesarInformacionParametroFacturacionDefecto.setText("Procesar");
		this.jButtonProcesarInformacionParametroFacturacionDefecto.setToolTipText("Procesar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFacturacionDefecto.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFacturacionDefecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFacturacionDefecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFacturacionDefecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFacturacionDefecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFacturacionDefecto.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFacturacionDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFacturacionDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroFacturacionDefecto.setText("Acciones");		
		this.jLabelAccionesParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFacturacionDefecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFacturacionDefecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFacturacionDefecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFacturacionDefecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFacturacionDefecto = new JButtonMe();
		//this.jButtonAnterioresParametroFacturacionDefecto.setText("<<");
        this.jButtonAnterioresParametroFacturacionDefecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFacturacionDefecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFacturacionDefecto = new JButtonMe();
		//this.jButtonSiguientesParametroFacturacionDefecto.setText(">>");
        this.jButtonSiguientesParametroFacturacionDefecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFacturacionDefecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto,"nuevoguardarcambios_button","Nue",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFacturacionDefecto";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFacturacionDefecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFacturacionDefecto";
		inputMap = this.jButtonRecargarInformacionParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFacturacionDefecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFacturacionDefecto";
		inputMap = this.jButtonSiguientesParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFacturacionDefecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFacturacionDefecto";
		inputMap = this.jButtonAnterioresParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFacturacionDefecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFacturacionDefecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFacturacionDefecto.setMinimumSize(new Dimension(this.getWidth(),ParametroFacturacionDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFacturacionDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFacturacionDefecto.setMaximumSize(new Dimension(this.getWidth(),ParametroFacturacionDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFacturacionDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFacturacionDefecto.setPreferredSize(new Dimension(this.getWidth(),ParametroFacturacionDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFacturacionDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFacturacionDefecto = new GridBagLayout();

			this.jPanelPaginacionParametroFacturacionDefecto.setLayout(gridaBagLayoutPaginacionParametroFacturacionDefecto);						
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonAnterioresParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
					
						
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
			
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
						
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonSiguientesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonNuevoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
						
			
			
			if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
				this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonGuardarCambiosTablaParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			}
			
			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonDuplicarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonCopiarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonVerFormParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFacturacionDefecto.add(this.jButtonCerrarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
		
		
		this.jButtonRecargarInformacionParametroFacturacionDefecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFacturacionDefecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFacturacionDefecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFacturacionDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFacturacionDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFacturacionDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFacturacionDefecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFacturacionDefecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFacturacionDefecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFacturacionDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFacturacionDefecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFacturacionDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFacturacionDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFacturacionDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFacturacionDefecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFacturacionDefecto.setLayout(gridaBagParametrosReportesParametroFacturacionDefecto);
			this.jPanelParametrosReportesAccionesParametroFacturacionDefecto.setLayout(gridaBagParametrosReportesAccionesParametroFacturacionDefecto);
			
			
			this.jPanelParametrosAuxiliar1ParametroFacturacionDefecto.setLayout(gridaBagParametrosAuxiliar1ParametroFacturacionDefecto);
			this.jPanelParametrosAuxiliar2ParametroFacturacionDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroFacturacionDefecto);
			this.jPanelParametrosAuxiliar3ParametroFacturacionDefecto.setLayout(gridaBagParametrosAuxiliar3ParametroFacturacionDefecto);
			this.jPanelParametrosAuxiliar4ParametroFacturacionDefecto.setLayout(gridaBagParametrosAuxiliar4ParametroFacturacionDefecto);
			//this.jPanelParametrosAuxiliar5ParametroFacturacionDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroFacturacionDefecto);			
			
			
			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jButtonRecargarInformacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFacturacionDefecto.add(this.jComboBoxTiposPaginacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFacturacionDefecto.add(this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFacturacionDefecto.add(this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jPanelParametrosAuxiliar1ParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFacturacionDefecto.add(this.jComboBoxTiposReportesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jPanelParametrosAuxiliar4ParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jComboBoxTiposReportesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jCheckBoxGenerarReporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jPanelParametrosAuxiliar2ParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jLabelAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jButtonAbrirOrderByParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jComboBoxTiposSeleccionarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
			
			
			/*
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFacturacionDefecto.add(this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);															
				
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFacturacionDefecto.add(this.jCheckBoxSeleccionadosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jPanelParametrosAuxiliar3ParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jComboBoxTiposAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
	
				
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFacturacionDefecto.add(this.jTextFieldValorCampoGeneralParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFacturacionDefecto = new GridBagLayout();

			this.jScrollPanelDatosParametroFacturacionDefecto.setLayout(gridaBagLayoutDatosParametroFacturacionDefecto);
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
			
			this.jScrollPanelDatosParametroFacturacionDefecto.add(this.jTableDatosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFacturacionDefecto.setViewportView(this.jTableDatosParametroFacturacionDefecto);
		this.jTableDatosParametroFacturacionDefecto.setFillsViewportHeight(true);
		this.jTableDatosParametroFacturacionDefecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFacturacionDefecto= new GridBagLayout();
		this.jPanelAccionesParametroFacturacionDefecto.setLayout(gridaBagLayoutAccionesParametroFacturacionDefecto);
		
		
		/*	
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
			
		this.jPanelAccionesParametroFacturacionDefecto.add(this.jButtonNuevoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoViaTransporteParametroFacturacionDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoViaTransporteParametroFacturacionDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteParametroFacturacionDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteParametroFacturacionDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoViaTransporteParametroFacturacionDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto.setLayout(gridaBagLayoutFK_IdTipoViaTransporteParametroFacturacionDefecto);

		gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
		jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto.add(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto, gridBagConstraintsParametroFacturacionDefecto);

		gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		gridBagConstraintsParametroFacturacionDefecto.gridx = 1;
		jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto.add(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto, gridBagConstraintsParametroFacturacionDefecto);

		gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFacturacionDefecto.gridy = 1;
		gridBagConstraintsParametroFacturacionDefecto.gridx =1;
		jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto.add(jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto, gridBagConstraintsParametroFacturacionDefecto);

		jTabbedPaneBusquedasParametroFacturacionDefecto.addTab("1.-Por T. Via Transporte ", jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);
		jTabbedPaneBusquedasParametroFacturacionDefecto.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFacturacionDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFacturacionDefecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroFacturacionDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;		
		//this.gridBagConstraintsParametroFacturacionDefecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFacturacionDefecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;		
			this.gridBagConstraintsParametroFacturacionDefecto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);								
		
		
		/*
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		*/		
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =0;
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFacturacionDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
				
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFacturacionDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFacturacionDefecto = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFacturacionDefecto.setLayout(gridaBagLayoutBusquedasParametrosParametroFacturacionDefecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
			
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
			
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFacturacionDefecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFacturacionDefecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFacturacionDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFacturacionDefecto.setName("jPanelReporteDinamicoParametroFacturacionDefecto"); 
		
		this.jPanelReporteDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFacturacionDefecto.setLayout(gridaBagLayoutReporteDinamicoParametroFacturacionDefecto);
		
		
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFacturacionDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFacturacionDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Facturacion Defectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFacturacionDefecto = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFacturacionDefecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jLabelColumnasSelectReporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFacturacionDefecto = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFacturacionDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFacturacionDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFacturacionDefecto=new JScrollPane(this.jListColumnasSelectReporteParametroFacturacionDefecto);
			
			this.jScrollColumnasSelectReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jListColumnasSelectReporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jScrollColumnasSelectReporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFacturacionDefecto = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFacturacionDefecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFacturacionDefecto = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFacturacionDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFacturacionDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFacturacionDefecto=new JScrollPane(this.jListRelacionesSelectReporteParametroFacturacionDefecto);
			
			this.jScrollRelacionesSelectReporteParametroFacturacionDefecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFacturacionDefecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFacturacionDefecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFacturacionDefecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFacturacionDefecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFacturacionDefecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jLabelGenerarExcelReporteDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto.setToolTipText("Generar EXCEL"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jComboBoxTiposReportesDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jLabelTiposArchivoReporteDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto.setToolTipText("Generar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto.setToolTipText("Cancelar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFacturacionDefecto.add(this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFacturacionDefecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFacturacionDefecto= new JScrollPane(jPanelReporteDinamicoParametroFacturacionDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Facturacion Defectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFacturacionDefecto);
		this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFacturacionDefecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFacturacionDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFacturacionDefecto.setName("jPanelImportacionParametroFacturacionDefecto"); 
		
		this.jPanelImportacionParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFacturacionDefecto.setLayout(gridaBagLayoutImportacionParametroFacturacionDefecto);
		
		
		this.jInternalFrameImportacionParametroFacturacionDefecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFacturacionDefecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFacturacionDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFacturacionDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFacturacionDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFacturacionDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFacturacionDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFacturacionDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFacturacionDefecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFacturacionDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroFacturacionDefecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Facturacion Defectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFacturacionDefecto = new JLabelMe();

		this.jLabelArchivoImportacionParametroFacturacionDefecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFacturacionDefecto.add(this.jLabelArchivoImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFacturacionDefecto = new JFileChooser();		
		this.jFileChooserImportacionParametroFacturacionDefecto.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFacturacionDefecto = new JButtonMe();
		this.jButtonAbrirImportacionParametroFacturacionDefecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFacturacionDefecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFacturacionDefecto.setToolTipText("Generar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFacturacionDefecto.add(this.jButtonAbrirImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFacturacionDefecto = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFacturacionDefecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFacturacionDefecto.add(this.jLabelPathArchivoImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFacturacionDefecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFacturacionDefecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFacturacionDefecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFacturacionDefecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFacturacionDefecto.add(this.jTextFieldPathArchivoImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFacturacionDefecto = new JButtonMe();
		this.jButtonGenerarImportacionParametroFacturacionDefecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFacturacionDefecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFacturacionDefecto.setToolTipText("Generar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFacturacionDefecto.add(this.jButtonGenerarImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFacturacionDefecto = new JButtonMe();
		this.jButtonCerrarImportacionParametroFacturacionDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFacturacionDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFacturacionDefecto.setToolTipText("Cancelar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFacturacionDefecto.add(this.jButtonCerrarImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFacturacionDefecto = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFacturacionDefecto= new JScrollPane(jPanelImportacionParametroFacturacionDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFacturacionDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFacturacionDefecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFacturacionDefecto);
		this.jInternalFrameImportacionParametroFacturacionDefecto.getContentPane().add(this.jScrollPanelImportacionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFacturacionDefecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFacturacionDefecto = new JButtonMe();
			this.jButtonAbrirOrderByParametroFacturacionDefecto.setText("Orden");
			this.jButtonAbrirOrderByParametroFacturacionDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFacturacionDefecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFacturacionDefecto";
			inputMap = this.jButtonAbrirOrderByParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFacturacionDefecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFacturacionDefecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFacturacionDefecto.setName("jPanelOrderByParametroFacturacionDefecto"); 
			
			this.jPanelOrderByParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFacturacionDefecto.setLayout(gridaBagLayoutOrderByParametroFacturacionDefecto);
			
			
			this.jTableDatosParametroFacturacionDefectoOrderBy = new JTableMe();        
			this.jTableDatosParametroFacturacionDefectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFacturacionDefectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFacturacionDefectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFacturacionDefectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFacturacionDefectoOrderBy.setViewportView(this.jTableDatosParametroFacturacionDefectoOrderBy);
			this.jTableDatosParametroFacturacionDefectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFacturacionDefectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFacturacionDefecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFacturacionDefecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFacturacionDefecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFacturacionDefecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFacturacionDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFacturacionDefecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFacturacionDefecto.setTitle("Orden");
			this.jInternalFrameOrderByParametroFacturacionDefecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFacturacionDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFacturacionDefecto.setResizable(true);
			this.jInternalFrameOrderByParametroFacturacionDefecto.setClosable(true);
			this.jInternalFrameOrderByParametroFacturacionDefecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Facturacion Defectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFacturacionDefecto.ipady =150;
				
			this.jPanelOrderByParametroFacturacionDefecto.add(jScrollPanelDatosParametroFacturacionDefectoOrderBy, this.gridBagConstraintsParametroFacturacionDefecto);//this.jTableDatosParametroFacturacionDefectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFacturacionDefecto = new JButtonMe();
			this.jButtonCerrarOrderByParametroFacturacionDefecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFacturacionDefecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFacturacionDefecto.setToolTipText("Cancelar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFacturacionDefecto.add(this.jButtonCerrarOrderByParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFacturacionDefecto = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFacturacionDefecto= new JScrollPane(jPanelOrderByParametroFacturacionDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFacturacionDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFacturacionDefecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFacturacionDefecto);
			
			this.jInternalFrameOrderByParametroFacturacionDefecto.getContentPane().add(this.jScrollPanelOrderByParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
		
		} else {
			this.jButtonAbrirOrderByParametroFacturacionDefecto = new JButtonMe();
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
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFacturacionDefecto.getRowHeight();//ParametroFacturacionDefectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.isSelected()) {
					iHeightTable=ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFacturacionDefecto.isSelected()) {
					iHeightTable=ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFacturacionDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFacturacionDefecto!=null && this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFacturacionDefecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFacturacionDefecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFacturacionDefecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofacturaciondefectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFacturacionDefecto> TraerParametroFacturacionDefectoBeans(List<ParametroFacturacionDefecto> parametrofacturaciondefectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFacturacionDefecto parametrofacturaciondefecto:parametrofacturaciondefectos) {
					
				if(!(ParametroFacturacionDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFacturacionDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofacturaciondefecto.setsDetalleGeneralEntityReporte(ParametroFacturacionDefectoConstantesFunciones.getParametroFacturacionDefectoDescripcion(parametrofacturaciondefecto));
										
						
					
						
					
				} else  {
							
					//parametrofacturaciondefecto.setsDetalleGeneralEntityReporte(parametrofacturaciondefecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofacturaciondefectobeans.add(parametrofacturaciondefectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofacturaciondefectos;
    }
	//PARA REPORTES FIN
}
