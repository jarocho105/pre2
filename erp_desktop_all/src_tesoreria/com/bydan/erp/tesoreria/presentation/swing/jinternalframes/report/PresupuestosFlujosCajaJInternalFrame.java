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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.PresupuestosFlujosCajaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class PresupuestosFlujosCajaJInternalFrame extends PresupuestosFlujosCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestosFlujosCaja;
	
	protected JMenuBar jmenuBarPresupuestosFlujosCaja;
	
	protected JMenu jmenuPresupuestosFlujosCaja;
	protected JMenu jmenuDatosPresupuestosFlujosCaja;
	protected JMenu jmenuArchivoPresupuestosFlujosCaja;
	protected JMenu jmenuAccionesPresupuestosFlujosCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestosFlujosCaja;	
	protected GridBagConstraints gridBagConstraintsPresupuestosFlujosCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestosFlujosCajaDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestosFlujosCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestosFlujosCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestosFlujosCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PresupuestosFlujosCajaSessionBean presupuestosflujoscajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestosFlujosCaja> presupuestosflujoscajas;		
	public List<PresupuestosFlujosCaja> presupuestosflujoscajasEliminados;	
	public List<PresupuestosFlujosCaja> presupuestosflujoscajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestosFlujosCaja;		
	protected JButton jButtonAbrirOrderByPresupuestosFlujosCaja;
	
	
	//protected JPanel jPanelOrderByPresupuestosFlujosCaja;
	//public JScrollPane jScrollPanelOrderByPresupuestosFlujosCaja;	
	//protected JButton jButtonCerrarOrderByPresupuestosFlujosCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestosFlujosCajaLogic presupuestosflujoscajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestosFlujosCaja;
	public JScrollPane jScrollPanelDatosEdicionPresupuestosFlujosCaja;
	public JScrollPane jScrollPanelDatosGeneralPresupuestosFlujosCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestosFlujosCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestosFlujosCaja;
	//public JScrollPane jScrollPanelImportacionPresupuestosFlujosCaja;
	
	
	
	protected JPanel jPanelAccionesPresupuestosFlujosCaja;
	
    protected JPanel jPanelPaginacionPresupuestosFlujosCaja;
    protected JPanel jPanelParametrosReportesPresupuestosFlujosCaja;
	protected JPanel jPanelParametrosReportesAccionesPresupuestosFlujosCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestosFlujosCaja;
	protected JPanel jPanelParametrosAuxiliar2PresupuestosFlujosCaja;
	protected JPanel jPanelParametrosAuxiliar3PresupuestosFlujosCaja;
	protected JPanel jPanelParametrosAuxiliar4PresupuestosFlujosCaja;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestosFlujosCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestosFlujosCaja;
	//protected JPanel jPanelImportacionPresupuestosFlujosCaja;
	
	
	public JTable jTableDatosPresupuestosFlujosCaja;
	
	
	
	//public JTable jTableDatosPresupuestosFlujosCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestosFlujosCaja;
	protected JButton jButtonDuplicarPresupuestosFlujosCaja;
	protected JButton jButtonCopiarPresupuestosFlujosCaja;
	protected JButton jButtonVerFormPresupuestosFlujosCaja;
	protected JButton jButtonNuevoRelacionesPresupuestosFlujosCaja;
	protected JButton jButtonModificarPresupuestosFlujosCaja;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestosFlujosCaja;
	protected JButton jButtonCerrarPresupuestosFlujosCaja;
	
	
	protected JButton jButtonRecargarInformacionPresupuestosFlujosCaja;
	protected JButton jButtonProcesarInformacionPresupuestosFlujosCaja;
	
	
	protected JButton jButtonAnterioresPresupuestosFlujosCaja;
	protected JButton jButtonSiguientesPresupuestosFlujosCaja;
	protected JButton jButtonNuevoGuardarCambiosPresupuestosFlujosCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestosFlujosCaja;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestosFlujosCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestosFlujosCaja;
	//protected JButton jButtonGenerarImportacionPresupuestosFlujosCaja;
	//protected JButton jButtonCerrarImportacionPresupuestosFlujosCaja;
	//protected JFileChooser jFileChooserImportacionPresupuestosFlujosCaja;
	//protected File fileImportacionPresupuestosFlujosCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestosFlujosCaja;
	protected JButton jButtonDuplicarToolBarPresupuestosFlujosCaja;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestosFlujosCaja;
	protected JButton jButtonCopiarToolBarPresupuestosFlujosCaja;
	protected JButton jButtonVerFormToolBarPresupuestosFlujosCaja;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestosFlujosCaja;
	protected JButton jButtonCerrarToolBarPresupuestosFlujosCaja;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestosFlujosCaja;
	protected JButton jButtonProcesarInformacionToolBarPresupuestosFlujosCaja;
	protected JButton jButtonAnterioresToolBarPresupuestosFlujosCaja;
	protected JButton jButtonSiguientesToolBarPresupuestosFlujosCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestosFlujosCaja;
	protected JButton jButtonAbrirOrderByToolBarPresupuestosFlujosCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemDuplicarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestosFlujosCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemCopiarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemVerFormPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemCerrarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemAnterioresPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemSiguientesPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestosFlujosCaja;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestosFlujosCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestosFlujosCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestosFlujosCaja;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestosFlujosCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestosFlujosCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestosFlujosCaja;
	protected JTextField jTextFieldValorCampoGeneralPresupuestosFlujosCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestosFlujosCaja;
	//public JList<Reporte> jListColumnasSelectReportePresupuestosFlujosCaja;
	//public JScrollPane jScrollColumnasSelectReportePresupuestosFlujosCaja;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestosFlujosCaja;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestosFlujosCaja;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestosFlujosCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestosFlujosCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestosFlujosCaja;	
	//public JLabel jLabelPathArchivoImportacionPresupuestosFlujosCaja;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestosFlujosCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestosFlujosCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestosFlujosCaja;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestosFlujosCaja;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestosFlujosCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestosFlujosCaja;
	public JPanel jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja;
	public JButton jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja;
	
	public JPanel jPanelIdIdBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja;
	public JLabel jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja;
	public JTextFieldMe jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja;
	public JButton jButtonidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCajaBusqueda= new JButtonMe();

	
	
	
	
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
	public PresupuestosFlujosCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestosFlujosCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestosFlujosCaja)	{
		this.jButtonRecargarInformacionPresupuestosFlujosCaja = jButtonRecargarInformacionPresupuestosFlujosCaja;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestosFlujosCaja() {
		return this.jButtonProcesarInformacionPresupuestosFlujosCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestosFlujosCaja)	{
		this.jButtonProcesarInformacionPresupuestosFlujosCaja = jButtonProcesarInformacionPresupuestosFlujosCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestosFlujosCaja() {
		return this.jButtonRecargarInformacionPresupuestosFlujosCaja;
	}
	
	
	public List<PresupuestosFlujosCaja> getpresupuestosflujoscajas() {
		return this.presupuestosflujoscajas;
	}

	public void setpresupuestosflujoscajas(List<PresupuestosFlujosCaja> presupuestosflujoscajas) {
		this.presupuestosflujoscajas = presupuestosflujoscajas;
	}
	
	public List<PresupuestosFlujosCaja> getpresupuestosflujoscajasAux() {
		return this.presupuestosflujoscajasAux;
	}

	public void setpresupuestosflujoscajasAux(List<PresupuestosFlujosCaja> presupuestosflujoscajasAux) {
		this.presupuestosflujoscajasAux = presupuestosflujoscajasAux;
	}
	
	public List<PresupuestosFlujosCaja> getpresupuestosflujoscajasEliminados() {
		return this.presupuestosflujoscajasEliminados;
	}

	public void setPresupuestosFlujosCajasEliminados(List<PresupuestosFlujosCaja> presupuestosflujoscajasEliminados) {
		this.presupuestosflujoscajasEliminados = presupuestosflujoscajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestosFlujosCaja() {
		return jComboBoxTiposSeleccionarPresupuestosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposSeleccionarPresupuestosFlujosCaja) {
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja = jComboBoxTiposSeleccionarPresupuestosFlujosCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestosFlujosCaja() {
		return jTextFieldValorCampoGeneralPresupuestosFlujosCaja;
	}

	public void setjTextFieldValorCampoGeneralPresupuestosFlujosCaja(
			JTextField jTextFieldValorCampoGeneralPresupuestosFlujosCaja) {
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja = jTextFieldValorCampoGeneralPresupuestosFlujosCaja;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestosFlujosCaja() {
		return this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestosFlujosCaja(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestosFlujosCaja) {
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja = jCheckBoxSeleccionarTodosPresupuestosFlujosCaja;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestosFlujosCaja() {
		return this.jCheckBoxSeleccionadosPresupuestosFlujosCaja;
	}

	public void setjCheckBoxSeleccionadosPresupuestosFlujosCaja(
			JCheckBox jCheckBoxSeleccionadosPresupuestosFlujosCaja) {
		this.jCheckBoxSeleccionadosPresupuestosFlujosCaja = jCheckBoxSeleccionadosPresupuestosFlujosCaja;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestosFlujosCaja() {
		return this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposArchivosReportesPresupuestosFlujosCaja) {
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja = jComboBoxTiposArchivosReportesPresupuestosFlujosCaja;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestosFlujosCaja() {
		return this.jComboBoxTiposReportesPresupuestosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposReportesPresupuestosFlujosCaja) {
		this.jComboBoxTiposReportesPresupuestosFlujosCaja = jComboBoxTiposReportesPresupuestosFlujosCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestosFlujosCaja() {
	//	return jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestosFlujosCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja = jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja = jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestosFlujosCaja() {
		return this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposGraficosReportesPresupuestosFlujosCaja) {
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja = jComboBoxTiposGraficosReportesPresupuestosFlujosCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestosFlujosCaja() {
		return this.jComboBoxTiposPaginacionPresupuestosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposPaginacionPresupuestosFlujosCaja) {
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja = jComboBoxTiposPaginacionPresupuestosFlujosCaja;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestosFlujosCaja() {
		return this.jComboBoxTiposRelacionesPresupuestosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestosFlujosCaja() {
		return this.jComboBoxTiposAccionesPresupuestosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposRelacionesPresupuestosFlujosCaja) {
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja = jComboBoxTiposRelacionesPresupuestosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestosFlujosCaja(
			JComboBox jComboBoxTiposAccionesPresupuestosFlujosCaja) {
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja = jComboBoxTiposAccionesPresupuestosFlujosCaja;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestosFlujosCaja() {
	//	return jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestosFlujosCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja = jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestosFlujosCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestosFlujosCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja .setBorder(borderResaltar);		
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
		this.presupuestosflujoscajaSessionBean=new PresupuestosFlujosCajaSessionBean();
		
		this.presupuestosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestosFlujosCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuestos Flujos Caja MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestosFlujosCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestosFlujosCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"nuevo","nuevo","Nuevo"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"duplicar","duplicar","Duplicar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"copiar","copiar","Copiar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"ver_form","ver_form","Ver"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"recargar","recargar","Buscar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestosFlujosCaja,this.jTtoolBarPresupuestosFlujosCaja,
							"cerrar","cerrar","Salir"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestosFlujosCaja;
			
				this.jButtonProcesarInformacionToolBarPresupuestosFlujosCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestosFlujosCaja;
				
		//protected JButton jButtonModificarToolBarPresupuestosFlujosCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestosFlujosCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestosFlujosCaja=new JMenuMe("General");
		this.jmenuArchivoPresupuestosFlujosCaja=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestosFlujosCaja=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestosFlujosCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestosFlujosCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestosFlujosCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestosFlujosCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestosFlujosCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestosFlujosCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestosFlujosCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestosFlujosCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestosFlujosCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestosFlujosCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestosFlujosCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestosFlujosCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestosFlujosCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestosFlujosCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestosFlujosCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestosFlujosCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestosFlujosCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestosFlujosCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestosFlujosCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestosFlujosCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestosFlujosCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestosFlujosCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestosFlujosCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestosFlujosCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestosFlujosCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestosFlujosCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestosFlujosCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestosFlujosCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestosFlujosCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestosFlujosCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestosFlujosCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestosFlujosCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestosFlujosCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestosFlujosCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestosFlujosCaja.add(this.jMenuItemCerrarPresupuestosFlujosCaja);
			
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemNuevoPresupuestosFlujosCaja);
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemNuevoGuardarCambiosPresupuestosFlujosCaja);
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemNuevoRelacionesPresupuestosFlujosCaja);
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemGuardarCambiosTablaPresupuestosFlujosCaja);		
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemDuplicarPresupuestosFlujosCaja);		
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemCopiarPresupuestosFlujosCaja);		
			this.jmenuAccionesPresupuestosFlujosCaja.add(this.jMenuItemVerFormPresupuestosFlujosCaja);		
			
			this.jmenuDatosPresupuestosFlujosCaja.add(this.jMenuItemRecargarInformacionPresupuestosFlujosCaja);				
			this.jmenuDatosPresupuestosFlujosCaja.add(this.jMenuItemAnterioresPresupuestosFlujosCaja);				
			this.jmenuDatosPresupuestosFlujosCaja.add(this.jMenuItemSiguientesPresupuestosFlujosCaja);				
			this.jmenuDatosPresupuestosFlujosCaja.add(this.jMenuItemAbrirOrderByPresupuestosFlujosCaja);				
			this.jmenuDatosPresupuestosFlujosCaja.add(this.jMenuItemMostrarOcultarPresupuestosFlujosCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestosFlujosCaja.add(this.jMenuItemGuardarCambiosPresupuestosFlujosCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestosFlujosCaja.add(this.jmenuArchivoPresupuestosFlujosCaja);		
			this.jmenuBarPresupuestosFlujosCaja.add(this.jmenuAccionesPresupuestosFlujosCaja);		
			this.jmenuBarPresupuestosFlujosCaja.add(this.jmenuDatosPresupuestosFlujosCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestosFlujosCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestosFlujosCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja= new JButtonMe();
		this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setText("Buscar");
		this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja = new JLabelMe();
		jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setText("Id :");
		jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja= new JTextFieldMe();
		jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja.setVisible(false);




		this.jTabbedPaneBusquedasPresupuestosFlujosCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestosFlujosCaja = new PresupuestosFlujosCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuestos Flujos Caja DATOS");
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja = new PresupuestosFlujosCajaDetalleFormJInternalFrame(jDesktopPane,this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones(),this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestosFlujosCaja = null;//new PresupuestosFlujosCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestosFlujosCaja= new GridBagLayout();
		
		
		this.jTableDatosPresupuestosFlujosCaja = new JTableMe();      
		
		String sToolTipPresupuestosFlujosCaja="";
		sToolTipPresupuestosFlujosCaja=PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestosFlujosCaja+="(Tesoreria.PresupuestosFlujosCaja)";
		}
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestosFlujosCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestosFlujosCaja.setToolTipText(sToolTipPresupuestosFlujosCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestosFlujosCaja);
		this.jTableDatosPresupuestosFlujosCaja.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestosFlujosCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestosFlujosCaja.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonDuplicarPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonCopiarPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonVerFormPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonCerrarPresupuestosFlujosCaja = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestosFlujosCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestosFlujosCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuestos Flujos Caja";
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuestos Flujos Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestosFlujosCaja.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestosFlujosCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja=new ReporteDinamicoJInternalFrame(PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestosFlujosCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestosFlujosCaja=new ImportacionJInternalFrame(PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestosFlujosCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestosFlujosCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestosFlujosCaja.setText("Orden");
		this.jButtonAbrirOrderByPresupuestosFlujosCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestosFlujosCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestosFlujosCaja,false,this);
			
			//this.cargarOrderByPresupuestosFlujosCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestosFlujosCaja,true,this);
			
			//this.cargarOrderByPresupuestosFlujosCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestosFlujosCaja.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosPresupuestosFlujosCaja.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosPresupuestosFlujosCaja.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosPresupuestosFlujosCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestosFlujosCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestosFlujosCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestosFlujosCaja.setText("Nuevo");
		this.jButtonDuplicarPresupuestosFlujosCaja.setText("Duplicar");
		this.jButtonCopiarPresupuestosFlujosCaja.setText("Copiar");
		this.jButtonVerFormPresupuestosFlujosCaja.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.setText("Guardar");
		this.jButtonCerrarPresupuestosFlujosCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestosFlujosCaja,"nuevo_button","Nuevo",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestosFlujosCaja,"duplicar_button","Duplicar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestosFlujosCaja,"copiar_button","Copiar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestosFlujosCaja,"ver_form","Ver",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestosFlujosCaja,"nuevorelaciones_button","Nuevo Rel",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja,"guardarcambiostabla_button","Guardar",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestosFlujosCaja,"cerrar_button","Salir",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestosFlujosCaja.setToolTipText("Nuevo"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestosFlujosCaja.setToolTipText("Duplicar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestosFlujosCaja.setToolTipText("Copiar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestosFlujosCaja.setToolTipText("Ver"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.setToolTipText("Nuevo Rel"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.setToolTipText("Guardar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestosFlujosCaja.setToolTipText("Salir"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestosFlujosCaja";
		inputMap = this.jButtonNuevoPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestosFlujosCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestosFlujosCaja";
		inputMap = this.jButtonDuplicarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestosFlujosCaja"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestosFlujosCaja";
		inputMap = this.jButtonCopiarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestosFlujosCaja"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestosFlujosCaja";
		inputMap = this.jButtonVerFormPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestosFlujosCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestosFlujosCaja";
		inputMap = this.jButtonNuevoRelacionesPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestosFlujosCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestosFlujosCaja";
		inputMap = this.jButtonModificarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestosFlujosCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestosFlujosCaja";
		inputMap = this.jButtonCerrarPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestosFlujosCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestosFlujosCaja";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestosFlujosCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestosFlujosCaja.setName("jPanelParametrosReportesPresupuestosFlujosCaja"); 
		
		this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja.setName("jPanelParametrosReportesAccionesPresupuestosFlujosCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.setText("Buscar");
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.setToolTipText("Buscar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestosFlujosCaja,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.setVisible(false);
		
		
		this.jButtonProcesarInformacionPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestosFlujosCaja.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestosFlujosCaja.setToolTipText("Procesar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestosFlujosCaja.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestosFlujosCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestosFlujosCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestosFlujosCaja = new JLabelMe();
		
		this.jLabelAccionesPresupuestosFlujosCaja.setText("Acciones");		
		this.jLabelAccionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestosFlujosCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestosFlujosCaja = new JButtonMe();
		//this.jButtonAnterioresPresupuestosFlujosCaja.setText("<<");
        this.jButtonAnterioresPresupuestosFlujosCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestosFlujosCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestosFlujosCaja = new JButtonMe();
		//this.jButtonSiguientesPresupuestosFlujosCaja.setText(">>");
        this.jButtonSiguientesPresupuestosFlujosCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestosFlujosCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja,"nuevoguardarcambios_button","Nue",this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestosFlujosCaja";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestosFlujosCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestosFlujosCaja";
		inputMap = this.jButtonRecargarInformacionPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestosFlujosCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestosFlujosCaja";
		inputMap = this.jButtonSiguientesPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestosFlujosCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestosFlujosCaja";
		inputMap = this.jButtonAnterioresPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestosFlujosCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestosFlujosCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(this.getWidth(),PresupuestosFlujosCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestosFlujosCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(this.getWidth(),PresupuestosFlujosCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestosFlujosCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(this.getWidth(),PresupuestosFlujosCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestosFlujosCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestosFlujosCaja = new GridBagLayout();

			this.jPanelPaginacionPresupuestosFlujosCaja.setLayout(gridaBagLayoutPaginacionPresupuestosFlujosCaja);						
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonAnterioresPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
					
						
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
			
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonNuevoGuardarCambiosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
						
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonSiguientesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonNuevoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
						
			
			
			if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
				this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
				this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonGuardarCambiosTablaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			}
			
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonDuplicarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonCopiarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonVerFormPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestosFlujosCaja.add(this.jButtonCerrarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestosFlujosCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestosFlujosCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestosFlujosCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestosFlujosCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestosFlujosCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestosFlujosCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestosFlujosCaja.setLayout(gridaBagParametrosReportesPresupuestosFlujosCaja);
			this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja.setLayout(gridaBagParametrosReportesAccionesPresupuestosFlujosCaja);
			
			
			this.jPanelParametrosAuxiliar1PresupuestosFlujosCaja.setLayout(gridaBagParametrosAuxiliar1PresupuestosFlujosCaja);
			this.jPanelParametrosAuxiliar2PresupuestosFlujosCaja.setLayout(gridaBagParametrosAuxiliar2PresupuestosFlujosCaja);
			this.jPanelParametrosAuxiliar3PresupuestosFlujosCaja.setLayout(gridaBagParametrosAuxiliar3PresupuestosFlujosCaja);
			this.jPanelParametrosAuxiliar4PresupuestosFlujosCaja.setLayout(gridaBagParametrosAuxiliar4PresupuestosFlujosCaja);
			//this.jPanelParametrosAuxiliar5PresupuestosFlujosCaja.setLayout(gridaBagParametrosAuxiliar2PresupuestosFlujosCaja);			
			
			
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jButtonRecargarInformacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestosFlujosCaja.add(this.jComboBoxTiposPaginacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestosFlujosCaja.add(this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestosFlujosCaja.add(this.jComboBoxTiposArchivosReportesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jPanelParametrosAuxiliar1PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestosFlujosCaja.add(this.jComboBoxTiposReportesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);																		
			
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestosFlujosCaja.add(this.jComboBoxTiposGraficosReportesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jPanelParametrosAuxiliar4PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jComboBoxTiposReportesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jCheckBoxGenerarReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jPanelParametrosAuxiliar2PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jLabelAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
				this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jButtonAbrirOrderByPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jComboBoxTiposSeleccionarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
			
			
			/*
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jCheckBoxConGraficoReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestosFlujosCaja.add(this.jCheckBoxSeleccionarTodosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);															
				
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestosFlujosCaja.add(this.jCheckBoxSeleccionadosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);															
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestosFlujosCaja.add(this.jCheckBoxConGraficoReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jPanelParametrosAuxiliar3PresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestosFlujosCaja.add(this.jComboBoxTiposAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestosFlujosCaja = new GridBagLayout();

			this.jScrollPanelDatosPresupuestosFlujosCaja.setLayout(gridaBagLayoutDatosPresupuestosFlujosCaja);
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
			
			this.jScrollPanelDatosPresupuestosFlujosCaja.add(this.jTableDatosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestosFlujosCaja.setViewportView(this.jTableDatosPresupuestosFlujosCaja);
		this.jTableDatosPresupuestosFlujosCaja.setFillsViewportHeight(true);
		this.jTableDatosPresupuestosFlujosCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestosFlujosCaja= new GridBagLayout();
		this.jPanelAccionesPresupuestosFlujosCaja.setLayout(gridaBagLayoutAccionesPresupuestosFlujosCaja);
		
		
		/*	
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
			
		this.jPanelAccionesPresupuestosFlujosCaja.add(this.jButtonNuevoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.setLayout(gridaBagLayoutBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);

		gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
		jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.add(jLabelidBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja, gridBagConstraintsPresupuestosFlujosCaja);

		gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestosFlujosCaja.gridy = 0;
		gridBagConstraintsPresupuestosFlujosCaja.gridx = 1;
		jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.add(jLabelidPresupuestosFlujosCajaBusquedaPresupuestosFlujosCaja, gridBagConstraintsPresupuestosFlujosCaja);

		gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestosFlujosCaja.gridy = 1;
		gridBagConstraintsPresupuestosFlujosCaja.gridx =1;
		jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja.add(jButtonBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja, gridBagConstraintsPresupuestosFlujosCaja);

		jTabbedPaneBusquedasPresupuestosFlujosCaja.addTab("1.-Por  ", jPanelBusquedaPresupuestosFlujosCajaPresupuestosFlujosCaja);
		jTabbedPaneBusquedasPresupuestosFlujosCaja.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestosFlujosCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestosFlujosCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;		
			//this.gridBagConstraintsPresupuestosFlujosCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;		
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestosFlujosCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;		
			this.gridBagConstraintsPresupuestosFlujosCaja.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestosFlujosCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);								
		
		
		/*
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		*/		
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =0;
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestosFlujosCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
				
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestosFlujosCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestosFlujosCaja.setLayout(gridaBagLayoutBusquedasParametrosPresupuestosFlujosCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
			
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestosFlujosCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestosFlujosCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestosFlujosCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.setName("jPanelReporteDinamicoPresupuestosFlujosCaja"); 
		
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.setLayout(gridaBagLayoutReporteDinamicoPresupuestosFlujosCaja);
		
		
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestosFlujosCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuestos Flujos Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestosFlujosCaja = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestosFlujosCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelColumnasSelectReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestosFlujosCaja = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestosFlujosCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestosFlujosCaja=new JScrollPane(this.jListColumnasSelectReportePresupuestosFlujosCaja);
			
			this.jScrollColumnasSelectReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jListColumnasSelectReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jScrollColumnasSelectReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestosFlujosCaja = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestosFlujosCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestosFlujosCaja = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestosFlujosCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestosFlujosCaja=new JScrollPane(this.jListRelacionesSelectReportePresupuestosFlujosCaja);
			
			this.jScrollRelacionesSelectReportePresupuestosFlujosCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestosFlujosCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestosFlujosCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestosFlujosCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestosFlujosCaja.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelConGraficoDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jCheckBoxConGraficoDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelColumnaCategoriaGraficoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestosFlujosCaja.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelColumnaCategoriaValorPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jComboBoxColumnaCategoriaValorPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestosFlujosCaja.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelColumnasValoresGraficoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestosFlujosCaja = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestosFlujosCaja.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestosFlujosCaja=new JScrollPane(this.jListColumnasValoresGraficoPresupuestosFlujosCaja);
			
			this.jScrollColumnasValoresGraficoPresupuestosFlujosCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestosFlujosCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestosFlujosCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jListColumnasSelectReportePresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jScrollColumnasValoresGraficoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelTiposGraficosReportesDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestosFlujosCaja.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelGenerarExcelReporteDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja.setToolTipText("Generar EXCEL"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jButtonGenerarExcelReporteDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jComboBoxTiposReportesDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jLabelTiposArchivoReporteDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja.setToolTipText("Generar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jButtonGenerarReporteDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja.setToolTipText("Cancelar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestosFlujosCaja.add(this.jButtonCerrarReporteDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestosFlujosCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja= new JScrollPane(jPanelReporteDinamicoPresupuestosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuestos Flujos Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestosFlujosCaja);
		this.jInternalFrameReporteDinamicoPresupuestosFlujosCaja.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestosFlujosCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestosFlujosCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestosFlujosCaja.setName("jPanelImportacionPresupuestosFlujosCaja"); 
		
		this.jPanelImportacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestosFlujosCaja.setLayout(gridaBagLayoutImportacionPresupuestosFlujosCaja);
		
		
		this.jInternalFrameImportacionPresupuestosFlujosCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestosFlujosCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestosFlujosCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestosFlujosCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setResizable(true);
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setClosable(true);
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setResizable(true);
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setClosable(true);
	    this.jInternalFrameImportacionPresupuestosFlujosCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuestos Flujos Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestosFlujosCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestosFlujosCaja.add(this.jLabelArchivoImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestosFlujosCaja = new JFileChooser();		
		this.jFileChooserImportacionPresupuestosFlujosCaja.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestosFlujosCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestosFlujosCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestosFlujosCaja.setToolTipText("Generar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestosFlujosCaja.add(this.jButtonAbrirImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestosFlujosCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestosFlujosCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestosFlujosCaja.add(this.jLabelPathArchivoImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestosFlujosCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestosFlujosCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestosFlujosCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestosFlujosCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestosFlujosCaja.add(this.jTextFieldPathArchivoImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestosFlujosCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestosFlujosCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestosFlujosCaja.setToolTipText("Generar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestosFlujosCaja.add(this.jButtonGenerarImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestosFlujosCaja = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestosFlujosCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestosFlujosCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestosFlujosCaja.setToolTipText("Cancelar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestosFlujosCaja.add(this.jButtonCerrarImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestosFlujosCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestosFlujosCaja= new JScrollPane(jPanelImportacionPresupuestosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestosFlujosCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestosFlujosCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestosFlujosCaja);
		this.jInternalFrameImportacionPresupuestosFlujosCaja.getContentPane().add(this.jScrollPanelImportacionPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestosFlujosCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestosFlujosCaja = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestosFlujosCaja.setText("Orden");
			this.jButtonAbrirOrderByPresupuestosFlujosCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestosFlujosCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestosFlujosCaja";
			inputMap = this.jButtonAbrirOrderByPresupuestosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestosFlujosCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestosFlujosCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestosFlujosCaja.setName("jPanelOrderByPresupuestosFlujosCaja"); 
			
			this.jPanelOrderByPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestosFlujosCaja.setLayout(gridaBagLayoutOrderByPresupuestosFlujosCaja);
			
			
			this.jTableDatosPresupuestosFlujosCajaOrderBy = new JTableMe();        
			this.jTableDatosPresupuestosFlujosCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestosFlujosCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestosFlujosCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestosFlujosCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestosFlujosCajaOrderBy.setViewportView(this.jTableDatosPresupuestosFlujosCajaOrderBy);
			this.jTableDatosPresupuestosFlujosCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestosFlujosCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestosFlujosCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestosFlujosCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestosFlujosCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestosFlujosCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setResizable(true);
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setClosable(true);
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuestos Flujos Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestosFlujosCaja.ipady =150;
				
			this.jPanelOrderByPresupuestosFlujosCaja.add(jScrollPanelDatosPresupuestosFlujosCajaOrderBy, this.gridBagConstraintsPresupuestosFlujosCaja);//this.jTableDatosPresupuestosFlujosCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestosFlujosCaja = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestosFlujosCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestosFlujosCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestosFlujosCaja.setToolTipText("Cancelar"+" "+PresupuestosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestosFlujosCaja.add(this.jButtonCerrarOrderByPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestosFlujosCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestosFlujosCaja= new JScrollPane(jPanelOrderByPresupuestosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsPresupuestosFlujosCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestosFlujosCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestosFlujosCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestosFlujosCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestosFlujosCaja);
			
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getContentPane().add(this.jScrollPanelOrderByPresupuestosFlujosCaja, this.gridBagConstraintsPresupuestosFlujosCaja);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestosFlujosCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.presupuestosflujoscajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestosFlujosCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPresupuestosFlujosCaja.getRowHeight();//PresupuestosFlujosCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.isSelected()) {
					iHeightTable=PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestosFlujosCaja.isSelected()) {
					iHeightTable=PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestosFlujosCaja!=null && this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestosflujoscajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestosFlujosCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestosFlujosCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestosFlujosCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestosFlujosCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=presupuestosflujoscajaLogic.getPresupuestosFlujosCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestosflujoscajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestosFlujosCaja> TraerPresupuestosFlujosCajaBeans(List<PresupuestosFlujosCaja> presupuestosflujoscajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestosFlujosCaja presupuestosflujoscaja:presupuestosflujoscajas) {
					
				if(!(PresupuestosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestosflujoscaja.setsDetalleGeneralEntityReporte(PresupuestosFlujosCajaConstantesFunciones.getPresupuestosFlujosCajaDescripcion(presupuestosflujoscaja));
										
						
					
						
					
				} else  {
							
					//presupuestosflujoscaja.setsDetalleGeneralEntityReporte(presupuestosflujoscaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestosflujoscajabeans.add(presupuestosflujoscajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestosflujoscajas;
    }
	//PARA REPORTES FIN
}
