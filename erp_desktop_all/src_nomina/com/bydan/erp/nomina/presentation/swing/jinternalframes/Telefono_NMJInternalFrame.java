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
import com.bydan.erp.nomina.util.Telefono_NMConstantesFunciones;

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
public class Telefono_NMJInternalFrame extends Telefono_NMBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTelefono_NM;
	
	protected JMenuBar jmenuBarTelefono_NM;
	
	protected JMenu jmenuTelefono_NM;
	protected JMenu jmenuDatosTelefono_NM;
	protected JMenu jmenuArchivoTelefono_NM;
	protected JMenu jmenuAccionesTelefono_NM;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTelefono_NM;	
	protected GridBagConstraints gridBagConstraintsTelefono_NM;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public Telefono_NMDetalleFormJInternalFrame jInternalFrameDetalleFormTelefono_NM;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTelefono_NM;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTelefono_NM;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public Telefono_NMSessionBean telefono_nmSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Telefono_NM> telefono_nms;		
	public List<Telefono_NM> telefono_nmsEliminados;	
	public List<Telefono_NM> telefono_nmsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTelefono_NM;		
	protected JButton jButtonAbrirOrderByTelefono_NM;
	
	
	//protected JPanel jPanelOrderByTelefono_NM;
	//public JScrollPane jScrollPanelOrderByTelefono_NM;	
	//protected JButton jButtonCerrarOrderByTelefono_NM;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public Telefono_NMLogic telefono_nmLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTelefono_NM;
	public JScrollPane jScrollPanelDatosEdicionTelefono_NM;
	public JScrollPane jScrollPanelDatosGeneralTelefono_NM;
    
	
	
	//public JScrollPane jScrollPanelDatosTelefono_NMOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTelefono_NM;
	//public JScrollPane jScrollPanelImportacionTelefono_NM;
	
	
	
	protected JPanel jPanelAccionesTelefono_NM;
	
    protected JPanel jPanelPaginacionTelefono_NM;
    protected JPanel jPanelParametrosReportesTelefono_NM;
	protected JPanel jPanelParametrosReportesAccionesTelefono_NM;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Telefono_NM;
	protected JPanel jPanelParametrosAuxiliar2Telefono_NM;
	protected JPanel jPanelParametrosAuxiliar3Telefono_NM;
	protected JPanel jPanelParametrosAuxiliar4Telefono_NM;
	//protected JPanel jPanelParametrosAuxiliar5Telefono_NM;
	
	
	
	//protected JPanel jPanelReporteDinamicoTelefono_NM;
	//protected JPanel jPanelImportacionTelefono_NM;
	
	
	public JTable jTableDatosTelefono_NM;
	
	
	
	//public JTable jTableDatosTelefono_NMOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTelefono_NM;
	protected JButton jButtonDuplicarTelefono_NM;
	protected JButton jButtonCopiarTelefono_NM;
	protected JButton jButtonVerFormTelefono_NM;
	protected JButton jButtonNuevoRelacionesTelefono_NM;
	protected JButton jButtonModificarTelefono_NM;
	
    protected JButton jButtonGuardarCambiosTablaTelefono_NM;
	protected JButton jButtonCerrarTelefono_NM;
	
	
	protected JButton jButtonRecargarInformacionTelefono_NM;
	protected JButton jButtonProcesarInformacionTelefono_NM;
	
	
	protected JButton jButtonAnterioresTelefono_NM;
	protected JButton jButtonSiguientesTelefono_NM;
	protected JButton jButtonNuevoGuardarCambiosTelefono_NM;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTelefono_NM;
	//protected JButton jButtonCerrarReporteDinamicoTelefono_NM;
	//protected JButton jButtonGenerarExcelReporteDinamicoTelefono_NM;	
	
	
	
	//protected JButton jButtonAbrirImportacionTelefono_NM;
	//protected JButton jButtonGenerarImportacionTelefono_NM;
	//protected JButton jButtonCerrarImportacionTelefono_NM;
	//protected JFileChooser jFileChooserImportacionTelefono_NM;
	//protected File fileImportacionTelefono_NM;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTelefono_NM;
	protected JButton jButtonDuplicarToolBarTelefono_NM;
	protected JButton jButtonNuevoRelacionesToolBarTelefono_NM;
	
	
	public JButton jButtonGuardarCambiosToolBarTelefono_NM;
	protected JButton jButtonCopiarToolBarTelefono_NM;
	protected JButton jButtonVerFormToolBarTelefono_NM;
	public JButton jButtonGuardarCambiosTablaToolBarTelefono_NM;
	protected JButton jButtonMostrarOcultarTablaToolBarTelefono_NM;
	protected JButton jButtonCerrarToolBarTelefono_NM;
	
	protected JButton jButtonRecargarInformacionToolBarTelefono_NM;
	protected JButton jButtonProcesarInformacionToolBarTelefono_NM;
	protected JButton jButtonAnterioresToolBarTelefono_NM;
	protected JButton jButtonSiguientesToolBarTelefono_NM;
	protected JButton jButtonNuevoGuardarCambiosToolBarTelefono_NM;
	protected JButton jButtonAbrirOrderByToolBarTelefono_NM;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTelefono_NM;
	protected JMenuItem jMenuItemDuplicarTelefono_NM;
	protected JMenuItem jMenuItemNuevoRelacionesTelefono_NM;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTelefono_NM;
	protected JMenuItem jMenuItemCopiarTelefono_NM;
	protected JMenuItem jMenuItemVerFormTelefono_NM;
	protected JMenuItem jMenuItemGuardarCambiosTablaTelefono_NM;
	protected JMenuItem jMenuItemCerrarTelefono_NM;
	protected JMenuItem jMenuItemDetalleCerrarTelefono_NM;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTelefono_NM;
	protected JMenuItem jMenuItemDetalleMostarOcultarTelefono_NM;
	
	protected JMenuItem jMenuItemRecargarInformacionTelefono_NM;
	protected JMenuItem jMenuItemProcesarInformacionTelefono_NM;
	protected JMenuItem jMenuItemAnterioresTelefono_NM;
	protected JMenuItem jMenuItemSiguientesTelefono_NM;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTelefono_NM;
	protected JMenuItem jMenuItemAbrirOrderByTelefono_NM;
	protected JMenuItem jMenuItemMostrarOcultarTelefono_NM;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTelefono_NM;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTelefono_NM;
	protected JCheckBox jCheckBoxSeleccionadosTelefono_NM;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTelefono_NM;
	protected JCheckBox jCheckBoxConGraficoReporteTelefono_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTelefono_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTelefono_NM;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTelefono_NM;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTelefono_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTelefono_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTelefono_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTelefono_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTelefono_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTelefono_NM;
	protected JTextField jTextFieldValorCampoGeneralTelefono_NM;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTelefono_NM;
	//public JList<Reporte> jListColumnasSelectReporteTelefono_NM;
	//public JScrollPane jScrollColumnasSelectReporteTelefono_NM;
	
	//public JLabel jLabelRelacionesSelectReporteTelefono_NM;
	//public JList<Reporte> jListRelacionesSelectReporteTelefono_NM;
	//public JScrollPane jScrollRelacionesSelectReporteTelefono_NM;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTelefono_NM;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTelefono_NM;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTelefono_NM;
	//public JLabel jLabelTiposArchivoReporteDinamicoTelefono_NM;
	
		
	//public JLabel jLabelArchivoImportacionTelefono_NM;	
	//public JLabel jLabelPathArchivoImportacionTelefono_NM;
	//protected JTextField jTextFieldPathArchivoImportacionTelefono_NM;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTelefono_NM;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTelefono_NM;
	
	//public JLabel jLabelColumnaCategoriaValorTelefono_NM;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTelefono_NM;
	
	//public JLabel jLabelColumnasValoresGraficoTelefono_NM;
	//public JList<Reporte> jListColumnasValoresGraficoTelefono_NM;
	//public JScrollPane jScrollColumnasValoresGraficoTelefono_NM;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTelefono_NM;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTelefono_NM;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTelefono_NM;
	public JPanel jPanelFK_IdEmpleadoTelefono_NM;
	public JButton jButtonFK_IdEmpleadoTelefono_NM;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoTelefono_NM;
	public JLabel jLabelid_empleadoFK_IdEmpleadoTelefono_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM;
	public JButton jButtonid_empleadoFK_IdEmpleadoTelefono_NM= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoTelefono_NMUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoTelefono_NMBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM;
	
	
	
	
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
	public Telefono_NMJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public Telefono_NMJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTelefono_NM)	{
		this.jButtonRecargarInformacionTelefono_NM = jButtonRecargarInformacionTelefono_NM;
	}
	
	public JButton getjButtonProcesarInformacionTelefono_NM() {
		return this.jButtonProcesarInformacionTelefono_NM;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTelefono_NM)	{
		this.jButtonProcesarInformacionTelefono_NM = jButtonProcesarInformacionTelefono_NM;
	}
	
	
	public JButton getjButtonRecargarInformacionTelefono_NM() {
		return this.jButtonRecargarInformacionTelefono_NM;
	}
	
	
	public List<Telefono_NM> gettelefono_nms() {
		return this.telefono_nms;
	}

	public void settelefono_nms(List<Telefono_NM> telefono_nms) {
		this.telefono_nms = telefono_nms;
	}
	
	public List<Telefono_NM> gettelefono_nmsAux() {
		return this.telefono_nmsAux;
	}

	public void settelefono_nmsAux(List<Telefono_NM> telefono_nmsAux) {
		this.telefono_nmsAux = telefono_nmsAux;
	}
	
	public List<Telefono_NM> gettelefono_nmsEliminados() {
		return this.telefono_nmsEliminados;
	}

	public void setTelefono_NMsEliminados(List<Telefono_NM> telefono_nmsEliminados) {
		this.telefono_nmsEliminados = telefono_nmsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTelefono_NM() {
		return jComboBoxTiposSeleccionarTelefono_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTelefono_NM(
			JComboBox jComboBoxTiposSeleccionarTelefono_NM) {
		this.jComboBoxTiposSeleccionarTelefono_NM = jComboBoxTiposSeleccionarTelefono_NM;
	}
	
	public void setBorderResaltarTiposSeleccionarTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTelefono_NM .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTelefono_NM() {
		return jTextFieldValorCampoGeneralTelefono_NM;
	}

	public void setjTextFieldValorCampoGeneralTelefono_NM(
			JTextField jTextFieldValorCampoGeneralTelefono_NM) {
		this.jTextFieldValorCampoGeneralTelefono_NM = jTextFieldValorCampoGeneralTelefono_NM;
	}

	public void setBorderResaltarValorCampoGeneralTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTelefono_NM .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTelefono_NM() {
		return this.jCheckBoxSeleccionarTodosTelefono_NM;
	}

	public void setjCheckBoxSeleccionarTodosTelefono_NM(
			JCheckBox jCheckBoxSeleccionarTodosTelefono_NM) {
		this.jCheckBoxSeleccionarTodosTelefono_NM = jCheckBoxSeleccionarTodosTelefono_NM;
	}

	public void setBorderResaltarSeleccionarTodosTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTelefono_NM .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTelefono_NM() {
		return this.jCheckBoxSeleccionadosTelefono_NM;
	}

	public void setjCheckBoxSeleccionadosTelefono_NM(
			JCheckBox jCheckBoxSeleccionadosTelefono_NM) {
		this.jCheckBoxSeleccionadosTelefono_NM = jCheckBoxSeleccionadosTelefono_NM;
	}
	
	public void setBorderResaltarSeleccionadosTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTelefono_NM .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTelefono_NM() {
		return this.jComboBoxTiposArchivosReportesTelefono_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTelefono_NM(
			JComboBox jComboBoxTiposArchivosReportesTelefono_NM) {
		this.jComboBoxTiposArchivosReportesTelefono_NM = jComboBoxTiposArchivosReportesTelefono_NM;
	}

	public void setBorderResaltarTiposArchivosReportesTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTelefono_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTelefono_NM() {
		return this.jComboBoxTiposReportesTelefono_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTelefono_NM(
			JComboBox jComboBoxTiposReportesTelefono_NM) {
		this.jComboBoxTiposReportesTelefono_NM = jComboBoxTiposReportesTelefono_NM;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTelefono_NM() {
	//	return jComboBoxTiposReportesDinamicoTelefono_NM;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTelefono_NM(
	//		JComboBox jComboBoxTiposReportesDinamicoTelefono_NM) {
	//	this.jComboBoxTiposReportesDinamicoTelefono_NM = jComboBoxTiposReportesDinamicoTelefono_NM;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTelefono_NM() {
	//	return jComboBoxTiposArchivosReportesDinamicoTelefono_NM;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTelefono_NM(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTelefono_NM) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM = jComboBoxTiposArchivosReportesDinamicoTelefono_NM;
	//}
	
	public void setBorderResaltarTiposReportesTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTelefono_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTelefono_NM() {
		return this.jComboBoxTiposGraficosReportesTelefono_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTelefono_NM(
			JComboBox jComboBoxTiposGraficosReportesTelefono_NM) {
		this.jComboBoxTiposGraficosReportesTelefono_NM = jComboBoxTiposGraficosReportesTelefono_NM;
	}
	
	public void setBorderResaltarTiposGraficosReportesTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTelefono_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTelefono_NM() {
		return this.jComboBoxTiposPaginacionTelefono_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTelefono_NM(
			JComboBox jComboBoxTiposPaginacionTelefono_NM) {
		this.jComboBoxTiposPaginacionTelefono_NM = jComboBoxTiposPaginacionTelefono_NM;
	}
	
	public void setBorderResaltarTiposPaginacionTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTelefono_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTelefono_NM() {
		return this.jComboBoxTiposRelacionesTelefono_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTelefono_NM() {
		return this.jComboBoxTiposAccionesTelefono_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTelefono_NM(
			JComboBox jComboBoxTiposRelacionesTelefono_NM) {
		this.jComboBoxTiposRelacionesTelefono_NM = jComboBoxTiposRelacionesTelefono_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTelefono_NM(
			JComboBox jComboBoxTiposAccionesTelefono_NM) {
		this.jComboBoxTiposAccionesTelefono_NM = jComboBoxTiposAccionesTelefono_NM;
	}
	
	public void setBorderResaltarTiposRelacionesTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTelefono_NM .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTelefono_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTelefono_NM .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTelefono_NM() {
	//	return jCheckBoxConGraficoDinamicoTelefono_NM;
	//}

	//public void setjCheckBoxConGraficoDinamicoTelefono_NM(
	//		JCheckBox jCheckBoxConGraficoDinamicoTelefono_NM) {
	//	this.jCheckBoxConGraficoDinamicoTelefono_NM = jCheckBoxConGraficoDinamicoTelefono_NM;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTelefono_NM() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTelefono_NM.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTelefono_NM .setBorder(borderResaltar);		
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
		this.telefono_nmSessionBean=new Telefono_NMSessionBean();
		
		this.telefono_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefono_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.telefono_nmSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		Telefono_NMJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Telefono_ N M MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
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
		
		Telefono_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Telefono_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTelefono_NM= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"nuevo","nuevo","Nuevo"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"duplicar","duplicar","Duplicar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"copiar","copiar","Copiar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"ver_form","ver_form","Ver"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"recargar","recargar","Recargar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTelefono_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTelefono_NM,this.jTtoolBarTelefono_NM,
							"cerrar","cerrar","Salir"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTelefono_NM=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTelefono_NM;
			
				this.jButtonProcesarInformacionToolBarTelefono_NM=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTelefono_NM;
				
		//protected JButton jButtonModificarToolBarTelefono_NM;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTelefono_NM=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTelefono_NM=new JMenuMe("General");
		this.jmenuArchivoTelefono_NM=new JMenuMe("Archivo");
		this.jmenuAccionesTelefono_NM=new JMenuMe("Acciones");
		this.jmenuDatosTelefono_NM=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTelefono_NM= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTelefono_NM.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTelefono_NM,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTelefono_NM= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTelefono_NM.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTelefono_NM,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTelefono_NM= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTelefono_NM.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTelefono_NM,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTelefono_NM= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTelefono_NM.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTelefono_NM,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTelefono_NM= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTelefono_NM.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTelefono_NM,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTelefono_NM= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTelefono_NM.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTelefono_NM,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTelefono_NM= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTelefono_NM.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTelefono_NM,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTelefono_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTelefono_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTelefono_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTelefono_NM= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTelefono_NM.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTelefono_NM,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTelefono_NM= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTelefono_NM.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTelefono_NM,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTelefono_NM= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTelefono_NM.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTelefono_NM,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTelefono_NM= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTelefono_NM.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTelefono_NM,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTelefono_NM= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTelefono_NM.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTelefono_NM,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTelefono_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTelefono_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTelefono_NM,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTelefono_NM= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTelefono_NM.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTelefono_NM,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTelefono_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTelefono_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTelefono_NM,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTelefono_NM= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTelefono_NM.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTelefono_NM,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTelefono_NM.add(this.jMenuItemCerrarTelefono_NM);
			
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemNuevoTelefono_NM);
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemNuevoGuardarCambiosTelefono_NM);
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemNuevoRelacionesTelefono_NM);
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemGuardarCambiosTablaTelefono_NM);		
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemDuplicarTelefono_NM);		
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemCopiarTelefono_NM);		
			this.jmenuAccionesTelefono_NM.add(this.jMenuItemVerFormTelefono_NM);		
			
			this.jmenuDatosTelefono_NM.add(this.jMenuItemRecargarInformacionTelefono_NM);				
			this.jmenuDatosTelefono_NM.add(this.jMenuItemAnterioresTelefono_NM);				
			this.jmenuDatosTelefono_NM.add(this.jMenuItemSiguientesTelefono_NM);				
			this.jmenuDatosTelefono_NM.add(this.jMenuItemAbrirOrderByTelefono_NM);				
			this.jmenuDatosTelefono_NM.add(this.jMenuItemMostrarOcultarTelefono_NM);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTelefono_NM.add(this.jMenuItemGuardarCambiosTelefono_NM);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTelefono_NM.add(this.jmenuArchivoTelefono_NM);		
			this.jmenuBarTelefono_NM.add(this.jmenuAccionesTelefono_NM);		
			this.jmenuBarTelefono_NM.add(this.jmenuDatosTelefono_NM);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTelefono_NM);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTelefono_NM() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoTelefono_NM=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoTelefono_NM.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoTelefono_NM= new JButtonMe();
		this.jButtonFK_IdEmpleadoTelefono_NM.setText("Buscar");
		this.jButtonFK_IdEmpleadoTelefono_NM.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoTelefono_NM,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoTelefono_NM = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoTelefono_NM.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoTelefono_NM.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoTelefono_NM,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.setFocusable(false);


		this.jTabbedPaneBusquedasTelefono_NM=new JTabbedPane();


		this.jTabbedPaneBusquedasTelefono_NM.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTelefono_NM.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTelefono_NM.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTelefono_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTelefono_NM,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTelefono_NM = new Telefono_NMDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Telefono_ N M DATOS");
			this.jInternalFrameDetalleFormTelefono_NM = new Telefono_NMDetalleFormJInternalFrame(jDesktopPane,this.telefono_nmSessionBean.getConGuardarRelaciones(),this.telefono_nmSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTelefono_NM = null;//new Telefono_NMDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTelefono_NM= new GridBagLayout();
		
		
		this.jTableDatosTelefono_NM = new JTableMe();      
		
		String sToolTipTelefono_NM="";
		sToolTipTelefono_NM=Telefono_NMConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTelefono_NM+="(Nomina.Telefono_NM)";
		}
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			sToolTipTelefono_NM+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTelefono_NM.setToolTipText(sToolTipTelefono_NM);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTelefono_NM);
		this.jTableDatosTelefono_NM.setAutoCreateRowSorter(true);
		this.jTableDatosTelefono_NM.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTelefono_NM.setRowSelectionAllowed(true);
		this.jTableDatosTelefono_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTelefono_NM,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTelefono_NM = new JButtonMe();
		this.jButtonDuplicarTelefono_NM = new JButtonMe();
		this.jButtonCopiarTelefono_NM = new JButtonMe();
		this.jButtonVerFormTelefono_NM = new JButtonMe();
		this.jButtonNuevoRelacionesTelefono_NM = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTelefono_NM = new JButtonMe();
		this.jButtonCerrarTelefono_NM = new JButtonMe();
		
		this.jScrollPanelDatosTelefono_NM = new JScrollPane();   
        this.jScrollPanelDatosGeneralTelefono_NM = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Telefono_ N M";
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono_ N Mes" + this.sPath));
		} else {
			this.jScrollPanelDatosTelefono_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTelefono_NM.setToolTipText("Acciones");
        this.jPanelAccionesTelefono_NM.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTelefono_NM=new ReporteDinamicoJInternalFrame(Telefono_NMConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTelefono_NM();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTelefono_NM=new ImportacionJInternalFrame(Telefono_NMConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTelefono_NM();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTelefono_NM = new JButtonMe();
		
		this.jButtonAbrirOrderByTelefono_NM.setText("Orden");
		this.jButtonAbrirOrderByTelefono_NM.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTelefono_NM,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTelefono_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono_NM,false,this);
			
			//this.cargarOrderByTelefono_NM(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTelefono_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono_NM,true,this);
			
			//this.cargarOrderByTelefono_NM(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTelefono_NM.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTelefono_NM.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTelefono_NM.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTelefono_NM.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTelefono_NM.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTelefono_NM.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTelefono_NM.setText("Nuevo");
		this.jButtonDuplicarTelefono_NM.setText("Duplicar");
		this.jButtonCopiarTelefono_NM.setText("Copiar");
		this.jButtonVerFormTelefono_NM.setText("Ver");
		this.jButtonNuevoRelacionesTelefono_NM.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTelefono_NM.setText("Guardar");
		this.jButtonCerrarTelefono_NM.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTelefono_NM,"nuevo_button","Nuevo",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTelefono_NM,"duplicar_button","Duplicar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTelefono_NM,"copiar_button","Copiar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTelefono_NM,"ver_form","Ver",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTelefono_NM,"nuevorelaciones_button","Nuevo Rel",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTelefono_NM,"guardarcambiostabla_button","Guardar",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTelefono_NM,"cerrar_button","Salir",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTelefono_NM.setToolTipText("Nuevo"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTelefono_NM.setToolTipText("Duplicar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTelefono_NM.setToolTipText("Copiar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTelefono_NM.setToolTipText("Ver"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTelefono_NM.setToolTipText("Nuevo Rel"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTelefono_NM.setToolTipText("Guardar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTelefono_NM.setToolTipText("Salir"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTelefono_NM";
		inputMap = this.jButtonNuevoTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTelefono_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTelefono_NM"));
		
		//DUPLICAR
		sMapKey = "DuplicarTelefono_NM";
		inputMap = this.jButtonDuplicarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTelefono_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTelefono_NM"));
		
		//COPIAR
		sMapKey = "CopiarTelefono_NM";
		inputMap = this.jButtonCopiarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTelefono_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTelefono_NM"));
		
		//VEr FORM
		sMapKey = "VerFormTelefono_NM";
		inputMap = this.jButtonVerFormTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTelefono_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTelefono_NM"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTelefono_NM";
		inputMap = this.jButtonNuevoRelacionesTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTelefono_NM"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTelefono_NM";
		inputMap = this.jButtonModificarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTelefono_NM"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTelefono_NM";
		inputMap = this.jButtonCerrarTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTelefono_NM"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTelefono_NM";
		inputMap = this.jButtonGuardarCambiosTablaTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTelefono_NM"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Telefono_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Telefono_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Telefono_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Telefono_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Telefono_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTelefono_NM.setName("jPanelParametrosReportesTelefono_NM"); 
		
		this.jPanelParametrosReportesAccionesTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTelefono_NM.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTelefono_NM.setName("jPanelParametrosReportesAccionesTelefono_NM"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTelefono_NM = new JButtonMe();
		this.jButtonRecargarInformacionTelefono_NM.setText("Recargar");
		this.jButtonRecargarInformacionTelefono_NM.setToolTipText("Recargar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTelefono_NM,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTelefono_NM = new JButtonMe();
		this.jButtonProcesarInformacionTelefono_NM.setText("Procesar");
		this.jButtonProcesarInformacionTelefono_NM.setToolTipText("Procesar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTelefono_NM.setVisible(false);
			
		this.jButtonProcesarInformacionTelefono_NM.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTelefono_NM.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTelefono_NM.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefono_NM.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTelefono_NM.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefono_NM.setText("TIPO");       
		this.jComboBoxTiposReportesTelefono_NM.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefono_NM.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTelefono_NM.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTelefono_NM.setText("Paginacion");
		this.jComboBoxTiposPaginacionTelefono_NM.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTelefono_NM.setText("Accion");
		this.jComboBoxTiposRelacionesTelefono_NM.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTelefono_NM.setText("Accion");
		this.jComboBoxTiposAccionesTelefono_NM.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTelefono_NM = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTelefono_NM.setText("Accion");
		this.jComboBoxTiposSeleccionarTelefono_NM.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTelefono_NM=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTelefono_NM.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTelefono_NM.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTelefono_NM.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTelefono_NM = new JLabelMe();
		
		this.jLabelAccionesTelefono_NM.setText("Acciones");		
		this.jLabelAccionesTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTelefono_NM = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTelefono_NM.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTelefono_NM.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTelefono_NM = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTelefono_NM.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTelefono_NM.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTelefono_NM = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTelefono_NM.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTelefono_NM.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTelefono_NM = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTelefono_NM.setText("Graf.");
		this.jCheckBoxConGraficoReporteTelefono_NM.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTelefono_NM = new JButtonMe();
		//this.jButtonAnterioresTelefono_NM.setText("<<");
        this.jButtonAnterioresTelefono_NM.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTelefono_NM,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTelefono_NM = new JButtonMe();
		//this.jButtonSiguientesTelefono_NM.setText(">>");
        this.jButtonSiguientesTelefono_NM.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTelefono_NM,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTelefono_NM = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTelefono_NM.setText("Nue");
        this.jButtonNuevoGuardarCambiosTelefono_NM.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTelefono_NM,"nuevoguardarcambios_button","Nue",this.telefono_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTelefono_NM";
		inputMap = this.jButtonNuevoGuardarCambiosTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTelefono_NM"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTelefono_NM";
		inputMap = this.jButtonRecargarInformacionTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTelefono_NM"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTelefono_NM";
		inputMap = this.jButtonSiguientesTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTelefono_NM"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTelefono_NM";
		inputMap = this.jButtonAnterioresTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTelefono_NM"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTelefono_NM();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTelefono_NM.setMinimumSize(new Dimension(this.getWidth(),Telefono_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(Telefono_NMBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTelefono_NM.setMaximumSize(new Dimension(this.getWidth(),Telefono_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(Telefono_NMBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTelefono_NM.setPreferredSize(new Dimension(this.getWidth(),Telefono_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(Telefono_NMBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTelefono_NM = new GridBagLayout();

			this.jPanelPaginacionTelefono_NM.setLayout(gridaBagLayoutPaginacionTelefono_NM);						
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 0;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTelefono_NM.add(this.jButtonAnterioresTelefono_NM, this.gridBagConstraintsTelefono_NM);
					
						
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTelefono_NM.gridy = 0;
			
			this.jPanelPaginacionTelefono_NM.add(this.jButtonNuevoGuardarCambiosTelefono_NM, this.gridBagConstraintsTelefono_NM);
						
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTelefono_NM.gridy = 0;
			this.jPanelPaginacionTelefono_NM.add(this.jButtonSiguientesTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 1;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono_NM.add(this.jButtonNuevoTelefono_NM, this.gridBagConstraintsTelefono_NM);
						
			
			
			if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
				this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTelefono_NM.gridy = 1;
				this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTelefono_NM.add(this.jButtonGuardarCambiosTablaTelefono_NM, this.gridBagConstraintsTelefono_NM);
			}
			
			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 1;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono_NM.add(this.jButtonDuplicarTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 1;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono_NM.add(this.jButtonCopiarTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 1;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono_NM.add(this.jButtonVerFormTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 1;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTelefono_NM.add(this.jButtonCerrarTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
		
		
		this.jButtonRecargarInformacionTelefono_NM.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTelefono_NM.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTelefono_NM.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTelefono_NM.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTelefono_NM.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTelefono_NM.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTelefono_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTelefono_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTelefono_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTelefono_NM.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTelefono_NM.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTelefono_NM.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTelefono_NM.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTelefono_NM.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTelefono_NM.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTelefono_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTelefono_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTelefono_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTelefono_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTelefono_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTelefono_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTelefono_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTelefono_NM.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTelefono_NM.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTelefono_NM.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTelefono_NM.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTelefono_NM.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTelefono_NM.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTelefono_NM.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTelefono_NM.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTelefono_NM.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTelefono_NM.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTelefono_NM.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTelefono_NM.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTelefono_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTelefono_NM = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Telefono_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Telefono_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Telefono_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Telefono_NM = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTelefono_NM.setLayout(gridaBagParametrosReportesTelefono_NM);
			this.jPanelParametrosReportesAccionesTelefono_NM.setLayout(gridaBagParametrosReportesAccionesTelefono_NM);
			
			
			this.jPanelParametrosAuxiliar1Telefono_NM.setLayout(gridaBagParametrosAuxiliar1Telefono_NM);
			this.jPanelParametrosAuxiliar2Telefono_NM.setLayout(gridaBagParametrosAuxiliar2Telefono_NM);
			this.jPanelParametrosAuxiliar3Telefono_NM.setLayout(gridaBagParametrosAuxiliar3Telefono_NM);
			this.jPanelParametrosAuxiliar4Telefono_NM.setLayout(gridaBagParametrosAuxiliar4Telefono_NM);
			//this.jPanelParametrosAuxiliar5Telefono_NM.setLayout(gridaBagParametrosAuxiliar2Telefono_NM);			
			
			
			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono_NM.add(this.jButtonRecargarInformacionTelefono_NM, this.gridBagConstraintsTelefono_NM);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Telefono_NM.add(this.jComboBoxTiposPaginacionTelefono_NM, this.gridBagConstraintsTelefono_NM);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Telefono_NM.add(this.jCheckBoxConAltoMaximoTablaTelefono_NM, this.gridBagConstraintsTelefono_NM);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Telefono_NM.add(this.jComboBoxTiposArchivosReportesTelefono_NM, this.gridBagConstraintsTelefono_NM);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono_NM.add(this.jPanelParametrosAuxiliar1Telefono_NM, this.gridBagConstraintsTelefono_NM);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefono_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Telefono_NM.add(this.jComboBoxTiposReportesTelefono_NM, this.gridBagConstraintsTelefono_NM);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono_NM.add(this.jPanelParametrosAuxiliar4Telefono_NM, this.gridBagConstraintsTelefono_NM);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono_NM.add(this.jComboBoxTiposReportesTelefono_NM, this.gridBagConstraintsTelefono_NM);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefono_NM.add(this.jCheckBoxGenerarReporteTelefono_NM, this.gridBagConstraintsTelefono_NM);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono_NM.add(this.jPanelParametrosAuxiliar2Telefono_NM, this.gridBagConstraintsTelefono_NM);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefono_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefono_NM.add(this.jLabelAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
				this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTelefono_NM.add(this.jButtonAbrirOrderByTelefono_NM, this.gridBagConstraintsTelefono_NM);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono_NM.add(this.jComboBoxTiposSeleccionarTelefono_NM, this.gridBagConstraintsTelefono_NM);			
			
			
			/*
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefono_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefono_NM.add(this.jCheckBoxSeleccionarTodosTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefono_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Telefono_NM.add(this.jCheckBoxSeleccionarTodosTelefono_NM, this.gridBagConstraintsTelefono_NM);															
				
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefono_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Telefono_NM.add(this.jCheckBoxSeleccionadosTelefono_NM, this.gridBagConstraintsTelefono_NM);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono_NM.add(this.jPanelParametrosAuxiliar3Telefono_NM, this.gridBagConstraintsTelefono_NM);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono_NM.add(this.jComboBoxTiposAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);
	
				
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono_NM.add(this.jTextFieldValorCampoGeneralTelefono_NM, this.gridBagConstraintsTelefono_NM);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTelefono_NM = new GridBagLayout();

			this.jScrollPanelDatosTelefono_NM.setLayout(gridaBagLayoutDatosTelefono_NM);
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = 0;
			this.gridBagConstraintsTelefono_NM.gridx = 0;
			
			this.jScrollPanelDatosTelefono_NM.add(this.jTableDatosTelefono_NM, this.gridBagConstraintsTelefono_NM);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTelefono_NM.setViewportView(this.jTableDatosTelefono_NM);
		this.jTableDatosTelefono_NM.setFillsViewportHeight(true);
		this.jTableDatosTelefono_NM.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTelefono_NM= new GridBagLayout();
		this.jPanelAccionesTelefono_NM.setLayout(gridaBagLayoutAccionesTelefono_NM);
		
		
		/*	
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = 0;
		this.gridBagConstraintsTelefono_NM.gridx = 0;
			
		this.jPanelAccionesTelefono_NM.add(this.jButtonNuevoTelefono_NM, this.gridBagConstraintsTelefono_NM);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoTelefono_NM= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoTelefono_NM.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoTelefono_NM.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoTelefono_NM.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoTelefono_NM.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoTelefono_NM.setLayout(gridaBagLayoutFK_IdEmpleadoTelefono_NM);

		gridBagConstraintsTelefono_NM = new GridBagConstraints();
		gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono_NM.gridy = 0;
		gridBagConstraintsTelefono_NM.gridx = 0;
		jPanelFK_IdEmpleadoTelefono_NM.add(jLabelid_empleadoFK_IdEmpleadoTelefono_NM, gridBagConstraintsTelefono_NM);

		gridBagConstraintsTelefono_NM = new GridBagConstraints();
		gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono_NM.gridy = 0;
		gridBagConstraintsTelefono_NM.gridx = 1;
		jPanelFK_IdEmpleadoTelefono_NM.add(jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM, gridBagConstraintsTelefono_NM);


		gridBagConstraintsTelefono_NM = new GridBagConstraints();
		gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTelefono_NM.fill = GridBagConstraints.NONE;
		gridBagConstraintsTelefono_NM.gridy = 0;
		gridBagConstraintsTelefono_NM.gridx = 0;
		jPanelFK_IdEmpleadoTelefono_NM.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM, gridBagConstraintsTelefono_NM);

		gridBagConstraintsTelefono_NM = new GridBagConstraints();
		gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono_NM.gridy = 1;
		gridBagConstraintsTelefono_NM.gridx =1;
		jPanelFK_IdEmpleadoTelefono_NM.add(jButtonFK_IdEmpleadoTelefono_NM, gridBagConstraintsTelefono_NM);

		jTabbedPaneBusquedasTelefono_NM.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoTelefono_NM);
		jTabbedPaneBusquedasTelefono_NM.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTelefono_NM = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTelefono_NM);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();						
			this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefono_NM.gridx = 0;		
			//this.gridBagConstraintsTelefono_NM.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTelefono_NM.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTelefono_NM, this.gridBagConstraintsTelefono_NM);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTelefono_NM.gridx = 0;		
		//this.gridBagConstraintsTelefono_NM.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTelefono_NM.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTelefono_NM);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefono_NM.gridx = 0;		
			this.gridBagConstraintsTelefono_NM.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTelefono_NM.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTelefono_NM, this.gridBagConstraintsTelefono_NM);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTelefono_NM, this.gridBagConstraintsTelefono_NM);								
		
		
		/*
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);
		*/		
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTelefono_NM.gridx =0;
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTelefono_NM.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTelefono_NM, this.gridBagConstraintsTelefono_NM);
				
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTelefono_NM, this.gridBagConstraintsTelefono_NM);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTelefono_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTelefono_NM = new GridBagLayout();
			this.jPanelBusquedasParametrosTelefono_NM.setLayout(gridaBagLayoutBusquedasParametrosTelefono_NM);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTelefono_NM=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTelefono_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTelefono_NM, this.gridBagConstraintsTelefono_NM);
			
			
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
			
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTelefono_NM.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTelefono_NM, this.gridBagConstraintsTelefono_NM);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTelefono_NM;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTelefono_NM() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTelefono_NM = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTelefono_NM.setName("jPanelReporteDinamicoTelefono_NM"); 
		
		this.jPanelReporteDinamicoTelefono_NM.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTelefono_NM.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTelefono_NM.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTelefono_NM.setLayout(gridaBagLayoutReporteDinamicoTelefono_NM);
		
		
		this.jInternalFrameReporteDinamicoTelefono_NM= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTelefono_NM = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTelefono_NM= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTelefono_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTelefono_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTelefono_NM.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTelefono_NM.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTelefono_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTelefono_NM.setResizable(true);
	    this.jInternalFrameReporteDinamicoTelefono_NM.setClosable(true);
	    this.jInternalFrameReporteDinamicoTelefono_NM.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTelefono_NM.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTelefono_NM.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTelefono_NM.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono_ N Mes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTelefono_NM = new JLabelMe();

		this.jLabelColumnasSelectReporteTelefono_NM.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTelefono_NM.add(this.jLabelColumnasSelectReporteTelefono_NM, this.gridBagConstraintsTelefono_NM);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTelefono_NM = new JList<Reporte>();
		this.jListColumnasSelectReporteTelefono_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTelefono_NM.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTelefono_NM.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTelefono_NM.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTelefono_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTelefono_NM=new JScrollPane(this.jListColumnasSelectReporteTelefono_NM);
			
			this.jScrollColumnasSelectReporteTelefono_NM.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTelefono_NM.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTelefono_NM.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTelefono_NM.add(this.jListColumnasSelectReporteTelefono_NM, this.gridBagConstraintsTelefono_NM);
		this.jPanelReporteDinamicoTelefono_NM.add(this.jScrollColumnasSelectReporteTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTelefono_NM = new JLabelMe();

		this.jLabelRelacionesSelectReporteTelefono_NM.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTelefono_NM = new JList<Reporte>();
		this.jListRelacionesSelectReporteTelefono_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTelefono_NM.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTelefono_NM.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTelefono_NM.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTelefono_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTelefono_NM=new JScrollPane(this.jListRelacionesSelectReporteTelefono_NM);
			
			this.jScrollRelacionesSelectReporteTelefono_NM.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTelefono_NM.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTelefono_NM.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTelefono_NM = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTelefono_NM = new JComboBoxMe();
		this.jListColumnasValoresGraficoTelefono_NM = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTelefono_NM = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTelefono_NM.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTelefono_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTelefono_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTelefono_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTelefono_NM = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTelefono_NM.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTelefono_NM.add(this.jLabelGenerarExcelReporteDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTelefono_NM = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTelefono_NM.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTelefono_NM,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTelefono_NM.setToolTipText("Generar EXCEL"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		//this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTelefono_NM.add(this.jButtonGenerarExcelReporteDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono_NM.add(this.jComboBoxTiposReportesDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTelefono_NM = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTelefono_NM.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTelefono_NM.add(this.jLabelTiposArchivoReporteDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono_NM.add(this.jComboBoxTiposArchivosReportesDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTelefono_NM = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTelefono_NM.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTelefono_NM,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTelefono_NM.setToolTipText("Generar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono_NM.add(this.jButtonGenerarReporteDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTelefono_NM = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTelefono_NM.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTelefono_NM,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTelefono_NM.setToolTipText("Cancelar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono_NM.add(this.jButtonCerrarReporteDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTelefono_NM = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTelefono_NM= new JScrollPane(jPanelReporteDinamicoTelefono_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTelefono_NM.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTelefono_NM.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTelefono_NM.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono_ N Mes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTelefono_NM.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTelefono_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTelefono_NM.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTelefono_NM);
		this.jInternalFrameReporteDinamicoTelefono_NM.getContentPane().add(this.jScrollPanelReporteDinamicoTelefono_NM, this.gridBagConstraintsTelefono_NM);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTelefono_NM() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTelefono_NM = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTelefono_NM.setName("jPanelImportacionTelefono_NM"); 
		
		this.jPanelImportacionTelefono_NM.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTelefono_NM.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTelefono_NM.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTelefono_NM.setLayout(gridaBagLayoutImportacionTelefono_NM);
		
		
		this.jInternalFrameImportacionTelefono_NM= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTelefono_NM= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTelefono_NM = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTelefono_NM= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTelefono_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTelefono_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTelefono_NM.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTelefono_NM.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTelefono_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTelefono_NM.setResizable(true);
	    this.jInternalFrameImportacionTelefono_NM.setClosable(true);
	    this.jInternalFrameImportacionTelefono_NM.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTelefono_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTelefono_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTelefono_NM.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTelefono_NM.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTelefono_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTelefono_NM.setResizable(true);
	    this.jInternalFrameImportacionTelefono_NM.setClosable(true);
	    this.jInternalFrameImportacionTelefono_NM.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTelefono_NM.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTelefono_NM.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTelefono_NM.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono_ N Mes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTelefono_NM = new JLabelMe();

		this.jLabelArchivoImportacionTelefono_NM.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYImportacion;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTelefono_NM.add(this.jLabelArchivoImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTelefono_NM = new JFileChooser();		
		this.jFileChooserImportacionTelefono_NM.setToolTipText("ESCOGER ARCHIVO"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTelefono_NM = new JButtonMe();
		this.jButtonAbrirImportacionTelefono_NM.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTelefono_NM,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTelefono_NM.setToolTipText("Generar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono_NM.add(this.jButtonAbrirImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTelefono_NM = new JLabelMe();

		this.jLabelPathArchivoImportacionTelefono_NM.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTelefono_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTelefono_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTelefono_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYImportacion;		
		this.gridBagConstraintsTelefono_NM.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTelefono_NM.add(this.jLabelPathArchivoImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTelefono_NM=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTelefono_NM.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTelefono_NM.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTelefono_NM.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono_NM.add(this.jTextFieldPathArchivoImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTelefono_NM = new JButtonMe();
		this.jButtonGenerarImportacionTelefono_NM.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTelefono_NM,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTelefono_NM.setToolTipText("Generar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono_NM.add(this.jButtonGenerarImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTelefono_NM = new JButtonMe();
		this.jButtonCerrarImportacionTelefono_NM.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTelefono_NM,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTelefono_NM.setToolTipText("Cancelar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono_NM.add(this.jButtonCerrarImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTelefono_NM = new GridBagLayout();
		
		this.jScrollPanelImportacionTelefono_NM= new JScrollPane(jPanelImportacionTelefono_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
		this.gridBagConstraintsTelefono_NM.gridy =iPosYImportacion;
		this.gridBagConstraintsTelefono_NM.gridx =iPosXImportacion;
		this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTelefono_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTelefono_NM.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTelefono_NM);
		this.jInternalFrameImportacionTelefono_NM.getContentPane().add(this.jScrollPanelImportacionTelefono_NM, this.gridBagConstraintsTelefono_NM);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTelefono_NM(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTelefono_NM = new JButtonMe();
			this.jButtonAbrirOrderByTelefono_NM.setText("Orden");
			this.jButtonAbrirOrderByTelefono_NM.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTelefono_NM,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTelefono_NM";
			inputMap = this.jButtonAbrirOrderByTelefono_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTelefono_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTelefono_NM"));
		
		
			GridBagLayout gridaBagLayoutOrderByTelefono_NM = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTelefono_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTelefono_NM.setName("jPanelOrderByTelefono_NM"); 
			
			this.jPanelOrderByTelefono_NM.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTelefono_NM.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTelefono_NM.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTelefono_NM.setLayout(gridaBagLayoutOrderByTelefono_NM);
			
			
			this.jTableDatosTelefono_NMOrderBy = new JTableMe();        
			this.jTableDatosTelefono_NMOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTelefono_NMOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTelefono_NMOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTelefono_NMOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTelefono_NMOrderBy.setViewportView(this.jTableDatosTelefono_NMOrderBy);
			this.jTableDatosTelefono_NMOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTelefono_NMOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTelefono_NM= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTelefono_NM= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTelefono_NM = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTelefono_NM= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTelefono_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTelefono_NM.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTelefono_NM.setTitle("Orden");
			this.jInternalFrameOrderByTelefono_NM.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTelefono_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTelefono_NM.setResizable(true);
			this.jInternalFrameOrderByTelefono_NM.setClosable(true);
			this.jInternalFrameOrderByTelefono_NM.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTelefono_NM.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTelefono_NM.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTelefono_NM.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTelefono_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefono_ N Mes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTelefono_NM.gridx =iPosXOrderBy;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTelefono_NM.ipady =150;
				
			this.jPanelOrderByTelefono_NM.add(jScrollPanelDatosTelefono_NMOrderBy, this.gridBagConstraintsTelefono_NM);//this.jTableDatosTelefono_NMTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTelefono_NM = new JButtonMe();
			this.jButtonCerrarOrderByTelefono_NM.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTelefono_NM,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTelefono_NM.setToolTipText("Cancelar"+" "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTelefono_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono_NM.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTelefono_NM.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTelefono_NM.add(this.jButtonCerrarOrderByTelefono_NM, this.gridBagConstraintsTelefono_NM);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTelefono_NM = new GridBagLayout();
			
			this.jScrollPanelOrderByTelefono_NM= new JScrollPane(jPanelOrderByTelefono_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTelefono_NM = new GridBagConstraints();
			this.gridBagConstraintsTelefono_NM.gridy =iPosYOrderBy;
			this.gridBagConstraintsTelefono_NM.gridx =iPosXOrderBy;
			this.gridBagConstraintsTelefono_NM.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTelefono_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTelefono_NM.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTelefono_NM);
			
			this.jInternalFrameOrderByTelefono_NM.getContentPane().add(this.jScrollPanelOrderByTelefono_NM, this.gridBagConstraintsTelefono_NM);			
		
		} else {
			this.jButtonAbrirOrderByTelefono_NM = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.telefono_nmSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTelefono_NM.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTelefono_NM.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTelefono_NM.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTelefono_NM.getRowHeight();//Telefono_NMConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > Telefono_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTelefono_NM.isSelected()) {
					iHeightTable=Telefono_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Telefono_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Telefono_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > Telefono_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTelefono_NM.isSelected()) {
					iHeightTable=Telefono_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < Telefono_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=Telefono_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTelefono_NM.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTelefono_NM.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTelefono_NM.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTelefono_NM.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTelefono_NM.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTelefono_NM.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTelefono_NM!=null && this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy()!=null) {
			//if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTelefono_NM.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTelefono_NM.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTelefono_NM.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTelefono_NM.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTelefono_NM.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTelefono_NM.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=telefono_nmLogic.getTelefono_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefono_nms.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Telefono_NM> TraerTelefono_NMBeans(List<Telefono_NM> telefono_nms,ArrayList<Classe> classes)throws Exception {
		try {
			for(Telefono_NM telefono_nm:telefono_nms) {
					
				if(!(Telefono_NMConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || Telefono_NMConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					telefono_nm.setsDetalleGeneralEntityReporte(Telefono_NMConstantesFunciones.getTelefono_NMDescripcion(telefono_nm));
										
						
					
						
					
				} else  {
							
					//telefono_nm.setsDetalleGeneralEntityReporte(telefono_nm.getsDetalleGeneralEntityReporte());
										
				}
				
				//telefono_nmbeans.add(telefono_nmbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return telefono_nms;
    }
	//PARA REPORTES FIN
}
