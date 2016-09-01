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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.report.ComparativosFlujosCajaConstantesFunciones;

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
public class ComparativosFlujosCajaJInternalFrame extends ComparativosFlujosCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComparativosFlujosCaja;
	
	protected JMenuBar jmenuBarComparativosFlujosCaja;
	
	protected JMenu jmenuComparativosFlujosCaja;
	protected JMenu jmenuDatosComparativosFlujosCaja;
	protected JMenu jmenuArchivoComparativosFlujosCaja;
	protected JMenu jmenuAccionesComparativosFlujosCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComparativosFlujosCaja;	
	protected GridBagConstraints gridBagConstraintsComparativosFlujosCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComparativosFlujosCajaDetalleFormJInternalFrame jInternalFrameDetalleFormComparativosFlujosCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComparativosFlujosCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComparativosFlujosCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public ComparativosFlujosCajaSessionBean comparativosflujoscajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComparativosFlujosCaja> comparativosflujoscajas;		
	public List<ComparativosFlujosCaja> comparativosflujoscajasEliminados;	
	public List<ComparativosFlujosCaja> comparativosflujoscajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComparativosFlujosCaja;		
	protected JButton jButtonAbrirOrderByComparativosFlujosCaja;
	
	
	//protected JPanel jPanelOrderByComparativosFlujosCaja;
	//public JScrollPane jScrollPanelOrderByComparativosFlujosCaja;	
	//protected JButton jButtonCerrarOrderByComparativosFlujosCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComparativosFlujosCajaLogic comparativosflujoscajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComparativosFlujosCaja;
	public JScrollPane jScrollPanelDatosEdicionComparativosFlujosCaja;
	public JScrollPane jScrollPanelDatosGeneralComparativosFlujosCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosComparativosFlujosCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComparativosFlujosCaja;
	//public JScrollPane jScrollPanelImportacionComparativosFlujosCaja;
	
	
	
	protected JPanel jPanelAccionesComparativosFlujosCaja;
	
    protected JPanel jPanelPaginacionComparativosFlujosCaja;
    protected JPanel jPanelParametrosReportesComparativosFlujosCaja;
	protected JPanel jPanelParametrosReportesAccionesComparativosFlujosCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComparativosFlujosCaja;
	protected JPanel jPanelParametrosAuxiliar2ComparativosFlujosCaja;
	protected JPanel jPanelParametrosAuxiliar3ComparativosFlujosCaja;
	protected JPanel jPanelParametrosAuxiliar4ComparativosFlujosCaja;
	//protected JPanel jPanelParametrosAuxiliar5ComparativosFlujosCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoComparativosFlujosCaja;
	//protected JPanel jPanelImportacionComparativosFlujosCaja;
	
	
	public JTable jTableDatosComparativosFlujosCaja;
	
	
	
	//public JTable jTableDatosComparativosFlujosCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComparativosFlujosCaja;
	protected JButton jButtonDuplicarComparativosFlujosCaja;
	protected JButton jButtonCopiarComparativosFlujosCaja;
	protected JButton jButtonVerFormComparativosFlujosCaja;
	protected JButton jButtonNuevoRelacionesComparativosFlujosCaja;
	protected JButton jButtonModificarComparativosFlujosCaja;
	
    protected JButton jButtonGuardarCambiosTablaComparativosFlujosCaja;
	protected JButton jButtonCerrarComparativosFlujosCaja;
	
	
	protected JButton jButtonRecargarInformacionComparativosFlujosCaja;
	protected JButton jButtonProcesarInformacionComparativosFlujosCaja;
	
	
	protected JButton jButtonAnterioresComparativosFlujosCaja;
	protected JButton jButtonSiguientesComparativosFlujosCaja;
	protected JButton jButtonNuevoGuardarCambiosComparativosFlujosCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComparativosFlujosCaja;
	//protected JButton jButtonCerrarReporteDinamicoComparativosFlujosCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionComparativosFlujosCaja;
	//protected JButton jButtonGenerarImportacionComparativosFlujosCaja;
	//protected JButton jButtonCerrarImportacionComparativosFlujosCaja;
	//protected JFileChooser jFileChooserImportacionComparativosFlujosCaja;
	//protected File fileImportacionComparativosFlujosCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComparativosFlujosCaja;
	protected JButton jButtonDuplicarToolBarComparativosFlujosCaja;
	protected JButton jButtonNuevoRelacionesToolBarComparativosFlujosCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarComparativosFlujosCaja;
	protected JButton jButtonCopiarToolBarComparativosFlujosCaja;
	protected JButton jButtonVerFormToolBarComparativosFlujosCaja;
	public JButton jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarComparativosFlujosCaja;
	protected JButton jButtonCerrarToolBarComparativosFlujosCaja;
	
	protected JButton jButtonRecargarInformacionToolBarComparativosFlujosCaja;
	protected JButton jButtonProcesarInformacionToolBarComparativosFlujosCaja;
	protected JButton jButtonAnterioresToolBarComparativosFlujosCaja;
	protected JButton jButtonSiguientesToolBarComparativosFlujosCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarComparativosFlujosCaja;
	protected JButton jButtonAbrirOrderByToolBarComparativosFlujosCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComparativosFlujosCaja;
	protected JMenuItem jMenuItemDuplicarComparativosFlujosCaja;
	protected JMenuItem jMenuItemNuevoRelacionesComparativosFlujosCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComparativosFlujosCaja;
	protected JMenuItem jMenuItemCopiarComparativosFlujosCaja;
	protected JMenuItem jMenuItemVerFormComparativosFlujosCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaComparativosFlujosCaja;
	protected JMenuItem jMenuItemCerrarComparativosFlujosCaja;
	protected JMenuItem jMenuItemDetalleCerrarComparativosFlujosCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComparativosFlujosCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarComparativosFlujosCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionComparativosFlujosCaja;
	protected JMenuItem jMenuItemProcesarInformacionComparativosFlujosCaja;
	protected JMenuItem jMenuItemAnterioresComparativosFlujosCaja;
	protected JMenuItem jMenuItemSiguientesComparativosFlujosCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComparativosFlujosCaja;
	protected JMenuItem jMenuItemAbrirOrderByComparativosFlujosCaja;
	protected JMenuItem jMenuItemMostrarOcultarComparativosFlujosCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComparativosFlujosCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComparativosFlujosCaja;
	protected JCheckBox jCheckBoxSeleccionadosComparativosFlujosCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComparativosFlujosCaja;
	protected JCheckBox jCheckBoxConGraficoReporteComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComparativosFlujosCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComparativosFlujosCaja;
	protected JTextField jTextFieldValorCampoGeneralComparativosFlujosCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComparativosFlujosCaja;
	//public JList<Reporte> jListColumnasSelectReporteComparativosFlujosCaja;
	//public JScrollPane jScrollColumnasSelectReporteComparativosFlujosCaja;
	
	//public JLabel jLabelRelacionesSelectReporteComparativosFlujosCaja;
	//public JList<Reporte> jListRelacionesSelectReporteComparativosFlujosCaja;
	//public JScrollPane jScrollRelacionesSelectReporteComparativosFlujosCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComparativosFlujosCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComparativosFlujosCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja;
	
		
	//public JLabel jLabelArchivoImportacionComparativosFlujosCaja;	
	//public JLabel jLabelPathArchivoImportacionComparativosFlujosCaja;
	//protected JTextField jTextFieldPathArchivoImportacionComparativosFlujosCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComparativosFlujosCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja;
	
	//public JLabel jLabelColumnaCategoriaValorComparativosFlujosCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComparativosFlujosCaja;
	
	//public JLabel jLabelColumnasValoresGraficoComparativosFlujosCaja;
	//public JList<Reporte> jListColumnasValoresGraficoComparativosFlujosCaja;
	//public JScrollPane jScrollColumnasValoresGraficoComparativosFlujosCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComparativosFlujosCaja;
	public JPanel jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja;
	public JButton jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja;
	
	public JPanel jPanelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja;
	public JLabel jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja;
	public JButton jButtonid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCajaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCajaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComparativosFlujosCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComparativosFlujosCaja)	{
		this.jButtonRecargarInformacionComparativosFlujosCaja = jButtonRecargarInformacionComparativosFlujosCaja;
	}
	
	public JButton getjButtonProcesarInformacionComparativosFlujosCaja() {
		return this.jButtonProcesarInformacionComparativosFlujosCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComparativosFlujosCaja)	{
		this.jButtonProcesarInformacionComparativosFlujosCaja = jButtonProcesarInformacionComparativosFlujosCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionComparativosFlujosCaja() {
		return this.jButtonRecargarInformacionComparativosFlujosCaja;
	}
	
	
	public List<ComparativosFlujosCaja> getcomparativosflujoscajas() {
		return this.comparativosflujoscajas;
	}

	public void setcomparativosflujoscajas(List<ComparativosFlujosCaja> comparativosflujoscajas) {
		this.comparativosflujoscajas = comparativosflujoscajas;
	}
	
	public List<ComparativosFlujosCaja> getcomparativosflujoscajasAux() {
		return this.comparativosflujoscajasAux;
	}

	public void setcomparativosflujoscajasAux(List<ComparativosFlujosCaja> comparativosflujoscajasAux) {
		this.comparativosflujoscajasAux = comparativosflujoscajasAux;
	}
	
	public List<ComparativosFlujosCaja> getcomparativosflujoscajasEliminados() {
		return this.comparativosflujoscajasEliminados;
	}

	public void setComparativosFlujosCajasEliminados(List<ComparativosFlujosCaja> comparativosflujoscajasEliminados) {
		this.comparativosflujoscajasEliminados = comparativosflujoscajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComparativosFlujosCaja() {
		return jComboBoxTiposSeleccionarComparativosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComparativosFlujosCaja(
			JComboBox jComboBoxTiposSeleccionarComparativosFlujosCaja) {
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja = jComboBoxTiposSeleccionarComparativosFlujosCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComparativosFlujosCaja() {
		return jTextFieldValorCampoGeneralComparativosFlujosCaja;
	}

	public void setjTextFieldValorCampoGeneralComparativosFlujosCaja(
			JTextField jTextFieldValorCampoGeneralComparativosFlujosCaja) {
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja = jTextFieldValorCampoGeneralComparativosFlujosCaja;
	}

	public void setBorderResaltarValorCampoGeneralComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComparativosFlujosCaja() {
		return this.jCheckBoxSeleccionarTodosComparativosFlujosCaja;
	}

	public void setjCheckBoxSeleccionarTodosComparativosFlujosCaja(
			JCheckBox jCheckBoxSeleccionarTodosComparativosFlujosCaja) {
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja = jCheckBoxSeleccionarTodosComparativosFlujosCaja;
	}

	public void setBorderResaltarSeleccionarTodosComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComparativosFlujosCaja() {
		return this.jCheckBoxSeleccionadosComparativosFlujosCaja;
	}

	public void setjCheckBoxSeleccionadosComparativosFlujosCaja(
			JCheckBox jCheckBoxSeleccionadosComparativosFlujosCaja) {
		this.jCheckBoxSeleccionadosComparativosFlujosCaja = jCheckBoxSeleccionadosComparativosFlujosCaja;
	}
	
	public void setBorderResaltarSeleccionadosComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComparativosFlujosCaja() {
		return this.jComboBoxTiposArchivosReportesComparativosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComparativosFlujosCaja(
			JComboBox jComboBoxTiposArchivosReportesComparativosFlujosCaja) {
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja = jComboBoxTiposArchivosReportesComparativosFlujosCaja;
	}

	public void setBorderResaltarTiposArchivosReportesComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComparativosFlujosCaja() {
		return this.jComboBoxTiposReportesComparativosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComparativosFlujosCaja(
			JComboBox jComboBoxTiposReportesComparativosFlujosCaja) {
		this.jComboBoxTiposReportesComparativosFlujosCaja = jComboBoxTiposReportesComparativosFlujosCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComparativosFlujosCaja() {
	//	return jComboBoxTiposReportesDinamicoComparativosFlujosCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComparativosFlujosCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoComparativosFlujosCaja) {
	//	this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja = jComboBoxTiposReportesDinamicoComparativosFlujosCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja = jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja;
	//}
	
	public void setBorderResaltarTiposReportesComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComparativosFlujosCaja() {
		return this.jComboBoxTiposGraficosReportesComparativosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComparativosFlujosCaja(
			JComboBox jComboBoxTiposGraficosReportesComparativosFlujosCaja) {
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja = jComboBoxTiposGraficosReportesComparativosFlujosCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComparativosFlujosCaja() {
		return this.jComboBoxTiposPaginacionComparativosFlujosCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComparativosFlujosCaja(
			JComboBox jComboBoxTiposPaginacionComparativosFlujosCaja) {
		this.jComboBoxTiposPaginacionComparativosFlujosCaja = jComboBoxTiposPaginacionComparativosFlujosCaja;
	}
	
	public void setBorderResaltarTiposPaginacionComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComparativosFlujosCaja() {
		return this.jComboBoxTiposRelacionesComparativosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComparativosFlujosCaja() {
		return this.jComboBoxTiposAccionesComparativosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComparativosFlujosCaja(
			JComboBox jComboBoxTiposRelacionesComparativosFlujosCaja) {
		this.jComboBoxTiposRelacionesComparativosFlujosCaja = jComboBoxTiposRelacionesComparativosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComparativosFlujosCaja(
			JComboBox jComboBoxTiposAccionesComparativosFlujosCaja) {
		this.jComboBoxTiposAccionesComparativosFlujosCaja = jComboBoxTiposAccionesComparativosFlujosCaja;
	}
	
	public void setBorderResaltarTiposRelacionesComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComparativosFlujosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComparativosFlujosCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComparativosFlujosCaja() {
	//	return jCheckBoxConGraficoDinamicoComparativosFlujosCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoComparativosFlujosCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoComparativosFlujosCaja) {
	//	this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja = jCheckBoxConGraficoDinamicoComparativosFlujosCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComparativosFlujosCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComparativosFlujosCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja .setBorder(borderResaltar);		
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
		this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
		
		this.comparativosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comparativosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComparativosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComparativosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComparativosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComparativosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComparativosFlujosCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comparativos Flujos Caja MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
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
		
		ComparativosFlujosCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComparativosFlujosCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"nuevo","nuevo","Nuevo"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"duplicar","duplicar","Duplicar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"copiar","copiar","Copiar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"ver_form","ver_form","Ver"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"recargar","recargar","Buscar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComparativosFlujosCaja,this.jTtoolBarComparativosFlujosCaja,
							"cerrar","cerrar","Salir"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComparativosFlujosCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComparativosFlujosCaja;
			
				this.jButtonProcesarInformacionToolBarComparativosFlujosCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComparativosFlujosCaja;
				
		//protected JButton jButtonModificarToolBarComparativosFlujosCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComparativosFlujosCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComparativosFlujosCaja=new JMenuMe("General");
		this.jmenuArchivoComparativosFlujosCaja=new JMenuMe("Archivo");
		this.jmenuAccionesComparativosFlujosCaja=new JMenuMe("Acciones");
		this.jmenuDatosComparativosFlujosCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComparativosFlujosCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComparativosFlujosCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComparativosFlujosCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComparativosFlujosCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComparativosFlujosCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComparativosFlujosCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComparativosFlujosCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComparativosFlujosCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComparativosFlujosCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComparativosFlujosCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComparativosFlujosCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComparativosFlujosCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComparativosFlujosCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComparativosFlujosCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComparativosFlujosCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComparativosFlujosCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComparativosFlujosCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComparativosFlujosCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComparativosFlujosCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComparativosFlujosCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComparativosFlujosCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComparativosFlujosCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComparativosFlujosCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComparativosFlujosCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComparativosFlujosCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComparativosFlujosCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComparativosFlujosCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComparativosFlujosCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComparativosFlujosCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComparativosFlujosCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComparativosFlujosCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComparativosFlujosCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComparativosFlujosCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComparativosFlujosCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComparativosFlujosCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComparativosFlujosCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComparativosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComparativosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComparativosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComparativosFlujosCaja.add(this.jMenuItemCerrarComparativosFlujosCaja);
			
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemNuevoComparativosFlujosCaja);
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemNuevoGuardarCambiosComparativosFlujosCaja);
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemNuevoRelacionesComparativosFlujosCaja);
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemGuardarCambiosTablaComparativosFlujosCaja);		
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemDuplicarComparativosFlujosCaja);		
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemCopiarComparativosFlujosCaja);		
			this.jmenuAccionesComparativosFlujosCaja.add(this.jMenuItemVerFormComparativosFlujosCaja);		
			
			this.jmenuDatosComparativosFlujosCaja.add(this.jMenuItemRecargarInformacionComparativosFlujosCaja);				
			this.jmenuDatosComparativosFlujosCaja.add(this.jMenuItemAnterioresComparativosFlujosCaja);				
			this.jmenuDatosComparativosFlujosCaja.add(this.jMenuItemSiguientesComparativosFlujosCaja);				
			this.jmenuDatosComparativosFlujosCaja.add(this.jMenuItemAbrirOrderByComparativosFlujosCaja);				
			this.jmenuDatosComparativosFlujosCaja.add(this.jMenuItemMostrarOcultarComparativosFlujosCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComparativosFlujosCaja.add(this.jMenuItemGuardarCambiosComparativosFlujosCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComparativosFlujosCaja.add(this.jmenuArchivoComparativosFlujosCaja);		
			this.jmenuBarComparativosFlujosCaja.add(this.jmenuAccionesComparativosFlujosCaja);		
			this.jmenuBarComparativosFlujosCaja.add(this.jmenuDatosComparativosFlujosCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComparativosFlujosCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComparativosFlujosCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja.setToolTipText("Buscar Por Ejercicio ");
		this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja= new JButtonMe();
		this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja.setText("Buscar");
		this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja.setToolTipText("Buscar Por Ejercicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja,"buscar_button","Buscar Por Ejercicio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja = new JLabelMe();
		jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComparativosFlujosCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasComparativosFlujosCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasComparativosFlujosCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasComparativosFlujosCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComparativosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComparativosFlujosCaja = new ComparativosFlujosCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comparativos Flujos Caja DATOS");
			this.jInternalFrameDetalleFormComparativosFlujosCaja = new ComparativosFlujosCajaDetalleFormJInternalFrame(jDesktopPane,this.comparativosflujoscajaSessionBean.getConGuardarRelaciones(),this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComparativosFlujosCaja = null;//new ComparativosFlujosCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComparativosFlujosCaja= new GridBagLayout();
		
		
		this.jTableDatosComparativosFlujosCaja = new JTableMe();      
		
		String sToolTipComparativosFlujosCaja="";
		sToolTipComparativosFlujosCaja=ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComparativosFlujosCaja+="(Tesoreria.ComparativosFlujosCaja)";
		}
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComparativosFlujosCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComparativosFlujosCaja.setToolTipText(sToolTipComparativosFlujosCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComparativosFlujosCaja);
		this.jTableDatosComparativosFlujosCaja.setAutoCreateRowSorter(true);
		this.jTableDatosComparativosFlujosCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComparativosFlujosCaja.setRowSelectionAllowed(true);
		this.jTableDatosComparativosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComparativosFlujosCaja = new JButtonMe();
		this.jButtonDuplicarComparativosFlujosCaja = new JButtonMe();
		this.jButtonCopiarComparativosFlujosCaja = new JButtonMe();
		this.jButtonVerFormComparativosFlujosCaja = new JButtonMe();
		this.jButtonNuevoRelacionesComparativosFlujosCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja = new JButtonMe();
		this.jButtonCerrarComparativosFlujosCaja = new JButtonMe();
		
		this.jScrollPanelDatosComparativosFlujosCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralComparativosFlujosCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comparativos Flujos Caja";
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comparativos Flujos Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosComparativosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComparativosFlujosCaja.setToolTipText("Acciones");
        this.jPanelAccionesComparativosFlujosCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComparativosFlujosCaja=new ReporteDinamicoJInternalFrame(ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComparativosFlujosCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComparativosFlujosCaja=new ImportacionJInternalFrame(ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComparativosFlujosCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComparativosFlujosCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByComparativosFlujosCaja.setText("Orden");
		this.jButtonAbrirOrderByComparativosFlujosCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComparativosFlujosCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComparativosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComparativosFlujosCaja,false,this);
			
			//this.cargarOrderByComparativosFlujosCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComparativosFlujosCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComparativosFlujosCaja,true,this);
			
			//this.cargarOrderByComparativosFlujosCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComparativosFlujosCaja.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosComparativosFlujosCaja.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosComparativosFlujosCaja.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosComparativosFlujosCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComparativosFlujosCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComparativosFlujosCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComparativosFlujosCaja.setText("Nuevo");
		this.jButtonDuplicarComparativosFlujosCaja.setText("Duplicar");
		this.jButtonCopiarComparativosFlujosCaja.setText("Copiar");
		this.jButtonVerFormComparativosFlujosCaja.setText("Ver");
		this.jButtonNuevoRelacionesComparativosFlujosCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.setText("Guardar");
		this.jButtonCerrarComparativosFlujosCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComparativosFlujosCaja,"nuevo_button","Nuevo",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComparativosFlujosCaja,"duplicar_button","Duplicar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComparativosFlujosCaja,"copiar_button","Copiar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComparativosFlujosCaja,"ver_form","Ver",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComparativosFlujosCaja,"nuevorelaciones_button","Nuevo Rel",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComparativosFlujosCaja,"guardarcambiostabla_button","Guardar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComparativosFlujosCaja,"cerrar_button","Salir",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComparativosFlujosCaja.setToolTipText("Nuevo"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComparativosFlujosCaja.setToolTipText("Duplicar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComparativosFlujosCaja.setToolTipText("Copiar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComparativosFlujosCaja.setToolTipText("Ver"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComparativosFlujosCaja.setToolTipText("Nuevo Rel"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.setToolTipText("Guardar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComparativosFlujosCaja.setToolTipText("Salir"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComparativosFlujosCaja";
		inputMap = this.jButtonNuevoComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComparativosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComparativosFlujosCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarComparativosFlujosCaja";
		inputMap = this.jButtonDuplicarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComparativosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComparativosFlujosCaja"));
		
		//COPIAR
		sMapKey = "CopiarComparativosFlujosCaja";
		inputMap = this.jButtonCopiarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComparativosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComparativosFlujosCaja"));
		
		//VEr FORM
		sMapKey = "VerFormComparativosFlujosCaja";
		inputMap = this.jButtonVerFormComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComparativosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComparativosFlujosCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComparativosFlujosCaja";
		inputMap = this.jButtonNuevoRelacionesComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComparativosFlujosCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComparativosFlujosCaja";
		inputMap = this.jButtonModificarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComparativosFlujosCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComparativosFlujosCaja";
		inputMap = this.jButtonCerrarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComparativosFlujosCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComparativosFlujosCaja";
		inputMap = this.jButtonGuardarCambiosTablaComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComparativosFlujosCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComparativosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComparativosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComparativosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComparativosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComparativosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComparativosFlujosCaja.setName("jPanelParametrosReportesComparativosFlujosCaja"); 
		
		this.jPanelParametrosReportesAccionesComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComparativosFlujosCaja.setName("jPanelParametrosReportesAccionesComparativosFlujosCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComparativosFlujosCaja = new JButtonMe();
		this.jButtonRecargarInformacionComparativosFlujosCaja.setText("Buscar");
		this.jButtonRecargarInformacionComparativosFlujosCaja.setToolTipText("Buscar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComparativosFlujosCaja,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionComparativosFlujosCaja.setVisible(false);
		
		
		this.jButtonProcesarInformacionComparativosFlujosCaja = new JButtonMe();
		this.jButtonProcesarInformacionComparativosFlujosCaja.setText("Procesar");
		this.jButtonProcesarInformacionComparativosFlujosCaja.setToolTipText("Procesar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComparativosFlujosCaja.setVisible(false);
			
		this.jButtonProcesarInformacionComparativosFlujosCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComparativosFlujosCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComparativosFlujosCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setText("TIPO");       
		this.jComboBoxTiposReportesComparativosFlujosCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComparativosFlujosCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionComparativosFlujosCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComparativosFlujosCaja.setText("Accion");
		this.jComboBoxTiposRelacionesComparativosFlujosCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComparativosFlujosCaja.setText("Accion");
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComparativosFlujosCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComparativosFlujosCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComparativosFlujosCaja = new JLabelMe();
		
		this.jLabelAccionesComparativosFlujosCaja.setText("Acciones");		
		this.jLabelAccionesComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComparativosFlujosCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComparativosFlujosCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComparativosFlujosCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComparativosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComparativosFlujosCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteComparativosFlujosCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComparativosFlujosCaja = new JButtonMe();
		//this.jButtonAnterioresComparativosFlujosCaja.setText("<<");
        this.jButtonAnterioresComparativosFlujosCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComparativosFlujosCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComparativosFlujosCaja = new JButtonMe();
		//this.jButtonSiguientesComparativosFlujosCaja.setText(">>");
        this.jButtonSiguientesComparativosFlujosCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComparativosFlujosCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComparativosFlujosCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComparativosFlujosCaja,"nuevoguardarcambios_button","Nue",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComparativosFlujosCaja";
		inputMap = this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComparativosFlujosCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComparativosFlujosCaja";
		inputMap = this.jButtonRecargarInformacionComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComparativosFlujosCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComparativosFlujosCaja";
		inputMap = this.jButtonSiguientesComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComparativosFlujosCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComparativosFlujosCaja";
		inputMap = this.jButtonAnterioresComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComparativosFlujosCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComparativosFlujosCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComparativosFlujosCaja.setMinimumSize(new Dimension(this.getWidth(),ComparativosFlujosCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComparativosFlujosCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComparativosFlujosCaja.setMaximumSize(new Dimension(this.getWidth(),ComparativosFlujosCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComparativosFlujosCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComparativosFlujosCaja.setPreferredSize(new Dimension(this.getWidth(),ComparativosFlujosCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComparativosFlujosCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComparativosFlujosCaja = new GridBagLayout();

			this.jPanelPaginacionComparativosFlujosCaja.setLayout(gridaBagLayoutPaginacionComparativosFlujosCaja);						
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonAnterioresComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
					
						
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
			
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonNuevoGuardarCambiosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
						
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonSiguientesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 1;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonNuevoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
						
			
			
			if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
				this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComparativosFlujosCaja.gridy = 1;
				this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonGuardarCambiosTablaComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			}
			
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 1;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonDuplicarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 1;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonCopiarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 1;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonVerFormComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 1;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComparativosFlujosCaja.add(this.jButtonCerrarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		
		this.jButtonRecargarInformacionComparativosFlujosCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComparativosFlujosCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComparativosFlujosCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComparativosFlujosCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComparativosFlujosCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComparativosFlujosCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComparativosFlujosCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComparativosFlujosCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComparativosFlujosCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComparativosFlujosCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComparativosFlujosCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComparativosFlujosCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComparativosFlujosCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComparativosFlujosCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComparativosFlujosCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComparativosFlujosCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComparativosFlujosCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComparativosFlujosCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComparativosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComparativosFlujosCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComparativosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComparativosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComparativosFlujosCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComparativosFlujosCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComparativosFlujosCaja.setLayout(gridaBagParametrosReportesComparativosFlujosCaja);
			this.jPanelParametrosReportesAccionesComparativosFlujosCaja.setLayout(gridaBagParametrosReportesAccionesComparativosFlujosCaja);
			
			
			this.jPanelParametrosAuxiliar1ComparativosFlujosCaja.setLayout(gridaBagParametrosAuxiliar1ComparativosFlujosCaja);
			this.jPanelParametrosAuxiliar2ComparativosFlujosCaja.setLayout(gridaBagParametrosAuxiliar2ComparativosFlujosCaja);
			this.jPanelParametrosAuxiliar3ComparativosFlujosCaja.setLayout(gridaBagParametrosAuxiliar3ComparativosFlujosCaja);
			this.jPanelParametrosAuxiliar4ComparativosFlujosCaja.setLayout(gridaBagParametrosAuxiliar4ComparativosFlujosCaja);
			//this.jPanelParametrosAuxiliar5ComparativosFlujosCaja.setLayout(gridaBagParametrosAuxiliar2ComparativosFlujosCaja);			
			
			
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jButtonRecargarInformacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComparativosFlujosCaja.add(this.jComboBoxTiposPaginacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComparativosFlujosCaja.add(this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComparativosFlujosCaja.add(this.jComboBoxTiposArchivosReportesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jPanelParametrosAuxiliar1ComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComparativosFlujosCaja.add(this.jComboBoxTiposReportesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);																		
			
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComparativosFlujosCaja.add(this.jComboBoxTiposGraficosReportesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jPanelParametrosAuxiliar4ComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jComboBoxTiposReportesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jCheckBoxGenerarReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jPanelParametrosAuxiliar2ComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jLabelAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
				this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jButtonAbrirOrderByComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jComboBoxTiposSeleccionarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
			
			
			/*
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jCheckBoxSeleccionarTodosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jCheckBoxConGraficoReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComparativosFlujosCaja.add(this.jCheckBoxSeleccionarTodosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);															
				
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComparativosFlujosCaja.add(this.jCheckBoxSeleccionadosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);															
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComparativosFlujosCaja.add(this.jCheckBoxConGraficoReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jPanelParametrosAuxiliar3ComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComparativosFlujosCaja.add(this.jComboBoxTiposAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComparativosFlujosCaja = new GridBagLayout();

			this.jScrollPanelDatosComparativosFlujosCaja.setLayout(gridaBagLayoutDatosComparativosFlujosCaja);
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
			
			this.jScrollPanelDatosComparativosFlujosCaja.add(this.jTableDatosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComparativosFlujosCaja.setViewportView(this.jTableDatosComparativosFlujosCaja);
		this.jTableDatosComparativosFlujosCaja.setFillsViewportHeight(true);
		this.jTableDatosComparativosFlujosCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComparativosFlujosCaja= new GridBagLayout();
		this.jPanelAccionesComparativosFlujosCaja.setLayout(gridaBagLayoutAccionesComparativosFlujosCaja);
		
		
		/*	
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
			
		this.jPanelAccionesComparativosFlujosCaja.add(this.jButtonNuevoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaComparativosFlujosCajaComparativosFlujosCaja= new GridBagLayout();
		gridaBagLayoutBusquedaComparativosFlujosCajaComparativosFlujosCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaComparativosFlujosCajaComparativosFlujosCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaComparativosFlujosCajaComparativosFlujosCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaComparativosFlujosCajaComparativosFlujosCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja.setLayout(gridaBagLayoutBusquedaComparativosFlujosCajaComparativosFlujosCaja);

		gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		gridBagConstraintsComparativosFlujosCaja.gridx = 0;
		jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja.add(jLabelid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja, gridBagConstraintsComparativosFlujosCaja);

		gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		gridBagConstraintsComparativosFlujosCaja.gridx = 1;
		jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja.add(jComboBoxid_ejercicioBusquedaComparativosFlujosCajaComparativosFlujosCaja, gridBagConstraintsComparativosFlujosCaja);

		gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComparativosFlujosCaja.gridy = 1;
		gridBagConstraintsComparativosFlujosCaja.gridx =1;
		jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja.add(jButtonBusquedaComparativosFlujosCajaComparativosFlujosCaja, gridBagConstraintsComparativosFlujosCaja);

		jTabbedPaneBusquedasComparativosFlujosCaja.addTab("1.-Por Ejercicio ", jPanelBusquedaComparativosFlujosCajaComparativosFlujosCaja);
		jTabbedPaneBusquedasComparativosFlujosCaja.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComparativosFlujosCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();						
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;		
			//this.gridBagConstraintsComparativosFlujosCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComparativosFlujosCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;		
		//this.gridBagConstraintsComparativosFlujosCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComparativosFlujosCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;		
			this.gridBagConstraintsComparativosFlujosCaja.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComparativosFlujosCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);								
		
		
		/*
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		*/		
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComparativosFlujosCaja.gridx =0;
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComparativosFlujosCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
				
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComparativosFlujosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComparativosFlujosCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosComparativosFlujosCaja.setLayout(gridaBagLayoutBusquedasParametrosComparativosFlujosCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComparativosFlujosCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComparativosFlujosCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComparativosFlujosCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComparativosFlujosCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComparativosFlujosCaja.setName("jPanelReporteDinamicoComparativosFlujosCaja"); 
		
		this.jPanelReporteDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComparativosFlujosCaja.setLayout(gridaBagLayoutReporteDinamicoComparativosFlujosCaja);
		
		
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComparativosFlujosCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComparativosFlujosCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comparativos Flujos Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComparativosFlujosCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteComparativosFlujosCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelColumnasSelectReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComparativosFlujosCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteComparativosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComparativosFlujosCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComparativosFlujosCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComparativosFlujosCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComparativosFlujosCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComparativosFlujosCaja=new JScrollPane(this.jListColumnasSelectReporteComparativosFlujosCaja);
			
			this.jScrollColumnasSelectReporteComparativosFlujosCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComparativosFlujosCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComparativosFlujosCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jListColumnasSelectReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jScrollColumnasSelectReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComparativosFlujosCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteComparativosFlujosCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComparativosFlujosCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteComparativosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComparativosFlujosCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComparativosFlujosCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComparativosFlujosCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComparativosFlujosCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComparativosFlujosCaja=new JScrollPane(this.jListRelacionesSelectReporteComparativosFlujosCaja);
			
			this.jScrollRelacionesSelectReporteComparativosFlujosCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComparativosFlujosCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComparativosFlujosCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoComparativosFlujosCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComparativosFlujosCaja = new JLabelMe();

		this.jLabelConGraficoDinamicoComparativosFlujosCaja.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelConGraficoDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jCheckBoxConGraficoDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComparativosFlujosCaja = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComparativosFlujosCaja.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelColumnaCategoriaGraficoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComparativosFlujosCaja = new JLabelMe();

		this.jLabelColumnaCategoriaValorComparativosFlujosCaja.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelColumnaCategoriaValorComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jComboBoxColumnaCategoriaValorComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComparativosFlujosCaja = new JLabelMe();

		this.jLabelColumnasValoresGraficoComparativosFlujosCaja.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelColumnasValoresGraficoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComparativosFlujosCaja = new JList<Reporte>();
		this.jListColumnasValoresGraficoComparativosFlujosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComparativosFlujosCaja.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComparativosFlujosCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComparativosFlujosCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComparativosFlujosCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComparativosFlujosCaja=new JScrollPane(this.jListColumnasValoresGraficoComparativosFlujosCaja);
			
			this.jScrollColumnasValoresGraficoComparativosFlujosCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComparativosFlujosCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComparativosFlujosCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jListColumnasSelectReporteComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jScrollColumnasValoresGraficoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelTiposGraficosReportesDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComparativosFlujosCaja.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jComboBoxTiposGraficosReportesDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelGenerarExcelReporteDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja.setToolTipText("Generar EXCEL"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jButtonGenerarExcelReporteDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jComboBoxTiposReportesDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jLabelTiposArchivoReporteDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jComboBoxTiposArchivosReportesDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComparativosFlujosCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComparativosFlujosCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComparativosFlujosCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComparativosFlujosCaja.setToolTipText("Generar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jButtonGenerarReporteDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComparativosFlujosCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComparativosFlujosCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComparativosFlujosCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComparativosFlujosCaja.setToolTipText("Cancelar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComparativosFlujosCaja.add(this.jButtonCerrarReporteDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComparativosFlujosCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComparativosFlujosCaja= new JScrollPane(jPanelReporteDinamicoComparativosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comparativos Flujos Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComparativosFlujosCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComparativosFlujosCaja);
		this.jInternalFrameReporteDinamicoComparativosFlujosCaja.getContentPane().add(this.jScrollPanelReporteDinamicoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComparativosFlujosCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComparativosFlujosCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComparativosFlujosCaja.setName("jPanelImportacionComparativosFlujosCaja"); 
		
		this.jPanelImportacionComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComparativosFlujosCaja.setLayout(gridaBagLayoutImportacionComparativosFlujosCaja);
		
		
		this.jInternalFrameImportacionComparativosFlujosCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComparativosFlujosCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComparativosFlujosCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComparativosFlujosCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComparativosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComparativosFlujosCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComparativosFlujosCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComparativosFlujosCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComparativosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComparativosFlujosCaja.setResizable(true);
	    this.jInternalFrameImportacionComparativosFlujosCaja.setClosable(true);
	    this.jInternalFrameImportacionComparativosFlujosCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComparativosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComparativosFlujosCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComparativosFlujosCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComparativosFlujosCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComparativosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComparativosFlujosCaja.setResizable(true);
	    this.jInternalFrameImportacionComparativosFlujosCaja.setClosable(true);
	    this.jInternalFrameImportacionComparativosFlujosCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comparativos Flujos Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComparativosFlujosCaja = new JLabelMe();

		this.jLabelArchivoImportacionComparativosFlujosCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComparativosFlujosCaja.add(this.jLabelArchivoImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComparativosFlujosCaja = new JFileChooser();		
		this.jFileChooserImportacionComparativosFlujosCaja.setToolTipText("ESCOGER ARCHIVO"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComparativosFlujosCaja = new JButtonMe();
		this.jButtonAbrirImportacionComparativosFlujosCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComparativosFlujosCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComparativosFlujosCaja.setToolTipText("Generar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComparativosFlujosCaja.add(this.jButtonAbrirImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComparativosFlujosCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionComparativosFlujosCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComparativosFlujosCaja.add(this.jLabelPathArchivoImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComparativosFlujosCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComparativosFlujosCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComparativosFlujosCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComparativosFlujosCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComparativosFlujosCaja.add(this.jTextFieldPathArchivoImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComparativosFlujosCaja = new JButtonMe();
		this.jButtonGenerarImportacionComparativosFlujosCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComparativosFlujosCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComparativosFlujosCaja.setToolTipText("Generar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComparativosFlujosCaja.add(this.jButtonGenerarImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComparativosFlujosCaja = new JButtonMe();
		this.jButtonCerrarImportacionComparativosFlujosCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComparativosFlujosCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComparativosFlujosCaja.setToolTipText("Cancelar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComparativosFlujosCaja.add(this.jButtonCerrarImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComparativosFlujosCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionComparativosFlujosCaja= new JScrollPane(jPanelImportacionComparativosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsComparativosFlujosCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComparativosFlujosCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComparativosFlujosCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComparativosFlujosCaja);
		this.jInternalFrameImportacionComparativosFlujosCaja.getContentPane().add(this.jScrollPanelImportacionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComparativosFlujosCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComparativosFlujosCaja = new JButtonMe();
			this.jButtonAbrirOrderByComparativosFlujosCaja.setText("Orden");
			this.jButtonAbrirOrderByComparativosFlujosCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComparativosFlujosCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComparativosFlujosCaja";
			inputMap = this.jButtonAbrirOrderByComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComparativosFlujosCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByComparativosFlujosCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComparativosFlujosCaja.setName("jPanelOrderByComparativosFlujosCaja"); 
			
			this.jPanelOrderByComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComparativosFlujosCaja.setLayout(gridaBagLayoutOrderByComparativosFlujosCaja);
			
			
			this.jTableDatosComparativosFlujosCajaOrderBy = new JTableMe();        
			this.jTableDatosComparativosFlujosCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComparativosFlujosCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComparativosFlujosCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComparativosFlujosCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComparativosFlujosCajaOrderBy.setViewportView(this.jTableDatosComparativosFlujosCajaOrderBy);
			this.jTableDatosComparativosFlujosCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComparativosFlujosCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComparativosFlujosCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComparativosFlujosCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComparativosFlujosCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComparativosFlujosCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComparativosFlujosCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComparativosFlujosCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComparativosFlujosCaja.setTitle("Orden");
			this.jInternalFrameOrderByComparativosFlujosCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComparativosFlujosCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComparativosFlujosCaja.setResizable(true);
			this.jInternalFrameOrderByComparativosFlujosCaja.setClosable(true);
			this.jInternalFrameOrderByComparativosFlujosCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comparativos Flujos Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComparativosFlujosCaja.ipady =150;
				
			this.jPanelOrderByComparativosFlujosCaja.add(jScrollPanelDatosComparativosFlujosCajaOrderBy, this.gridBagConstraintsComparativosFlujosCaja);//this.jTableDatosComparativosFlujosCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComparativosFlujosCaja = new JButtonMe();
			this.jButtonCerrarOrderByComparativosFlujosCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComparativosFlujosCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComparativosFlujosCaja.setToolTipText("Cancelar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComparativosFlujosCaja.add(this.jButtonCerrarOrderByComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComparativosFlujosCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByComparativosFlujosCaja= new JScrollPane(jPanelOrderByComparativosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsComparativosFlujosCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComparativosFlujosCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComparativosFlujosCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComparativosFlujosCaja);
			
			this.jInternalFrameOrderByComparativosFlujosCaja.getContentPane().add(this.jScrollPanelOrderByComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
		
		} else {
			this.jButtonAbrirOrderByComparativosFlujosCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComparativosFlujosCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosComparativosFlujosCaja.getRowHeight();//ComparativosFlujosCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.isSelected()) {
					iHeightTable=ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComparativosFlujosCaja.isSelected()) {
					iHeightTable=ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComparativosFlujosCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComparativosFlujosCaja!=null && this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComparativosFlujosCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComparativosFlujosCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComparativosFlujosCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComparativosFlujosCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=comparativosflujoscajaLogic.getComparativosFlujosCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comparativosflujoscajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComparativosFlujosCaja> TraerComparativosFlujosCajaBeans(List<ComparativosFlujosCaja> comparativosflujoscajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComparativosFlujosCaja comparativosflujoscaja:comparativosflujoscajas) {
					
				if(!(ComparativosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComparativosFlujosCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comparativosflujoscaja.setsDetalleGeneralEntityReporte(ComparativosFlujosCajaConstantesFunciones.getComparativosFlujosCajaDescripcion(comparativosflujoscaja));
										
						
					
						
					
				} else  {
							
					//comparativosflujoscaja.setsDetalleGeneralEntityReporte(comparativosflujoscaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//comparativosflujoscajabeans.add(comparativosflujoscajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comparativosflujoscajas;
    }
	//PARA REPORTES FIN
}
