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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.SriRetencionesConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class SriRetencionesJInternalFrame extends SriRetencionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSriRetenciones;
	
	protected JMenuBar jmenuBarSriRetenciones;
	
	protected JMenu jmenuSriRetenciones;
	protected JMenu jmenuDatosSriRetenciones;
	protected JMenu jmenuArchivoSriRetenciones;
	protected JMenu jmenuAccionesSriRetenciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriRetenciones;	
	protected GridBagConstraints gridBagConstraintsSriRetenciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SriRetencionesDetalleFormJInternalFrame jInternalFrameDetalleFormSriRetenciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSriRetenciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSriRetenciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";
	
	public SriRetencionesSessionBean sriretencionesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SriRetenciones> sriretencioness;		
	public List<SriRetenciones> sriretencionessEliminados;	
	public List<SriRetenciones> sriretencionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySriRetenciones;		
	protected JButton jButtonAbrirOrderBySriRetenciones;
	
	
	//protected JPanel jPanelOrderBySriRetenciones;
	//public JScrollPane jScrollPanelOrderBySriRetenciones;	
	//protected JButton jButtonCerrarOrderBySriRetenciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SriRetencionesLogic sriretencionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSriRetenciones;
	public JScrollPane jScrollPanelDatosEdicionSriRetenciones;
	public JScrollPane jScrollPanelDatosGeneralSriRetenciones;
    
	
	
	//public JScrollPane jScrollPanelDatosSriRetencionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSriRetenciones;
	//public JScrollPane jScrollPanelImportacionSriRetenciones;
	
	
	
	protected JPanel jPanelAccionesSriRetenciones;
	
    protected JPanel jPanelPaginacionSriRetenciones;
    protected JPanel jPanelParametrosReportesSriRetenciones;
	protected JPanel jPanelParametrosReportesAccionesSriRetenciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SriRetenciones;
	protected JPanel jPanelParametrosAuxiliar2SriRetenciones;
	protected JPanel jPanelParametrosAuxiliar3SriRetenciones;
	protected JPanel jPanelParametrosAuxiliar4SriRetenciones;
	//protected JPanel jPanelParametrosAuxiliar5SriRetenciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoSriRetenciones;
	//protected JPanel jPanelImportacionSriRetenciones;
	
	
	public JTable jTableDatosSriRetenciones;
	
	
	
	//public JTable jTableDatosSriRetencionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSriRetenciones;
	protected JButton jButtonDuplicarSriRetenciones;
	protected JButton jButtonCopiarSriRetenciones;
	protected JButton jButtonVerFormSriRetenciones;
	protected JButton jButtonNuevoRelacionesSriRetenciones;
	protected JButton jButtonModificarSriRetenciones;
	
    protected JButton jButtonGuardarCambiosTablaSriRetenciones;
	protected JButton jButtonCerrarSriRetenciones;
	
	
	protected JButton jButtonRecargarInformacionSriRetenciones;
	protected JButton jButtonProcesarInformacionSriRetenciones;
	
	
	protected JButton jButtonAnterioresSriRetenciones;
	protected JButton jButtonSiguientesSriRetenciones;
	protected JButton jButtonNuevoGuardarCambiosSriRetenciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSriRetenciones;
	//protected JButton jButtonCerrarReporteDinamicoSriRetenciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoSriRetenciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionSriRetenciones;
	//protected JButton jButtonGenerarImportacionSriRetenciones;
	//protected JButton jButtonCerrarImportacionSriRetenciones;
	//protected JFileChooser jFileChooserImportacionSriRetenciones;
	//protected File fileImportacionSriRetenciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriRetenciones;
	protected JButton jButtonDuplicarToolBarSriRetenciones;
	protected JButton jButtonNuevoRelacionesToolBarSriRetenciones;
	
	
	public JButton jButtonGuardarCambiosToolBarSriRetenciones;
	protected JButton jButtonCopiarToolBarSriRetenciones;
	protected JButton jButtonVerFormToolBarSriRetenciones;
	public JButton jButtonGuardarCambiosTablaToolBarSriRetenciones;
	protected JButton jButtonMostrarOcultarTablaToolBarSriRetenciones;
	protected JButton jButtonCerrarToolBarSriRetenciones;
	
	protected JButton jButtonRecargarInformacionToolBarSriRetenciones;
	protected JButton jButtonProcesarInformacionToolBarSriRetenciones;
	protected JButton jButtonAnterioresToolBarSriRetenciones;
	protected JButton jButtonSiguientesToolBarSriRetenciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarSriRetenciones;
	protected JButton jButtonAbrirOrderByToolBarSriRetenciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriRetenciones;
	protected JMenuItem jMenuItemDuplicarSriRetenciones;
	protected JMenuItem jMenuItemNuevoRelacionesSriRetenciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSriRetenciones;
	protected JMenuItem jMenuItemCopiarSriRetenciones;
	protected JMenuItem jMenuItemVerFormSriRetenciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriRetenciones;
	protected JMenuItem jMenuItemCerrarSriRetenciones;
	protected JMenuItem jMenuItemDetalleCerrarSriRetenciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySriRetenciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriRetenciones;
	
	protected JMenuItem jMenuItemRecargarInformacionSriRetenciones;
	protected JMenuItem jMenuItemProcesarInformacionSriRetenciones;
	protected JMenuItem jMenuItemAnterioresSriRetenciones;
	protected JMenuItem jMenuItemSiguientesSriRetenciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriRetenciones;
	protected JMenuItem jMenuItemAbrirOrderBySriRetenciones;
	protected JMenuItem jMenuItemMostrarOcultarSriRetenciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriRetenciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSriRetenciones;
	protected JCheckBox jCheckBoxSeleccionadosSriRetenciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSriRetenciones;
	protected JCheckBox jCheckBoxConGraficoReporteSriRetenciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSriRetenciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSriRetenciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSriRetenciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSriRetenciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSriRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSriRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSriRetenciones;
	protected JTextField jTextFieldValorCampoGeneralSriRetenciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSriRetenciones;
	//public JList<Reporte> jListColumnasSelectReporteSriRetenciones;
	//public JScrollPane jScrollColumnasSelectReporteSriRetenciones;
	
	//public JLabel jLabelRelacionesSelectReporteSriRetenciones;
	//public JList<Reporte> jListRelacionesSelectReporteSriRetenciones;
	//public JScrollPane jScrollRelacionesSelectReporteSriRetenciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSriRetenciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSriRetenciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSriRetenciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoSriRetenciones;
	
		
	//public JLabel jLabelArchivoImportacionSriRetenciones;	
	//public JLabel jLabelPathArchivoImportacionSriRetenciones;
	//protected JTextField jTextFieldPathArchivoImportacionSriRetenciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSriRetenciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSriRetenciones;
	
	//public JLabel jLabelColumnaCategoriaValorSriRetenciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSriRetenciones;
	
	//public JLabel jLabelColumnasValoresGraficoSriRetenciones;
	//public JList<Reporte> jListColumnasValoresGraficoSriRetenciones;
	//public JScrollPane jScrollColumnasValoresGraficoSriRetenciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSriRetenciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSriRetenciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSriRetenciones;
	public JPanel jPanelBusquedaSriRetencionesSriRetenciones;
	public JButton jButtonBusquedaSriRetencionesSriRetenciones;
	
	public JPanel jPanelid_ejercicioBusquedaSriRetencionesSriRetenciones;
	public JLabel jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones;
	public JButton jButtonid_ejercicioBusquedaSriRetencionesSriRetenciones= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaSriRetencionesSriRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaSriRetencionesSriRetencionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodo_declaraBusquedaSriRetencionesSriRetenciones;
	public JLabel jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones;
	public JButton jButtonid_periodo_declaraBusquedaSriRetencionesSriRetenciones= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriRetencionesSriRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriRetencionesSriRetencionesBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaSriRetencionesSriRetenciones;
	public JLabel jLabelrucBusquedaSriRetencionesSriRetenciones;
	public JTextField jTextFieldrucBusquedaSriRetencionesSriRetenciones;
	public JButton jButtonrucBusquedaSriRetencionesSriRetencionesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SriRetencionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSriRetenciones)	{
		this.jButtonRecargarInformacionSriRetenciones = jButtonRecargarInformacionSriRetenciones;
	}
	
	public JButton getjButtonProcesarInformacionSriRetenciones() {
		return this.jButtonProcesarInformacionSriRetenciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriRetenciones)	{
		this.jButtonProcesarInformacionSriRetenciones = jButtonProcesarInformacionSriRetenciones;
	}
	
	
	public JButton getjButtonRecargarInformacionSriRetenciones() {
		return this.jButtonRecargarInformacionSriRetenciones;
	}
	
	
	public List<SriRetenciones> getsriretencioness() {
		return this.sriretencioness;
	}

	public void setsriretencioness(List<SriRetenciones> sriretencioness) {
		this.sriretencioness = sriretencioness;
	}
	
	public List<SriRetenciones> getsriretencionessAux() {
		return this.sriretencionessAux;
	}

	public void setsriretencionessAux(List<SriRetenciones> sriretencionessAux) {
		this.sriretencionessAux = sriretencionessAux;
	}
	
	public List<SriRetenciones> getsriretencionessEliminados() {
		return this.sriretencionessEliminados;
	}

	public void setSriRetencionessEliminados(List<SriRetenciones> sriretencionessEliminados) {
		this.sriretencionessEliminados = sriretencionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSriRetenciones() {
		return jComboBoxTiposSeleccionarSriRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSriRetenciones(
			JComboBox jComboBoxTiposSeleccionarSriRetenciones) {
		this.jComboBoxTiposSeleccionarSriRetenciones = jComboBoxTiposSeleccionarSriRetenciones;
	}
	
	public void setBorderResaltarTiposSeleccionarSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSriRetenciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSriRetenciones() {
		return jTextFieldValorCampoGeneralSriRetenciones;
	}

	public void setjTextFieldValorCampoGeneralSriRetenciones(
			JTextField jTextFieldValorCampoGeneralSriRetenciones) {
		this.jTextFieldValorCampoGeneralSriRetenciones = jTextFieldValorCampoGeneralSriRetenciones;
	}

	public void setBorderResaltarValorCampoGeneralSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSriRetenciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSriRetenciones() {
		return this.jCheckBoxSeleccionarTodosSriRetenciones;
	}

	public void setjCheckBoxSeleccionarTodosSriRetenciones(
			JCheckBox jCheckBoxSeleccionarTodosSriRetenciones) {
		this.jCheckBoxSeleccionarTodosSriRetenciones = jCheckBoxSeleccionarTodosSriRetenciones;
	}

	public void setBorderResaltarSeleccionarTodosSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSriRetenciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSriRetenciones() {
		return this.jCheckBoxSeleccionadosSriRetenciones;
	}

	public void setjCheckBoxSeleccionadosSriRetenciones(
			JCheckBox jCheckBoxSeleccionadosSriRetenciones) {
		this.jCheckBoxSeleccionadosSriRetenciones = jCheckBoxSeleccionadosSriRetenciones;
	}
	
	public void setBorderResaltarSeleccionadosSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSriRetenciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSriRetenciones() {
		return this.jComboBoxTiposArchivosReportesSriRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSriRetenciones(
			JComboBox jComboBoxTiposArchivosReportesSriRetenciones) {
		this.jComboBoxTiposArchivosReportesSriRetenciones = jComboBoxTiposArchivosReportesSriRetenciones;
	}

	public void setBorderResaltarTiposArchivosReportesSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSriRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSriRetenciones() {
		return this.jComboBoxTiposReportesSriRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSriRetenciones(
			JComboBox jComboBoxTiposReportesSriRetenciones) {
		this.jComboBoxTiposReportesSriRetenciones = jComboBoxTiposReportesSriRetenciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSriRetenciones() {
	//	return jComboBoxTiposReportesDinamicoSriRetenciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSriRetenciones(
	//		JComboBox jComboBoxTiposReportesDinamicoSriRetenciones) {
	//	this.jComboBoxTiposReportesDinamicoSriRetenciones = jComboBoxTiposReportesDinamicoSriRetenciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSriRetenciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoSriRetenciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSriRetenciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSriRetenciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones = jComboBoxTiposArchivosReportesDinamicoSriRetenciones;
	//}
	
	public void setBorderResaltarTiposReportesSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSriRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSriRetenciones() {
		return this.jComboBoxTiposGraficosReportesSriRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSriRetenciones(
			JComboBox jComboBoxTiposGraficosReportesSriRetenciones) {
		this.jComboBoxTiposGraficosReportesSriRetenciones = jComboBoxTiposGraficosReportesSriRetenciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSriRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSriRetenciones() {
		return this.jComboBoxTiposPaginacionSriRetenciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSriRetenciones(
			JComboBox jComboBoxTiposPaginacionSriRetenciones) {
		this.jComboBoxTiposPaginacionSriRetenciones = jComboBoxTiposPaginacionSriRetenciones;
	}
	
	public void setBorderResaltarTiposPaginacionSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSriRetenciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSriRetenciones() {
		return this.jComboBoxTiposRelacionesSriRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriRetenciones() {
		return this.jComboBoxTiposAccionesSriRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriRetenciones(
			JComboBox jComboBoxTiposRelacionesSriRetenciones) {
		this.jComboBoxTiposRelacionesSriRetenciones = jComboBoxTiposRelacionesSriRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriRetenciones(
			JComboBox jComboBoxTiposAccionesSriRetenciones) {
		this.jComboBoxTiposAccionesSriRetenciones = jComboBoxTiposAccionesSriRetenciones;
	}
	
	public void setBorderResaltarTiposRelacionesSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSriRetenciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSriRetenciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSriRetenciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSriRetenciones() {
	//	return jCheckBoxConGraficoDinamicoSriRetenciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoSriRetenciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoSriRetenciones) {
	//	this.jCheckBoxConGraficoDinamicoSriRetenciones = jCheckBoxConGraficoDinamicoSriRetenciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSriRetenciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSriRetenciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSriRetenciones .setBorder(borderResaltar);		
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
		this.sriretencionesSessionBean=new SriRetencionesSessionBean();
		
		this.sriretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sriretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sriretencionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SriRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SriRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriRetencionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Retenciones MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
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
		
		SriRetencionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSriRetenciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"nuevo","nuevo","Nuevo"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"duplicar","duplicar","Duplicar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"copiar","copiar","Copiar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"ver_form","ver_form","Ver"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"recargar","recargar","Buscar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSriRetenciones,this.jTtoolBarSriRetenciones,
							"cerrar","cerrar","Salir"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSriRetenciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSriRetenciones;
			
				this.jButtonProcesarInformacionToolBarSriRetenciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSriRetenciones;
				
		//protected JButton jButtonModificarToolBarSriRetenciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSriRetenciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSriRetenciones=new JMenuMe("General");
		this.jmenuArchivoSriRetenciones=new JMenuMe("Archivo");
		this.jmenuAccionesSriRetenciones=new JMenuMe("Acciones");
		this.jmenuDatosSriRetenciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriRetenciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriRetenciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriRetenciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSriRetenciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSriRetenciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSriRetenciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSriRetenciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSriRetenciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSriRetenciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSriRetenciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriRetenciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriRetenciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSriRetenciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSriRetenciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSriRetenciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSriRetenciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSriRetenciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSriRetenciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSriRetenciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSriRetenciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSriRetenciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriRetenciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriRetenciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriRetenciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSriRetenciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSriRetenciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSriRetenciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSriRetenciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSriRetenciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSriRetenciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSriRetenciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSriRetenciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSriRetenciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSriRetenciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSriRetenciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSriRetenciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySriRetenciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySriRetenciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySriRetenciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySriRetenciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySriRetenciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySriRetenciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSriRetenciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSriRetenciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSriRetenciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSriRetenciones.add(this.jMenuItemCerrarSriRetenciones);
			
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemNuevoSriRetenciones);
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemNuevoGuardarCambiosSriRetenciones);
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemNuevoRelacionesSriRetenciones);
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemGuardarCambiosTablaSriRetenciones);		
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemDuplicarSriRetenciones);		
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemCopiarSriRetenciones);		
			this.jmenuAccionesSriRetenciones.add(this.jMenuItemVerFormSriRetenciones);		
			
			this.jmenuDatosSriRetenciones.add(this.jMenuItemRecargarInformacionSriRetenciones);				
			this.jmenuDatosSriRetenciones.add(this.jMenuItemAnterioresSriRetenciones);				
			this.jmenuDatosSriRetenciones.add(this.jMenuItemSiguientesSriRetenciones);				
			this.jmenuDatosSriRetenciones.add(this.jMenuItemAbrirOrderBySriRetenciones);				
			this.jmenuDatosSriRetenciones.add(this.jMenuItemMostrarOcultarSriRetenciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSriRetenciones.add(this.jMenuItemGuardarCambiosSriRetenciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSriRetenciones.add(this.jmenuArchivoSriRetenciones);		
			this.jmenuBarSriRetenciones.add(this.jmenuAccionesSriRetenciones);		
			this.jmenuBarSriRetenciones.add(this.jmenuDatosSriRetenciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSriRetenciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSriRetenciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSriRetencionesSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSriRetencionesSriRetenciones.setToolTipText("Buscar Por Ejercicio Por Periodo Declara Por Ruc ");
		this.jButtonBusquedaSriRetencionesSriRetenciones= new JButtonMe();
		this.jButtonBusquedaSriRetencionesSriRetenciones.setText("Buscar");
		this.jButtonBusquedaSriRetencionesSriRetenciones.setToolTipText("Buscar Por Ejercicio Por Periodo Declara Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSriRetencionesSriRetenciones,"buscar_button","Buscar Por Ejercicio Por Periodo Declara Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSriRetencionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones = new JLabelMe();
		jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones = new JLabelMe();
		jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setText("Periodo Declara :");
		jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones= new JComboBoxMe();
		jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelrucBusquedaSriRetencionesSriRetenciones = new JLabelMe();
		jLabelrucBusquedaSriRetencionesSriRetenciones.setText("Ruc :");
		jLabelrucBusquedaSriRetencionesSriRetenciones.setToolTipText("Ruc");
		jLabelrucBusquedaSriRetencionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriRetencionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriRetencionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaSriRetencionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaSriRetencionesSriRetenciones= new JTextFieldMe();
		jTextFieldrucBusquedaSriRetencionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriRetencionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriRetencionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaSriRetencionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSriRetenciones=new JTabbedPane();


		this.jTabbedPaneBusquedasSriRetenciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriRetenciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSriRetenciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSriRetenciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSriRetenciones = new SriRetencionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sri Retenciones DATOS");
			this.jInternalFrameDetalleFormSriRetenciones = new SriRetencionesDetalleFormJInternalFrame(jDesktopPane,this.sriretencionesSessionBean.getConGuardarRelaciones(),this.sriretencionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSriRetenciones = null;//new SriRetencionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriRetenciones= new GridBagLayout();
		
		
		this.jTableDatosSriRetenciones = new JTableMe();      
		
		String sToolTipSriRetenciones="";
		sToolTipSriRetenciones=SriRetencionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriRetenciones+="(Sris.SriRetenciones)";
		}
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriRetenciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSriRetenciones.setToolTipText(sToolTipSriRetenciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSriRetenciones);
		this.jTableDatosSriRetenciones.setAutoCreateRowSorter(true);
		this.jTableDatosSriRetenciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSriRetenciones.setRowSelectionAllowed(true);
		this.jTableDatosSriRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSriRetenciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSriRetenciones = new JButtonMe();
		this.jButtonDuplicarSriRetenciones = new JButtonMe();
		this.jButtonCopiarSriRetenciones = new JButtonMe();
		this.jButtonVerFormSriRetenciones = new JButtonMe();
		this.jButtonNuevoRelacionesSriRetenciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSriRetenciones = new JButtonMe();
		this.jButtonCerrarSriRetenciones = new JButtonMe();
		
		this.jScrollPanelDatosSriRetenciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralSriRetenciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Retenciones";
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Retencioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosSriRetenciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriRetenciones.setToolTipText("Acciones");
        this.jPanelAccionesSriRetenciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSriRetenciones=new ReporteDinamicoJInternalFrame(SriRetencionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSriRetenciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSriRetenciones=new ImportacionJInternalFrame(SriRetencionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSriRetenciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySriRetenciones = new JButtonMe();
		
		this.jButtonAbrirOrderBySriRetenciones.setText("Orden");
		this.jButtonAbrirOrderBySriRetenciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriRetenciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriRetenciones,false,this);
			
			//this.cargarOrderBySriRetenciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriRetenciones,true,this);
			
			//this.cargarOrderBySriRetenciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSriRetenciones.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosSriRetenciones.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosSriRetenciones.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosSriRetenciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriRetenciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriRetenciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSriRetenciones.setText("Nuevo");
		this.jButtonDuplicarSriRetenciones.setText("Duplicar");
		this.jButtonCopiarSriRetenciones.setText("Copiar");
		this.jButtonVerFormSriRetenciones.setText("Ver");
		this.jButtonNuevoRelacionesSriRetenciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSriRetenciones.setText("Guardar");
		this.jButtonCerrarSriRetenciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriRetenciones,"nuevo_button","Nuevo",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSriRetenciones,"duplicar_button","Duplicar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSriRetenciones,"copiar_button","Copiar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSriRetenciones,"ver_form","Ver",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSriRetenciones,"nuevorelaciones_button","Nuevo Rel",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriRetenciones,"guardarcambiostabla_button","Guardar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriRetenciones,"cerrar_button","Salir",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSriRetenciones.setToolTipText("Nuevo"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSriRetenciones.setToolTipText("Duplicar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSriRetenciones.setToolTipText("Copiar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSriRetenciones.setToolTipText("Ver"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSriRetenciones.setToolTipText("Nuevo Rel"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSriRetenciones.setToolTipText("Guardar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriRetenciones.setToolTipText("Salir"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriRetenciones";
		inputMap = this.jButtonNuevoSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriRetenciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarSriRetenciones";
		inputMap = this.jButtonDuplicarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSriRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSriRetenciones"));
		
		//COPIAR
		sMapKey = "CopiarSriRetenciones";
		inputMap = this.jButtonCopiarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSriRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSriRetenciones"));
		
		//VEr FORM
		sMapKey = "VerFormSriRetenciones";
		inputMap = this.jButtonVerFormSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSriRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSriRetenciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSriRetenciones";
		inputMap = this.jButtonNuevoRelacionesSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSriRetenciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSriRetenciones";
		inputMap = this.jButtonModificarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSriRetenciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSriRetenciones";
		inputMap = this.jButtonCerrarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriRetenciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriRetenciones";
		inputMap = this.jButtonGuardarCambiosTablaSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriRetenciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SriRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SriRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SriRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SriRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SriRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSriRetenciones.setName("jPanelParametrosReportesSriRetenciones"); 
		
		this.jPanelParametrosReportesAccionesSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSriRetenciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSriRetenciones.setName("jPanelParametrosReportesAccionesSriRetenciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSriRetenciones = new JButtonMe();
		this.jButtonRecargarInformacionSriRetenciones.setText("Buscar");
		this.jButtonRecargarInformacionSriRetenciones.setToolTipText("Buscar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSriRetenciones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSriRetenciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionSriRetenciones = new JButtonMe();
		this.jButtonProcesarInformacionSriRetenciones.setText("Procesar");
		this.jButtonProcesarInformacionSriRetenciones.setToolTipText("Procesar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSriRetenciones.setVisible(false);
			
		this.jButtonProcesarInformacionSriRetenciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriRetenciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriRetenciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriRetenciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSriRetenciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriRetenciones.setText("TIPO");       
		this.jComboBoxTiposReportesSriRetenciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriRetenciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSriRetenciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSriRetenciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionSriRetenciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSriRetenciones.setText("Accion");
		this.jComboBoxTiposRelacionesSriRetenciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriRetenciones.setText("Accion");
		this.jComboBoxTiposAccionesSriRetenciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSriRetenciones.setText("Accion");
		this.jComboBoxTiposSeleccionarSriRetenciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSriRetenciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSriRetenciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriRetenciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriRetenciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSriRetenciones = new JLabelMe();
		
		this.jLabelAccionesSriRetenciones.setText("Acciones");		
		this.jLabelAccionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSriRetenciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSriRetenciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSriRetenciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSriRetenciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSriRetenciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSriRetenciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSriRetenciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSriRetenciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSriRetenciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSriRetenciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSriRetenciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteSriRetenciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSriRetenciones = new JButtonMe();
		//this.jButtonAnterioresSriRetenciones.setText("<<");
        this.jButtonAnterioresSriRetenciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSriRetenciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSriRetenciones = new JButtonMe();
		//this.jButtonSiguientesSriRetenciones.setText(">>");
        this.jButtonSiguientesSriRetenciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSriRetenciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSriRetenciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSriRetenciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosSriRetenciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSriRetenciones,"nuevoguardarcambios_button","Nue",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSriRetenciones";
		inputMap = this.jButtonNuevoGuardarCambiosSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSriRetenciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSriRetenciones";
		inputMap = this.jButtonRecargarInformacionSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSriRetenciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSriRetenciones";
		inputMap = this.jButtonSiguientesSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSriRetenciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSriRetenciones";
		inputMap = this.jButtonAnterioresSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSriRetenciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSriRetenciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSriRetenciones.setMinimumSize(new Dimension(this.getWidth(),SriRetencionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriRetencionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriRetenciones.setMaximumSize(new Dimension(this.getWidth(),SriRetencionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriRetencionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriRetenciones.setPreferredSize(new Dimension(this.getWidth(),SriRetencionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriRetencionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSriRetenciones = new GridBagLayout();

			this.jPanelPaginacionSriRetenciones.setLayout(gridaBagLayoutPaginacionSriRetenciones);						
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 0;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSriRetenciones.add(this.jButtonAnterioresSriRetenciones, this.gridBagConstraintsSriRetenciones);
					
						
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriRetenciones.gridy = 0;
			
			this.jPanelPaginacionSriRetenciones.add(this.jButtonNuevoGuardarCambiosSriRetenciones, this.gridBagConstraintsSriRetenciones);
						
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriRetenciones.gridy = 0;
			this.jPanelPaginacionSriRetenciones.add(this.jButtonSiguientesSriRetenciones, this.gridBagConstraintsSriRetenciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 1;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriRetenciones.add(this.jButtonNuevoSriRetenciones, this.gridBagConstraintsSriRetenciones);
						
			
			
			if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
				this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSriRetenciones.gridy = 1;
				this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSriRetenciones.add(this.jButtonGuardarCambiosTablaSriRetenciones, this.gridBagConstraintsSriRetenciones);
			}
			
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 1;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriRetenciones.add(this.jButtonDuplicarSriRetenciones, this.gridBagConstraintsSriRetenciones);
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 1;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriRetenciones.add(this.jButtonCopiarSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 1;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriRetenciones.add(this.jButtonVerFormSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 1;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSriRetenciones.add(this.jButtonCerrarSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		
		this.jButtonRecargarInformacionSriRetenciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriRetenciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriRetenciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSriRetenciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriRetenciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriRetenciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSriRetenciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriRetenciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriRetenciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSriRetenciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriRetenciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriRetenciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSriRetenciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriRetenciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriRetenciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSriRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSriRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSriRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSriRetenciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriRetenciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriRetenciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSriRetenciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriRetenciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriRetenciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSriRetenciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriRetenciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriRetenciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSriRetenciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriRetenciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriRetenciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSriRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSriRetenciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SriRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SriRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SriRetenciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SriRetenciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSriRetenciones.setLayout(gridaBagParametrosReportesSriRetenciones);
			this.jPanelParametrosReportesAccionesSriRetenciones.setLayout(gridaBagParametrosReportesAccionesSriRetenciones);
			
			
			this.jPanelParametrosAuxiliar1SriRetenciones.setLayout(gridaBagParametrosAuxiliar1SriRetenciones);
			this.jPanelParametrosAuxiliar2SriRetenciones.setLayout(gridaBagParametrosAuxiliar2SriRetenciones);
			this.jPanelParametrosAuxiliar3SriRetenciones.setLayout(gridaBagParametrosAuxiliar3SriRetenciones);
			this.jPanelParametrosAuxiliar4SriRetenciones.setLayout(gridaBagParametrosAuxiliar4SriRetenciones);
			//this.jPanelParametrosAuxiliar5SriRetenciones.setLayout(gridaBagParametrosAuxiliar2SriRetenciones);			
			
			
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriRetenciones.add(this.jButtonRecargarInformacionSriRetenciones, this.gridBagConstraintsSriRetenciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriRetenciones.add(this.jComboBoxTiposPaginacionSriRetenciones, this.gridBagConstraintsSriRetenciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriRetenciones.add(this.jCheckBoxConAltoMaximoTablaSriRetenciones, this.gridBagConstraintsSriRetenciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriRetenciones.add(this.jComboBoxTiposArchivosReportesSriRetenciones, this.gridBagConstraintsSriRetenciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriRetenciones.add(this.jPanelParametrosAuxiliar1SriRetenciones, this.gridBagConstraintsSriRetenciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SriRetenciones.add(this.jComboBoxTiposReportesSriRetenciones, this.gridBagConstraintsSriRetenciones);																		
			
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SriRetenciones.add(this.jComboBoxTiposGraficosReportesSriRetenciones, this.gridBagConstraintsSriRetenciones);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriRetenciones.add(this.jPanelParametrosAuxiliar4SriRetenciones, this.gridBagConstraintsSriRetenciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriRetenciones.add(this.jComboBoxTiposReportesSriRetenciones, this.gridBagConstraintsSriRetenciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriRetenciones.add(this.jCheckBoxGenerarReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriRetenciones.add(this.jPanelParametrosAuxiliar2SriRetenciones, this.gridBagConstraintsSriRetenciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriRetenciones.add(this.jLabelAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
				this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSriRetenciones.add(this.jButtonAbrirOrderBySriRetenciones, this.gridBagConstraintsSriRetenciones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriRetenciones.add(this.jComboBoxTiposSeleccionarSriRetenciones, this.gridBagConstraintsSriRetenciones);			
			
			
			/*
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriRetenciones.add(this.jCheckBoxSeleccionarTodosSriRetenciones, this.gridBagConstraintsSriRetenciones);
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriRetenciones.add(this.jCheckBoxConGraficoReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriRetenciones.add(this.jCheckBoxSeleccionarTodosSriRetenciones, this.gridBagConstraintsSriRetenciones);															
				
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriRetenciones.add(this.jCheckBoxSeleccionadosSriRetenciones, this.gridBagConstraintsSriRetenciones);															
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriRetenciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriRetenciones.add(this.jCheckBoxConGraficoReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriRetenciones.add(this.jPanelParametrosAuxiliar3SriRetenciones, this.gridBagConstraintsSriRetenciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriRetenciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriRetenciones.add(this.jComboBoxTiposAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSriRetenciones = new GridBagLayout();

			this.jScrollPanelDatosSriRetenciones.setLayout(gridaBagLayoutDatosSriRetenciones);
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = 0;
			this.gridBagConstraintsSriRetenciones.gridx = 0;
			
			this.jScrollPanelDatosSriRetenciones.add(this.jTableDatosSriRetenciones, this.gridBagConstraintsSriRetenciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSriRetenciones.setViewportView(this.jTableDatosSriRetenciones);
		this.jTableDatosSriRetenciones.setFillsViewportHeight(true);
		this.jTableDatosSriRetenciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSriRetenciones= new GridBagLayout();
		this.jPanelAccionesSriRetenciones.setLayout(gridaBagLayoutAccionesSriRetenciones);
		
		
		/*	
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 0;
			
		this.jPanelAccionesSriRetenciones.add(this.jButtonNuevoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSriRetencionesSriRetenciones= new GridBagLayout();
		gridaBagLayoutBusquedaSriRetencionesSriRetenciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSriRetencionesSriRetenciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSriRetencionesSriRetenciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSriRetencionesSriRetenciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSriRetencionesSriRetenciones.setLayout(gridaBagLayoutBusquedaSriRetencionesSriRetenciones);

		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 0;
		gridBagConstraintsSriRetenciones.gridx = 0;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jLabelid_ejercicioBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);

		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 0;
		gridBagConstraintsSriRetenciones.gridx = 1;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);


		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 1;
		gridBagConstraintsSriRetenciones.gridx = 0;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jLabelid_periodo_declaraBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);

		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 1;
		gridBagConstraintsSriRetenciones.gridx = 1;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);


		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 2;
		gridBagConstraintsSriRetenciones.gridx = 0;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jLabelrucBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);

		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 2;
		gridBagConstraintsSriRetenciones.gridx = 1;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jTextFieldrucBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);

		gridBagConstraintsSriRetenciones = new GridBagConstraints();
		gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriRetenciones.gridy = 3;
		gridBagConstraintsSriRetenciones.gridx =1;
		jPanelBusquedaSriRetencionesSriRetenciones.add(jButtonBusquedaSriRetencionesSriRetenciones, gridBagConstraintsSriRetenciones);

		jTabbedPaneBusquedasSriRetenciones.addTab("1.-Por Ejercicio Por Periodo Declara Por Ruc ", jPanelBusquedaSriRetencionesSriRetenciones);
		jTabbedPaneBusquedasSriRetenciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriRetenciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriRetenciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();						
			this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriRetenciones.gridx = 0;		
			//this.gridBagConstraintsSriRetenciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriRetenciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSriRetenciones, this.gridBagConstraintsSriRetenciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSriRetenciones.gridx = 0;		
		//this.gridBagConstraintsSriRetenciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSriRetenciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSriRetenciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriRetenciones.gridx = 0;		
			this.gridBagConstraintsSriRetenciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSriRetenciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSriRetenciones, this.gridBagConstraintsSriRetenciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSriRetenciones, this.gridBagConstraintsSriRetenciones);								
		
		
		/*
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);
		*/		
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriRetenciones.gridx =0;
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriRetenciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriRetenciones, this.gridBagConstraintsSriRetenciones);
				
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSriRetenciones, this.gridBagConstraintsSriRetenciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSriRetenciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriRetenciones = new GridBagLayout();
			this.jPanelBusquedasParametrosSriRetenciones.setLayout(gridaBagLayoutBusquedasParametrosSriRetenciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSriRetenciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriRetenciones, this.gridBagConstraintsSriRetenciones);
			
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSriRetenciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSriRetenciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSriRetenciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSriRetenciones.setName("jPanelReporteDinamicoSriRetenciones"); 
		
		this.jPanelReporteDinamicoSriRetenciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriRetenciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriRetenciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSriRetenciones.setLayout(gridaBagLayoutReporteDinamicoSriRetenciones);
		
		
		this.jInternalFrameReporteDinamicoSriRetenciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSriRetenciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriRetenciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSriRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSriRetenciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSriRetenciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSriRetenciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSriRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSriRetenciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoSriRetenciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoSriRetenciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSriRetenciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriRetenciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriRetenciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Retencioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSriRetenciones = new JLabelMe();

		this.jLabelColumnasSelectReporteSriRetenciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelColumnasSelectReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSriRetenciones = new JList<Reporte>();
		this.jListColumnasSelectReporteSriRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSriRetenciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSriRetenciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriRetenciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriRetenciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSriRetenciones=new JScrollPane(this.jListColumnasSelectReporteSriRetenciones);
			
			this.jScrollColumnasSelectReporteSriRetenciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriRetenciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriRetenciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSriRetenciones.add(this.jListColumnasSelectReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);
		this.jPanelReporteDinamicoSriRetenciones.add(this.jScrollColumnasSelectReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSriRetenciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteSriRetenciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSriRetenciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteSriRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSriRetenciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSriRetenciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriRetenciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriRetenciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSriRetenciones=new JScrollPane(this.jListRelacionesSelectReporteSriRetenciones);
			
			this.jScrollRelacionesSelectReporteSriRetenciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriRetenciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriRetenciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSriRetenciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSriRetenciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoSriRetenciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSriRetenciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSriRetenciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSriRetenciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriRetenciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriRetenciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSriRetenciones = new JLabelMe();

		this.jLabelConGraficoDinamicoSriRetenciones.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelConGraficoDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSriRetenciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSriRetenciones.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSriRetenciones.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSriRetenciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriRetenciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriRetenciones.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jCheckBoxConGraficoDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSriRetenciones = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSriRetenciones.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelColumnaCategoriaGraficoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSriRetenciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriRetenciones.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSriRetenciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSriRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriRetenciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSriRetenciones.add(this.jComboBoxColumnaCategoriaGraficoSriRetenciones, this.gridBagConstraintsSriRetenciones);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSriRetenciones = new JLabelMe();

		this.jLabelColumnaCategoriaValorSriRetenciones.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelColumnaCategoriaValorSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSriRetenciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSriRetenciones.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSriRetenciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSriRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriRetenciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSriRetenciones.add(this.jComboBoxColumnaCategoriaValorSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSriRetenciones = new JLabelMe();

		this.jLabelColumnasValoresGraficoSriRetenciones.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelColumnasValoresGraficoSriRetenciones, this.gridBagConstraintsSriRetenciones);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSriRetenciones = new JList<Reporte>();
		this.jListColumnasValoresGraficoSriRetenciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSriRetenciones.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSriRetenciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriRetenciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriRetenciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSriRetenciones=new JScrollPane(this.jListColumnasValoresGraficoSriRetenciones);
			
			this.jScrollColumnasValoresGraficoSriRetenciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriRetenciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriRetenciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSriRetenciones.add(this.jListColumnasSelectReporteSriRetenciones, this.gridBagConstraintsSriRetenciones);
		this.jPanelReporteDinamicoSriRetenciones.add(this.jScrollColumnasValoresGraficoSriRetenciones, this.gridBagConstraintsSriRetenciones);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSriRetenciones = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSriRetenciones.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelTiposGraficosReportesDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSriRetenciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriRetenciones.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSriRetenciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSriRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriRetenciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jComboBoxTiposGraficosReportesDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSriRetenciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSriRetenciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelGenerarExcelReporteDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSriRetenciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSriRetenciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSriRetenciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSriRetenciones.setToolTipText("Generar EXCEL"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSriRetenciones.add(this.jButtonGenerarExcelReporteDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriRetenciones.add(this.jComboBoxTiposReportesDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSriRetenciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSriRetenciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriRetenciones.add(this.jLabelTiposArchivoReporteDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriRetenciones.add(this.jComboBoxTiposArchivosReportesDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSriRetenciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSriRetenciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSriRetenciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSriRetenciones.setToolTipText("Generar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriRetenciones.add(this.jButtonGenerarReporteDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSriRetenciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSriRetenciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSriRetenciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSriRetenciones.setToolTipText("Cancelar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriRetenciones.add(this.jButtonCerrarReporteDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSriRetenciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSriRetenciones= new JScrollPane(jPanelReporteDinamicoSriRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSriRetenciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriRetenciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriRetenciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Retencioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSriRetenciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSriRetenciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSriRetenciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSriRetenciones);
		this.jInternalFrameReporteDinamicoSriRetenciones.getContentPane().add(this.jScrollPanelReporteDinamicoSriRetenciones, this.gridBagConstraintsSriRetenciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSriRetenciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSriRetenciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSriRetenciones.setName("jPanelImportacionSriRetenciones"); 
		
		this.jPanelImportacionSriRetenciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriRetenciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriRetenciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSriRetenciones.setLayout(gridaBagLayoutImportacionSriRetenciones);
		
		
		this.jInternalFrameImportacionSriRetenciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSriRetenciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSriRetenciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriRetenciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSriRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriRetenciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriRetenciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSriRetenciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriRetenciones.setResizable(true);
	    this.jInternalFrameImportacionSriRetenciones.setClosable(true);
	    this.jInternalFrameImportacionSriRetenciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSriRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriRetenciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriRetenciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSriRetenciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriRetenciones.setResizable(true);
	    this.jInternalFrameImportacionSriRetenciones.setClosable(true);
	    this.jInternalFrameImportacionSriRetenciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSriRetenciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriRetenciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriRetenciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Retencioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSriRetenciones = new JLabelMe();

		this.jLabelArchivoImportacionSriRetenciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriRetenciones.add(this.jLabelArchivoImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSriRetenciones = new JFileChooser();		
		this.jFileChooserImportacionSriRetenciones.setToolTipText("ESCOGER ARCHIVO"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSriRetenciones = new JButtonMe();
		this.jButtonAbrirImportacionSriRetenciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSriRetenciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSriRetenciones.setToolTipText("Generar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriRetenciones.add(this.jButtonAbrirImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSriRetenciones = new JLabelMe();

		this.jLabelPathArchivoImportacionSriRetenciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriRetenciones.add(this.jLabelPathArchivoImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSriRetenciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSriRetenciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriRetenciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriRetenciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriRetenciones.add(this.jTextFieldPathArchivoImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSriRetenciones = new JButtonMe();
		this.jButtonGenerarImportacionSriRetenciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSriRetenciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSriRetenciones.setToolTipText("Generar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriRetenciones.add(this.jButtonGenerarImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSriRetenciones = new JButtonMe();
		this.jButtonCerrarImportacionSriRetenciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSriRetenciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSriRetenciones.setToolTipText("Cancelar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = iPosYImportacion;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriRetenciones.add(this.jButtonCerrarImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSriRetenciones = new GridBagLayout();
		
		this.jScrollPanelImportacionSriRetenciones= new JScrollPane(jPanelImportacionSriRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy =iPosYImportacion;
		this.gridBagConstraintsSriRetenciones.gridx =iPosXImportacion;
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSriRetenciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSriRetenciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSriRetenciones);
		this.jInternalFrameImportacionSriRetenciones.getContentPane().add(this.jScrollPanelImportacionSriRetenciones, this.gridBagConstraintsSriRetenciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySriRetenciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySriRetenciones = new JButtonMe();
			this.jButtonAbrirOrderBySriRetenciones.setText("Orden");
			this.jButtonAbrirOrderBySriRetenciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriRetenciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySriRetenciones";
			inputMap = this.jButtonAbrirOrderBySriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySriRetenciones"));
		
		
			GridBagLayout gridaBagLayoutOrderBySriRetenciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySriRetenciones.setName("jPanelOrderBySriRetenciones"); 
			
			this.jPanelOrderBySriRetenciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriRetenciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriRetenciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySriRetenciones.setLayout(gridaBagLayoutOrderBySriRetenciones);
			
			
			this.jTableDatosSriRetencionesOrderBy = new JTableMe();        
			this.jTableDatosSriRetencionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSriRetencionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSriRetencionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSriRetencionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSriRetencionesOrderBy.setViewportView(this.jTableDatosSriRetencionesOrderBy);
			this.jTableDatosSriRetencionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSriRetencionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySriRetenciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySriRetenciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySriRetenciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSriRetenciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySriRetenciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySriRetenciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySriRetenciones.setTitle("Orden");
			this.jInternalFrameOrderBySriRetenciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySriRetenciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySriRetenciones.setResizable(true);
			this.jInternalFrameOrderBySriRetenciones.setClosable(true);
			this.jInternalFrameOrderBySriRetenciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySriRetenciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriRetenciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriRetenciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Retencioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSriRetenciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSriRetenciones.ipady =150;
				
			this.jPanelOrderBySriRetenciones.add(jScrollPanelDatosSriRetencionesOrderBy, this.gridBagConstraintsSriRetenciones);//this.jTableDatosSriRetencionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySriRetenciones = new JButtonMe();
			this.jButtonCerrarOrderBySriRetenciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySriRetenciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySriRetenciones.setToolTipText("Cancelar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSriRetenciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySriRetenciones.add(this.jButtonCerrarOrderBySriRetenciones, this.gridBagConstraintsSriRetenciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSriRetenciones = new GridBagLayout();
			
			this.jScrollPanelOrderBySriRetenciones= new JScrollPane(jPanelOrderBySriRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsSriRetenciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySriRetenciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySriRetenciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSriRetenciones);
			
			this.jInternalFrameOrderBySriRetenciones.getContentPane().add(this.jScrollPanelOrderBySriRetenciones, this.gridBagConstraintsSriRetenciones);			
		
		} else {
			this.jButtonAbrirOrderBySriRetenciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.sriretencionesSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosSriRetenciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSriRetenciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSriRetenciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSriRetenciones.getRowHeight();//SriRetencionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SriRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriRetenciones.isSelected()) {
					iHeightTable=SriRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SriRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriRetenciones.isSelected()) {
					iHeightTable=SriRetencionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriRetencionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSriRetenciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriRetenciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriRetenciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSriRetenciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriRetenciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriRetenciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySriRetenciones!=null && this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy()!=null) {
			//if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySriRetenciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySriRetenciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySriRetenciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSriRetenciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriRetenciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriRetenciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=sriretencionesLogic.getSriRetencioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sriretencioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SriRetenciones> TraerSriRetencionesBeans(List<SriRetenciones> sriretencioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(SriRetenciones sriretenciones:sriretencioness) {
					
				if(!(SriRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SriRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sriretenciones.setsDetalleGeneralEntityReporte(SriRetencionesConstantesFunciones.getSriRetencionesDescripcion(sriretenciones));
										
						
					
						
					
				} else  {
							
					//sriretenciones.setsDetalleGeneralEntityReporte(sriretenciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//sriretencionesbeans.add(sriretencionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sriretencioness;
    }
	//PARA REPORTES FIN
}
