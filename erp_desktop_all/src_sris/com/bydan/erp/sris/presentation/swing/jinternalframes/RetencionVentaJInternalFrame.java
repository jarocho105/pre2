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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.RetencionVentaConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class RetencionVentaJInternalFrame extends RetencionVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRetencionVenta;
	
	protected JMenuBar jmenuBarRetencionVenta;
	
	protected JMenu jmenuRetencionVenta;
	protected JMenu jmenuDatosRetencionVenta;
	protected JMenu jmenuArchivoRetencionVenta;
	protected JMenu jmenuAccionesRetencionVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionVenta;	
	protected GridBagConstraints gridBagConstraintsRetencionVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RetencionVentaDetalleFormJInternalFrame jInternalFrameDetalleFormRetencionVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRetencionVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRetencionVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";
	
	public RetencionVentaSessionBean retencionventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RetencionVenta> retencionventas;		
	public List<RetencionVenta> retencionventasEliminados;	
	public List<RetencionVenta> retencionventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRetencionVenta;		
	protected JButton jButtonAbrirOrderByRetencionVenta;
	
	
	//protected JPanel jPanelOrderByRetencionVenta;
	//public JScrollPane jScrollPanelOrderByRetencionVenta;	
	//protected JButton jButtonCerrarOrderByRetencionVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RetencionVentaLogic retencionventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRetencionVenta;
	public JScrollPane jScrollPanelDatosEdicionRetencionVenta;
	public JScrollPane jScrollPanelDatosGeneralRetencionVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosRetencionVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRetencionVenta;
	//public JScrollPane jScrollPanelImportacionRetencionVenta;
	
	
	
	protected JPanel jPanelAccionesRetencionVenta;
	
    protected JPanel jPanelPaginacionRetencionVenta;
    protected JPanel jPanelParametrosReportesRetencionVenta;
	protected JPanel jPanelParametrosReportesAccionesRetencionVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RetencionVenta;
	protected JPanel jPanelParametrosAuxiliar2RetencionVenta;
	protected JPanel jPanelParametrosAuxiliar3RetencionVenta;
	protected JPanel jPanelParametrosAuxiliar4RetencionVenta;
	//protected JPanel jPanelParametrosAuxiliar5RetencionVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoRetencionVenta;
	//protected JPanel jPanelImportacionRetencionVenta;
	
	
	public JTable jTableDatosRetencionVenta;
	
	
	
	//public JTable jTableDatosRetencionVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRetencionVenta;
	protected JButton jButtonDuplicarRetencionVenta;
	protected JButton jButtonCopiarRetencionVenta;
	protected JButton jButtonVerFormRetencionVenta;
	protected JButton jButtonNuevoRelacionesRetencionVenta;
	protected JButton jButtonModificarRetencionVenta;
	
    protected JButton jButtonGuardarCambiosTablaRetencionVenta;
	protected JButton jButtonCerrarRetencionVenta;
	
	
	protected JButton jButtonRecargarInformacionRetencionVenta;
	protected JButton jButtonProcesarInformacionRetencionVenta;
	
	
	protected JButton jButtonAnterioresRetencionVenta;
	protected JButton jButtonSiguientesRetencionVenta;
	protected JButton jButtonNuevoGuardarCambiosRetencionVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRetencionVenta;
	//protected JButton jButtonCerrarReporteDinamicoRetencionVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoRetencionVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionRetencionVenta;
	//protected JButton jButtonGenerarImportacionRetencionVenta;
	//protected JButton jButtonCerrarImportacionRetencionVenta;
	//protected JFileChooser jFileChooserImportacionRetencionVenta;
	//protected File fileImportacionRetencionVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionVenta;
	protected JButton jButtonDuplicarToolBarRetencionVenta;
	protected JButton jButtonNuevoRelacionesToolBarRetencionVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarRetencionVenta;
	protected JButton jButtonCopiarToolBarRetencionVenta;
	protected JButton jButtonVerFormToolBarRetencionVenta;
	public JButton jButtonGuardarCambiosTablaToolBarRetencionVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionVenta;
	protected JButton jButtonCerrarToolBarRetencionVenta;
	
	protected JButton jButtonRecargarInformacionToolBarRetencionVenta;
	protected JButton jButtonProcesarInformacionToolBarRetencionVenta;
	protected JButton jButtonAnterioresToolBarRetencionVenta;
	protected JButton jButtonSiguientesToolBarRetencionVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarRetencionVenta;
	protected JButton jButtonAbrirOrderByToolBarRetencionVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionVenta;
	protected JMenuItem jMenuItemDuplicarRetencionVenta;
	protected JMenuItem jMenuItemNuevoRelacionesRetencionVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRetencionVenta;
	protected JMenuItem jMenuItemCopiarRetencionVenta;
	protected JMenuItem jMenuItemVerFormRetencionVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionVenta;
	protected JMenuItem jMenuItemCerrarRetencionVenta;
	protected JMenuItem jMenuItemDetalleCerrarRetencionVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRetencionVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionRetencionVenta;
	protected JMenuItem jMenuItemProcesarInformacionRetencionVenta;
	protected JMenuItem jMenuItemAnterioresRetencionVenta;
	protected JMenuItem jMenuItemSiguientesRetencionVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionVenta;
	protected JMenuItem jMenuItemAbrirOrderByRetencionVenta;
	protected JMenuItem jMenuItemMostrarOcultarRetencionVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRetencionVenta;
	protected JCheckBox jCheckBoxSeleccionadosRetencionVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRetencionVenta;
	protected JCheckBox jCheckBoxConGraficoReporteRetencionVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRetencionVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRetencionVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRetencionVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRetencionVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRetencionVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRetencionVenta;
	protected JTextField jTextFieldValorCampoGeneralRetencionVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRetencionVenta;
	//public JList<Reporte> jListColumnasSelectReporteRetencionVenta;
	//public JScrollPane jScrollColumnasSelectReporteRetencionVenta;
	
	//public JLabel jLabelRelacionesSelectReporteRetencionVenta;
	//public JList<Reporte> jListRelacionesSelectReporteRetencionVenta;
	//public JScrollPane jScrollRelacionesSelectReporteRetencionVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRetencionVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRetencionVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRetencionVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoRetencionVenta;
	
		
	//public JLabel jLabelArchivoImportacionRetencionVenta;	
	//public JLabel jLabelPathArchivoImportacionRetencionVenta;
	//protected JTextField jTextFieldPathArchivoImportacionRetencionVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRetencionVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRetencionVenta;
	
	//public JLabel jLabelColumnaCategoriaValorRetencionVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRetencionVenta;
	
	//public JLabel jLabelColumnasValoresGraficoRetencionVenta;
	//public JList<Reporte> jListColumnasValoresGraficoRetencionVenta;
	//public JScrollPane jScrollColumnasValoresGraficoRetencionVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRetencionVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRetencionVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRetencionVenta;
	public JPanel jPanelFK_IdPeriodoDeclaraRetencionVenta;
	public JButton jButtonFK_IdPeriodoDeclaraRetencionVenta;
	public JPanel jPanelFK_IdTipoRetencionRetencionVenta;
	public JButton jButtonFK_IdTipoRetencionRetencionVenta;
	
	public JPanel jPanelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta;
	public JLabel jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta;
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraRetencionVentaUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraRetencionVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionRetencionVenta;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionVenta= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionVentaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RetencionVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRetencionVenta)	{
		this.jButtonRecargarInformacionRetencionVenta = jButtonRecargarInformacionRetencionVenta;
	}
	
	public JButton getjButtonProcesarInformacionRetencionVenta() {
		return this.jButtonProcesarInformacionRetencionVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionVenta)	{
		this.jButtonProcesarInformacionRetencionVenta = jButtonProcesarInformacionRetencionVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionRetencionVenta() {
		return this.jButtonRecargarInformacionRetencionVenta;
	}
	
	
	public List<RetencionVenta> getretencionventas() {
		return this.retencionventas;
	}

	public void setretencionventas(List<RetencionVenta> retencionventas) {
		this.retencionventas = retencionventas;
	}
	
	public List<RetencionVenta> getretencionventasAux() {
		return this.retencionventasAux;
	}

	public void setretencionventasAux(List<RetencionVenta> retencionventasAux) {
		this.retencionventasAux = retencionventasAux;
	}
	
	public List<RetencionVenta> getretencionventasEliminados() {
		return this.retencionventasEliminados;
	}

	public void setRetencionVentasEliminados(List<RetencionVenta> retencionventasEliminados) {
		this.retencionventasEliminados = retencionventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRetencionVenta() {
		return jComboBoxTiposSeleccionarRetencionVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRetencionVenta(
			JComboBox jComboBoxTiposSeleccionarRetencionVenta) {
		this.jComboBoxTiposSeleccionarRetencionVenta = jComboBoxTiposSeleccionarRetencionVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRetencionVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRetencionVenta() {
		return jTextFieldValorCampoGeneralRetencionVenta;
	}

	public void setjTextFieldValorCampoGeneralRetencionVenta(
			JTextField jTextFieldValorCampoGeneralRetencionVenta) {
		this.jTextFieldValorCampoGeneralRetencionVenta = jTextFieldValorCampoGeneralRetencionVenta;
	}

	public void setBorderResaltarValorCampoGeneralRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRetencionVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRetencionVenta() {
		return this.jCheckBoxSeleccionarTodosRetencionVenta;
	}

	public void setjCheckBoxSeleccionarTodosRetencionVenta(
			JCheckBox jCheckBoxSeleccionarTodosRetencionVenta) {
		this.jCheckBoxSeleccionarTodosRetencionVenta = jCheckBoxSeleccionarTodosRetencionVenta;
	}

	public void setBorderResaltarSeleccionarTodosRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRetencionVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRetencionVenta() {
		return this.jCheckBoxSeleccionadosRetencionVenta;
	}

	public void setjCheckBoxSeleccionadosRetencionVenta(
			JCheckBox jCheckBoxSeleccionadosRetencionVenta) {
		this.jCheckBoxSeleccionadosRetencionVenta = jCheckBoxSeleccionadosRetencionVenta;
	}
	
	public void setBorderResaltarSeleccionadosRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRetencionVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRetencionVenta() {
		return this.jComboBoxTiposArchivosReportesRetencionVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRetencionVenta(
			JComboBox jComboBoxTiposArchivosReportesRetencionVenta) {
		this.jComboBoxTiposArchivosReportesRetencionVenta = jComboBoxTiposArchivosReportesRetencionVenta;
	}

	public void setBorderResaltarTiposArchivosReportesRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRetencionVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRetencionVenta() {
		return this.jComboBoxTiposReportesRetencionVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRetencionVenta(
			JComboBox jComboBoxTiposReportesRetencionVenta) {
		this.jComboBoxTiposReportesRetencionVenta = jComboBoxTiposReportesRetencionVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRetencionVenta() {
	//	return jComboBoxTiposReportesDinamicoRetencionVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRetencionVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoRetencionVenta) {
	//	this.jComboBoxTiposReportesDinamicoRetencionVenta = jComboBoxTiposReportesDinamicoRetencionVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRetencionVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoRetencionVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRetencionVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta = jComboBoxTiposArchivosReportesDinamicoRetencionVenta;
	//}
	
	public void setBorderResaltarTiposReportesRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRetencionVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRetencionVenta() {
		return this.jComboBoxTiposGraficosReportesRetencionVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRetencionVenta(
			JComboBox jComboBoxTiposGraficosReportesRetencionVenta) {
		this.jComboBoxTiposGraficosReportesRetencionVenta = jComboBoxTiposGraficosReportesRetencionVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRetencionVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRetencionVenta() {
		return this.jComboBoxTiposPaginacionRetencionVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRetencionVenta(
			JComboBox jComboBoxTiposPaginacionRetencionVenta) {
		this.jComboBoxTiposPaginacionRetencionVenta = jComboBoxTiposPaginacionRetencionVenta;
	}
	
	public void setBorderResaltarTiposPaginacionRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRetencionVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRetencionVenta() {
		return this.jComboBoxTiposRelacionesRetencionVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionVenta() {
		return this.jComboBoxTiposAccionesRetencionVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionVenta(
			JComboBox jComboBoxTiposRelacionesRetencionVenta) {
		this.jComboBoxTiposRelacionesRetencionVenta = jComboBoxTiposRelacionesRetencionVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionVenta(
			JComboBox jComboBoxTiposAccionesRetencionVenta) {
		this.jComboBoxTiposAccionesRetencionVenta = jComboBoxTiposAccionesRetencionVenta;
	}
	
	public void setBorderResaltarTiposRelacionesRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRetencionVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRetencionVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRetencionVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRetencionVenta() {
	//	return jCheckBoxConGraficoDinamicoRetencionVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoRetencionVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoRetencionVenta) {
	//	this.jCheckBoxConGraficoDinamicoRetencionVenta = jCheckBoxConGraficoDinamicoRetencionVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRetencionVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRetencionVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRetencionVenta .setBorder(borderResaltar);		
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
		this.retencionventaSessionBean=new RetencionVentaSessionBean();
		
		this.retencionventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion Venta MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
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
		
		RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRetencionVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"nuevo","nuevo","Nuevo"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"duplicar","duplicar","Duplicar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"copiar","copiar","Copiar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"ver_form","ver_form","Ver"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"recargar","recargar","Recargar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRetencionVenta,this.jTtoolBarRetencionVenta,
							"cerrar","cerrar","Salir"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRetencionVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRetencionVenta;
			
				this.jButtonProcesarInformacionToolBarRetencionVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRetencionVenta;
				
		//protected JButton jButtonModificarToolBarRetencionVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRetencionVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRetencionVenta=new JMenuMe("General");
		this.jmenuArchivoRetencionVenta=new JMenuMe("Archivo");
		this.jmenuAccionesRetencionVenta=new JMenuMe("Acciones");
		this.jmenuDatosRetencionVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRetencionVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRetencionVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRetencionVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRetencionVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRetencionVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRetencionVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRetencionVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRetencionVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRetencionVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRetencionVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRetencionVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRetencionVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRetencionVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRetencionVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencionVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencionVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRetencionVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRetencionVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRetencionVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRetencionVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRetencionVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRetencionVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRetencionVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRetencionVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRetencionVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRetencionVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRetencionVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRetencionVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRetencionVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRetencionVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRetencionVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRetencionVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRetencionVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRetencionVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRetencionVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRetencionVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRetencionVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRetencionVenta.add(this.jMenuItemCerrarRetencionVenta);
			
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemNuevoRetencionVenta);
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemNuevoGuardarCambiosRetencionVenta);
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemNuevoRelacionesRetencionVenta);
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemGuardarCambiosTablaRetencionVenta);		
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemDuplicarRetencionVenta);		
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemCopiarRetencionVenta);		
			this.jmenuAccionesRetencionVenta.add(this.jMenuItemVerFormRetencionVenta);		
			
			this.jmenuDatosRetencionVenta.add(this.jMenuItemRecargarInformacionRetencionVenta);				
			this.jmenuDatosRetencionVenta.add(this.jMenuItemAnterioresRetencionVenta);				
			this.jmenuDatosRetencionVenta.add(this.jMenuItemSiguientesRetencionVenta);				
			this.jmenuDatosRetencionVenta.add(this.jMenuItemAbrirOrderByRetencionVenta);				
			this.jmenuDatosRetencionVenta.add(this.jMenuItemMostrarOcultarRetencionVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRetencionVenta.add(this.jMenuItemGuardarCambiosRetencionVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRetencionVenta.add(this.jmenuArchivoRetencionVenta);		
			this.jmenuBarRetencionVenta.add(this.jmenuAccionesRetencionVenta);		
			this.jmenuBarRetencionVenta.add(this.jmenuDatosRetencionVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRetencionVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRetencionVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPeriodoDeclaraRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPeriodoDeclaraRetencionVenta.setToolTipText("Buscar Por Periodo Declara ");
		this.jButtonFK_IdPeriodoDeclaraRetencionVenta= new JButtonMe();
		this.jButtonFK_IdPeriodoDeclaraRetencionVenta.setText("Buscar");
		this.jButtonFK_IdPeriodoDeclaraRetencionVenta.setToolTipText("Buscar Por Periodo Declara ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPeriodoDeclaraRetencionVenta,"buscar_button","Buscar Por Periodo Declara ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPeriodoDeclaraRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta = new JLabelMe();
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setText("Periodo Declara :");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta= new JComboBoxMe();
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionRetencionVenta.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionRetencionVenta= new JButtonMe();
		this.jButtonFK_IdTipoRetencionRetencionVenta.setText("Buscar");
		this.jButtonFK_IdTipoRetencionRetencionVenta.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionRetencionVenta,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRetencionVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasRetencionVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRetencionVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRetencionVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRetencionVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRetencionVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRetencionVenta = new RetencionVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Retencion Venta DATOS");
			this.jInternalFrameDetalleFormRetencionVenta = new RetencionVentaDetalleFormJInternalFrame(jDesktopPane,this.retencionventaSessionBean.getConGuardarRelaciones(),this.retencionventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRetencionVenta = null;//new RetencionVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionVenta= new GridBagLayout();
		
		
		this.jTableDatosRetencionVenta = new JTableMe();      
		
		String sToolTipRetencionVenta="";
		sToolTipRetencionVenta=RetencionVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionVenta+="(Sris.RetencionVenta)";
		}
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRetencionVenta.setToolTipText(sToolTipRetencionVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRetencionVenta);
		this.jTableDatosRetencionVenta.setAutoCreateRowSorter(true);
		this.jTableDatosRetencionVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRetencionVenta.setRowSelectionAllowed(true);
		this.jTableDatosRetencionVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRetencionVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRetencionVenta = new JButtonMe();
		this.jButtonDuplicarRetencionVenta = new JButtonMe();
		this.jButtonCopiarRetencionVenta = new JButtonMe();
		this.jButtonVerFormRetencionVenta = new JButtonMe();
		this.jButtonNuevoRelacionesRetencionVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRetencionVenta = new JButtonMe();
		this.jButtonCerrarRetencionVenta = new JButtonMe();
		
		this.jScrollPanelDatosRetencionVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralRetencionVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion Venta";
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionVenta.setToolTipText("Acciones");
        this.jPanelAccionesRetencionVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRetencionVenta=new ReporteDinamicoJInternalFrame(RetencionVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRetencionVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRetencionVenta=new ImportacionJInternalFrame(RetencionVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRetencionVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRetencionVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByRetencionVenta.setText("Orden");
		this.jButtonAbrirOrderByRetencionVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionVenta,false,this);
			
			//this.cargarOrderByRetencionVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionVenta,true,this);
			
			//this.cargarOrderByRetencionVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRetencionVenta.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosRetencionVenta.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosRetencionVenta.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosRetencionVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRetencionVenta.setText("Nuevo");
		this.jButtonDuplicarRetencionVenta.setText("Duplicar");
		this.jButtonCopiarRetencionVenta.setText("Copiar");
		this.jButtonVerFormRetencionVenta.setText("Ver");
		this.jButtonNuevoRelacionesRetencionVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRetencionVenta.setText("Guardar");
		this.jButtonCerrarRetencionVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionVenta,"nuevo_button","Nuevo",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRetencionVenta,"duplicar_button","Duplicar",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRetencionVenta,"copiar_button","Copiar",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRetencionVenta,"ver_form","Ver",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRetencionVenta,"nuevorelaciones_button","Nuevo Rel",this.retencionventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionVenta,"guardarcambiostabla_button","Guardar",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionVenta,"cerrar_button","Salir",this.retencionventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRetencionVenta.setToolTipText("Nuevo"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRetencionVenta.setToolTipText("Duplicar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRetencionVenta.setToolTipText("Copiar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRetencionVenta.setToolTipText("Ver"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRetencionVenta.setToolTipText("Nuevo Rel"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRetencionVenta.setToolTipText("Guardar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionVenta.setToolTipText("Salir"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionVenta";
		inputMap = this.jButtonNuevoRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarRetencionVenta";
		inputMap = this.jButtonDuplicarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRetencionVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRetencionVenta"));
		
		//COPIAR
		sMapKey = "CopiarRetencionVenta";
		inputMap = this.jButtonCopiarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRetencionVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRetencionVenta"));
		
		//VEr FORM
		sMapKey = "VerFormRetencionVenta";
		inputMap = this.jButtonVerFormRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRetencionVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRetencionVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRetencionVenta";
		inputMap = this.jButtonNuevoRelacionesRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRetencionVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRetencionVenta";
		inputMap = this.jButtonModificarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRetencionVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRetencionVenta";
		inputMap = this.jButtonCerrarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionVenta";
		inputMap = this.jButtonGuardarCambiosTablaRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RetencionVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RetencionVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RetencionVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RetencionVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RetencionVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRetencionVenta.setName("jPanelParametrosReportesRetencionVenta"); 
		
		this.jPanelParametrosReportesAccionesRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRetencionVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRetencionVenta.setName("jPanelParametrosReportesAccionesRetencionVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRetencionVenta = new JButtonMe();
		this.jButtonRecargarInformacionRetencionVenta.setText("Recargar");
		this.jButtonRecargarInformacionRetencionVenta.setToolTipText("Recargar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRetencionVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRetencionVenta = new JButtonMe();
		this.jButtonProcesarInformacionRetencionVenta.setText("Procesar");
		this.jButtonProcesarInformacionRetencionVenta.setToolTipText("Procesar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRetencionVenta.setVisible(false);
			
		this.jButtonProcesarInformacionRetencionVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRetencionVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionVenta.setText("TIPO");       
		this.jComboBoxTiposReportesRetencionVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRetencionVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRetencionVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionRetencionVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRetencionVenta.setText("Accion");
		this.jComboBoxTiposRelacionesRetencionVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionVenta.setText("Accion");
		this.jComboBoxTiposAccionesRetencionVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRetencionVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarRetencionVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRetencionVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRetencionVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRetencionVenta = new JLabelMe();
		
		this.jLabelAccionesRetencionVenta.setText("Acciones");		
		this.jLabelAccionesRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRetencionVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRetencionVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRetencionVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRetencionVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRetencionVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRetencionVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRetencionVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRetencionVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRetencionVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRetencionVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRetencionVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteRetencionVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRetencionVenta = new JButtonMe();
		//this.jButtonAnterioresRetencionVenta.setText("<<");
        this.jButtonAnterioresRetencionVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRetencionVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRetencionVenta = new JButtonMe();
		//this.jButtonSiguientesRetencionVenta.setText(">>");
        this.jButtonSiguientesRetencionVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRetencionVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRetencionVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRetencionVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosRetencionVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRetencionVenta,"nuevoguardarcambios_button","Nue",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRetencionVenta";
		inputMap = this.jButtonNuevoGuardarCambiosRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRetencionVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRetencionVenta";
		inputMap = this.jButtonRecargarInformacionRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRetencionVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRetencionVenta";
		inputMap = this.jButtonSiguientesRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRetencionVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRetencionVenta";
		inputMap = this.jButtonAnterioresRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRetencionVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRetencionVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRetencionVenta.setMinimumSize(new Dimension(this.getWidth(),RetencionVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencionVenta.setMaximumSize(new Dimension(this.getWidth(),RetencionVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencionVenta.setPreferredSize(new Dimension(this.getWidth(),RetencionVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRetencionVenta = new GridBagLayout();

			this.jPanelPaginacionRetencionVenta.setLayout(gridaBagLayoutPaginacionRetencionVenta);						
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 0;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRetencionVenta.add(this.jButtonAnterioresRetencionVenta, this.gridBagConstraintsRetencionVenta);
					
						
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionVenta.gridy = 0;
			
			this.jPanelPaginacionRetencionVenta.add(this.jButtonNuevoGuardarCambiosRetencionVenta, this.gridBagConstraintsRetencionVenta);
						
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionVenta.gridy = 0;
			this.jPanelPaginacionRetencionVenta.add(this.jButtonSiguientesRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 1;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionVenta.add(this.jButtonNuevoRetencionVenta, this.gridBagConstraintsRetencionVenta);
						
			
			
			if(!this.retencionventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
				this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRetencionVenta.gridy = 1;
				this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRetencionVenta.add(this.jButtonGuardarCambiosTablaRetencionVenta, this.gridBagConstraintsRetencionVenta);
			}
			
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 1;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionVenta.add(this.jButtonDuplicarRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 1;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionVenta.add(this.jButtonCopiarRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 1;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionVenta.add(this.jButtonVerFormRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 1;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRetencionVenta.add(this.jButtonCerrarRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		
		this.jButtonRecargarInformacionRetencionVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRetencionVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRetencionVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRetencionVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRetencionVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRetencionVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRetencionVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRetencionVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRetencionVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRetencionVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRetencionVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRetencionVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRetencionVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRetencionVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RetencionVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RetencionVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RetencionVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RetencionVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRetencionVenta.setLayout(gridaBagParametrosReportesRetencionVenta);
			this.jPanelParametrosReportesAccionesRetencionVenta.setLayout(gridaBagParametrosReportesAccionesRetencionVenta);
			
			
			this.jPanelParametrosAuxiliar1RetencionVenta.setLayout(gridaBagParametrosAuxiliar1RetencionVenta);
			this.jPanelParametrosAuxiliar2RetencionVenta.setLayout(gridaBagParametrosAuxiliar2RetencionVenta);
			this.jPanelParametrosAuxiliar3RetencionVenta.setLayout(gridaBagParametrosAuxiliar3RetencionVenta);
			this.jPanelParametrosAuxiliar4RetencionVenta.setLayout(gridaBagParametrosAuxiliar4RetencionVenta);
			//this.jPanelParametrosAuxiliar5RetencionVenta.setLayout(gridaBagParametrosAuxiliar2RetencionVenta);			
			
			
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionVenta.add(this.jButtonRecargarInformacionRetencionVenta, this.gridBagConstraintsRetencionVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionVenta.add(this.jComboBoxTiposPaginacionRetencionVenta, this.gridBagConstraintsRetencionVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionVenta.add(this.jCheckBoxConAltoMaximoTablaRetencionVenta, this.gridBagConstraintsRetencionVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionVenta.add(this.jComboBoxTiposArchivosReportesRetencionVenta, this.gridBagConstraintsRetencionVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionVenta.add(this.jPanelParametrosAuxiliar1RetencionVenta, this.gridBagConstraintsRetencionVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RetencionVenta.add(this.jComboBoxTiposReportesRetencionVenta, this.gridBagConstraintsRetencionVenta);																		
			
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RetencionVenta.add(this.jComboBoxTiposGraficosReportesRetencionVenta, this.gridBagConstraintsRetencionVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionVenta.add(this.jPanelParametrosAuxiliar4RetencionVenta, this.gridBagConstraintsRetencionVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionVenta.add(this.jComboBoxTiposReportesRetencionVenta, this.gridBagConstraintsRetencionVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionVenta.add(this.jCheckBoxGenerarReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionVenta.add(this.jPanelParametrosAuxiliar2RetencionVenta, this.gridBagConstraintsRetencionVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionVenta.add(this.jLabelAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
				this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRetencionVenta.add(this.jButtonAbrirOrderByRetencionVenta, this.gridBagConstraintsRetencionVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionVenta.add(this.jComboBoxTiposSeleccionarRetencionVenta, this.gridBagConstraintsRetencionVenta);			
			
			
			/*
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionVenta.add(this.jCheckBoxSeleccionarTodosRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionVenta.add(this.jCheckBoxConGraficoReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionVenta.add(this.jCheckBoxSeleccionarTodosRetencionVenta, this.gridBagConstraintsRetencionVenta);															
				
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionVenta.add(this.jCheckBoxSeleccionadosRetencionVenta, this.gridBagConstraintsRetencionVenta);															
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionVenta.add(this.jCheckBoxConGraficoReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionVenta.add(this.jPanelParametrosAuxiliar3RetencionVenta, this.gridBagConstraintsRetencionVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionVenta.add(this.jComboBoxTiposAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);
	
				
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionVenta.add(this.jTextFieldValorCampoGeneralRetencionVenta, this.gridBagConstraintsRetencionVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRetencionVenta = new GridBagLayout();

			this.jScrollPanelDatosRetencionVenta.setLayout(gridaBagLayoutDatosRetencionVenta);
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = 0;
			this.gridBagConstraintsRetencionVenta.gridx = 0;
			
			this.jScrollPanelDatosRetencionVenta.add(this.jTableDatosRetencionVenta, this.gridBagConstraintsRetencionVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRetencionVenta.setViewportView(this.jTableDatosRetencionVenta);
		this.jTableDatosRetencionVenta.setFillsViewportHeight(true);
		this.jTableDatosRetencionVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRetencionVenta= new GridBagLayout();
		this.jPanelAccionesRetencionVenta.setLayout(gridaBagLayoutAccionesRetencionVenta);
		
		
		/*	
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 0;
			
		this.jPanelAccionesRetencionVenta.add(this.jButtonNuevoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPeriodoDeclaraRetencionVenta= new GridBagLayout();
		gridaBagLayoutFK_IdPeriodoDeclaraRetencionVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraRetencionVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraRetencionVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPeriodoDeclaraRetencionVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPeriodoDeclaraRetencionVenta.setLayout(gridaBagLayoutFK_IdPeriodoDeclaraRetencionVenta);

		gridBagConstraintsRetencionVenta = new GridBagConstraints();
		gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionVenta.gridy = 0;
		gridBagConstraintsRetencionVenta.gridx = 0;
		jPanelFK_IdPeriodoDeclaraRetencionVenta.add(jLabelid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta, gridBagConstraintsRetencionVenta);

		gridBagConstraintsRetencionVenta = new GridBagConstraints();
		gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionVenta.gridy = 0;
		gridBagConstraintsRetencionVenta.gridx = 1;
		jPanelFK_IdPeriodoDeclaraRetencionVenta.add(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta, gridBagConstraintsRetencionVenta);

		gridBagConstraintsRetencionVenta = new GridBagConstraints();
		gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionVenta.gridy = 1;
		gridBagConstraintsRetencionVenta.gridx =1;
		jPanelFK_IdPeriodoDeclaraRetencionVenta.add(jButtonFK_IdPeriodoDeclaraRetencionVenta, gridBagConstraintsRetencionVenta);

		jTabbedPaneBusquedasRetencionVenta.addTab("1.-Por Periodo Declara ", jPanelFK_IdPeriodoDeclaraRetencionVenta);
		jTabbedPaneBusquedasRetencionVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionRetencionVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionRetencionVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionRetencionVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionRetencionVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionRetencionVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionRetencionVenta.setLayout(gridaBagLayoutFK_IdTipoRetencionRetencionVenta);

		gridBagConstraintsRetencionVenta = new GridBagConstraints();
		gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionVenta.gridy = 0;
		gridBagConstraintsRetencionVenta.gridx = 0;
		jPanelFK_IdTipoRetencionRetencionVenta.add(jLabelid_tipo_retencionFK_IdTipoRetencionRetencionVenta, gridBagConstraintsRetencionVenta);

		gridBagConstraintsRetencionVenta = new GridBagConstraints();
		gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionVenta.gridy = 0;
		gridBagConstraintsRetencionVenta.gridx = 1;
		jPanelFK_IdTipoRetencionRetencionVenta.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta, gridBagConstraintsRetencionVenta);

		gridBagConstraintsRetencionVenta = new GridBagConstraints();
		gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionVenta.gridy = 1;
		gridBagConstraintsRetencionVenta.gridx =1;
		jPanelFK_IdTipoRetencionRetencionVenta.add(jButtonFK_IdTipoRetencionRetencionVenta, gridBagConstraintsRetencionVenta);

		jTabbedPaneBusquedasRetencionVenta.addTab("2.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionRetencionVenta);
		jTabbedPaneBusquedasRetencionVenta.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();						
			this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionVenta.gridx = 0;		
			//this.gridBagConstraintsRetencionVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRetencionVenta, this.gridBagConstraintsRetencionVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRetencionVenta.gridx = 0;		
		//this.gridBagConstraintsRetencionVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRetencionVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRetencionVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionVenta.gridx = 0;		
			this.gridBagConstraintsRetencionVenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRetencionVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRetencionVenta, this.gridBagConstraintsRetencionVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRetencionVenta, this.gridBagConstraintsRetencionVenta);								
		
		
		/*
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);
		*/		
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionVenta.gridx =0;
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionVenta, this.gridBagConstraintsRetencionVenta);
				
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRetencionVenta, this.gridBagConstraintsRetencionVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRetencionVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosRetencionVenta.setLayout(gridaBagLayoutBusquedasParametrosRetencionVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRetencionVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRetencionVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRetencionVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRetencionVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRetencionVenta.setName("jPanelReporteDinamicoRetencionVenta"); 
		
		this.jPanelReporteDinamicoRetencionVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRetencionVenta.setLayout(gridaBagLayoutReporteDinamicoRetencionVenta);
		
		
		this.jInternalFrameReporteDinamicoRetencionVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRetencionVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRetencionVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRetencionVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRetencionVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRetencionVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRetencionVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRetencionVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoRetencionVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoRetencionVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRetencionVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRetencionVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteRetencionVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelColumnasSelectReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRetencionVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteRetencionVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRetencionVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRetencionVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRetencionVenta=new JScrollPane(this.jListColumnasSelectReporteRetencionVenta);
			
			this.jScrollColumnasSelectReporteRetencionVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRetencionVenta.add(this.jListColumnasSelectReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);
		this.jPanelReporteDinamicoRetencionVenta.add(this.jScrollColumnasSelectReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRetencionVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteRetencionVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRetencionVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteRetencionVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRetencionVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRetencionVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRetencionVenta=new JScrollPane(this.jListRelacionesSelectReporteRetencionVenta);
			
			this.jScrollRelacionesSelectReporteRetencionVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRetencionVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRetencionVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoRetencionVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRetencionVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRetencionVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRetencionVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRetencionVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoRetencionVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelConGraficoDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRetencionVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRetencionVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRetencionVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRetencionVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jCheckBoxConGraficoDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRetencionVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRetencionVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelColumnaCategoriaGraficoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRetencionVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRetencionVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRetencionVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRetencionVenta.add(this.jComboBoxColumnaCategoriaGraficoRetencionVenta, this.gridBagConstraintsRetencionVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRetencionVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorRetencionVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelColumnaCategoriaValorRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRetencionVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRetencionVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRetencionVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRetencionVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRetencionVenta.add(this.jComboBoxColumnaCategoriaValorRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRetencionVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoRetencionVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelColumnasValoresGraficoRetencionVenta, this.gridBagConstraintsRetencionVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRetencionVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoRetencionVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRetencionVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRetencionVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRetencionVenta=new JScrollPane(this.jListColumnasValoresGraficoRetencionVenta);
			
			this.jScrollColumnasValoresGraficoRetencionVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRetencionVenta.add(this.jListColumnasSelectReporteRetencionVenta, this.gridBagConstraintsRetencionVenta);
		this.jPanelReporteDinamicoRetencionVenta.add(this.jScrollColumnasValoresGraficoRetencionVenta, this.gridBagConstraintsRetencionVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRetencionVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRetencionVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelTiposGraficosReportesDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRetencionVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRetencionVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRetencionVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jComboBoxTiposGraficosReportesDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRetencionVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRetencionVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelGenerarExcelReporteDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRetencionVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRetencionVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRetencionVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRetencionVenta.setToolTipText("Generar EXCEL"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRetencionVenta.add(this.jButtonGenerarExcelReporteDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionVenta.add(this.jComboBoxTiposReportesDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRetencionVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRetencionVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionVenta.add(this.jLabelTiposArchivoReporteDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionVenta.add(this.jComboBoxTiposArchivosReportesDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRetencionVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRetencionVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRetencionVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRetencionVenta.setToolTipText("Generar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionVenta.add(this.jButtonGenerarReporteDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRetencionVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRetencionVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRetencionVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRetencionVenta.setToolTipText("Cancelar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionVenta.add(this.jButtonCerrarReporteDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRetencionVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRetencionVenta= new JScrollPane(jPanelReporteDinamicoRetencionVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRetencionVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRetencionVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRetencionVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRetencionVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRetencionVenta);
		this.jInternalFrameReporteDinamicoRetencionVenta.getContentPane().add(this.jScrollPanelReporteDinamicoRetencionVenta, this.gridBagConstraintsRetencionVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRetencionVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRetencionVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRetencionVenta.setName("jPanelImportacionRetencionVenta"); 
		
		this.jPanelImportacionRetencionVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRetencionVenta.setLayout(gridaBagLayoutImportacionRetencionVenta);
		
		
		this.jInternalFrameImportacionRetencionVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRetencionVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRetencionVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRetencionVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRetencionVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionVenta.setResizable(true);
	    this.jInternalFrameImportacionRetencionVenta.setClosable(true);
	    this.jInternalFrameImportacionRetencionVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRetencionVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRetencionVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionVenta.setResizable(true);
	    this.jInternalFrameImportacionRetencionVenta.setClosable(true);
	    this.jInternalFrameImportacionRetencionVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRetencionVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRetencionVenta = new JLabelMe();

		this.jLabelArchivoImportacionRetencionVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionVenta.add(this.jLabelArchivoImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRetencionVenta = new JFileChooser();		
		this.jFileChooserImportacionRetencionVenta.setToolTipText("ESCOGER ARCHIVO"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRetencionVenta = new JButtonMe();
		this.jButtonAbrirImportacionRetencionVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRetencionVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRetencionVenta.setToolTipText("Generar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionVenta.add(this.jButtonAbrirImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRetencionVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionRetencionVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionVenta.add(this.jLabelPathArchivoImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRetencionVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRetencionVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionVenta.add(this.jTextFieldPathArchivoImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRetencionVenta = new JButtonMe();
		this.jButtonGenerarImportacionRetencionVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRetencionVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRetencionVenta.setToolTipText("Generar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionVenta.add(this.jButtonGenerarImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRetencionVenta = new JButtonMe();
		this.jButtonCerrarImportacionRetencionVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRetencionVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRetencionVenta.setToolTipText("Cancelar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionVenta.add(this.jButtonCerrarImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRetencionVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionRetencionVenta= new JScrollPane(jPanelImportacionRetencionVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsRetencionVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRetencionVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRetencionVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRetencionVenta);
		this.jInternalFrameImportacionRetencionVenta.getContentPane().add(this.jScrollPanelImportacionRetencionVenta, this.gridBagConstraintsRetencionVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRetencionVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRetencionVenta = new JButtonMe();
			this.jButtonAbrirOrderByRetencionVenta.setText("Orden");
			this.jButtonAbrirOrderByRetencionVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRetencionVenta";
			inputMap = this.jButtonAbrirOrderByRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRetencionVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByRetencionVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRetencionVenta.setName("jPanelOrderByRetencionVenta"); 
			
			this.jPanelOrderByRetencionVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRetencionVenta.setLayout(gridaBagLayoutOrderByRetencionVenta);
			
			
			this.jTableDatosRetencionVentaOrderBy = new JTableMe();        
			this.jTableDatosRetencionVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRetencionVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRetencionVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRetencionVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRetencionVentaOrderBy.setViewportView(this.jTableDatosRetencionVentaOrderBy);
			this.jTableDatosRetencionVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRetencionVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRetencionVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRetencionVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRetencionVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRetencionVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRetencionVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRetencionVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRetencionVenta.setTitle("Orden");
			this.jInternalFrameOrderByRetencionVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRetencionVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRetencionVenta.setResizable(true);
			this.jInternalFrameOrderByRetencionVenta.setClosable(true);
			this.jInternalFrameOrderByRetencionVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRetencionVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRetencionVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRetencionVenta.ipady =150;
				
			this.jPanelOrderByRetencionVenta.add(jScrollPanelDatosRetencionVentaOrderBy, this.gridBagConstraintsRetencionVenta);//this.jTableDatosRetencionVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRetencionVenta = new JButtonMe();
			this.jButtonCerrarOrderByRetencionVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRetencionVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRetencionVenta.setToolTipText("Cancelar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRetencionVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRetencionVenta.add(this.jButtonCerrarOrderByRetencionVenta, this.gridBagConstraintsRetencionVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRetencionVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByRetencionVenta= new JScrollPane(jPanelOrderByRetencionVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsRetencionVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRetencionVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRetencionVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRetencionVenta);
			
			this.jInternalFrameOrderByRetencionVenta.getContentPane().add(this.jScrollPanelOrderByRetencionVenta, this.gridBagConstraintsRetencionVenta);			
		
		} else {
			this.jButtonAbrirOrderByRetencionVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.retencionventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRetencionVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRetencionVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRetencionVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRetencionVenta.getRowHeight();//RetencionVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RetencionVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionVenta.isSelected()) {
					iHeightTable=RetencionVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RetencionVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionVenta.isSelected()) {
					iHeightTable=RetencionVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRetencionVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRetencionVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRetencionVenta!=null && this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRetencionVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRetencionVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRetencionVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRetencionVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=retencionventaLogic.getRetencionVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RetencionVenta> TraerRetencionVentaBeans(List<RetencionVenta> retencionventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(RetencionVenta retencionventa:retencionventas) {
					
				if(!(RetencionVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RetencionVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					retencionventa.setsDetalleGeneralEntityReporte(RetencionVentaConstantesFunciones.getRetencionVentaDescripcion(retencionventa));
										
					retencionventa.setes_debito_descripcion(RetencionVentaConstantesFunciones.getes_debitoDescripcion(retencionventa));	
					
						
					
				} else  {
							
					//retencionventa.setsDetalleGeneralEntityReporte(retencionventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//retencionventabeans.add(retencionventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return retencionventas;
    }
	//PARA REPORTES FIN
}
