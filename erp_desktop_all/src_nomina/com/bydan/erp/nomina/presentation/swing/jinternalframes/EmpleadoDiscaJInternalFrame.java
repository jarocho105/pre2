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
import com.bydan.erp.nomina.util.EmpleadoDiscaConstantesFunciones;

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
public class EmpleadoDiscaJInternalFrame extends EmpleadoDiscaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoDisca;
	
	protected JMenuBar jmenuBarEmpleadoDisca;
	
	protected JMenu jmenuEmpleadoDisca;
	protected JMenu jmenuDatosEmpleadoDisca;
	protected JMenu jmenuArchivoEmpleadoDisca;
	protected JMenu jmenuAccionesEmpleadoDisca;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoDisca;	
	protected GridBagConstraints gridBagConstraintsEmpleadoDisca;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoDiscaDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoDisca;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoDisca;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoDisca;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoDiscapacidadBeanSwingJInternalFrame tipodiscapacidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodiscapacidad="";
	
	public EmpleadoDiscaSessionBean empleadodiscaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoDiscapacidadSessionBean tipodiscapacidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoDisca> empleadodiscas;		
	public List<EmpleadoDisca> empleadodiscasEliminados;	
	public List<EmpleadoDisca> empleadodiscasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoDisca;		
	protected JButton jButtonAbrirOrderByEmpleadoDisca;
	
	
	//protected JPanel jPanelOrderByEmpleadoDisca;
	//public JScrollPane jScrollPanelOrderByEmpleadoDisca;	
	//protected JButton jButtonCerrarOrderByEmpleadoDisca;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoDiscaLogic empleadodiscaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoDisca;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoDisca;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoDisca;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoDiscaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoDisca;
	//public JScrollPane jScrollPanelImportacionEmpleadoDisca;
	
	
	
	protected JPanel jPanelAccionesEmpleadoDisca;
	
    protected JPanel jPanelPaginacionEmpleadoDisca;
    protected JPanel jPanelParametrosReportesEmpleadoDisca;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoDisca;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoDisca;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoDisca;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoDisca;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoDisca;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoDisca;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoDisca;
	//protected JPanel jPanelImportacionEmpleadoDisca;
	
	
	public JTable jTableDatosEmpleadoDisca;
	
	
	
	//public JTable jTableDatosEmpleadoDiscaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoDisca;
	protected JButton jButtonDuplicarEmpleadoDisca;
	protected JButton jButtonCopiarEmpleadoDisca;
	protected JButton jButtonVerFormEmpleadoDisca;
	protected JButton jButtonNuevoRelacionesEmpleadoDisca;
	protected JButton jButtonModificarEmpleadoDisca;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoDisca;
	protected JButton jButtonCerrarEmpleadoDisca;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoDisca;
	protected JButton jButtonProcesarInformacionEmpleadoDisca;
	
	
	protected JButton jButtonAnterioresEmpleadoDisca;
	protected JButton jButtonSiguientesEmpleadoDisca;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoDisca;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoDisca;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoDisca;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoDisca;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoDisca;
	//protected JButton jButtonGenerarImportacionEmpleadoDisca;
	//protected JButton jButtonCerrarImportacionEmpleadoDisca;
	//protected JFileChooser jFileChooserImportacionEmpleadoDisca;
	//protected File fileImportacionEmpleadoDisca;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoDisca;
	protected JButton jButtonDuplicarToolBarEmpleadoDisca;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoDisca;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoDisca;
	protected JButton jButtonCopiarToolBarEmpleadoDisca;
	protected JButton jButtonVerFormToolBarEmpleadoDisca;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoDisca;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoDisca;
	protected JButton jButtonCerrarToolBarEmpleadoDisca;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoDisca;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoDisca;
	protected JButton jButtonAnterioresToolBarEmpleadoDisca;
	protected JButton jButtonSiguientesToolBarEmpleadoDisca;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoDisca;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoDisca;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoDisca;
	protected JMenuItem jMenuItemDuplicarEmpleadoDisca;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoDisca;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoDisca;
	protected JMenuItem jMenuItemCopiarEmpleadoDisca;
	protected JMenuItem jMenuItemVerFormEmpleadoDisca;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoDisca;
	protected JMenuItem jMenuItemCerrarEmpleadoDisca;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoDisca;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoDisca;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoDisca;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoDisca;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoDisca;
	protected JMenuItem jMenuItemAnterioresEmpleadoDisca;
	protected JMenuItem jMenuItemSiguientesEmpleadoDisca;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoDisca;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoDisca;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoDisca;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoDisca;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoDisca;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoDisca;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoDisca;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoDisca;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoDisca;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoDisca;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoDisca;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoDisca;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoDisca;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoDisca;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoDisca;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoDisca;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoDisca;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoDisca;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoDisca;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoDisca;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoDisca;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoDisca;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoDisca;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoDisca;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoDisca;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoDisca;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoDisca;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoDisca;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoDisca;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoDisca;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoDisca;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoDisca;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoDisca;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoDisca;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoDisca;
	public JPanel jPanelFK_IdEmpleadoEmpleadoDisca;
	public JButton jButtonFK_IdEmpleadoEmpleadoDisca;
	public JPanel jPanelFK_IdTipoDiscapacidadEmpleadoDisca;
	public JButton jButtonFK_IdTipoDiscapacidadEmpleadoDisca;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoDisca;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoDisca= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoDiscaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoDiscaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca;
	public JLabel jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca;
	public JButton jButtonid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca= new JButtonMe();
	public JButton jButtonid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDiscaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDiscaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpleadoDiscaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDiscaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoDisca)	{
		this.jButtonRecargarInformacionEmpleadoDisca = jButtonRecargarInformacionEmpleadoDisca;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoDisca() {
		return this.jButtonProcesarInformacionEmpleadoDisca;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoDisca)	{
		this.jButtonProcesarInformacionEmpleadoDisca = jButtonProcesarInformacionEmpleadoDisca;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoDisca() {
		return this.jButtonRecargarInformacionEmpleadoDisca;
	}
	
	
	public List<EmpleadoDisca> getempleadodiscas() {
		return this.empleadodiscas;
	}

	public void setempleadodiscas(List<EmpleadoDisca> empleadodiscas) {
		this.empleadodiscas = empleadodiscas;
	}
	
	public List<EmpleadoDisca> getempleadodiscasAux() {
		return this.empleadodiscasAux;
	}

	public void setempleadodiscasAux(List<EmpleadoDisca> empleadodiscasAux) {
		this.empleadodiscasAux = empleadodiscasAux;
	}
	
	public List<EmpleadoDisca> getempleadodiscasEliminados() {
		return this.empleadodiscasEliminados;
	}

	public void setEmpleadoDiscasEliminados(List<EmpleadoDisca> empleadodiscasEliminados) {
		this.empleadodiscasEliminados = empleadodiscasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoDisca() {
		return jComboBoxTiposSeleccionarEmpleadoDisca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoDisca(
			JComboBox jComboBoxTiposSeleccionarEmpleadoDisca) {
		this.jComboBoxTiposSeleccionarEmpleadoDisca = jComboBoxTiposSeleccionarEmpleadoDisca;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoDisca() {
		return jTextFieldValorCampoGeneralEmpleadoDisca;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoDisca(
			JTextField jTextFieldValorCampoGeneralEmpleadoDisca) {
		this.jTextFieldValorCampoGeneralEmpleadoDisca = jTextFieldValorCampoGeneralEmpleadoDisca;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoDisca .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoDisca() {
		return this.jCheckBoxSeleccionarTodosEmpleadoDisca;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoDisca(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoDisca) {
		this.jCheckBoxSeleccionarTodosEmpleadoDisca = jCheckBoxSeleccionarTodosEmpleadoDisca;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoDisca() {
		return this.jCheckBoxSeleccionadosEmpleadoDisca;
	}

	public void setjCheckBoxSeleccionadosEmpleadoDisca(
			JCheckBox jCheckBoxSeleccionadosEmpleadoDisca) {
		this.jCheckBoxSeleccionadosEmpleadoDisca = jCheckBoxSeleccionadosEmpleadoDisca;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoDisca() {
		return this.jComboBoxTiposArchivosReportesEmpleadoDisca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoDisca(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoDisca) {
		this.jComboBoxTiposArchivosReportesEmpleadoDisca = jComboBoxTiposArchivosReportesEmpleadoDisca;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoDisca() {
		return this.jComboBoxTiposReportesEmpleadoDisca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoDisca(
			JComboBox jComboBoxTiposReportesEmpleadoDisca) {
		this.jComboBoxTiposReportesEmpleadoDisca = jComboBoxTiposReportesEmpleadoDisca;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoDisca() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoDisca;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoDisca(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoDisca) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoDisca = jComboBoxTiposReportesDinamicoEmpleadoDisca;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoDisca() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoDisca(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca = jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoDisca() {
		return this.jComboBoxTiposGraficosReportesEmpleadoDisca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoDisca(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoDisca) {
		this.jComboBoxTiposGraficosReportesEmpleadoDisca = jComboBoxTiposGraficosReportesEmpleadoDisca;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoDisca() {
		return this.jComboBoxTiposPaginacionEmpleadoDisca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoDisca(
			JComboBox jComboBoxTiposPaginacionEmpleadoDisca) {
		this.jComboBoxTiposPaginacionEmpleadoDisca = jComboBoxTiposPaginacionEmpleadoDisca;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoDisca() {
		return this.jComboBoxTiposRelacionesEmpleadoDisca;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoDisca() {
		return this.jComboBoxTiposAccionesEmpleadoDisca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoDisca(
			JComboBox jComboBoxTiposRelacionesEmpleadoDisca) {
		this.jComboBoxTiposRelacionesEmpleadoDisca = jComboBoxTiposRelacionesEmpleadoDisca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoDisca(
			JComboBox jComboBoxTiposAccionesEmpleadoDisca) {
		this.jComboBoxTiposAccionesEmpleadoDisca = jComboBoxTiposAccionesEmpleadoDisca;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoDisca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoDisca .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoDisca() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoDisca;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoDisca(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoDisca) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoDisca = jCheckBoxConGraficoDinamicoEmpleadoDisca;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoDisca() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoDisca.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoDisca .setBorder(borderResaltar);		
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
		this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		
		this.empleadodiscaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadodiscaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadodiscaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoDiscaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Disca MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoDisca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoDisca= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"copiar","copiar","Copiar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"ver_form","ver_form","Ver"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"recargar","recargar","Recargar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoDisca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoDisca,this.jTtoolBarEmpleadoDisca,
							"cerrar","cerrar","Salir"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoDisca=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoDisca;
			
				this.jButtonProcesarInformacionToolBarEmpleadoDisca=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoDisca;
				
		//protected JButton jButtonModificarToolBarEmpleadoDisca;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoDisca=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoDisca=new JMenuMe("General");
		this.jmenuArchivoEmpleadoDisca=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoDisca=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoDisca=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoDisca= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoDisca.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoDisca,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoDisca= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoDisca.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoDisca,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoDisca= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoDisca.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoDisca,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoDisca= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoDisca.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoDisca,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoDisca= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoDisca.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoDisca,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoDisca= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoDisca.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoDisca,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoDisca= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoDisca.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoDisca,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoDisca= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoDisca.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoDisca,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoDisca= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoDisca.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoDisca,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoDisca= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoDisca.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoDisca,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoDisca= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoDisca.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoDisca,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoDisca= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoDisca.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoDisca,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoDisca= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoDisca.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoDisca,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoDisca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoDisca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoDisca,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoDisca= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoDisca.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoDisca,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoDisca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoDisca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoDisca,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoDisca= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoDisca.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoDisca,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoDisca.add(this.jMenuItemCerrarEmpleadoDisca);
			
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemNuevoEmpleadoDisca);
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemNuevoGuardarCambiosEmpleadoDisca);
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemNuevoRelacionesEmpleadoDisca);
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemGuardarCambiosTablaEmpleadoDisca);		
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemDuplicarEmpleadoDisca);		
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemCopiarEmpleadoDisca);		
			this.jmenuAccionesEmpleadoDisca.add(this.jMenuItemVerFormEmpleadoDisca);		
			
			this.jmenuDatosEmpleadoDisca.add(this.jMenuItemRecargarInformacionEmpleadoDisca);				
			this.jmenuDatosEmpleadoDisca.add(this.jMenuItemAnterioresEmpleadoDisca);				
			this.jmenuDatosEmpleadoDisca.add(this.jMenuItemSiguientesEmpleadoDisca);				
			this.jmenuDatosEmpleadoDisca.add(this.jMenuItemAbrirOrderByEmpleadoDisca);				
			this.jmenuDatosEmpleadoDisca.add(this.jMenuItemMostrarOcultarEmpleadoDisca);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoDisca.add(this.jMenuItemGuardarCambiosEmpleadoDisca);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoDisca.add(this.jmenuArchivoEmpleadoDisca);		
			this.jmenuBarEmpleadoDisca.add(this.jmenuAccionesEmpleadoDisca);		
			this.jmenuBarEmpleadoDisca.add(this.jmenuDatosEmpleadoDisca);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoDisca);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoDisca() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoDisca.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoDisca= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoDisca.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoDisca.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoDisca,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDiscapacidadEmpleadoDisca=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDiscapacidadEmpleadoDisca.setToolTipText("Buscar Por Tipo Discapacad ");
		this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca= new JButtonMe();
		this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca.setText("Buscar");
		this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca.setToolTipText("Buscar Por Tipo Discapacad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca,"buscar_button","Buscar Por Tipo Discapacad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca = new JLabelMe();
		jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setText("Tipo Discapacad :");
		jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setToolTipText("Tipo Discapacad");
		jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca= new JComboBoxMe();
		jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoDisca=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoDisca.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoDisca.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoDisca.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoDisca.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoDisca = new EmpleadoDiscaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Disca DATOS");
			this.jInternalFrameDetalleFormEmpleadoDisca = new EmpleadoDiscaDetalleFormJInternalFrame(jDesktopPane,this.empleadodiscaSessionBean.getConGuardarRelaciones(),this.empleadodiscaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoDisca = null;//new EmpleadoDiscaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoDisca= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoDisca = new JTableMe();      
		
		String sToolTipEmpleadoDisca="";
		sToolTipEmpleadoDisca=EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoDisca+="(Nomina.EmpleadoDisca)";
		}
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoDisca+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoDisca.setToolTipText(sToolTipEmpleadoDisca);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoDisca);
		this.jTableDatosEmpleadoDisca.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoDisca.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoDisca.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoDisca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoDisca,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoDisca = new JButtonMe();
		this.jButtonDuplicarEmpleadoDisca = new JButtonMe();
		this.jButtonCopiarEmpleadoDisca = new JButtonMe();
		this.jButtonVerFormEmpleadoDisca = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoDisca = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca = new JButtonMe();
		this.jButtonCerrarEmpleadoDisca = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoDisca = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoDisca = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Disca";
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Discas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoDisca.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoDisca.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoDisca.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoDisca=new ReporteDinamicoJInternalFrame(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoDisca();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoDisca=new ImportacionJInternalFrame(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoDisca();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoDisca = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoDisca.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoDisca.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoDisca,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoDisca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoDisca,false,this);
			
			//this.cargarOrderByEmpleadoDisca(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoDisca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoDisca,true,this);
			
			//this.cargarOrderByEmpleadoDisca(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoDisca.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosEmpleadoDisca.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosEmpleadoDisca.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosEmpleadoDisca.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoDisca.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoDisca.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoDisca.setText("Nuevo");
		this.jButtonDuplicarEmpleadoDisca.setText("Duplicar");
		this.jButtonCopiarEmpleadoDisca.setText("Copiar");
		this.jButtonVerFormEmpleadoDisca.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoDisca.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.setText("Guardar");
		this.jButtonCerrarEmpleadoDisca.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoDisca,"nuevo_button","Nuevo",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoDisca,"duplicar_button","Duplicar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoDisca,"copiar_button","Copiar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoDisca,"ver_form","Ver",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoDisca,"nuevorelaciones_button","Nuevo Rel",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoDisca,"guardarcambiostabla_button","Guardar",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoDisca,"cerrar_button","Salir",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoDisca.setToolTipText("Nuevo"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoDisca.setToolTipText("Duplicar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoDisca.setToolTipText("Copiar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoDisca.setToolTipText("Ver"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoDisca.setToolTipText("Nuevo Rel"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.setToolTipText("Guardar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoDisca.setToolTipText("Salir"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoDisca";
		inputMap = this.jButtonNuevoEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoDisca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoDisca"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoDisca";
		inputMap = this.jButtonDuplicarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoDisca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoDisca"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoDisca";
		inputMap = this.jButtonCopiarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoDisca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoDisca"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoDisca";
		inputMap = this.jButtonVerFormEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoDisca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoDisca"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoDisca";
		inputMap = this.jButtonNuevoRelacionesEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoDisca"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoDisca";
		inputMap = this.jButtonModificarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoDisca"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoDisca";
		inputMap = this.jButtonCerrarEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoDisca"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoDisca";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoDisca"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoDisca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoDisca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoDisca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoDisca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoDisca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoDisca.setName("jPanelParametrosReportesEmpleadoDisca"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoDisca.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoDisca.setName("jPanelParametrosReportesAccionesEmpleadoDisca"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoDisca = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoDisca.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoDisca.setToolTipText("Recargar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoDisca,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoDisca = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoDisca.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoDisca.setToolTipText("Procesar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoDisca.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoDisca.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoDisca.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoDisca.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoDisca.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoDisca.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoDisca.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoDisca.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoDisca.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoDisca.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoDisca.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoDisca.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoDisca.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoDisca.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoDisca.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoDisca.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoDisca.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoDisca.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoDisca=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoDisca.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoDisca.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoDisca.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoDisca = new JLabelMe();
		
		this.jLabelAccionesEmpleadoDisca.setText("Acciones");		
		this.jLabelAccionesEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoDisca = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoDisca.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoDisca.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoDisca = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoDisca.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoDisca.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoDisca = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoDisca = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoDisca.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoDisca.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoDisca = new JButtonMe();
		//this.jButtonAnterioresEmpleadoDisca.setText("<<");
        this.jButtonAnterioresEmpleadoDisca.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoDisca,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoDisca = new JButtonMe();
		//this.jButtonSiguientesEmpleadoDisca.setText(">>");
        this.jButtonSiguientesEmpleadoDisca.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoDisca,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoDisca = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoDisca.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoDisca.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoDisca,"nuevoguardarcambios_button","Nue",this.empleadodiscaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoDisca";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoDisca"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoDisca";
		inputMap = this.jButtonRecargarInformacionEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoDisca"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoDisca";
		inputMap = this.jButtonSiguientesEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoDisca"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoDisca";
		inputMap = this.jButtonAnterioresEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoDisca"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoDisca();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoDisca.setMinimumSize(new Dimension(this.getWidth(),EmpleadoDiscaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoDiscaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoDisca.setMaximumSize(new Dimension(this.getWidth(),EmpleadoDiscaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoDiscaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoDisca.setPreferredSize(new Dimension(this.getWidth(),EmpleadoDiscaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoDiscaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoDisca = new GridBagLayout();

			this.jPanelPaginacionEmpleadoDisca.setLayout(gridaBagLayoutPaginacionEmpleadoDisca);						
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 0;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonAnterioresEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
					
						
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoDisca.gridy = 0;
			
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonNuevoGuardarCambiosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
						
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoDisca.gridy = 0;
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonSiguientesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 1;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonNuevoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
						
			
			
			if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoDisca.gridy = 1;
				this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoDisca.add(this.jButtonGuardarCambiosTablaEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			}
			
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 1;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonDuplicarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 1;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonCopiarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 1;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonVerFormEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 1;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoDisca.add(this.jButtonCerrarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		
		this.jButtonRecargarInformacionEmpleadoDisca.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoDisca.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoDisca.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoDisca.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoDisca.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoDisca.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoDisca.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoDisca.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoDisca.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoDisca.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoDisca.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoDisca.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoDisca.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoDisca.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoDisca.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoDisca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoDisca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoDisca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoDisca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoDisca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoDisca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoDisca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoDisca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoDisca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoDisca.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoDisca.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoDisca.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoDisca.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoDisca.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoDisca.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoDisca.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoDisca.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoDisca.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoDisca = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoDisca = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoDisca = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoDisca = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoDisca = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoDisca = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoDisca.setLayout(gridaBagParametrosReportesEmpleadoDisca);
			this.jPanelParametrosReportesAccionesEmpleadoDisca.setLayout(gridaBagParametrosReportesAccionesEmpleadoDisca);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoDisca.setLayout(gridaBagParametrosAuxiliar1EmpleadoDisca);
			this.jPanelParametrosAuxiliar2EmpleadoDisca.setLayout(gridaBagParametrosAuxiliar2EmpleadoDisca);
			this.jPanelParametrosAuxiliar3EmpleadoDisca.setLayout(gridaBagParametrosAuxiliar3EmpleadoDisca);
			this.jPanelParametrosAuxiliar4EmpleadoDisca.setLayout(gridaBagParametrosAuxiliar4EmpleadoDisca);
			//this.jPanelParametrosAuxiliar5EmpleadoDisca.setLayout(gridaBagParametrosAuxiliar2EmpleadoDisca);			
			
			
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jButtonRecargarInformacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoDisca.add(this.jComboBoxTiposPaginacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoDisca.add(this.jCheckBoxConAltoMaximoTablaEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoDisca.add(this.jComboBoxTiposArchivosReportesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jPanelParametrosAuxiliar1EmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoDisca.add(this.jComboBoxTiposReportesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);																		
			
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EmpleadoDisca.add(this.jComboBoxTiposGraficosReportesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jPanelParametrosAuxiliar4EmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jComboBoxTiposReportesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jCheckBoxGenerarReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jPanelParametrosAuxiliar2EmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jLabelAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoDisca.add(this.jButtonAbrirOrderByEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jComboBoxTiposSeleccionarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
			
			
			/*
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jCheckBoxSeleccionarTodosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jCheckBoxConGraficoReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoDisca.add(this.jCheckBoxSeleccionarTodosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);															
				
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoDisca.add(this.jCheckBoxSeleccionadosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);															
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoDisca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoDisca.add(this.jCheckBoxConGraficoReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jPanelParametrosAuxiliar3EmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jComboBoxTiposAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
	
				
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoDisca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoDisca.add(this.jTextFieldValorCampoGeneralEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoDisca = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoDisca.setLayout(gridaBagLayoutDatosEmpleadoDisca);
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = 0;
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoDisca.add(this.jTableDatosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoDisca.setViewportView(this.jTableDatosEmpleadoDisca);
		this.jTableDatosEmpleadoDisca.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoDisca.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoDisca= new GridBagLayout();
		this.jPanelAccionesEmpleadoDisca.setLayout(gridaBagLayoutAccionesEmpleadoDisca);
		
		
		/*	
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = 0;
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
			
		this.jPanelAccionesEmpleadoDisca.add(this.jButtonNuevoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoDisca= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoDisca.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoDisca.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoDisca.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoDisca.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoDisca.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoDisca);

		gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoDisca.gridy = 0;
		gridBagConstraintsEmpleadoDisca.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoDisca.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoDisca, gridBagConstraintsEmpleadoDisca);

		gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoDisca.gridy = 0;
		gridBagConstraintsEmpleadoDisca.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoDisca.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca, gridBagConstraintsEmpleadoDisca);

		gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoDisca.gridy = 1;
		gridBagConstraintsEmpleadoDisca.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoDisca.add(jButtonFK_IdEmpleadoEmpleadoDisca, gridBagConstraintsEmpleadoDisca);

		jTabbedPaneBusquedasEmpleadoDisca.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoDisca);
		jTabbedPaneBusquedasEmpleadoDisca.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoDiscapacidadEmpleadoDisca= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDiscapacidadEmpleadoDisca.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDiscapacidadEmpleadoDisca.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDiscapacidadEmpleadoDisca.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDiscapacidadEmpleadoDisca.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDiscapacidadEmpleadoDisca.setLayout(gridaBagLayoutFK_IdTipoDiscapacidadEmpleadoDisca);

		gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoDisca.gridy = 0;
		gridBagConstraintsEmpleadoDisca.gridx = 0;
		jPanelFK_IdTipoDiscapacidadEmpleadoDisca.add(jLabelid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca, gridBagConstraintsEmpleadoDisca);

		gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoDisca.gridy = 0;
		gridBagConstraintsEmpleadoDisca.gridx = 1;
		jPanelFK_IdTipoDiscapacidadEmpleadoDisca.add(jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca, gridBagConstraintsEmpleadoDisca);

		gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoDisca.gridy = 1;
		gridBagConstraintsEmpleadoDisca.gridx =1;
		jPanelFK_IdTipoDiscapacidadEmpleadoDisca.add(jButtonFK_IdTipoDiscapacidadEmpleadoDisca, gridBagConstraintsEmpleadoDisca);

		jTabbedPaneBusquedasEmpleadoDisca.addTab("2.-Por Tipo Discapacad ", jPanelFK_IdTipoDiscapacidadEmpleadoDisca);
		jTabbedPaneBusquedasEmpleadoDisca.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoDisca = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoDisca);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;		
			//this.gridBagConstraintsEmpleadoDisca.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoDisca.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;		
		//this.gridBagConstraintsEmpleadoDisca.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoDisca.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoDisca);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoDisca.gridx = 0;		
			this.gridBagConstraintsEmpleadoDisca.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoDisca.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);								
		
		
		/*
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		*/		
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoDisca.gridx =0;
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoDisca.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
				
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoDisca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoDisca = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoDisca.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoDisca);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoDisca=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoDisca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoDisca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoDisca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
			
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoDisca.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoDisca;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoDisca() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoDisca = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoDisca.setName("jPanelReporteDinamicoEmpleadoDisca"); 
		
		this.jPanelReporteDinamicoEmpleadoDisca.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoDisca.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoDisca.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoDisca.setLayout(gridaBagLayoutReporteDinamicoEmpleadoDisca);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoDisca= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoDisca = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoDisca= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoDisca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoDisca.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoDisca.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoDisca.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoDisca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoDisca.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoDisca.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoDisca.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoDisca.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoDisca.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoDisca.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Discas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoDisca = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoDisca.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelColumnasSelectReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoDisca = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoDisca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoDisca.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoDisca.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoDisca.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoDisca.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoDisca=new JScrollPane(this.jListColumnasSelectReporteEmpleadoDisca);
			
			this.jScrollColumnasSelectReporteEmpleadoDisca.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoDisca.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoDisca.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoDisca.add(this.jListColumnasSelectReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jScrollColumnasSelectReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoDisca = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoDisca.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoDisca = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoDisca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoDisca.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoDisca.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoDisca.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoDisca.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoDisca=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoDisca);
			
			this.jScrollRelacionesSelectReporteEmpleadoDisca.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoDisca.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoDisca.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoDisca = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoDisca = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoDisca = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoDisca.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoDisca.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoDisca.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoDisca.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpleadoDisca = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpleadoDisca.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelConGraficoDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpleadoDisca = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpleadoDisca.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpleadoDisca.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpleadoDisca.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoDisca.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoDisca.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jCheckBoxConGraficoDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpleadoDisca = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpleadoDisca.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelColumnaCategoriaGraficoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpleadoDisca = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpleadoDisca.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelColumnaCategoriaValorEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpleadoDisca.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpleadoDisca.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpleadoDisca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoDisca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoDisca.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jComboBoxColumnaCategoriaValorEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpleadoDisca = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpleadoDisca.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelColumnasValoresGraficoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpleadoDisca = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpleadoDisca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpleadoDisca.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpleadoDisca.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoDisca.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoDisca.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpleadoDisca=new JScrollPane(this.jListColumnasValoresGraficoEmpleadoDisca);
			
			this.jScrollColumnasValoresGraficoEmpleadoDisca.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoDisca.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoDisca.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpleadoDisca.add(this.jListColumnasSelectReporteEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jScrollColumnasValoresGraficoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpleadoDisca = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpleadoDisca.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelTiposGraficosReportesDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoDisca.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jComboBoxTiposGraficosReportesDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoDisca = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoDisca.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca.setToolTipText("Generar EXCEL"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoDisca.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jComboBoxTiposReportesDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoDisca = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoDisca.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoDisca = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoDisca.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoDisca,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoDisca.setToolTipText("Generar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jButtonGenerarReporteDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoDisca = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoDisca.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoDisca,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoDisca.setToolTipText("Cancelar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoDisca.add(this.jButtonCerrarReporteDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoDisca = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoDisca= new JScrollPane(jPanelReporteDinamicoEmpleadoDisca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoDisca.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoDisca.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoDisca.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Discas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoDisca.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoDisca.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoDisca.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoDisca);
		this.jInternalFrameReporteDinamicoEmpleadoDisca.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoDisca() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoDisca = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoDisca.setName("jPanelImportacionEmpleadoDisca"); 
		
		this.jPanelImportacionEmpleadoDisca.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoDisca.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoDisca.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoDisca.setLayout(gridaBagLayoutImportacionEmpleadoDisca);
		
		
		this.jInternalFrameImportacionEmpleadoDisca= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoDisca= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoDisca = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoDisca= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoDisca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoDisca.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoDisca.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoDisca.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoDisca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoDisca.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoDisca.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoDisca.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoDisca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoDisca.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoDisca.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoDisca.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoDisca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoDisca.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoDisca.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoDisca.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoDisca.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoDisca.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoDisca.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Discas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoDisca = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoDisca.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoDisca.add(this.jLabelArchivoImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoDisca = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoDisca.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoDisca = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoDisca.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoDisca,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoDisca.setToolTipText("Generar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoDisca.add(this.jButtonAbrirImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoDisca = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoDisca.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoDisca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoDisca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoDisca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoDisca.add(this.jLabelPathArchivoImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoDisca=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoDisca.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoDisca.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoDisca.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoDisca.add(this.jTextFieldPathArchivoImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoDisca = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoDisca.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoDisca,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoDisca.setToolTipText("Generar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoDisca.add(this.jButtonGenerarImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoDisca = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoDisca.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoDisca,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoDisca.setToolTipText("Cancelar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoDisca.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoDisca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoDisca.add(this.jButtonCerrarImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoDisca = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoDisca= new JScrollPane(jPanelImportacionEmpleadoDisca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoDisca.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoDisca.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoDisca.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoDisca.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoDisca);
		this.jInternalFrameImportacionEmpleadoDisca.getContentPane().add(this.jScrollPanelImportacionEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoDisca(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoDisca = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoDisca.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoDisca.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoDisca,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoDisca";
			inputMap = this.jButtonAbrirOrderByEmpleadoDisca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoDisca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoDisca"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoDisca = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoDisca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoDisca.setName("jPanelOrderByEmpleadoDisca"); 
			
			this.jPanelOrderByEmpleadoDisca.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoDisca.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoDisca.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoDisca.setLayout(gridaBagLayoutOrderByEmpleadoDisca);
			
			
			this.jTableDatosEmpleadoDiscaOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoDiscaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoDiscaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoDiscaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoDiscaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoDiscaOrderBy.setViewportView(this.jTableDatosEmpleadoDiscaOrderBy);
			this.jTableDatosEmpleadoDiscaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoDiscaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoDisca= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoDisca= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoDisca = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoDisca= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoDisca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoDisca.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoDisca.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoDisca.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoDisca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoDisca.setResizable(true);
			this.jInternalFrameOrderByEmpleadoDisca.setClosable(true);
			this.jInternalFrameOrderByEmpleadoDisca.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoDisca.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoDisca.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoDisca.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoDisca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Discas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoDisca.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoDisca.ipady =150;
				
			this.jPanelOrderByEmpleadoDisca.add(jScrollPanelDatosEmpleadoDiscaOrderBy, this.gridBagConstraintsEmpleadoDisca);//this.jTableDatosEmpleadoDiscaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoDisca = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoDisca.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoDisca,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoDisca.setToolTipText("Cancelar"+" "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoDisca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoDisca.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoDisca.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoDisca.add(this.jButtonCerrarOrderByEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoDisca = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoDisca= new JScrollPane(jPanelOrderByEmpleadoDisca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoDisca = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoDisca.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoDisca.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoDisca.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoDisca.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoDisca.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoDisca);
			
			this.jInternalFrameOrderByEmpleadoDisca.getContentPane().add(this.jScrollPanelOrderByEmpleadoDisca, this.gridBagConstraintsEmpleadoDisca);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoDisca = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadodiscaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoDisca.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoDisca.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoDisca.getRowHeight();//EmpleadoDiscaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.isSelected()) {
					iHeightTable=EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoDisca.isSelected()) {
					iHeightTable=EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoDiscaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoDisca.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoDisca.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoDisca.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoDisca.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoDisca.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoDisca.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoDisca!=null && this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoDisca.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoDisca.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoDisca.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoDisca.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoDisca.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoDisca.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadodiscaLogic.getEmpleadoDiscas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadodiscas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoDisca> TraerEmpleadoDiscaBeans(List<EmpleadoDisca> empleadodiscas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoDisca empleadodisca:empleadodiscas) {
					
				if(!(EmpleadoDiscaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoDiscaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadodisca.setsDetalleGeneralEntityReporte(EmpleadoDiscaConstantesFunciones.getEmpleadoDiscaDescripcion(empleadodisca));
										
						
					
						
					
				} else  {
							
					//empleadodisca.setsDetalleGeneralEntityReporte(empleadodisca.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadodiscabeans.add(empleadodiscabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadodiscas;
    }
	//PARA REPORTES FIN
}
