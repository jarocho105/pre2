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
import com.bydan.erp.nomina.util.EmpleadoConstanteConstantesFunciones;

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
public class EmpleadoConstanteJInternalFrame extends EmpleadoConstanteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoConstante;
	
	protected JMenuBar jmenuBarEmpleadoConstante;
	
	protected JMenu jmenuEmpleadoConstante;
	protected JMenu jmenuDatosEmpleadoConstante;
	protected JMenu jmenuArchivoEmpleadoConstante;
	protected JMenu jmenuAccionesEmpleadoConstante;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoConstante;	
	protected GridBagConstraints gridBagConstraintsEmpleadoConstante;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoConstanteDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoConstante;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoConstante;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoConstante;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_constantenomi="";
	
	public EmpleadoConstanteSessionBean empleadoconstanteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public ConstanteNomiSessionBean constantenomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoConstante> empleadoconstantes;		
	public List<EmpleadoConstante> empleadoconstantesEliminados;	
	public List<EmpleadoConstante> empleadoconstantesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoConstante;		
	protected JButton jButtonAbrirOrderByEmpleadoConstante;
	
	
	//protected JPanel jPanelOrderByEmpleadoConstante;
	//public JScrollPane jScrollPanelOrderByEmpleadoConstante;	
	//protected JButton jButtonCerrarOrderByEmpleadoConstante;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoConstanteLogic empleadoconstanteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoConstante;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoConstante;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoConstante;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoConstanteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoConstante;
	//public JScrollPane jScrollPanelImportacionEmpleadoConstante;
	
	
	
	protected JPanel jPanelAccionesEmpleadoConstante;
	
    protected JPanel jPanelPaginacionEmpleadoConstante;
    protected JPanel jPanelParametrosReportesEmpleadoConstante;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoConstante;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoConstante;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoConstante;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoConstante;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoConstante;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoConstante;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoConstante;
	//protected JPanel jPanelImportacionEmpleadoConstante;
	
	
	public JTable jTableDatosEmpleadoConstante;
	
	
	
	//public JTable jTableDatosEmpleadoConstanteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoConstante;
	protected JButton jButtonDuplicarEmpleadoConstante;
	protected JButton jButtonCopiarEmpleadoConstante;
	protected JButton jButtonVerFormEmpleadoConstante;
	protected JButton jButtonNuevoRelacionesEmpleadoConstante;
	protected JButton jButtonModificarEmpleadoConstante;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoConstante;
	protected JButton jButtonCerrarEmpleadoConstante;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoConstante;
	protected JButton jButtonProcesarInformacionEmpleadoConstante;
	
	
	protected JButton jButtonAnterioresEmpleadoConstante;
	protected JButton jButtonSiguientesEmpleadoConstante;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoConstante;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoConstante;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoConstante;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoConstante;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoConstante;
	//protected JButton jButtonGenerarImportacionEmpleadoConstante;
	//protected JButton jButtonCerrarImportacionEmpleadoConstante;
	//protected JFileChooser jFileChooserImportacionEmpleadoConstante;
	//protected File fileImportacionEmpleadoConstante;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoConstante;
	protected JButton jButtonDuplicarToolBarEmpleadoConstante;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoConstante;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoConstante;
	protected JButton jButtonCopiarToolBarEmpleadoConstante;
	protected JButton jButtonVerFormToolBarEmpleadoConstante;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoConstante;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoConstante;
	protected JButton jButtonCerrarToolBarEmpleadoConstante;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoConstante;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoConstante;
	protected JButton jButtonAnterioresToolBarEmpleadoConstante;
	protected JButton jButtonSiguientesToolBarEmpleadoConstante;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoConstante;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoConstante;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoConstante;
	protected JMenuItem jMenuItemDuplicarEmpleadoConstante;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoConstante;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoConstante;
	protected JMenuItem jMenuItemCopiarEmpleadoConstante;
	protected JMenuItem jMenuItemVerFormEmpleadoConstante;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoConstante;
	protected JMenuItem jMenuItemCerrarEmpleadoConstante;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoConstante;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoConstante;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoConstante;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoConstante;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoConstante;
	protected JMenuItem jMenuItemAnterioresEmpleadoConstante;
	protected JMenuItem jMenuItemSiguientesEmpleadoConstante;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoConstante;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoConstante;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoConstante;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoConstante;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoConstante;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoConstante;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoConstante;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoConstante;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoConstante;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoConstante;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoConstante;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoConstante;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoConstante;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoConstante;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoConstante;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoConstante;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoConstante;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoConstante;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoConstante;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoConstante;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoConstante;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoConstante;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoConstante;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoConstante;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoConstante;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoConstante;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoConstante;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoConstante;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoConstante;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoConstante;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoConstante;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoConstante;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoConstante;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoConstante;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoConstante;
	public JPanel jPanelFK_IdConstanteNomiEmpleadoConstante;
	public JButton jButtonFK_IdConstanteNomiEmpleadoConstante;
	public JPanel jPanelFK_IdEmpleadoEmpleadoConstante;
	public JButton jButtonFK_IdEmpleadoEmpleadoConstante;
	
	public JPanel jPanelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante;
	public JLabel jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante;
	public JButton jButtonid_constante_nomiFK_IdConstanteNomiEmpleadoConstante= new JButtonMe();
	public JButton jButtonid_constante_nomiFK_IdConstanteNomiEmpleadoConstanteUpdate= new JButtonMe();
	public JButton jButtonid_constante_nomiFK_IdConstanteNomiEmpleadoConstanteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoConstante;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoConstante= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoConstanteUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoConstanteBusqueda= new JButtonMe();

	
	
	
	
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
	public EmpleadoConstanteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoConstante)	{
		this.jButtonRecargarInformacionEmpleadoConstante = jButtonRecargarInformacionEmpleadoConstante;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoConstante() {
		return this.jButtonProcesarInformacionEmpleadoConstante;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoConstante)	{
		this.jButtonProcesarInformacionEmpleadoConstante = jButtonProcesarInformacionEmpleadoConstante;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoConstante() {
		return this.jButtonRecargarInformacionEmpleadoConstante;
	}
	
	
	public List<EmpleadoConstante> getempleadoconstantes() {
		return this.empleadoconstantes;
	}

	public void setempleadoconstantes(List<EmpleadoConstante> empleadoconstantes) {
		this.empleadoconstantes = empleadoconstantes;
	}
	
	public List<EmpleadoConstante> getempleadoconstantesAux() {
		return this.empleadoconstantesAux;
	}

	public void setempleadoconstantesAux(List<EmpleadoConstante> empleadoconstantesAux) {
		this.empleadoconstantesAux = empleadoconstantesAux;
	}
	
	public List<EmpleadoConstante> getempleadoconstantesEliminados() {
		return this.empleadoconstantesEliminados;
	}

	public void setEmpleadoConstantesEliminados(List<EmpleadoConstante> empleadoconstantesEliminados) {
		this.empleadoconstantesEliminados = empleadoconstantesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoConstante() {
		return jComboBoxTiposSeleccionarEmpleadoConstante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoConstante(
			JComboBox jComboBoxTiposSeleccionarEmpleadoConstante) {
		this.jComboBoxTiposSeleccionarEmpleadoConstante = jComboBoxTiposSeleccionarEmpleadoConstante;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoConstante() {
		return jTextFieldValorCampoGeneralEmpleadoConstante;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoConstante(
			JTextField jTextFieldValorCampoGeneralEmpleadoConstante) {
		this.jTextFieldValorCampoGeneralEmpleadoConstante = jTextFieldValorCampoGeneralEmpleadoConstante;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoConstante .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoConstante() {
		return this.jCheckBoxSeleccionarTodosEmpleadoConstante;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoConstante(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoConstante) {
		this.jCheckBoxSeleccionarTodosEmpleadoConstante = jCheckBoxSeleccionarTodosEmpleadoConstante;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoConstante() {
		return this.jCheckBoxSeleccionadosEmpleadoConstante;
	}

	public void setjCheckBoxSeleccionadosEmpleadoConstante(
			JCheckBox jCheckBoxSeleccionadosEmpleadoConstante) {
		this.jCheckBoxSeleccionadosEmpleadoConstante = jCheckBoxSeleccionadosEmpleadoConstante;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoConstante() {
		return this.jComboBoxTiposArchivosReportesEmpleadoConstante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoConstante(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoConstante) {
		this.jComboBoxTiposArchivosReportesEmpleadoConstante = jComboBoxTiposArchivosReportesEmpleadoConstante;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoConstante() {
		return this.jComboBoxTiposReportesEmpleadoConstante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoConstante(
			JComboBox jComboBoxTiposReportesEmpleadoConstante) {
		this.jComboBoxTiposReportesEmpleadoConstante = jComboBoxTiposReportesEmpleadoConstante;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoConstante() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoConstante;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoConstante(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoConstante) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoConstante = jComboBoxTiposReportesDinamicoEmpleadoConstante;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoConstante() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoConstante(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante = jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoConstante() {
		return this.jComboBoxTiposGraficosReportesEmpleadoConstante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoConstante(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoConstante) {
		this.jComboBoxTiposGraficosReportesEmpleadoConstante = jComboBoxTiposGraficosReportesEmpleadoConstante;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoConstante() {
		return this.jComboBoxTiposPaginacionEmpleadoConstante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoConstante(
			JComboBox jComboBoxTiposPaginacionEmpleadoConstante) {
		this.jComboBoxTiposPaginacionEmpleadoConstante = jComboBoxTiposPaginacionEmpleadoConstante;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoConstante() {
		return this.jComboBoxTiposRelacionesEmpleadoConstante;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoConstante() {
		return this.jComboBoxTiposAccionesEmpleadoConstante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoConstante(
			JComboBox jComboBoxTiposRelacionesEmpleadoConstante) {
		this.jComboBoxTiposRelacionesEmpleadoConstante = jComboBoxTiposRelacionesEmpleadoConstante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoConstante(
			JComboBox jComboBoxTiposAccionesEmpleadoConstante) {
		this.jComboBoxTiposAccionesEmpleadoConstante = jComboBoxTiposAccionesEmpleadoConstante;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoConstante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoConstante .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoConstante() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoConstante;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoConstante(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoConstante) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoConstante = jCheckBoxConGraficoDinamicoEmpleadoConstante;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoConstante() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoConstante.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoConstante .setBorder(borderResaltar);		
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
		this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		
		this.empleadoconstanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoconstanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoconstanteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoConstanteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Constante MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoConstante= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"copiar","copiar","Copiar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"ver_form","ver_form","Ver"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"recargar","recargar","Recargar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoConstante,this.jTtoolBarEmpleadoConstante,
							"cerrar","cerrar","Salir"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoConstante=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoConstante;
			
				this.jButtonProcesarInformacionToolBarEmpleadoConstante=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoConstante;
				
		//protected JButton jButtonModificarToolBarEmpleadoConstante;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoConstante=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoConstante=new JMenuMe("General");
		this.jmenuArchivoEmpleadoConstante=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoConstante=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoConstante=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoConstante= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoConstante.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoConstante,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoConstante= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoConstante.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoConstante,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoConstante= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoConstante.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoConstante,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoConstante= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoConstante.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoConstante,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoConstante= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoConstante.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoConstante,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoConstante= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoConstante.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoConstante,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoConstante= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoConstante.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoConstante,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoConstante= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoConstante.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoConstante,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoConstante= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoConstante.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoConstante,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoConstante= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoConstante.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoConstante,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoConstante= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoConstante.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoConstante,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoConstante= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoConstante.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoConstante,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoConstante= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoConstante.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoConstante,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoConstante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoConstante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoConstante,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoConstante= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoConstante.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoConstante,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoConstante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoConstante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoConstante,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoConstante= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoConstante.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoConstante,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoConstante.add(this.jMenuItemCerrarEmpleadoConstante);
			
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemNuevoEmpleadoConstante);
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemNuevoGuardarCambiosEmpleadoConstante);
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemNuevoRelacionesEmpleadoConstante);
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemGuardarCambiosTablaEmpleadoConstante);		
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemDuplicarEmpleadoConstante);		
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemCopiarEmpleadoConstante);		
			this.jmenuAccionesEmpleadoConstante.add(this.jMenuItemVerFormEmpleadoConstante);		
			
			this.jmenuDatosEmpleadoConstante.add(this.jMenuItemRecargarInformacionEmpleadoConstante);				
			this.jmenuDatosEmpleadoConstante.add(this.jMenuItemAnterioresEmpleadoConstante);				
			this.jmenuDatosEmpleadoConstante.add(this.jMenuItemSiguientesEmpleadoConstante);				
			this.jmenuDatosEmpleadoConstante.add(this.jMenuItemAbrirOrderByEmpleadoConstante);				
			this.jmenuDatosEmpleadoConstante.add(this.jMenuItemMostrarOcultarEmpleadoConstante);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoConstante.add(this.jMenuItemGuardarCambiosEmpleadoConstante);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoConstante.add(this.jmenuArchivoEmpleadoConstante);		
			this.jmenuBarEmpleadoConstante.add(this.jmenuAccionesEmpleadoConstante);		
			this.jmenuBarEmpleadoConstante.add(this.jmenuDatosEmpleadoConstante);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoConstante);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoConstante() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdConstanteNomiEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConstanteNomiEmpleadoConstante.setToolTipText("Buscar Por Constante Nomi ");
		this.jButtonFK_IdConstanteNomiEmpleadoConstante= new JButtonMe();
		this.jButtonFK_IdConstanteNomiEmpleadoConstante.setText("Buscar");
		this.jButtonFK_IdConstanteNomiEmpleadoConstante.setToolTipText("Buscar Por Constante Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConstanteNomiEmpleadoConstante,"buscar_button","Buscar Por Constante Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConstanteNomiEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante = new JLabelMe();
		jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setText("Constante Nomi :");
		jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setToolTipText("Constante Nomi");
		jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante= new JComboBoxMe();
		jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoConstante.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoConstante= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoConstante.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoConstante.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoConstante,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoConstante=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoConstante.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoConstante.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoConstante.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoConstante.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoConstante = new EmpleadoConstanteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Constante DATOS");
			this.jInternalFrameDetalleFormEmpleadoConstante = new EmpleadoConstanteDetalleFormJInternalFrame(jDesktopPane,this.empleadoconstanteSessionBean.getConGuardarRelaciones(),this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoConstante = null;//new EmpleadoConstanteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoConstante= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoConstante = new JTableMe();      
		
		String sToolTipEmpleadoConstante="";
		sToolTipEmpleadoConstante=EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoConstante+="(Nomina.EmpleadoConstante)";
		}
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoConstante+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoConstante.setToolTipText(sToolTipEmpleadoConstante);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoConstante);
		this.jTableDatosEmpleadoConstante.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoConstante.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoConstante.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoConstante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoConstante = new JButtonMe();
		this.jButtonDuplicarEmpleadoConstante = new JButtonMe();
		this.jButtonCopiarEmpleadoConstante = new JButtonMe();
		this.jButtonVerFormEmpleadoConstante = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoConstante = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante = new JButtonMe();
		this.jButtonCerrarEmpleadoConstante = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoConstante = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoConstante = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Constante";
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Constantes" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoConstante.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoConstante.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoConstante.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoConstante=new ReporteDinamicoJInternalFrame(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoConstante();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoConstante=new ImportacionJInternalFrame(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoConstante();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoConstante = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoConstante.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoConstante.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoConstante,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoConstante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoConstante,false,this);
			
			//this.cargarOrderByEmpleadoConstante(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoConstante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoConstante,true,this);
			
			//this.cargarOrderByEmpleadoConstante(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoConstante.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosEmpleadoConstante.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosEmpleadoConstante.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosEmpleadoConstante.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoConstante.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoConstante.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoConstante.setText("Nuevo");
		this.jButtonDuplicarEmpleadoConstante.setText("Duplicar");
		this.jButtonCopiarEmpleadoConstante.setText("Copiar");
		this.jButtonVerFormEmpleadoConstante.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoConstante.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.setText("Guardar");
		this.jButtonCerrarEmpleadoConstante.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoConstante,"nuevo_button","Nuevo",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoConstante,"duplicar_button","Duplicar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoConstante,"copiar_button","Copiar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoConstante,"ver_form","Ver",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoConstante,"nuevorelaciones_button","Nuevo Rel",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoConstante,"guardarcambiostabla_button","Guardar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoConstante,"cerrar_button","Salir",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoConstante.setToolTipText("Nuevo"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoConstante.setToolTipText("Duplicar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoConstante.setToolTipText("Copiar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoConstante.setToolTipText("Ver"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoConstante.setToolTipText("Nuevo Rel"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.setToolTipText("Guardar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoConstante.setToolTipText("Salir"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoConstante";
		inputMap = this.jButtonNuevoEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoConstante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoConstante"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoConstante";
		inputMap = this.jButtonDuplicarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoConstante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoConstante"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoConstante";
		inputMap = this.jButtonCopiarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoConstante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoConstante"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoConstante";
		inputMap = this.jButtonVerFormEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoConstante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoConstante"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoConstante";
		inputMap = this.jButtonNuevoRelacionesEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoConstante"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoConstante";
		inputMap = this.jButtonModificarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoConstante"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoConstante";
		inputMap = this.jButtonCerrarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoConstante"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoConstante";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoConstante"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoConstante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoConstante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoConstante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoConstante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoConstante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoConstante.setName("jPanelParametrosReportesEmpleadoConstante"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoConstante.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoConstante.setName("jPanelParametrosReportesAccionesEmpleadoConstante"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoConstante = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoConstante.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoConstante.setToolTipText("Recargar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoConstante,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoConstante = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoConstante.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoConstante.setToolTipText("Procesar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoConstante.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoConstante.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoConstante.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoConstante.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoConstante.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoConstante.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoConstante.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoConstante.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoConstante.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoConstante.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoConstante.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoConstante.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoConstante.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoConstante.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoConstante.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoConstante.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoConstante.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoConstante.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoConstante=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoConstante.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoConstante.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoConstante.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoConstante = new JLabelMe();
		
		this.jLabelAccionesEmpleadoConstante.setText("Acciones");		
		this.jLabelAccionesEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoConstante = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoConstante.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoConstante.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoConstante = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoConstante.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoConstante.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoConstante = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoConstante = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoConstante.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoConstante.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoConstante = new JButtonMe();
		//this.jButtonAnterioresEmpleadoConstante.setText("<<");
        this.jButtonAnterioresEmpleadoConstante.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoConstante,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoConstante = new JButtonMe();
		//this.jButtonSiguientesEmpleadoConstante.setText(">>");
        this.jButtonSiguientesEmpleadoConstante.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoConstante,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoConstante = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoConstante.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoConstante.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoConstante,"nuevoguardarcambios_button","Nue",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoConstante";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoConstante"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoConstante";
		inputMap = this.jButtonRecargarInformacionEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoConstante"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoConstante";
		inputMap = this.jButtonSiguientesEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoConstante"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoConstante";
		inputMap = this.jButtonAnterioresEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoConstante"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoConstante();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoConstante.setMinimumSize(new Dimension(this.getWidth(),EmpleadoConstanteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoConstanteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoConstante.setMaximumSize(new Dimension(this.getWidth(),EmpleadoConstanteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoConstanteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoConstante.setPreferredSize(new Dimension(this.getWidth(),EmpleadoConstanteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoConstanteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoConstante = new GridBagLayout();

			this.jPanelPaginacionEmpleadoConstante.setLayout(gridaBagLayoutPaginacionEmpleadoConstante);						
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 0;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonAnterioresEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
					
						
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoConstante.gridy = 0;
			
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonNuevoGuardarCambiosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
						
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoConstante.gridy = 0;
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonSiguientesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 1;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonNuevoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
						
			
			
			if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoConstante.gridy = 1;
				this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoConstante.add(this.jButtonGuardarCambiosTablaEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			}
			
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 1;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonDuplicarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 1;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonCopiarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 1;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonVerFormEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 1;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoConstante.add(this.jButtonCerrarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		
		this.jButtonRecargarInformacionEmpleadoConstante.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoConstante.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoConstante.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoConstante.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoConstante.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoConstante.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoConstante.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoConstante.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoConstante.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoConstante.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoConstante.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoConstante.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoConstante.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoConstante.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoConstante.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoConstante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoConstante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoConstante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoConstante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoConstante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoConstante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoConstante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoConstante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoConstante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoConstante.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoConstante.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoConstante.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoConstante.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoConstante.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoConstante.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoConstante.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoConstante.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoConstante.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoConstante = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoConstante = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoConstante = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoConstante = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoConstante = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoConstante = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoConstante.setLayout(gridaBagParametrosReportesEmpleadoConstante);
			this.jPanelParametrosReportesAccionesEmpleadoConstante.setLayout(gridaBagParametrosReportesAccionesEmpleadoConstante);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoConstante.setLayout(gridaBagParametrosAuxiliar1EmpleadoConstante);
			this.jPanelParametrosAuxiliar2EmpleadoConstante.setLayout(gridaBagParametrosAuxiliar2EmpleadoConstante);
			this.jPanelParametrosAuxiliar3EmpleadoConstante.setLayout(gridaBagParametrosAuxiliar3EmpleadoConstante);
			this.jPanelParametrosAuxiliar4EmpleadoConstante.setLayout(gridaBagParametrosAuxiliar4EmpleadoConstante);
			//this.jPanelParametrosAuxiliar5EmpleadoConstante.setLayout(gridaBagParametrosAuxiliar2EmpleadoConstante);			
			
			
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jButtonRecargarInformacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoConstante.add(this.jComboBoxTiposPaginacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoConstante.add(this.jCheckBoxConAltoMaximoTablaEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoConstante.add(this.jComboBoxTiposArchivosReportesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jPanelParametrosAuxiliar1EmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoConstante.add(this.jComboBoxTiposReportesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);																		
			
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EmpleadoConstante.add(this.jComboBoxTiposGraficosReportesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jPanelParametrosAuxiliar4EmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jComboBoxTiposReportesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jCheckBoxGenerarReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jPanelParametrosAuxiliar2EmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jLabelAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoConstante.add(this.jButtonAbrirOrderByEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jComboBoxTiposSeleccionarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
			
			
			/*
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jCheckBoxSeleccionarTodosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jCheckBoxConGraficoReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoConstante.add(this.jCheckBoxSeleccionarTodosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);															
				
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoConstante.add(this.jCheckBoxSeleccionadosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);															
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoConstante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoConstante.add(this.jCheckBoxConGraficoReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jPanelParametrosAuxiliar3EmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jComboBoxTiposAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
	
				
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoConstante.add(this.jTextFieldValorCampoGeneralEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoConstante = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoConstante.setLayout(gridaBagLayoutDatosEmpleadoConstante);
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = 0;
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoConstante.add(this.jTableDatosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoConstante.setViewportView(this.jTableDatosEmpleadoConstante);
		this.jTableDatosEmpleadoConstante.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoConstante.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoConstante= new GridBagLayout();
		this.jPanelAccionesEmpleadoConstante.setLayout(gridaBagLayoutAccionesEmpleadoConstante);
		
		
		/*	
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
			
		this.jPanelAccionesEmpleadoConstante.add(this.jButtonNuevoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdConstanteNomiEmpleadoConstante= new GridBagLayout();
		gridaBagLayoutFK_IdConstanteNomiEmpleadoConstante.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConstanteNomiEmpleadoConstante.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConstanteNomiEmpleadoConstante.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConstanteNomiEmpleadoConstante.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConstanteNomiEmpleadoConstante.setLayout(gridaBagLayoutFK_IdConstanteNomiEmpleadoConstante);

		gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoConstante.gridy = 0;
		gridBagConstraintsEmpleadoConstante.gridx = 0;
		jPanelFK_IdConstanteNomiEmpleadoConstante.add(jLabelid_constante_nomiFK_IdConstanteNomiEmpleadoConstante, gridBagConstraintsEmpleadoConstante);

		gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoConstante.gridy = 0;
		gridBagConstraintsEmpleadoConstante.gridx = 1;
		jPanelFK_IdConstanteNomiEmpleadoConstante.add(jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante, gridBagConstraintsEmpleadoConstante);

		gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoConstante.gridy = 1;
		gridBagConstraintsEmpleadoConstante.gridx =1;
		jPanelFK_IdConstanteNomiEmpleadoConstante.add(jButtonFK_IdConstanteNomiEmpleadoConstante, gridBagConstraintsEmpleadoConstante);

		jTabbedPaneBusquedasEmpleadoConstante.addTab("1.-Por Constante Nomi ", jPanelFK_IdConstanteNomiEmpleadoConstante);
		jTabbedPaneBusquedasEmpleadoConstante.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoConstante= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoConstante.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoConstante.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoConstante.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoConstante.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoConstante.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoConstante);

		gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoConstante.gridy = 0;
		gridBagConstraintsEmpleadoConstante.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoConstante.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoConstante, gridBagConstraintsEmpleadoConstante);

		gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoConstante.gridy = 0;
		gridBagConstraintsEmpleadoConstante.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoConstante.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante, gridBagConstraintsEmpleadoConstante);

		gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoConstante.gridy = 1;
		gridBagConstraintsEmpleadoConstante.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoConstante.add(jButtonFK_IdEmpleadoEmpleadoConstante, gridBagConstraintsEmpleadoConstante);

		jTabbedPaneBusquedasEmpleadoConstante.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoConstante);
		jTabbedPaneBusquedasEmpleadoConstante.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoConstante);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;		
			//this.gridBagConstraintsEmpleadoConstante.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoConstante.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;		
		//this.gridBagConstraintsEmpleadoConstante.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoConstante);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;		
			this.gridBagConstraintsEmpleadoConstante.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoConstante.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);								
		
		
		/*
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		*/		
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoConstante.gridx =0;
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoConstante.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
				
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoConstante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoConstante = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoConstante.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoConstante);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoConstante=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoConstante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoConstante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoConstante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoConstante;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoConstante() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoConstante = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoConstante.setName("jPanelReporteDinamicoEmpleadoConstante"); 
		
		this.jPanelReporteDinamicoEmpleadoConstante.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoConstante.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoConstante.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoConstante.setLayout(gridaBagLayoutReporteDinamicoEmpleadoConstante);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoConstante= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoConstante = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoConstante= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoConstante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoConstante.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoConstante.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoConstante.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoConstante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoConstante.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoConstante.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoConstante.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoConstante.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoConstante.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoConstante.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Constantes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoConstante = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoConstante.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelColumnasSelectReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoConstante = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoConstante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoConstante.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoConstante.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoConstante.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoConstante.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoConstante=new JScrollPane(this.jListColumnasSelectReporteEmpleadoConstante);
			
			this.jScrollColumnasSelectReporteEmpleadoConstante.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoConstante.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoConstante.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoConstante.add(this.jListColumnasSelectReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jScrollColumnasSelectReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoConstante = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoConstante.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoConstante = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoConstante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoConstante.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoConstante.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoConstante.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoConstante.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoConstante=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoConstante);
			
			this.jScrollRelacionesSelectReporteEmpleadoConstante.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoConstante.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoConstante.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoConstante = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoConstante = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoConstante = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoConstante.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoConstante.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoConstante.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoConstante.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpleadoConstante = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpleadoConstante.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelConGraficoDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpleadoConstante = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpleadoConstante.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpleadoConstante.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpleadoConstante.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoConstante.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoConstante.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jCheckBoxConGraficoDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpleadoConstante = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpleadoConstante.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelColumnaCategoriaGraficoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpleadoConstante = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpleadoConstante.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelColumnaCategoriaValorEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpleadoConstante.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpleadoConstante.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpleadoConstante.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoConstante.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoConstante.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jComboBoxColumnaCategoriaValorEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpleadoConstante = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpleadoConstante.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelColumnasValoresGraficoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpleadoConstante = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpleadoConstante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpleadoConstante.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpleadoConstante.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoConstante.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoConstante.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpleadoConstante=new JScrollPane(this.jListColumnasValoresGraficoEmpleadoConstante);
			
			this.jScrollColumnasValoresGraficoEmpleadoConstante.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoConstante.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoConstante.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpleadoConstante.add(this.jListColumnasSelectReporteEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jScrollColumnasValoresGraficoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpleadoConstante = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpleadoConstante.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelTiposGraficosReportesDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoConstante.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jComboBoxTiposGraficosReportesDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoConstante = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoConstante.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante.setToolTipText("Generar EXCEL"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoConstante.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jComboBoxTiposReportesDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoConstante = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoConstante.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoConstante = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoConstante.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoConstante,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoConstante.setToolTipText("Generar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jButtonGenerarReporteDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoConstante = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoConstante.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoConstante,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoConstante.setToolTipText("Cancelar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoConstante.add(this.jButtonCerrarReporteDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoConstante = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoConstante= new JScrollPane(jPanelReporteDinamicoEmpleadoConstante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoConstante.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoConstante.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoConstante.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Constantes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoConstante.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoConstante.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoConstante.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoConstante);
		this.jInternalFrameReporteDinamicoEmpleadoConstante.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoConstante() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoConstante = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoConstante.setName("jPanelImportacionEmpleadoConstante"); 
		
		this.jPanelImportacionEmpleadoConstante.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoConstante.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoConstante.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoConstante.setLayout(gridaBagLayoutImportacionEmpleadoConstante);
		
		
		this.jInternalFrameImportacionEmpleadoConstante= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoConstante= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoConstante = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoConstante= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoConstante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoConstante.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoConstante.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoConstante.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoConstante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoConstante.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoConstante.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoConstante.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoConstante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoConstante.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoConstante.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoConstante.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoConstante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoConstante.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoConstante.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoConstante.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoConstante.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoConstante.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoConstante.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Constantes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoConstante = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoConstante.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoConstante.add(this.jLabelArchivoImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoConstante = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoConstante.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoConstante = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoConstante.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoConstante,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoConstante.setToolTipText("Generar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoConstante.add(this.jButtonAbrirImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoConstante = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoConstante.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoConstante.add(this.jLabelPathArchivoImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoConstante=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoConstante.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoConstante.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoConstante.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoConstante.add(this.jTextFieldPathArchivoImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoConstante = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoConstante.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoConstante,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoConstante.setToolTipText("Generar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoConstante.add(this.jButtonGenerarImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoConstante = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoConstante.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoConstante,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoConstante.setToolTipText("Cancelar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoConstante.add(this.jButtonCerrarImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoConstante = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoConstante= new JScrollPane(jPanelImportacionEmpleadoConstante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoConstante.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoConstante.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoConstante.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoConstante);
		this.jInternalFrameImportacionEmpleadoConstante.getContentPane().add(this.jScrollPanelImportacionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoConstante(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoConstante = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoConstante.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoConstante.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoConstante,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoConstante";
			inputMap = this.jButtonAbrirOrderByEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoConstante"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoConstante = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoConstante.setName("jPanelOrderByEmpleadoConstante"); 
			
			this.jPanelOrderByEmpleadoConstante.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoConstante.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoConstante.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoConstante.setLayout(gridaBagLayoutOrderByEmpleadoConstante);
			
			
			this.jTableDatosEmpleadoConstanteOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoConstanteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoConstanteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoConstanteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoConstanteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoConstanteOrderBy.setViewportView(this.jTableDatosEmpleadoConstanteOrderBy);
			this.jTableDatosEmpleadoConstanteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoConstanteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoConstante= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoConstante= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoConstante = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoConstante= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoConstante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoConstante.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoConstante.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoConstante.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoConstante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoConstante.setResizable(true);
			this.jInternalFrameOrderByEmpleadoConstante.setClosable(true);
			this.jInternalFrameOrderByEmpleadoConstante.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoConstante.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoConstante.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoConstante.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Constantes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoConstante.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoConstante.ipady =150;
				
			this.jPanelOrderByEmpleadoConstante.add(jScrollPanelDatosEmpleadoConstanteOrderBy, this.gridBagConstraintsEmpleadoConstante);//this.jTableDatosEmpleadoConstanteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoConstante = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoConstante.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoConstante,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoConstante.setToolTipText("Cancelar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoConstante.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoConstante.add(this.jButtonCerrarOrderByEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoConstante = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoConstante= new JScrollPane(jPanelOrderByEmpleadoConstante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoConstante.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoConstante.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoConstante.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoConstante);
			
			this.jInternalFrameOrderByEmpleadoConstante.getContentPane().add(this.jScrollPanelOrderByEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoConstante = new JButtonMe();
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
			&& this.empleadoconstanteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoConstante.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoConstante.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoConstante.getRowHeight();//EmpleadoConstanteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.isSelected()) {
					iHeightTable=EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoConstante.isSelected()) {
					iHeightTable=EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoConstanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoConstante.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoConstante.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoConstante.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoConstante.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoConstante.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoConstante.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoConstante!=null && this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoConstante.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoConstante.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoConstante.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoConstante.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoConstante.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoConstante.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoconstanteLogic.getEmpleadoConstantes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoconstantes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoConstante> TraerEmpleadoConstanteBeans(List<EmpleadoConstante> empleadoconstantes,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoConstante empleadoconstante:empleadoconstantes) {
					
				if(!(EmpleadoConstanteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoConstanteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoconstante.setsDetalleGeneralEntityReporte(EmpleadoConstanteConstantesFunciones.getEmpleadoConstanteDescripcion(empleadoconstante));
										
					empleadoconstante.setesta_activo_descripcion(EmpleadoConstanteConstantesFunciones.getesta_activoDescripcion(empleadoconstante));	
					
						
					
				} else  {
							
					//empleadoconstante.setsDetalleGeneralEntityReporte(empleadoconstante.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoconstantebeans.add(empleadoconstantebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoconstantes;
    }
	//PARA REPORTES FIN
}
