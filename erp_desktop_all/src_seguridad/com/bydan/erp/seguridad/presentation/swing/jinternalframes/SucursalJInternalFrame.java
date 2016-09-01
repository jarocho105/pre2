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



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.seguridad.util.SucursalConstantesFunciones;

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
public class SucursalJInternalFrame extends SucursalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSucursal;
	
	protected JMenuBar jmenuBarSucursal;
	
	protected JMenu jmenuSucursal;
	protected JMenu jmenuDatosSucursal;
	protected JMenu jmenuArchivoSucursal;
	protected JMenu jmenuAccionesSucursal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSucursal;	
	protected GridBagConstraints gridBagConstraintsSucursal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SucursalDetalleFormJInternalFrame jInternalFrameDetalleFormSucursal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSucursal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSucursal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public SucursalSessionBean sucursalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Sucursal> sucursals;		
	public List<Sucursal> sucursalsEliminados;	
	public List<Sucursal> sucursalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySucursal;		
	protected JButton jButtonAbrirOrderBySucursal;
	
	
	//protected JPanel jPanelOrderBySucursal;
	//public JScrollPane jScrollPanelOrderBySucursal;	
	//protected JButton jButtonCerrarOrderBySucursal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SucursalLogic sucursalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSucursal;
	public JScrollPane jScrollPanelDatosEdicionSucursal;
	public JScrollPane jScrollPanelDatosGeneralSucursal;
    
	
	
	//public JScrollPane jScrollPanelDatosSucursalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSucursal;
	//public JScrollPane jScrollPanelImportacionSucursal;
	
	
	
	protected JPanel jPanelAccionesSucursal;
	
    protected JPanel jPanelPaginacionSucursal;
    protected JPanel jPanelParametrosReportesSucursal;
	protected JPanel jPanelParametrosReportesAccionesSucursal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Sucursal;
	protected JPanel jPanelParametrosAuxiliar2Sucursal;
	protected JPanel jPanelParametrosAuxiliar3Sucursal;
	protected JPanel jPanelParametrosAuxiliar4Sucursal;
	//protected JPanel jPanelParametrosAuxiliar5Sucursal;
	
	
	
	//protected JPanel jPanelReporteDinamicoSucursal;
	//protected JPanel jPanelImportacionSucursal;
	
	
	public JTable jTableDatosSucursal;
	
	
	
	//public JTable jTableDatosSucursalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSucursal;
	protected JButton jButtonDuplicarSucursal;
	protected JButton jButtonCopiarSucursal;
	protected JButton jButtonVerFormSucursal;
	protected JButton jButtonNuevoRelacionesSucursal;
	protected JButton jButtonModificarSucursal;
	
    protected JButton jButtonGuardarCambiosTablaSucursal;
	protected JButton jButtonCerrarSucursal;
	
	
	protected JButton jButtonRecargarInformacionSucursal;
	protected JButton jButtonProcesarInformacionSucursal;
	
	
	protected JButton jButtonAnterioresSucursal;
	protected JButton jButtonSiguientesSucursal;
	protected JButton jButtonNuevoGuardarCambiosSucursal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSucursal;
	//protected JButton jButtonCerrarReporteDinamicoSucursal;
	//protected JButton jButtonGenerarExcelReporteDinamicoSucursal;	
	
	
	
	//protected JButton jButtonAbrirImportacionSucursal;
	//protected JButton jButtonGenerarImportacionSucursal;
	//protected JButton jButtonCerrarImportacionSucursal;
	//protected JFileChooser jFileChooserImportacionSucursal;
	//protected File fileImportacionSucursal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSucursal;
	protected JButton jButtonDuplicarToolBarSucursal;
	protected JButton jButtonNuevoRelacionesToolBarSucursal;
	
	
	public JButton jButtonGuardarCambiosToolBarSucursal;
	protected JButton jButtonCopiarToolBarSucursal;
	protected JButton jButtonVerFormToolBarSucursal;
	public JButton jButtonGuardarCambiosTablaToolBarSucursal;
	protected JButton jButtonMostrarOcultarTablaToolBarSucursal;
	protected JButton jButtonCerrarToolBarSucursal;
	
	protected JButton jButtonRecargarInformacionToolBarSucursal;
	protected JButton jButtonProcesarInformacionToolBarSucursal;
	protected JButton jButtonAnterioresToolBarSucursal;
	protected JButton jButtonSiguientesToolBarSucursal;
	protected JButton jButtonNuevoGuardarCambiosToolBarSucursal;
	protected JButton jButtonAbrirOrderByToolBarSucursal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSucursal;
	protected JMenuItem jMenuItemDuplicarSucursal;
	protected JMenuItem jMenuItemNuevoRelacionesSucursal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSucursal;
	protected JMenuItem jMenuItemCopiarSucursal;
	protected JMenuItem jMenuItemVerFormSucursal;
	protected JMenuItem jMenuItemGuardarCambiosTablaSucursal;
	protected JMenuItem jMenuItemCerrarSucursal;
	protected JMenuItem jMenuItemDetalleCerrarSucursal;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySucursal;
	protected JMenuItem jMenuItemDetalleMostarOcultarSucursal;
	
	protected JMenuItem jMenuItemRecargarInformacionSucursal;
	protected JMenuItem jMenuItemProcesarInformacionSucursal;
	protected JMenuItem jMenuItemAnterioresSucursal;
	protected JMenuItem jMenuItemSiguientesSucursal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSucursal;
	protected JMenuItem jMenuItemAbrirOrderBySucursal;
	protected JMenuItem jMenuItemMostrarOcultarSucursal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSucursal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSucursal;
	protected JCheckBox jCheckBoxSeleccionadosSucursal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSucursal;
	protected JCheckBox jCheckBoxConGraficoReporteSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSucursal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSucursal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSucursal;
	protected JTextField jTextFieldValorCampoGeneralSucursal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSucursal;
	//public JList<Reporte> jListColumnasSelectReporteSucursal;
	//public JScrollPane jScrollColumnasSelectReporteSucursal;
	
	//public JLabel jLabelRelacionesSelectReporteSucursal;
	//public JList<Reporte> jListRelacionesSelectReporteSucursal;
	//public JScrollPane jScrollRelacionesSelectReporteSucursal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSucursal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSucursal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSucursal;
	//public JLabel jLabelTiposArchivoReporteDinamicoSucursal;
	
		
	//public JLabel jLabelArchivoImportacionSucursal;	
	//public JLabel jLabelPathArchivoImportacionSucursal;
	//protected JTextField jTextFieldPathArchivoImportacionSucursal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSucursal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSucursal;
	
	//public JLabel jLabelColumnaCategoriaValorSucursal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSucursal;
	
	//public JLabel jLabelColumnasValoresGraficoSucursal;
	//public JList<Reporte> jListColumnasValoresGraficoSucursal;
	//public JScrollPane jScrollColumnasValoresGraficoSucursal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSucursal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSucursal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSucursal;
	public JPanel jPanelFK_IdEmpresaSucursal;
	public JButton jButtonFK_IdEmpresaSucursal;
	public JPanel jPanelFK_IdPaisSucursal;
	public JButton jButtonFK_IdPaisSucursal;
	
	public JPanel jPanelid_empresaFK_IdEmpresaSucursal;
	public JLabel jLabelid_empresaFK_IdEmpresaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFK_IdEmpresaSucursal;
	public JButton jButtonid_empresaFK_IdEmpresaSucursal= new JButtonMe();
	public JButton jButtonid_empresaFK_IdEmpresaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_empresaFK_IdEmpresaSucursalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisSucursal;
	public JLabel jLabelid_paisFK_IdPaisSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisSucursal;
	public JButton jButtonid_paisFK_IdPaisSucursal= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisSucursalUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisSucursalBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SucursalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SucursalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSucursal)	{
		this.jButtonRecargarInformacionSucursal = jButtonRecargarInformacionSucursal;
	}
	
	public JButton getjButtonProcesarInformacionSucursal() {
		return this.jButtonProcesarInformacionSucursal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSucursal)	{
		this.jButtonProcesarInformacionSucursal = jButtonProcesarInformacionSucursal;
	}
	
	
	public JButton getjButtonRecargarInformacionSucursal() {
		return this.jButtonRecargarInformacionSucursal;
	}
	
	
	public List<Sucursal> getsucursals() {
		return this.sucursals;
	}

	public void setsucursals(List<Sucursal> sucursals) {
		this.sucursals = sucursals;
	}
	
	public List<Sucursal> getsucursalsAux() {
		return this.sucursalsAux;
	}

	public void setsucursalsAux(List<Sucursal> sucursalsAux) {
		this.sucursalsAux = sucursalsAux;
	}
	
	public List<Sucursal> getsucursalsEliminados() {
		return this.sucursalsEliminados;
	}

	public void setSucursalsEliminados(List<Sucursal> sucursalsEliminados) {
		this.sucursalsEliminados = sucursalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSucursal() {
		return jComboBoxTiposSeleccionarSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSucursal(
			JComboBox jComboBoxTiposSeleccionarSucursal) {
		this.jComboBoxTiposSeleccionarSucursal = jComboBoxTiposSeleccionarSucursal;
	}
	
	public void setBorderResaltarTiposSeleccionarSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSucursal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSucursal() {
		return jTextFieldValorCampoGeneralSucursal;
	}

	public void setjTextFieldValorCampoGeneralSucursal(
			JTextField jTextFieldValorCampoGeneralSucursal) {
		this.jTextFieldValorCampoGeneralSucursal = jTextFieldValorCampoGeneralSucursal;
	}

	public void setBorderResaltarValorCampoGeneralSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSucursal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSucursal() {
		return this.jCheckBoxSeleccionarTodosSucursal;
	}

	public void setjCheckBoxSeleccionarTodosSucursal(
			JCheckBox jCheckBoxSeleccionarTodosSucursal) {
		this.jCheckBoxSeleccionarTodosSucursal = jCheckBoxSeleccionarTodosSucursal;
	}

	public void setBorderResaltarSeleccionarTodosSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSucursal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSucursal() {
		return this.jCheckBoxSeleccionadosSucursal;
	}

	public void setjCheckBoxSeleccionadosSucursal(
			JCheckBox jCheckBoxSeleccionadosSucursal) {
		this.jCheckBoxSeleccionadosSucursal = jCheckBoxSeleccionadosSucursal;
	}
	
	public void setBorderResaltarSeleccionadosSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSucursal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSucursal() {
		return this.jComboBoxTiposArchivosReportesSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSucursal(
			JComboBox jComboBoxTiposArchivosReportesSucursal) {
		this.jComboBoxTiposArchivosReportesSucursal = jComboBoxTiposArchivosReportesSucursal;
	}

	public void setBorderResaltarTiposArchivosReportesSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSucursal() {
		return this.jComboBoxTiposReportesSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSucursal(
			JComboBox jComboBoxTiposReportesSucursal) {
		this.jComboBoxTiposReportesSucursal = jComboBoxTiposReportesSucursal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSucursal() {
	//	return jComboBoxTiposReportesDinamicoSucursal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSucursal(
	//		JComboBox jComboBoxTiposReportesDinamicoSucursal) {
	//	this.jComboBoxTiposReportesDinamicoSucursal = jComboBoxTiposReportesDinamicoSucursal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSucursal() {
	//	return jComboBoxTiposArchivosReportesDinamicoSucursal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSucursal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSucursal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSucursal = jComboBoxTiposArchivosReportesDinamicoSucursal;
	//}
	
	public void setBorderResaltarTiposReportesSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSucursal() {
		return this.jComboBoxTiposGraficosReportesSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSucursal(
			JComboBox jComboBoxTiposGraficosReportesSucursal) {
		this.jComboBoxTiposGraficosReportesSucursal = jComboBoxTiposGraficosReportesSucursal;
	}
	
	public void setBorderResaltarTiposGraficosReportesSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSucursal() {
		return this.jComboBoxTiposPaginacionSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSucursal(
			JComboBox jComboBoxTiposPaginacionSucursal) {
		this.jComboBoxTiposPaginacionSucursal = jComboBoxTiposPaginacionSucursal;
	}
	
	public void setBorderResaltarTiposPaginacionSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSucursal() {
		return this.jComboBoxTiposRelacionesSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSucursal() {
		return this.jComboBoxTiposAccionesSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSucursal(
			JComboBox jComboBoxTiposRelacionesSucursal) {
		this.jComboBoxTiposRelacionesSucursal = jComboBoxTiposRelacionesSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSucursal(
			JComboBox jComboBoxTiposAccionesSucursal) {
		this.jComboBoxTiposAccionesSucursal = jComboBoxTiposAccionesSucursal;
	}
	
	public void setBorderResaltarTiposRelacionesSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSucursal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSucursal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSucursal() {
	//	return jCheckBoxConGraficoDinamicoSucursal;
	//}

	//public void setjCheckBoxConGraficoDinamicoSucursal(
	//		JCheckBox jCheckBoxConGraficoDinamicoSucursal) {
	//	this.jCheckBoxConGraficoDinamicoSucursal = jCheckBoxConGraficoDinamicoSucursal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSucursal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSucursal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSucursal .setBorder(borderResaltar);		
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
		this.sucursalSessionBean=new SucursalSessionBean();
		
		this.sucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sucursalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SucursalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SucursalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SucursalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sucursal MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
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
		
		SucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Sucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSucursal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSucursal,this.jTtoolBarSucursal,
							"nuevo","nuevo","Nuevo"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSucursal,this.jTtoolBarSucursal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSucursal,this.jTtoolBarSucursal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSucursal,this.jTtoolBarSucursal,
							"duplicar","duplicar","Duplicar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSucursal,this.jTtoolBarSucursal,
							"copiar","copiar","Copiar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSucursal,this.jTtoolBarSucursal,
							"ver_form","ver_form","Ver"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSucursal,this.jTtoolBarSucursal,
							"recargar","recargar","Recargar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSucursal,this.jTtoolBarSucursal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSucursal,this.jTtoolBarSucursal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSucursal,this.jTtoolBarSucursal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSucursal,this.jTtoolBarSucursal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSucursal,this.jTtoolBarSucursal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSucursal,this.jTtoolBarSucursal,
							"cerrar","cerrar","Salir"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSucursal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSucursal;
			
				this.jButtonProcesarInformacionToolBarSucursal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSucursal;
				
		//protected JButton jButtonModificarToolBarSucursal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSucursal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSucursal=new JMenuMe("General");
		this.jmenuArchivoSucursal=new JMenuMe("Archivo");
		this.jmenuAccionesSucursal=new JMenuMe("Acciones");
		this.jmenuDatosSucursal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSucursal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSucursal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSucursal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSucursal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSucursal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSucursal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSucursal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSucursal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSucursal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSucursal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSucursal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSucursal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSucursal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSucursal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSucursal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSucursal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSucursal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSucursal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSucursal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSucursal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSucursal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSucursal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSucursal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSucursal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSucursal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSucursal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSucursal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSucursal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSucursal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSucursal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSucursal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSucursal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSucursal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySucursal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySucursal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySucursal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSucursal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySucursal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySucursal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySucursal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSucursal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSucursal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSucursal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSucursal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSucursal.add(this.jMenuItemCerrarSucursal);
			
			this.jmenuAccionesSucursal.add(this.jMenuItemNuevoSucursal);
			this.jmenuAccionesSucursal.add(this.jMenuItemNuevoGuardarCambiosSucursal);
			this.jmenuAccionesSucursal.add(this.jMenuItemNuevoRelacionesSucursal);
			this.jmenuAccionesSucursal.add(this.jMenuItemGuardarCambiosTablaSucursal);		
			this.jmenuAccionesSucursal.add(this.jMenuItemDuplicarSucursal);		
			this.jmenuAccionesSucursal.add(this.jMenuItemCopiarSucursal);		
			this.jmenuAccionesSucursal.add(this.jMenuItemVerFormSucursal);		
			
			this.jmenuDatosSucursal.add(this.jMenuItemRecargarInformacionSucursal);				
			this.jmenuDatosSucursal.add(this.jMenuItemAnterioresSucursal);				
			this.jmenuDatosSucursal.add(this.jMenuItemSiguientesSucursal);				
			this.jmenuDatosSucursal.add(this.jMenuItemAbrirOrderBySucursal);				
			this.jmenuDatosSucursal.add(this.jMenuItemMostrarOcultarSucursal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSucursal.add(this.jMenuItemGuardarCambiosSucursal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSucursal.add(this.jmenuArchivoSucursal);		
			this.jmenuBarSucursal.add(this.jmenuAccionesSucursal);		
			this.jmenuBarSucursal.add(this.jmenuDatosSucursal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSucursal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSucursal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpresaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpresaSucursal.setToolTipText("Buscar Por Empresa ");
		this.jButtonFK_IdEmpresaSucursal= new JButtonMe();
		this.jButtonFK_IdEmpresaSucursal.setText("Buscar");
		this.jButtonFK_IdEmpresaSucursal.setToolTipText("Buscar Por Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpresaSucursal,"buscar_button","Buscar Por Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpresaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresaFK_IdEmpresaSucursal = new JLabelMe();
		jLabelid_empresaFK_IdEmpresaSucursal.setText("Empresa :");
		jLabelid_empresaFK_IdEmpresaSucursal.setToolTipText("Empresa");
		jLabelid_empresaFK_IdEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaFK_IdEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empresaFK_IdEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFK_IdEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresaFK_IdEmpresaSucursal= new JComboBoxMe();
		jComboBoxid_empresaFK_IdEmpresaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFK_IdEmpresaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFK_IdEmpresaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFK_IdEmpresaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisSucursal.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisSucursal= new JButtonMe();
		this.jButtonFK_IdPaisSucursal.setText("Buscar");
		this.jButtonFK_IdPaisSucursal.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisSucursal,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisSucursal = new JLabelMe();
		jLabelid_paisFK_IdPaisSucursal.setText("Pais :");
		jLabelid_paisFK_IdPaisSucursal.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisSucursal= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisSucursal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSucursal=new JTabbedPane();


		this.jTabbedPaneBusquedasSucursal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSucursal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSucursal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSucursal = new SucursalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sucursal DATOS");
			this.jInternalFrameDetalleFormSucursal = new SucursalDetalleFormJInternalFrame(jDesktopPane,this.sucursalSessionBean.getConGuardarRelaciones(),this.sucursalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSucursal = null;//new SucursalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSucursal= new GridBagLayout();
		
		
		this.jTableDatosSucursal = new JTableMe();      
		
		String sToolTipSucursal="";
		sToolTipSucursal=SucursalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSucursal+="(Seguridad.Sucursal)";
		}
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			sToolTipSucursal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSucursal.setToolTipText(sToolTipSucursal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSucursal);
		this.jTableDatosSucursal.setAutoCreateRowSorter(true);
		this.jTableDatosSucursal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSucursal.setRowSelectionAllowed(true);
		this.jTableDatosSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSucursal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSucursal = new JButtonMe();
		this.jButtonDuplicarSucursal = new JButtonMe();
		this.jButtonCopiarSucursal = new JButtonMe();
		this.jButtonVerFormSucursal = new JButtonMe();
		this.jButtonNuevoRelacionesSucursal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSucursal = new JButtonMe();
		this.jButtonCerrarSucursal = new JButtonMe();
		
		this.jScrollPanelDatosSucursal = new JScrollPane();   
        this.jScrollPanelDatosGeneralSucursal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sucursal";
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursales" + this.sPath));
		} else {
			this.jScrollPanelDatosSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSucursal.setToolTipText("Acciones");
        this.jPanelAccionesSucursal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSucursal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSucursal=new ReporteDinamicoJInternalFrame(SucursalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSucursal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSucursal=new ImportacionJInternalFrame(SucursalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSucursal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySucursal = new JButtonMe();
		
		this.jButtonAbrirOrderBySucursal.setText("Orden");
		this.jButtonAbrirOrderBySucursal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySucursal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySucursal,false,this);
			
			//this.cargarOrderBySucursal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySucursal,true,this);
			
			//this.cargarOrderBySucursal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSucursal.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosSucursal.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosSucursal.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosSucursal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSucursal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSucursal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSucursal.setText("Nuevo");
		this.jButtonDuplicarSucursal.setText("Duplicar");
		this.jButtonCopiarSucursal.setText("Copiar");
		this.jButtonVerFormSucursal.setText("Ver");
		this.jButtonNuevoRelacionesSucursal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSucursal.setText("Guardar");
		this.jButtonCerrarSucursal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSucursal,"nuevo_button","Nuevo",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSucursal,"duplicar_button","Duplicar",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSucursal,"copiar_button","Copiar",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSucursal,"ver_form","Ver",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSucursal,"nuevorelaciones_button","Nuevo Rel",this.sucursalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSucursal,"guardarcambiostabla_button","Guardar",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSucursal,"cerrar_button","Salir",this.sucursalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSucursal.setToolTipText("Nuevo"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSucursal.setToolTipText("Duplicar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSucursal.setToolTipText("Copiar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSucursal.setToolTipText("Ver"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSucursal.setToolTipText("Nuevo Rel"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSucursal.setToolTipText("Guardar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSucursal.setToolTipText("Salir"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSucursal";
		inputMap = this.jButtonNuevoSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSucursal"));
		
		//DUPLICAR
		sMapKey = "DuplicarSucursal";
		inputMap = this.jButtonDuplicarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSucursal"));
		
		//COPIAR
		sMapKey = "CopiarSucursal";
		inputMap = this.jButtonCopiarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSucursal"));
		
		//VEr FORM
		sMapKey = "VerFormSucursal";
		inputMap = this.jButtonVerFormSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSucursal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSucursal";
		inputMap = this.jButtonNuevoRelacionesSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSucursal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSucursal";
		inputMap = this.jButtonModificarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSucursal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSucursal";
		inputMap = this.jButtonCerrarSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSucursal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSucursal";
		inputMap = this.jButtonGuardarCambiosTablaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSucursal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Sucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Sucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Sucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Sucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Sucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSucursal.setName("jPanelParametrosReportesSucursal"); 
		
		this.jPanelParametrosReportesAccionesSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSucursal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSucursal.setName("jPanelParametrosReportesAccionesSucursal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSucursal = new JButtonMe();
		this.jButtonRecargarInformacionSucursal.setText("Recargar");
		this.jButtonRecargarInformacionSucursal.setToolTipText("Recargar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSucursal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSucursal = new JButtonMe();
		this.jButtonProcesarInformacionSucursal.setText("Procesar");
		this.jButtonProcesarInformacionSucursal.setToolTipText("Procesar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSucursal.setVisible(false);
			
		this.jButtonProcesarInformacionSucursal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSucursal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSucursal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSucursal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSucursal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSucursal.setText("TIPO");       
		this.jComboBoxTiposReportesSucursal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSucursal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSucursal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSucursal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSucursal.setText("Paginacion");
		this.jComboBoxTiposPaginacionSucursal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSucursal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSucursal.setText("Accion");
		this.jComboBoxTiposRelacionesSucursal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSucursal.setText("Accion");
		this.jComboBoxTiposAccionesSucursal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSucursal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSucursal.setText("Accion");
		this.jComboBoxTiposSeleccionarSucursal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSucursal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSucursal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSucursal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSucursal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSucursal = new JLabelMe();
		
		this.jLabelAccionesSucursal.setText("Acciones");		
		this.jLabelAccionesSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSucursal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSucursal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSucursal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSucursal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSucursal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSucursal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSucursal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSucursal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSucursal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSucursal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSucursal.setText("Graf.");
		this.jCheckBoxConGraficoReporteSucursal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSucursal = new JButtonMe();
		//this.jButtonAnterioresSucursal.setText("<<");
        this.jButtonAnterioresSucursal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSucursal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSucursal = new JButtonMe();
		//this.jButtonSiguientesSucursal.setText(">>");
        this.jButtonSiguientesSucursal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSucursal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSucursal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSucursal.setText("Nue");
        this.jButtonNuevoGuardarCambiosSucursal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSucursal,"nuevoguardarcambios_button","Nue",this.sucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSucursal";
		inputMap = this.jButtonNuevoGuardarCambiosSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSucursal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSucursal";
		inputMap = this.jButtonRecargarInformacionSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSucursal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSucursal";
		inputMap = this.jButtonSiguientesSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSucursal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSucursal";
		inputMap = this.jButtonAnterioresSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSucursal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSucursal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSucursal.setMinimumSize(new Dimension(this.getWidth(),SucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SucursalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSucursal.setMaximumSize(new Dimension(this.getWidth(),SucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SucursalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSucursal.setPreferredSize(new Dimension(this.getWidth(),SucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SucursalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSucursal = new GridBagLayout();

			this.jPanelPaginacionSucursal.setLayout(gridaBagLayoutPaginacionSucursal);						
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 0;
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSucursal.add(this.jButtonAnterioresSucursal, this.gridBagConstraintsSucursal);
					
						
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSucursal.gridy = 0;
			
			this.jPanelPaginacionSucursal.add(this.jButtonNuevoGuardarCambiosSucursal, this.gridBagConstraintsSucursal);
						
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSucursal.gridy = 0;
			this.jPanelPaginacionSucursal.add(this.jButtonSiguientesSucursal, this.gridBagConstraintsSucursal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 1;
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSucursal.add(this.jButtonNuevoSucursal, this.gridBagConstraintsSucursal);
						
			
			
			if(!this.sucursalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSucursal = new GridBagConstraints();
				this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSucursal.gridy = 1;
				this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSucursal.add(this.jButtonGuardarCambiosTablaSucursal, this.gridBagConstraintsSucursal);
			}
			
			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 1;
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSucursal.add(this.jButtonDuplicarSucursal, this.gridBagConstraintsSucursal);
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 1;
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSucursal.add(this.jButtonCopiarSucursal, this.gridBagConstraintsSucursal);
		
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 1;
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSucursal.add(this.jButtonVerFormSucursal, this.gridBagConstraintsSucursal);
		
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 1;
			this.gridBagConstraintsSucursal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSucursal.add(this.jButtonCerrarSucursal, this.gridBagConstraintsSucursal);
		
		
		
		this.jButtonRecargarInformacionSucursal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSucursal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSucursal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSucursal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSucursal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSucursal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSucursal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSucursal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSucursal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSucursal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSucursal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSucursal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSucursal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSucursal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSucursal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSucursal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSucursal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSucursal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSucursal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSucursal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSucursal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSucursal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSucursal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSucursal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSucursal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Sucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Sucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Sucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Sucursal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSucursal.setLayout(gridaBagParametrosReportesSucursal);
			this.jPanelParametrosReportesAccionesSucursal.setLayout(gridaBagParametrosReportesAccionesSucursal);
			
			
			this.jPanelParametrosAuxiliar1Sucursal.setLayout(gridaBagParametrosAuxiliar1Sucursal);
			this.jPanelParametrosAuxiliar2Sucursal.setLayout(gridaBagParametrosAuxiliar2Sucursal);
			this.jPanelParametrosAuxiliar3Sucursal.setLayout(gridaBagParametrosAuxiliar3Sucursal);
			this.jPanelParametrosAuxiliar4Sucursal.setLayout(gridaBagParametrosAuxiliar4Sucursal);
			//this.jPanelParametrosAuxiliar5Sucursal.setLayout(gridaBagParametrosAuxiliar2Sucursal);			
			
			
			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSucursal.add(this.jButtonRecargarInformacionSucursal, this.gridBagConstraintsSucursal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sucursal.add(this.jComboBoxTiposPaginacionSucursal, this.gridBagConstraintsSucursal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sucursal.add(this.jCheckBoxConAltoMaximoTablaSucursal, this.gridBagConstraintsSucursal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sucursal.add(this.jComboBoxTiposArchivosReportesSucursal, this.gridBagConstraintsSucursal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSucursal.add(this.jPanelParametrosAuxiliar1Sucursal, this.gridBagConstraintsSucursal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Sucursal.add(this.jComboBoxTiposReportesSucursal, this.gridBagConstraintsSucursal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSucursal.add(this.jPanelParametrosAuxiliar4Sucursal, this.gridBagConstraintsSucursal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSucursal.add(this.jComboBoxTiposReportesSucursal, this.gridBagConstraintsSucursal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSucursal.add(this.jCheckBoxGenerarReporteSucursal, this.gridBagConstraintsSucursal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSucursal.add(this.jPanelParametrosAuxiliar2Sucursal, this.gridBagConstraintsSucursal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSucursal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSucursal.add(this.jLabelAccionesSucursal, this.gridBagConstraintsSucursal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSucursal = new GridBagConstraints();
				this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSucursal.add(this.jButtonAbrirOrderBySucursal, this.gridBagConstraintsSucursal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSucursal.add(this.jComboBoxTiposSeleccionarSucursal, this.gridBagConstraintsSucursal);			
			
			
			/*
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSucursal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSucursal.add(this.jCheckBoxSeleccionarTodosSucursal, this.gridBagConstraintsSucursal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sucursal.add(this.jCheckBoxSeleccionarTodosSucursal, this.gridBagConstraintsSucursal);															
				
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sucursal.add(this.jCheckBoxSeleccionadosSucursal, this.gridBagConstraintsSucursal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSucursal.add(this.jPanelParametrosAuxiliar3Sucursal, this.gridBagConstraintsSucursal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSucursal.add(this.jComboBoxTiposAccionesSucursal, this.gridBagConstraintsSucursal);
	
				
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSucursal.add(this.jTextFieldValorCampoGeneralSucursal, this.gridBagConstraintsSucursal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSucursal = new GridBagLayout();

			this.jScrollPanelDatosSucursal.setLayout(gridaBagLayoutDatosSucursal);
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = 0;
			this.gridBagConstraintsSucursal.gridx = 0;
			
			this.jScrollPanelDatosSucursal.add(this.jTableDatosSucursal, this.gridBagConstraintsSucursal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSucursal.setViewportView(this.jTableDatosSucursal);
		this.jTableDatosSucursal.setFillsViewportHeight(true);
		this.jTableDatosSucursal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSucursal= new GridBagLayout();
		this.jPanelAccionesSucursal.setLayout(gridaBagLayoutAccionesSucursal);
		
		
		/*	
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = 0;
		this.gridBagConstraintsSucursal.gridx = 0;
			
		this.jPanelAccionesSucursal.add(this.jButtonNuevoSucursal, this.gridBagConstraintsSucursal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpresaSucursal= new GridBagLayout();
		gridaBagLayoutFK_IdEmpresaSucursal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpresaSucursal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpresaSucursal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpresaSucursal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpresaSucursal.setLayout(gridaBagLayoutFK_IdEmpresaSucursal);

		gridBagConstraintsSucursal = new GridBagConstraints();
		gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSucursal.gridy = 0;
		gridBagConstraintsSucursal.gridx = 0;
		jPanelFK_IdEmpresaSucursal.add(jLabelid_empresaFK_IdEmpresaSucursal, gridBagConstraintsSucursal);

		gridBagConstraintsSucursal = new GridBagConstraints();
		gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSucursal.gridy = 0;
		gridBagConstraintsSucursal.gridx = 1;
		jPanelFK_IdEmpresaSucursal.add(jComboBoxid_empresaFK_IdEmpresaSucursal, gridBagConstraintsSucursal);

		gridBagConstraintsSucursal = new GridBagConstraints();
		gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSucursal.gridy = 1;
		gridBagConstraintsSucursal.gridx =1;
		jPanelFK_IdEmpresaSucursal.add(jButtonFK_IdEmpresaSucursal, gridBagConstraintsSucursal);

		jTabbedPaneBusquedasSucursal.addTab("1.-Por Empresa ", jPanelFK_IdEmpresaSucursal);
		jTabbedPaneBusquedasSucursal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisSucursal= new GridBagLayout();
		gridaBagLayoutFK_IdPaisSucursal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisSucursal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisSucursal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisSucursal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisSucursal.setLayout(gridaBagLayoutFK_IdPaisSucursal);

		gridBagConstraintsSucursal = new GridBagConstraints();
		gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSucursal.gridy = 0;
		gridBagConstraintsSucursal.gridx = 0;
		jPanelFK_IdPaisSucursal.add(jLabelid_paisFK_IdPaisSucursal, gridBagConstraintsSucursal);

		gridBagConstraintsSucursal = new GridBagConstraints();
		gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSucursal.gridy = 0;
		gridBagConstraintsSucursal.gridx = 1;
		jPanelFK_IdPaisSucursal.add(jComboBoxid_paisFK_IdPaisSucursal, gridBagConstraintsSucursal);

		gridBagConstraintsSucursal = new GridBagConstraints();
		gridBagConstraintsSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSucursal.gridy = 1;
		gridBagConstraintsSucursal.gridx =1;
		jPanelFK_IdPaisSucursal.add(jButtonFK_IdPaisSucursal, gridBagConstraintsSucursal);

		jTabbedPaneBusquedasSucursal.addTab("2.-Por Pais ", jPanelFK_IdPaisSucursal);
		jTabbedPaneBusquedasSucursal.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSucursal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSucursal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSucursal = new GridBagConstraints();						
			this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSucursal.gridx = 0;		
			//this.gridBagConstraintsSucursal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSucursal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSucursal, this.gridBagConstraintsSucursal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSucursal.gridx = 0;		
		//this.gridBagConstraintsSucursal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSucursal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSucursal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSucursal.gridx = 0;		
			this.gridBagConstraintsSucursal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSucursal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSucursal, this.gridBagConstraintsSucursal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSucursal, this.gridBagConstraintsSucursal);								
		
		
		/*
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSucursal, this.gridBagConstraintsSucursal);
		*/		
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSucursal.gridx =0;
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSucursal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSucursal, this.gridBagConstraintsSucursal);
				
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSucursal, this.gridBagConstraintsSucursal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SucursalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSucursal = new GridBagLayout();
			this.jPanelBusquedasParametrosSucursal.setLayout(gridaBagLayoutBusquedasParametrosSucursal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSucursal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSucursal, this.gridBagConstraintsSucursal);
			
			
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSucursal, this.gridBagConstraintsSucursal);
		
			
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSucursal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSucursal, this.gridBagConstraintsSucursal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSucursal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSucursal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSucursal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSucursal.setName("jPanelReporteDinamicoSucursal"); 
		
		this.jPanelReporteDinamicoSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSucursal.setLayout(gridaBagLayoutReporteDinamicoSucursal);
		
		
		this.jInternalFrameReporteDinamicoSucursal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSucursal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSucursal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSucursal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSucursal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSucursal.setResizable(true);
	    this.jInternalFrameReporteDinamicoSucursal.setClosable(true);
	    this.jInternalFrameReporteDinamicoSucursal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSucursal = new JLabelMe();

		this.jLabelColumnasSelectReporteSucursal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSucursal.add(this.jLabelColumnasSelectReporteSucursal, this.gridBagConstraintsSucursal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSucursal = new JList<Reporte>();
		this.jListColumnasSelectReporteSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSucursal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSucursal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSucursal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSucursal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSucursal=new JScrollPane(this.jListColumnasSelectReporteSucursal);
			
			this.jScrollColumnasSelectReporteSucursal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSucursal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSucursal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSucursal.add(this.jListColumnasSelectReporteSucursal, this.gridBagConstraintsSucursal);
		this.jPanelReporteDinamicoSucursal.add(this.jScrollColumnasSelectReporteSucursal, this.gridBagConstraintsSucursal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSucursal = new JLabelMe();

		this.jLabelRelacionesSelectReporteSucursal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSucursal = new JList<Reporte>();
		this.jListRelacionesSelectReporteSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSucursal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSucursal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSucursal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSucursal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSucursal=new JScrollPane(this.jListRelacionesSelectReporteSucursal);
			
			this.jScrollRelacionesSelectReporteSucursal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSucursal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSucursal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSucursal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSucursal = new JComboBoxMe();
		this.jListColumnasValoresGraficoSucursal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSucursal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSucursal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSucursal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSucursal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSucursal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSucursal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSucursal.add(this.jLabelGenerarExcelReporteDinamicoSucursal, this.gridBagConstraintsSucursal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSucursal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSucursal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSucursal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSucursal.setToolTipText("Generar EXCEL"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSucursal = new GridBagConstraints();
		//this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSucursal.add(this.jButtonGenerarExcelReporteDinamicoSucursal, this.gridBagConstraintsSucursal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSucursal.add(this.jComboBoxTiposReportesDinamicoSucursal, this.gridBagConstraintsSucursal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSucursal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSucursal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSucursal.add(this.jLabelTiposArchivoReporteDinamicoSucursal, this.gridBagConstraintsSucursal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSucursal.add(this.jComboBoxTiposArchivosReportesDinamicoSucursal, this.gridBagConstraintsSucursal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSucursal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSucursal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSucursal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSucursal.setToolTipText("Generar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSucursal.add(this.jButtonGenerarReporteDinamicoSucursal, this.gridBagConstraintsSucursal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSucursal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSucursal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSucursal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSucursal.setToolTipText("Cancelar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSucursal.add(this.jButtonCerrarReporteDinamicoSucursal, this.gridBagConstraintsSucursal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSucursal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSucursal= new JScrollPane(jPanelReporteDinamicoSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSucursal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSucursal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSucursal);
		this.jInternalFrameReporteDinamicoSucursal.getContentPane().add(this.jScrollPanelReporteDinamicoSucursal, this.gridBagConstraintsSucursal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSucursal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSucursal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSucursal.setName("jPanelImportacionSucursal"); 
		
		this.jPanelImportacionSucursal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSucursal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSucursal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSucursal.setLayout(gridaBagLayoutImportacionSucursal);
		
		
		this.jInternalFrameImportacionSucursal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSucursal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSucursal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSucursal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSucursal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSucursal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSucursal.setResizable(true);
	    this.jInternalFrameImportacionSucursal.setClosable(true);
	    this.jInternalFrameImportacionSucursal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSucursal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSucursal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSucursal.setResizable(true);
	    this.jInternalFrameImportacionSucursal.setClosable(true);
	    this.jInternalFrameImportacionSucursal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSucursal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSucursal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSucursal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSucursal = new JLabelMe();

		this.jLabelArchivoImportacionSucursal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = iPosYImportacion;		
		this.gridBagConstraintsSucursal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSucursal.add(this.jLabelArchivoImportacionSucursal, this.gridBagConstraintsSucursal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSucursal = new JFileChooser();		
		this.jFileChooserImportacionSucursal.setToolTipText("ESCOGER ARCHIVO"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSucursal = new JButtonMe();
		this.jButtonAbrirImportacionSucursal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSucursal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSucursal.setToolTipText("Generar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSucursal.add(this.jButtonAbrirImportacionSucursal, this.gridBagConstraintsSucursal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSucursal = new JLabelMe();

		this.jLabelPathArchivoImportacionSucursal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSucursal.gridy = iPosYImportacion;		
		this.gridBagConstraintsSucursal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSucursal.add(this.jLabelPathArchivoImportacionSucursal, this.gridBagConstraintsSucursal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSucursal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSucursal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSucursal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSucursal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSucursal.add(this.jTextFieldPathArchivoImportacionSucursal, this.gridBagConstraintsSucursal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSucursal = new JButtonMe();
		this.jButtonGenerarImportacionSucursal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSucursal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSucursal.setToolTipText("Generar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSucursal.add(this.jButtonGenerarImportacionSucursal, this.gridBagConstraintsSucursal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSucursal = new JButtonMe();
		this.jButtonCerrarImportacionSucursal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSucursal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSucursal.setToolTipText("Cancelar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSucursal.add(this.jButtonCerrarImportacionSucursal, this.gridBagConstraintsSucursal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSucursal = new GridBagLayout();
		
		this.jScrollPanelImportacionSucursal= new JScrollPane(jPanelImportacionSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSucursal = new GridBagConstraints();
		this.gridBagConstraintsSucursal.gridy =iPosYImportacion;
		this.gridBagConstraintsSucursal.gridx =iPosXImportacion;
		this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSucursal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSucursal);
		this.jInternalFrameImportacionSucursal.getContentPane().add(this.jScrollPanelImportacionSucursal, this.gridBagConstraintsSucursal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySucursal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySucursal = new JButtonMe();
			this.jButtonAbrirOrderBySucursal.setText("Orden");
			this.jButtonAbrirOrderBySucursal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySucursal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySucursal";
			inputMap = this.jButtonAbrirOrderBySucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySucursal"));
		
		
			GridBagLayout gridaBagLayoutOrderBySucursal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySucursal.setName("jPanelOrderBySucursal"); 
			
			this.jPanelOrderBySucursal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySucursal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySucursal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySucursal.setLayout(gridaBagLayoutOrderBySucursal);
			
			
			this.jTableDatosSucursalOrderBy = new JTableMe();        
			this.jTableDatosSucursalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSucursalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSucursalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSucursalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSucursalOrderBy.setViewportView(this.jTableDatosSucursalOrderBy);
			this.jTableDatosSucursalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSucursalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySucursal= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySucursal= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySucursal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSucursal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySucursal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySucursal.setTitle("Orden");
			this.jInternalFrameOrderBySucursal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySucursal.setResizable(true);
			this.jInternalFrameOrderBySucursal.setClosable(true);
			this.jInternalFrameOrderBySucursal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySucursal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySucursal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySucursal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSucursal.gridx =iPosXOrderBy;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSucursal.ipady =150;
				
			this.jPanelOrderBySucursal.add(jScrollPanelDatosSucursalOrderBy, this.gridBagConstraintsSucursal);//this.jTableDatosSucursalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySucursal = new JButtonMe();
			this.jButtonCerrarOrderBySucursal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySucursal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySucursal.setToolTipText("Cancelar"+" "+SucursalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSucursal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSucursal.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySucursal.add(this.jButtonCerrarOrderBySucursal, this.gridBagConstraintsSucursal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSucursal = new GridBagLayout();
			
			this.jScrollPanelOrderBySucursal= new JScrollPane(jPanelOrderBySucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSucursal = new GridBagConstraints();
			this.gridBagConstraintsSucursal.gridy =iPosYOrderBy;
			this.gridBagConstraintsSucursal.gridx =iPosXOrderBy;
			this.gridBagConstraintsSucursal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySucursal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSucursal);
			
			this.jInternalFrameOrderBySucursal.getContentPane().add(this.jScrollPanelOrderBySucursal, this.gridBagConstraintsSucursal);			
		
		} else {
			this.jButtonAbrirOrderBySucursal = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.sucursalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSucursal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSucursal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSucursal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSucursal.getRowHeight();//SucursalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSucursal.isSelected()) {
					iHeightTable=SucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSucursal.isSelected()) {
					iHeightTable=SucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSucursal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSucursal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSucursal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSucursal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSucursal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSucursal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySucursal!=null && this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy()!=null) {
			//if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySucursal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySucursal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySucursal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSucursal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSucursal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSucursal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=sucursalLogic.getSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sucursals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Sucursal> TraerSucursalBeans(List<Sucursal> sucursals,ArrayList<Classe> classes)throws Exception {
		try {
			for(Sucursal sucursal:sucursals) {
					
				if(!(SucursalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SucursalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sucursal.setsDetalleGeneralEntityReporte(SucursalConstantesFunciones.getSucursalDescripcion(sucursal));
										
						
					
						
					
				} else  {
							
					//sucursal.setsDetalleGeneralEntityReporte(sucursal.getsDetalleGeneralEntityReporte());
										
				}
				
				//sucursalbeans.add(sucursalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sucursals;
    }
	//PARA REPORTES FIN
}
