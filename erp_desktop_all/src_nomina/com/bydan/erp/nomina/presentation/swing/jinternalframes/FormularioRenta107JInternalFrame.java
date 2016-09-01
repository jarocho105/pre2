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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.FormularioRenta107ConstantesFunciones;

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
public class FormularioRenta107JInternalFrame extends FormularioRenta107BeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormularioRenta107;
	
	protected JMenuBar jmenuBarFormularioRenta107;
	
	protected JMenu jmenuFormularioRenta107;
	protected JMenu jmenuDatosFormularioRenta107;
	protected JMenu jmenuArchivoFormularioRenta107;
	protected JMenu jmenuAccionesFormularioRenta107;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioRenta107;	
	protected GridBagConstraints gridBagConstraintsFormularioRenta107;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormularioRenta107DetalleFormJInternalFrame jInternalFrameDetalleFormFormularioRenta107;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormularioRenta107;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormularioRenta107;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public FormularioRenta107SessionBean formulariorenta107SessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormularioRenta107> formulariorenta107s;		
	public List<FormularioRenta107> formulariorenta107sEliminados;	
	public List<FormularioRenta107> formulariorenta107sAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormularioRenta107;		
	protected JButton jButtonAbrirOrderByFormularioRenta107;
	
	
	//protected JPanel jPanelOrderByFormularioRenta107;
	//public JScrollPane jScrollPanelOrderByFormularioRenta107;	
	//protected JButton jButtonCerrarOrderByFormularioRenta107;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormularioRenta107Logic formulariorenta107Logic;
	
	
	
	public JScrollPane jScrollPanelDatosFormularioRenta107;
	public JScrollPane jScrollPanelDatosEdicionFormularioRenta107;
	public JScrollPane jScrollPanelDatosGeneralFormularioRenta107;
    
	
	
	//public JScrollPane jScrollPanelDatosFormularioRenta107OrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormularioRenta107;
	//public JScrollPane jScrollPanelImportacionFormularioRenta107;
	
	
	
	protected JPanel jPanelAccionesFormularioRenta107;
	
    protected JPanel jPanelPaginacionFormularioRenta107;
    protected JPanel jPanelParametrosReportesFormularioRenta107;
	protected JPanel jPanelParametrosReportesAccionesFormularioRenta107;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormularioRenta107;
	protected JPanel jPanelParametrosAuxiliar2FormularioRenta107;
	protected JPanel jPanelParametrosAuxiliar3FormularioRenta107;
	protected JPanel jPanelParametrosAuxiliar4FormularioRenta107;
	//protected JPanel jPanelParametrosAuxiliar5FormularioRenta107;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormularioRenta107;
	//protected JPanel jPanelImportacionFormularioRenta107;
	
	
	public JTable jTableDatosFormularioRenta107;
	
	
	
	//public JTable jTableDatosFormularioRenta107OrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormularioRenta107;
	protected JButton jButtonDuplicarFormularioRenta107;
	protected JButton jButtonCopiarFormularioRenta107;
	protected JButton jButtonVerFormFormularioRenta107;
	protected JButton jButtonNuevoRelacionesFormularioRenta107;
	protected JButton jButtonModificarFormularioRenta107;
	
    protected JButton jButtonGuardarCambiosTablaFormularioRenta107;
	protected JButton jButtonCerrarFormularioRenta107;
	
	
	protected JButton jButtonRecargarInformacionFormularioRenta107;
	protected JButton jButtonProcesarInformacionFormularioRenta107;
	
	
	protected JButton jButtonAnterioresFormularioRenta107;
	protected JButton jButtonSiguientesFormularioRenta107;
	protected JButton jButtonNuevoGuardarCambiosFormularioRenta107;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormularioRenta107;
	//protected JButton jButtonCerrarReporteDinamicoFormularioRenta107;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormularioRenta107;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormularioRenta107;
	//protected JButton jButtonGenerarImportacionFormularioRenta107;
	//protected JButton jButtonCerrarImportacionFormularioRenta107;
	//protected JFileChooser jFileChooserImportacionFormularioRenta107;
	//protected File fileImportacionFormularioRenta107;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioRenta107;
	protected JButton jButtonDuplicarToolBarFormularioRenta107;
	protected JButton jButtonNuevoRelacionesToolBarFormularioRenta107;
	
	
	public JButton jButtonGuardarCambiosToolBarFormularioRenta107;
	protected JButton jButtonCopiarToolBarFormularioRenta107;
	protected JButton jButtonVerFormToolBarFormularioRenta107;
	public JButton jButtonGuardarCambiosTablaToolBarFormularioRenta107;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioRenta107;
	protected JButton jButtonCerrarToolBarFormularioRenta107;
	
	protected JButton jButtonRecargarInformacionToolBarFormularioRenta107;
	protected JButton jButtonProcesarInformacionToolBarFormularioRenta107;
	protected JButton jButtonAnterioresToolBarFormularioRenta107;
	protected JButton jButtonSiguientesToolBarFormularioRenta107;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormularioRenta107;
	protected JButton jButtonAbrirOrderByToolBarFormularioRenta107;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioRenta107;
	protected JMenuItem jMenuItemDuplicarFormularioRenta107;
	protected JMenuItem jMenuItemNuevoRelacionesFormularioRenta107;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormularioRenta107;
	protected JMenuItem jMenuItemCopiarFormularioRenta107;
	protected JMenuItem jMenuItemVerFormFormularioRenta107;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioRenta107;
	protected JMenuItem jMenuItemCerrarFormularioRenta107;
	protected JMenuItem jMenuItemDetalleCerrarFormularioRenta107;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormularioRenta107;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioRenta107;
	
	protected JMenuItem jMenuItemRecargarInformacionFormularioRenta107;
	protected JMenuItem jMenuItemProcesarInformacionFormularioRenta107;
	protected JMenuItem jMenuItemAnterioresFormularioRenta107;
	protected JMenuItem jMenuItemSiguientesFormularioRenta107;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioRenta107;
	protected JMenuItem jMenuItemAbrirOrderByFormularioRenta107;
	protected JMenuItem jMenuItemMostrarOcultarFormularioRenta107;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioRenta107;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormularioRenta107;
	protected JCheckBox jCheckBoxSeleccionadosFormularioRenta107;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormularioRenta107;
	protected JCheckBox jCheckBoxConGraficoReporteFormularioRenta107;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormularioRenta107;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormularioRenta107;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioRenta107;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormularioRenta107;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormularioRenta107;
	protected JTextField jTextFieldValorCampoGeneralFormularioRenta107;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormularioRenta107;
	//public JList<Reporte> jListColumnasSelectReporteFormularioRenta107;
	//public JScrollPane jScrollColumnasSelectReporteFormularioRenta107;
	
	//public JLabel jLabelRelacionesSelectReporteFormularioRenta107;
	//public JList<Reporte> jListRelacionesSelectReporteFormularioRenta107;
	//public JScrollPane jScrollRelacionesSelectReporteFormularioRenta107;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormularioRenta107;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormularioRenta107;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormularioRenta107;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormularioRenta107;
	
		
	//public JLabel jLabelArchivoImportacionFormularioRenta107;	
	//public JLabel jLabelPathArchivoImportacionFormularioRenta107;
	//protected JTextField jTextFieldPathArchivoImportacionFormularioRenta107;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormularioRenta107;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormularioRenta107;
	
	//public JLabel jLabelColumnaCategoriaValorFormularioRenta107;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormularioRenta107;
	
	//public JLabel jLabelColumnasValoresGraficoFormularioRenta107;
	//public JList<Reporte> jListColumnasValoresGraficoFormularioRenta107;
	//public JScrollPane jScrollColumnasValoresGraficoFormularioRenta107;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormularioRenta107;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormularioRenta107;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormularioRenta107;
	public JPanel jPanelFK_IdEmpleadoFormularioRenta107;
	public JButton jButtonFK_IdEmpleadoFormularioRenta107;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoFormularioRenta107;
	public JLabel jLabelid_empleadoFK_IdEmpleadoFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107;
	public JButton jButtonid_empleadoFK_IdEmpleadoFormularioRenta107= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoFormularioRenta107Busqueda= new JButtonMe();

	
	
	
	
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
	public FormularioRenta107JInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107JInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107JInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107JInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormularioRenta107)	{
		this.jButtonRecargarInformacionFormularioRenta107 = jButtonRecargarInformacionFormularioRenta107;
	}
	
	public JButton getjButtonProcesarInformacionFormularioRenta107() {
		return this.jButtonProcesarInformacionFormularioRenta107;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioRenta107)	{
		this.jButtonProcesarInformacionFormularioRenta107 = jButtonProcesarInformacionFormularioRenta107;
	}
	
	
	public JButton getjButtonRecargarInformacionFormularioRenta107() {
		return this.jButtonRecargarInformacionFormularioRenta107;
	}
	
	
	public List<FormularioRenta107> getformulariorenta107s() {
		return this.formulariorenta107s;
	}

	public void setformulariorenta107s(List<FormularioRenta107> formulariorenta107s) {
		this.formulariorenta107s = formulariorenta107s;
	}
	
	public List<FormularioRenta107> getformulariorenta107sAux() {
		return this.formulariorenta107sAux;
	}

	public void setformulariorenta107sAux(List<FormularioRenta107> formulariorenta107sAux) {
		this.formulariorenta107sAux = formulariorenta107sAux;
	}
	
	public List<FormularioRenta107> getformulariorenta107sEliminados() {
		return this.formulariorenta107sEliminados;
	}

	public void setFormularioRenta107sEliminados(List<FormularioRenta107> formulariorenta107sEliminados) {
		this.formulariorenta107sEliminados = formulariorenta107sEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormularioRenta107() {
		return jComboBoxTiposSeleccionarFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormularioRenta107(
			JComboBox jComboBoxTiposSeleccionarFormularioRenta107) {
		this.jComboBoxTiposSeleccionarFormularioRenta107 = jComboBoxTiposSeleccionarFormularioRenta107;
	}
	
	public void setBorderResaltarTiposSeleccionarFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormularioRenta107() {
		return jTextFieldValorCampoGeneralFormularioRenta107;
	}

	public void setjTextFieldValorCampoGeneralFormularioRenta107(
			JTextField jTextFieldValorCampoGeneralFormularioRenta107) {
		this.jTextFieldValorCampoGeneralFormularioRenta107 = jTextFieldValorCampoGeneralFormularioRenta107;
	}

	public void setBorderResaltarValorCampoGeneralFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormularioRenta107 .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormularioRenta107() {
		return this.jCheckBoxSeleccionarTodosFormularioRenta107;
	}

	public void setjCheckBoxSeleccionarTodosFormularioRenta107(
			JCheckBox jCheckBoxSeleccionarTodosFormularioRenta107) {
		this.jCheckBoxSeleccionarTodosFormularioRenta107 = jCheckBoxSeleccionarTodosFormularioRenta107;
	}

	public void setBorderResaltarSeleccionarTodosFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormularioRenta107() {
		return this.jCheckBoxSeleccionadosFormularioRenta107;
	}

	public void setjCheckBoxSeleccionadosFormularioRenta107(
			JCheckBox jCheckBoxSeleccionadosFormularioRenta107) {
		this.jCheckBoxSeleccionadosFormularioRenta107 = jCheckBoxSeleccionadosFormularioRenta107;
	}
	
	public void setBorderResaltarSeleccionadosFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormularioRenta107() {
		return this.jComboBoxTiposArchivosReportesFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormularioRenta107(
			JComboBox jComboBoxTiposArchivosReportesFormularioRenta107) {
		this.jComboBoxTiposArchivosReportesFormularioRenta107 = jComboBoxTiposArchivosReportesFormularioRenta107;
	}

	public void setBorderResaltarTiposArchivosReportesFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormularioRenta107() {
		return this.jComboBoxTiposReportesFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormularioRenta107(
			JComboBox jComboBoxTiposReportesFormularioRenta107) {
		this.jComboBoxTiposReportesFormularioRenta107 = jComboBoxTiposReportesFormularioRenta107;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormularioRenta107() {
	//	return jComboBoxTiposReportesDinamicoFormularioRenta107;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormularioRenta107(
	//		JComboBox jComboBoxTiposReportesDinamicoFormularioRenta107) {
	//	this.jComboBoxTiposReportesDinamicoFormularioRenta107 = jComboBoxTiposReportesDinamicoFormularioRenta107;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormularioRenta107() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormularioRenta107;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormularioRenta107(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioRenta107) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107 = jComboBoxTiposArchivosReportesDinamicoFormularioRenta107;
	//}
	
	public void setBorderResaltarTiposReportesFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormularioRenta107() {
		return this.jComboBoxTiposGraficosReportesFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormularioRenta107(
			JComboBox jComboBoxTiposGraficosReportesFormularioRenta107) {
		this.jComboBoxTiposGraficosReportesFormularioRenta107 = jComboBoxTiposGraficosReportesFormularioRenta107;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormularioRenta107() {
		return this.jComboBoxTiposPaginacionFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormularioRenta107(
			JComboBox jComboBoxTiposPaginacionFormularioRenta107) {
		this.jComboBoxTiposPaginacionFormularioRenta107 = jComboBoxTiposPaginacionFormularioRenta107;
	}
	
	public void setBorderResaltarTiposPaginacionFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormularioRenta107() {
		return this.jComboBoxTiposRelacionesFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRenta107() {
		return this.jComboBoxTiposAccionesFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioRenta107(
			JComboBox jComboBoxTiposRelacionesFormularioRenta107) {
		this.jComboBoxTiposRelacionesFormularioRenta107 = jComboBoxTiposRelacionesFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRenta107(
			JComboBox jComboBoxTiposAccionesFormularioRenta107) {
		this.jComboBoxTiposAccionesFormularioRenta107 = jComboBoxTiposAccionesFormularioRenta107;
	}
	
	public void setBorderResaltarTiposRelacionesFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormularioRenta107() {
	//	return jCheckBoxConGraficoDinamicoFormularioRenta107;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormularioRenta107(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormularioRenta107) {
	//	this.jCheckBoxConGraficoDinamicoFormularioRenta107 = jCheckBoxConGraficoDinamicoFormularioRenta107;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormularioRenta107() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormularioRenta107.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormularioRenta107 .setBorder(borderResaltar);		
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
		this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
		
		this.formulariorenta107SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorenta107SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulariorenta107SessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioRenta107JInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Renta107 MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
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
		
		FormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormularioRenta107= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"nuevo","nuevo","Nuevo"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"duplicar","duplicar","Duplicar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"copiar","copiar","Copiar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"ver_form","ver_form","Ver"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"recargar","recargar","Recargar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormularioRenta107,this.jTtoolBarFormularioRenta107,
							"cerrar","cerrar","Salir"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormularioRenta107=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormularioRenta107;
			
				this.jButtonProcesarInformacionToolBarFormularioRenta107=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormularioRenta107;
				
		//protected JButton jButtonModificarToolBarFormularioRenta107;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormularioRenta107=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormularioRenta107=new JMenuMe("General");
		this.jmenuArchivoFormularioRenta107=new JMenuMe("Archivo");
		this.jmenuAccionesFormularioRenta107=new JMenuMe("Acciones");
		this.jmenuDatosFormularioRenta107=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioRenta107= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioRenta107.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioRenta107,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormularioRenta107= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormularioRenta107.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormularioRenta107,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormularioRenta107= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormularioRenta107.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormularioRenta107,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormularioRenta107= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioRenta107.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioRenta107,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormularioRenta107= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormularioRenta107.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormularioRenta107,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormularioRenta107= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormularioRenta107.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormularioRenta107,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormularioRenta107= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormularioRenta107.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormularioRenta107,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioRenta107= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioRenta107.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioRenta107,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormularioRenta107= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormularioRenta107.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormularioRenta107,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormularioRenta107= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormularioRenta107.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormularioRenta107,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormularioRenta107= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormularioRenta107.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormularioRenta107,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormularioRenta107= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormularioRenta107.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormularioRenta107,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormularioRenta107= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormularioRenta107.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormularioRenta107,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormularioRenta107= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormularioRenta107.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormularioRenta107,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormularioRenta107= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormularioRenta107.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormularioRenta107,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormularioRenta107.add(this.jMenuItemCerrarFormularioRenta107);
			
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemNuevoFormularioRenta107);
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemNuevoGuardarCambiosFormularioRenta107);
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemNuevoRelacionesFormularioRenta107);
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemGuardarCambiosTablaFormularioRenta107);		
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemDuplicarFormularioRenta107);		
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemCopiarFormularioRenta107);		
			this.jmenuAccionesFormularioRenta107.add(this.jMenuItemVerFormFormularioRenta107);		
			
			this.jmenuDatosFormularioRenta107.add(this.jMenuItemRecargarInformacionFormularioRenta107);				
			this.jmenuDatosFormularioRenta107.add(this.jMenuItemAnterioresFormularioRenta107);				
			this.jmenuDatosFormularioRenta107.add(this.jMenuItemSiguientesFormularioRenta107);				
			this.jmenuDatosFormularioRenta107.add(this.jMenuItemAbrirOrderByFormularioRenta107);				
			this.jmenuDatosFormularioRenta107.add(this.jMenuItemMostrarOcultarFormularioRenta107);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormularioRenta107.add(this.jMenuItemGuardarCambiosFormularioRenta107);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormularioRenta107.add(this.jmenuArchivoFormularioRenta107);		
			this.jmenuBarFormularioRenta107.add(this.jmenuAccionesFormularioRenta107);		
			this.jmenuBarFormularioRenta107.add(this.jmenuDatosFormularioRenta107);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormularioRenta107);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormularioRenta107() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoFormularioRenta107.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoFormularioRenta107= new JButtonMe();
		this.jButtonFK_IdEmpleadoFormularioRenta107.setText("Buscar");
		this.jButtonFK_IdEmpleadoFormularioRenta107.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoFormularioRenta107,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoFormularioRenta107 = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoFormularioRenta107.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoFormularioRenta107.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormularioRenta107=new JTabbedPane();


		this.jTabbedPaneBusquedasFormularioRenta107.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioRenta107.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioRenta107.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormularioRenta107.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormularioRenta107 = new FormularioRenta107DetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formulario Renta107 DATOS");
			this.jInternalFrameDetalleFormFormularioRenta107 = new FormularioRenta107DetalleFormJInternalFrame(jDesktopPane,this.formulariorenta107SessionBean.getConGuardarRelaciones(),this.formulariorenta107SessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormularioRenta107 = null;//new FormularioRenta107DetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioRenta107= new GridBagLayout();
		
		
		this.jTableDatosFormularioRenta107 = new JTableMe();      
		
		String sToolTipFormularioRenta107="";
		sToolTipFormularioRenta107=FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioRenta107+="(Nomina.FormularioRenta107)";
		}
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioRenta107+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormularioRenta107.setToolTipText(sToolTipFormularioRenta107);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormularioRenta107);
		this.jTableDatosFormularioRenta107.setAutoCreateRowSorter(true);
		this.jTableDatosFormularioRenta107.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormularioRenta107.setRowSelectionAllowed(true);
		this.jTableDatosFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormularioRenta107 = new JButtonMe();
		this.jButtonDuplicarFormularioRenta107 = new JButtonMe();
		this.jButtonCopiarFormularioRenta107 = new JButtonMe();
		this.jButtonVerFormFormularioRenta107 = new JButtonMe();
		this.jButtonNuevoRelacionesFormularioRenta107 = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarFormularioRenta107 = new JButtonMe();
		
		this.jScrollPanelDatosFormularioRenta107 = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormularioRenta107 = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Renta107";
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta107es" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioRenta107.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioRenta107.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRenta107.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormularioRenta107=new ReporteDinamicoJInternalFrame(FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormularioRenta107();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormularioRenta107=new ImportacionJInternalFrame(FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormularioRenta107();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormularioRenta107 = new JButtonMe();
		
		this.jButtonAbrirOrderByFormularioRenta107.setText("Orden");
		this.jButtonAbrirOrderByFormularioRenta107.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioRenta107,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioRenta107=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta107,false,this);
			
			//this.cargarOrderByFormularioRenta107(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioRenta107=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta107,true,this);
			
			//this.cargarOrderByFormularioRenta107(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormularioRenta107.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosFormularioRenta107.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosFormularioRenta107.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosFormularioRenta107.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioRenta107.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioRenta107.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormularioRenta107.setText("Nuevo");
		this.jButtonDuplicarFormularioRenta107.setText("Duplicar");
		this.jButtonCopiarFormularioRenta107.setText("Copiar");
		this.jButtonVerFormFormularioRenta107.setText("Ver");
		this.jButtonNuevoRelacionesFormularioRenta107.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.setText("Guardar");
		this.jButtonCerrarFormularioRenta107.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioRenta107,"nuevo_button","Nuevo",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormularioRenta107,"duplicar_button","Duplicar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormularioRenta107,"copiar_button","Copiar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormularioRenta107,"ver_form","Ver",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormularioRenta107,"nuevorelaciones_button","Nuevo Rel",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioRenta107,"guardarcambiostabla_button","Guardar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioRenta107,"cerrar_button","Salir",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormularioRenta107.setToolTipText("Nuevo"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormularioRenta107.setToolTipText("Duplicar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormularioRenta107.setToolTipText("Copiar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormularioRenta107.setToolTipText("Ver"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormularioRenta107.setToolTipText("Nuevo Rel"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.setToolTipText("Guardar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioRenta107.setToolTipText("Salir"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioRenta107";
		inputMap = this.jButtonNuevoFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioRenta107"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormularioRenta107";
		inputMap = this.jButtonDuplicarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormularioRenta107"));
		
		//COPIAR
		sMapKey = "CopiarFormularioRenta107";
		inputMap = this.jButtonCopiarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormularioRenta107"));
		
		//VEr FORM
		sMapKey = "VerFormFormularioRenta107";
		inputMap = this.jButtonVerFormFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormularioRenta107"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormularioRenta107";
		inputMap = this.jButtonNuevoRelacionesFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormularioRenta107"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormularioRenta107";
		inputMap = this.jButtonModificarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormularioRenta107"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormularioRenta107";
		inputMap = this.jButtonCerrarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioRenta107"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioRenta107";
		inputMap = this.jButtonGuardarCambiosTablaFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioRenta107"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormularioRenta107.setName("jPanelParametrosReportesFormularioRenta107"); 
		
		this.jPanelParametrosReportesAccionesFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormularioRenta107.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormularioRenta107.setName("jPanelParametrosReportesAccionesFormularioRenta107"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormularioRenta107 = new JButtonMe();
		this.jButtonRecargarInformacionFormularioRenta107.setText("Recargar");
		this.jButtonRecargarInformacionFormularioRenta107.setToolTipText("Recargar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormularioRenta107,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormularioRenta107 = new JButtonMe();
		this.jButtonProcesarInformacionFormularioRenta107.setText("Procesar");
		this.jButtonProcesarInformacionFormularioRenta107.setToolTipText("Procesar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormularioRenta107.setVisible(false);
			
		this.jButtonProcesarInformacionFormularioRenta107.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioRenta107.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioRenta107.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRenta107.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormularioRenta107.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRenta107.setText("TIPO");       
		this.jComboBoxTiposReportesFormularioRenta107.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRenta107.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormularioRenta107.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormularioRenta107.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormularioRenta107.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormularioRenta107.setText("Accion");
		this.jComboBoxTiposRelacionesFormularioRenta107.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRenta107.setText("Accion");
		this.jComboBoxTiposAccionesFormularioRenta107.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormularioRenta107.setText("Accion");
		this.jComboBoxTiposSeleccionarFormularioRenta107.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormularioRenta107=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormularioRenta107.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioRenta107.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioRenta107.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormularioRenta107 = new JLabelMe();
		
		this.jLabelAccionesFormularioRenta107.setText("Acciones");		
		this.jLabelAccionesFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormularioRenta107.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormularioRenta107.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormularioRenta107 = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormularioRenta107.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormularioRenta107.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormularioRenta107 = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormularioRenta107.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormularioRenta107.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormularioRenta107.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormularioRenta107.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormularioRenta107 = new JButtonMe();
		//this.jButtonAnterioresFormularioRenta107.setText("<<");
        this.jButtonAnterioresFormularioRenta107.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormularioRenta107,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormularioRenta107 = new JButtonMe();
		//this.jButtonSiguientesFormularioRenta107.setText(">>");
        this.jButtonSiguientesFormularioRenta107.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormularioRenta107,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormularioRenta107 = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormularioRenta107.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormularioRenta107.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormularioRenta107,"nuevoguardarcambios_button","Nue",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormularioRenta107";
		inputMap = this.jButtonNuevoGuardarCambiosFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormularioRenta107"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormularioRenta107";
		inputMap = this.jButtonRecargarInformacionFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormularioRenta107"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormularioRenta107";
		inputMap = this.jButtonSiguientesFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormularioRenta107"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormularioRenta107";
		inputMap = this.jButtonAnterioresFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormularioRenta107"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormularioRenta107();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormularioRenta107.setMinimumSize(new Dimension(this.getWidth(),FormularioRenta107Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRenta107Bean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioRenta107.setMaximumSize(new Dimension(this.getWidth(),FormularioRenta107Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRenta107Bean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioRenta107.setPreferredSize(new Dimension(this.getWidth(),FormularioRenta107Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRenta107Bean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormularioRenta107 = new GridBagLayout();

			this.jPanelPaginacionFormularioRenta107.setLayout(gridaBagLayoutPaginacionFormularioRenta107);						
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 0;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonAnterioresFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
					
						
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioRenta107.gridy = 0;
			
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonNuevoGuardarCambiosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
						
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioRenta107.gridy = 0;
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonSiguientesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 1;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonNuevoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormularioRenta107.gridy = 1;
				this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFormularioRenta107.add(this.jButtonNuevoRelacionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			}
			
			
			if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormularioRenta107.gridy = 1;
				this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormularioRenta107.add(this.jButtonGuardarCambiosTablaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			}
			
			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 1;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonDuplicarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 1;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonCopiarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 1;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonVerFormFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 1;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormularioRenta107.add(this.jButtonCerrarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
		
		
		this.jButtonRecargarInformacionFormularioRenta107.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioRenta107.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioRenta107.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormularioRenta107.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioRenta107.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioRenta107.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormularioRenta107.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioRenta107.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioRenta107.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormularioRenta107.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioRenta107.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioRenta107.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormularioRenta107.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioRenta107.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioRenta107.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormularioRenta107.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioRenta107.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioRenta107.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormularioRenta107.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioRenta107.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioRenta107.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormularioRenta107.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioRenta107.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioRenta107.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormularioRenta107.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioRenta107.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioRenta107.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormularioRenta107 = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormularioRenta107 = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormularioRenta107.setLayout(gridaBagParametrosReportesFormularioRenta107);
			this.jPanelParametrosReportesAccionesFormularioRenta107.setLayout(gridaBagParametrosReportesAccionesFormularioRenta107);
			
			
			this.jPanelParametrosAuxiliar1FormularioRenta107.setLayout(gridaBagParametrosAuxiliar1FormularioRenta107);
			this.jPanelParametrosAuxiliar2FormularioRenta107.setLayout(gridaBagParametrosAuxiliar2FormularioRenta107);
			this.jPanelParametrosAuxiliar3FormularioRenta107.setLayout(gridaBagParametrosAuxiliar3FormularioRenta107);
			this.jPanelParametrosAuxiliar4FormularioRenta107.setLayout(gridaBagParametrosAuxiliar4FormularioRenta107);
			//this.jPanelParametrosAuxiliar5FormularioRenta107.setLayout(gridaBagParametrosAuxiliar2FormularioRenta107);			
			
			
			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta107.add(this.jButtonRecargarInformacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRenta107.add(this.jComboBoxTiposPaginacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRenta107.add(this.jCheckBoxConAltoMaximoTablaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRenta107.add(this.jComboBoxTiposArchivosReportesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta107.add(this.jPanelParametrosAuxiliar1FormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormularioRenta107.add(this.jComboBoxTiposReportesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta107.add(this.jPanelParametrosAuxiliar4FormularioRenta107, this.gridBagConstraintsFormularioRenta107);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta107.add(this.jComboBoxTiposReportesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta107.add(this.jCheckBoxGenerarReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta107.add(this.jPanelParametrosAuxiliar2FormularioRenta107, this.gridBagConstraintsFormularioRenta107);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta107.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta107.add(this.jLabelAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormularioRenta107.add(this.jButtonAbrirOrderByFormularioRenta107, this.gridBagConstraintsFormularioRenta107);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta107.add(this.jComboBoxTiposSeleccionarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
			
			
			/*
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta107.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRenta107.add(this.jCheckBoxSeleccionarTodosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRenta107.add(this.jCheckBoxSeleccionarTodosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);															
				
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRenta107.add(this.jCheckBoxSeleccionadosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRenta107.add(this.jPanelParametrosAuxiliar3FormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta107.add(this.jComboBoxTiposRelacionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
				
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta107.add(this.jComboBoxTiposAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
	
				
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRenta107.add(this.jTextFieldValorCampoGeneralFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormularioRenta107 = new GridBagLayout();

			this.jScrollPanelDatosFormularioRenta107.setLayout(gridaBagLayoutDatosFormularioRenta107);
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = 0;
			this.gridBagConstraintsFormularioRenta107.gridx = 0;
			
			this.jScrollPanelDatosFormularioRenta107.add(this.jTableDatosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormularioRenta107.setViewportView(this.jTableDatosFormularioRenta107);
		this.jTableDatosFormularioRenta107.setFillsViewportHeight(true);
		this.jTableDatosFormularioRenta107.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormularioRenta107= new GridBagLayout();
		this.jPanelAccionesFormularioRenta107.setLayout(gridaBagLayoutAccionesFormularioRenta107);
		
		
		/*	
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
			
		this.jPanelAccionesFormularioRenta107.add(this.jButtonNuevoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoFormularioRenta107= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoFormularioRenta107.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoFormularioRenta107.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoFormularioRenta107.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoFormularioRenta107.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoFormularioRenta107.setLayout(gridaBagLayoutFK_IdEmpleadoFormularioRenta107);

		gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta107.gridy = 0;
		gridBagConstraintsFormularioRenta107.gridx = 0;
		jPanelFK_IdEmpleadoFormularioRenta107.add(jLabelid_empleadoFK_IdEmpleadoFormularioRenta107, gridBagConstraintsFormularioRenta107);

		gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta107.gridy = 0;
		gridBagConstraintsFormularioRenta107.gridx = 1;
		jPanelFK_IdEmpleadoFormularioRenta107.add(jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107, gridBagConstraintsFormularioRenta107);

		gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRenta107.gridy = 1;
		gridBagConstraintsFormularioRenta107.gridx =1;
		jPanelFK_IdEmpleadoFormularioRenta107.add(jButtonFK_IdEmpleadoFormularioRenta107, gridBagConstraintsFormularioRenta107);

		jTabbedPaneBusquedasFormularioRenta107.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoFormularioRenta107);
		jTabbedPaneBusquedasFormularioRenta107.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioRenta107);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();						
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRenta107.gridx = 0;		
			//this.gridBagConstraintsFormularioRenta107.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioRenta107.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormularioRenta107.gridx = 0;		
		//this.gridBagConstraintsFormularioRenta107.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormularioRenta107.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormularioRenta107);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRenta107.gridx = 0;		
			this.gridBagConstraintsFormularioRenta107.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormularioRenta107.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormularioRenta107, this.gridBagConstraintsFormularioRenta107);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);								
		
		
		/*
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		*/		
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioRenta107.gridx =0;
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioRenta107.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
				
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioRenta107 = new GridBagLayout();
			this.jPanelBusquedasParametrosFormularioRenta107.setLayout(gridaBagLayoutBusquedasParametrosFormularioRenta107);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormularioRenta107=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
			
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
			
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormularioRenta107;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormularioRenta107() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormularioRenta107 = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormularioRenta107.setName("jPanelReporteDinamicoFormularioRenta107"); 
		
		this.jPanelReporteDinamicoFormularioRenta107.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioRenta107.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioRenta107.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormularioRenta107.setLayout(gridaBagLayoutReporteDinamicoFormularioRenta107);
		
		
		this.jInternalFrameReporteDinamicoFormularioRenta107= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormularioRenta107 = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioRenta107= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormularioRenta107.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormularioRenta107.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormularioRenta107.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormularioRenta107.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormularioRenta107.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormularioRenta107.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormularioRenta107.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioRenta107.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioRenta107.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta107es"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormularioRenta107 = new JLabelMe();

		this.jLabelColumnasSelectReporteFormularioRenta107.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jLabelColumnasSelectReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormularioRenta107 = new JList<Reporte>();
		this.jListColumnasSelectReporteFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormularioRenta107.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormularioRenta107.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioRenta107.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioRenta107.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormularioRenta107=new JScrollPane(this.jListColumnasSelectReporteFormularioRenta107);
			
			this.jScrollColumnasSelectReporteFormularioRenta107.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioRenta107.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioRenta107.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormularioRenta107.add(this.jListColumnasSelectReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jScrollColumnasSelectReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormularioRenta107 = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormularioRenta107.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jLabelRelacionesSelectReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormularioRenta107 = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormularioRenta107.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormularioRenta107.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioRenta107.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioRenta107.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormularioRenta107=new JScrollPane(this.jListRelacionesSelectReporteFormularioRenta107);
			
			this.jScrollRelacionesSelectReporteFormularioRenta107.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioRenta107.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioRenta107.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormularioRenta107.add(this.jListRelacionesSelectReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jScrollRelacionesSelectReporteFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFormularioRenta107 = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormularioRenta107 = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormularioRenta107 = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormularioRenta107 = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormularioRenta107.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormularioRenta107.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioRenta107.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioRenta107.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107 = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta107 = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormularioRenta107.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jLabelGenerarExcelReporteDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta107 = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta107.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormularioRenta107,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta107.setToolTipText("Generar EXCEL"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormularioRenta107.add(this.jButtonGenerarExcelReporteDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jComboBoxTiposReportesDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta107 = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormularioRenta107.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jLabelTiposArchivoReporteDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jComboBoxTiposArchivosReportesDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormularioRenta107 = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormularioRenta107.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormularioRenta107,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormularioRenta107.setToolTipText("Generar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jButtonGenerarReporteDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormularioRenta107.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormularioRenta107,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormularioRenta107.setToolTipText("Cancelar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRenta107.add(this.jButtonCerrarReporteDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormularioRenta107 = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormularioRenta107= new JScrollPane(jPanelReporteDinamicoFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormularioRenta107.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioRenta107.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioRenta107.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta107es"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRenta107.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormularioRenta107.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormularioRenta107.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormularioRenta107);
		this.jInternalFrameReporteDinamicoFormularioRenta107.getContentPane().add(this.jScrollPanelReporteDinamicoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormularioRenta107() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormularioRenta107 = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormularioRenta107.setName("jPanelImportacionFormularioRenta107"); 
		
		this.jPanelImportacionFormularioRenta107.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioRenta107.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioRenta107.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormularioRenta107.setLayout(gridaBagLayoutImportacionFormularioRenta107);
		
		
		this.jInternalFrameImportacionFormularioRenta107= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormularioRenta107= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormularioRenta107 = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioRenta107= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioRenta107.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioRenta107.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormularioRenta107.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioRenta107.setResizable(true);
	    this.jInternalFrameImportacionFormularioRenta107.setClosable(true);
	    this.jInternalFrameImportacionFormularioRenta107.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioRenta107.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioRenta107.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormularioRenta107.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioRenta107.setResizable(true);
	    this.jInternalFrameImportacionFormularioRenta107.setClosable(true);
	    this.jInternalFrameImportacionFormularioRenta107.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormularioRenta107.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioRenta107.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioRenta107.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta107es"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormularioRenta107 = new JLabelMe();

		this.jLabelArchivoImportacionFormularioRenta107.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioRenta107.add(this.jLabelArchivoImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormularioRenta107 = new JFileChooser();		
		this.jFileChooserImportacionFormularioRenta107.setToolTipText("ESCOGER ARCHIVO"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormularioRenta107 = new JButtonMe();
		this.jButtonAbrirImportacionFormularioRenta107.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormularioRenta107,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormularioRenta107.setToolTipText("Generar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta107.add(this.jButtonAbrirImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormularioRenta107 = new JLabelMe();

		this.jLabelPathArchivoImportacionFormularioRenta107.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioRenta107.add(this.jLabelPathArchivoImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormularioRenta107=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormularioRenta107.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioRenta107.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioRenta107.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta107.add(this.jTextFieldPathArchivoImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormularioRenta107 = new JButtonMe();
		this.jButtonGenerarImportacionFormularioRenta107.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormularioRenta107,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormularioRenta107.setToolTipText("Generar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta107.add(this.jButtonGenerarImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarImportacionFormularioRenta107.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormularioRenta107,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormularioRenta107.setToolTipText("Cancelar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRenta107.add(this.jButtonCerrarImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormularioRenta107 = new GridBagLayout();
		
		this.jScrollPanelImportacionFormularioRenta107= new JScrollPane(jPanelImportacionFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy =iPosYImportacion;
		this.gridBagConstraintsFormularioRenta107.gridx =iPosXImportacion;
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormularioRenta107.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormularioRenta107.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormularioRenta107);
		this.jInternalFrameImportacionFormularioRenta107.getContentPane().add(this.jScrollPanelImportacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormularioRenta107(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormularioRenta107 = new JButtonMe();
			this.jButtonAbrirOrderByFormularioRenta107.setText("Orden");
			this.jButtonAbrirOrderByFormularioRenta107.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioRenta107,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormularioRenta107";
			inputMap = this.jButtonAbrirOrderByFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormularioRenta107"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormularioRenta107 = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormularioRenta107.setName("jPanelOrderByFormularioRenta107"); 
			
			this.jPanelOrderByFormularioRenta107.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioRenta107.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioRenta107.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormularioRenta107.setLayout(gridaBagLayoutOrderByFormularioRenta107);
			
			
			this.jTableDatosFormularioRenta107OrderBy = new JTableMe();        
			this.jTableDatosFormularioRenta107OrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormularioRenta107OrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormularioRenta107OrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormularioRenta107OrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormularioRenta107OrderBy.setViewportView(this.jTableDatosFormularioRenta107OrderBy);
			this.jTableDatosFormularioRenta107OrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormularioRenta107OrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormularioRenta107= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormularioRenta107= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormularioRenta107 = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormularioRenta107= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormularioRenta107.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormularioRenta107.setTitle("Orden");
			this.jInternalFrameOrderByFormularioRenta107.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormularioRenta107.setResizable(true);
			this.jInternalFrameOrderByFormularioRenta107.setClosable(true);
			this.jInternalFrameOrderByFormularioRenta107.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormularioRenta107.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioRenta107.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioRenta107.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta107es"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormularioRenta107.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormularioRenta107.ipady =150;
				
			this.jPanelOrderByFormularioRenta107.add(jScrollPanelDatosFormularioRenta107OrderBy, this.gridBagConstraintsFormularioRenta107);//this.jTableDatosFormularioRenta107Totales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormularioRenta107 = new JButtonMe();
			this.jButtonCerrarOrderByFormularioRenta107.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormularioRenta107,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormularioRenta107.setToolTipText("Cancelar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormularioRenta107.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormularioRenta107.add(this.jButtonCerrarOrderByFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormularioRenta107 = new GridBagLayout();
			
			this.jScrollPanelOrderByFormularioRenta107= new JScrollPane(jPanelOrderByFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormularioRenta107.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormularioRenta107.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormularioRenta107.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormularioRenta107);
			
			this.jInternalFrameOrderByFormularioRenta107.getContentPane().add(this.jScrollPanelOrderByFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
		
		} else {
			this.jButtonAbrirOrderByFormularioRenta107 = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formulariorenta107SessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormularioRenta107.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormularioRenta107.getRowHeight();//FormularioRenta107ConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioRenta107.isSelected()) {
					iHeightTable=FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioRenta107.isSelected()) {
					iHeightTable=FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormularioRenta107.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioRenta107.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioRenta107.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormularioRenta107.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioRenta107.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioRenta107.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormularioRenta107!=null && this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy()!=null) {
			//if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormularioRenta107.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormularioRenta107.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormularioRenta107.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormularioRenta107.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioRenta107.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioRenta107.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formulariorenta107Logic.getFormularioRenta107s().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorenta107s.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormularioRenta107> TraerFormularioRenta107Beans(List<FormularioRenta107> formulariorenta107s,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormularioRenta107 formulariorenta107:formulariorenta107s) {
					
				if(!(FormularioRenta107ConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormularioRenta107ConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formulariorenta107.setsDetalleGeneralEntityReporte(FormularioRenta107ConstantesFunciones.getFormularioRenta107Descripcion(formulariorenta107));
										
						
					
					

					if(formulariorenta107.getDetalleFormularioRenta107s()!=null && Funciones.existeClass(classes,DetalleFormularioRenta107.class)) {
						try{formulariorenta107.setdetalleformulariorenta107sDescripcionReporte(new JRBeanCollectionDataSource(DetalleFormularioRenta107JInternalFrame.TraerDetalleFormularioRenta107Beans(formulariorenta107.getDetalleFormularioRenta107s(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//formulariorenta107.setsDetalleGeneralEntityReporte(formulariorenta107.getsDetalleGeneralEntityReporte());
										
				}
				
				//formulariorenta107beans.add(formulariorenta107bean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formulariorenta107s;
    }
	//PARA REPORTES FIN
}
