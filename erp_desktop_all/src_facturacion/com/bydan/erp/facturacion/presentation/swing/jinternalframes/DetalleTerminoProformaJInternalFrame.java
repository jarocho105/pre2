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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetalleTerminoProformaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetalleTerminoProformaJInternalFrame extends DetalleTerminoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleTerminoProforma;
	
	protected JMenuBar jmenuBarDetalleTerminoProforma;
	
	protected JMenu jmenuDetalleTerminoProforma;
	protected JMenu jmenuDatosDetalleTerminoProforma;
	protected JMenu jmenuArchivoDetalleTerminoProforma;
	protected JMenu jmenuAccionesDetalleTerminoProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleTerminoProforma;	
	protected GridBagConstraints gridBagConstraintsDetalleTerminoProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleTerminoProformaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleTerminoProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleTerminoProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleTerminoProforma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_terminoproforma="";
	
	public DetalleTerminoProformaSessionBean detalleterminoproformaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TerminoProformaSessionBean terminoproformaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleTerminoProforma> detalleterminoproformas;		
	public List<DetalleTerminoProforma> detalleterminoproformasEliminados;	
	public List<DetalleTerminoProforma> detalleterminoproformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleTerminoProforma;		
	protected JButton jButtonAbrirOrderByDetalleTerminoProforma;
	
	
	//protected JPanel jPanelOrderByDetalleTerminoProforma;
	//public JScrollPane jScrollPanelOrderByDetalleTerminoProforma;	
	//protected JButton jButtonCerrarOrderByDetalleTerminoProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleTerminoProformaLogic detalleterminoproformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleTerminoProforma;
	public JScrollPane jScrollPanelDatosEdicionDetalleTerminoProforma;
	public JScrollPane jScrollPanelDatosGeneralDetalleTerminoProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleTerminoProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleTerminoProforma;
	//public JScrollPane jScrollPanelImportacionDetalleTerminoProforma;
	
	
	
	protected JPanel jPanelAccionesDetalleTerminoProforma;
	
    protected JPanel jPanelPaginacionDetalleTerminoProforma;
    protected JPanel jPanelParametrosReportesDetalleTerminoProforma;
	protected JPanel jPanelParametrosReportesAccionesDetalleTerminoProforma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleTerminoProforma;
	protected JPanel jPanelParametrosAuxiliar2DetalleTerminoProforma;
	protected JPanel jPanelParametrosAuxiliar3DetalleTerminoProforma;
	protected JPanel jPanelParametrosAuxiliar4DetalleTerminoProforma;
	//protected JPanel jPanelParametrosAuxiliar5DetalleTerminoProforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleTerminoProforma;
	//protected JPanel jPanelImportacionDetalleTerminoProforma;
	
	
	public JTable jTableDatosDetalleTerminoProforma;
	
	
	
	//public JTable jTableDatosDetalleTerminoProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleTerminoProforma;
	protected JButton jButtonDuplicarDetalleTerminoProforma;
	protected JButton jButtonCopiarDetalleTerminoProforma;
	protected JButton jButtonVerFormDetalleTerminoProforma;
	protected JButton jButtonNuevoRelacionesDetalleTerminoProforma;
	protected JButton jButtonModificarDetalleTerminoProforma;
	
    protected JButton jButtonGuardarCambiosTablaDetalleTerminoProforma;
	protected JButton jButtonCerrarDetalleTerminoProforma;
	
	
	protected JButton jButtonRecargarInformacionDetalleTerminoProforma;
	protected JButton jButtonProcesarInformacionDetalleTerminoProforma;
	
	
	protected JButton jButtonAnterioresDetalleTerminoProforma;
	protected JButton jButtonSiguientesDetalleTerminoProforma;
	protected JButton jButtonNuevoGuardarCambiosDetalleTerminoProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleTerminoProforma;
	//protected JButton jButtonCerrarReporteDinamicoDetalleTerminoProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleTerminoProforma;
	//protected JButton jButtonGenerarImportacionDetalleTerminoProforma;
	//protected JButton jButtonCerrarImportacionDetalleTerminoProforma;
	//protected JFileChooser jFileChooserImportacionDetalleTerminoProforma;
	//protected File fileImportacionDetalleTerminoProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleTerminoProforma;
	protected JButton jButtonDuplicarToolBarDetalleTerminoProforma;
	protected JButton jButtonNuevoRelacionesToolBarDetalleTerminoProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleTerminoProforma;
	protected JButton jButtonCopiarToolBarDetalleTerminoProforma;
	protected JButton jButtonVerFormToolBarDetalleTerminoProforma;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleTerminoProforma;
	protected JButton jButtonCerrarToolBarDetalleTerminoProforma;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleTerminoProforma;
	protected JButton jButtonProcesarInformacionToolBarDetalleTerminoProforma;
	protected JButton jButtonAnterioresToolBarDetalleTerminoProforma;
	protected JButton jButtonSiguientesToolBarDetalleTerminoProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleTerminoProforma;
	protected JButton jButtonAbrirOrderByToolBarDetalleTerminoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleTerminoProforma;
	protected JMenuItem jMenuItemDuplicarDetalleTerminoProforma;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleTerminoProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleTerminoProforma;
	protected JMenuItem jMenuItemCopiarDetalleTerminoProforma;
	protected JMenuItem jMenuItemVerFormDetalleTerminoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleTerminoProforma;
	protected JMenuItem jMenuItemCerrarDetalleTerminoProforma;
	protected JMenuItem jMenuItemDetalleCerrarDetalleTerminoProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleTerminoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleTerminoProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleTerminoProforma;
	protected JMenuItem jMenuItemProcesarInformacionDetalleTerminoProforma;
	protected JMenuItem jMenuItemAnterioresDetalleTerminoProforma;
	protected JMenuItem jMenuItemSiguientesDetalleTerminoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleTerminoProforma;
	protected JMenuItem jMenuItemAbrirOrderByDetalleTerminoProforma;
	protected JMenuItem jMenuItemMostrarOcultarDetalleTerminoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleTerminoProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleTerminoProforma;
	protected JCheckBox jCheckBoxSeleccionadosDetalleTerminoProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleTerminoProforma;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleTerminoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleTerminoProforma;
	protected JTextField jTextFieldValorCampoGeneralDetalleTerminoProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleTerminoProforma;
	//public JList<Reporte> jListColumnasSelectReporteDetalleTerminoProforma;
	//public JScrollPane jScrollColumnasSelectReporteDetalleTerminoProforma;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleTerminoProforma;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleTerminoProforma;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleTerminoProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleTerminoProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleTerminoProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma;
	
		
	//public JLabel jLabelArchivoImportacionDetalleTerminoProforma;	
	//public JLabel jLabelPathArchivoImportacionDetalleTerminoProforma;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleTerminoProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleTerminoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleTerminoProforma;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleTerminoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleTerminoProforma;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleTerminoProforma;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleTerminoProforma;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleTerminoProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleTerminoProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleTerminoProforma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleTerminoProforma;
	public JPanel jPanelFK_IdTerminoProformaDetalleTerminoProforma;
	public JButton jButtonFK_IdTerminoProformaDetalleTerminoProforma;
	
	public JPanel jPanelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma;
	public JLabel jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma;
	public JButton jButtonid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma= new JButtonMe();
	public JButton jButtonid_termino_proformaFK_IdTerminoProformaDetalleTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_termino_proformaFK_IdTerminoProformaDetalleTerminoProformaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleTerminoProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTerminoProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleTerminoProforma)	{
		this.jButtonRecargarInformacionDetalleTerminoProforma = jButtonRecargarInformacionDetalleTerminoProforma;
	}
	
	public JButton getjButtonProcesarInformacionDetalleTerminoProforma() {
		return this.jButtonProcesarInformacionDetalleTerminoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleTerminoProforma)	{
		this.jButtonProcesarInformacionDetalleTerminoProforma = jButtonProcesarInformacionDetalleTerminoProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleTerminoProforma() {
		return this.jButtonRecargarInformacionDetalleTerminoProforma;
	}
	
	
	public List<DetalleTerminoProforma> getdetalleterminoproformas() {
		return this.detalleterminoproformas;
	}

	public void setdetalleterminoproformas(List<DetalleTerminoProforma> detalleterminoproformas) {
		this.detalleterminoproformas = detalleterminoproformas;
	}
	
	public List<DetalleTerminoProforma> getdetalleterminoproformasAux() {
		return this.detalleterminoproformasAux;
	}

	public void setdetalleterminoproformasAux(List<DetalleTerminoProforma> detalleterminoproformasAux) {
		this.detalleterminoproformasAux = detalleterminoproformasAux;
	}
	
	public List<DetalleTerminoProforma> getdetalleterminoproformasEliminados() {
		return this.detalleterminoproformasEliminados;
	}

	public void setDetalleTerminoProformasEliminados(List<DetalleTerminoProforma> detalleterminoproformasEliminados) {
		this.detalleterminoproformasEliminados = detalleterminoproformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleTerminoProforma() {
		return jComboBoxTiposSeleccionarDetalleTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleTerminoProforma(
			JComboBox jComboBoxTiposSeleccionarDetalleTerminoProforma) {
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma = jComboBoxTiposSeleccionarDetalleTerminoProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleTerminoProforma() {
		return jTextFieldValorCampoGeneralDetalleTerminoProforma;
	}

	public void setjTextFieldValorCampoGeneralDetalleTerminoProforma(
			JTextField jTextFieldValorCampoGeneralDetalleTerminoProforma) {
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma = jTextFieldValorCampoGeneralDetalleTerminoProforma;
	}

	public void setBorderResaltarValorCampoGeneralDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleTerminoProforma() {
		return this.jCheckBoxSeleccionarTodosDetalleTerminoProforma;
	}

	public void setjCheckBoxSeleccionarTodosDetalleTerminoProforma(
			JCheckBox jCheckBoxSeleccionarTodosDetalleTerminoProforma) {
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma = jCheckBoxSeleccionarTodosDetalleTerminoProforma;
	}

	public void setBorderResaltarSeleccionarTodosDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleTerminoProforma() {
		return this.jCheckBoxSeleccionadosDetalleTerminoProforma;
	}

	public void setjCheckBoxSeleccionadosDetalleTerminoProforma(
			JCheckBox jCheckBoxSeleccionadosDetalleTerminoProforma) {
		this.jCheckBoxSeleccionadosDetalleTerminoProforma = jCheckBoxSeleccionadosDetalleTerminoProforma;
	}
	
	public void setBorderResaltarSeleccionadosDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleTerminoProforma() {
		return this.jComboBoxTiposArchivosReportesDetalleTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleTerminoProforma(
			JComboBox jComboBoxTiposArchivosReportesDetalleTerminoProforma) {
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma = jComboBoxTiposArchivosReportesDetalleTerminoProforma;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleTerminoProforma() {
		return this.jComboBoxTiposReportesDetalleTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleTerminoProforma(
			JComboBox jComboBoxTiposReportesDetalleTerminoProforma) {
		this.jComboBoxTiposReportesDetalleTerminoProforma = jComboBoxTiposReportesDetalleTerminoProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleTerminoProforma() {
	//	return jComboBoxTiposReportesDinamicoDetalleTerminoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleTerminoProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleTerminoProforma) {
	//	this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma = jComboBoxTiposReportesDinamicoDetalleTerminoProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma = jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma;
	//}
	
	public void setBorderResaltarTiposReportesDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleTerminoProforma() {
		return this.jComboBoxTiposGraficosReportesDetalleTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleTerminoProforma(
			JComboBox jComboBoxTiposGraficosReportesDetalleTerminoProforma) {
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma = jComboBoxTiposGraficosReportesDetalleTerminoProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleTerminoProforma() {
		return this.jComboBoxTiposPaginacionDetalleTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleTerminoProforma(
			JComboBox jComboBoxTiposPaginacionDetalleTerminoProforma) {
		this.jComboBoxTiposPaginacionDetalleTerminoProforma = jComboBoxTiposPaginacionDetalleTerminoProforma;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleTerminoProforma() {
		return this.jComboBoxTiposRelacionesDetalleTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleTerminoProforma() {
		return this.jComboBoxTiposAccionesDetalleTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleTerminoProforma(
			JComboBox jComboBoxTiposRelacionesDetalleTerminoProforma) {
		this.jComboBoxTiposRelacionesDetalleTerminoProforma = jComboBoxTiposRelacionesDetalleTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleTerminoProforma(
			JComboBox jComboBoxTiposAccionesDetalleTerminoProforma) {
		this.jComboBoxTiposAccionesDetalleTerminoProforma = jComboBoxTiposAccionesDetalleTerminoProforma;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleTerminoProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleTerminoProforma() {
	//	return jCheckBoxConGraficoDinamicoDetalleTerminoProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleTerminoProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleTerminoProforma) {
	//	this.jCheckBoxConGraficoDinamicoDetalleTerminoProforma = jCheckBoxConGraficoDinamicoDetalleTerminoProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleTerminoProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleTerminoProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleTerminoProforma .setBorder(borderResaltar);		
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
		this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		
		this.detalleterminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleterminoproformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleTerminoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Termino Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleTerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTerminoProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"nuevo","nuevo","Nuevo"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"duplicar","duplicar","Duplicar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"copiar","copiar","Copiar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"ver_form","ver_form","Ver"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"recargar","recargar","Recargar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"cerrar","cerrar","Salir"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleTerminoProforma;
			
				this.jButtonProcesarInformacionToolBarDetalleTerminoProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleTerminoProforma;
				
		//protected JButton jButtonModificarToolBarDetalleTerminoProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleTerminoProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleTerminoProforma=new JMenuMe("General");
		this.jmenuArchivoDetalleTerminoProforma=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleTerminoProforma=new JMenuMe("Acciones");
		this.jmenuDatosDetalleTerminoProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleTerminoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleTerminoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleTerminoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleTerminoProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleTerminoProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleTerminoProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleTerminoProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleTerminoProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleTerminoProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleTerminoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleTerminoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleTerminoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleTerminoProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleTerminoProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleTerminoProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleTerminoProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleTerminoProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleTerminoProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleTerminoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleTerminoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleTerminoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleTerminoProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleTerminoProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleTerminoProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleTerminoProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleTerminoProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleTerminoProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleTerminoProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleTerminoProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleTerminoProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleTerminoProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleTerminoProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleTerminoProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleTerminoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleTerminoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleTerminoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleTerminoProforma.add(this.jMenuItemCerrarDetalleTerminoProforma);
			
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemNuevoDetalleTerminoProforma);
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma);
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemNuevoRelacionesDetalleTerminoProforma);
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma);		
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemDuplicarDetalleTerminoProforma);		
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemCopiarDetalleTerminoProforma);		
			this.jmenuAccionesDetalleTerminoProforma.add(this.jMenuItemVerFormDetalleTerminoProforma);		
			
			this.jmenuDatosDetalleTerminoProforma.add(this.jMenuItemRecargarInformacionDetalleTerminoProforma);				
			this.jmenuDatosDetalleTerminoProforma.add(this.jMenuItemAnterioresDetalleTerminoProforma);				
			this.jmenuDatosDetalleTerminoProforma.add(this.jMenuItemSiguientesDetalleTerminoProforma);				
			this.jmenuDatosDetalleTerminoProforma.add(this.jMenuItemAbrirOrderByDetalleTerminoProforma);				
			this.jmenuDatosDetalleTerminoProforma.add(this.jMenuItemMostrarOcultarDetalleTerminoProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleTerminoProforma.add(this.jMenuItemGuardarCambiosDetalleTerminoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTerminoProforma.add(this.jmenuArchivoDetalleTerminoProforma);		
			this.jmenuBarDetalleTerminoProforma.add(this.jmenuAccionesDetalleTerminoProforma);		
			this.jmenuBarDetalleTerminoProforma.add(this.jmenuDatosDetalleTerminoProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleTerminoProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleTerminoProforma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTerminoProformaDetalleTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTerminoProformaDetalleTerminoProforma.setToolTipText("Buscar Por Termino Proforma ");
		this.jButtonFK_IdTerminoProformaDetalleTerminoProforma= new JButtonMe();
		this.jButtonFK_IdTerminoProformaDetalleTerminoProforma.setText("Buscar");
		this.jButtonFK_IdTerminoProformaDetalleTerminoProforma.setToolTipText("Buscar Por Termino Proforma ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTerminoProformaDetalleTerminoProforma,"buscar_button","Buscar Por Termino Proforma ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTerminoProformaDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma = new JLabelMe();
		jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setText("Termino Proforma :");
		jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setToolTipText("Termino Proforma");
		jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma= new JComboBoxMe();
		jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleTerminoProforma=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleTerminoProforma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleTerminoProforma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleTerminoProforma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleTerminoProforma = new DetalleTerminoProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Termino Proforma DATOS");
			this.jInternalFrameDetalleFormDetalleTerminoProforma = new DetalleTerminoProformaDetalleFormJInternalFrame(jDesktopPane,this.detalleterminoproformaSessionBean.getConGuardarRelaciones(),this.detalleterminoproformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleTerminoProforma = null;//new DetalleTerminoProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleTerminoProforma= new GridBagLayout();
		
		
		this.jTableDatosDetalleTerminoProforma = new JTableMe();      
		
		String sToolTipDetalleTerminoProforma="";
		sToolTipDetalleTerminoProforma=DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleTerminoProforma+="(Facturacion.DetalleTerminoProforma)";
		}
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleTerminoProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleTerminoProforma.setToolTipText(sToolTipDetalleTerminoProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleTerminoProforma);
		this.jTableDatosDetalleTerminoProforma.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleTerminoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleTerminoProforma.setRowSelectionAllowed(true);
		this.jTableDatosDetalleTerminoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleTerminoProforma = new JButtonMe();
		this.jButtonDuplicarDetalleTerminoProforma = new JButtonMe();
		this.jButtonCopiarDetalleTerminoProforma = new JButtonMe();
		this.jButtonVerFormDetalleTerminoProforma = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleTerminoProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma = new JButtonMe();
		this.jButtonCerrarDetalleTerminoProforma = new JButtonMe();
		
		this.jScrollPanelDatosDetalleTerminoProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleTerminoProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Termino Proforma";
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Termino Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleTerminoProforma.setToolTipText("Acciones");
        this.jPanelAccionesDetalleTerminoProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleTerminoProforma=new ReporteDinamicoJInternalFrame(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleTerminoProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleTerminoProforma=new ImportacionJInternalFrame(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleTerminoProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleTerminoProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleTerminoProforma.setText("Orden");
		this.jButtonAbrirOrderByDetalleTerminoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleTerminoProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTerminoProforma,false,this);
			
			//this.cargarOrderByDetalleTerminoProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTerminoProforma,true,this);
			
			//this.cargarOrderByDetalleTerminoProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleTerminoProforma.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleTerminoProforma.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleTerminoProforma.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosDetalleTerminoProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleTerminoProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleTerminoProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleTerminoProforma.setText("Nuevo");
		this.jButtonDuplicarDetalleTerminoProforma.setText("Duplicar");
		this.jButtonCopiarDetalleTerminoProforma.setText("Copiar");
		this.jButtonVerFormDetalleTerminoProforma.setText("Ver");
		this.jButtonNuevoRelacionesDetalleTerminoProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.setText("Guardar");
		this.jButtonCerrarDetalleTerminoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleTerminoProforma,"nuevo_button","Nuevo",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleTerminoProforma,"duplicar_button","Duplicar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleTerminoProforma,"copiar_button","Copiar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleTerminoProforma,"ver_form","Ver",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleTerminoProforma,"nuevorelaciones_button","Nuevo Rel",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleTerminoProforma,"guardarcambiostabla_button","Guardar",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleTerminoProforma,"cerrar_button","Salir",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleTerminoProforma.setToolTipText("Nuevo"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleTerminoProforma.setToolTipText("Duplicar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleTerminoProforma.setToolTipText("Copiar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleTerminoProforma.setToolTipText("Ver"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleTerminoProforma.setToolTipText("Nuevo Rel"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.setToolTipText("Guardar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleTerminoProforma.setToolTipText("Salir"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleTerminoProforma";
		inputMap = this.jButtonNuevoDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleTerminoProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleTerminoProforma";
		inputMap = this.jButtonDuplicarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleTerminoProforma"));
		
		//COPIAR
		sMapKey = "CopiarDetalleTerminoProforma";
		inputMap = this.jButtonCopiarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleTerminoProforma"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleTerminoProforma";
		inputMap = this.jButtonVerFormDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleTerminoProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleTerminoProforma";
		inputMap = this.jButtonNuevoRelacionesDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleTerminoProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleTerminoProforma";
		inputMap = this.jButtonModificarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleTerminoProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleTerminoProforma";
		inputMap = this.jButtonCerrarDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleTerminoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleTerminoProforma";
		inputMap = this.jButtonGuardarCambiosTablaDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleTerminoProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleTerminoProforma.setName("jPanelParametrosReportesDetalleTerminoProforma"); 
		
		this.jPanelParametrosReportesAccionesDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleTerminoProforma.setName("jPanelParametrosReportesAccionesDetalleTerminoProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleTerminoProforma = new JButtonMe();
		this.jButtonRecargarInformacionDetalleTerminoProforma.setText("Recargar");
		this.jButtonRecargarInformacionDetalleTerminoProforma.setToolTipText("Recargar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleTerminoProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleTerminoProforma = new JButtonMe();
		this.jButtonProcesarInformacionDetalleTerminoProforma.setText("Procesar");
		this.jButtonProcesarInformacionDetalleTerminoProforma.setToolTipText("Procesar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleTerminoProforma.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleTerminoProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleTerminoProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleTerminoProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleTerminoProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleTerminoProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleTerminoProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleTerminoProforma.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleTerminoProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleTerminoProforma.setText("Accion");
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleTerminoProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleTerminoProforma = new JLabelMe();
		
		this.jLabelAccionesDetalleTerminoProforma.setText("Acciones");		
		this.jLabelAccionesDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleTerminoProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleTerminoProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleTerminoProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleTerminoProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleTerminoProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleTerminoProforma = new JButtonMe();
		//this.jButtonAnterioresDetalleTerminoProforma.setText("<<");
        this.jButtonAnterioresDetalleTerminoProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleTerminoProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleTerminoProforma = new JButtonMe();
		//this.jButtonSiguientesDetalleTerminoProforma.setText(">>");
        this.jButtonSiguientesDetalleTerminoProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleTerminoProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleTerminoProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleTerminoProforma,"nuevoguardarcambios_button","Nue",this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleTerminoProforma";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleTerminoProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleTerminoProforma";
		inputMap = this.jButtonRecargarInformacionDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleTerminoProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleTerminoProforma";
		inputMap = this.jButtonSiguientesDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleTerminoProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleTerminoProforma";
		inputMap = this.jButtonAnterioresDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleTerminoProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleTerminoProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleTerminoProforma.setMinimumSize(new Dimension(this.getWidth(),DetalleTerminoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTerminoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleTerminoProforma.setMaximumSize(new Dimension(this.getWidth(),DetalleTerminoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTerminoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleTerminoProforma.setPreferredSize(new Dimension(this.getWidth(),DetalleTerminoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleTerminoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleTerminoProforma = new GridBagLayout();

			this.jPanelPaginacionDetalleTerminoProforma.setLayout(gridaBagLayoutPaginacionDetalleTerminoProforma);						
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonAnterioresDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
					
						
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
			
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonNuevoGuardarCambiosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
						
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonSiguientesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 1;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonNuevoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
						
			
			
			if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
				this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleTerminoProforma.gridy = 1;
				this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonGuardarCambiosTablaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			}
			
			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 1;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonDuplicarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 1;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonCopiarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 1;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonVerFormDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 1;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleTerminoProforma.add(this.jButtonCerrarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
		
		
		this.jButtonRecargarInformacionDetalleTerminoProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleTerminoProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleTerminoProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleTerminoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleTerminoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleTerminoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleTerminoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleTerminoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleTerminoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleTerminoProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleTerminoProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleTerminoProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleTerminoProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleTerminoProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleTerminoProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleTerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleTerminoProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleTerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleTerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleTerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleTerminoProforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleTerminoProforma.setLayout(gridaBagParametrosReportesDetalleTerminoProforma);
			this.jPanelParametrosReportesAccionesDetalleTerminoProforma.setLayout(gridaBagParametrosReportesAccionesDetalleTerminoProforma);
			
			
			this.jPanelParametrosAuxiliar1DetalleTerminoProforma.setLayout(gridaBagParametrosAuxiliar1DetalleTerminoProforma);
			this.jPanelParametrosAuxiliar2DetalleTerminoProforma.setLayout(gridaBagParametrosAuxiliar2DetalleTerminoProforma);
			this.jPanelParametrosAuxiliar3DetalleTerminoProforma.setLayout(gridaBagParametrosAuxiliar3DetalleTerminoProforma);
			this.jPanelParametrosAuxiliar4DetalleTerminoProforma.setLayout(gridaBagParametrosAuxiliar4DetalleTerminoProforma);
			//this.jPanelParametrosAuxiliar5DetalleTerminoProforma.setLayout(gridaBagParametrosAuxiliar2DetalleTerminoProforma);			
			
			
			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jButtonRecargarInformacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTerminoProforma.add(this.jComboBoxTiposPaginacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTerminoProforma.add(this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleTerminoProforma.add(this.jComboBoxTiposArchivosReportesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jPanelParametrosAuxiliar1DetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleTerminoProforma.add(this.jComboBoxTiposReportesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jPanelParametrosAuxiliar4DetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jComboBoxTiposReportesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jCheckBoxGenerarReporteDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jPanelParametrosAuxiliar2DetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jLabelAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
				this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jButtonAbrirOrderByDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jComboBoxTiposSeleccionarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
			
			
			/*
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jCheckBoxSeleccionarTodosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTerminoProforma.add(this.jCheckBoxSeleccionarTodosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);															
				
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleTerminoProforma.add(this.jCheckBoxSeleccionadosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jPanelParametrosAuxiliar3DetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jComboBoxTiposAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
	
				
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleTerminoProforma.add(this.jTextFieldValorCampoGeneralDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleTerminoProforma = new GridBagLayout();

			this.jScrollPanelDatosDetalleTerminoProforma.setLayout(gridaBagLayoutDatosDetalleTerminoProforma);
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
			
			this.jScrollPanelDatosDetalleTerminoProforma.add(this.jTableDatosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleTerminoProforma.setViewportView(this.jTableDatosDetalleTerminoProforma);
		this.jTableDatosDetalleTerminoProforma.setFillsViewportHeight(true);
		this.jTableDatosDetalleTerminoProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleTerminoProforma= new GridBagLayout();
		this.jPanelAccionesDetalleTerminoProforma.setLayout(gridaBagLayoutAccionesDetalleTerminoProforma);
		
		
		/*	
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
			
		this.jPanelAccionesDetalleTerminoProforma.add(this.jButtonNuevoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTerminoProformaDetalleTerminoProforma= new GridBagLayout();
		gridaBagLayoutFK_IdTerminoProformaDetalleTerminoProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTerminoProformaDetalleTerminoProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTerminoProformaDetalleTerminoProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTerminoProformaDetalleTerminoProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTerminoProformaDetalleTerminoProforma.setLayout(gridaBagLayoutFK_IdTerminoProformaDetalleTerminoProforma);

		gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		gridBagConstraintsDetalleTerminoProforma.gridx = 0;
		jPanelFK_IdTerminoProformaDetalleTerminoProforma.add(jLabelid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma, gridBagConstraintsDetalleTerminoProforma);

		gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTerminoProforma.gridy = 0;
		gridBagConstraintsDetalleTerminoProforma.gridx = 1;
		jPanelFK_IdTerminoProformaDetalleTerminoProforma.add(jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma, gridBagConstraintsDetalleTerminoProforma);

		gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleTerminoProforma.gridy = 1;
		gridBagConstraintsDetalleTerminoProforma.gridx =1;
		jPanelFK_IdTerminoProformaDetalleTerminoProforma.add(jButtonFK_IdTerminoProformaDetalleTerminoProforma, gridBagConstraintsDetalleTerminoProforma);

		jTabbedPaneBusquedasDetalleTerminoProforma.addTab("1.-Por Termino Proforma ", jPanelFK_IdTerminoProformaDetalleTerminoProforma);
		jTabbedPaneBusquedasDetalleTerminoProforma.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleTerminoProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();						
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;		
			//this.gridBagConstraintsDetalleTerminoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleTerminoProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;		
		//this.gridBagConstraintsDetalleTerminoProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleTerminoProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleTerminoProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;		
			this.gridBagConstraintsDetalleTerminoProforma.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleTerminoProforma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);								
		
		
		/*
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		*/		
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleTerminoProforma.gridx =0;
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleTerminoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
				
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleTerminoProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleTerminoProforma.setLayout(gridaBagLayoutBusquedasParametrosDetalleTerminoProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleTerminoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
			
			
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
			
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleTerminoProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleTerminoProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleTerminoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleTerminoProforma.setName("jPanelReporteDinamicoDetalleTerminoProforma"); 
		
		this.jPanelReporteDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleTerminoProforma.setLayout(gridaBagLayoutReporteDinamicoDetalleTerminoProforma);
		
		
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleTerminoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTerminoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Termino Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleTerminoProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleTerminoProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jLabelColumnasSelectReporteDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleTerminoProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleTerminoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleTerminoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleTerminoProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleTerminoProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleTerminoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleTerminoProforma=new JScrollPane(this.jListColumnasSelectReporteDetalleTerminoProforma);
			
			this.jScrollColumnasSelectReporteDetalleTerminoProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleTerminoProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleTerminoProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jListColumnasSelectReporteDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jScrollColumnasSelectReporteDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleTerminoProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleTerminoProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleTerminoProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleTerminoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleTerminoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleTerminoProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleTerminoProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleTerminoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleTerminoProforma=new JScrollPane(this.jListRelacionesSelectReporteDetalleTerminoProforma);
			
			this.jScrollRelacionesSelectReporteDetalleTerminoProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleTerminoProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleTerminoProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleTerminoProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleTerminoProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleTerminoProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jLabelGenerarExcelReporteDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma.setToolTipText("Generar EXCEL"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jComboBoxTiposReportesDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jLabelTiposArchivoReporteDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleTerminoProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleTerminoProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleTerminoProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleTerminoProforma.setToolTipText("Generar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jButtonGenerarReporteDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleTerminoProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleTerminoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleTerminoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleTerminoProforma.setToolTipText("Cancelar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleTerminoProforma.add(this.jButtonCerrarReporteDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleTerminoProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleTerminoProforma= new JScrollPane(jPanelReporteDinamicoDetalleTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Termino Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleTerminoProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleTerminoProforma);
		this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleTerminoProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleTerminoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleTerminoProforma.setName("jPanelImportacionDetalleTerminoProforma"); 
		
		this.jPanelImportacionDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleTerminoProforma.setLayout(gridaBagLayoutImportacionDetalleTerminoProforma);
		
		
		this.jInternalFrameImportacionDetalleTerminoProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleTerminoProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleTerminoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleTerminoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleTerminoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleTerminoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleTerminoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleTerminoProforma.setResizable(true);
	    this.jInternalFrameImportacionDetalleTerminoProforma.setClosable(true);
	    this.jInternalFrameImportacionDetalleTerminoProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleTerminoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleTerminoProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleTerminoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleTerminoProforma.setResizable(true);
	    this.jInternalFrameImportacionDetalleTerminoProforma.setClosable(true);
	    this.jInternalFrameImportacionDetalleTerminoProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Termino Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleTerminoProforma = new JLabelMe();

		this.jLabelArchivoImportacionDetalleTerminoProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleTerminoProforma.add(this.jLabelArchivoImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleTerminoProforma = new JFileChooser();		
		this.jFileChooserImportacionDetalleTerminoProforma.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleTerminoProforma = new JButtonMe();
		this.jButtonAbrirImportacionDetalleTerminoProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleTerminoProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleTerminoProforma.setToolTipText("Generar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTerminoProforma.add(this.jButtonAbrirImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleTerminoProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleTerminoProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleTerminoProforma.add(this.jLabelPathArchivoImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleTerminoProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleTerminoProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleTerminoProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleTerminoProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTerminoProforma.add(this.jTextFieldPathArchivoImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleTerminoProforma = new JButtonMe();
		this.jButtonGenerarImportacionDetalleTerminoProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleTerminoProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleTerminoProforma.setToolTipText("Generar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTerminoProforma.add(this.jButtonGenerarImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleTerminoProforma = new JButtonMe();
		this.jButtonCerrarImportacionDetalleTerminoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleTerminoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleTerminoProforma.setToolTipText("Cancelar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleTerminoProforma.add(this.jButtonCerrarImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleTerminoProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleTerminoProforma= new JScrollPane(jPanelImportacionDetalleTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsDetalleTerminoProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleTerminoProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleTerminoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleTerminoProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleTerminoProforma);
		this.jInternalFrameImportacionDetalleTerminoProforma.getContentPane().add(this.jScrollPanelImportacionDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleTerminoProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleTerminoProforma = new JButtonMe();
			this.jButtonAbrirOrderByDetalleTerminoProforma.setText("Orden");
			this.jButtonAbrirOrderByDetalleTerminoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleTerminoProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleTerminoProforma";
			inputMap = this.jButtonAbrirOrderByDetalleTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleTerminoProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleTerminoProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleTerminoProforma.setName("jPanelOrderByDetalleTerminoProforma"); 
			
			this.jPanelOrderByDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleTerminoProforma.setLayout(gridaBagLayoutOrderByDetalleTerminoProforma);
			
			
			this.jTableDatosDetalleTerminoProformaOrderBy = new JTableMe();        
			this.jTableDatosDetalleTerminoProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleTerminoProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleTerminoProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleTerminoProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleTerminoProformaOrderBy.setViewportView(this.jTableDatosDetalleTerminoProformaOrderBy);
			this.jTableDatosDetalleTerminoProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleTerminoProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleTerminoProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleTerminoProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleTerminoProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleTerminoProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleTerminoProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleTerminoProforma.setTitle("Orden");
			this.jInternalFrameOrderByDetalleTerminoProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleTerminoProforma.setResizable(true);
			this.jInternalFrameOrderByDetalleTerminoProforma.setClosable(true);
			this.jInternalFrameOrderByDetalleTerminoProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Termino Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleTerminoProforma.ipady =150;
				
			this.jPanelOrderByDetalleTerminoProforma.add(jScrollPanelDatosDetalleTerminoProformaOrderBy, this.gridBagConstraintsDetalleTerminoProforma);//this.jTableDatosDetalleTerminoProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleTerminoProforma = new JButtonMe();
			this.jButtonCerrarOrderByDetalleTerminoProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleTerminoProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleTerminoProforma.setToolTipText("Cancelar"+" "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTerminoProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleTerminoProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleTerminoProforma.add(this.jButtonCerrarOrderByDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleTerminoProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleTerminoProforma= new JScrollPane(jPanelOrderByDetalleTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsDetalleTerminoProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleTerminoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleTerminoProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleTerminoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleTerminoProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleTerminoProforma);
			
			this.jInternalFrameOrderByDetalleTerminoProforma.getContentPane().add(this.jScrollPanelOrderByDetalleTerminoProforma, this.gridBagConstraintsDetalleTerminoProforma);			
		
		} else {
			this.jButtonAbrirOrderByDetalleTerminoProforma = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleterminoproformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleTerminoProforma.getRowHeight();//DetalleTerminoProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.isSelected()) {
					iHeightTable=DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleTerminoProforma.isSelected()) {
					iHeightTable=DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleTerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleTerminoProforma!=null && this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleTerminoProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleTerminoProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleTerminoProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleTerminoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleTerminoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleTerminoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleterminoproformaLogic.getDetalleTerminoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleterminoproformas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleTerminoProforma> TraerDetalleTerminoProformaBeans(List<DetalleTerminoProforma> detalleterminoproformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformas) {
					
				if(!(DetalleTerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleTerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleterminoproforma.setsDetalleGeneralEntityReporte(DetalleTerminoProformaConstantesFunciones.getDetalleTerminoProformaDescripcion(detalleterminoproforma));
										
						
					
						
					
				} else  {
							
					//detalleterminoproforma.setsDetalleGeneralEntityReporte(detalleterminoproforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleterminoproformabeans.add(detalleterminoproformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleterminoproformas;
    }
	//PARA REPORTES FIN
}
