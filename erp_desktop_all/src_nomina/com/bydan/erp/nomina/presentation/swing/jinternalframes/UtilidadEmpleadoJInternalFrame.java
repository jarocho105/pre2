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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.UtilidadEmpleadoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class UtilidadEmpleadoJInternalFrame extends UtilidadEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUtilidadEmpleado;
	
	protected JMenuBar jmenuBarUtilidadEmpleado;
	
	protected JMenu jmenuUtilidadEmpleado;
	protected JMenu jmenuDatosUtilidadEmpleado;
	protected JMenu jmenuArchivoUtilidadEmpleado;
	protected JMenu jmenuAccionesUtilidadEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadEmpleado;	
	protected GridBagConstraints gridBagConstraintsUtilidadEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UtilidadEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormUtilidadEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUtilidadEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUtilidadEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public UtilidadEmpleadoSessionBean utilidadempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UtilidadEmpleado> utilidadempleados;		
	public List<UtilidadEmpleado> utilidadempleadosEliminados;	
	public List<UtilidadEmpleado> utilidadempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUtilidadEmpleado;		
	protected JButton jButtonAbrirOrderByUtilidadEmpleado;
	
	
	//protected JPanel jPanelOrderByUtilidadEmpleado;
	//public JScrollPane jScrollPanelOrderByUtilidadEmpleado;	
	//protected JButton jButtonCerrarOrderByUtilidadEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UtilidadEmpleadoLogic utilidadempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUtilidadEmpleado;
	public JScrollPane jScrollPanelDatosEdicionUtilidadEmpleado;
	public JScrollPane jScrollPanelDatosGeneralUtilidadEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosUtilidadEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUtilidadEmpleado;
	//public JScrollPane jScrollPanelImportacionUtilidadEmpleado;
	
	
	
	protected JPanel jPanelAccionesUtilidadEmpleado;
	
    protected JPanel jPanelPaginacionUtilidadEmpleado;
    protected JPanel jPanelParametrosReportesUtilidadEmpleado;
	protected JPanel jPanelParametrosReportesAccionesUtilidadEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UtilidadEmpleado;
	protected JPanel jPanelParametrosAuxiliar2UtilidadEmpleado;
	protected JPanel jPanelParametrosAuxiliar3UtilidadEmpleado;
	protected JPanel jPanelParametrosAuxiliar4UtilidadEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5UtilidadEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoUtilidadEmpleado;
	//protected JPanel jPanelImportacionUtilidadEmpleado;
	
	
	public JTable jTableDatosUtilidadEmpleado;
	
	
	
	//public JTable jTableDatosUtilidadEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUtilidadEmpleado;
	protected JButton jButtonDuplicarUtilidadEmpleado;
	protected JButton jButtonCopiarUtilidadEmpleado;
	protected JButton jButtonVerFormUtilidadEmpleado;
	protected JButton jButtonNuevoRelacionesUtilidadEmpleado;
	protected JButton jButtonModificarUtilidadEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaUtilidadEmpleado;
	protected JButton jButtonCerrarUtilidadEmpleado;
	
	
	protected JButton jButtonRecargarInformacionUtilidadEmpleado;
	protected JButton jButtonProcesarInformacionUtilidadEmpleado;
	
	
	protected JButton jButtonAnterioresUtilidadEmpleado;
	protected JButton jButtonSiguientesUtilidadEmpleado;
	protected JButton jButtonNuevoGuardarCambiosUtilidadEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUtilidadEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoUtilidadEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoUtilidadEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionUtilidadEmpleado;
	//protected JButton jButtonGenerarImportacionUtilidadEmpleado;
	//protected JButton jButtonCerrarImportacionUtilidadEmpleado;
	//protected JFileChooser jFileChooserImportacionUtilidadEmpleado;
	//protected File fileImportacionUtilidadEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadEmpleado;
	protected JButton jButtonDuplicarToolBarUtilidadEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarUtilidadEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarUtilidadEmpleado;
	protected JButton jButtonCopiarToolBarUtilidadEmpleado;
	protected JButton jButtonVerFormToolBarUtilidadEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarUtilidadEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadEmpleado;
	protected JButton jButtonCerrarToolBarUtilidadEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarUtilidadEmpleado;
	protected JButton jButtonProcesarInformacionToolBarUtilidadEmpleado;
	protected JButton jButtonAnterioresToolBarUtilidadEmpleado;
	protected JButton jButtonSiguientesToolBarUtilidadEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarUtilidadEmpleado;
	protected JButton jButtonAbrirOrderByToolBarUtilidadEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadEmpleado;
	protected JMenuItem jMenuItemDuplicarUtilidadEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesUtilidadEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUtilidadEmpleado;
	protected JMenuItem jMenuItemCopiarUtilidadEmpleado;
	protected JMenuItem jMenuItemVerFormUtilidadEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadEmpleado;
	protected JMenuItem jMenuItemCerrarUtilidadEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUtilidadEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionUtilidadEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionUtilidadEmpleado;
	protected JMenuItem jMenuItemAnterioresUtilidadEmpleado;
	protected JMenuItem jMenuItemSiguientesUtilidadEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByUtilidadEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUtilidadEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosUtilidadEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUtilidadEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUtilidadEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUtilidadEmpleado;
	protected JTextField jTextFieldValorCampoGeneralUtilidadEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUtilidadEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteUtilidadEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteUtilidadEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteUtilidadEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteUtilidadEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteUtilidadEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUtilidadEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUtilidadEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUtilidadEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoUtilidadEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionUtilidadEmpleado;	
	//public JLabel jLabelPathArchivoImportacionUtilidadEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionUtilidadEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUtilidadEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUtilidadEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorUtilidadEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUtilidadEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoUtilidadEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoUtilidadEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoUtilidadEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUtilidadEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUtilidadEmpleado;
	public JPanel jPanelFK_IdAnioUtilidadEmpleado;
	public JButton jButtonFK_IdAnioUtilidadEmpleado;
	public JPanel jPanelFK_IdEmpleadoUtilidadEmpleado;
	public JButton jButtonFK_IdEmpleadoUtilidadEmpleado;
	
	public JPanel jPanelid_anioFK_IdAnioUtilidadEmpleado;
	public JLabel jLabelid_anioFK_IdAnioUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioUtilidadEmpleado;
	public JButton jButtonid_anioFK_IdAnioUtilidadEmpleado= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioUtilidadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioUtilidadEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoUtilidadEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoUtilidadEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoUtilidadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoUtilidadEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UtilidadEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUtilidadEmpleado)	{
		this.jButtonRecargarInformacionUtilidadEmpleado = jButtonRecargarInformacionUtilidadEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionUtilidadEmpleado() {
		return this.jButtonProcesarInformacionUtilidadEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadEmpleado)	{
		this.jButtonProcesarInformacionUtilidadEmpleado = jButtonProcesarInformacionUtilidadEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionUtilidadEmpleado() {
		return this.jButtonRecargarInformacionUtilidadEmpleado;
	}
	
	
	public List<UtilidadEmpleado> getutilidadempleados() {
		return this.utilidadempleados;
	}

	public void setutilidadempleados(List<UtilidadEmpleado> utilidadempleados) {
		this.utilidadempleados = utilidadempleados;
	}
	
	public List<UtilidadEmpleado> getutilidadempleadosAux() {
		return this.utilidadempleadosAux;
	}

	public void setutilidadempleadosAux(List<UtilidadEmpleado> utilidadempleadosAux) {
		this.utilidadempleadosAux = utilidadempleadosAux;
	}
	
	public List<UtilidadEmpleado> getutilidadempleadosEliminados() {
		return this.utilidadempleadosEliminados;
	}

	public void setUtilidadEmpleadosEliminados(List<UtilidadEmpleado> utilidadempleadosEliminados) {
		this.utilidadempleadosEliminados = utilidadempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUtilidadEmpleado() {
		return jComboBoxTiposSeleccionarUtilidadEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUtilidadEmpleado(
			JComboBox jComboBoxTiposSeleccionarUtilidadEmpleado) {
		this.jComboBoxTiposSeleccionarUtilidadEmpleado = jComboBoxTiposSeleccionarUtilidadEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUtilidadEmpleado() {
		return jTextFieldValorCampoGeneralUtilidadEmpleado;
	}

	public void setjTextFieldValorCampoGeneralUtilidadEmpleado(
			JTextField jTextFieldValorCampoGeneralUtilidadEmpleado) {
		this.jTextFieldValorCampoGeneralUtilidadEmpleado = jTextFieldValorCampoGeneralUtilidadEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUtilidadEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUtilidadEmpleado() {
		return this.jCheckBoxSeleccionarTodosUtilidadEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosUtilidadEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosUtilidadEmpleado) {
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado = jCheckBoxSeleccionarTodosUtilidadEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUtilidadEmpleado() {
		return this.jCheckBoxSeleccionadosUtilidadEmpleado;
	}

	public void setjCheckBoxSeleccionadosUtilidadEmpleado(
			JCheckBox jCheckBoxSeleccionadosUtilidadEmpleado) {
		this.jCheckBoxSeleccionadosUtilidadEmpleado = jCheckBoxSeleccionadosUtilidadEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUtilidadEmpleado() {
		return this.jComboBoxTiposArchivosReportesUtilidadEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUtilidadEmpleado(
			JComboBox jComboBoxTiposArchivosReportesUtilidadEmpleado) {
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado = jComboBoxTiposArchivosReportesUtilidadEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUtilidadEmpleado() {
		return this.jComboBoxTiposReportesUtilidadEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUtilidadEmpleado(
			JComboBox jComboBoxTiposReportesUtilidadEmpleado) {
		this.jComboBoxTiposReportesUtilidadEmpleado = jComboBoxTiposReportesUtilidadEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUtilidadEmpleado() {
	//	return jComboBoxTiposReportesDinamicoUtilidadEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUtilidadEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoUtilidadEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoUtilidadEmpleado = jComboBoxTiposReportesDinamicoUtilidadEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado = jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUtilidadEmpleado() {
		return this.jComboBoxTiposGraficosReportesUtilidadEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUtilidadEmpleado(
			JComboBox jComboBoxTiposGraficosReportesUtilidadEmpleado) {
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado = jComboBoxTiposGraficosReportesUtilidadEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUtilidadEmpleado() {
		return this.jComboBoxTiposPaginacionUtilidadEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUtilidadEmpleado(
			JComboBox jComboBoxTiposPaginacionUtilidadEmpleado) {
		this.jComboBoxTiposPaginacionUtilidadEmpleado = jComboBoxTiposPaginacionUtilidadEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUtilidadEmpleado() {
		return this.jComboBoxTiposRelacionesUtilidadEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadEmpleado() {
		return this.jComboBoxTiposAccionesUtilidadEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadEmpleado(
			JComboBox jComboBoxTiposRelacionesUtilidadEmpleado) {
		this.jComboBoxTiposRelacionesUtilidadEmpleado = jComboBoxTiposRelacionesUtilidadEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadEmpleado(
			JComboBox jComboBoxTiposAccionesUtilidadEmpleado) {
		this.jComboBoxTiposAccionesUtilidadEmpleado = jComboBoxTiposAccionesUtilidadEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUtilidadEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUtilidadEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUtilidadEmpleado() {
	//	return jCheckBoxConGraficoDinamicoUtilidadEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoUtilidadEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoUtilidadEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoUtilidadEmpleado = jCheckBoxConGraficoDinamicoUtilidadEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUtilidadEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUtilidadEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUtilidadEmpleado .setBorder(borderResaltar);		
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
		this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
		
		this.utilidadempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UtilidadEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UtilidadEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidad Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		UtilidadEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UtilidadEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUtilidadEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"nuevo","nuevo","Nuevo"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"duplicar","duplicar","Duplicar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"copiar","copiar","Copiar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"ver_form","ver_form","Ver"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"recargar","recargar","Recargar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUtilidadEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,
							"cerrar","cerrar","Salir"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUtilidadEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUtilidadEmpleado;
			
				this.jButtonProcesarInformacionToolBarUtilidadEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUtilidadEmpleado;
				
		//protected JButton jButtonModificarToolBarUtilidadEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUtilidadEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUtilidadEmpleado=new JMenuMe("General");
		this.jmenuArchivoUtilidadEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesUtilidadEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosUtilidadEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUtilidadEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUtilidadEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUtilidadEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUtilidadEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUtilidadEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUtilidadEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUtilidadEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUtilidadEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUtilidadEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUtilidadEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUtilidadEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUtilidadEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUtilidadEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUtilidadEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUtilidadEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUtilidadEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUtilidadEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUtilidadEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUtilidadEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUtilidadEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUtilidadEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUtilidadEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUtilidadEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUtilidadEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUtilidadEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUtilidadEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUtilidadEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUtilidadEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUtilidadEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUtilidadEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUtilidadEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUtilidadEmpleado.add(this.jMenuItemCerrarUtilidadEmpleado);
			
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemNuevoUtilidadEmpleado);
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado);
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemNuevoRelacionesUtilidadEmpleado);
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemGuardarCambiosTablaUtilidadEmpleado);		
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemDuplicarUtilidadEmpleado);		
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemCopiarUtilidadEmpleado);		
			this.jmenuAccionesUtilidadEmpleado.add(this.jMenuItemVerFormUtilidadEmpleado);		
			
			this.jmenuDatosUtilidadEmpleado.add(this.jMenuItemRecargarInformacionUtilidadEmpleado);				
			this.jmenuDatosUtilidadEmpleado.add(this.jMenuItemAnterioresUtilidadEmpleado);				
			this.jmenuDatosUtilidadEmpleado.add(this.jMenuItemSiguientesUtilidadEmpleado);				
			this.jmenuDatosUtilidadEmpleado.add(this.jMenuItemAbrirOrderByUtilidadEmpleado);				
			this.jmenuDatosUtilidadEmpleado.add(this.jMenuItemMostrarOcultarUtilidadEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUtilidadEmpleado.add(this.jMenuItemGuardarCambiosUtilidadEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUtilidadEmpleado.add(this.jmenuArchivoUtilidadEmpleado);		
			this.jmenuBarUtilidadEmpleado.add(this.jmenuAccionesUtilidadEmpleado);		
			this.jmenuBarUtilidadEmpleado.add(this.jmenuDatosUtilidadEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUtilidadEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUtilidadEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioUtilidadEmpleado.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioUtilidadEmpleado= new JButtonMe();
		this.jButtonFK_IdAnioUtilidadEmpleado.setText("Buscar");
		this.jButtonFK_IdAnioUtilidadEmpleado.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioUtilidadEmpleado,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioUtilidadEmpleado = new JLabelMe();
		jLabelid_anioFK_IdAnioUtilidadEmpleado.setText("Anio :");
		jLabelid_anioFK_IdAnioUtilidadEmpleado.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioUtilidadEmpleado= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoUtilidadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoUtilidadEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoUtilidadEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoUtilidadEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoUtilidadEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoUtilidadEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUtilidadEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasUtilidadEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUtilidadEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUtilidadEmpleado = new UtilidadEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Utilidad Empleado DATOS");
			this.jInternalFrameDetalleFormUtilidadEmpleado = new UtilidadEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.utilidadempleadoSessionBean.getConGuardarRelaciones(),this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUtilidadEmpleado = null;//new UtilidadEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadEmpleado= new GridBagLayout();
		
		
		this.jTableDatosUtilidadEmpleado = new JTableMe();      
		
		String sToolTipUtilidadEmpleado="";
		sToolTipUtilidadEmpleado=UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadEmpleado+="(Nomina.UtilidadEmpleado)";
		}
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUtilidadEmpleado.setToolTipText(sToolTipUtilidadEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUtilidadEmpleado);
		this.jTableDatosUtilidadEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosUtilidadEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUtilidadEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosUtilidadEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUtilidadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUtilidadEmpleado = new JButtonMe();
		this.jButtonDuplicarUtilidadEmpleado = new JButtonMe();
		this.jButtonCopiarUtilidadEmpleado = new JButtonMe();
		this.jButtonVerFormUtilidadEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesUtilidadEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado = new JButtonMe();
		this.jButtonCerrarUtilidadEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralUtilidadEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidad Empleado";
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUtilidadEmpleado=new ReporteDinamicoJInternalFrame(UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUtilidadEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUtilidadEmpleado=new ImportacionJInternalFrame(UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUtilidadEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUtilidadEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByUtilidadEmpleado.setText("Orden");
		this.jButtonAbrirOrderByUtilidadEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadEmpleado,false,this);
			
			//this.cargarOrderByUtilidadEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadEmpleado,true,this);
			
			//this.cargarOrderByUtilidadEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUtilidadEmpleado.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosUtilidadEmpleado.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosUtilidadEmpleado.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosUtilidadEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUtilidadEmpleado.setText("Nuevo");
		this.jButtonDuplicarUtilidadEmpleado.setText("Duplicar");
		this.jButtonCopiarUtilidadEmpleado.setText("Copiar");
		this.jButtonVerFormUtilidadEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesUtilidadEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.setText("Guardar");
		this.jButtonCerrarUtilidadEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadEmpleado,"nuevo_button","Nuevo",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUtilidadEmpleado,"duplicar_button","Duplicar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUtilidadEmpleado,"copiar_button","Copiar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUtilidadEmpleado,"ver_form","Ver",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUtilidadEmpleado,"nuevorelaciones_button","Nuevo Rel",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadEmpleado,"guardarcambiostabla_button","Guardar",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadEmpleado,"cerrar_button","Salir",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUtilidadEmpleado.setToolTipText("Nuevo"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUtilidadEmpleado.setToolTipText("Duplicar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUtilidadEmpleado.setToolTipText("Copiar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUtilidadEmpleado.setToolTipText("Ver"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUtilidadEmpleado.setToolTipText("Nuevo Rel"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.setToolTipText("Guardar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadEmpleado.setToolTipText("Salir"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadEmpleado";
		inputMap = this.jButtonNuevoUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarUtilidadEmpleado";
		inputMap = this.jButtonDuplicarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUtilidadEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUtilidadEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarUtilidadEmpleado";
		inputMap = this.jButtonCopiarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUtilidadEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUtilidadEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormUtilidadEmpleado";
		inputMap = this.jButtonVerFormUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUtilidadEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUtilidadEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUtilidadEmpleado";
		inputMap = this.jButtonNuevoRelacionesUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUtilidadEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUtilidadEmpleado";
		inputMap = this.jButtonModificarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUtilidadEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUtilidadEmpleado";
		inputMap = this.jButtonCerrarUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UtilidadEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UtilidadEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UtilidadEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UtilidadEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UtilidadEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUtilidadEmpleado.setName("jPanelParametrosReportesUtilidadEmpleado"); 
		
		this.jPanelParametrosReportesAccionesUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUtilidadEmpleado.setName("jPanelParametrosReportesAccionesUtilidadEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUtilidadEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionUtilidadEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionUtilidadEmpleado.setToolTipText("Recargar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUtilidadEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUtilidadEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionUtilidadEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionUtilidadEmpleado.setToolTipText("Procesar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUtilidadEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionUtilidadEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesUtilidadEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUtilidadEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionUtilidadEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUtilidadEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesUtilidadEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUtilidadEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarUtilidadEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUtilidadEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUtilidadEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUtilidadEmpleado = new JLabelMe();
		
		this.jLabelAccionesUtilidadEmpleado.setText("Acciones");		
		this.jLabelAccionesUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUtilidadEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUtilidadEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUtilidadEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUtilidadEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUtilidadEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteUtilidadEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUtilidadEmpleado = new JButtonMe();
		//this.jButtonAnterioresUtilidadEmpleado.setText("<<");
        this.jButtonAnterioresUtilidadEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUtilidadEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUtilidadEmpleado = new JButtonMe();
		//this.jButtonSiguientesUtilidadEmpleado.setText(">>");
        this.jButtonSiguientesUtilidadEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUtilidadEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUtilidadEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUtilidadEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosUtilidadEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUtilidadEmpleado,"nuevoguardarcambios_button","Nue",this.utilidadempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUtilidadEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUtilidadEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUtilidadEmpleado";
		inputMap = this.jButtonRecargarInformacionUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUtilidadEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUtilidadEmpleado";
		inputMap = this.jButtonSiguientesUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUtilidadEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUtilidadEmpleado";
		inputMap = this.jButtonAnterioresUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUtilidadEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUtilidadEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUtilidadEmpleado.setMinimumSize(new Dimension(this.getWidth(),UtilidadEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadEmpleado.setMaximumSize(new Dimension(this.getWidth(),UtilidadEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadEmpleado.setPreferredSize(new Dimension(this.getWidth(),UtilidadEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUtilidadEmpleado = new GridBagLayout();

			this.jPanelPaginacionUtilidadEmpleado.setLayout(gridaBagLayoutPaginacionUtilidadEmpleado);						
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonAnterioresUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
					
						
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
			
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonNuevoGuardarCambiosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
						
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonSiguientesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 1;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonNuevoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
						
			
			
			if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
				this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUtilidadEmpleado.gridy = 1;
				this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonGuardarCambiosTablaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			}
			
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 1;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonDuplicarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 1;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonCopiarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 1;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonVerFormUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 1;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUtilidadEmpleado.add(this.jButtonCerrarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		
		this.jButtonRecargarInformacionUtilidadEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUtilidadEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUtilidadEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUtilidadEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUtilidadEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUtilidadEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUtilidadEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UtilidadEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UtilidadEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UtilidadEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UtilidadEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUtilidadEmpleado.setLayout(gridaBagParametrosReportesUtilidadEmpleado);
			this.jPanelParametrosReportesAccionesUtilidadEmpleado.setLayout(gridaBagParametrosReportesAccionesUtilidadEmpleado);
			
			
			this.jPanelParametrosAuxiliar1UtilidadEmpleado.setLayout(gridaBagParametrosAuxiliar1UtilidadEmpleado);
			this.jPanelParametrosAuxiliar2UtilidadEmpleado.setLayout(gridaBagParametrosAuxiliar2UtilidadEmpleado);
			this.jPanelParametrosAuxiliar3UtilidadEmpleado.setLayout(gridaBagParametrosAuxiliar3UtilidadEmpleado);
			this.jPanelParametrosAuxiliar4UtilidadEmpleado.setLayout(gridaBagParametrosAuxiliar4UtilidadEmpleado);
			//this.jPanelParametrosAuxiliar5UtilidadEmpleado.setLayout(gridaBagParametrosAuxiliar2UtilidadEmpleado);			
			
			
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jButtonRecargarInformacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadEmpleado.add(this.jComboBoxTiposPaginacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadEmpleado.add(this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadEmpleado.add(this.jComboBoxTiposArchivosReportesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jPanelParametrosAuxiliar1UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UtilidadEmpleado.add(this.jComboBoxTiposReportesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);																		
			
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4UtilidadEmpleado.add(this.jComboBoxTiposGraficosReportesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jPanelParametrosAuxiliar4UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jComboBoxTiposReportesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jCheckBoxGenerarReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jPanelParametrosAuxiliar2UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jLabelAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
				this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUtilidadEmpleado.add(this.jButtonAbrirOrderByUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jComboBoxTiposSeleccionarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
			
			
			/*
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jCheckBoxSeleccionarTodosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jCheckBoxConGraficoReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadEmpleado.add(this.jCheckBoxSeleccionarTodosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);															
				
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadEmpleado.add(this.jCheckBoxSeleccionadosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);															
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadEmpleado.add(this.jCheckBoxConGraficoReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jPanelParametrosAuxiliar3UtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jComboBoxTiposAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
	
				
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadEmpleado.add(this.jTextFieldValorCampoGeneralUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUtilidadEmpleado = new GridBagLayout();

			this.jScrollPanelDatosUtilidadEmpleado.setLayout(gridaBagLayoutDatosUtilidadEmpleado);
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
			
			this.jScrollPanelDatosUtilidadEmpleado.add(this.jTableDatosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUtilidadEmpleado.setViewportView(this.jTableDatosUtilidadEmpleado);
		this.jTableDatosUtilidadEmpleado.setFillsViewportHeight(true);
		this.jTableDatosUtilidadEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUtilidadEmpleado= new GridBagLayout();
		this.jPanelAccionesUtilidadEmpleado.setLayout(gridaBagLayoutAccionesUtilidadEmpleado);
		
		
		/*	
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = 0;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
			
		this.jPanelAccionesUtilidadEmpleado.add(this.jButtonNuevoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioUtilidadEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioUtilidadEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioUtilidadEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioUtilidadEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioUtilidadEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioUtilidadEmpleado.setLayout(gridaBagLayoutFK_IdAnioUtilidadEmpleado);

		gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadEmpleado.gridy = 0;
		gridBagConstraintsUtilidadEmpleado.gridx = 0;
		jPanelFK_IdAnioUtilidadEmpleado.add(jLabelid_anioFK_IdAnioUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);

		gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadEmpleado.gridy = 0;
		gridBagConstraintsUtilidadEmpleado.gridx = 1;
		jPanelFK_IdAnioUtilidadEmpleado.add(jComboBoxid_anioFK_IdAnioUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);

		gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadEmpleado.gridy = 1;
		gridBagConstraintsUtilidadEmpleado.gridx =1;
		jPanelFK_IdAnioUtilidadEmpleado.add(jButtonFK_IdAnioUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);

		jTabbedPaneBusquedasUtilidadEmpleado.addTab("1.-Por Anio ", jPanelFK_IdAnioUtilidadEmpleado);
		jTabbedPaneBusquedasUtilidadEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoUtilidadEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoUtilidadEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoUtilidadEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoUtilidadEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoUtilidadEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoUtilidadEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoUtilidadEmpleado);

		gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadEmpleado.gridy = 0;
		gridBagConstraintsUtilidadEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoUtilidadEmpleado.add(jLabelid_empleadoFK_IdEmpleadoUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);

		gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadEmpleado.gridy = 0;
		gridBagConstraintsUtilidadEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoUtilidadEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);

		gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadEmpleado.gridy = 1;
		gridBagConstraintsUtilidadEmpleado.gridx =1;
		jPanelFK_IdEmpleadoUtilidadEmpleado.add(jButtonFK_IdEmpleadoUtilidadEmpleado, gridBagConstraintsUtilidadEmpleado);

		jTabbedPaneBusquedasUtilidadEmpleado.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoUtilidadEmpleado);
		jTabbedPaneBusquedasUtilidadEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;		
			//this.gridBagConstraintsUtilidadEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;		
		//this.gridBagConstraintsUtilidadEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUtilidadEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUtilidadEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadEmpleado.gridx = 0;		
			this.gridBagConstraintsUtilidadEmpleado.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUtilidadEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);								
		
		
		/*
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		*/		
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadEmpleado.gridx =0;
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
				
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUtilidadEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosUtilidadEmpleado.setLayout(gridaBagLayoutBusquedasParametrosUtilidadEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUtilidadEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
			
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUtilidadEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUtilidadEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUtilidadEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUtilidadEmpleado.setName("jPanelReporteDinamicoUtilidadEmpleado"); 
		
		this.jPanelReporteDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUtilidadEmpleado.setLayout(gridaBagLayoutReporteDinamicoUtilidadEmpleado);
		
		
		this.jInternalFrameReporteDinamicoUtilidadEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUtilidadEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUtilidadEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUtilidadEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUtilidadEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUtilidadEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUtilidadEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUtilidadEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoUtilidadEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoUtilidadEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUtilidadEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteUtilidadEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelColumnasSelectReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUtilidadEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteUtilidadEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUtilidadEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUtilidadEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUtilidadEmpleado=new JScrollPane(this.jListColumnasSelectReporteUtilidadEmpleado);
			
			this.jScrollColumnasSelectReporteUtilidadEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jListColumnasSelectReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jScrollColumnasSelectReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUtilidadEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteUtilidadEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUtilidadEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteUtilidadEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUtilidadEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUtilidadEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUtilidadEmpleado=new JScrollPane(this.jListRelacionesSelectReporteUtilidadEmpleado);
			
			this.jScrollRelacionesSelectReporteUtilidadEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUtilidadEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoUtilidadEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUtilidadEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUtilidadEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoUtilidadEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoUtilidadEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelConGraficoDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoUtilidadEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoUtilidadEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoUtilidadEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jCheckBoxConGraficoDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoUtilidadEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoUtilidadEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelColumnaCategoriaGraficoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorUtilidadEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorUtilidadEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelColumnaCategoriaValorUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorUtilidadEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorUtilidadEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jComboBoxColumnaCategoriaValorUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoUtilidadEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoUtilidadEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelColumnasValoresGraficoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoUtilidadEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoUtilidadEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoUtilidadEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoUtilidadEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoUtilidadEmpleado=new JScrollPane(this.jListColumnasValoresGraficoUtilidadEmpleado);
			
			this.jScrollColumnasValoresGraficoUtilidadEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jListColumnasSelectReporteUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jScrollColumnasValoresGraficoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoUtilidadEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoUtilidadEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelTiposGraficosReportesDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUtilidadEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUtilidadEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelGenerarExcelReporteDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado.setToolTipText("Generar EXCEL"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jComboBoxTiposReportesDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUtilidadEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUtilidadEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jLabelTiposArchivoReporteDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUtilidadEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUtilidadEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUtilidadEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUtilidadEmpleado.setToolTipText("Generar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jButtonGenerarReporteDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUtilidadEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUtilidadEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUtilidadEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUtilidadEmpleado.setToolTipText("Cancelar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadEmpleado.add(this.jButtonCerrarReporteDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUtilidadEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUtilidadEmpleado= new JScrollPane(jPanelReporteDinamicoUtilidadEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUtilidadEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUtilidadEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUtilidadEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUtilidadEmpleado);
		this.jInternalFrameReporteDinamicoUtilidadEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUtilidadEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUtilidadEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUtilidadEmpleado.setName("jPanelImportacionUtilidadEmpleado"); 
		
		this.jPanelImportacionUtilidadEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUtilidadEmpleado.setLayout(gridaBagLayoutImportacionUtilidadEmpleado);
		
		
		this.jInternalFrameImportacionUtilidadEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUtilidadEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUtilidadEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUtilidadEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUtilidadEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadEmpleado.setResizable(true);
	    this.jInternalFrameImportacionUtilidadEmpleado.setClosable(true);
	    this.jInternalFrameImportacionUtilidadEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUtilidadEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUtilidadEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadEmpleado.setResizable(true);
	    this.jInternalFrameImportacionUtilidadEmpleado.setClosable(true);
	    this.jInternalFrameImportacionUtilidadEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUtilidadEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUtilidadEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionUtilidadEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadEmpleado.add(this.jLabelArchivoImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUtilidadEmpleado = new JFileChooser();		
		this.jFileChooserImportacionUtilidadEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUtilidadEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionUtilidadEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUtilidadEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUtilidadEmpleado.setToolTipText("Generar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadEmpleado.add(this.jButtonAbrirImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUtilidadEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionUtilidadEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUtilidadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadEmpleado.add(this.jLabelPathArchivoImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUtilidadEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUtilidadEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadEmpleado.add(this.jTextFieldPathArchivoImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUtilidadEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionUtilidadEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUtilidadEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUtilidadEmpleado.setToolTipText("Generar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadEmpleado.add(this.jButtonGenerarImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUtilidadEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionUtilidadEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUtilidadEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUtilidadEmpleado.setToolTipText("Cancelar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadEmpleado.add(this.jButtonCerrarImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUtilidadEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionUtilidadEmpleado= new JScrollPane(jPanelImportacionUtilidadEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
		this.gridBagConstraintsUtilidadEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsUtilidadEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUtilidadEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUtilidadEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUtilidadEmpleado);
		this.jInternalFrameImportacionUtilidadEmpleado.getContentPane().add(this.jScrollPanelImportacionUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUtilidadEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUtilidadEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByUtilidadEmpleado.setText("Orden");
			this.jButtonAbrirOrderByUtilidadEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUtilidadEmpleado";
			inputMap = this.jButtonAbrirOrderByUtilidadEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUtilidadEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUtilidadEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByUtilidadEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUtilidadEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUtilidadEmpleado.setName("jPanelOrderByUtilidadEmpleado"); 
			
			this.jPanelOrderByUtilidadEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUtilidadEmpleado.setLayout(gridaBagLayoutOrderByUtilidadEmpleado);
			
			
			this.jTableDatosUtilidadEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosUtilidadEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUtilidadEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUtilidadEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUtilidadEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUtilidadEmpleadoOrderBy.setViewportView(this.jTableDatosUtilidadEmpleadoOrderBy);
			this.jTableDatosUtilidadEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUtilidadEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUtilidadEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUtilidadEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUtilidadEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUtilidadEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUtilidadEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUtilidadEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUtilidadEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByUtilidadEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUtilidadEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUtilidadEmpleado.setResizable(true);
			this.jInternalFrameOrderByUtilidadEmpleado.setClosable(true);
			this.jInternalFrameOrderByUtilidadEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUtilidadEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUtilidadEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUtilidadEmpleado.ipady =150;
				
			this.jPanelOrderByUtilidadEmpleado.add(jScrollPanelDatosUtilidadEmpleadoOrderBy, this.gridBagConstraintsUtilidadEmpleado);//this.jTableDatosUtilidadEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUtilidadEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByUtilidadEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUtilidadEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUtilidadEmpleado.setToolTipText("Cancelar"+" "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUtilidadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUtilidadEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUtilidadEmpleado.add(this.jButtonCerrarOrderByUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUtilidadEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByUtilidadEmpleado= new JScrollPane(jPanelOrderByUtilidadEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUtilidadEmpleado = new GridBagConstraints();
			this.gridBagConstraintsUtilidadEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsUtilidadEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUtilidadEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUtilidadEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUtilidadEmpleado);
			
			this.jInternalFrameOrderByUtilidadEmpleado.getContentPane().add(this.jScrollPanelOrderByUtilidadEmpleado, this.gridBagConstraintsUtilidadEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByUtilidadEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.utilidadempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUtilidadEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUtilidadEmpleado.getRowHeight();//UtilidadEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.isSelected()) {
					iHeightTable=UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadEmpleado.isSelected()) {
					iHeightTable=UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUtilidadEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUtilidadEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUtilidadEmpleado!=null && this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUtilidadEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUtilidadEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUtilidadEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUtilidadEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=utilidadempleadoLogic.getUtilidadEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UtilidadEmpleado> TraerUtilidadEmpleadoBeans(List<UtilidadEmpleado> utilidadempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(UtilidadEmpleado utilidadempleado:utilidadempleados) {
					
				if(!(UtilidadEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UtilidadEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					utilidadempleado.setsDetalleGeneralEntityReporte(UtilidadEmpleadoConstantesFunciones.getUtilidadEmpleadoDescripcion(utilidadempleado));
										
						
					
						
					
				} else  {
							
					//utilidadempleado.setsDetalleGeneralEntityReporte(utilidadempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//utilidadempleadobeans.add(utilidadempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return utilidadempleados;
    }
	//PARA REPORTES FIN
}
