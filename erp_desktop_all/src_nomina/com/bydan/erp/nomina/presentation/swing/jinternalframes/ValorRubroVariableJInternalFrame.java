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
import com.bydan.erp.nomina.util.ValorRubroVariableConstantesFunciones;

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
public class ValorRubroVariableJInternalFrame extends ValorRubroVariableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarValorRubroVariable;
	
	protected JMenuBar jmenuBarValorRubroVariable;
	
	protected JMenu jmenuValorRubroVariable;
	protected JMenu jmenuDatosValorRubroVariable;
	protected JMenu jmenuArchivoValorRubroVariable;
	protected JMenu jmenuAccionesValorRubroVariable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutValorRubroVariable;	
	protected GridBagConstraints gridBagConstraintsValorRubroVariable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ValorRubroVariableDetalleFormJInternalFrame jInternalFrameDetalleFormValorRubroVariable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoValorRubroVariable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionValorRubroVariable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";
	
	public ValorRubroVariableSessionBean valorrubrovariableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ValorRubroVariable> valorrubrovariables;		
	public List<ValorRubroVariable> valorrubrovariablesEliminados;	
	public List<ValorRubroVariable> valorrubrovariablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByValorRubroVariable;		
	protected JButton jButtonAbrirOrderByValorRubroVariable;
	
	
	//protected JPanel jPanelOrderByValorRubroVariable;
	//public JScrollPane jScrollPanelOrderByValorRubroVariable;	
	//protected JButton jButtonCerrarOrderByValorRubroVariable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ValorRubroVariableLogic valorrubrovariableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosValorRubroVariable;
	public JScrollPane jScrollPanelDatosEdicionValorRubroVariable;
	public JScrollPane jScrollPanelDatosGeneralValorRubroVariable;
    
	
	
	//public JScrollPane jScrollPanelDatosValorRubroVariableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoValorRubroVariable;
	//public JScrollPane jScrollPanelImportacionValorRubroVariable;
	
	
	
	protected JPanel jPanelAccionesValorRubroVariable;
	
    protected JPanel jPanelPaginacionValorRubroVariable;
    protected JPanel jPanelParametrosReportesValorRubroVariable;
	protected JPanel jPanelParametrosReportesAccionesValorRubroVariable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ValorRubroVariable;
	protected JPanel jPanelParametrosAuxiliar2ValorRubroVariable;
	protected JPanel jPanelParametrosAuxiliar3ValorRubroVariable;
	protected JPanel jPanelParametrosAuxiliar4ValorRubroVariable;
	//protected JPanel jPanelParametrosAuxiliar5ValorRubroVariable;
	
	
	
	//protected JPanel jPanelReporteDinamicoValorRubroVariable;
	//protected JPanel jPanelImportacionValorRubroVariable;
	
	
	public JTable jTableDatosValorRubroVariable;
	
	
	
	//public JTable jTableDatosValorRubroVariableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoValorRubroVariable;
	protected JButton jButtonDuplicarValorRubroVariable;
	protected JButton jButtonCopiarValorRubroVariable;
	protected JButton jButtonVerFormValorRubroVariable;
	protected JButton jButtonNuevoRelacionesValorRubroVariable;
	protected JButton jButtonModificarValorRubroVariable;
	
    protected JButton jButtonGuardarCambiosTablaValorRubroVariable;
	protected JButton jButtonCerrarValorRubroVariable;
	
	
	protected JButton jButtonRecargarInformacionValorRubroVariable;
	protected JButton jButtonProcesarInformacionValorRubroVariable;
	
	
	protected JButton jButtonAnterioresValorRubroVariable;
	protected JButton jButtonSiguientesValorRubroVariable;
	protected JButton jButtonNuevoGuardarCambiosValorRubroVariable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoValorRubroVariable;
	//protected JButton jButtonCerrarReporteDinamicoValorRubroVariable;
	//protected JButton jButtonGenerarExcelReporteDinamicoValorRubroVariable;	
	
	
	
	//protected JButton jButtonAbrirImportacionValorRubroVariable;
	//protected JButton jButtonGenerarImportacionValorRubroVariable;
	//protected JButton jButtonCerrarImportacionValorRubroVariable;
	//protected JFileChooser jFileChooserImportacionValorRubroVariable;
	//protected File fileImportacionValorRubroVariable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarValorRubroVariable;
	protected JButton jButtonDuplicarToolBarValorRubroVariable;
	protected JButton jButtonNuevoRelacionesToolBarValorRubroVariable;
	
	
	public JButton jButtonGuardarCambiosToolBarValorRubroVariable;
	protected JButton jButtonCopiarToolBarValorRubroVariable;
	protected JButton jButtonVerFormToolBarValorRubroVariable;
	public JButton jButtonGuardarCambiosTablaToolBarValorRubroVariable;
	protected JButton jButtonMostrarOcultarTablaToolBarValorRubroVariable;
	protected JButton jButtonCerrarToolBarValorRubroVariable;
	
	protected JButton jButtonRecargarInformacionToolBarValorRubroVariable;
	protected JButton jButtonProcesarInformacionToolBarValorRubroVariable;
	protected JButton jButtonAnterioresToolBarValorRubroVariable;
	protected JButton jButtonSiguientesToolBarValorRubroVariable;
	protected JButton jButtonNuevoGuardarCambiosToolBarValorRubroVariable;
	protected JButton jButtonAbrirOrderByToolBarValorRubroVariable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoValorRubroVariable;
	protected JMenuItem jMenuItemDuplicarValorRubroVariable;
	protected JMenuItem jMenuItemNuevoRelacionesValorRubroVariable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosValorRubroVariable;
	protected JMenuItem jMenuItemCopiarValorRubroVariable;
	protected JMenuItem jMenuItemVerFormValorRubroVariable;
	protected JMenuItem jMenuItemGuardarCambiosTablaValorRubroVariable;
	protected JMenuItem jMenuItemCerrarValorRubroVariable;
	protected JMenuItem jMenuItemDetalleCerrarValorRubroVariable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByValorRubroVariable;
	protected JMenuItem jMenuItemDetalleMostarOcultarValorRubroVariable;
	
	protected JMenuItem jMenuItemRecargarInformacionValorRubroVariable;
	protected JMenuItem jMenuItemProcesarInformacionValorRubroVariable;
	protected JMenuItem jMenuItemAnterioresValorRubroVariable;
	protected JMenuItem jMenuItemSiguientesValorRubroVariable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosValorRubroVariable;
	protected JMenuItem jMenuItemAbrirOrderByValorRubroVariable;
	protected JMenuItem jMenuItemMostrarOcultarValorRubroVariable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesValorRubroVariable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosValorRubroVariable;
	protected JCheckBox jCheckBoxSeleccionadosValorRubroVariable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaValorRubroVariable;
	protected JCheckBox jCheckBoxConGraficoReporteValorRubroVariable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesValorRubroVariable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesValorRubroVariable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoValorRubroVariable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoValorRubroVariable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesValorRubroVariable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionValorRubroVariable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesValorRubroVariable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesValorRubroVariable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarValorRubroVariable;
	protected JTextField jTextFieldValorCampoGeneralValorRubroVariable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteValorRubroVariable;
	//public JList<Reporte> jListColumnasSelectReporteValorRubroVariable;
	//public JScrollPane jScrollColumnasSelectReporteValorRubroVariable;
	
	//public JLabel jLabelRelacionesSelectReporteValorRubroVariable;
	//public JList<Reporte> jListRelacionesSelectReporteValorRubroVariable;
	//public JScrollPane jScrollRelacionesSelectReporteValorRubroVariable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoValorRubroVariable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoValorRubroVariable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoValorRubroVariable;
	//public JLabel jLabelTiposArchivoReporteDinamicoValorRubroVariable;
	
		
	//public JLabel jLabelArchivoImportacionValorRubroVariable;	
	//public JLabel jLabelPathArchivoImportacionValorRubroVariable;
	//protected JTextField jTextFieldPathArchivoImportacionValorRubroVariable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoValorRubroVariable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoValorRubroVariable;
	
	//public JLabel jLabelColumnaCategoriaValorValorRubroVariable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorValorRubroVariable;
	
	//public JLabel jLabelColumnasValoresGraficoValorRubroVariable;
	//public JList<Reporte> jListColumnasValoresGraficoValorRubroVariable;
	//public JScrollPane jScrollColumnasValoresGraficoValorRubroVariable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoValorRubroVariable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoValorRubroVariable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasValorRubroVariable;
	public JPanel jPanelFK_IdEmpleadoValorRubroVariable;
	public JButton jButtonFK_IdEmpleadoValorRubroVariable;
	public JPanel jPanelFK_IdRubroEmpleaValorRubroVariable;
	public JButton jButtonFK_IdRubroEmpleaValorRubroVariable;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoValorRubroVariable;
	public JLabel jLabelid_empleadoFK_IdEmpleadoValorRubroVariable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable;
	public JButton jButtonid_empleadoFK_IdEmpleadoValorRubroVariable= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoValorRubroVariableUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoValorRubroVariableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaValorRubroVariableUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaValorRubroVariableBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ValorRubroVariableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionValorRubroVariable)	{
		this.jButtonRecargarInformacionValorRubroVariable = jButtonRecargarInformacionValorRubroVariable;
	}
	
	public JButton getjButtonProcesarInformacionValorRubroVariable() {
		return this.jButtonProcesarInformacionValorRubroVariable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionValorRubroVariable)	{
		this.jButtonProcesarInformacionValorRubroVariable = jButtonProcesarInformacionValorRubroVariable;
	}
	
	
	public JButton getjButtonRecargarInformacionValorRubroVariable() {
		return this.jButtonRecargarInformacionValorRubroVariable;
	}
	
	
	public List<ValorRubroVariable> getvalorrubrovariables() {
		return this.valorrubrovariables;
	}

	public void setvalorrubrovariables(List<ValorRubroVariable> valorrubrovariables) {
		this.valorrubrovariables = valorrubrovariables;
	}
	
	public List<ValorRubroVariable> getvalorrubrovariablesAux() {
		return this.valorrubrovariablesAux;
	}

	public void setvalorrubrovariablesAux(List<ValorRubroVariable> valorrubrovariablesAux) {
		this.valorrubrovariablesAux = valorrubrovariablesAux;
	}
	
	public List<ValorRubroVariable> getvalorrubrovariablesEliminados() {
		return this.valorrubrovariablesEliminados;
	}

	public void setValorRubroVariablesEliminados(List<ValorRubroVariable> valorrubrovariablesEliminados) {
		this.valorrubrovariablesEliminados = valorrubrovariablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarValorRubroVariable() {
		return jComboBoxTiposSeleccionarValorRubroVariable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarValorRubroVariable(
			JComboBox jComboBoxTiposSeleccionarValorRubroVariable) {
		this.jComboBoxTiposSeleccionarValorRubroVariable = jComboBoxTiposSeleccionarValorRubroVariable;
	}
	
	public void setBorderResaltarTiposSeleccionarValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarValorRubroVariable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralValorRubroVariable() {
		return jTextFieldValorCampoGeneralValorRubroVariable;
	}

	public void setjTextFieldValorCampoGeneralValorRubroVariable(
			JTextField jTextFieldValorCampoGeneralValorRubroVariable) {
		this.jTextFieldValorCampoGeneralValorRubroVariable = jTextFieldValorCampoGeneralValorRubroVariable;
	}

	public void setBorderResaltarValorCampoGeneralValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralValorRubroVariable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosValorRubroVariable() {
		return this.jCheckBoxSeleccionarTodosValorRubroVariable;
	}

	public void setjCheckBoxSeleccionarTodosValorRubroVariable(
			JCheckBox jCheckBoxSeleccionarTodosValorRubroVariable) {
		this.jCheckBoxSeleccionarTodosValorRubroVariable = jCheckBoxSeleccionarTodosValorRubroVariable;
	}

	public void setBorderResaltarSeleccionarTodosValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosValorRubroVariable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosValorRubroVariable() {
		return this.jCheckBoxSeleccionadosValorRubroVariable;
	}

	public void setjCheckBoxSeleccionadosValorRubroVariable(
			JCheckBox jCheckBoxSeleccionadosValorRubroVariable) {
		this.jCheckBoxSeleccionadosValorRubroVariable = jCheckBoxSeleccionadosValorRubroVariable;
	}
	
	public void setBorderResaltarSeleccionadosValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosValorRubroVariable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesValorRubroVariable() {
		return this.jComboBoxTiposArchivosReportesValorRubroVariable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesValorRubroVariable(
			JComboBox jComboBoxTiposArchivosReportesValorRubroVariable) {
		this.jComboBoxTiposArchivosReportesValorRubroVariable = jComboBoxTiposArchivosReportesValorRubroVariable;
	}

	public void setBorderResaltarTiposArchivosReportesValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesValorRubroVariable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesValorRubroVariable() {
		return this.jComboBoxTiposReportesValorRubroVariable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesValorRubroVariable(
			JComboBox jComboBoxTiposReportesValorRubroVariable) {
		this.jComboBoxTiposReportesValorRubroVariable = jComboBoxTiposReportesValorRubroVariable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoValorRubroVariable() {
	//	return jComboBoxTiposReportesDinamicoValorRubroVariable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoValorRubroVariable(
	//		JComboBox jComboBoxTiposReportesDinamicoValorRubroVariable) {
	//	this.jComboBoxTiposReportesDinamicoValorRubroVariable = jComboBoxTiposReportesDinamicoValorRubroVariable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoValorRubroVariable() {
	//	return jComboBoxTiposArchivosReportesDinamicoValorRubroVariable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoValorRubroVariable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoValorRubroVariable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable = jComboBoxTiposArchivosReportesDinamicoValorRubroVariable;
	//}
	
	public void setBorderResaltarTiposReportesValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesValorRubroVariable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesValorRubroVariable() {
		return this.jComboBoxTiposGraficosReportesValorRubroVariable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesValorRubroVariable(
			JComboBox jComboBoxTiposGraficosReportesValorRubroVariable) {
		this.jComboBoxTiposGraficosReportesValorRubroVariable = jComboBoxTiposGraficosReportesValorRubroVariable;
	}
	
	public void setBorderResaltarTiposGraficosReportesValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesValorRubroVariable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionValorRubroVariable() {
		return this.jComboBoxTiposPaginacionValorRubroVariable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionValorRubroVariable(
			JComboBox jComboBoxTiposPaginacionValorRubroVariable) {
		this.jComboBoxTiposPaginacionValorRubroVariable = jComboBoxTiposPaginacionValorRubroVariable;
	}
	
	public void setBorderResaltarTiposPaginacionValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionValorRubroVariable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesValorRubroVariable() {
		return this.jComboBoxTiposRelacionesValorRubroVariable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesValorRubroVariable() {
		return this.jComboBoxTiposAccionesValorRubroVariable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesValorRubroVariable(
			JComboBox jComboBoxTiposRelacionesValorRubroVariable) {
		this.jComboBoxTiposRelacionesValorRubroVariable = jComboBoxTiposRelacionesValorRubroVariable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesValorRubroVariable(
			JComboBox jComboBoxTiposAccionesValorRubroVariable) {
		this.jComboBoxTiposAccionesValorRubroVariable = jComboBoxTiposAccionesValorRubroVariable;
	}
	
	public void setBorderResaltarTiposRelacionesValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesValorRubroVariable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesValorRubroVariable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesValorRubroVariable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoValorRubroVariable() {
	//	return jCheckBoxConGraficoDinamicoValorRubroVariable;
	//}

	//public void setjCheckBoxConGraficoDinamicoValorRubroVariable(
	//		JCheckBox jCheckBoxConGraficoDinamicoValorRubroVariable) {
	//	this.jCheckBoxConGraficoDinamicoValorRubroVariable = jCheckBoxConGraficoDinamicoValorRubroVariable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoValorRubroVariable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarValorRubroVariable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoValorRubroVariable .setBorder(borderResaltar);		
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
		this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		
		this.valorrubrovariableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.valorrubrovariableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.valorrubrovariableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ValorRubroVariableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Valor Rubro Variable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
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
		
		ValorRubroVariableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarValorRubroVariable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"nuevo","nuevo","Nuevo"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"duplicar","duplicar","Duplicar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"copiar","copiar","Copiar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"ver_form","ver_form","Ver"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"recargar","recargar","Recargar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarValorRubroVariable,this.jTtoolBarValorRubroVariable,
							"cerrar","cerrar","Salir"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarValorRubroVariable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarValorRubroVariable;
			
				this.jButtonProcesarInformacionToolBarValorRubroVariable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarValorRubroVariable;
				
		//protected JButton jButtonModificarToolBarValorRubroVariable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarValorRubroVariable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuValorRubroVariable=new JMenuMe("General");
		this.jmenuArchivoValorRubroVariable=new JMenuMe("Archivo");
		this.jmenuAccionesValorRubroVariable=new JMenuMe("Acciones");
		this.jmenuDatosValorRubroVariable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoValorRubroVariable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoValorRubroVariable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoValorRubroVariable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarValorRubroVariable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarValorRubroVariable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarValorRubroVariable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesValorRubroVariable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesValorRubroVariable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesValorRubroVariable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosValorRubroVariable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosValorRubroVariable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosValorRubroVariable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarValorRubroVariable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarValorRubroVariable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarValorRubroVariable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormValorRubroVariable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormValorRubroVariable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormValorRubroVariable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaValorRubroVariable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaValorRubroVariable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaValorRubroVariable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarValorRubroVariable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarValorRubroVariable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarValorRubroVariable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionValorRubroVariable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionValorRubroVariable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionValorRubroVariable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionValorRubroVariable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionValorRubroVariable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionValorRubroVariable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresValorRubroVariable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresValorRubroVariable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresValorRubroVariable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesValorRubroVariable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesValorRubroVariable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesValorRubroVariable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByValorRubroVariable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByValorRubroVariable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByValorRubroVariable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarValorRubroVariable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarValorRubroVariable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarValorRubroVariable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByValorRubroVariable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByValorRubroVariable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByValorRubroVariable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarValorRubroVariable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarValorRubroVariable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarValorRubroVariable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosValorRubroVariable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosValorRubroVariable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosValorRubroVariable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoValorRubroVariable.add(this.jMenuItemCerrarValorRubroVariable);
			
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemNuevoValorRubroVariable);
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemNuevoGuardarCambiosValorRubroVariable);
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemNuevoRelacionesValorRubroVariable);
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemGuardarCambiosTablaValorRubroVariable);		
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemDuplicarValorRubroVariable);		
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemCopiarValorRubroVariable);		
			this.jmenuAccionesValorRubroVariable.add(this.jMenuItemVerFormValorRubroVariable);		
			
			this.jmenuDatosValorRubroVariable.add(this.jMenuItemRecargarInformacionValorRubroVariable);				
			this.jmenuDatosValorRubroVariable.add(this.jMenuItemAnterioresValorRubroVariable);				
			this.jmenuDatosValorRubroVariable.add(this.jMenuItemSiguientesValorRubroVariable);				
			this.jmenuDatosValorRubroVariable.add(this.jMenuItemAbrirOrderByValorRubroVariable);				
			this.jmenuDatosValorRubroVariable.add(this.jMenuItemMostrarOcultarValorRubroVariable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesValorRubroVariable.add(this.jMenuItemGuardarCambiosValorRubroVariable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarValorRubroVariable.add(this.jmenuArchivoValorRubroVariable);		
			this.jmenuBarValorRubroVariable.add(this.jmenuAccionesValorRubroVariable);		
			this.jmenuBarValorRubroVariable.add(this.jmenuDatosValorRubroVariable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarValorRubroVariable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasValorRubroVariable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoValorRubroVariable.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoValorRubroVariable= new JButtonMe();
		this.jButtonFK_IdEmpleadoValorRubroVariable.setText("Buscar");
		this.jButtonFK_IdEmpleadoValorRubroVariable.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoValorRubroVariable,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoValorRubroVariable = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoValorRubroVariable.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoValorRubroVariable.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoValorRubroVariable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaValorRubroVariable.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaValorRubroVariable= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaValorRubroVariable.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaValorRubroVariable.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaValorRubroVariable,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasValorRubroVariable=new JTabbedPane();


		this.jTabbedPaneBusquedasValorRubroVariable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasValorRubroVariable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasValorRubroVariable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasValorRubroVariable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasValorRubroVariable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleValorRubroVariable = new ValorRubroVariableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Valor Rubro Variable DATOS");
			this.jInternalFrameDetalleFormValorRubroVariable = new ValorRubroVariableDetalleFormJInternalFrame(jDesktopPane,this.valorrubrovariableSessionBean.getConGuardarRelaciones(),this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormValorRubroVariable = null;//new ValorRubroVariableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutValorRubroVariable= new GridBagLayout();
		
		
		this.jTableDatosValorRubroVariable = new JTableMe();      
		
		String sToolTipValorRubroVariable="";
		sToolTipValorRubroVariable=ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipValorRubroVariable+="(Nomina.ValorRubroVariable)";
		}
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			sToolTipValorRubroVariable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosValorRubroVariable.setToolTipText(sToolTipValorRubroVariable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosValorRubroVariable);
		this.jTableDatosValorRubroVariable.setAutoCreateRowSorter(true);
		this.jTableDatosValorRubroVariable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosValorRubroVariable.setRowSelectionAllowed(true);
		this.jTableDatosValorRubroVariable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosValorRubroVariable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoValorRubroVariable = new JButtonMe();
		this.jButtonDuplicarValorRubroVariable = new JButtonMe();
		this.jButtonCopiarValorRubroVariable = new JButtonMe();
		this.jButtonVerFormValorRubroVariable = new JButtonMe();
		this.jButtonNuevoRelacionesValorRubroVariable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaValorRubroVariable = new JButtonMe();
		this.jButtonCerrarValorRubroVariable = new JButtonMe();
		
		this.jScrollPanelDatosValorRubroVariable = new JScrollPane();   
        this.jScrollPanelDatosGeneralValorRubroVariable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Valor Rubro Variable";
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Rubro Variables" + this.sPath));
		} else {
			this.jScrollPanelDatosValorRubroVariable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesValorRubroVariable.setToolTipText("Acciones");
        this.jPanelAccionesValorRubroVariable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoValorRubroVariable=new ReporteDinamicoJInternalFrame(ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoValorRubroVariable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionValorRubroVariable=new ImportacionJInternalFrame(ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionValorRubroVariable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByValorRubroVariable = new JButtonMe();
		
		this.jButtonAbrirOrderByValorRubroVariable.setText("Orden");
		this.jButtonAbrirOrderByValorRubroVariable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByValorRubroVariable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByValorRubroVariable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorRubroVariable,false,this);
			
			//this.cargarOrderByValorRubroVariable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByValorRubroVariable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorRubroVariable,true,this);
			
			//this.cargarOrderByValorRubroVariable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosValorRubroVariable.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosValorRubroVariable.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosValorRubroVariable.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosValorRubroVariable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosValorRubroVariable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosValorRubroVariable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoValorRubroVariable.setText("Nuevo");
		this.jButtonDuplicarValorRubroVariable.setText("Duplicar");
		this.jButtonCopiarValorRubroVariable.setText("Copiar");
		this.jButtonVerFormValorRubroVariable.setText("Ver");
		this.jButtonNuevoRelacionesValorRubroVariable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.setText("Guardar");
		this.jButtonCerrarValorRubroVariable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoValorRubroVariable,"nuevo_button","Nuevo",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarValorRubroVariable,"duplicar_button","Duplicar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarValorRubroVariable,"copiar_button","Copiar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormValorRubroVariable,"ver_form","Ver",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesValorRubroVariable,"nuevorelaciones_button","Nuevo Rel",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaValorRubroVariable,"guardarcambiostabla_button","Guardar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarValorRubroVariable,"cerrar_button","Salir",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoValorRubroVariable.setToolTipText("Nuevo"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarValorRubroVariable.setToolTipText("Duplicar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarValorRubroVariable.setToolTipText("Copiar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormValorRubroVariable.setToolTipText("Ver"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesValorRubroVariable.setToolTipText("Nuevo Rel"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.setToolTipText("Guardar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarValorRubroVariable.setToolTipText("Salir"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoValorRubroVariable";
		inputMap = this.jButtonNuevoValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoValorRubroVariable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoValorRubroVariable"));
		
		//DUPLICAR
		sMapKey = "DuplicarValorRubroVariable";
		inputMap = this.jButtonDuplicarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarValorRubroVariable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarValorRubroVariable"));
		
		//COPIAR
		sMapKey = "CopiarValorRubroVariable";
		inputMap = this.jButtonCopiarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarValorRubroVariable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarValorRubroVariable"));
		
		//VEr FORM
		sMapKey = "VerFormValorRubroVariable";
		inputMap = this.jButtonVerFormValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormValorRubroVariable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormValorRubroVariable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesValorRubroVariable";
		inputMap = this.jButtonNuevoRelacionesValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesValorRubroVariable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarValorRubroVariable";
		inputMap = this.jButtonModificarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarValorRubroVariable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarValorRubroVariable";
		inputMap = this.jButtonCerrarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarValorRubroVariable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaValorRubroVariable";
		inputMap = this.jButtonGuardarCambiosTablaValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaValorRubroVariable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ValorRubroVariable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ValorRubroVariable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ValorRubroVariable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ValorRubroVariable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ValorRubroVariable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesValorRubroVariable.setName("jPanelParametrosReportesValorRubroVariable"); 
		
		this.jPanelParametrosReportesAccionesValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesValorRubroVariable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesValorRubroVariable.setName("jPanelParametrosReportesAccionesValorRubroVariable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionValorRubroVariable = new JButtonMe();
		this.jButtonRecargarInformacionValorRubroVariable.setText("Recargar");
		this.jButtonRecargarInformacionValorRubroVariable.setToolTipText("Recargar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionValorRubroVariable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionValorRubroVariable = new JButtonMe();
		this.jButtonProcesarInformacionValorRubroVariable.setText("Procesar");
		this.jButtonProcesarInformacionValorRubroVariable.setToolTipText("Procesar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionValorRubroVariable.setVisible(false);
			
		this.jButtonProcesarInformacionValorRubroVariable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionValorRubroVariable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionValorRubroVariable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesValorRubroVariable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesValorRubroVariable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesValorRubroVariable.setText("TIPO");       
		this.jComboBoxTiposReportesValorRubroVariable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesValorRubroVariable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesValorRubroVariable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionValorRubroVariable.setText("Paginacion");
		this.jComboBoxTiposPaginacionValorRubroVariable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesValorRubroVariable.setText("Accion");
		this.jComboBoxTiposRelacionesValorRubroVariable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesValorRubroVariable.setText("Accion");
		this.jComboBoxTiposAccionesValorRubroVariable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarValorRubroVariable.setText("Accion");
		this.jComboBoxTiposSeleccionarValorRubroVariable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralValorRubroVariable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralValorRubroVariable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralValorRubroVariable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralValorRubroVariable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesValorRubroVariable = new JLabelMe();
		
		this.jLabelAccionesValorRubroVariable.setText("Acciones");		
		this.jLabelAccionesValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosValorRubroVariable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosValorRubroVariable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosValorRubroVariable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosValorRubroVariable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosValorRubroVariable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosValorRubroVariable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaValorRubroVariable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaValorRubroVariable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaValorRubroVariable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteValorRubroVariable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteValorRubroVariable.setText("Graf.");
		this.jCheckBoxConGraficoReporteValorRubroVariable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresValorRubroVariable = new JButtonMe();
		//this.jButtonAnterioresValorRubroVariable.setText("<<");
        this.jButtonAnterioresValorRubroVariable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresValorRubroVariable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesValorRubroVariable = new JButtonMe();
		//this.jButtonSiguientesValorRubroVariable.setText(">>");
        this.jButtonSiguientesValorRubroVariable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesValorRubroVariable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosValorRubroVariable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosValorRubroVariable.setText("Nue");
        this.jButtonNuevoGuardarCambiosValorRubroVariable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosValorRubroVariable,"nuevoguardarcambios_button","Nue",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosValorRubroVariable";
		inputMap = this.jButtonNuevoGuardarCambiosValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosValorRubroVariable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionValorRubroVariable";
		inputMap = this.jButtonRecargarInformacionValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionValorRubroVariable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesValorRubroVariable";
		inputMap = this.jButtonSiguientesValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesValorRubroVariable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresValorRubroVariable";
		inputMap = this.jButtonAnterioresValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresValorRubroVariable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasValorRubroVariable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesValorRubroVariable.setMinimumSize(new Dimension(this.getWidth(),ValorRubroVariableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ValorRubroVariableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesValorRubroVariable.setMaximumSize(new Dimension(this.getWidth(),ValorRubroVariableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ValorRubroVariableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesValorRubroVariable.setPreferredSize(new Dimension(this.getWidth(),ValorRubroVariableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ValorRubroVariableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionValorRubroVariable = new GridBagLayout();

			this.jPanelPaginacionValorRubroVariable.setLayout(gridaBagLayoutPaginacionValorRubroVariable);						
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 0;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonAnterioresValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
					
						
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsValorRubroVariable.gridy = 0;
			
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonNuevoGuardarCambiosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
						
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsValorRubroVariable.gridy = 0;
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonSiguientesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 1;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonNuevoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
						
			
			
			if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
				this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsValorRubroVariable.gridy = 1;
				this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionValorRubroVariable.add(this.jButtonGuardarCambiosTablaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			}
			
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 1;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonDuplicarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 1;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonCopiarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 1;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonVerFormValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 1;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionValorRubroVariable.add(this.jButtonCerrarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		
		this.jButtonRecargarInformacionValorRubroVariable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionValorRubroVariable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionValorRubroVariable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesValorRubroVariable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesValorRubroVariable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesValorRubroVariable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesValorRubroVariable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesValorRubroVariable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesValorRubroVariable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesValorRubroVariable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesValorRubroVariable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesValorRubroVariable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionValorRubroVariable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionValorRubroVariable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionValorRubroVariable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesValorRubroVariable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesValorRubroVariable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesValorRubroVariable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesValorRubroVariable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorRubroVariable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorRubroVariable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarValorRubroVariable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarValorRubroVariable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarValorRubroVariable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaValorRubroVariable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaValorRubroVariable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaValorRubroVariable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteValorRubroVariable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteValorRubroVariable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteValorRubroVariable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosValorRubroVariable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosValorRubroVariable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosValorRubroVariable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosValorRubroVariable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosValorRubroVariable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosValorRubroVariable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesValorRubroVariable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesValorRubroVariable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ValorRubroVariable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ValorRubroVariable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ValorRubroVariable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ValorRubroVariable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesValorRubroVariable.setLayout(gridaBagParametrosReportesValorRubroVariable);
			this.jPanelParametrosReportesAccionesValorRubroVariable.setLayout(gridaBagParametrosReportesAccionesValorRubroVariable);
			
			
			this.jPanelParametrosAuxiliar1ValorRubroVariable.setLayout(gridaBagParametrosAuxiliar1ValorRubroVariable);
			this.jPanelParametrosAuxiliar2ValorRubroVariable.setLayout(gridaBagParametrosAuxiliar2ValorRubroVariable);
			this.jPanelParametrosAuxiliar3ValorRubroVariable.setLayout(gridaBagParametrosAuxiliar3ValorRubroVariable);
			this.jPanelParametrosAuxiliar4ValorRubroVariable.setLayout(gridaBagParametrosAuxiliar4ValorRubroVariable);
			//this.jPanelParametrosAuxiliar5ValorRubroVariable.setLayout(gridaBagParametrosAuxiliar2ValorRubroVariable);			
			
			
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorRubroVariable.add(this.jButtonRecargarInformacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ValorRubroVariable.add(this.jComboBoxTiposPaginacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ValorRubroVariable.add(this.jCheckBoxConAltoMaximoTablaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ValorRubroVariable.add(this.jComboBoxTiposArchivosReportesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorRubroVariable.add(this.jPanelParametrosAuxiliar1ValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ValorRubroVariable.add(this.jComboBoxTiposReportesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);																		
			
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ValorRubroVariable.add(this.jComboBoxTiposGraficosReportesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorRubroVariable.add(this.jPanelParametrosAuxiliar4ValorRubroVariable, this.gridBagConstraintsValorRubroVariable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorRubroVariable.add(this.jComboBoxTiposReportesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorRubroVariable.add(this.jCheckBoxGenerarReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorRubroVariable.add(this.jPanelParametrosAuxiliar2ValorRubroVariable, this.gridBagConstraintsValorRubroVariable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorRubroVariable.add(this.jLabelAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
				this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesValorRubroVariable.add(this.jButtonAbrirOrderByValorRubroVariable, this.gridBagConstraintsValorRubroVariable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorRubroVariable.add(this.jComboBoxTiposSeleccionarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
			
			
			/*
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorRubroVariable.add(this.jCheckBoxSeleccionarTodosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesValorRubroVariable.add(this.jCheckBoxConGraficoReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ValorRubroVariable.add(this.jCheckBoxSeleccionarTodosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);															
				
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ValorRubroVariable.add(this.jCheckBoxSeleccionadosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);															
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsValorRubroVariable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ValorRubroVariable.add(this.jCheckBoxConGraficoReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesValorRubroVariable.add(this.jPanelParametrosAuxiliar3ValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorRubroVariable.add(this.jComboBoxTiposAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
	
				
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesValorRubroVariable.add(this.jTextFieldValorCampoGeneralValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosValorRubroVariable = new GridBagLayout();

			this.jScrollPanelDatosValorRubroVariable.setLayout(gridaBagLayoutDatosValorRubroVariable);
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = 0;
			this.gridBagConstraintsValorRubroVariable.gridx = 0;
			
			this.jScrollPanelDatosValorRubroVariable.add(this.jTableDatosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosValorRubroVariable.setViewportView(this.jTableDatosValorRubroVariable);
		this.jTableDatosValorRubroVariable.setFillsViewportHeight(true);
		this.jTableDatosValorRubroVariable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesValorRubroVariable= new GridBagLayout();
		this.jPanelAccionesValorRubroVariable.setLayout(gridaBagLayoutAccionesValorRubroVariable);
		
		
		/*	
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
			
		this.jPanelAccionesValorRubroVariable.add(this.jButtonNuevoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoValorRubroVariable= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoValorRubroVariable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoValorRubroVariable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoValorRubroVariable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoValorRubroVariable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoValorRubroVariable.setLayout(gridaBagLayoutFK_IdEmpleadoValorRubroVariable);

		gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorRubroVariable.gridy = 0;
		gridBagConstraintsValorRubroVariable.gridx = 0;
		jPanelFK_IdEmpleadoValorRubroVariable.add(jLabelid_empleadoFK_IdEmpleadoValorRubroVariable, gridBagConstraintsValorRubroVariable);

		gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorRubroVariable.gridy = 0;
		gridBagConstraintsValorRubroVariable.gridx = 1;
		jPanelFK_IdEmpleadoValorRubroVariable.add(jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable, gridBagConstraintsValorRubroVariable);

		gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorRubroVariable.gridy = 1;
		gridBagConstraintsValorRubroVariable.gridx =1;
		jPanelFK_IdEmpleadoValorRubroVariable.add(jButtonFK_IdEmpleadoValorRubroVariable, gridBagConstraintsValorRubroVariable);

		jTabbedPaneBusquedasValorRubroVariable.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoValorRubroVariable);
		jTabbedPaneBusquedasValorRubroVariable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaValorRubroVariable= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaValorRubroVariable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaValorRubroVariable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaValorRubroVariable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaValorRubroVariable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaValorRubroVariable.setLayout(gridaBagLayoutFK_IdRubroEmpleaValorRubroVariable);

		gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorRubroVariable.gridy = 0;
		gridBagConstraintsValorRubroVariable.gridx = 0;
		jPanelFK_IdRubroEmpleaValorRubroVariable.add(jLabelid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable, gridBagConstraintsValorRubroVariable);

		gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorRubroVariable.gridy = 0;
		gridBagConstraintsValorRubroVariable.gridx = 1;
		jPanelFK_IdRubroEmpleaValorRubroVariable.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable, gridBagConstraintsValorRubroVariable);

		gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsValorRubroVariable.gridy = 1;
		gridBagConstraintsValorRubroVariable.gridx =1;
		jPanelFK_IdRubroEmpleaValorRubroVariable.add(jButtonFK_IdRubroEmpleaValorRubroVariable, gridBagConstraintsValorRubroVariable);

		jTabbedPaneBusquedasValorRubroVariable.addTab("2.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaValorRubroVariable);
		jTabbedPaneBusquedasValorRubroVariable.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutValorRubroVariable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutValorRubroVariable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();						
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsValorRubroVariable.gridx = 0;		
			//this.gridBagConstraintsValorRubroVariable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsValorRubroVariable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsValorRubroVariable.gridx = 0;		
		//this.gridBagConstraintsValorRubroVariable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsValorRubroVariable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsValorRubroVariable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsValorRubroVariable.gridx = 0;		
			this.gridBagConstraintsValorRubroVariable.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsValorRubroVariable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasValorRubroVariable, this.gridBagConstraintsValorRubroVariable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);								
		
		
		/*
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		*/		
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsValorRubroVariable.gridx =0;
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsValorRubroVariable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
				
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosValorRubroVariable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosValorRubroVariable = new GridBagLayout();
			this.jPanelBusquedasParametrosValorRubroVariable.setLayout(gridaBagLayoutBusquedasParametrosValorRubroVariable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralValorRubroVariable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralValorRubroVariable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorRubroVariable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorRubroVariable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralValorRubroVariable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoValorRubroVariable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoValorRubroVariable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoValorRubroVariable.setName("jPanelReporteDinamicoValorRubroVariable"); 
		
		this.jPanelReporteDinamicoValorRubroVariable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoValorRubroVariable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoValorRubroVariable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoValorRubroVariable.setLayout(gridaBagLayoutReporteDinamicoValorRubroVariable);
		
		
		this.jInternalFrameReporteDinamicoValorRubroVariable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoValorRubroVariable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteValorRubroVariable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoValorRubroVariable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoValorRubroVariable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoValorRubroVariable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoValorRubroVariable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoValorRubroVariable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoValorRubroVariable.setResizable(true);
	    this.jInternalFrameReporteDinamicoValorRubroVariable.setClosable(true);
	    this.jInternalFrameReporteDinamicoValorRubroVariable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoValorRubroVariable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoValorRubroVariable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoValorRubroVariable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Rubro Variables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteValorRubroVariable = new JLabelMe();

		this.jLabelColumnasSelectReporteValorRubroVariable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelColumnasSelectReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteValorRubroVariable = new JList<Reporte>();
		this.jListColumnasSelectReporteValorRubroVariable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteValorRubroVariable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteValorRubroVariable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteValorRubroVariable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteValorRubroVariable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteValorRubroVariable=new JScrollPane(this.jListColumnasSelectReporteValorRubroVariable);
			
			this.jScrollColumnasSelectReporteValorRubroVariable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteValorRubroVariable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteValorRubroVariable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoValorRubroVariable.add(this.jListColumnasSelectReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jScrollColumnasSelectReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteValorRubroVariable = new JLabelMe();

		this.jLabelRelacionesSelectReporteValorRubroVariable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteValorRubroVariable = new JList<Reporte>();
		this.jListRelacionesSelectReporteValorRubroVariable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteValorRubroVariable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteValorRubroVariable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteValorRubroVariable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteValorRubroVariable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteValorRubroVariable=new JScrollPane(this.jListRelacionesSelectReporteValorRubroVariable);
			
			this.jScrollRelacionesSelectReporteValorRubroVariable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteValorRubroVariable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteValorRubroVariable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoValorRubroVariable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoValorRubroVariable = new JComboBoxMe();
		this.jListColumnasValoresGraficoValorRubroVariable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoValorRubroVariable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoValorRubroVariable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoValorRubroVariable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoValorRubroVariable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoValorRubroVariable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoValorRubroVariable = new JLabelMe();

		this.jLabelConGraficoDinamicoValorRubroVariable.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelConGraficoDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoValorRubroVariable = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoValorRubroVariable.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoValorRubroVariable.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoValorRubroVariable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoValorRubroVariable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoValorRubroVariable.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jCheckBoxConGraficoDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoValorRubroVariable = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoValorRubroVariable.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelColumnaCategoriaGraficoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoValorRubroVariable.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoValorRubroVariable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoValorRubroVariable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoValorRubroVariable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoValorRubroVariable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jComboBoxColumnaCategoriaGraficoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorValorRubroVariable = new JLabelMe();

		this.jLabelColumnaCategoriaValorValorRubroVariable.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelColumnaCategoriaValorValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorValorRubroVariable.setText("Accion");
        this.jComboBoxColumnaCategoriaValorValorRubroVariable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorValorRubroVariable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorValorRubroVariable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorValorRubroVariable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jComboBoxColumnaCategoriaValorValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoValorRubroVariable = new JLabelMe();

		this.jLabelColumnasValoresGraficoValorRubroVariable.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelColumnasValoresGraficoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoValorRubroVariable = new JList<Reporte>();
		this.jListColumnasValoresGraficoValorRubroVariable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoValorRubroVariable.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoValorRubroVariable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoValorRubroVariable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoValorRubroVariable.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoValorRubroVariable=new JScrollPane(this.jListColumnasValoresGraficoValorRubroVariable);
			
			this.jScrollColumnasValoresGraficoValorRubroVariable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoValorRubroVariable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoValorRubroVariable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoValorRubroVariable.add(this.jListColumnasSelectReporteValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jScrollColumnasValoresGraficoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoValorRubroVariable = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoValorRubroVariable.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelTiposGraficosReportesDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoValorRubroVariable.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoValorRubroVariable.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoValorRubroVariable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoValorRubroVariable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoValorRubroVariable.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jComboBoxTiposGraficosReportesDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoValorRubroVariable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoValorRubroVariable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelGenerarExcelReporteDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoValorRubroVariable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoValorRubroVariable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoValorRubroVariable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoValorRubroVariable.setToolTipText("Generar EXCEL"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoValorRubroVariable.add(this.jButtonGenerarExcelReporteDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jComboBoxTiposReportesDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoValorRubroVariable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoValorRubroVariable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jLabelTiposArchivoReporteDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jComboBoxTiposArchivosReportesDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoValorRubroVariable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoValorRubroVariable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoValorRubroVariable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoValorRubroVariable.setToolTipText("Generar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jButtonGenerarReporteDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoValorRubroVariable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoValorRubroVariable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoValorRubroVariable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoValorRubroVariable.setToolTipText("Cancelar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoValorRubroVariable.add(this.jButtonCerrarReporteDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalValorRubroVariable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoValorRubroVariable= new JScrollPane(jPanelReporteDinamicoValorRubroVariable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoValorRubroVariable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoValorRubroVariable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoValorRubroVariable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Rubro Variables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsValorRubroVariable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoValorRubroVariable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoValorRubroVariable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalValorRubroVariable);
		this.jInternalFrameReporteDinamicoValorRubroVariable.getContentPane().add(this.jScrollPanelReporteDinamicoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionValorRubroVariable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionValorRubroVariable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionValorRubroVariable.setName("jPanelImportacionValorRubroVariable"); 
		
		this.jPanelImportacionValorRubroVariable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionValorRubroVariable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionValorRubroVariable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionValorRubroVariable.setLayout(gridaBagLayoutImportacionValorRubroVariable);
		
		
		this.jInternalFrameImportacionValorRubroVariable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionValorRubroVariable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionValorRubroVariable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteValorRubroVariable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionValorRubroVariable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionValorRubroVariable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionValorRubroVariable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionValorRubroVariable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionValorRubroVariable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionValorRubroVariable.setResizable(true);
	    this.jInternalFrameImportacionValorRubroVariable.setClosable(true);
	    this.jInternalFrameImportacionValorRubroVariable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionValorRubroVariable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionValorRubroVariable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionValorRubroVariable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionValorRubroVariable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionValorRubroVariable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionValorRubroVariable.setResizable(true);
	    this.jInternalFrameImportacionValorRubroVariable.setClosable(true);
	    this.jInternalFrameImportacionValorRubroVariable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionValorRubroVariable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionValorRubroVariable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionValorRubroVariable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Rubro Variables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionValorRubroVariable = new JLabelMe();

		this.jLabelArchivoImportacionValorRubroVariable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYImportacion;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionValorRubroVariable.add(this.jLabelArchivoImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionValorRubroVariable = new JFileChooser();		
		this.jFileChooserImportacionValorRubroVariable.setToolTipText("ESCOGER ARCHIVO"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionValorRubroVariable = new JButtonMe();
		this.jButtonAbrirImportacionValorRubroVariable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionValorRubroVariable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionValorRubroVariable.setToolTipText("Generar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYImportacion;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorRubroVariable.add(this.jButtonAbrirImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionValorRubroVariable = new JLabelMe();

		this.jLabelPathArchivoImportacionValorRubroVariable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYImportacion;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionValorRubroVariable.add(this.jLabelPathArchivoImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionValorRubroVariable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionValorRubroVariable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionValorRubroVariable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionValorRubroVariable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYImportacion;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorRubroVariable.add(this.jTextFieldPathArchivoImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionValorRubroVariable = new JButtonMe();
		this.jButtonGenerarImportacionValorRubroVariable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionValorRubroVariable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionValorRubroVariable.setToolTipText("Generar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYImportacion;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorRubroVariable.add(this.jButtonGenerarImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionValorRubroVariable = new JButtonMe();
		this.jButtonCerrarImportacionValorRubroVariable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionValorRubroVariable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionValorRubroVariable.setToolTipText("Cancelar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = iPosYImportacion;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionValorRubroVariable.add(this.jButtonCerrarImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalValorRubroVariable = new GridBagLayout();
		
		this.jScrollPanelImportacionValorRubroVariable= new JScrollPane(jPanelImportacionValorRubroVariable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy =iPosYImportacion;
		this.gridBagConstraintsValorRubroVariable.gridx =iPosXImportacion;
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionValorRubroVariable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionValorRubroVariable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalValorRubroVariable);
		this.jInternalFrameImportacionValorRubroVariable.getContentPane().add(this.jScrollPanelImportacionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByValorRubroVariable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByValorRubroVariable = new JButtonMe();
			this.jButtonAbrirOrderByValorRubroVariable.setText("Orden");
			this.jButtonAbrirOrderByValorRubroVariable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByValorRubroVariable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByValorRubroVariable";
			inputMap = this.jButtonAbrirOrderByValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByValorRubroVariable"));
		
		
			GridBagLayout gridaBagLayoutOrderByValorRubroVariable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByValorRubroVariable.setName("jPanelOrderByValorRubroVariable"); 
			
			this.jPanelOrderByValorRubroVariable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByValorRubroVariable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByValorRubroVariable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByValorRubroVariable.setLayout(gridaBagLayoutOrderByValorRubroVariable);
			
			
			this.jTableDatosValorRubroVariableOrderBy = new JTableMe();        
			this.jTableDatosValorRubroVariableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosValorRubroVariableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosValorRubroVariableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosValorRubroVariableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosValorRubroVariableOrderBy.setViewportView(this.jTableDatosValorRubroVariableOrderBy);
			this.jTableDatosValorRubroVariableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosValorRubroVariableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByValorRubroVariable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByValorRubroVariable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByValorRubroVariable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteValorRubroVariable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByValorRubroVariable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByValorRubroVariable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByValorRubroVariable.setTitle("Orden");
			this.jInternalFrameOrderByValorRubroVariable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByValorRubroVariable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByValorRubroVariable.setResizable(true);
			this.jInternalFrameOrderByValorRubroVariable.setClosable(true);
			this.jInternalFrameOrderByValorRubroVariable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByValorRubroVariable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByValorRubroVariable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByValorRubroVariable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Rubro Variables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsValorRubroVariable.gridx =iPosXOrderBy;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsValorRubroVariable.ipady =150;
				
			this.jPanelOrderByValorRubroVariable.add(jScrollPanelDatosValorRubroVariableOrderBy, this.gridBagConstraintsValorRubroVariable);//this.jTableDatosValorRubroVariableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByValorRubroVariable = new JButtonMe();
			this.jButtonCerrarOrderByValorRubroVariable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByValorRubroVariable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByValorRubroVariable.setToolTipText("Cancelar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsValorRubroVariable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByValorRubroVariable.add(this.jButtonCerrarOrderByValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalValorRubroVariable = new GridBagLayout();
			
			this.jScrollPanelOrderByValorRubroVariable= new JScrollPane(jPanelOrderByValorRubroVariable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy =iPosYOrderBy;
			this.gridBagConstraintsValorRubroVariable.gridx =iPosXOrderBy;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByValorRubroVariable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByValorRubroVariable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalValorRubroVariable);
			
			this.jInternalFrameOrderByValorRubroVariable.getContentPane().add(this.jScrollPanelOrderByValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
		
		} else {
			this.jButtonAbrirOrderByValorRubroVariable = new JButtonMe();
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
			&& this.valorrubrovariableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosValorRubroVariable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosValorRubroVariable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosValorRubroVariable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosValorRubroVariable.getRowHeight();//ValorRubroVariableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaValorRubroVariable.isSelected()) {
					iHeightTable=ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaValorRubroVariable.isSelected()) {
					iHeightTable=ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ValorRubroVariableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosValorRubroVariable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosValorRubroVariable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosValorRubroVariable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosValorRubroVariable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosValorRubroVariable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosValorRubroVariable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByValorRubroVariable!=null && this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy()!=null) {
			//if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByValorRubroVariable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByValorRubroVariable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByValorRubroVariable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosValorRubroVariable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosValorRubroVariable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosValorRubroVariable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=valorrubrovariableLogic.getValorRubroVariables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=valorrubrovariables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ValorRubroVariable> TraerValorRubroVariableBeans(List<ValorRubroVariable> valorrubrovariables,ArrayList<Classe> classes)throws Exception {
		try {
			for(ValorRubroVariable valorrubrovariable:valorrubrovariables) {
					
				if(!(ValorRubroVariableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ValorRubroVariableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					valorrubrovariable.setsDetalleGeneralEntityReporte(ValorRubroVariableConstantesFunciones.getValorRubroVariableDescripcion(valorrubrovariable));
										
						
					
						
					
				} else  {
							
					//valorrubrovariable.setsDetalleGeneralEntityReporte(valorrubrovariable.getsDetalleGeneralEntityReporte());
										
				}
				
				//valorrubrovariablebeans.add(valorrubrovariablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return valorrubrovariables;
    }
	//PARA REPORTES FIN
}
