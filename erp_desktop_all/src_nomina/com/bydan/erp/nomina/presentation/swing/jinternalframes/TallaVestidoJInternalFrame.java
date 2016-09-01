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
import com.bydan.erp.nomina.util.TallaVestidoConstantesFunciones;

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
public class TallaVestidoJInternalFrame extends TallaVestidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTallaVestido;
	
	protected JMenuBar jmenuBarTallaVestido;
	
	protected JMenu jmenuTallaVestido;
	protected JMenu jmenuDatosTallaVestido;
	protected JMenu jmenuArchivoTallaVestido;
	protected JMenu jmenuAccionesTallaVestido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTallaVestido;	
	protected GridBagConstraints gridBagConstraintsTallaVestido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TallaVestidoDetalleFormJInternalFrame jInternalFrameDetalleFormTallaVestido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTallaVestido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTallaVestido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected VestimentaBeanSwingJInternalFrame vestimentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vestimenta="";
	
	public TallaVestidoSessionBean tallavestidoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public VestimentaSessionBean vestimentaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TallaVestido> tallavestidos;		
	public List<TallaVestido> tallavestidosEliminados;	
	public List<TallaVestido> tallavestidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTallaVestido;		
	protected JButton jButtonAbrirOrderByTallaVestido;
	
	
	//protected JPanel jPanelOrderByTallaVestido;
	//public JScrollPane jScrollPanelOrderByTallaVestido;	
	//protected JButton jButtonCerrarOrderByTallaVestido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TallaVestidoLogic tallavestidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTallaVestido;
	public JScrollPane jScrollPanelDatosEdicionTallaVestido;
	public JScrollPane jScrollPanelDatosGeneralTallaVestido;
    
	
	
	//public JScrollPane jScrollPanelDatosTallaVestidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTallaVestido;
	//public JScrollPane jScrollPanelImportacionTallaVestido;
	
	
	
	protected JPanel jPanelAccionesTallaVestido;
	
    protected JPanel jPanelPaginacionTallaVestido;
    protected JPanel jPanelParametrosReportesTallaVestido;
	protected JPanel jPanelParametrosReportesAccionesTallaVestido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TallaVestido;
	protected JPanel jPanelParametrosAuxiliar2TallaVestido;
	protected JPanel jPanelParametrosAuxiliar3TallaVestido;
	protected JPanel jPanelParametrosAuxiliar4TallaVestido;
	//protected JPanel jPanelParametrosAuxiliar5TallaVestido;
	
	
	
	//protected JPanel jPanelReporteDinamicoTallaVestido;
	//protected JPanel jPanelImportacionTallaVestido;
	
	
	public JTable jTableDatosTallaVestido;
	
	
	
	//public JTable jTableDatosTallaVestidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTallaVestido;
	protected JButton jButtonDuplicarTallaVestido;
	protected JButton jButtonCopiarTallaVestido;
	protected JButton jButtonVerFormTallaVestido;
	protected JButton jButtonNuevoRelacionesTallaVestido;
	protected JButton jButtonModificarTallaVestido;
	
    protected JButton jButtonGuardarCambiosTablaTallaVestido;
	protected JButton jButtonCerrarTallaVestido;
	
	
	protected JButton jButtonRecargarInformacionTallaVestido;
	protected JButton jButtonProcesarInformacionTallaVestido;
	
	
	protected JButton jButtonAnterioresTallaVestido;
	protected JButton jButtonSiguientesTallaVestido;
	protected JButton jButtonNuevoGuardarCambiosTallaVestido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTallaVestido;
	//protected JButton jButtonCerrarReporteDinamicoTallaVestido;
	//protected JButton jButtonGenerarExcelReporteDinamicoTallaVestido;	
	
	
	
	//protected JButton jButtonAbrirImportacionTallaVestido;
	//protected JButton jButtonGenerarImportacionTallaVestido;
	//protected JButton jButtonCerrarImportacionTallaVestido;
	//protected JFileChooser jFileChooserImportacionTallaVestido;
	//protected File fileImportacionTallaVestido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTallaVestido;
	protected JButton jButtonDuplicarToolBarTallaVestido;
	protected JButton jButtonNuevoRelacionesToolBarTallaVestido;
	
	
	public JButton jButtonGuardarCambiosToolBarTallaVestido;
	protected JButton jButtonCopiarToolBarTallaVestido;
	protected JButton jButtonVerFormToolBarTallaVestido;
	public JButton jButtonGuardarCambiosTablaToolBarTallaVestido;
	protected JButton jButtonMostrarOcultarTablaToolBarTallaVestido;
	protected JButton jButtonCerrarToolBarTallaVestido;
	
	protected JButton jButtonRecargarInformacionToolBarTallaVestido;
	protected JButton jButtonProcesarInformacionToolBarTallaVestido;
	protected JButton jButtonAnterioresToolBarTallaVestido;
	protected JButton jButtonSiguientesToolBarTallaVestido;
	protected JButton jButtonNuevoGuardarCambiosToolBarTallaVestido;
	protected JButton jButtonAbrirOrderByToolBarTallaVestido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTallaVestido;
	protected JMenuItem jMenuItemDuplicarTallaVestido;
	protected JMenuItem jMenuItemNuevoRelacionesTallaVestido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTallaVestido;
	protected JMenuItem jMenuItemCopiarTallaVestido;
	protected JMenuItem jMenuItemVerFormTallaVestido;
	protected JMenuItem jMenuItemGuardarCambiosTablaTallaVestido;
	protected JMenuItem jMenuItemCerrarTallaVestido;
	protected JMenuItem jMenuItemDetalleCerrarTallaVestido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTallaVestido;
	protected JMenuItem jMenuItemDetalleMostarOcultarTallaVestido;
	
	protected JMenuItem jMenuItemRecargarInformacionTallaVestido;
	protected JMenuItem jMenuItemProcesarInformacionTallaVestido;
	protected JMenuItem jMenuItemAnterioresTallaVestido;
	protected JMenuItem jMenuItemSiguientesTallaVestido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTallaVestido;
	protected JMenuItem jMenuItemAbrirOrderByTallaVestido;
	protected JMenuItem jMenuItemMostrarOcultarTallaVestido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTallaVestido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTallaVestido;
	protected JCheckBox jCheckBoxSeleccionadosTallaVestido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTallaVestido;
	protected JCheckBox jCheckBoxConGraficoReporteTallaVestido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTallaVestido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTallaVestido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTallaVestido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTallaVestido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTallaVestido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTallaVestido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTallaVestido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTallaVestido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTallaVestido;
	protected JTextField jTextFieldValorCampoGeneralTallaVestido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTallaVestido;
	//public JList<Reporte> jListColumnasSelectReporteTallaVestido;
	//public JScrollPane jScrollColumnasSelectReporteTallaVestido;
	
	//public JLabel jLabelRelacionesSelectReporteTallaVestido;
	//public JList<Reporte> jListRelacionesSelectReporteTallaVestido;
	//public JScrollPane jScrollRelacionesSelectReporteTallaVestido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTallaVestido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTallaVestido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTallaVestido;
	//public JLabel jLabelTiposArchivoReporteDinamicoTallaVestido;
	
		
	//public JLabel jLabelArchivoImportacionTallaVestido;	
	//public JLabel jLabelPathArchivoImportacionTallaVestido;
	//protected JTextField jTextFieldPathArchivoImportacionTallaVestido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTallaVestido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTallaVestido;
	
	//public JLabel jLabelColumnaCategoriaValorTallaVestido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTallaVestido;
	
	//public JLabel jLabelColumnasValoresGraficoTallaVestido;
	//public JList<Reporte> jListColumnasValoresGraficoTallaVestido;
	//public JScrollPane jScrollColumnasValoresGraficoTallaVestido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTallaVestido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTallaVestido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTallaVestido;
	public JPanel jPanelFK_IdEmpleadoTallaVestido;
	public JButton jButtonFK_IdEmpleadoTallaVestido;
	public JPanel jPanelFK_IdVestimentaTallaVestido;
	public JButton jButtonFK_IdVestimentaTallaVestido;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoTallaVestido;
	public JLabel jLabelid_empleadoFK_IdEmpleadoTallaVestido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoTallaVestido;
	public JButton jButtonid_empleadoFK_IdEmpleadoTallaVestido= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoTallaVestidoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoTallaVestidoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido;
	
	public JPanel jPanelid_vestimentaFK_IdVestimentaTallaVestido;
	public JLabel jLabelid_vestimentaFK_IdVestimentaTallaVestido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vestimentaFK_IdVestimentaTallaVestido;
	public JButton jButtonid_vestimentaFK_IdVestimentaTallaVestido= new JButtonMe();
	public JButton jButtonid_vestimentaFK_IdVestimentaTallaVestidoUpdate= new JButtonMe();
	public JButton jButtonid_vestimentaFK_IdVestimentaTallaVestidoBusqueda= new JButtonMe();

	
	
	
	
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
	public TallaVestidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTallaVestido)	{
		this.jButtonRecargarInformacionTallaVestido = jButtonRecargarInformacionTallaVestido;
	}
	
	public JButton getjButtonProcesarInformacionTallaVestido() {
		return this.jButtonProcesarInformacionTallaVestido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTallaVestido)	{
		this.jButtonProcesarInformacionTallaVestido = jButtonProcesarInformacionTallaVestido;
	}
	
	
	public JButton getjButtonRecargarInformacionTallaVestido() {
		return this.jButtonRecargarInformacionTallaVestido;
	}
	
	
	public List<TallaVestido> gettallavestidos() {
		return this.tallavestidos;
	}

	public void settallavestidos(List<TallaVestido> tallavestidos) {
		this.tallavestidos = tallavestidos;
	}
	
	public List<TallaVestido> gettallavestidosAux() {
		return this.tallavestidosAux;
	}

	public void settallavestidosAux(List<TallaVestido> tallavestidosAux) {
		this.tallavestidosAux = tallavestidosAux;
	}
	
	public List<TallaVestido> gettallavestidosEliminados() {
		return this.tallavestidosEliminados;
	}

	public void setTallaVestidosEliminados(List<TallaVestido> tallavestidosEliminados) {
		this.tallavestidosEliminados = tallavestidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTallaVestido() {
		return jComboBoxTiposSeleccionarTallaVestido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTallaVestido(
			JComboBox jComboBoxTiposSeleccionarTallaVestido) {
		this.jComboBoxTiposSeleccionarTallaVestido = jComboBoxTiposSeleccionarTallaVestido;
	}
	
	public void setBorderResaltarTiposSeleccionarTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTallaVestido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTallaVestido() {
		return jTextFieldValorCampoGeneralTallaVestido;
	}

	public void setjTextFieldValorCampoGeneralTallaVestido(
			JTextField jTextFieldValorCampoGeneralTallaVestido) {
		this.jTextFieldValorCampoGeneralTallaVestido = jTextFieldValorCampoGeneralTallaVestido;
	}

	public void setBorderResaltarValorCampoGeneralTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTallaVestido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTallaVestido() {
		return this.jCheckBoxSeleccionarTodosTallaVestido;
	}

	public void setjCheckBoxSeleccionarTodosTallaVestido(
			JCheckBox jCheckBoxSeleccionarTodosTallaVestido) {
		this.jCheckBoxSeleccionarTodosTallaVestido = jCheckBoxSeleccionarTodosTallaVestido;
	}

	public void setBorderResaltarSeleccionarTodosTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTallaVestido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTallaVestido() {
		return this.jCheckBoxSeleccionadosTallaVestido;
	}

	public void setjCheckBoxSeleccionadosTallaVestido(
			JCheckBox jCheckBoxSeleccionadosTallaVestido) {
		this.jCheckBoxSeleccionadosTallaVestido = jCheckBoxSeleccionadosTallaVestido;
	}
	
	public void setBorderResaltarSeleccionadosTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTallaVestido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTallaVestido() {
		return this.jComboBoxTiposArchivosReportesTallaVestido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTallaVestido(
			JComboBox jComboBoxTiposArchivosReportesTallaVestido) {
		this.jComboBoxTiposArchivosReportesTallaVestido = jComboBoxTiposArchivosReportesTallaVestido;
	}

	public void setBorderResaltarTiposArchivosReportesTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTallaVestido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTallaVestido() {
		return this.jComboBoxTiposReportesTallaVestido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTallaVestido(
			JComboBox jComboBoxTiposReportesTallaVestido) {
		this.jComboBoxTiposReportesTallaVestido = jComboBoxTiposReportesTallaVestido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTallaVestido() {
	//	return jComboBoxTiposReportesDinamicoTallaVestido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTallaVestido(
	//		JComboBox jComboBoxTiposReportesDinamicoTallaVestido) {
	//	this.jComboBoxTiposReportesDinamicoTallaVestido = jComboBoxTiposReportesDinamicoTallaVestido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTallaVestido() {
	//	return jComboBoxTiposArchivosReportesDinamicoTallaVestido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTallaVestido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTallaVestido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTallaVestido = jComboBoxTiposArchivosReportesDinamicoTallaVestido;
	//}
	
	public void setBorderResaltarTiposReportesTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTallaVestido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTallaVestido() {
		return this.jComboBoxTiposGraficosReportesTallaVestido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTallaVestido(
			JComboBox jComboBoxTiposGraficosReportesTallaVestido) {
		this.jComboBoxTiposGraficosReportesTallaVestido = jComboBoxTiposGraficosReportesTallaVestido;
	}
	
	public void setBorderResaltarTiposGraficosReportesTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTallaVestido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTallaVestido() {
		return this.jComboBoxTiposPaginacionTallaVestido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTallaVestido(
			JComboBox jComboBoxTiposPaginacionTallaVestido) {
		this.jComboBoxTiposPaginacionTallaVestido = jComboBoxTiposPaginacionTallaVestido;
	}
	
	public void setBorderResaltarTiposPaginacionTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTallaVestido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTallaVestido() {
		return this.jComboBoxTiposRelacionesTallaVestido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTallaVestido() {
		return this.jComboBoxTiposAccionesTallaVestido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTallaVestido(
			JComboBox jComboBoxTiposRelacionesTallaVestido) {
		this.jComboBoxTiposRelacionesTallaVestido = jComboBoxTiposRelacionesTallaVestido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTallaVestido(
			JComboBox jComboBoxTiposAccionesTallaVestido) {
		this.jComboBoxTiposAccionesTallaVestido = jComboBoxTiposAccionesTallaVestido;
	}
	
	public void setBorderResaltarTiposRelacionesTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTallaVestido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTallaVestido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaVestido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTallaVestido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTallaVestido() {
	//	return jCheckBoxConGraficoDinamicoTallaVestido;
	//}

	//public void setjCheckBoxConGraficoDinamicoTallaVestido(
	//		JCheckBox jCheckBoxConGraficoDinamicoTallaVestido) {
	//	this.jCheckBoxConGraficoDinamicoTallaVestido = jCheckBoxConGraficoDinamicoTallaVestido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTallaVestido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTallaVestido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTallaVestido .setBorder(borderResaltar);		
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
		this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		
		this.tallavestidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tallavestidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tallavestidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TallaVestidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Talla Vestido MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
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
		
		TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTallaVestido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"nuevo","nuevo","Nuevo"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"duplicar","duplicar","Duplicar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"copiar","copiar","Copiar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"ver_form","ver_form","Ver"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"recargar","recargar","Recargar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTallaVestido,this.jTtoolBarTallaVestido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTallaVestido,this.jTtoolBarTallaVestido,
							"cerrar","cerrar","Salir"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTallaVestido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTallaVestido;
			
				this.jButtonProcesarInformacionToolBarTallaVestido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTallaVestido;
				
		//protected JButton jButtonModificarToolBarTallaVestido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTallaVestido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTallaVestido=new JMenuMe("General");
		this.jmenuArchivoTallaVestido=new JMenuMe("Archivo");
		this.jmenuAccionesTallaVestido=new JMenuMe("Acciones");
		this.jmenuDatosTallaVestido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTallaVestido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTallaVestido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTallaVestido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTallaVestido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTallaVestido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTallaVestido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTallaVestido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTallaVestido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTallaVestido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTallaVestido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTallaVestido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTallaVestido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTallaVestido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTallaVestido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTallaVestido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTallaVestido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTallaVestido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTallaVestido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTallaVestido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTallaVestido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTallaVestido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTallaVestido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTallaVestido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTallaVestido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTallaVestido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTallaVestido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTallaVestido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTallaVestido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTallaVestido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTallaVestido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTallaVestido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTallaVestido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTallaVestido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTallaVestido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTallaVestido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTallaVestido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTallaVestido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTallaVestido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTallaVestido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTallaVestido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTallaVestido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTallaVestido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTallaVestido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTallaVestido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTallaVestido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTallaVestido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTallaVestido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTallaVestido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTallaVestido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTallaVestido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTallaVestido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTallaVestido.add(this.jMenuItemCerrarTallaVestido);
			
			this.jmenuAccionesTallaVestido.add(this.jMenuItemNuevoTallaVestido);
			this.jmenuAccionesTallaVestido.add(this.jMenuItemNuevoGuardarCambiosTallaVestido);
			this.jmenuAccionesTallaVestido.add(this.jMenuItemNuevoRelacionesTallaVestido);
			this.jmenuAccionesTallaVestido.add(this.jMenuItemGuardarCambiosTablaTallaVestido);		
			this.jmenuAccionesTallaVestido.add(this.jMenuItemDuplicarTallaVestido);		
			this.jmenuAccionesTallaVestido.add(this.jMenuItemCopiarTallaVestido);		
			this.jmenuAccionesTallaVestido.add(this.jMenuItemVerFormTallaVestido);		
			
			this.jmenuDatosTallaVestido.add(this.jMenuItemRecargarInformacionTallaVestido);				
			this.jmenuDatosTallaVestido.add(this.jMenuItemAnterioresTallaVestido);				
			this.jmenuDatosTallaVestido.add(this.jMenuItemSiguientesTallaVestido);				
			this.jmenuDatosTallaVestido.add(this.jMenuItemAbrirOrderByTallaVestido);				
			this.jmenuDatosTallaVestido.add(this.jMenuItemMostrarOcultarTallaVestido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTallaVestido.add(this.jMenuItemGuardarCambiosTallaVestido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTallaVestido.add(this.jmenuArchivoTallaVestido);		
			this.jmenuBarTallaVestido.add(this.jmenuAccionesTallaVestido);		
			this.jmenuBarTallaVestido.add(this.jmenuDatosTallaVestido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTallaVestido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTallaVestido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoTallaVestido.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoTallaVestido= new JButtonMe();
		this.jButtonFK_IdEmpleadoTallaVestido.setText("Buscar");
		this.jButtonFK_IdEmpleadoTallaVestido.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoTallaVestido,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoTallaVestido = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoTallaVestido.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoTallaVestido.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoTallaVestido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoTallaVestido= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoTallaVestido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.setFocusable(false);

		this.jPanelFK_IdVestimentaTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVestimentaTallaVestido.setToolTipText("Buscar Por Vestimenta ");
		this.jButtonFK_IdVestimentaTallaVestido= new JButtonMe();
		this.jButtonFK_IdVestimentaTallaVestido.setText("Buscar");
		this.jButtonFK_IdVestimentaTallaVestido.setToolTipText("Buscar Por Vestimenta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVestimentaTallaVestido,"buscar_button","Buscar Por Vestimenta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVestimentaTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vestimentaFK_IdVestimentaTallaVestido = new JLabelMe();
		jLabelid_vestimentaFK_IdVestimentaTallaVestido.setText("Vestimenta :");
		jLabelid_vestimentaFK_IdVestimentaTallaVestido.setToolTipText("Vestimenta");
		jLabelid_vestimentaFK_IdVestimentaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vestimentaFK_IdVestimentaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vestimentaFK_IdVestimentaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vestimentaFK_IdVestimentaTallaVestido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vestimentaFK_IdVestimentaTallaVestido= new JComboBoxMe();
		jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vestimentaFK_IdVestimentaTallaVestido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTallaVestido=new JTabbedPane();


		this.jTabbedPaneBusquedasTallaVestido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTallaVestido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTallaVestido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTallaVestido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTallaVestido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTallaVestido = new TallaVestidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Talla Vestido DATOS");
			this.jInternalFrameDetalleFormTallaVestido = new TallaVestidoDetalleFormJInternalFrame(jDesktopPane,this.tallavestidoSessionBean.getConGuardarRelaciones(),this.tallavestidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTallaVestido = null;//new TallaVestidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTallaVestido= new GridBagLayout();
		
		
		this.jTableDatosTallaVestido = new JTableMe();      
		
		String sToolTipTallaVestido="";
		sToolTipTallaVestido=TallaVestidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTallaVestido+="(Nomina.TallaVestido)";
		}
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTallaVestido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTallaVestido.setToolTipText(sToolTipTallaVestido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTallaVestido);
		this.jTableDatosTallaVestido.setAutoCreateRowSorter(true);
		this.jTableDatosTallaVestido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTallaVestido.setRowSelectionAllowed(true);
		this.jTableDatosTallaVestido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTallaVestido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTallaVestido = new JButtonMe();
		this.jButtonDuplicarTallaVestido = new JButtonMe();
		this.jButtonCopiarTallaVestido = new JButtonMe();
		this.jButtonVerFormTallaVestido = new JButtonMe();
		this.jButtonNuevoRelacionesTallaVestido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTallaVestido = new JButtonMe();
		this.jButtonCerrarTallaVestido = new JButtonMe();
		
		this.jScrollPanelDatosTallaVestido = new JScrollPane();   
        this.jScrollPanelDatosGeneralTallaVestido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Talla Vestido";
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Vestidos" + this.sPath));
		} else {
			this.jScrollPanelDatosTallaVestido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTallaVestido.setToolTipText("Acciones");
        this.jPanelAccionesTallaVestido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTallaVestido=new ReporteDinamicoJInternalFrame(TallaVestidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTallaVestido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTallaVestido=new ImportacionJInternalFrame(TallaVestidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTallaVestido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTallaVestido = new JButtonMe();
		
		this.jButtonAbrirOrderByTallaVestido.setText("Orden");
		this.jButtonAbrirOrderByTallaVestido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTallaVestido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTallaVestido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaVestido,false,this);
			
			//this.cargarOrderByTallaVestido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTallaVestido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaVestido,true,this);
			
			//this.cargarOrderByTallaVestido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTallaVestido.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosTallaVestido.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosTallaVestido.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosTallaVestido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTallaVestido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTallaVestido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTallaVestido.setText("Nuevo");
		this.jButtonDuplicarTallaVestido.setText("Duplicar");
		this.jButtonCopiarTallaVestido.setText("Copiar");
		this.jButtonVerFormTallaVestido.setText("Ver");
		this.jButtonNuevoRelacionesTallaVestido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTallaVestido.setText("Guardar");
		this.jButtonCerrarTallaVestido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTallaVestido,"nuevo_button","Nuevo",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTallaVestido,"duplicar_button","Duplicar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTallaVestido,"copiar_button","Copiar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTallaVestido,"ver_form","Ver",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTallaVestido,"nuevorelaciones_button","Nuevo Rel",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTallaVestido,"guardarcambiostabla_button","Guardar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTallaVestido,"cerrar_button","Salir",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTallaVestido.setToolTipText("Nuevo"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTallaVestido.setToolTipText("Duplicar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTallaVestido.setToolTipText("Copiar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTallaVestido.setToolTipText("Ver"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTallaVestido.setToolTipText("Nuevo Rel"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTallaVestido.setToolTipText("Guardar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTallaVestido.setToolTipText("Salir"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTallaVestido";
		inputMap = this.jButtonNuevoTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTallaVestido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTallaVestido"));
		
		//DUPLICAR
		sMapKey = "DuplicarTallaVestido";
		inputMap = this.jButtonDuplicarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTallaVestido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTallaVestido"));
		
		//COPIAR
		sMapKey = "CopiarTallaVestido";
		inputMap = this.jButtonCopiarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTallaVestido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTallaVestido"));
		
		//VEr FORM
		sMapKey = "VerFormTallaVestido";
		inputMap = this.jButtonVerFormTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTallaVestido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTallaVestido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTallaVestido";
		inputMap = this.jButtonNuevoRelacionesTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTallaVestido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTallaVestido";
		inputMap = this.jButtonModificarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTallaVestido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTallaVestido";
		inputMap = this.jButtonCerrarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTallaVestido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTallaVestido";
		inputMap = this.jButtonGuardarCambiosTablaTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTallaVestido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TallaVestido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TallaVestido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TallaVestido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TallaVestido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TallaVestido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTallaVestido.setName("jPanelParametrosReportesTallaVestido"); 
		
		this.jPanelParametrosReportesAccionesTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTallaVestido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTallaVestido.setName("jPanelParametrosReportesAccionesTallaVestido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTallaVestido = new JButtonMe();
		this.jButtonRecargarInformacionTallaVestido.setText("Recargar");
		this.jButtonRecargarInformacionTallaVestido.setToolTipText("Recargar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTallaVestido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTallaVestido = new JButtonMe();
		this.jButtonProcesarInformacionTallaVestido.setText("Procesar");
		this.jButtonProcesarInformacionTallaVestido.setToolTipText("Procesar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTallaVestido.setVisible(false);
			
		this.jButtonProcesarInformacionTallaVestido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTallaVestido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTallaVestido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTallaVestido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTallaVestido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTallaVestido.setText("TIPO");       
		this.jComboBoxTiposReportesTallaVestido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTallaVestido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTallaVestido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTallaVestido.setText("Paginacion");
		this.jComboBoxTiposPaginacionTallaVestido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTallaVestido.setText("Accion");
		this.jComboBoxTiposRelacionesTallaVestido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTallaVestido.setText("Accion");
		this.jComboBoxTiposAccionesTallaVestido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTallaVestido.setText("Accion");
		this.jComboBoxTiposSeleccionarTallaVestido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTallaVestido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTallaVestido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTallaVestido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTallaVestido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTallaVestido = new JLabelMe();
		
		this.jLabelAccionesTallaVestido.setText("Acciones");		
		this.jLabelAccionesTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTallaVestido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTallaVestido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTallaVestido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTallaVestido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTallaVestido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTallaVestido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTallaVestido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTallaVestido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTallaVestido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTallaVestido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTallaVestido.setText("Graf.");
		this.jCheckBoxConGraficoReporteTallaVestido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTallaVestido = new JButtonMe();
		//this.jButtonAnterioresTallaVestido.setText("<<");
        this.jButtonAnterioresTallaVestido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTallaVestido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTallaVestido = new JButtonMe();
		//this.jButtonSiguientesTallaVestido.setText(">>");
        this.jButtonSiguientesTallaVestido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTallaVestido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTallaVestido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTallaVestido.setText("Nue");
        this.jButtonNuevoGuardarCambiosTallaVestido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTallaVestido,"nuevoguardarcambios_button","Nue",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTallaVestido";
		inputMap = this.jButtonNuevoGuardarCambiosTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTallaVestido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTallaVestido";
		inputMap = this.jButtonRecargarInformacionTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTallaVestido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTallaVestido";
		inputMap = this.jButtonSiguientesTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTallaVestido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTallaVestido";
		inputMap = this.jButtonAnterioresTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTallaVestido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTallaVestido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTallaVestido.setMinimumSize(new Dimension(this.getWidth(),TallaVestidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TallaVestidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTallaVestido.setMaximumSize(new Dimension(this.getWidth(),TallaVestidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TallaVestidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTallaVestido.setPreferredSize(new Dimension(this.getWidth(),TallaVestidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TallaVestidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTallaVestido = new GridBagLayout();

			this.jPanelPaginacionTallaVestido.setLayout(gridaBagLayoutPaginacionTallaVestido);						
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 0;
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTallaVestido.add(this.jButtonAnterioresTallaVestido, this.gridBagConstraintsTallaVestido);
					
						
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTallaVestido.gridy = 0;
			
			this.jPanelPaginacionTallaVestido.add(this.jButtonNuevoGuardarCambiosTallaVestido, this.gridBagConstraintsTallaVestido);
						
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTallaVestido.gridy = 0;
			this.jPanelPaginacionTallaVestido.add(this.jButtonSiguientesTallaVestido, this.gridBagConstraintsTallaVestido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 1;
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaVestido.add(this.jButtonNuevoTallaVestido, this.gridBagConstraintsTallaVestido);
						
			
			
			if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTallaVestido = new GridBagConstraints();
				this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTallaVestido.gridy = 1;
				this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTallaVestido.add(this.jButtonGuardarCambiosTablaTallaVestido, this.gridBagConstraintsTallaVestido);
			}
			
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 1;
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaVestido.add(this.jButtonDuplicarTallaVestido, this.gridBagConstraintsTallaVestido);
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 1;
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaVestido.add(this.jButtonCopiarTallaVestido, this.gridBagConstraintsTallaVestido);
		
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 1;
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaVestido.add(this.jButtonVerFormTallaVestido, this.gridBagConstraintsTallaVestido);
		
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 1;
			this.gridBagConstraintsTallaVestido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTallaVestido.add(this.jButtonCerrarTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		
		this.jButtonRecargarInformacionTallaVestido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTallaVestido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTallaVestido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTallaVestido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTallaVestido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTallaVestido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTallaVestido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTallaVestido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTallaVestido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTallaVestido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTallaVestido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTallaVestido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTallaVestido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTallaVestido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTallaVestido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTallaVestido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTallaVestido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTallaVestido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTallaVestido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaVestido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaVestido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTallaVestido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTallaVestido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTallaVestido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTallaVestido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTallaVestido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTallaVestido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTallaVestido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTallaVestido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTallaVestido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTallaVestido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTallaVestido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTallaVestido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTallaVestido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTallaVestido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTallaVestido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTallaVestido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTallaVestido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TallaVestido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TallaVestido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TallaVestido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TallaVestido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTallaVestido.setLayout(gridaBagParametrosReportesTallaVestido);
			this.jPanelParametrosReportesAccionesTallaVestido.setLayout(gridaBagParametrosReportesAccionesTallaVestido);
			
			
			this.jPanelParametrosAuxiliar1TallaVestido.setLayout(gridaBagParametrosAuxiliar1TallaVestido);
			this.jPanelParametrosAuxiliar2TallaVestido.setLayout(gridaBagParametrosAuxiliar2TallaVestido);
			this.jPanelParametrosAuxiliar3TallaVestido.setLayout(gridaBagParametrosAuxiliar3TallaVestido);
			this.jPanelParametrosAuxiliar4TallaVestido.setLayout(gridaBagParametrosAuxiliar4TallaVestido);
			//this.jPanelParametrosAuxiliar5TallaVestido.setLayout(gridaBagParametrosAuxiliar2TallaVestido);			
			
			
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaVestido.add(this.jButtonRecargarInformacionTallaVestido, this.gridBagConstraintsTallaVestido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TallaVestido.add(this.jComboBoxTiposPaginacionTallaVestido, this.gridBagConstraintsTallaVestido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TallaVestido.add(this.jCheckBoxConAltoMaximoTablaTallaVestido, this.gridBagConstraintsTallaVestido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TallaVestido.add(this.jComboBoxTiposArchivosReportesTallaVestido, this.gridBagConstraintsTallaVestido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaVestido.add(this.jPanelParametrosAuxiliar1TallaVestido, this.gridBagConstraintsTallaVestido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TallaVestido.add(this.jComboBoxTiposReportesTallaVestido, this.gridBagConstraintsTallaVestido);																		
			
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TallaVestido.add(this.jComboBoxTiposGraficosReportesTallaVestido, this.gridBagConstraintsTallaVestido);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaVestido.add(this.jPanelParametrosAuxiliar4TallaVestido, this.gridBagConstraintsTallaVestido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaVestido.add(this.jComboBoxTiposReportesTallaVestido, this.gridBagConstraintsTallaVestido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaVestido.add(this.jCheckBoxGenerarReporteTallaVestido, this.gridBagConstraintsTallaVestido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaVestido.add(this.jPanelParametrosAuxiliar2TallaVestido, this.gridBagConstraintsTallaVestido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaVestido.add(this.jLabelAccionesTallaVestido, this.gridBagConstraintsTallaVestido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTallaVestido = new GridBagConstraints();
				this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTallaVestido.add(this.jButtonAbrirOrderByTallaVestido, this.gridBagConstraintsTallaVestido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaVestido.add(this.jComboBoxTiposSeleccionarTallaVestido, this.gridBagConstraintsTallaVestido);			
			
			
			/*
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaVestido.add(this.jCheckBoxSeleccionarTodosTallaVestido, this.gridBagConstraintsTallaVestido);
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaVestido.add(this.jCheckBoxConGraficoReporteTallaVestido, this.gridBagConstraintsTallaVestido);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TallaVestido.add(this.jCheckBoxSeleccionarTodosTallaVestido, this.gridBagConstraintsTallaVestido);															
				
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TallaVestido.add(this.jCheckBoxSeleccionadosTallaVestido, this.gridBagConstraintsTallaVestido);															
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaVestido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TallaVestido.add(this.jCheckBoxConGraficoReporteTallaVestido, this.gridBagConstraintsTallaVestido);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaVestido.add(this.jPanelParametrosAuxiliar3TallaVestido, this.gridBagConstraintsTallaVestido);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaVestido.add(this.jComboBoxTiposAccionesTallaVestido, this.gridBagConstraintsTallaVestido);
	
				
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaVestido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaVestido.add(this.jTextFieldValorCampoGeneralTallaVestido, this.gridBagConstraintsTallaVestido);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTallaVestido = new GridBagLayout();

			this.jScrollPanelDatosTallaVestido.setLayout(gridaBagLayoutDatosTallaVestido);
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = 0;
			this.gridBagConstraintsTallaVestido.gridx = 0;
			
			this.jScrollPanelDatosTallaVestido.add(this.jTableDatosTallaVestido, this.gridBagConstraintsTallaVestido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTallaVestido.setViewportView(this.jTableDatosTallaVestido);
		this.jTableDatosTallaVestido.setFillsViewportHeight(true);
		this.jTableDatosTallaVestido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTallaVestido= new GridBagLayout();
		this.jPanelAccionesTallaVestido.setLayout(gridaBagLayoutAccionesTallaVestido);
		
		
		/*	
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 0;
			
		this.jPanelAccionesTallaVestido.add(this.jButtonNuevoTallaVestido, this.gridBagConstraintsTallaVestido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoTallaVestido= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoTallaVestido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoTallaVestido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoTallaVestido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoTallaVestido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoTallaVestido.setLayout(gridaBagLayoutFK_IdEmpleadoTallaVestido);

		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaVestido.gridy = 0;
		gridBagConstraintsTallaVestido.gridx = 0;
		jPanelFK_IdEmpleadoTallaVestido.add(jLabelid_empleadoFK_IdEmpleadoTallaVestido, gridBagConstraintsTallaVestido);

		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaVestido.gridy = 0;
		gridBagConstraintsTallaVestido.gridx = 1;
		jPanelFK_IdEmpleadoTallaVestido.add(jComboBoxid_empleadoFK_IdEmpleadoTallaVestido, gridBagConstraintsTallaVestido);


		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
		gridBagConstraintsTallaVestido.gridy = 0;
		gridBagConstraintsTallaVestido.gridx = 0;
		jPanelFK_IdEmpleadoTallaVestido.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido, gridBagConstraintsTallaVestido);

		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaVestido.gridy = 1;
		gridBagConstraintsTallaVestido.gridx =1;
		jPanelFK_IdEmpleadoTallaVestido.add(jButtonFK_IdEmpleadoTallaVestido, gridBagConstraintsTallaVestido);

		jTabbedPaneBusquedasTallaVestido.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoTallaVestido);
		jTabbedPaneBusquedasTallaVestido.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdVestimentaTallaVestido= new GridBagLayout();
		gridaBagLayoutFK_IdVestimentaTallaVestido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVestimentaTallaVestido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVestimentaTallaVestido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVestimentaTallaVestido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVestimentaTallaVestido.setLayout(gridaBagLayoutFK_IdVestimentaTallaVestido);

		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaVestido.gridy = 0;
		gridBagConstraintsTallaVestido.gridx = 0;
		jPanelFK_IdVestimentaTallaVestido.add(jLabelid_vestimentaFK_IdVestimentaTallaVestido, gridBagConstraintsTallaVestido);

		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaVestido.gridy = 0;
		gridBagConstraintsTallaVestido.gridx = 1;
		jPanelFK_IdVestimentaTallaVestido.add(jComboBoxid_vestimentaFK_IdVestimentaTallaVestido, gridBagConstraintsTallaVestido);

		gridBagConstraintsTallaVestido = new GridBagConstraints();
		gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaVestido.gridy = 1;
		gridBagConstraintsTallaVestido.gridx =1;
		jPanelFK_IdVestimentaTallaVestido.add(jButtonFK_IdVestimentaTallaVestido, gridBagConstraintsTallaVestido);

		jTabbedPaneBusquedasTallaVestido.addTab("2.-Por Vestimenta ", jPanelFK_IdVestimentaTallaVestido);
		jTabbedPaneBusquedasTallaVestido.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTallaVestido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTallaVestido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();						
			this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTallaVestido.gridx = 0;		
			//this.gridBagConstraintsTallaVestido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTallaVestido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTallaVestido, this.gridBagConstraintsTallaVestido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTallaVestido.gridx = 0;		
		//this.gridBagConstraintsTallaVestido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTallaVestido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTallaVestido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTallaVestido.gridx = 0;		
			this.gridBagConstraintsTallaVestido.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTallaVestido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTallaVestido, this.gridBagConstraintsTallaVestido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTallaVestido, this.gridBagConstraintsTallaVestido);								
		
		
		/*
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTallaVestido, this.gridBagConstraintsTallaVestido);
		*/		
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTallaVestido.gridx =0;
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTallaVestido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTallaVestido, this.gridBagConstraintsTallaVestido);
				
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTallaVestido, this.gridBagConstraintsTallaVestido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTallaVestido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTallaVestido = new GridBagLayout();
			this.jPanelBusquedasParametrosTallaVestido.setLayout(gridaBagLayoutBusquedasParametrosTallaVestido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTallaVestido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTallaVestido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaVestido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaVestido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTallaVestido, this.gridBagConstraintsTallaVestido);
			
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTallaVestido, this.gridBagConstraintsTallaVestido);
		
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTallaVestido, this.gridBagConstraintsTallaVestido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTallaVestido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTallaVestido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTallaVestido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTallaVestido.setName("jPanelReporteDinamicoTallaVestido"); 
		
		this.jPanelReporteDinamicoTallaVestido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTallaVestido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTallaVestido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTallaVestido.setLayout(gridaBagLayoutReporteDinamicoTallaVestido);
		
		
		this.jInternalFrameReporteDinamicoTallaVestido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTallaVestido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTallaVestido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTallaVestido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTallaVestido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTallaVestido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTallaVestido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTallaVestido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTallaVestido.setResizable(true);
	    this.jInternalFrameReporteDinamicoTallaVestido.setClosable(true);
	    this.jInternalFrameReporteDinamicoTallaVestido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTallaVestido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTallaVestido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTallaVestido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Vestidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTallaVestido = new JLabelMe();

		this.jLabelColumnasSelectReporteTallaVestido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelColumnasSelectReporteTallaVestido, this.gridBagConstraintsTallaVestido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTallaVestido = new JList<Reporte>();
		this.jListColumnasSelectReporteTallaVestido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTallaVestido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTallaVestido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTallaVestido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTallaVestido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTallaVestido=new JScrollPane(this.jListColumnasSelectReporteTallaVestido);
			
			this.jScrollColumnasSelectReporteTallaVestido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTallaVestido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTallaVestido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTallaVestido.add(this.jListColumnasSelectReporteTallaVestido, this.gridBagConstraintsTallaVestido);
		this.jPanelReporteDinamicoTallaVestido.add(this.jScrollColumnasSelectReporteTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTallaVestido = new JLabelMe();

		this.jLabelRelacionesSelectReporteTallaVestido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTallaVestido = new JList<Reporte>();
		this.jListRelacionesSelectReporteTallaVestido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTallaVestido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTallaVestido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTallaVestido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTallaVestido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTallaVestido=new JScrollPane(this.jListRelacionesSelectReporteTallaVestido);
			
			this.jScrollRelacionesSelectReporteTallaVestido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTallaVestido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTallaVestido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTallaVestido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTallaVestido = new JComboBoxMe();
		this.jListColumnasValoresGraficoTallaVestido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTallaVestido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTallaVestido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTallaVestido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTallaVestido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTallaVestido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTallaVestido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTallaVestido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTallaVestido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTallaVestido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTallaVestido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTallaVestido = new JLabelMe();

		this.jLabelConGraficoDinamicoTallaVestido.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelConGraficoDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTallaVestido = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTallaVestido.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTallaVestido.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTallaVestido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTallaVestido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTallaVestido.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jCheckBoxConGraficoDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTallaVestido = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTallaVestido.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelColumnaCategoriaGraficoTallaVestido, this.gridBagConstraintsTallaVestido);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTallaVestido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTallaVestido.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTallaVestido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTallaVestido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTallaVestido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTallaVestido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTallaVestido.add(this.jComboBoxColumnaCategoriaGraficoTallaVestido, this.gridBagConstraintsTallaVestido);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTallaVestido = new JLabelMe();

		this.jLabelColumnaCategoriaValorTallaVestido.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelColumnaCategoriaValorTallaVestido, this.gridBagConstraintsTallaVestido);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTallaVestido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTallaVestido.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTallaVestido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTallaVestido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTallaVestido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTallaVestido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTallaVestido.add(this.jComboBoxColumnaCategoriaValorTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTallaVestido = new JLabelMe();

		this.jLabelColumnasValoresGraficoTallaVestido.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelColumnasValoresGraficoTallaVestido, this.gridBagConstraintsTallaVestido);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTallaVestido = new JList<Reporte>();
		this.jListColumnasValoresGraficoTallaVestido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTallaVestido.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTallaVestido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTallaVestido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTallaVestido.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTallaVestido=new JScrollPane(this.jListColumnasValoresGraficoTallaVestido);
			
			this.jScrollColumnasValoresGraficoTallaVestido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTallaVestido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTallaVestido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTallaVestido.add(this.jListColumnasSelectReporteTallaVestido, this.gridBagConstraintsTallaVestido);
		this.jPanelReporteDinamicoTallaVestido.add(this.jScrollColumnasValoresGraficoTallaVestido, this.gridBagConstraintsTallaVestido);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTallaVestido = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTallaVestido.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelTiposGraficosReportesDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTallaVestido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTallaVestido.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTallaVestido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTallaVestido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTallaVestido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTallaVestido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jComboBoxTiposGraficosReportesDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTallaVestido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTallaVestido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelGenerarExcelReporteDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTallaVestido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTallaVestido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTallaVestido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTallaVestido.setToolTipText("Generar EXCEL"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTallaVestido.add(this.jButtonGenerarExcelReporteDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaVestido.add(this.jComboBoxTiposReportesDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTallaVestido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTallaVestido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaVestido.add(this.jLabelTiposArchivoReporteDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaVestido.add(this.jComboBoxTiposArchivosReportesDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTallaVestido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTallaVestido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTallaVestido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTallaVestido.setToolTipText("Generar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaVestido.add(this.jButtonGenerarReporteDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTallaVestido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTallaVestido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTallaVestido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTallaVestido.setToolTipText("Cancelar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaVestido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaVestido.add(this.jButtonCerrarReporteDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTallaVestido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTallaVestido= new JScrollPane(jPanelReporteDinamicoTallaVestido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTallaVestido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTallaVestido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTallaVestido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Vestidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTallaVestido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTallaVestido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTallaVestido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTallaVestido);
		this.jInternalFrameReporteDinamicoTallaVestido.getContentPane().add(this.jScrollPanelReporteDinamicoTallaVestido, this.gridBagConstraintsTallaVestido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTallaVestido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTallaVestido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTallaVestido.setName("jPanelImportacionTallaVestido"); 
		
		this.jPanelImportacionTallaVestido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTallaVestido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTallaVestido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTallaVestido.setLayout(gridaBagLayoutImportacionTallaVestido);
		
		
		this.jInternalFrameImportacionTallaVestido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTallaVestido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTallaVestido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTallaVestido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTallaVestido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTallaVestido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTallaVestido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTallaVestido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTallaVestido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTallaVestido.setResizable(true);
	    this.jInternalFrameImportacionTallaVestido.setClosable(true);
	    this.jInternalFrameImportacionTallaVestido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTallaVestido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTallaVestido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTallaVestido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTallaVestido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTallaVestido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTallaVestido.setResizable(true);
	    this.jInternalFrameImportacionTallaVestido.setClosable(true);
	    this.jInternalFrameImportacionTallaVestido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTallaVestido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTallaVestido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTallaVestido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Vestidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTallaVestido = new JLabelMe();

		this.jLabelArchivoImportacionTallaVestido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYImportacion;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTallaVestido.add(this.jLabelArchivoImportacionTallaVestido, this.gridBagConstraintsTallaVestido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTallaVestido = new JFileChooser();		
		this.jFileChooserImportacionTallaVestido.setToolTipText("ESCOGER ARCHIVO"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTallaVestido = new JButtonMe();
		this.jButtonAbrirImportacionTallaVestido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTallaVestido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTallaVestido.setToolTipText("Generar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaVestido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaVestido.add(this.jButtonAbrirImportacionTallaVestido, this.gridBagConstraintsTallaVestido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTallaVestido = new JLabelMe();

		this.jLabelPathArchivoImportacionTallaVestido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYImportacion;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTallaVestido.add(this.jLabelPathArchivoImportacionTallaVestido, this.gridBagConstraintsTallaVestido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTallaVestido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTallaVestido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTallaVestido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTallaVestido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaVestido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaVestido.add(this.jTextFieldPathArchivoImportacionTallaVestido, this.gridBagConstraintsTallaVestido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTallaVestido = new JButtonMe();
		this.jButtonGenerarImportacionTallaVestido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTallaVestido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTallaVestido.setToolTipText("Generar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaVestido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaVestido.add(this.jButtonGenerarImportacionTallaVestido, this.gridBagConstraintsTallaVestido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTallaVestido = new JButtonMe();
		this.jButtonCerrarImportacionTallaVestido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTallaVestido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTallaVestido.setToolTipText("Cancelar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaVestido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaVestido.add(this.jButtonCerrarImportacionTallaVestido, this.gridBagConstraintsTallaVestido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTallaVestido = new GridBagLayout();
		
		this.jScrollPanelImportacionTallaVestido= new JScrollPane(jPanelImportacionTallaVestido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy =iPosYImportacion;
		this.gridBagConstraintsTallaVestido.gridx =iPosXImportacion;
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTallaVestido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTallaVestido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTallaVestido);
		this.jInternalFrameImportacionTallaVestido.getContentPane().add(this.jScrollPanelImportacionTallaVestido, this.gridBagConstraintsTallaVestido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTallaVestido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTallaVestido = new JButtonMe();
			this.jButtonAbrirOrderByTallaVestido.setText("Orden");
			this.jButtonAbrirOrderByTallaVestido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTallaVestido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTallaVestido";
			inputMap = this.jButtonAbrirOrderByTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTallaVestido"));
		
		
			GridBagLayout gridaBagLayoutOrderByTallaVestido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTallaVestido.setName("jPanelOrderByTallaVestido"); 
			
			this.jPanelOrderByTallaVestido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTallaVestido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTallaVestido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTallaVestido.setLayout(gridaBagLayoutOrderByTallaVestido);
			
			
			this.jTableDatosTallaVestidoOrderBy = new JTableMe();        
			this.jTableDatosTallaVestidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTallaVestidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTallaVestidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTallaVestidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTallaVestidoOrderBy.setViewportView(this.jTableDatosTallaVestidoOrderBy);
			this.jTableDatosTallaVestidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTallaVestidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTallaVestido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTallaVestido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTallaVestido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTallaVestido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTallaVestido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTallaVestido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTallaVestido.setTitle("Orden");
			this.jInternalFrameOrderByTallaVestido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTallaVestido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTallaVestido.setResizable(true);
			this.jInternalFrameOrderByTallaVestido.setClosable(true);
			this.jInternalFrameOrderByTallaVestido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTallaVestido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTallaVestido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTallaVestido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Vestidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTallaVestido.gridx =iPosXOrderBy;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTallaVestido.ipady =150;
				
			this.jPanelOrderByTallaVestido.add(jScrollPanelDatosTallaVestidoOrderBy, this.gridBagConstraintsTallaVestido);//this.jTableDatosTallaVestidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTallaVestido = new JButtonMe();
			this.jButtonCerrarOrderByTallaVestido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTallaVestido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTallaVestido.setToolTipText("Cancelar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTallaVestido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTallaVestido.add(this.jButtonCerrarOrderByTallaVestido, this.gridBagConstraintsTallaVestido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTallaVestido = new GridBagLayout();
			
			this.jScrollPanelOrderByTallaVestido= new JScrollPane(jPanelOrderByTallaVestido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy =iPosYOrderBy;
			this.gridBagConstraintsTallaVestido.gridx =iPosXOrderBy;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTallaVestido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTallaVestido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTallaVestido);
			
			this.jInternalFrameOrderByTallaVestido.getContentPane().add(this.jScrollPanelOrderByTallaVestido, this.gridBagConstraintsTallaVestido);			
		
		} else {
			this.jButtonAbrirOrderByTallaVestido = new JButtonMe();
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
			&& this.tallavestidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTallaVestido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTallaVestido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTallaVestido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTallaVestido.getRowHeight();//TallaVestidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TallaVestidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTallaVestido.isSelected()) {
					iHeightTable=TallaVestidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TallaVestidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TallaVestidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TallaVestidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTallaVestido.isSelected()) {
					iHeightTable=TallaVestidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TallaVestidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TallaVestidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTallaVestido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTallaVestido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTallaVestido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTallaVestido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTallaVestido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTallaVestido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTallaVestido!=null && this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy()!=null) {
			//if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTallaVestido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTallaVestido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTallaVestido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTallaVestido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTallaVestido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTallaVestido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tallavestidoLogic.getTallaVestidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tallavestidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TallaVestido> TraerTallaVestidoBeans(List<TallaVestido> tallavestidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TallaVestido tallavestido:tallavestidos) {
					
				if(!(TallaVestidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TallaVestidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tallavestido.setsDetalleGeneralEntityReporte(TallaVestidoConstantesFunciones.getTallaVestidoDescripcion(tallavestido));
										
						
					
						
					
				} else  {
							
					//tallavestido.setsDetalleGeneralEntityReporte(tallavestido.getsDetalleGeneralEntityReporte());
										
				}
				
				//tallavestidobeans.add(tallavestidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tallavestidos;
    }
	//PARA REPORTES FIN
}
