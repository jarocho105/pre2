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
import com.bydan.erp.nomina.util.FuncionEstrucConstantesFunciones;

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
public class FuncionEstrucJInternalFrame extends FuncionEstrucBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFuncionEstruc;
	
	protected JMenuBar jmenuBarFuncionEstruc;
	
	protected JMenu jmenuFuncionEstruc;
	protected JMenu jmenuDatosFuncionEstruc;
	protected JMenu jmenuArchivoFuncionEstruc;
	protected JMenu jmenuAccionesFuncionEstruc;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFuncionEstruc;	
	protected GridBagConstraints gridBagConstraintsFuncionEstruc;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FuncionEstrucDetalleFormJInternalFrame jInternalFrameDetalleFormFuncionEstruc;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFuncionEstruc;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFuncionEstruc;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected FuncionBeanSwingJInternalFrame funcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_funcion="";
	
	public FuncionEstrucSessionBean funcionestrucSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public FuncionSessionBean funcionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FuncionEstruc> funcionestrucs;		
	public List<FuncionEstruc> funcionestrucsEliminados;	
	public List<FuncionEstruc> funcionestrucsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFuncionEstruc;		
	protected JButton jButtonAbrirOrderByFuncionEstruc;
	
	
	//protected JPanel jPanelOrderByFuncionEstruc;
	//public JScrollPane jScrollPanelOrderByFuncionEstruc;	
	//protected JButton jButtonCerrarOrderByFuncionEstruc;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FuncionEstrucLogic funcionestrucLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFuncionEstruc;
	public JScrollPane jScrollPanelDatosEdicionFuncionEstruc;
	public JScrollPane jScrollPanelDatosGeneralFuncionEstruc;
    
	
	
	//public JScrollPane jScrollPanelDatosFuncionEstrucOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFuncionEstruc;
	//public JScrollPane jScrollPanelImportacionFuncionEstruc;
	
	
	
	protected JPanel jPanelAccionesFuncionEstruc;
	
    protected JPanel jPanelPaginacionFuncionEstruc;
    protected JPanel jPanelParametrosReportesFuncionEstruc;
	protected JPanel jPanelParametrosReportesAccionesFuncionEstruc;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FuncionEstruc;
	protected JPanel jPanelParametrosAuxiliar2FuncionEstruc;
	protected JPanel jPanelParametrosAuxiliar3FuncionEstruc;
	protected JPanel jPanelParametrosAuxiliar4FuncionEstruc;
	//protected JPanel jPanelParametrosAuxiliar5FuncionEstruc;
	
	
	
	//protected JPanel jPanelReporteDinamicoFuncionEstruc;
	//protected JPanel jPanelImportacionFuncionEstruc;
	
	
	public JTable jTableDatosFuncionEstruc;
	
	
	
	//public JTable jTableDatosFuncionEstrucOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFuncionEstruc;
	protected JButton jButtonDuplicarFuncionEstruc;
	protected JButton jButtonCopiarFuncionEstruc;
	protected JButton jButtonVerFormFuncionEstruc;
	protected JButton jButtonNuevoRelacionesFuncionEstruc;
	protected JButton jButtonModificarFuncionEstruc;
	
    protected JButton jButtonGuardarCambiosTablaFuncionEstruc;
	protected JButton jButtonCerrarFuncionEstruc;
	
	
	protected JButton jButtonRecargarInformacionFuncionEstruc;
	protected JButton jButtonProcesarInformacionFuncionEstruc;
	
	
	protected JButton jButtonAnterioresFuncionEstruc;
	protected JButton jButtonSiguientesFuncionEstruc;
	protected JButton jButtonNuevoGuardarCambiosFuncionEstruc;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFuncionEstruc;
	//protected JButton jButtonCerrarReporteDinamicoFuncionEstruc;
	//protected JButton jButtonGenerarExcelReporteDinamicoFuncionEstruc;	
	
	
	
	//protected JButton jButtonAbrirImportacionFuncionEstruc;
	//protected JButton jButtonGenerarImportacionFuncionEstruc;
	//protected JButton jButtonCerrarImportacionFuncionEstruc;
	//protected JFileChooser jFileChooserImportacionFuncionEstruc;
	//protected File fileImportacionFuncionEstruc;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFuncionEstruc;
	protected JButton jButtonDuplicarToolBarFuncionEstruc;
	protected JButton jButtonNuevoRelacionesToolBarFuncionEstruc;
	
	
	public JButton jButtonGuardarCambiosToolBarFuncionEstruc;
	protected JButton jButtonCopiarToolBarFuncionEstruc;
	protected JButton jButtonVerFormToolBarFuncionEstruc;
	public JButton jButtonGuardarCambiosTablaToolBarFuncionEstruc;
	protected JButton jButtonMostrarOcultarTablaToolBarFuncionEstruc;
	protected JButton jButtonCerrarToolBarFuncionEstruc;
	
	protected JButton jButtonRecargarInformacionToolBarFuncionEstruc;
	protected JButton jButtonProcesarInformacionToolBarFuncionEstruc;
	protected JButton jButtonAnterioresToolBarFuncionEstruc;
	protected JButton jButtonSiguientesToolBarFuncionEstruc;
	protected JButton jButtonNuevoGuardarCambiosToolBarFuncionEstruc;
	protected JButton jButtonAbrirOrderByToolBarFuncionEstruc;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFuncionEstruc;
	protected JMenuItem jMenuItemDuplicarFuncionEstruc;
	protected JMenuItem jMenuItemNuevoRelacionesFuncionEstruc;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFuncionEstruc;
	protected JMenuItem jMenuItemCopiarFuncionEstruc;
	protected JMenuItem jMenuItemVerFormFuncionEstruc;
	protected JMenuItem jMenuItemGuardarCambiosTablaFuncionEstruc;
	protected JMenuItem jMenuItemCerrarFuncionEstruc;
	protected JMenuItem jMenuItemDetalleCerrarFuncionEstruc;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFuncionEstruc;
	protected JMenuItem jMenuItemDetalleMostarOcultarFuncionEstruc;
	
	protected JMenuItem jMenuItemRecargarInformacionFuncionEstruc;
	protected JMenuItem jMenuItemProcesarInformacionFuncionEstruc;
	protected JMenuItem jMenuItemAnterioresFuncionEstruc;
	protected JMenuItem jMenuItemSiguientesFuncionEstruc;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFuncionEstruc;
	protected JMenuItem jMenuItemAbrirOrderByFuncionEstruc;
	protected JMenuItem jMenuItemMostrarOcultarFuncionEstruc;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFuncionEstruc;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFuncionEstruc;
	protected JCheckBox jCheckBoxSeleccionadosFuncionEstruc;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFuncionEstruc;
	protected JCheckBox jCheckBoxConGraficoReporteFuncionEstruc;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFuncionEstruc;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFuncionEstruc;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFuncionEstruc;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFuncionEstruc;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFuncionEstruc;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFuncionEstruc;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFuncionEstruc;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFuncionEstruc;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFuncionEstruc;
	protected JTextField jTextFieldValorCampoGeneralFuncionEstruc;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFuncionEstruc;
	//public JList<Reporte> jListColumnasSelectReporteFuncionEstruc;
	//public JScrollPane jScrollColumnasSelectReporteFuncionEstruc;
	
	//public JLabel jLabelRelacionesSelectReporteFuncionEstruc;
	//public JList<Reporte> jListRelacionesSelectReporteFuncionEstruc;
	//public JScrollPane jScrollRelacionesSelectReporteFuncionEstruc;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFuncionEstruc;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFuncionEstruc;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFuncionEstruc;
	//public JLabel jLabelTiposArchivoReporteDinamicoFuncionEstruc;
	
		
	//public JLabel jLabelArchivoImportacionFuncionEstruc;	
	//public JLabel jLabelPathArchivoImportacionFuncionEstruc;
	//protected JTextField jTextFieldPathArchivoImportacionFuncionEstruc;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFuncionEstruc;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFuncionEstruc;
	
	//public JLabel jLabelColumnaCategoriaValorFuncionEstruc;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFuncionEstruc;
	
	//public JLabel jLabelColumnasValoresGraficoFuncionEstruc;
	//public JList<Reporte> jListColumnasValoresGraficoFuncionEstruc;
	//public JScrollPane jScrollColumnasValoresGraficoFuncionEstruc;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFuncionEstruc;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFuncionEstruc;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFuncionEstruc;
	public JPanel jPanelFK_IdEstructuraFuncionEstruc;
	public JButton jButtonFK_IdEstructuraFuncionEstruc;
	public JPanel jPanelFK_IdFuncionFuncionEstruc;
	public JButton jButtonFK_IdFuncionFuncionEstruc;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraFuncionEstruc;
	public JLabel jLabelid_estructuraFK_IdEstructuraFuncionEstruc;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc;
	public JButton jButtonid_estructuraFK_IdEstructuraFuncionEstruc= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraFuncionEstrucUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraFuncionEstrucBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraFuncionEstrucArbol= new JButtonMe();

	
	public JPanel jPanelid_funcionFK_IdFuncionFuncionEstruc;
	public JLabel jLabelid_funcionFK_IdFuncionFuncionEstruc;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_funcionFK_IdFuncionFuncionEstruc;
	public JButton jButtonid_funcionFK_IdFuncionFuncionEstruc= new JButtonMe();
	public JButton jButtonid_funcionFK_IdFuncionFuncionEstrucUpdate= new JButtonMe();
	public JButton jButtonid_funcionFK_IdFuncionFuncionEstrucBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public FuncionEstrucJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionEstrucJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFuncionEstruc)	{
		this.jButtonRecargarInformacionFuncionEstruc = jButtonRecargarInformacionFuncionEstruc;
	}
	
	public JButton getjButtonProcesarInformacionFuncionEstruc() {
		return this.jButtonProcesarInformacionFuncionEstruc;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFuncionEstruc)	{
		this.jButtonProcesarInformacionFuncionEstruc = jButtonProcesarInformacionFuncionEstruc;
	}
	
	
	public JButton getjButtonRecargarInformacionFuncionEstruc() {
		return this.jButtonRecargarInformacionFuncionEstruc;
	}
	
	
	public List<FuncionEstruc> getfuncionestrucs() {
		return this.funcionestrucs;
	}

	public void setfuncionestrucs(List<FuncionEstruc> funcionestrucs) {
		this.funcionestrucs = funcionestrucs;
	}
	
	public List<FuncionEstruc> getfuncionestrucsAux() {
		return this.funcionestrucsAux;
	}

	public void setfuncionestrucsAux(List<FuncionEstruc> funcionestrucsAux) {
		this.funcionestrucsAux = funcionestrucsAux;
	}
	
	public List<FuncionEstruc> getfuncionestrucsEliminados() {
		return this.funcionestrucsEliminados;
	}

	public void setFuncionEstrucsEliminados(List<FuncionEstruc> funcionestrucsEliminados) {
		this.funcionestrucsEliminados = funcionestrucsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFuncionEstruc() {
		return jComboBoxTiposSeleccionarFuncionEstruc;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFuncionEstruc(
			JComboBox jComboBoxTiposSeleccionarFuncionEstruc) {
		this.jComboBoxTiposSeleccionarFuncionEstruc = jComboBoxTiposSeleccionarFuncionEstruc;
	}
	
	public void setBorderResaltarTiposSeleccionarFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFuncionEstruc .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFuncionEstruc() {
		return jTextFieldValorCampoGeneralFuncionEstruc;
	}

	public void setjTextFieldValorCampoGeneralFuncionEstruc(
			JTextField jTextFieldValorCampoGeneralFuncionEstruc) {
		this.jTextFieldValorCampoGeneralFuncionEstruc = jTextFieldValorCampoGeneralFuncionEstruc;
	}

	public void setBorderResaltarValorCampoGeneralFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFuncionEstruc .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFuncionEstruc() {
		return this.jCheckBoxSeleccionarTodosFuncionEstruc;
	}

	public void setjCheckBoxSeleccionarTodosFuncionEstruc(
			JCheckBox jCheckBoxSeleccionarTodosFuncionEstruc) {
		this.jCheckBoxSeleccionarTodosFuncionEstruc = jCheckBoxSeleccionarTodosFuncionEstruc;
	}

	public void setBorderResaltarSeleccionarTodosFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFuncionEstruc .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFuncionEstruc() {
		return this.jCheckBoxSeleccionadosFuncionEstruc;
	}

	public void setjCheckBoxSeleccionadosFuncionEstruc(
			JCheckBox jCheckBoxSeleccionadosFuncionEstruc) {
		this.jCheckBoxSeleccionadosFuncionEstruc = jCheckBoxSeleccionadosFuncionEstruc;
	}
	
	public void setBorderResaltarSeleccionadosFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFuncionEstruc .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFuncionEstruc() {
		return this.jComboBoxTiposArchivosReportesFuncionEstruc;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFuncionEstruc(
			JComboBox jComboBoxTiposArchivosReportesFuncionEstruc) {
		this.jComboBoxTiposArchivosReportesFuncionEstruc = jComboBoxTiposArchivosReportesFuncionEstruc;
	}

	public void setBorderResaltarTiposArchivosReportesFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFuncionEstruc .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFuncionEstruc() {
		return this.jComboBoxTiposReportesFuncionEstruc;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFuncionEstruc(
			JComboBox jComboBoxTiposReportesFuncionEstruc) {
		this.jComboBoxTiposReportesFuncionEstruc = jComboBoxTiposReportesFuncionEstruc;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFuncionEstruc() {
	//	return jComboBoxTiposReportesDinamicoFuncionEstruc;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFuncionEstruc(
	//		JComboBox jComboBoxTiposReportesDinamicoFuncionEstruc) {
	//	this.jComboBoxTiposReportesDinamicoFuncionEstruc = jComboBoxTiposReportesDinamicoFuncionEstruc;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFuncionEstruc() {
	//	return jComboBoxTiposArchivosReportesDinamicoFuncionEstruc;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFuncionEstruc(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFuncionEstruc) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc = jComboBoxTiposArchivosReportesDinamicoFuncionEstruc;
	//}
	
	public void setBorderResaltarTiposReportesFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFuncionEstruc .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFuncionEstruc() {
		return this.jComboBoxTiposGraficosReportesFuncionEstruc;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFuncionEstruc(
			JComboBox jComboBoxTiposGraficosReportesFuncionEstruc) {
		this.jComboBoxTiposGraficosReportesFuncionEstruc = jComboBoxTiposGraficosReportesFuncionEstruc;
	}
	
	public void setBorderResaltarTiposGraficosReportesFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFuncionEstruc .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFuncionEstruc() {
		return this.jComboBoxTiposPaginacionFuncionEstruc;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFuncionEstruc(
			JComboBox jComboBoxTiposPaginacionFuncionEstruc) {
		this.jComboBoxTiposPaginacionFuncionEstruc = jComboBoxTiposPaginacionFuncionEstruc;
	}
	
	public void setBorderResaltarTiposPaginacionFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFuncionEstruc .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFuncionEstruc() {
		return this.jComboBoxTiposRelacionesFuncionEstruc;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFuncionEstruc() {
		return this.jComboBoxTiposAccionesFuncionEstruc;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFuncionEstruc(
			JComboBox jComboBoxTiposRelacionesFuncionEstruc) {
		this.jComboBoxTiposRelacionesFuncionEstruc = jComboBoxTiposRelacionesFuncionEstruc;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFuncionEstruc(
			JComboBox jComboBoxTiposAccionesFuncionEstruc) {
		this.jComboBoxTiposAccionesFuncionEstruc = jComboBoxTiposAccionesFuncionEstruc;
	}
	
	public void setBorderResaltarTiposRelacionesFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFuncionEstruc .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFuncionEstruc() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFuncionEstruc .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFuncionEstruc() {
	//	return jCheckBoxConGraficoDinamicoFuncionEstruc;
	//}

	//public void setjCheckBoxConGraficoDinamicoFuncionEstruc(
	//		JCheckBox jCheckBoxConGraficoDinamicoFuncionEstruc) {
	//	this.jCheckBoxConGraficoDinamicoFuncionEstruc = jCheckBoxConGraficoDinamicoFuncionEstruc;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFuncionEstruc() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFuncionEstruc.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFuncionEstruc .setBorder(borderResaltar);		
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
		this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		
		this.funcionestrucSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.funcionestrucSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.funcionestrucSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FuncionEstrucJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Funcion Estruc MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
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
		
		FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FuncionEstruc No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFuncionEstruc= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"nuevo","nuevo","Nuevo"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"duplicar","duplicar","Duplicar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"copiar","copiar","Copiar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"ver_form","ver_form","Ver"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"recargar","recargar","Recargar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFuncionEstruc=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFuncionEstruc,this.jTtoolBarFuncionEstruc,
							"cerrar","cerrar","Salir"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFuncionEstruc=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFuncionEstruc;
			
				this.jButtonProcesarInformacionToolBarFuncionEstruc=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFuncionEstruc;
				
		//protected JButton jButtonModificarToolBarFuncionEstruc;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFuncionEstruc=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFuncionEstruc=new JMenuMe("General");
		this.jmenuArchivoFuncionEstruc=new JMenuMe("Archivo");
		this.jmenuAccionesFuncionEstruc=new JMenuMe("Acciones");
		this.jmenuDatosFuncionEstruc=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFuncionEstruc= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFuncionEstruc.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFuncionEstruc,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFuncionEstruc= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFuncionEstruc.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFuncionEstruc,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFuncionEstruc= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFuncionEstruc.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFuncionEstruc,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFuncionEstruc= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFuncionEstruc.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFuncionEstruc,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFuncionEstruc= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFuncionEstruc.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFuncionEstruc,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFuncionEstruc= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFuncionEstruc.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFuncionEstruc,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFuncionEstruc= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFuncionEstruc.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFuncionEstruc,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFuncionEstruc= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFuncionEstruc.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFuncionEstruc,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFuncionEstruc= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFuncionEstruc.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFuncionEstruc,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFuncionEstruc= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFuncionEstruc.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFuncionEstruc,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFuncionEstruc= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFuncionEstruc.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFuncionEstruc,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFuncionEstruc= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFuncionEstruc.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFuncionEstruc,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFuncionEstruc= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFuncionEstruc.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFuncionEstruc,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFuncionEstruc= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFuncionEstruc.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFuncionEstruc,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFuncionEstruc= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFuncionEstruc.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFuncionEstruc,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFuncionEstruc= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFuncionEstruc.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFuncionEstruc,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFuncionEstruc= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFuncionEstruc.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFuncionEstruc,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFuncionEstruc.add(this.jMenuItemCerrarFuncionEstruc);
			
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemNuevoFuncionEstruc);
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemNuevoGuardarCambiosFuncionEstruc);
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemNuevoRelacionesFuncionEstruc);
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemGuardarCambiosTablaFuncionEstruc);		
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemDuplicarFuncionEstruc);		
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemCopiarFuncionEstruc);		
			this.jmenuAccionesFuncionEstruc.add(this.jMenuItemVerFormFuncionEstruc);		
			
			this.jmenuDatosFuncionEstruc.add(this.jMenuItemRecargarInformacionFuncionEstruc);				
			this.jmenuDatosFuncionEstruc.add(this.jMenuItemAnterioresFuncionEstruc);				
			this.jmenuDatosFuncionEstruc.add(this.jMenuItemSiguientesFuncionEstruc);				
			this.jmenuDatosFuncionEstruc.add(this.jMenuItemAbrirOrderByFuncionEstruc);				
			this.jmenuDatosFuncionEstruc.add(this.jMenuItemMostrarOcultarFuncionEstruc);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFuncionEstruc.add(this.jMenuItemGuardarCambiosFuncionEstruc);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFuncionEstruc.add(this.jmenuArchivoFuncionEstruc);		
			this.jmenuBarFuncionEstruc.add(this.jmenuAccionesFuncionEstruc);		
			this.jmenuBarFuncionEstruc.add(this.jmenuDatosFuncionEstruc);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFuncionEstruc);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFuncionEstruc() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEstructuraFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraFuncionEstruc.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraFuncionEstruc= new JButtonMe();
		this.jButtonFK_IdEstructuraFuncionEstruc.setText("Buscar");
		this.jButtonFK_IdEstructuraFuncionEstruc.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraFuncionEstruc,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraFuncionEstruc = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraFuncionEstruc.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraFuncionEstruc.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraFuncionEstruc,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFuncionFuncionEstruc=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFuncionFuncionEstruc.setToolTipText("Buscar Por Funcion ");
		this.jButtonFK_IdFuncionFuncionEstruc= new JButtonMe();
		this.jButtonFK_IdFuncionFuncionEstruc.setText("Buscar");
		this.jButtonFK_IdFuncionFuncionEstruc.setToolTipText("Buscar Por Funcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFuncionFuncionEstruc,"buscar_button","Buscar Por Funcion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFuncionFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_funcionFK_IdFuncionFuncionEstruc = new JLabelMe();
		jLabelid_funcionFK_IdFuncionFuncionEstruc.setText("Funcion :");
		jLabelid_funcionFK_IdFuncionFuncionEstruc.setToolTipText("Funcion");
		jLabelid_funcionFK_IdFuncionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_funcionFK_IdFuncionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_funcionFK_IdFuncionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_funcionFK_IdFuncionFuncionEstruc,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_funcionFK_IdFuncionFuncionEstruc= new JComboBoxMe();
		jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_funcionFK_IdFuncionFuncionEstruc,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFuncionEstruc=new JTabbedPane();


		this.jTabbedPaneBusquedasFuncionEstruc.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFuncionEstruc.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFuncionEstruc.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFuncionEstruc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFuncionEstruc,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFuncionEstruc = new FuncionEstrucDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Funcion Estruc DATOS");
			this.jInternalFrameDetalleFormFuncionEstruc = new FuncionEstrucDetalleFormJInternalFrame(jDesktopPane,this.funcionestrucSessionBean.getConGuardarRelaciones(),this.funcionestrucSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFuncionEstruc = null;//new FuncionEstrucDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFuncionEstruc= new GridBagLayout();
		
		
		this.jTableDatosFuncionEstruc = new JTableMe();      
		
		String sToolTipFuncionEstruc="";
		sToolTipFuncionEstruc=FuncionEstrucConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFuncionEstruc+="(Nomina.FuncionEstruc)";
		}
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			sToolTipFuncionEstruc+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFuncionEstruc.setToolTipText(sToolTipFuncionEstruc);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFuncionEstruc);
		this.jTableDatosFuncionEstruc.setAutoCreateRowSorter(true);
		this.jTableDatosFuncionEstruc.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFuncionEstruc.setRowSelectionAllowed(true);
		this.jTableDatosFuncionEstruc.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFuncionEstruc,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFuncionEstruc = new JButtonMe();
		this.jButtonDuplicarFuncionEstruc = new JButtonMe();
		this.jButtonCopiarFuncionEstruc = new JButtonMe();
		this.jButtonVerFormFuncionEstruc = new JButtonMe();
		this.jButtonNuevoRelacionesFuncionEstruc = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFuncionEstruc = new JButtonMe();
		this.jButtonCerrarFuncionEstruc = new JButtonMe();
		
		this.jScrollPanelDatosFuncionEstruc = new JScrollPane();   
        this.jScrollPanelDatosGeneralFuncionEstruc = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Funcion Estruc";
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funcion Estruces" + this.sPath));
		} else {
			this.jScrollPanelDatosFuncionEstruc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFuncionEstruc.setToolTipText("Acciones");
        this.jPanelAccionesFuncionEstruc.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFuncionEstruc=new ReporteDinamicoJInternalFrame(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFuncionEstruc();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFuncionEstruc=new ImportacionJInternalFrame(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFuncionEstruc();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFuncionEstruc = new JButtonMe();
		
		this.jButtonAbrirOrderByFuncionEstruc.setText("Orden");
		this.jButtonAbrirOrderByFuncionEstruc.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFuncionEstruc,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFuncionEstruc=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncionEstruc,false,this);
			
			//this.cargarOrderByFuncionEstruc(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFuncionEstruc=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncionEstruc,true,this);
			
			//this.cargarOrderByFuncionEstruc(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFuncionEstruc.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosFuncionEstruc.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosFuncionEstruc.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosFuncionEstruc.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFuncionEstruc.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFuncionEstruc.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFuncionEstruc.setText("Nuevo");
		this.jButtonDuplicarFuncionEstruc.setText("Duplicar");
		this.jButtonCopiarFuncionEstruc.setText("Copiar");
		this.jButtonVerFormFuncionEstruc.setText("Ver");
		this.jButtonNuevoRelacionesFuncionEstruc.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.setText("Guardar");
		this.jButtonCerrarFuncionEstruc.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFuncionEstruc,"nuevo_button","Nuevo",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFuncionEstruc,"duplicar_button","Duplicar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFuncionEstruc,"copiar_button","Copiar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFuncionEstruc,"ver_form","Ver",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFuncionEstruc,"nuevorelaciones_button","Nuevo Rel",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFuncionEstruc,"guardarcambiostabla_button","Guardar",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFuncionEstruc,"cerrar_button","Salir",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFuncionEstruc.setToolTipText("Nuevo"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFuncionEstruc.setToolTipText("Duplicar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFuncionEstruc.setToolTipText("Copiar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFuncionEstruc.setToolTipText("Ver"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFuncionEstruc.setToolTipText("Nuevo Rel"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.setToolTipText("Guardar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFuncionEstruc.setToolTipText("Salir"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFuncionEstruc";
		inputMap = this.jButtonNuevoFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFuncionEstruc.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFuncionEstruc"));
		
		//DUPLICAR
		sMapKey = "DuplicarFuncionEstruc";
		inputMap = this.jButtonDuplicarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFuncionEstruc.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFuncionEstruc"));
		
		//COPIAR
		sMapKey = "CopiarFuncionEstruc";
		inputMap = this.jButtonCopiarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFuncionEstruc.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFuncionEstruc"));
		
		//VEr FORM
		sMapKey = "VerFormFuncionEstruc";
		inputMap = this.jButtonVerFormFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFuncionEstruc.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFuncionEstruc"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFuncionEstruc";
		inputMap = this.jButtonNuevoRelacionesFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFuncionEstruc"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFuncionEstruc";
		inputMap = this.jButtonModificarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFuncionEstruc"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFuncionEstruc";
		inputMap = this.jButtonCerrarFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFuncionEstruc"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFuncionEstruc";
		inputMap = this.jButtonGuardarCambiosTablaFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFuncionEstruc"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FuncionEstruc= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FuncionEstruc= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FuncionEstruc= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FuncionEstruc= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FuncionEstruc= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFuncionEstruc.setName("jPanelParametrosReportesFuncionEstruc"); 
		
		this.jPanelParametrosReportesAccionesFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFuncionEstruc.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFuncionEstruc.setName("jPanelParametrosReportesAccionesFuncionEstruc"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFuncionEstruc = new JButtonMe();
		this.jButtonRecargarInformacionFuncionEstruc.setText("Recargar");
		this.jButtonRecargarInformacionFuncionEstruc.setToolTipText("Recargar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFuncionEstruc,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFuncionEstruc = new JButtonMe();
		this.jButtonProcesarInformacionFuncionEstruc.setText("Procesar");
		this.jButtonProcesarInformacionFuncionEstruc.setToolTipText("Procesar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFuncionEstruc.setVisible(false);
			
		this.jButtonProcesarInformacionFuncionEstruc.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFuncionEstruc.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFuncionEstruc.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFuncionEstruc.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFuncionEstruc.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFuncionEstruc.setText("TIPO");       
		this.jComboBoxTiposReportesFuncionEstruc.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFuncionEstruc.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFuncionEstruc.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFuncionEstruc.setText("Paginacion");
		this.jComboBoxTiposPaginacionFuncionEstruc.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFuncionEstruc.setText("Accion");
		this.jComboBoxTiposRelacionesFuncionEstruc.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFuncionEstruc.setText("Accion");
		this.jComboBoxTiposAccionesFuncionEstruc.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFuncionEstruc = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFuncionEstruc.setText("Accion");
		this.jComboBoxTiposSeleccionarFuncionEstruc.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFuncionEstruc=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFuncionEstruc.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFuncionEstruc.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFuncionEstruc.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFuncionEstruc = new JLabelMe();
		
		this.jLabelAccionesFuncionEstruc.setText("Acciones");		
		this.jLabelAccionesFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFuncionEstruc = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFuncionEstruc.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFuncionEstruc.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFuncionEstruc = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFuncionEstruc.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFuncionEstruc.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFuncionEstruc = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFuncionEstruc.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFuncionEstruc.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFuncionEstruc = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFuncionEstruc.setText("Graf.");
		this.jCheckBoxConGraficoReporteFuncionEstruc.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFuncionEstruc = new JButtonMe();
		//this.jButtonAnterioresFuncionEstruc.setText("<<");
        this.jButtonAnterioresFuncionEstruc.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFuncionEstruc,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFuncionEstruc = new JButtonMe();
		//this.jButtonSiguientesFuncionEstruc.setText(">>");
        this.jButtonSiguientesFuncionEstruc.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFuncionEstruc,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFuncionEstruc = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFuncionEstruc.setText("Nue");
        this.jButtonNuevoGuardarCambiosFuncionEstruc.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFuncionEstruc,"nuevoguardarcambios_button","Nue",this.funcionestrucSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFuncionEstruc";
		inputMap = this.jButtonNuevoGuardarCambiosFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFuncionEstruc"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFuncionEstruc";
		inputMap = this.jButtonRecargarInformacionFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFuncionEstruc"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFuncionEstruc";
		inputMap = this.jButtonSiguientesFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFuncionEstruc"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFuncionEstruc";
		inputMap = this.jButtonAnterioresFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFuncionEstruc"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFuncionEstruc();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFuncionEstruc.setMinimumSize(new Dimension(this.getWidth(),FuncionEstrucBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FuncionEstrucBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFuncionEstruc.setMaximumSize(new Dimension(this.getWidth(),FuncionEstrucBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FuncionEstrucBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFuncionEstruc.setPreferredSize(new Dimension(this.getWidth(),FuncionEstrucBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FuncionEstrucBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFuncionEstruc = new GridBagLayout();

			this.jPanelPaginacionFuncionEstruc.setLayout(gridaBagLayoutPaginacionFuncionEstruc);						
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 0;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonAnterioresFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
					
						
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFuncionEstruc.gridy = 0;
			
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonNuevoGuardarCambiosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
						
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFuncionEstruc.gridy = 0;
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonSiguientesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 1;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonNuevoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
						
			
			
			if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
				this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFuncionEstruc.gridy = 1;
				this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFuncionEstruc.add(this.jButtonGuardarCambiosTablaFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			}
			
			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 1;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonDuplicarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 1;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonCopiarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 1;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonVerFormFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 1;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFuncionEstruc.add(this.jButtonCerrarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
		
		
		this.jButtonRecargarInformacionFuncionEstruc.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFuncionEstruc.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFuncionEstruc.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFuncionEstruc.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFuncionEstruc.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFuncionEstruc.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFuncionEstruc.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFuncionEstruc.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFuncionEstruc.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFuncionEstruc.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFuncionEstruc.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFuncionEstruc.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFuncionEstruc.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFuncionEstruc.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFuncionEstruc.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFuncionEstruc.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFuncionEstruc.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFuncionEstruc.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFuncionEstruc.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncionEstruc.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncionEstruc.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFuncionEstruc.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFuncionEstruc.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFuncionEstruc.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFuncionEstruc.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFuncionEstruc.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFuncionEstruc.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFuncionEstruc.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFuncionEstruc.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFuncionEstruc.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFuncionEstruc.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFuncionEstruc.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFuncionEstruc.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFuncionEstruc.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFuncionEstruc.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFuncionEstruc.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFuncionEstruc = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFuncionEstruc = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FuncionEstruc = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FuncionEstruc = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FuncionEstruc = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FuncionEstruc = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFuncionEstruc.setLayout(gridaBagParametrosReportesFuncionEstruc);
			this.jPanelParametrosReportesAccionesFuncionEstruc.setLayout(gridaBagParametrosReportesAccionesFuncionEstruc);
			
			
			this.jPanelParametrosAuxiliar1FuncionEstruc.setLayout(gridaBagParametrosAuxiliar1FuncionEstruc);
			this.jPanelParametrosAuxiliar2FuncionEstruc.setLayout(gridaBagParametrosAuxiliar2FuncionEstruc);
			this.jPanelParametrosAuxiliar3FuncionEstruc.setLayout(gridaBagParametrosAuxiliar3FuncionEstruc);
			this.jPanelParametrosAuxiliar4FuncionEstruc.setLayout(gridaBagParametrosAuxiliar4FuncionEstruc);
			//this.jPanelParametrosAuxiliar5FuncionEstruc.setLayout(gridaBagParametrosAuxiliar2FuncionEstruc);			
			
			
			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncionEstruc.add(this.jButtonRecargarInformacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FuncionEstruc.add(this.jComboBoxTiposPaginacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FuncionEstruc.add(this.jCheckBoxConAltoMaximoTablaFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FuncionEstruc.add(this.jComboBoxTiposArchivosReportesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncionEstruc.add(this.jPanelParametrosAuxiliar1FuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFuncionEstruc.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FuncionEstruc.add(this.jComboBoxTiposReportesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncionEstruc.add(this.jPanelParametrosAuxiliar4FuncionEstruc, this.gridBagConstraintsFuncionEstruc);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncionEstruc.add(this.jComboBoxTiposReportesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFuncionEstruc.add(this.jCheckBoxGenerarReporteFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncionEstruc.add(this.jPanelParametrosAuxiliar2FuncionEstruc, this.gridBagConstraintsFuncionEstruc);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFuncionEstruc.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFuncionEstruc.add(this.jLabelAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
				this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFuncionEstruc.add(this.jButtonAbrirOrderByFuncionEstruc, this.gridBagConstraintsFuncionEstruc);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncionEstruc.add(this.jComboBoxTiposSeleccionarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
			
			
			/*
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFuncionEstruc.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFuncionEstruc.add(this.jCheckBoxSeleccionarTodosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFuncionEstruc.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FuncionEstruc.add(this.jCheckBoxSeleccionarTodosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);															
				
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFuncionEstruc.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FuncionEstruc.add(this.jCheckBoxSeleccionadosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncionEstruc.add(this.jPanelParametrosAuxiliar3FuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncionEstruc.add(this.jComboBoxTiposAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
	
				
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncionEstruc.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncionEstruc.add(this.jTextFieldValorCampoGeneralFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFuncionEstruc = new GridBagLayout();

			this.jScrollPanelDatosFuncionEstruc.setLayout(gridaBagLayoutDatosFuncionEstruc);
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = 0;
			this.gridBagConstraintsFuncionEstruc.gridx = 0;
			
			this.jScrollPanelDatosFuncionEstruc.add(this.jTableDatosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFuncionEstruc.setViewportView(this.jTableDatosFuncionEstruc);
		this.jTableDatosFuncionEstruc.setFillsViewportHeight(true);
		this.jTableDatosFuncionEstruc.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFuncionEstruc= new GridBagLayout();
		this.jPanelAccionesFuncionEstruc.setLayout(gridaBagLayoutAccionesFuncionEstruc);
		
		
		/*	
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = 0;
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
			
		this.jPanelAccionesFuncionEstruc.add(this.jButtonNuevoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEstructuraFuncionEstruc= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraFuncionEstruc.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraFuncionEstruc.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraFuncionEstruc.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraFuncionEstruc.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraFuncionEstruc.setLayout(gridaBagLayoutFK_IdEstructuraFuncionEstruc);

		gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFuncionEstruc.gridy = 0;
		gridBagConstraintsFuncionEstruc.gridx = 0;
		jPanelFK_IdEstructuraFuncionEstruc.add(jLabelid_estructuraFK_IdEstructuraFuncionEstruc, gridBagConstraintsFuncionEstruc);

		gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFuncionEstruc.gridy = 0;
		gridBagConstraintsFuncionEstruc.gridx = 1;
		jPanelFK_IdEstructuraFuncionEstruc.add(jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc, gridBagConstraintsFuncionEstruc);

		gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFuncionEstruc.gridy = 1;
		gridBagConstraintsFuncionEstruc.gridx =1;
		jPanelFK_IdEstructuraFuncionEstruc.add(jButtonFK_IdEstructuraFuncionEstruc, gridBagConstraintsFuncionEstruc);

		jTabbedPaneBusquedasFuncionEstruc.addTab("1.-Por Estructura ", jPanelFK_IdEstructuraFuncionEstruc);
		jTabbedPaneBusquedasFuncionEstruc.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFuncionFuncionEstruc= new GridBagLayout();
		gridaBagLayoutFK_IdFuncionFuncionEstruc.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFuncionFuncionEstruc.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFuncionFuncionEstruc.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFuncionFuncionEstruc.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFuncionFuncionEstruc.setLayout(gridaBagLayoutFK_IdFuncionFuncionEstruc);

		gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFuncionEstruc.gridy = 0;
		gridBagConstraintsFuncionEstruc.gridx = 0;
		jPanelFK_IdFuncionFuncionEstruc.add(jLabelid_funcionFK_IdFuncionFuncionEstruc, gridBagConstraintsFuncionEstruc);

		gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFuncionEstruc.gridy = 0;
		gridBagConstraintsFuncionEstruc.gridx = 1;
		jPanelFK_IdFuncionFuncionEstruc.add(jComboBoxid_funcionFK_IdFuncionFuncionEstruc, gridBagConstraintsFuncionEstruc);

		gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFuncionEstruc.gridy = 1;
		gridBagConstraintsFuncionEstruc.gridx =1;
		jPanelFK_IdFuncionFuncionEstruc.add(jButtonFK_IdFuncionFuncionEstruc, gridBagConstraintsFuncionEstruc);

		jTabbedPaneBusquedasFuncionEstruc.addTab("2.-Por Funcion ", jPanelFK_IdFuncionFuncionEstruc);
		jTabbedPaneBusquedasFuncionEstruc.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFuncionEstruc = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFuncionEstruc);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();						
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFuncionEstruc.gridx = 0;		
			//this.gridBagConstraintsFuncionEstruc.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFuncionEstruc.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFuncionEstruc, this.gridBagConstraintsFuncionEstruc);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFuncionEstruc.gridx = 0;		
		//this.gridBagConstraintsFuncionEstruc.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFuncionEstruc.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFuncionEstruc);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFuncionEstruc.gridx = 0;		
			this.gridBagConstraintsFuncionEstruc.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFuncionEstruc.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFuncionEstruc, this.gridBagConstraintsFuncionEstruc);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);								
		
		
		/*
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		*/		
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFuncionEstruc.gridx =0;
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFuncionEstruc.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
				
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFuncionEstruc= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFuncionEstruc = new GridBagLayout();
			this.jPanelBusquedasParametrosFuncionEstruc.setLayout(gridaBagLayoutBusquedasParametrosFuncionEstruc);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFuncionEstruc=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFuncionEstruc.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncionEstruc.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncionEstruc.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
			
			
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
			
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFuncionEstruc.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFuncionEstruc;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFuncionEstruc() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFuncionEstruc = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFuncionEstruc.setName("jPanelReporteDinamicoFuncionEstruc"); 
		
		this.jPanelReporteDinamicoFuncionEstruc.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFuncionEstruc.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFuncionEstruc.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFuncionEstruc.setLayout(gridaBagLayoutReporteDinamicoFuncionEstruc);
		
		
		this.jInternalFrameReporteDinamicoFuncionEstruc= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFuncionEstruc = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFuncionEstruc= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFuncionEstruc.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFuncionEstruc.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFuncionEstruc.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFuncionEstruc.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFuncionEstruc.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFuncionEstruc.setResizable(true);
	    this.jInternalFrameReporteDinamicoFuncionEstruc.setClosable(true);
	    this.jInternalFrameReporteDinamicoFuncionEstruc.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFuncionEstruc.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFuncionEstruc.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFuncionEstruc.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funcion Estruces"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFuncionEstruc = new JLabelMe();

		this.jLabelColumnasSelectReporteFuncionEstruc.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jLabelColumnasSelectReporteFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFuncionEstruc = new JList<Reporte>();
		this.jListColumnasSelectReporteFuncionEstruc.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFuncionEstruc.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFuncionEstruc.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFuncionEstruc.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFuncionEstruc.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFuncionEstruc=new JScrollPane(this.jListColumnasSelectReporteFuncionEstruc);
			
			this.jScrollColumnasSelectReporteFuncionEstruc.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFuncionEstruc.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFuncionEstruc.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFuncionEstruc.add(this.jListColumnasSelectReporteFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jScrollColumnasSelectReporteFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFuncionEstruc = new JLabelMe();

		this.jLabelRelacionesSelectReporteFuncionEstruc.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFuncionEstruc = new JList<Reporte>();
		this.jListRelacionesSelectReporteFuncionEstruc.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFuncionEstruc.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFuncionEstruc.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFuncionEstruc.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFuncionEstruc.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFuncionEstruc=new JScrollPane(this.jListRelacionesSelectReporteFuncionEstruc);
			
			this.jScrollRelacionesSelectReporteFuncionEstruc.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFuncionEstruc.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFuncionEstruc.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFuncionEstruc = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFuncionEstruc = new JComboBoxMe();
		this.jListColumnasValoresGraficoFuncionEstruc = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFuncionEstruc = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFuncionEstruc.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFuncionEstruc.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFuncionEstruc.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFuncionEstruc.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFuncionEstruc = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFuncionEstruc.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jLabelGenerarExcelReporteDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFuncionEstruc = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFuncionEstruc.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFuncionEstruc,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFuncionEstruc.setToolTipText("Generar EXCEL"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		//this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFuncionEstruc.add(this.jButtonGenerarExcelReporteDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jComboBoxTiposReportesDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFuncionEstruc = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFuncionEstruc.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jLabelTiposArchivoReporteDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jComboBoxTiposArchivosReportesDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFuncionEstruc = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFuncionEstruc.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFuncionEstruc,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFuncionEstruc.setToolTipText("Generar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jButtonGenerarReporteDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFuncionEstruc = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFuncionEstruc.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFuncionEstruc,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFuncionEstruc.setToolTipText("Cancelar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncionEstruc.add(this.jButtonCerrarReporteDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFuncionEstruc = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFuncionEstruc= new JScrollPane(jPanelReporteDinamicoFuncionEstruc,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFuncionEstruc.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFuncionEstruc.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFuncionEstruc.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funcion Estruces"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFuncionEstruc.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFuncionEstruc.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFuncionEstruc.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFuncionEstruc);
		this.jInternalFrameReporteDinamicoFuncionEstruc.getContentPane().add(this.jScrollPanelReporteDinamicoFuncionEstruc, this.gridBagConstraintsFuncionEstruc);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFuncionEstruc() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFuncionEstruc = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFuncionEstruc.setName("jPanelImportacionFuncionEstruc"); 
		
		this.jPanelImportacionFuncionEstruc.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFuncionEstruc.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFuncionEstruc.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFuncionEstruc.setLayout(gridaBagLayoutImportacionFuncionEstruc);
		
		
		this.jInternalFrameImportacionFuncionEstruc= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFuncionEstruc= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFuncionEstruc = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFuncionEstruc= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFuncionEstruc.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFuncionEstruc.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFuncionEstruc.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFuncionEstruc.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFuncionEstruc.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFuncionEstruc.setResizable(true);
	    this.jInternalFrameImportacionFuncionEstruc.setClosable(true);
	    this.jInternalFrameImportacionFuncionEstruc.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFuncionEstruc.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFuncionEstruc.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFuncionEstruc.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFuncionEstruc.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFuncionEstruc.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFuncionEstruc.setResizable(true);
	    this.jInternalFrameImportacionFuncionEstruc.setClosable(true);
	    this.jInternalFrameImportacionFuncionEstruc.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFuncionEstruc.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFuncionEstruc.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFuncionEstruc.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funcion Estruces"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFuncionEstruc = new JLabelMe();

		this.jLabelArchivoImportacionFuncionEstruc.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYImportacion;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFuncionEstruc.add(this.jLabelArchivoImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFuncionEstruc = new JFileChooser();		
		this.jFileChooserImportacionFuncionEstruc.setToolTipText("ESCOGER ARCHIVO"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFuncionEstruc = new JButtonMe();
		this.jButtonAbrirImportacionFuncionEstruc.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFuncionEstruc,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFuncionEstruc.setToolTipText("Generar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncionEstruc.add(this.jButtonAbrirImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFuncionEstruc = new JLabelMe();

		this.jLabelPathArchivoImportacionFuncionEstruc.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFuncionEstruc.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFuncionEstruc.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFuncionEstruc.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYImportacion;		
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFuncionEstruc.add(this.jLabelPathArchivoImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFuncionEstruc=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFuncionEstruc.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFuncionEstruc.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFuncionEstruc.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncionEstruc.add(this.jTextFieldPathArchivoImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFuncionEstruc = new JButtonMe();
		this.jButtonGenerarImportacionFuncionEstruc.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFuncionEstruc,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFuncionEstruc.setToolTipText("Generar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncionEstruc.add(this.jButtonGenerarImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFuncionEstruc = new JButtonMe();
		this.jButtonCerrarImportacionFuncionEstruc.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFuncionEstruc,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFuncionEstruc.setToolTipText("Cancelar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncionEstruc.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncionEstruc.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncionEstruc.add(this.jButtonCerrarImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFuncionEstruc = new GridBagLayout();
		
		this.jScrollPanelImportacionFuncionEstruc= new JScrollPane(jPanelImportacionFuncionEstruc,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
		this.gridBagConstraintsFuncionEstruc.gridy =iPosYImportacion;
		this.gridBagConstraintsFuncionEstruc.gridx =iPosXImportacion;
		this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFuncionEstruc.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFuncionEstruc.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFuncionEstruc);
		this.jInternalFrameImportacionFuncionEstruc.getContentPane().add(this.jScrollPanelImportacionFuncionEstruc, this.gridBagConstraintsFuncionEstruc);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFuncionEstruc(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFuncionEstruc = new JButtonMe();
			this.jButtonAbrirOrderByFuncionEstruc.setText("Orden");
			this.jButtonAbrirOrderByFuncionEstruc.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFuncionEstruc,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFuncionEstruc";
			inputMap = this.jButtonAbrirOrderByFuncionEstruc.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFuncionEstruc.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFuncionEstruc"));
		
		
			GridBagLayout gridaBagLayoutOrderByFuncionEstruc = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFuncionEstruc = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFuncionEstruc.setName("jPanelOrderByFuncionEstruc"); 
			
			this.jPanelOrderByFuncionEstruc.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFuncionEstruc.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFuncionEstruc.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFuncionEstruc.setLayout(gridaBagLayoutOrderByFuncionEstruc);
			
			
			this.jTableDatosFuncionEstrucOrderBy = new JTableMe();        
			this.jTableDatosFuncionEstrucOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFuncionEstrucOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFuncionEstrucOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFuncionEstrucOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFuncionEstrucOrderBy.setViewportView(this.jTableDatosFuncionEstrucOrderBy);
			this.jTableDatosFuncionEstrucOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFuncionEstrucOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFuncionEstruc= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFuncionEstruc= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFuncionEstruc = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFuncionEstruc= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFuncionEstruc.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFuncionEstruc.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFuncionEstruc.setTitle("Orden");
			this.jInternalFrameOrderByFuncionEstruc.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFuncionEstruc.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFuncionEstruc.setResizable(true);
			this.jInternalFrameOrderByFuncionEstruc.setClosable(true);
			this.jInternalFrameOrderByFuncionEstruc.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFuncionEstruc.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFuncionEstruc.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFuncionEstruc.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFuncionEstruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funcion Estruces"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFuncionEstruc.gridx =iPosXOrderBy;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFuncionEstruc.ipady =150;
				
			this.jPanelOrderByFuncionEstruc.add(jScrollPanelDatosFuncionEstrucOrderBy, this.gridBagConstraintsFuncionEstruc);//this.jTableDatosFuncionEstrucTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFuncionEstruc = new JButtonMe();
			this.jButtonCerrarOrderByFuncionEstruc.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFuncionEstruc,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFuncionEstruc.setToolTipText("Cancelar"+" "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFuncionEstruc, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncionEstruc.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFuncionEstruc.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFuncionEstruc.add(this.jButtonCerrarOrderByFuncionEstruc, this.gridBagConstraintsFuncionEstruc);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFuncionEstruc = new GridBagLayout();
			
			this.jScrollPanelOrderByFuncionEstruc= new JScrollPane(jPanelOrderByFuncionEstruc,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFuncionEstruc = new GridBagConstraints();
			this.gridBagConstraintsFuncionEstruc.gridy =iPosYOrderBy;
			this.gridBagConstraintsFuncionEstruc.gridx =iPosXOrderBy;
			this.gridBagConstraintsFuncionEstruc.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFuncionEstruc.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFuncionEstruc.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFuncionEstruc);
			
			this.jInternalFrameOrderByFuncionEstruc.getContentPane().add(this.jScrollPanelOrderByFuncionEstruc, this.gridBagConstraintsFuncionEstruc);			
		
		} else {
			this.jButtonAbrirOrderByFuncionEstruc = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.funcionestrucSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFuncionEstruc.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFuncionEstruc.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFuncionEstruc.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFuncionEstruc.getRowHeight();//FuncionEstrucConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFuncionEstruc.isSelected()) {
					iHeightTable=FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFuncionEstruc.isSelected()) {
					iHeightTable=FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FuncionEstrucConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFuncionEstruc.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFuncionEstruc.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFuncionEstruc.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFuncionEstruc.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFuncionEstruc.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFuncionEstruc.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFuncionEstruc!=null && this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy()!=null) {
			//if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFuncionEstruc.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFuncionEstruc.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFuncionEstruc.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFuncionEstruc.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFuncionEstruc.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFuncionEstruc.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=funcionestrucLogic.getFuncionEstrucs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=funcionestrucs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FuncionEstruc> TraerFuncionEstrucBeans(List<FuncionEstruc> funcionestrucs,ArrayList<Classe> classes)throws Exception {
		try {
			for(FuncionEstruc funcionestruc:funcionestrucs) {
					
				if(!(FuncionEstrucConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FuncionEstrucConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					funcionestruc.setsDetalleGeneralEntityReporte(FuncionEstrucConstantesFunciones.getFuncionEstrucDescripcion(funcionestruc));
										
						
					
						
					
				} else  {
							
					//funcionestruc.setsDetalleGeneralEntityReporte(funcionestruc.getsDetalleGeneralEntityReporte());
										
				}
				
				//funcionestrucbeans.add(funcionestrucbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return funcionestrucs;
    }
	//PARA REPORTES FIN
}
