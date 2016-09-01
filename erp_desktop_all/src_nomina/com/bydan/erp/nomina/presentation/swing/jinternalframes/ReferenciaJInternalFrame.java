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
import com.bydan.erp.nomina.util.ReferenciaConstantesFunciones;

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
public class ReferenciaJInternalFrame extends ReferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReferencia;
	
	protected JMenuBar jmenuBarReferencia;
	
	protected JMenu jmenuReferencia;
	protected JMenu jmenuDatosReferencia;
	protected JMenu jmenuArchivoReferencia;
	protected JMenu jmenuAccionesReferencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferencia;	
	protected GridBagConstraints gridBagConstraintsReferencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReferenciaDetalleFormJInternalFrame jInternalFrameDetalleFormReferencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReferencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReferencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected ParentezcoBeanSwingJInternalFrame parentezcoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parentezco="";

	protected ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_profesion="";
	
	public ReferenciaSessionBean referenciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public ParentezcoSessionBean parentezcoSessionBean;
	public ProfesionSessionBean profesionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Referencia> referencias;		
	public List<Referencia> referenciasEliminados;	
	public List<Referencia> referenciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReferencia;		
	protected JButton jButtonAbrirOrderByReferencia;
	
	
	//protected JPanel jPanelOrderByReferencia;
	//public JScrollPane jScrollPanelOrderByReferencia;	
	//protected JButton jButtonCerrarOrderByReferencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReferenciaLogic referenciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReferencia;
	public JScrollPane jScrollPanelDatosEdicionReferencia;
	public JScrollPane jScrollPanelDatosGeneralReferencia;
    
	
	
	//public JScrollPane jScrollPanelDatosReferenciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReferencia;
	//public JScrollPane jScrollPanelImportacionReferencia;
	
	
	
	protected JPanel jPanelAccionesReferencia;
	
    protected JPanel jPanelPaginacionReferencia;
    protected JPanel jPanelParametrosReportesReferencia;
	protected JPanel jPanelParametrosReportesAccionesReferencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Referencia;
	protected JPanel jPanelParametrosAuxiliar2Referencia;
	protected JPanel jPanelParametrosAuxiliar3Referencia;
	protected JPanel jPanelParametrosAuxiliar4Referencia;
	//protected JPanel jPanelParametrosAuxiliar5Referencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoReferencia;
	//protected JPanel jPanelImportacionReferencia;
	
	
	public JTable jTableDatosReferencia;
	
	
	
	//public JTable jTableDatosReferenciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReferencia;
	protected JButton jButtonDuplicarReferencia;
	protected JButton jButtonCopiarReferencia;
	protected JButton jButtonVerFormReferencia;
	protected JButton jButtonNuevoRelacionesReferencia;
	protected JButton jButtonModificarReferencia;
	
    protected JButton jButtonGuardarCambiosTablaReferencia;
	protected JButton jButtonCerrarReferencia;
	
	
	protected JButton jButtonRecargarInformacionReferencia;
	protected JButton jButtonProcesarInformacionReferencia;
	
	
	protected JButton jButtonAnterioresReferencia;
	protected JButton jButtonSiguientesReferencia;
	protected JButton jButtonNuevoGuardarCambiosReferencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReferencia;
	//protected JButton jButtonCerrarReporteDinamicoReferencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoReferencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionReferencia;
	//protected JButton jButtonGenerarImportacionReferencia;
	//protected JButton jButtonCerrarImportacionReferencia;
	//protected JFileChooser jFileChooserImportacionReferencia;
	//protected File fileImportacionReferencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferencia;
	protected JButton jButtonDuplicarToolBarReferencia;
	protected JButton jButtonNuevoRelacionesToolBarReferencia;
	
	
	public JButton jButtonGuardarCambiosToolBarReferencia;
	protected JButton jButtonCopiarToolBarReferencia;
	protected JButton jButtonVerFormToolBarReferencia;
	public JButton jButtonGuardarCambiosTablaToolBarReferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarReferencia;
	protected JButton jButtonCerrarToolBarReferencia;
	
	protected JButton jButtonRecargarInformacionToolBarReferencia;
	protected JButton jButtonProcesarInformacionToolBarReferencia;
	protected JButton jButtonAnterioresToolBarReferencia;
	protected JButton jButtonSiguientesToolBarReferencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarReferencia;
	protected JButton jButtonAbrirOrderByToolBarReferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferencia;
	protected JMenuItem jMenuItemDuplicarReferencia;
	protected JMenuItem jMenuItemNuevoRelacionesReferencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReferencia;
	protected JMenuItem jMenuItemCopiarReferencia;
	protected JMenuItem jMenuItemVerFormReferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferencia;
	protected JMenuItem jMenuItemCerrarReferencia;
	protected JMenuItem jMenuItemDetalleCerrarReferencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferencia;
	
	protected JMenuItem jMenuItemRecargarInformacionReferencia;
	protected JMenuItem jMenuItemProcesarInformacionReferencia;
	protected JMenuItem jMenuItemAnterioresReferencia;
	protected JMenuItem jMenuItemSiguientesReferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferencia;
	protected JMenuItem jMenuItemAbrirOrderByReferencia;
	protected JMenuItem jMenuItemMostrarOcultarReferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReferencia;
	protected JCheckBox jCheckBoxSeleccionadosReferencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReferencia;
	protected JCheckBox jCheckBoxConGraficoReporteReferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReferencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReferencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReferencia;
	protected JTextField jTextFieldValorCampoGeneralReferencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReferencia;
	//public JList<Reporte> jListColumnasSelectReporteReferencia;
	//public JScrollPane jScrollColumnasSelectReporteReferencia;
	
	//public JLabel jLabelRelacionesSelectReporteReferencia;
	//public JList<Reporte> jListRelacionesSelectReporteReferencia;
	//public JScrollPane jScrollRelacionesSelectReporteReferencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReferencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReferencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReferencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoReferencia;
	
		
	//public JLabel jLabelArchivoImportacionReferencia;	
	//public JLabel jLabelPathArchivoImportacionReferencia;
	//protected JTextField jTextFieldPathArchivoImportacionReferencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReferencia;
	
	//public JLabel jLabelColumnaCategoriaValorReferencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReferencia;
	
	//public JLabel jLabelColumnasValoresGraficoReferencia;
	//public JList<Reporte> jListColumnasValoresGraficoReferencia;
	//public JScrollPane jScrollColumnasValoresGraficoReferencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReferencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReferencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasReferencia;
	public JPanel jPanelFK_IdEmpleadoReferencia;
	public JButton jButtonFK_IdEmpleadoReferencia;
	public JPanel jPanelFK_IdParentezcoReferencia;
	public JButton jButtonFK_IdParentezcoReferencia;
	public JPanel jPanelFK_IdProfesionReferencia;
	public JButton jButtonFK_IdProfesionReferencia;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoReferencia;
	public JLabel jLabelid_empleadoFK_IdEmpleadoReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoReferencia;
	public JButton jButtonid_empleadoFK_IdEmpleadoReferencia= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoReferenciaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoReferencia;
	
	public JPanel jPanelid_parentezcoFK_IdParentezcoReferencia;
	public JLabel jLabelid_parentezcoFK_IdParentezcoReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parentezcoFK_IdParentezcoReferencia;
	public JButton jButtonid_parentezcoFK_IdParentezcoReferencia= new JButtonMe();
	public JButton jButtonid_parentezcoFK_IdParentezcoReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_parentezcoFK_IdParentezcoReferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_profesionFK_IdProfesionReferencia;
	public JLabel jLabelid_profesionFK_IdProfesionReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_profesionFK_IdProfesionReferencia;
	public JButton jButtonid_profesionFK_IdProfesionReferencia= new JButtonMe();
	public JButton jButtonid_profesionFK_IdProfesionReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_profesionFK_IdProfesionReferenciaBusqueda= new JButtonMe();

	
	
	
	
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
	public ReferenciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReferencia)	{
		this.jButtonRecargarInformacionReferencia = jButtonRecargarInformacionReferencia;
	}
	
	public JButton getjButtonProcesarInformacionReferencia() {
		return this.jButtonProcesarInformacionReferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferencia)	{
		this.jButtonProcesarInformacionReferencia = jButtonProcesarInformacionReferencia;
	}
	
	
	public JButton getjButtonRecargarInformacionReferencia() {
		return this.jButtonRecargarInformacionReferencia;
	}
	
	
	public List<Referencia> getreferencias() {
		return this.referencias;
	}

	public void setreferencias(List<Referencia> referencias) {
		this.referencias = referencias;
	}
	
	public List<Referencia> getreferenciasAux() {
		return this.referenciasAux;
	}

	public void setreferenciasAux(List<Referencia> referenciasAux) {
		this.referenciasAux = referenciasAux;
	}
	
	public List<Referencia> getreferenciasEliminados() {
		return this.referenciasEliminados;
	}

	public void setReferenciasEliminados(List<Referencia> referenciasEliminados) {
		this.referenciasEliminados = referenciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReferencia() {
		return jComboBoxTiposSeleccionarReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReferencia(
			JComboBox jComboBoxTiposSeleccionarReferencia) {
		this.jComboBoxTiposSeleccionarReferencia = jComboBoxTiposSeleccionarReferencia;
	}
	
	public void setBorderResaltarTiposSeleccionarReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReferencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReferencia() {
		return jTextFieldValorCampoGeneralReferencia;
	}

	public void setjTextFieldValorCampoGeneralReferencia(
			JTextField jTextFieldValorCampoGeneralReferencia) {
		this.jTextFieldValorCampoGeneralReferencia = jTextFieldValorCampoGeneralReferencia;
	}

	public void setBorderResaltarValorCampoGeneralReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReferencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReferencia() {
		return this.jCheckBoxSeleccionarTodosReferencia;
	}

	public void setjCheckBoxSeleccionarTodosReferencia(
			JCheckBox jCheckBoxSeleccionarTodosReferencia) {
		this.jCheckBoxSeleccionarTodosReferencia = jCheckBoxSeleccionarTodosReferencia;
	}

	public void setBorderResaltarSeleccionarTodosReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReferencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReferencia() {
		return this.jCheckBoxSeleccionadosReferencia;
	}

	public void setjCheckBoxSeleccionadosReferencia(
			JCheckBox jCheckBoxSeleccionadosReferencia) {
		this.jCheckBoxSeleccionadosReferencia = jCheckBoxSeleccionadosReferencia;
	}
	
	public void setBorderResaltarSeleccionadosReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReferencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReferencia() {
		return this.jComboBoxTiposArchivosReportesReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReferencia(
			JComboBox jComboBoxTiposArchivosReportesReferencia) {
		this.jComboBoxTiposArchivosReportesReferencia = jComboBoxTiposArchivosReportesReferencia;
	}

	public void setBorderResaltarTiposArchivosReportesReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReferencia() {
		return this.jComboBoxTiposReportesReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReferencia(
			JComboBox jComboBoxTiposReportesReferencia) {
		this.jComboBoxTiposReportesReferencia = jComboBoxTiposReportesReferencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReferencia() {
	//	return jComboBoxTiposReportesDinamicoReferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReferencia(
	//		JComboBox jComboBoxTiposReportesDinamicoReferencia) {
	//	this.jComboBoxTiposReportesDinamicoReferencia = jComboBoxTiposReportesDinamicoReferencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReferencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoReferencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReferencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReferencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReferencia = jComboBoxTiposArchivosReportesDinamicoReferencia;
	//}
	
	public void setBorderResaltarTiposReportesReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReferencia() {
		return this.jComboBoxTiposGraficosReportesReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReferencia(
			JComboBox jComboBoxTiposGraficosReportesReferencia) {
		this.jComboBoxTiposGraficosReportesReferencia = jComboBoxTiposGraficosReportesReferencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReferencia() {
		return this.jComboBoxTiposPaginacionReferencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReferencia(
			JComboBox jComboBoxTiposPaginacionReferencia) {
		this.jComboBoxTiposPaginacionReferencia = jComboBoxTiposPaginacionReferencia;
	}
	
	public void setBorderResaltarTiposPaginacionReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReferencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReferencia() {
		return this.jComboBoxTiposRelacionesReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferencia() {
		return this.jComboBoxTiposAccionesReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferencia(
			JComboBox jComboBoxTiposRelacionesReferencia) {
		this.jComboBoxTiposRelacionesReferencia = jComboBoxTiposRelacionesReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferencia(
			JComboBox jComboBoxTiposAccionesReferencia) {
		this.jComboBoxTiposAccionesReferencia = jComboBoxTiposAccionesReferencia;
	}
	
	public void setBorderResaltarTiposRelacionesReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReferencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReferencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReferencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReferencia() {
	//	return jCheckBoxConGraficoDinamicoReferencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoReferencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoReferencia) {
	//	this.jCheckBoxConGraficoDinamicoReferencia = jCheckBoxConGraficoDinamicoReferencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReferencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReferencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReferencia .setBorder(borderResaltar);		
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
		this.referenciaSessionBean=new ReferenciaSessionBean();
		
		this.referenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
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
		
		ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReferencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReferencia,this.jTtoolBarReferencia,
							"nuevo","nuevo","Nuevo"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReferencia,this.jTtoolBarReferencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReferencia,this.jTtoolBarReferencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReferencia,this.jTtoolBarReferencia,
							"duplicar","duplicar","Duplicar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReferencia,this.jTtoolBarReferencia,
							"copiar","copiar","Copiar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReferencia,this.jTtoolBarReferencia,
							"ver_form","ver_form","Ver"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferencia,this.jTtoolBarReferencia,
							"recargar","recargar","Recargar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferencia,this.jTtoolBarReferencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferencia,this.jTtoolBarReferencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReferencia,this.jTtoolBarReferencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReferencia,this.jTtoolBarReferencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReferencia,this.jTtoolBarReferencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReferencia,this.jTtoolBarReferencia,
							"cerrar","cerrar","Salir"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReferencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReferencia;
			
				this.jButtonProcesarInformacionToolBarReferencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReferencia;
				
		//protected JButton jButtonModificarToolBarReferencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReferencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReferencia=new JMenuMe("General");
		this.jmenuArchivoReferencia=new JMenuMe("Archivo");
		this.jmenuAccionesReferencia=new JMenuMe("Acciones");
		this.jmenuDatosReferencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReferencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReferencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReferencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReferencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReferencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReferencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReferencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReferencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReferencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReferencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReferencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReferencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReferencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReferencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReferencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReferencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReferencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReferencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReferencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReferencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReferencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReferencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReferencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReferencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReferencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReferencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReferencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReferencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReferencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReferencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReferencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReferencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReferencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReferencia.add(this.jMenuItemCerrarReferencia);
			
			this.jmenuAccionesReferencia.add(this.jMenuItemNuevoReferencia);
			this.jmenuAccionesReferencia.add(this.jMenuItemNuevoGuardarCambiosReferencia);
			this.jmenuAccionesReferencia.add(this.jMenuItemNuevoRelacionesReferencia);
			this.jmenuAccionesReferencia.add(this.jMenuItemGuardarCambiosTablaReferencia);		
			this.jmenuAccionesReferencia.add(this.jMenuItemDuplicarReferencia);		
			this.jmenuAccionesReferencia.add(this.jMenuItemCopiarReferencia);		
			this.jmenuAccionesReferencia.add(this.jMenuItemVerFormReferencia);		
			
			this.jmenuDatosReferencia.add(this.jMenuItemRecargarInformacionReferencia);				
			this.jmenuDatosReferencia.add(this.jMenuItemAnterioresReferencia);				
			this.jmenuDatosReferencia.add(this.jMenuItemSiguientesReferencia);				
			this.jmenuDatosReferencia.add(this.jMenuItemAbrirOrderByReferencia);				
			this.jmenuDatosReferencia.add(this.jMenuItemMostrarOcultarReferencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReferencia.add(this.jMenuItemGuardarCambiosReferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReferencia.add(this.jmenuArchivoReferencia);		
			this.jmenuBarReferencia.add(this.jmenuAccionesReferencia);		
			this.jmenuBarReferencia.add(this.jmenuDatosReferencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReferencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReferencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoReferencia.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoReferencia= new JButtonMe();
		this.jButtonFK_IdEmpleadoReferencia.setText("Buscar");
		this.jButtonFK_IdEmpleadoReferencia.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoReferencia,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoReferencia = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoReferencia.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoReferencia.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoReferencia= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia.setFocusable(false);

		this.jPanelFK_IdParentezcoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParentezcoReferencia.setToolTipText("Buscar Por Parentezco ");
		this.jButtonFK_IdParentezcoReferencia= new JButtonMe();
		this.jButtonFK_IdParentezcoReferencia.setText("Buscar");
		this.jButtonFK_IdParentezcoReferencia.setToolTipText("Buscar Por Parentezco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParentezcoReferencia,"buscar_button","Buscar Por Parentezco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParentezcoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parentezcoFK_IdParentezcoReferencia = new JLabelMe();
		jLabelid_parentezcoFK_IdParentezcoReferencia.setText("Parentezco :");
		jLabelid_parentezcoFK_IdParentezcoReferencia.setToolTipText("Parentezco");
		jLabelid_parentezcoFK_IdParentezcoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parentezcoFK_IdParentezcoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_parentezcoFK_IdParentezcoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_parentezcoFK_IdParentezcoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parentezcoFK_IdParentezcoReferencia= new JComboBoxMe();
		jComboBoxid_parentezcoFK_IdParentezcoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parentezcoFK_IdParentezcoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parentezcoFK_IdParentezcoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parentezcoFK_IdParentezcoReferencia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProfesionReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProfesionReferencia.setToolTipText("Buscar Por Profesion ");
		this.jButtonFK_IdProfesionReferencia= new JButtonMe();
		this.jButtonFK_IdProfesionReferencia.setText("Buscar");
		this.jButtonFK_IdProfesionReferencia.setToolTipText("Buscar Por Profesion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProfesionReferencia,"buscar_button","Buscar Por Profesion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProfesionReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_profesionFK_IdProfesionReferencia = new JLabelMe();
		jLabelid_profesionFK_IdProfesionReferencia.setText("Profesion :");
		jLabelid_profesionFK_IdProfesionReferencia.setToolTipText("Profesion");
		jLabelid_profesionFK_IdProfesionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_profesionFK_IdProfesionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_profesionFK_IdProfesionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_profesionFK_IdProfesionReferencia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_profesionFK_IdProfesionReferencia= new JComboBoxMe();
		jComboBoxid_profesionFK_IdProfesionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionFK_IdProfesionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionFK_IdProfesionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_profesionFK_IdProfesionReferencia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasReferencia=new JTabbedPane();


		this.jTabbedPaneBusquedasReferencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasReferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasReferencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleReferencia = new ReferenciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Referencia DATOS");
			this.jInternalFrameDetalleFormReferencia = new ReferenciaDetalleFormJInternalFrame(jDesktopPane,this.referenciaSessionBean.getConGuardarRelaciones(),this.referenciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReferencia = null;//new ReferenciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferencia= new GridBagLayout();
		
		
		this.jTableDatosReferencia = new JTableMe();      
		
		String sToolTipReferencia="";
		sToolTipReferencia=ReferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferencia+="(Nomina.Referencia)";
		}
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReferencia.setToolTipText(sToolTipReferencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReferencia);
		this.jTableDatosReferencia.setAutoCreateRowSorter(true);
		this.jTableDatosReferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReferencia.setRowSelectionAllowed(true);
		this.jTableDatosReferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReferencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReferencia = new JButtonMe();
		this.jButtonDuplicarReferencia = new JButtonMe();
		this.jButtonCopiarReferencia = new JButtonMe();
		this.jButtonVerFormReferencia = new JButtonMe();
		this.jButtonNuevoRelacionesReferencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReferencia = new JButtonMe();
		this.jButtonCerrarReferencia = new JButtonMe();
		
		this.jScrollPanelDatosReferencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralReferencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia";
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencias" + this.sPath));
		} else {
			this.jScrollPanelDatosReferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferencia.setToolTipText("Acciones");
        this.jPanelAccionesReferencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReferencia=new ReporteDinamicoJInternalFrame(ReferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReferencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReferencia=new ImportacionJInternalFrame(ReferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReferencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReferencia = new JButtonMe();
		
		this.jButtonAbrirOrderByReferencia.setText("Orden");
		this.jButtonAbrirOrderByReferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferencia,false,this);
			
			//this.cargarOrderByReferencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferencia,true,this);
			
			//this.cargarOrderByReferencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReferencia.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosReferencia.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosReferencia.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosReferencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReferencia.setText("Nuevo");
		this.jButtonDuplicarReferencia.setText("Duplicar");
		this.jButtonCopiarReferencia.setText("Copiar");
		this.jButtonVerFormReferencia.setText("Ver");
		this.jButtonNuevoRelacionesReferencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReferencia.setText("Guardar");
		this.jButtonCerrarReferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferencia,"nuevo_button","Nuevo",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReferencia,"duplicar_button","Duplicar",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReferencia,"copiar_button","Copiar",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReferencia,"ver_form","Ver",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReferencia,"nuevorelaciones_button","Nuevo Rel",this.referenciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferencia,"guardarcambiostabla_button","Guardar",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferencia,"cerrar_button","Salir",this.referenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReferencia.setToolTipText("Nuevo"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReferencia.setToolTipText("Duplicar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReferencia.setToolTipText("Copiar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReferencia.setToolTipText("Ver"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReferencia.setToolTipText("Nuevo Rel"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReferencia.setToolTipText("Guardar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferencia.setToolTipText("Salir"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferencia";
		inputMap = this.jButtonNuevoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarReferencia";
		inputMap = this.jButtonDuplicarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReferencia"));
		
		//COPIAR
		sMapKey = "CopiarReferencia";
		inputMap = this.jButtonCopiarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReferencia"));
		
		//VEr FORM
		sMapKey = "VerFormReferencia";
		inputMap = this.jButtonVerFormReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReferencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReferencia";
		inputMap = this.jButtonNuevoRelacionesReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReferencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReferencia";
		inputMap = this.jButtonModificarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReferencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReferencia";
		inputMap = this.jButtonCerrarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferencia";
		inputMap = this.jButtonGuardarCambiosTablaReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Referencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Referencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Referencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Referencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Referencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReferencia.setName("jPanelParametrosReportesReferencia"); 
		
		this.jPanelParametrosReportesAccionesReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReferencia.setName("jPanelParametrosReportesAccionesReferencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReferencia = new JButtonMe();
		this.jButtonRecargarInformacionReferencia.setText("Recargar");
		this.jButtonRecargarInformacionReferencia.setToolTipText("Recargar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReferencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionReferencia = new JButtonMe();
		this.jButtonProcesarInformacionReferencia.setText("Procesar");
		this.jButtonProcesarInformacionReferencia.setToolTipText("Procesar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReferencia.setVisible(false);
			
		this.jButtonProcesarInformacionReferencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReferencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferencia.setText("TIPO");       
		this.jComboBoxTiposReportesReferencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReferencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReferencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReferencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionReferencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReferencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReferencia.setText("Accion");
		this.jComboBoxTiposRelacionesReferencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferencia.setText("Accion");
		this.jComboBoxTiposAccionesReferencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReferencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReferencia.setText("Accion");
		this.jComboBoxTiposSeleccionarReferencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReferencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReferencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReferencia = new JLabelMe();
		
		this.jLabelAccionesReferencia.setText("Acciones");		
		this.jLabelAccionesReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReferencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReferencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReferencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReferencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReferencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReferencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReferencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReferencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReferencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReferencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReferencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteReferencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReferencia = new JButtonMe();
		//this.jButtonAnterioresReferencia.setText("<<");
        this.jButtonAnterioresReferencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReferencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReferencia = new JButtonMe();
		//this.jButtonSiguientesReferencia.setText(">>");
        this.jButtonSiguientesReferencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReferencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReferencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReferencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosReferencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReferencia,"nuevoguardarcambios_button","Nue",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReferencia";
		inputMap = this.jButtonNuevoGuardarCambiosReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReferencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReferencia";
		inputMap = this.jButtonRecargarInformacionReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReferencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReferencia";
		inputMap = this.jButtonSiguientesReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReferencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReferencia";
		inputMap = this.jButtonAnterioresReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReferencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReferencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReferencia.setMinimumSize(new Dimension(this.getWidth(),ReferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferencia.setMaximumSize(new Dimension(this.getWidth(),ReferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferencia.setPreferredSize(new Dimension(this.getWidth(),ReferenciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReferencia = new GridBagLayout();

			this.jPanelPaginacionReferencia.setLayout(gridaBagLayoutPaginacionReferencia);						
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 0;
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReferencia.add(this.jButtonAnterioresReferencia, this.gridBagConstraintsReferencia);
					
						
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferencia.gridy = 0;
			
			this.jPanelPaginacionReferencia.add(this.jButtonNuevoGuardarCambiosReferencia, this.gridBagConstraintsReferencia);
						
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferencia.gridy = 0;
			this.jPanelPaginacionReferencia.add(this.jButtonSiguientesReferencia, this.gridBagConstraintsReferencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 1;
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferencia.add(this.jButtonNuevoReferencia, this.gridBagConstraintsReferencia);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsReferencia = new GridBagConstraints();
				this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReferencia.gridy = 1;
				this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionReferencia.add(this.jButtonNuevoRelacionesReferencia, this.gridBagConstraintsReferencia);
			}
			
			
			if(!this.referenciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReferencia = new GridBagConstraints();
				this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReferencia.gridy = 1;
				this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReferencia.add(this.jButtonGuardarCambiosTablaReferencia, this.gridBagConstraintsReferencia);
			}
			
			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 1;
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferencia.add(this.jButtonDuplicarReferencia, this.gridBagConstraintsReferencia);
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 1;
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferencia.add(this.jButtonCopiarReferencia, this.gridBagConstraintsReferencia);
		
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 1;
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferencia.add(this.jButtonVerFormReferencia, this.gridBagConstraintsReferencia);
		
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 1;
			this.gridBagConstraintsReferencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReferencia.add(this.jButtonCerrarReferencia, this.gridBagConstraintsReferencia);
		
		
		
		this.jButtonRecargarInformacionReferencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReferencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReferencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReferencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReferencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReferencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReferencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReferencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReferencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReferencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Referencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Referencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Referencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Referencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReferencia.setLayout(gridaBagParametrosReportesReferencia);
			this.jPanelParametrosReportesAccionesReferencia.setLayout(gridaBagParametrosReportesAccionesReferencia);
			
			
			this.jPanelParametrosAuxiliar1Referencia.setLayout(gridaBagParametrosAuxiliar1Referencia);
			this.jPanelParametrosAuxiliar2Referencia.setLayout(gridaBagParametrosAuxiliar2Referencia);
			this.jPanelParametrosAuxiliar3Referencia.setLayout(gridaBagParametrosAuxiliar3Referencia);
			this.jPanelParametrosAuxiliar4Referencia.setLayout(gridaBagParametrosAuxiliar4Referencia);
			//this.jPanelParametrosAuxiliar5Referencia.setLayout(gridaBagParametrosAuxiliar2Referencia);			
			
			
			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferencia.add(this.jButtonRecargarInformacionReferencia, this.gridBagConstraintsReferencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Referencia.add(this.jComboBoxTiposPaginacionReferencia, this.gridBagConstraintsReferencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Referencia.add(this.jCheckBoxConAltoMaximoTablaReferencia, this.gridBagConstraintsReferencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Referencia.add(this.jComboBoxTiposArchivosReportesReferencia, this.gridBagConstraintsReferencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferencia.add(this.jPanelParametrosAuxiliar1Referencia, this.gridBagConstraintsReferencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Referencia.add(this.jComboBoxTiposReportesReferencia, this.gridBagConstraintsReferencia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferencia.add(this.jPanelParametrosAuxiliar4Referencia, this.gridBagConstraintsReferencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferencia.add(this.jComboBoxTiposReportesReferencia, this.gridBagConstraintsReferencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferencia.add(this.jCheckBoxGenerarReporteReferencia, this.gridBagConstraintsReferencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferencia.add(this.jPanelParametrosAuxiliar2Referencia, this.gridBagConstraintsReferencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferencia.add(this.jLabelAccionesReferencia, this.gridBagConstraintsReferencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReferencia = new GridBagConstraints();
				this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReferencia.add(this.jButtonAbrirOrderByReferencia, this.gridBagConstraintsReferencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferencia.add(this.jComboBoxTiposSeleccionarReferencia, this.gridBagConstraintsReferencia);			
			
			
			/*
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferencia.add(this.jCheckBoxSeleccionarTodosReferencia, this.gridBagConstraintsReferencia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Referencia.add(this.jCheckBoxSeleccionarTodosReferencia, this.gridBagConstraintsReferencia);															
				
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Referencia.add(this.jCheckBoxSeleccionadosReferencia, this.gridBagConstraintsReferencia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferencia.add(this.jPanelParametrosAuxiliar3Referencia, this.gridBagConstraintsReferencia);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferencia.add(this.jComboBoxTiposRelacionesReferencia, this.gridBagConstraintsReferencia);
				
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferencia.add(this.jComboBoxTiposAccionesReferencia, this.gridBagConstraintsReferencia);
	
				
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferencia.add(this.jTextFieldValorCampoGeneralReferencia, this.gridBagConstraintsReferencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReferencia = new GridBagLayout();

			this.jScrollPanelDatosReferencia.setLayout(gridaBagLayoutDatosReferencia);
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = 0;
			this.gridBagConstraintsReferencia.gridx = 0;
			
			this.jScrollPanelDatosReferencia.add(this.jTableDatosReferencia, this.gridBagConstraintsReferencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReferencia.setViewportView(this.jTableDatosReferencia);
		this.jTableDatosReferencia.setFillsViewportHeight(true);
		this.jTableDatosReferencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReferencia= new GridBagLayout();
		this.jPanelAccionesReferencia.setLayout(gridaBagLayoutAccionesReferencia);
		
		
		/*	
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 0;
			
		this.jPanelAccionesReferencia.add(this.jButtonNuevoReferencia, this.gridBagConstraintsReferencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoReferencia= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoReferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoReferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoReferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoReferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoReferencia.setLayout(gridaBagLayoutFK_IdEmpleadoReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 0;
		jPanelFK_IdEmpleadoReferencia.add(jLabelid_empleadoFK_IdEmpleadoReferencia, gridBagConstraintsReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 1;
		jPanelFK_IdEmpleadoReferencia.add(jComboBoxid_empleadoFK_IdEmpleadoReferencia, gridBagConstraintsReferencia);


		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.EAST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 0;
		jPanelFK_IdEmpleadoReferencia.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoReferencia, gridBagConstraintsReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 1;
		gridBagConstraintsReferencia.gridx =1;
		jPanelFK_IdEmpleadoReferencia.add(jButtonFK_IdEmpleadoReferencia, gridBagConstraintsReferencia);

		jTabbedPaneBusquedasReferencia.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoReferencia);
		jTabbedPaneBusquedasReferencia.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdParentezcoReferencia= new GridBagLayout();
		gridaBagLayoutFK_IdParentezcoReferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParentezcoReferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParentezcoReferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParentezcoReferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParentezcoReferencia.setLayout(gridaBagLayoutFK_IdParentezcoReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 0;
		jPanelFK_IdParentezcoReferencia.add(jLabelid_parentezcoFK_IdParentezcoReferencia, gridBagConstraintsReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 1;
		jPanelFK_IdParentezcoReferencia.add(jComboBoxid_parentezcoFK_IdParentezcoReferencia, gridBagConstraintsReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 1;
		gridBagConstraintsReferencia.gridx =1;
		jPanelFK_IdParentezcoReferencia.add(jButtonFK_IdParentezcoReferencia, gridBagConstraintsReferencia);

		jTabbedPaneBusquedasReferencia.addTab("2.-Por Parentezco ", jPanelFK_IdParentezcoReferencia);
		jTabbedPaneBusquedasReferencia.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProfesionReferencia= new GridBagLayout();
		gridaBagLayoutFK_IdProfesionReferencia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProfesionReferencia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProfesionReferencia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProfesionReferencia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProfesionReferencia.setLayout(gridaBagLayoutFK_IdProfesionReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 0;
		jPanelFK_IdProfesionReferencia.add(jLabelid_profesionFK_IdProfesionReferencia, gridBagConstraintsReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 0;
		gridBagConstraintsReferencia.gridx = 1;
		jPanelFK_IdProfesionReferencia.add(jComboBoxid_profesionFK_IdProfesionReferencia, gridBagConstraintsReferencia);

		gridBagConstraintsReferencia = new GridBagConstraints();
		gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferencia.gridy = 1;
		gridBagConstraintsReferencia.gridx =1;
		jPanelFK_IdProfesionReferencia.add(jButtonFK_IdProfesionReferencia, gridBagConstraintsReferencia);

		jTabbedPaneBusquedasReferencia.addTab("3.-Por Profesion ", jPanelFK_IdProfesionReferencia);
		jTabbedPaneBusquedasReferencia.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferencia = new GridBagConstraints();						
			this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferencia.gridx = 0;		
			//this.gridBagConstraintsReferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReferencia, this.gridBagConstraintsReferencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReferencia.gridx = 0;		
		//this.gridBagConstraintsReferencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReferencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReferencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferencia.gridx = 0;		
			this.gridBagConstraintsReferencia.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsReferencia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasReferencia, this.gridBagConstraintsReferencia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReferencia, this.gridBagConstraintsReferencia);								
		
		
		/*
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReferencia, this.gridBagConstraintsReferencia);
		*/		
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferencia.gridx =0;
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferencia, this.gridBagConstraintsReferencia);
				
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReferencia, this.gridBagConstraintsReferencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReferencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferencia = new GridBagLayout();
			this.jPanelBusquedasParametrosReferencia.setLayout(gridaBagLayoutBusquedasParametrosReferencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferencia, this.gridBagConstraintsReferencia);
			
			
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferencia, this.gridBagConstraintsReferencia);
		
			
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferencia, this.gridBagConstraintsReferencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReferencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReferencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReferencia.setName("jPanelReporteDinamicoReferencia"); 
		
		this.jPanelReporteDinamicoReferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReferencia.setLayout(gridaBagLayoutReporteDinamicoReferencia);
		
		
		this.jInternalFrameReporteDinamicoReferencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReferencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReferencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoReferencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoReferencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReferencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReferencia = new JLabelMe();

		this.jLabelColumnasSelectReporteReferencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferencia.add(this.jLabelColumnasSelectReporteReferencia, this.gridBagConstraintsReferencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReferencia = new JList<Reporte>();
		this.jListColumnasSelectReporteReferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReferencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReferencia=new JScrollPane(this.jListColumnasSelectReporteReferencia);
			
			this.jScrollColumnasSelectReporteReferencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReferencia.add(this.jListColumnasSelectReporteReferencia, this.gridBagConstraintsReferencia);
		this.jPanelReporteDinamicoReferencia.add(this.jScrollColumnasSelectReporteReferencia, this.gridBagConstraintsReferencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReferencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteReferencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferencia.add(this.jLabelRelacionesSelectReporteReferencia, this.gridBagConstraintsReferencia);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReferencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteReferencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReferencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReferencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReferencia=new JScrollPane(this.jListRelacionesSelectReporteReferencia);
			
			this.jScrollRelacionesSelectReporteReferencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReferencia.add(this.jListRelacionesSelectReporteReferencia, this.gridBagConstraintsReferencia);
		this.jPanelReporteDinamicoReferencia.add(this.jScrollRelacionesSelectReporteReferencia, this.gridBagConstraintsReferencia);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoReferencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReferencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoReferencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReferencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReferencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReferencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReferencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReferencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReferencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReferencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferencia.add(this.jLabelGenerarExcelReporteDinamicoReferencia, this.gridBagConstraintsReferencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReferencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReferencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReferencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReferencia.setToolTipText("Generar EXCEL"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReferencia.add(this.jButtonGenerarExcelReporteDinamicoReferencia, this.gridBagConstraintsReferencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferencia.add(this.jComboBoxTiposReportesDinamicoReferencia, this.gridBagConstraintsReferencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReferencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReferencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferencia.add(this.jLabelTiposArchivoReporteDinamicoReferencia, this.gridBagConstraintsReferencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferencia.add(this.jComboBoxTiposArchivosReportesDinamicoReferencia, this.gridBagConstraintsReferencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReferencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReferencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReferencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReferencia.setToolTipText("Generar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferencia.add(this.jButtonGenerarReporteDinamicoReferencia, this.gridBagConstraintsReferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReferencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReferencia.setToolTipText("Cancelar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferencia.add(this.jButtonCerrarReporteDinamicoReferencia, this.gridBagConstraintsReferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReferencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReferencia= new JScrollPane(jPanelReporteDinamicoReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReferencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReferencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReferencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReferencia);
		this.jInternalFrameReporteDinamicoReferencia.getContentPane().add(this.jScrollPanelReporteDinamicoReferencia, this.gridBagConstraintsReferencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReferencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReferencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReferencia.setName("jPanelImportacionReferencia"); 
		
		this.jPanelImportacionReferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReferencia.setLayout(gridaBagLayoutImportacionReferencia);
		
		
		this.jInternalFrameImportacionReferencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReferencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReferencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferencia.setResizable(true);
	    this.jInternalFrameImportacionReferencia.setClosable(true);
	    this.jInternalFrameImportacionReferencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReferencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferencia.setResizable(true);
	    this.jInternalFrameImportacionReferencia.setClosable(true);
	    this.jInternalFrameImportacionReferencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReferencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReferencia = new JLabelMe();

		this.jLabelArchivoImportacionReferencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferencia.add(this.jLabelArchivoImportacionReferencia, this.gridBagConstraintsReferencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReferencia = new JFileChooser();		
		this.jFileChooserImportacionReferencia.setToolTipText("ESCOGER ARCHIVO"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReferencia = new JButtonMe();
		this.jButtonAbrirImportacionReferencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReferencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReferencia.setToolTipText("Generar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferencia.add(this.jButtonAbrirImportacionReferencia, this.gridBagConstraintsReferencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReferencia = new JLabelMe();

		this.jLabelPathArchivoImportacionReferencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferencia.add(this.jLabelPathArchivoImportacionReferencia, this.gridBagConstraintsReferencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReferencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReferencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferencia.add(this.jTextFieldPathArchivoImportacionReferencia, this.gridBagConstraintsReferencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReferencia = new JButtonMe();
		this.jButtonGenerarImportacionReferencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReferencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReferencia.setToolTipText("Generar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferencia.add(this.jButtonGenerarImportacionReferencia, this.gridBagConstraintsReferencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReferencia = new JButtonMe();
		this.jButtonCerrarImportacionReferencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReferencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReferencia.setToolTipText("Cancelar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = iPosYImportacion;
		this.gridBagConstraintsReferencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferencia.add(this.jButtonCerrarImportacionReferencia, this.gridBagConstraintsReferencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReferencia = new GridBagLayout();
		
		this.jScrollPanelImportacionReferencia= new JScrollPane(jPanelImportacionReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy =iPosYImportacion;
		this.gridBagConstraintsReferencia.gridx =iPosXImportacion;
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReferencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReferencia);
		this.jInternalFrameImportacionReferencia.getContentPane().add(this.jScrollPanelImportacionReferencia, this.gridBagConstraintsReferencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReferencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReferencia = new JButtonMe();
			this.jButtonAbrirOrderByReferencia.setText("Orden");
			this.jButtonAbrirOrderByReferencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReferencia";
			inputMap = this.jButtonAbrirOrderByReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReferencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByReferencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReferencia.setName("jPanelOrderByReferencia"); 
			
			this.jPanelOrderByReferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReferencia.setLayout(gridaBagLayoutOrderByReferencia);
			
			
			this.jTableDatosReferenciaOrderBy = new JTableMe();        
			this.jTableDatosReferenciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReferenciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReferenciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReferenciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReferenciaOrderBy.setViewportView(this.jTableDatosReferenciaOrderBy);
			this.jTableDatosReferenciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReferenciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReferencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReferencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReferencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReferencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReferencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReferencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReferencia.setTitle("Orden");
			this.jInternalFrameOrderByReferencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReferencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReferencia.setResizable(true);
			this.jInternalFrameOrderByReferencia.setClosable(true);
			this.jInternalFrameOrderByReferencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReferencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReferencia.ipady =150;
				
			this.jPanelOrderByReferencia.add(jScrollPanelDatosReferenciaOrderBy, this.gridBagConstraintsReferencia);//this.jTableDatosReferenciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReferencia = new JButtonMe();
			this.jButtonCerrarOrderByReferencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReferencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReferencia.setToolTipText("Cancelar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReferencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReferencia.add(this.jButtonCerrarOrderByReferencia, this.gridBagConstraintsReferencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReferencia = new GridBagLayout();
			
			this.jScrollPanelOrderByReferencia= new JScrollPane(jPanelOrderByReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsReferencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReferencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReferencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReferencia);
			
			this.jInternalFrameOrderByReferencia.getContentPane().add(this.jScrollPanelOrderByReferencia, this.gridBagConstraintsReferencia);			
		
		} else {
			this.jButtonAbrirOrderByReferencia = new JButtonMe();
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
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.referenciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReferencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReferencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReferencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosReferencia.getRowHeight();//ReferenciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferencia.isSelected()) {
					iHeightTable=ReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferencia.isSelected()) {
					iHeightTable=ReferenciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReferencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReferencia!=null && this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy()!=null) {
			//if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReferencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReferencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReferencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReferencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReferencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=referenciaLogic.getReferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Referencia> TraerReferenciaBeans(List<Referencia> referencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Referencia referencia:referencias) {
					
				if(!(ReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					referencia.setsDetalleGeneralEntityReporte(ReferenciaConstantesFunciones.getReferenciaDescripcion(referencia));
										
						
					
					

					if(referencia.getTelefonoReferencias()!=null && Funciones.existeClass(classes,TelefonoReferencia.class)) {
						try{referencia.settelefonoreferenciasDescripcionReporte(new JRBeanCollectionDataSource(TelefonoReferenciaJInternalFrame.TraerTelefonoReferenciaBeans(referencia.getTelefonoReferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//referencia.setsDetalleGeneralEntityReporte(referencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//referenciabeans.add(referenciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return referencias;
    }
	//PARA REPORTES FIN
}
