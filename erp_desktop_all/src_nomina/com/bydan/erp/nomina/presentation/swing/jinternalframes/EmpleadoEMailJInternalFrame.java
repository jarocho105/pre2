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
import com.bydan.erp.nomina.util.EmpleadoEMailConstantesFunciones;

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
public class EmpleadoEMailJInternalFrame extends EmpleadoEMailBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoEMail;
	
	protected JMenuBar jmenuBarEmpleadoEMail;
	
	protected JMenu jmenuEmpleadoEMail;
	protected JMenu jmenuDatosEmpleadoEMail;
	protected JMenu jmenuArchivoEmpleadoEMail;
	protected JMenu jmenuAccionesEmpleadoEMail;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoEMail;	
	protected GridBagConstraints gridBagConstraintsEmpleadoEMail;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoEMailDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoEMail;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoEMail;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoEMail;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public EmpleadoEMailSessionBean empleadoemailSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoEMail> empleadoemails;		
	public List<EmpleadoEMail> empleadoemailsEliminados;	
	public List<EmpleadoEMail> empleadoemailsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoEMail;		
	protected JButton jButtonAbrirOrderByEmpleadoEMail;
	
	
	//protected JPanel jPanelOrderByEmpleadoEMail;
	//public JScrollPane jScrollPanelOrderByEmpleadoEMail;	
	//protected JButton jButtonCerrarOrderByEmpleadoEMail;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoEMailLogic empleadoemailLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoEMail;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoEMail;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoEMail;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoEMailOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoEMail;
	//public JScrollPane jScrollPanelImportacionEmpleadoEMail;
	
	
	
	protected JPanel jPanelAccionesEmpleadoEMail;
	
    protected JPanel jPanelPaginacionEmpleadoEMail;
    protected JPanel jPanelParametrosReportesEmpleadoEMail;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoEMail;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoEMail;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoEMail;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoEMail;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoEMail;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoEMail;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoEMail;
	//protected JPanel jPanelImportacionEmpleadoEMail;
	
	
	public JTable jTableDatosEmpleadoEMail;
	
	
	
	//public JTable jTableDatosEmpleadoEMailOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoEMail;
	protected JButton jButtonDuplicarEmpleadoEMail;
	protected JButton jButtonCopiarEmpleadoEMail;
	protected JButton jButtonVerFormEmpleadoEMail;
	protected JButton jButtonNuevoRelacionesEmpleadoEMail;
	protected JButton jButtonModificarEmpleadoEMail;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoEMail;
	protected JButton jButtonCerrarEmpleadoEMail;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoEMail;
	protected JButton jButtonProcesarInformacionEmpleadoEMail;
	
	
	protected JButton jButtonAnterioresEmpleadoEMail;
	protected JButton jButtonSiguientesEmpleadoEMail;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoEMail;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoEMail;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoEMail;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoEMail;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoEMail;
	//protected JButton jButtonGenerarImportacionEmpleadoEMail;
	//protected JButton jButtonCerrarImportacionEmpleadoEMail;
	//protected JFileChooser jFileChooserImportacionEmpleadoEMail;
	//protected File fileImportacionEmpleadoEMail;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoEMail;
	protected JButton jButtonDuplicarToolBarEmpleadoEMail;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoEMail;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoEMail;
	protected JButton jButtonCopiarToolBarEmpleadoEMail;
	protected JButton jButtonVerFormToolBarEmpleadoEMail;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoEMail;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoEMail;
	protected JButton jButtonCerrarToolBarEmpleadoEMail;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoEMail;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoEMail;
	protected JButton jButtonAnterioresToolBarEmpleadoEMail;
	protected JButton jButtonSiguientesToolBarEmpleadoEMail;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoEMail;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoEMail;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoEMail;
	protected JMenuItem jMenuItemDuplicarEmpleadoEMail;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoEMail;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoEMail;
	protected JMenuItem jMenuItemCopiarEmpleadoEMail;
	protected JMenuItem jMenuItemVerFormEmpleadoEMail;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoEMail;
	protected JMenuItem jMenuItemCerrarEmpleadoEMail;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoEMail;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoEMail;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoEMail;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoEMail;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoEMail;
	protected JMenuItem jMenuItemAnterioresEmpleadoEMail;
	protected JMenuItem jMenuItemSiguientesEmpleadoEMail;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoEMail;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoEMail;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoEMail;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoEMail;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoEMail;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoEMail;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoEMail;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoEMail;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoEMail;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoEMail;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoEMail;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoEMail;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoEMail;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoEMail;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoEMail;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoEMail;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoEMail;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoEMail;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoEMail;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoEMail;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoEMail;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoEMail;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoEMail;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoEMail;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoEMail;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoEMail;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoEMail;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoEMail;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoEMail;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoEMail;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoEMail;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoEMail;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoEMail;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoEMail;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoEMail;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoEMail;
	public JPanel jPanelFK_IdEmpleadoEmpleadoEMail;
	public JButton jButtonFK_IdEmpleadoEmpleadoEMail;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoEMail;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEMail= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEMailUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEMailBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail;
	
	
	
	
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
	public EmpleadoEMailJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEMailJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoEMail)	{
		this.jButtonRecargarInformacionEmpleadoEMail = jButtonRecargarInformacionEmpleadoEMail;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoEMail() {
		return this.jButtonProcesarInformacionEmpleadoEMail;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoEMail)	{
		this.jButtonProcesarInformacionEmpleadoEMail = jButtonProcesarInformacionEmpleadoEMail;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoEMail() {
		return this.jButtonRecargarInformacionEmpleadoEMail;
	}
	
	
	public List<EmpleadoEMail> getempleadoemails() {
		return this.empleadoemails;
	}

	public void setempleadoemails(List<EmpleadoEMail> empleadoemails) {
		this.empleadoemails = empleadoemails;
	}
	
	public List<EmpleadoEMail> getempleadoemailsAux() {
		return this.empleadoemailsAux;
	}

	public void setempleadoemailsAux(List<EmpleadoEMail> empleadoemailsAux) {
		this.empleadoemailsAux = empleadoemailsAux;
	}
	
	public List<EmpleadoEMail> getempleadoemailsEliminados() {
		return this.empleadoemailsEliminados;
	}

	public void setEmpleadoEMailsEliminados(List<EmpleadoEMail> empleadoemailsEliminados) {
		this.empleadoemailsEliminados = empleadoemailsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoEMail() {
		return jComboBoxTiposSeleccionarEmpleadoEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoEMail(
			JComboBox jComboBoxTiposSeleccionarEmpleadoEMail) {
		this.jComboBoxTiposSeleccionarEmpleadoEMail = jComboBoxTiposSeleccionarEmpleadoEMail;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoEMail() {
		return jTextFieldValorCampoGeneralEmpleadoEMail;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoEMail(
			JTextField jTextFieldValorCampoGeneralEmpleadoEMail) {
		this.jTextFieldValorCampoGeneralEmpleadoEMail = jTextFieldValorCampoGeneralEmpleadoEMail;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoEMail .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoEMail() {
		return this.jCheckBoxSeleccionarTodosEmpleadoEMail;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoEMail(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoEMail) {
		this.jCheckBoxSeleccionarTodosEmpleadoEMail = jCheckBoxSeleccionarTodosEmpleadoEMail;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoEMail() {
		return this.jCheckBoxSeleccionadosEmpleadoEMail;
	}

	public void setjCheckBoxSeleccionadosEmpleadoEMail(
			JCheckBox jCheckBoxSeleccionadosEmpleadoEMail) {
		this.jCheckBoxSeleccionadosEmpleadoEMail = jCheckBoxSeleccionadosEmpleadoEMail;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoEMail() {
		return this.jComboBoxTiposArchivosReportesEmpleadoEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoEMail(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoEMail) {
		this.jComboBoxTiposArchivosReportesEmpleadoEMail = jComboBoxTiposArchivosReportesEmpleadoEMail;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoEMail() {
		return this.jComboBoxTiposReportesEmpleadoEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoEMail(
			JComboBox jComboBoxTiposReportesEmpleadoEMail) {
		this.jComboBoxTiposReportesEmpleadoEMail = jComboBoxTiposReportesEmpleadoEMail;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoEMail() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoEMail;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoEMail(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoEMail) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoEMail = jComboBoxTiposReportesDinamicoEmpleadoEMail;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoEMail() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoEMail(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail = jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoEMail() {
		return this.jComboBoxTiposGraficosReportesEmpleadoEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoEMail(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoEMail) {
		this.jComboBoxTiposGraficosReportesEmpleadoEMail = jComboBoxTiposGraficosReportesEmpleadoEMail;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoEMail() {
		return this.jComboBoxTiposPaginacionEmpleadoEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoEMail(
			JComboBox jComboBoxTiposPaginacionEmpleadoEMail) {
		this.jComboBoxTiposPaginacionEmpleadoEMail = jComboBoxTiposPaginacionEmpleadoEMail;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoEMail() {
		return this.jComboBoxTiposRelacionesEmpleadoEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoEMail() {
		return this.jComboBoxTiposAccionesEmpleadoEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoEMail(
			JComboBox jComboBoxTiposRelacionesEmpleadoEMail) {
		this.jComboBoxTiposRelacionesEmpleadoEMail = jComboBoxTiposRelacionesEmpleadoEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoEMail(
			JComboBox jComboBoxTiposAccionesEmpleadoEMail) {
		this.jComboBoxTiposAccionesEmpleadoEMail = jComboBoxTiposAccionesEmpleadoEMail;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoEMail .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoEMail() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoEMail;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoEMail(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoEMail) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoEMail = jCheckBoxConGraficoDinamicoEmpleadoEMail;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoEMail() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoEMail.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoEMail .setBorder(borderResaltar);		
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
		this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		
		this.empleadoemailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoemailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoemailSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoEMailJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Email MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoEMailJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoEMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoEMail= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"copiar","copiar","Copiar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"ver_form","ver_form","Ver"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"recargar","recargar","Recargar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoEMail,this.jTtoolBarEmpleadoEMail,
							"cerrar","cerrar","Salir"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoEMail=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoEMail;
			
				this.jButtonProcesarInformacionToolBarEmpleadoEMail=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoEMail;
				
		//protected JButton jButtonModificarToolBarEmpleadoEMail;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoEMail=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoEMail=new JMenuMe("General");
		this.jmenuArchivoEmpleadoEMail=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoEMail=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoEMail=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoEMail= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoEMail.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoEMail,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoEMail= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoEMail.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoEMail,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoEMail= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoEMail.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoEMail,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoEMail= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoEMail.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoEMail,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoEMail= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoEMail.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoEMail,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoEMail= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoEMail.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoEMail,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoEMail= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoEMail.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoEMail,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoEMail= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoEMail.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoEMail,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoEMail= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoEMail.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoEMail,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoEMail= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoEMail.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoEMail,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoEMail= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoEMail.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoEMail,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoEMail= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoEMail.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoEMail,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoEMail= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoEMail.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoEMail,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoEMail,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoEMail= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoEMail.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoEMail,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoEMail,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoEMail= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoEMail.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoEMail,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoEMail.add(this.jMenuItemCerrarEmpleadoEMail);
			
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemNuevoEmpleadoEMail);
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemNuevoGuardarCambiosEmpleadoEMail);
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemNuevoRelacionesEmpleadoEMail);
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemGuardarCambiosTablaEmpleadoEMail);		
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemDuplicarEmpleadoEMail);		
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemCopiarEmpleadoEMail);		
			this.jmenuAccionesEmpleadoEMail.add(this.jMenuItemVerFormEmpleadoEMail);		
			
			this.jmenuDatosEmpleadoEMail.add(this.jMenuItemRecargarInformacionEmpleadoEMail);				
			this.jmenuDatosEmpleadoEMail.add(this.jMenuItemAnterioresEmpleadoEMail);				
			this.jmenuDatosEmpleadoEMail.add(this.jMenuItemSiguientesEmpleadoEMail);				
			this.jmenuDatosEmpleadoEMail.add(this.jMenuItemAbrirOrderByEmpleadoEMail);				
			this.jmenuDatosEmpleadoEMail.add(this.jMenuItemMostrarOcultarEmpleadoEMail);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoEMail.add(this.jMenuItemGuardarCambiosEmpleadoEMail);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoEMail.add(this.jmenuArchivoEmpleadoEMail);		
			this.jmenuBarEmpleadoEMail.add(this.jmenuAccionesEmpleadoEMail);		
			this.jmenuBarEmpleadoEMail.add(this.jmenuDatosEmpleadoEMail);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoEMail);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoEMail() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEmpleadoEMail=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoEMail.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoEMail= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoEMail.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoEMail.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoEMail,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.setFocusable(false);


		this.jTabbedPaneBusquedasEmpleadoEMail=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoEMail.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoEMail.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoEMail.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoEMail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoEMail = new EmpleadoEMailDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Email DATOS");
			this.jInternalFrameDetalleFormEmpleadoEMail = new EmpleadoEMailDetalleFormJInternalFrame(jDesktopPane,this.empleadoemailSessionBean.getConGuardarRelaciones(),this.empleadoemailSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoEMail = null;//new EmpleadoEMailDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoEMail= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoEMail = new JTableMe();      
		
		String sToolTipEmpleadoEMail="";
		sToolTipEmpleadoEMail=EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoEMail+="(Nomina.EmpleadoEMail)";
		}
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoEMail+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoEMail.setToolTipText(sToolTipEmpleadoEMail);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoEMail);
		this.jTableDatosEmpleadoEMail.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoEMail.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoEMail.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoEMail.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoEMail,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoEMail = new JButtonMe();
		this.jButtonDuplicarEmpleadoEMail = new JButtonMe();
		this.jButtonCopiarEmpleadoEMail = new JButtonMe();
		this.jButtonVerFormEmpleadoEMail = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoEMail = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail = new JButtonMe();
		this.jButtonCerrarEmpleadoEMail = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoEMail = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoEMail = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Email";
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Emails" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoEMail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoEMail.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoEMail.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoEMail=new ReporteDinamicoJInternalFrame(EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoEMail();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoEMail=new ImportacionJInternalFrame(EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoEMail();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoEMail = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoEMail.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoEMail.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoEMail,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEMail,false,this);
			
			//this.cargarOrderByEmpleadoEMail(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEMail,true,this);
			
			//this.cargarOrderByEmpleadoEMail(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoEMail.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosEmpleadoEMail.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosEmpleadoEMail.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosEmpleadoEMail.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoEMail.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoEMail.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoEMail.setText("Nuevo");
		this.jButtonDuplicarEmpleadoEMail.setText("Duplicar");
		this.jButtonCopiarEmpleadoEMail.setText("Copiar");
		this.jButtonVerFormEmpleadoEMail.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoEMail.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.setText("Guardar");
		this.jButtonCerrarEmpleadoEMail.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoEMail,"nuevo_button","Nuevo",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoEMail,"duplicar_button","Duplicar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoEMail,"copiar_button","Copiar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoEMail,"ver_form","Ver",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoEMail,"nuevorelaciones_button","Nuevo Rel",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoEMail,"guardarcambiostabla_button","Guardar",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoEMail,"cerrar_button","Salir",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoEMail.setToolTipText("Nuevo"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoEMail.setToolTipText("Duplicar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoEMail.setToolTipText("Copiar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoEMail.setToolTipText("Ver"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoEMail.setToolTipText("Nuevo Rel"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.setToolTipText("Guardar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoEMail.setToolTipText("Salir"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoEMail";
		inputMap = this.jButtonNuevoEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoEMail"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoEMail";
		inputMap = this.jButtonDuplicarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoEMail"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoEMail";
		inputMap = this.jButtonCopiarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoEMail"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoEMail";
		inputMap = this.jButtonVerFormEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoEMail"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoEMail";
		inputMap = this.jButtonNuevoRelacionesEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoEMail"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoEMail";
		inputMap = this.jButtonModificarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoEMail"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoEMail";
		inputMap = this.jButtonCerrarEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoEMail"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoEMail";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoEMail"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoEMail.setName("jPanelParametrosReportesEmpleadoEMail"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoEMail.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoEMail.setName("jPanelParametrosReportesAccionesEmpleadoEMail"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoEMail = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoEMail.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoEMail.setToolTipText("Recargar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoEMail,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoEMail = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoEMail.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoEMail.setToolTipText("Procesar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoEMail.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoEMail.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoEMail.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoEMail.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEMail.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoEMail.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEMail.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoEMail.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEMail.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoEMail.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoEMail.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoEMail.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoEMail.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoEMail.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoEMail.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoEMail.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoEMail = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoEMail.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoEMail.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoEMail=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoEMail.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoEMail.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoEMail.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoEMail = new JLabelMe();
		
		this.jLabelAccionesEmpleadoEMail.setText("Acciones");		
		this.jLabelAccionesEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoEMail = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoEMail.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoEMail.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoEMail = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoEMail.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoEMail.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoEMail = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoEMail = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoEMail.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoEMail.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoEMail = new JButtonMe();
		//this.jButtonAnterioresEmpleadoEMail.setText("<<");
        this.jButtonAnterioresEmpleadoEMail.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoEMail,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoEMail = new JButtonMe();
		//this.jButtonSiguientesEmpleadoEMail.setText(">>");
        this.jButtonSiguientesEmpleadoEMail.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoEMail,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoEMail = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoEMail.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoEMail.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoEMail,"nuevoguardarcambios_button","Nue",this.empleadoemailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoEMail";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoEMail"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoEMail";
		inputMap = this.jButtonRecargarInformacionEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoEMail"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoEMail";
		inputMap = this.jButtonSiguientesEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoEMail"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoEMail";
		inputMap = this.jButtonAnterioresEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoEMail"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoEMail();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoEMail.setMinimumSize(new Dimension(this.getWidth(),EmpleadoEMailBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEMailBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoEMail.setMaximumSize(new Dimension(this.getWidth(),EmpleadoEMailBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEMailBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoEMail.setPreferredSize(new Dimension(this.getWidth(),EmpleadoEMailBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEMailBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoEMail = new GridBagLayout();

			this.jPanelPaginacionEmpleadoEMail.setLayout(gridaBagLayoutPaginacionEmpleadoEMail);						
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 0;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonAnterioresEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
					
						
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoEMail.gridy = 0;
			
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonNuevoGuardarCambiosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
						
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoEMail.gridy = 0;
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonSiguientesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 1;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonNuevoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
						
			
			
			if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoEMail.gridy = 1;
				this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoEMail.add(this.jButtonGuardarCambiosTablaEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			}
			
			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 1;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonDuplicarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 1;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonCopiarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 1;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonVerFormEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 1;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoEMail.add(this.jButtonCerrarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
		
		
		this.jButtonRecargarInformacionEmpleadoEMail.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoEMail.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoEMail.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoEMail.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoEMail.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoEMail.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoEMail.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoEMail.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoEMail.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoEMail.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoEMail.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoEMail.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoEMail.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoEMail.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoEMail.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoEMail.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoEMail.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoEMail.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoEMail.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoEMail.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoEMail.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoEMail.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoEMail.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoEMail.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoEMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoEMail = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoEMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoEMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoEMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoEMail = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoEMail.setLayout(gridaBagParametrosReportesEmpleadoEMail);
			this.jPanelParametrosReportesAccionesEmpleadoEMail.setLayout(gridaBagParametrosReportesAccionesEmpleadoEMail);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoEMail.setLayout(gridaBagParametrosAuxiliar1EmpleadoEMail);
			this.jPanelParametrosAuxiliar2EmpleadoEMail.setLayout(gridaBagParametrosAuxiliar2EmpleadoEMail);
			this.jPanelParametrosAuxiliar3EmpleadoEMail.setLayout(gridaBagParametrosAuxiliar3EmpleadoEMail);
			this.jPanelParametrosAuxiliar4EmpleadoEMail.setLayout(gridaBagParametrosAuxiliar4EmpleadoEMail);
			//this.jPanelParametrosAuxiliar5EmpleadoEMail.setLayout(gridaBagParametrosAuxiliar2EmpleadoEMail);			
			
			
			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jButtonRecargarInformacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEMail.add(this.jComboBoxTiposPaginacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEMail.add(this.jCheckBoxConAltoMaximoTablaEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEMail.add(this.jComboBoxTiposArchivosReportesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jPanelParametrosAuxiliar1EmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEMail.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoEMail.add(this.jComboBoxTiposReportesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jPanelParametrosAuxiliar4EmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jComboBoxTiposReportesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jCheckBoxGenerarReporteEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jPanelParametrosAuxiliar2EmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEMail.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jLabelAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoEMail.add(this.jButtonAbrirOrderByEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jComboBoxTiposSeleccionarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
			
			
			/*
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEMail.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jCheckBoxSeleccionarTodosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEMail.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoEMail.add(this.jCheckBoxSeleccionarTodosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);															
				
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEMail.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoEMail.add(this.jCheckBoxSeleccionadosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jPanelParametrosAuxiliar3EmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jComboBoxTiposAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
	
				
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEMail.add(this.jTextFieldValorCampoGeneralEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoEMail = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoEMail.setLayout(gridaBagLayoutDatosEmpleadoEMail);
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = 0;
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoEMail.add(this.jTableDatosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoEMail.setViewportView(this.jTableDatosEmpleadoEMail);
		this.jTableDatosEmpleadoEMail.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoEMail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoEMail= new GridBagLayout();
		this.jPanelAccionesEmpleadoEMail.setLayout(gridaBagLayoutAccionesEmpleadoEMail);
		
		
		/*	
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = 0;
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
			
		this.jPanelAccionesEmpleadoEMail.add(this.jButtonNuevoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoEMail= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoEMail.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEMail.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEMail.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEMail.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoEMail.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoEMail);

		gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEMail.gridy = 0;
		gridBagConstraintsEmpleadoEMail.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoEMail.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoEMail, gridBagConstraintsEmpleadoEMail);

		gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEMail.gridy = 0;
		gridBagConstraintsEmpleadoEMail.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoEMail.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail, gridBagConstraintsEmpleadoEMail);


		gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleadoEMail.gridy = 0;
		gridBagConstraintsEmpleadoEMail.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoEMail.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail, gridBagConstraintsEmpleadoEMail);

		gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEMail.gridy = 1;
		gridBagConstraintsEmpleadoEMail.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoEMail.add(jButtonFK_IdEmpleadoEmpleadoEMail, gridBagConstraintsEmpleadoEMail);

		jTabbedPaneBusquedasEmpleadoEMail.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoEMail);
		jTabbedPaneBusquedasEmpleadoEMail.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoEMail = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoEMail);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;		
			//this.gridBagConstraintsEmpleadoEMail.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoEMail.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;		
		//this.gridBagConstraintsEmpleadoEMail.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoEMail.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoEMail);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEMail.gridx = 0;		
			this.gridBagConstraintsEmpleadoEMail.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoEMail.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);								
		
		
		/*
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		*/		
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEMail.gridx =0;
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoEMail.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
				
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoEMail = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoEMail.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoEMail);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoEMail=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
			
			
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
			
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEMail.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoEMail;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoEMail() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoEMail = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoEMail.setName("jPanelReporteDinamicoEmpleadoEMail"); 
		
		this.jPanelReporteDinamicoEmpleadoEMail.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoEMail.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoEMail.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoEMail.setLayout(gridaBagLayoutReporteDinamicoEmpleadoEMail);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoEMail= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoEMail = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoEMail= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoEMail.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoEMail.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoEMail.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoEMail.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoEMail.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoEMail.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoEMail.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoEMail.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoEMail.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Emails"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoEMail = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoEMail.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jLabelColumnasSelectReporteEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoEMail = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoEMail.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoEMail.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoEMail.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoEMail.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoEMail.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoEMail=new JScrollPane(this.jListColumnasSelectReporteEmpleadoEMail);
			
			this.jScrollColumnasSelectReporteEmpleadoEMail.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoEMail.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoEMail.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoEMail.add(this.jListColumnasSelectReporteEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jScrollColumnasSelectReporteEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoEMail = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoEMail.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoEMail = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoEMail.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoEMail.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoEMail.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoEMail.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoEMail.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoEMail=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoEMail);
			
			this.jScrollRelacionesSelectReporteEmpleadoEMail.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoEMail.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoEMail.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoEMail = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoEMail = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoEMail = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoEMail = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoEMail.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoEMail.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoEMail.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoEMail.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEMail = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoEMail.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail.setToolTipText("Generar EXCEL"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoEMail.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jComboBoxTiposReportesDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEMail = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoEMail.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoEMail = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoEMail.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoEMail,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoEMail.setToolTipText("Generar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jButtonGenerarReporteDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoEMail = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoEMail.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoEMail,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoEMail.setToolTipText("Cancelar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEMail.add(this.jButtonCerrarReporteDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoEMail = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoEMail= new JScrollPane(jPanelReporteDinamicoEmpleadoEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoEMail.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoEMail.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoEMail.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Emails"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEMail.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoEMail.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoEMail.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoEMail);
		this.jInternalFrameReporteDinamicoEmpleadoEMail.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoEMail() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoEMail = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoEMail.setName("jPanelImportacionEmpleadoEMail"); 
		
		this.jPanelImportacionEmpleadoEMail.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoEMail.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoEMail.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoEMail.setLayout(gridaBagLayoutImportacionEmpleadoEMail);
		
		
		this.jInternalFrameImportacionEmpleadoEMail= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoEMail= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoEMail = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoEMail= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoEMail.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoEMail.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoEMail.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoEMail.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoEMail.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoEMail.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoEMail.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoEMail.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoEMail.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoEMail.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoEMail.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoEMail.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoEMail.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoEMail.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoEMail.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Emails"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoEMail = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoEMail.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoEMail.add(this.jLabelArchivoImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoEMail = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoEMail.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoEMail = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoEMail.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoEMail,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoEMail.setToolTipText("Generar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEMail.add(this.jButtonAbrirImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoEMail = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoEMail.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoEMail.add(this.jLabelPathArchivoImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoEMail=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoEMail.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoEMail.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoEMail.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEMail.add(this.jTextFieldPathArchivoImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoEMail = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoEMail.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoEMail,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoEMail.setToolTipText("Generar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEMail.add(this.jButtonGenerarImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoEMail = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoEMail.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoEMail,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoEMail.setToolTipText("Cancelar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEMail.add(this.jButtonCerrarImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoEMail = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoEMail= new JScrollPane(jPanelImportacionEmpleadoEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEMail.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoEMail.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoEMail.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoEMail.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoEMail);
		this.jInternalFrameImportacionEmpleadoEMail.getContentPane().add(this.jScrollPanelImportacionEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoEMail(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoEMail = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoEMail.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoEMail.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoEMail,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoEMail";
			inputMap = this.jButtonAbrirOrderByEmpleadoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoEMail"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoEMail = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoEMail.setName("jPanelOrderByEmpleadoEMail"); 
			
			this.jPanelOrderByEmpleadoEMail.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoEMail.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoEMail.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoEMail.setLayout(gridaBagLayoutOrderByEmpleadoEMail);
			
			
			this.jTableDatosEmpleadoEMailOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoEMailOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoEMailOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoEMailOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoEMailOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoEMailOrderBy.setViewportView(this.jTableDatosEmpleadoEMailOrderBy);
			this.jTableDatosEmpleadoEMailOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoEMailOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoEMail= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoEMail= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoEMail = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoEMail= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoEMail.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoEMail.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoEMail.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoEMail.setResizable(true);
			this.jInternalFrameOrderByEmpleadoEMail.setClosable(true);
			this.jInternalFrameOrderByEmpleadoEMail.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoEMail.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoEMail.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoEMail.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Emails"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoEMail.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoEMail.ipady =150;
				
			this.jPanelOrderByEmpleadoEMail.add(jScrollPanelDatosEmpleadoEMailOrderBy, this.gridBagConstraintsEmpleadoEMail);//this.jTableDatosEmpleadoEMailTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoEMail = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoEMail.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoEMail,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoEMail.setToolTipText("Cancelar"+" "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEMail.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoEMail.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoEMail.add(this.jButtonCerrarOrderByEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoEMail = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoEMail= new JScrollPane(jPanelOrderByEmpleadoEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoEMail = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEMail.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoEMail.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoEMail.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoEMail.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoEMail.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoEMail);
			
			this.jInternalFrameOrderByEmpleadoEMail.getContentPane().add(this.jScrollPanelOrderByEmpleadoEMail, this.gridBagConstraintsEmpleadoEMail);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoEMail = new JButtonMe();
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
			&& this.empleadoemailSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoEMail.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoEMail.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoEMail.getRowHeight();//EmpleadoEMailConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.isSelected()) {
					iHeightTable=EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoEMail.isSelected()) {
					iHeightTable=EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoEMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoEMail.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoEMail.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoEMail.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoEMail.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoEMail.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoEMail.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoEMail!=null && this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoEMail.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoEMail.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoEMail.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoEMail.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoEMail.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoEMail.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoemailLogic.getEmpleadoEMails().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoemails.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoEMail> TraerEmpleadoEMailBeans(List<EmpleadoEMail> empleadoemails,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoEMail empleadoemail:empleadoemails) {
					
				if(!(EmpleadoEMailConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoEMailConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoemail.setsDetalleGeneralEntityReporte(EmpleadoEMailConstantesFunciones.getEmpleadoEMailDescripcion(empleadoemail));
										
					empleadoemail.setesta_activo_descripcion(EmpleadoEMailConstantesFunciones.getesta_activoDescripcion(empleadoemail));	
					
						
					
				} else  {
							
					//empleadoemail.setsDetalleGeneralEntityReporte(empleadoemail.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoemailbeans.add(empleadoemailbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoemails;
    }
	//PARA REPORTES FIN
}
