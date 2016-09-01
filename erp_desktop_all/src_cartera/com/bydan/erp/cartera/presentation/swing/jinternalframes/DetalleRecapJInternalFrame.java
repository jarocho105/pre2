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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleRecapConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleRecapJInternalFrame extends DetalleRecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleRecap;
	
	protected JMenuBar jmenuBarDetalleRecap;
	
	protected JMenu jmenuDetalleRecap;
	protected JMenu jmenuDatosDetalleRecap;
	protected JMenu jmenuArchivoDetalleRecap;
	protected JMenu jmenuAccionesDetalleRecap;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRecap;	
	protected GridBagConstraints gridBagConstraintsDetalleRecap;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleRecapDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleRecap;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleRecap;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleRecap;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected RecapBeanSwingJInternalFrame recapBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_recap="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallecliente="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public DetalleRecapSessionBean detallerecapSessionBean;
		
	
	
	public RecapSessionBean recapSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public DetalleClienteSessionBean detalleclienteSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleRecap> detallerecaps;		
	public List<DetalleRecap> detallerecapsEliminados;	
	public List<DetalleRecap> detallerecapsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleRecap;		
	protected JButton jButtonAbrirOrderByDetalleRecap;
	
	
	//protected JPanel jPanelOrderByDetalleRecap;
	//public JScrollPane jScrollPanelOrderByDetalleRecap;	
	//protected JButton jButtonCerrarOrderByDetalleRecap;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleRecapLogic detallerecapLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleRecap;
	public JScrollPane jScrollPanelDatosEdicionDetalleRecap;
	public JScrollPane jScrollPanelDatosGeneralDetalleRecap;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleRecapOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleRecap;
	//public JScrollPane jScrollPanelImportacionDetalleRecap;
	
	
	
	protected JPanel jPanelAccionesDetalleRecap;
	
    protected JPanel jPanelPaginacionDetalleRecap;
    protected JPanel jPanelParametrosReportesDetalleRecap;
	protected JPanel jPanelParametrosReportesAccionesDetalleRecap;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleRecap;
	protected JPanel jPanelParametrosAuxiliar2DetalleRecap;
	protected JPanel jPanelParametrosAuxiliar3DetalleRecap;
	protected JPanel jPanelParametrosAuxiliar4DetalleRecap;
	//protected JPanel jPanelParametrosAuxiliar5DetalleRecap;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleRecap;
	//protected JPanel jPanelImportacionDetalleRecap;
	
	
	public JTable jTableDatosDetalleRecap;
	
	
	
	//public JTable jTableDatosDetalleRecapOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleRecap;
	protected JButton jButtonDuplicarDetalleRecap;
	protected JButton jButtonCopiarDetalleRecap;
	protected JButton jButtonVerFormDetalleRecap;
	protected JButton jButtonNuevoRelacionesDetalleRecap;
	protected JButton jButtonModificarDetalleRecap;
	
    protected JButton jButtonGuardarCambiosTablaDetalleRecap;
	protected JButton jButtonCerrarDetalleRecap;
	
	
	protected JButton jButtonRecargarInformacionDetalleRecap;
	protected JButton jButtonProcesarInformacionDetalleRecap;
	
	
	protected JButton jButtonAnterioresDetalleRecap;
	protected JButton jButtonSiguientesDetalleRecap;
	protected JButton jButtonNuevoGuardarCambiosDetalleRecap;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleRecap;
	//protected JButton jButtonCerrarReporteDinamicoDetalleRecap;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleRecap;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleRecap;
	//protected JButton jButtonGenerarImportacionDetalleRecap;
	//protected JButton jButtonCerrarImportacionDetalleRecap;
	//protected JFileChooser jFileChooserImportacionDetalleRecap;
	//protected File fileImportacionDetalleRecap;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRecap;
	protected JButton jButtonDuplicarToolBarDetalleRecap;
	protected JButton jButtonNuevoRelacionesToolBarDetalleRecap;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleRecap;
	protected JButton jButtonCopiarToolBarDetalleRecap;
	protected JButton jButtonVerFormToolBarDetalleRecap;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRecap;
	protected JButton jButtonCerrarToolBarDetalleRecap;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleRecap;
	protected JButton jButtonProcesarInformacionToolBarDetalleRecap;
	protected JButton jButtonAnterioresToolBarDetalleRecap;
	protected JButton jButtonSiguientesToolBarDetalleRecap;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleRecap;
	protected JButton jButtonAbrirOrderByToolBarDetalleRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRecap;
	protected JMenuItem jMenuItemDuplicarDetalleRecap;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleRecap;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleRecap;
	protected JMenuItem jMenuItemCopiarDetalleRecap;
	protected JMenuItem jMenuItemVerFormDetalleRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRecap;
	protected JMenuItem jMenuItemCerrarDetalleRecap;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRecap;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRecap;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleRecap;
	protected JMenuItem jMenuItemProcesarInformacionDetalleRecap;
	protected JMenuItem jMenuItemAnterioresDetalleRecap;
	protected JMenuItem jMenuItemSiguientesDetalleRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRecap;
	protected JMenuItem jMenuItemAbrirOrderByDetalleRecap;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRecap;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleRecap;
	protected JCheckBox jCheckBoxSeleccionadosDetalleRecap;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleRecap;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleRecap;
	protected JTextField jTextFieldValorCampoGeneralDetalleRecap;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleRecap;
	//public JList<Reporte> jListColumnasSelectReporteDetalleRecap;
	//public JScrollPane jScrollColumnasSelectReporteDetalleRecap;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleRecap;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleRecap;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleRecap;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleRecap;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleRecap;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleRecap;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleRecap;
	
		
	//public JLabel jLabelArchivoImportacionDetalleRecap;	
	//public JLabel jLabelPathArchivoImportacionDetalleRecap;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleRecap;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleRecap;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleRecap;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleRecap;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleRecap;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleRecap;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleRecap;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleRecap;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleRecap;
	public JPanel jPanelFK_IdClienteDetalleRecap;
	public JButton jButtonFK_IdClienteDetalleRecap;
	public JPanel jPanelFK_IdDetalleClienteDetalleRecap;
	public JButton jButtonFK_IdDetalleClienteDetalleRecap;
	public JPanel jPanelFK_IdRecapDetalleRecap;
	public JButton jButtonFK_IdRecapDetalleRecap;
	
	public JPanel jPanelid_clienteFK_IdClienteDetalleRecap;
	public JLabel jLabelid_clienteFK_IdClienteDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDetalleRecap;
	public JButton jButtonid_clienteFK_IdClienteDetalleRecap= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleRecapBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDetalleRecap;
	
	public JPanel jPanelid_detalle_clienteFK_IdDetalleClienteDetalleRecap;
	public JLabel jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap;
	public JButton jButtonid_detalle_clienteFK_IdDetalleClienteDetalleRecap= new JButtonMe();
	public JButton jButtonid_detalle_clienteFK_IdDetalleClienteDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_detalle_clienteFK_IdDetalleClienteDetalleRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelid_recapFK_IdRecapDetalleRecap;
	public JLabel jLabelid_recapFK_IdRecapDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_recapFK_IdRecapDetalleRecap;
	public JButton jButtonid_recapFK_IdRecapDetalleRecap= new JButtonMe();
	public JButton jButtonid_recapFK_IdRecapDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_recapFK_IdRecapDetalleRecapBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleRecapJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleRecap)	{
		this.jButtonRecargarInformacionDetalleRecap = jButtonRecargarInformacionDetalleRecap;
	}
	
	public JButton getjButtonProcesarInformacionDetalleRecap() {
		return this.jButtonProcesarInformacionDetalleRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRecap)	{
		this.jButtonProcesarInformacionDetalleRecap = jButtonProcesarInformacionDetalleRecap;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleRecap() {
		return this.jButtonRecargarInformacionDetalleRecap;
	}
	
	
	public List<DetalleRecap> getdetallerecaps() {
		return this.detallerecaps;
	}

	public void setdetallerecaps(List<DetalleRecap> detallerecaps) {
		this.detallerecaps = detallerecaps;
	}
	
	public List<DetalleRecap> getdetallerecapsAux() {
		return this.detallerecapsAux;
	}

	public void setdetallerecapsAux(List<DetalleRecap> detallerecapsAux) {
		this.detallerecapsAux = detallerecapsAux;
	}
	
	public List<DetalleRecap> getdetallerecapsEliminados() {
		return this.detallerecapsEliminados;
	}

	public void setDetalleRecapsEliminados(List<DetalleRecap> detallerecapsEliminados) {
		this.detallerecapsEliminados = detallerecapsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleRecap() {
		return jComboBoxTiposSeleccionarDetalleRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleRecap(
			JComboBox jComboBoxTiposSeleccionarDetalleRecap) {
		this.jComboBoxTiposSeleccionarDetalleRecap = jComboBoxTiposSeleccionarDetalleRecap;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleRecap .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleRecap() {
		return jTextFieldValorCampoGeneralDetalleRecap;
	}

	public void setjTextFieldValorCampoGeneralDetalleRecap(
			JTextField jTextFieldValorCampoGeneralDetalleRecap) {
		this.jTextFieldValorCampoGeneralDetalleRecap = jTextFieldValorCampoGeneralDetalleRecap;
	}

	public void setBorderResaltarValorCampoGeneralDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleRecap .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleRecap() {
		return this.jCheckBoxSeleccionarTodosDetalleRecap;
	}

	public void setjCheckBoxSeleccionarTodosDetalleRecap(
			JCheckBox jCheckBoxSeleccionarTodosDetalleRecap) {
		this.jCheckBoxSeleccionarTodosDetalleRecap = jCheckBoxSeleccionarTodosDetalleRecap;
	}

	public void setBorderResaltarSeleccionarTodosDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleRecap .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleRecap() {
		return this.jCheckBoxSeleccionadosDetalleRecap;
	}

	public void setjCheckBoxSeleccionadosDetalleRecap(
			JCheckBox jCheckBoxSeleccionadosDetalleRecap) {
		this.jCheckBoxSeleccionadosDetalleRecap = jCheckBoxSeleccionadosDetalleRecap;
	}
	
	public void setBorderResaltarSeleccionadosDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleRecap .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleRecap() {
		return this.jComboBoxTiposArchivosReportesDetalleRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleRecap(
			JComboBox jComboBoxTiposArchivosReportesDetalleRecap) {
		this.jComboBoxTiposArchivosReportesDetalleRecap = jComboBoxTiposArchivosReportesDetalleRecap;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleRecap() {
		return this.jComboBoxTiposReportesDetalleRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleRecap(
			JComboBox jComboBoxTiposReportesDetalleRecap) {
		this.jComboBoxTiposReportesDetalleRecap = jComboBoxTiposReportesDetalleRecap;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleRecap() {
	//	return jComboBoxTiposReportesDinamicoDetalleRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleRecap(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleRecap) {
	//	this.jComboBoxTiposReportesDinamicoDetalleRecap = jComboBoxTiposReportesDinamicoDetalleRecap;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleRecap() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleRecap(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRecap) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap = jComboBoxTiposArchivosReportesDinamicoDetalleRecap;
	//}
	
	public void setBorderResaltarTiposReportesDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleRecap() {
		return this.jComboBoxTiposGraficosReportesDetalleRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleRecap(
			JComboBox jComboBoxTiposGraficosReportesDetalleRecap) {
		this.jComboBoxTiposGraficosReportesDetalleRecap = jComboBoxTiposGraficosReportesDetalleRecap;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleRecap() {
		return this.jComboBoxTiposPaginacionDetalleRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleRecap(
			JComboBox jComboBoxTiposPaginacionDetalleRecap) {
		this.jComboBoxTiposPaginacionDetalleRecap = jComboBoxTiposPaginacionDetalleRecap;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleRecap() {
		return this.jComboBoxTiposRelacionesDetalleRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRecap() {
		return this.jComboBoxTiposAccionesDetalleRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRecap(
			JComboBox jComboBoxTiposRelacionesDetalleRecap) {
		this.jComboBoxTiposRelacionesDetalleRecap = jComboBoxTiposRelacionesDetalleRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRecap(
			JComboBox jComboBoxTiposAccionesDetalleRecap) {
		this.jComboBoxTiposAccionesDetalleRecap = jComboBoxTiposAccionesDetalleRecap;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleRecap .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleRecap .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleRecap() {
	//	return jCheckBoxConGraficoDinamicoDetalleRecap;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleRecap(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleRecap) {
	//	this.jCheckBoxConGraficoDinamicoDetalleRecap = jCheckBoxConGraficoDinamicoDetalleRecap;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleRecap() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleRecap.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleRecap .setBorder(borderResaltar);		
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
		this.detallerecapSessionBean=new DetalleRecapSessionBean();
		
		this.detallerecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallerecapSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Recap MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRecap= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"nuevo","nuevo","Nuevo"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"duplicar","duplicar","Duplicar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"copiar","copiar","Copiar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"ver_form","ver_form","Ver"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"recargar","recargar","Recargar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleRecap,this.jTtoolBarDetalleRecap,
							"cerrar","cerrar","Salir"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleRecap=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleRecap;
			
				this.jButtonProcesarInformacionToolBarDetalleRecap=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleRecap;
				
		//protected JButton jButtonModificarToolBarDetalleRecap;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleRecap=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleRecap=new JMenuMe("General");
		this.jmenuArchivoDetalleRecap=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleRecap=new JMenuMe("Acciones");
		this.jmenuDatosDetalleRecap=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleRecap= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleRecap.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleRecap,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleRecap= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleRecap.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleRecap,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleRecap= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleRecap.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleRecap,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleRecap= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleRecap.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleRecap,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleRecap= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleRecap.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleRecap,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleRecap= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleRecap.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleRecap,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleRecap= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleRecap.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleRecap,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleRecap= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleRecap.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleRecap,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleRecap= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleRecap.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleRecap,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleRecap= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleRecap.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleRecap,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleRecap.add(this.jMenuItemCerrarDetalleRecap);
			
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemNuevoDetalleRecap);
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemNuevoGuardarCambiosDetalleRecap);
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemNuevoRelacionesDetalleRecap);
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemGuardarCambiosTablaDetalleRecap);		
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemDuplicarDetalleRecap);		
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemCopiarDetalleRecap);		
			this.jmenuAccionesDetalleRecap.add(this.jMenuItemVerFormDetalleRecap);		
			
			this.jmenuDatosDetalleRecap.add(this.jMenuItemRecargarInformacionDetalleRecap);				
			this.jmenuDatosDetalleRecap.add(this.jMenuItemAnterioresDetalleRecap);				
			this.jmenuDatosDetalleRecap.add(this.jMenuItemSiguientesDetalleRecap);				
			this.jmenuDatosDetalleRecap.add(this.jMenuItemAbrirOrderByDetalleRecap);				
			this.jmenuDatosDetalleRecap.add(this.jMenuItemMostrarOcultarDetalleRecap);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleRecap.add(this.jMenuItemGuardarCambiosDetalleRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRecap.add(this.jmenuArchivoDetalleRecap);		
			this.jmenuBarDetalleRecap.add(this.jmenuAccionesDetalleRecap);		
			this.jmenuBarDetalleRecap.add(this.jmenuDatosDetalleRecap);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleRecap);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleRecap() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDetalleRecap.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDetalleRecap= new JButtonMe();
		this.jButtonFK_IdClienteDetalleRecap.setText("Buscar");
		this.jButtonFK_IdClienteDetalleRecap.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDetalleRecap,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDetalleRecap = new JLabelMe();
		jLabelid_clienteFK_IdClienteDetalleRecap.setText("Cliente :");
		jLabelid_clienteFK_IdClienteDetalleRecap.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDetalleRecap= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.setFocusable(false);

		this.jPanelFK_IdDetalleClienteDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleClienteDetalleRecap.setToolTipText("Buscar Por Detalle Cliente ");
		this.jButtonFK_IdDetalleClienteDetalleRecap= new JButtonMe();
		this.jButtonFK_IdDetalleClienteDetalleRecap.setText("Buscar");
		this.jButtonFK_IdDetalleClienteDetalleRecap.setToolTipText("Buscar Por Detalle Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleClienteDetalleRecap,"buscar_button","Buscar Por Detalle Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleClienteDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap = new JLabelMe();
		jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setText("Detalle Cliente :");
		jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setToolTipText("Detalle Cliente");
		jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap= new JComboBoxMe();
		jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRecapDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRecapDetalleRecap.setToolTipText("Buscar Por Recap ");
		this.jButtonFK_IdRecapDetalleRecap= new JButtonMe();
		this.jButtonFK_IdRecapDetalleRecap.setText("Buscar");
		this.jButtonFK_IdRecapDetalleRecap.setToolTipText("Buscar Por Recap ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRecapDetalleRecap,"buscar_button","Buscar Por Recap ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRecapDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_recapFK_IdRecapDetalleRecap = new JLabelMe();
		jLabelid_recapFK_IdRecapDetalleRecap.setText("Recap :");
		jLabelid_recapFK_IdRecapDetalleRecap.setToolTipText("Recap");
		jLabelid_recapFK_IdRecapDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_recapFK_IdRecapDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_recapFK_IdRecapDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_recapFK_IdRecapDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_recapFK_IdRecapDetalleRecap= new JComboBoxMe();
		jComboBoxid_recapFK_IdRecapDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_recapFK_IdRecapDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_recapFK_IdRecapDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_recapFK_IdRecapDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleRecap=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleRecap.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRecap.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRecap.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleRecap = new DetalleRecapDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Recap DATOS");
			this.jInternalFrameDetalleFormDetalleRecap = new DetalleRecapDetalleFormJInternalFrame(jDesktopPane,this.detallerecapSessionBean.getConGuardarRelaciones(),this.detallerecapSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleRecap = null;//new DetalleRecapDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRecap= new GridBagLayout();
		
		
		this.jTableDatosDetalleRecap = new JTableMe();      
		
		String sToolTipDetalleRecap="";
		sToolTipDetalleRecap=DetalleRecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRecap+="(Cartera.DetalleRecap)";
		}
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRecap+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleRecap.setToolTipText(sToolTipDetalleRecap);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleRecap);
		this.jTableDatosDetalleRecap.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleRecap.setRowSelectionAllowed(true);
		this.jTableDatosDetalleRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleRecap,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleRecap = new JButtonMe();
		this.jButtonDuplicarDetalleRecap = new JButtonMe();
		this.jButtonCopiarDetalleRecap = new JButtonMe();
		this.jButtonVerFormDetalleRecap = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleRecap = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleRecap = new JButtonMe();
		this.jButtonCerrarDetalleRecap = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRecap = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleRecap = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Recap";
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRecap.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRecap.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleRecap=new ReporteDinamicoJInternalFrame(DetalleRecapConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleRecap();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleRecap=new ImportacionJInternalFrame(DetalleRecapConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleRecap();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleRecap = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleRecap.setText("Orden");
		this.jButtonAbrirOrderByDetalleRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRecap,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRecap,false,this);
			
			//this.cargarOrderByDetalleRecap(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRecap,true,this);
			
			//this.cargarOrderByDetalleRecap(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleRecap.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleRecap.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleRecap.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDetalleRecap.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRecap.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRecap.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleRecap.setText("Nuevo");
		this.jButtonDuplicarDetalleRecap.setText("Duplicar");
		this.jButtonCopiarDetalleRecap.setText("Copiar");
		this.jButtonVerFormDetalleRecap.setText("Ver");
		this.jButtonNuevoRelacionesDetalleRecap.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleRecap.setText("Guardar");
		this.jButtonCerrarDetalleRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRecap,"nuevo_button","Nuevo",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleRecap,"duplicar_button","Duplicar",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleRecap,"copiar_button","Copiar",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleRecap,"ver_form","Ver",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleRecap,"nuevorelaciones_button","Nuevo Rel",this.detallerecapSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRecap,"guardarcambiostabla_button","Guardar",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRecap,"cerrar_button","Salir",this.detallerecapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleRecap.setToolTipText("Nuevo"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleRecap.setToolTipText("Duplicar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleRecap.setToolTipText("Copiar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleRecap.setToolTipText("Ver"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleRecap.setToolTipText("Nuevo Rel"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleRecap.setToolTipText("Guardar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRecap.setToolTipText("Salir"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRecap";
		inputMap = this.jButtonNuevoDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRecap"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleRecap";
		inputMap = this.jButtonDuplicarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleRecap"));
		
		//COPIAR
		sMapKey = "CopiarDetalleRecap";
		inputMap = this.jButtonCopiarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleRecap"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleRecap";
		inputMap = this.jButtonVerFormDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleRecap"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleRecap";
		inputMap = this.jButtonNuevoRelacionesDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleRecap"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleRecap";
		inputMap = this.jButtonModificarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleRecap"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleRecap";
		inputMap = this.jButtonCerrarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRecap";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRecap"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleRecap.setName("jPanelParametrosReportesDetalleRecap"); 
		
		this.jPanelParametrosReportesAccionesDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleRecap.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleRecap.setName("jPanelParametrosReportesAccionesDetalleRecap"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleRecap = new JButtonMe();
		this.jButtonRecargarInformacionDetalleRecap.setText("Recargar");
		this.jButtonRecargarInformacionDetalleRecap.setToolTipText("Recargar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleRecap,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleRecap = new JButtonMe();
		this.jButtonProcesarInformacionDetalleRecap.setText("Procesar");
		this.jButtonProcesarInformacionDetalleRecap.setToolTipText("Procesar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleRecap.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleRecap.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRecap.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRecap.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRecap.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleRecap.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRecap.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleRecap.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRecap.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleRecap.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleRecap.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleRecap.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleRecap.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRecap.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRecap.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleRecap.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleRecap.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleRecap=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleRecap.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRecap.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRecap.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleRecap = new JLabelMe();
		
		this.jLabelAccionesDetalleRecap.setText("Acciones");		
		this.jLabelAccionesDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleRecap = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleRecap.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleRecap.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleRecap = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleRecap.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleRecap.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleRecap = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleRecap.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleRecap.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleRecap.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleRecap.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleRecap = new JButtonMe();
		//this.jButtonAnterioresDetalleRecap.setText("<<");
        this.jButtonAnterioresDetalleRecap.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleRecap,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleRecap = new JButtonMe();
		//this.jButtonSiguientesDetalleRecap.setText(">>");
        this.jButtonSiguientesDetalleRecap.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleRecap,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleRecap = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleRecap.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleRecap.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleRecap,"nuevoguardarcambios_button","Nue",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleRecap";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleRecap"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleRecap";
		inputMap = this.jButtonRecargarInformacionDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleRecap"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleRecap";
		inputMap = this.jButtonSiguientesDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleRecap"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleRecap";
		inputMap = this.jButtonAnterioresDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleRecap"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleRecap();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleRecap.setMinimumSize(new Dimension(this.getWidth(),DetalleRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleRecap.setMaximumSize(new Dimension(this.getWidth(),DetalleRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleRecap.setPreferredSize(new Dimension(this.getWidth(),DetalleRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRecapBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleRecap = new GridBagLayout();

			this.jPanelPaginacionDetalleRecap.setLayout(gridaBagLayoutPaginacionDetalleRecap);						
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 0;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleRecap.add(this.jButtonAnterioresDetalleRecap, this.gridBagConstraintsDetalleRecap);
					
						
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRecap.gridy = 0;
			
			this.jPanelPaginacionDetalleRecap.add(this.jButtonNuevoGuardarCambiosDetalleRecap, this.gridBagConstraintsDetalleRecap);
						
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRecap.gridy = 0;
			this.jPanelPaginacionDetalleRecap.add(this.jButtonSiguientesDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 1;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRecap.add(this.jButtonNuevoDetalleRecap, this.gridBagConstraintsDetalleRecap);
						
			
			
			if(!this.detallerecapSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
				this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleRecap.gridy = 1;
				this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleRecap.add(this.jButtonGuardarCambiosTablaDetalleRecap, this.gridBagConstraintsDetalleRecap);
			}
			
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 1;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRecap.add(this.jButtonDuplicarDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 1;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRecap.add(this.jButtonCopiarDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 1;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRecap.add(this.jButtonVerFormDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 1;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleRecap.add(this.jButtonCerrarDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		
		this.jButtonRecargarInformacionDetalleRecap.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRecap.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRecap.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleRecap.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRecap.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRecap.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleRecap.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRecap.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRecap.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleRecap.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRecap.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRecap.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRecap.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleRecap.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRecap.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRecap.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleRecap = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleRecap = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleRecap.setLayout(gridaBagParametrosReportesDetalleRecap);
			this.jPanelParametrosReportesAccionesDetalleRecap.setLayout(gridaBagParametrosReportesAccionesDetalleRecap);
			
			
			this.jPanelParametrosAuxiliar1DetalleRecap.setLayout(gridaBagParametrosAuxiliar1DetalleRecap);
			this.jPanelParametrosAuxiliar2DetalleRecap.setLayout(gridaBagParametrosAuxiliar2DetalleRecap);
			this.jPanelParametrosAuxiliar3DetalleRecap.setLayout(gridaBagParametrosAuxiliar3DetalleRecap);
			this.jPanelParametrosAuxiliar4DetalleRecap.setLayout(gridaBagParametrosAuxiliar4DetalleRecap);
			//this.jPanelParametrosAuxiliar5DetalleRecap.setLayout(gridaBagParametrosAuxiliar2DetalleRecap);			
			
			
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRecap.add(this.jButtonRecargarInformacionDetalleRecap, this.gridBagConstraintsDetalleRecap);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRecap.add(this.jComboBoxTiposPaginacionDetalleRecap, this.gridBagConstraintsDetalleRecap);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRecap.add(this.jCheckBoxConAltoMaximoTablaDetalleRecap, this.gridBagConstraintsDetalleRecap);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRecap.add(this.jComboBoxTiposArchivosReportesDetalleRecap, this.gridBagConstraintsDetalleRecap);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRecap.add(this.jPanelParametrosAuxiliar1DetalleRecap, this.gridBagConstraintsDetalleRecap);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleRecap.add(this.jComboBoxTiposReportesDetalleRecap, this.gridBagConstraintsDetalleRecap);																		
			
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleRecap.add(this.jComboBoxTiposGraficosReportesDetalleRecap, this.gridBagConstraintsDetalleRecap);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRecap.add(this.jPanelParametrosAuxiliar4DetalleRecap, this.gridBagConstraintsDetalleRecap);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRecap.add(this.jComboBoxTiposReportesDetalleRecap, this.gridBagConstraintsDetalleRecap);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRecap.add(this.jCheckBoxGenerarReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRecap.add(this.jPanelParametrosAuxiliar2DetalleRecap, this.gridBagConstraintsDetalleRecap);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRecap.add(this.jLabelAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
				this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleRecap.add(this.jButtonAbrirOrderByDetalleRecap, this.gridBagConstraintsDetalleRecap);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRecap.add(this.jComboBoxTiposSeleccionarDetalleRecap, this.gridBagConstraintsDetalleRecap);			
			
			
			/*
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRecap.add(this.jCheckBoxSeleccionarTodosDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRecap.add(this.jCheckBoxConGraficoReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRecap.add(this.jCheckBoxSeleccionarTodosDetalleRecap, this.gridBagConstraintsDetalleRecap);															
				
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRecap.add(this.jCheckBoxSeleccionadosDetalleRecap, this.gridBagConstraintsDetalleRecap);															
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRecap.add(this.jCheckBoxConGraficoReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRecap.add(this.jPanelParametrosAuxiliar3DetalleRecap, this.gridBagConstraintsDetalleRecap);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRecap.add(this.jComboBoxTiposAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);
	
				
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRecap.add(this.jTextFieldValorCampoGeneralDetalleRecap, this.gridBagConstraintsDetalleRecap);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleRecap = new GridBagLayout();

			this.jScrollPanelDatosDetalleRecap.setLayout(gridaBagLayoutDatosDetalleRecap);
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = 0;
			this.gridBagConstraintsDetalleRecap.gridx = 0;
			
			this.jScrollPanelDatosDetalleRecap.add(this.jTableDatosDetalleRecap, this.gridBagConstraintsDetalleRecap);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleRecap.setViewportView(this.jTableDatosDetalleRecap);
		this.jTableDatosDetalleRecap.setFillsViewportHeight(true);
		this.jTableDatosDetalleRecap.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleRecap= new GridBagLayout();
		this.jPanelAccionesDetalleRecap.setLayout(gridaBagLayoutAccionesDetalleRecap);
		
		
		/*	
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 0;
			
		this.jPanelAccionesDetalleRecap.add(this.jButtonNuevoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteDetalleRecap= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDetalleRecap.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleRecap.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleRecap.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDetalleRecap.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDetalleRecap.setLayout(gridaBagLayoutFK_IdClienteDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 0;
		jPanelFK_IdClienteDetalleRecap.add(jLabelid_clienteFK_IdClienteDetalleRecap, gridBagConstraintsDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 1;
		jPanelFK_IdClienteDetalleRecap.add(jComboBoxid_clienteFK_IdClienteDetalleRecap, gridBagConstraintsDetalleRecap);


		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 0;
		jPanelFK_IdClienteDetalleRecap.add(this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap, gridBagConstraintsDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 1;
		gridBagConstraintsDetalleRecap.gridx =1;
		jPanelFK_IdClienteDetalleRecap.add(jButtonFK_IdClienteDetalleRecap, gridBagConstraintsDetalleRecap);

		jTabbedPaneBusquedasDetalleRecap.addTab("1.-Por Cliente ", jPanelFK_IdClienteDetalleRecap);
		jTabbedPaneBusquedasDetalleRecap.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetalleClienteDetalleRecap= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleClienteDetalleRecap.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleClienteDetalleRecap.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleClienteDetalleRecap.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleClienteDetalleRecap.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleClienteDetalleRecap.setLayout(gridaBagLayoutFK_IdDetalleClienteDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 0;
		jPanelFK_IdDetalleClienteDetalleRecap.add(jLabelid_detalle_clienteFK_IdDetalleClienteDetalleRecap, gridBagConstraintsDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 1;
		jPanelFK_IdDetalleClienteDetalleRecap.add(jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap, gridBagConstraintsDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 1;
		gridBagConstraintsDetalleRecap.gridx =1;
		jPanelFK_IdDetalleClienteDetalleRecap.add(jButtonFK_IdDetalleClienteDetalleRecap, gridBagConstraintsDetalleRecap);

		jTabbedPaneBusquedasDetalleRecap.addTab("2.-Por Detalle Cliente ", jPanelFK_IdDetalleClienteDetalleRecap);
		jTabbedPaneBusquedasDetalleRecap.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdRecapDetalleRecap= new GridBagLayout();
		gridaBagLayoutFK_IdRecapDetalleRecap.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRecapDetalleRecap.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRecapDetalleRecap.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRecapDetalleRecap.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRecapDetalleRecap.setLayout(gridaBagLayoutFK_IdRecapDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 0;
		jPanelFK_IdRecapDetalleRecap.add(jLabelid_recapFK_IdRecapDetalleRecap, gridBagConstraintsDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 0;
		gridBagConstraintsDetalleRecap.gridx = 1;
		jPanelFK_IdRecapDetalleRecap.add(jComboBoxid_recapFK_IdRecapDetalleRecap, gridBagConstraintsDetalleRecap);

		gridBagConstraintsDetalleRecap = new GridBagConstraints();
		gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRecap.gridy = 1;
		gridBagConstraintsDetalleRecap.gridx =1;
		jPanelFK_IdRecapDetalleRecap.add(jButtonFK_IdRecapDetalleRecap, gridBagConstraintsDetalleRecap);

		jTabbedPaneBusquedasDetalleRecap.addTab("3.-Por Recap ", jPanelFK_IdRecapDetalleRecap);
		jTabbedPaneBusquedasDetalleRecap.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRecap);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRecap.gridx = 0;		
			//this.gridBagConstraintsDetalleRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRecap.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleRecap, this.gridBagConstraintsDetalleRecap);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleRecap.gridx = 0;		
		//this.gridBagConstraintsDetalleRecap.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleRecap.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleRecap);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRecap.gridx = 0;		
			this.gridBagConstraintsDetalleRecap.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleRecap.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleRecap, this.gridBagConstraintsDetalleRecap);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleRecap, this.gridBagConstraintsDetalleRecap);								
		
		
		/*
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);
		*/		
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRecap.gridx =0;
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRecap, this.gridBagConstraintsDetalleRecap);
				
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleRecap, this.gridBagConstraintsDetalleRecap);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRecap = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleRecap.setLayout(gridaBagLayoutBusquedasParametrosDetalleRecap);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleRecap;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleRecap() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleRecap.setName("jPanelReporteDinamicoDetalleRecap"); 
		
		this.jPanelReporteDinamicoDetalleRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleRecap.setLayout(gridaBagLayoutReporteDinamicoDetalleRecap);
		
		
		this.jInternalFrameReporteDinamicoDetalleRecap= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleRecap.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleRecap.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleRecap.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleRecap.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Recapes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleRecap = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleRecap.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelColumnasSelectReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleRecap = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleRecap=new JScrollPane(this.jListColumnasSelectReporteDetalleRecap);
			
			this.jScrollColumnasSelectReporteDetalleRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleRecap.add(this.jListColumnasSelectReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);
		this.jPanelReporteDinamicoDetalleRecap.add(this.jScrollColumnasSelectReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleRecap = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleRecap.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleRecap = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleRecap.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRecap.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleRecap=new JScrollPane(this.jListRelacionesSelectReporteDetalleRecap);
			
			this.jScrollRelacionesSelectReporteDetalleRecap.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRecap.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRecap.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleRecap = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleRecap = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleRecap = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleRecap = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleRecap = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleRecap.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelConGraficoDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleRecap.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleRecap.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleRecap.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jCheckBoxConGraficoDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleRecap = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleRecap.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelColumnaCategoriaGraficoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleRecap.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleRecap.add(this.jComboBoxColumnaCategoriaGraficoDetalleRecap, this.gridBagConstraintsDetalleRecap);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleRecap = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleRecap.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelColumnaCategoriaValorDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleRecap.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleRecap.add(this.jComboBoxColumnaCategoriaValorDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleRecap = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleRecap.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelColumnasValoresGraficoDetalleRecap, this.gridBagConstraintsDetalleRecap);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleRecap = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleRecap.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleRecap=new JScrollPane(this.jListColumnasValoresGraficoDetalleRecap);
			
			this.jScrollColumnasValoresGraficoDetalleRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleRecap.add(this.jListColumnasSelectReporteDetalleRecap, this.gridBagConstraintsDetalleRecap);
		this.jPanelReporteDinamicoDetalleRecap.add(this.jScrollColumnasValoresGraficoDetalleRecap, this.gridBagConstraintsDetalleRecap);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleRecap = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleRecap.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelTiposGraficosReportesDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleRecap.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleRecap = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleRecap.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelGenerarExcelReporteDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRecap = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleRecap.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleRecap,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleRecap.setToolTipText("Generar EXCEL"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleRecap.add(this.jButtonGenerarExcelReporteDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRecap.add(this.jComboBoxTiposReportesDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleRecap = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleRecap.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRecap.add(this.jLabelTiposArchivoReporteDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRecap.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleRecap = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleRecap.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleRecap,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleRecap.setToolTipText("Generar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRecap.add(this.jButtonGenerarReporteDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleRecap = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleRecap.setToolTipText("Cancelar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRecap.add(this.jButtonCerrarReporteDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleRecap = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleRecap= new JScrollPane(jPanelReporteDinamicoDetalleRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleRecap.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRecap.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRecap.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Recapes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRecap.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleRecap.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleRecap);
		this.jInternalFrameReporteDinamicoDetalleRecap.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleRecap, this.gridBagConstraintsDetalleRecap);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleRecap() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleRecap.setName("jPanelImportacionDetalleRecap"); 
		
		this.jPanelImportacionDetalleRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleRecap.setLayout(gridaBagLayoutImportacionDetalleRecap);
		
		
		this.jInternalFrameImportacionDetalleRecap= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleRecap= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRecap.setResizable(true);
	    this.jInternalFrameImportacionDetalleRecap.setClosable(true);
	    this.jInternalFrameImportacionDetalleRecap.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRecap.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRecap.setResizable(true);
	    this.jInternalFrameImportacionDetalleRecap.setClosable(true);
	    this.jInternalFrameImportacionDetalleRecap.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Recapes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleRecap = new JLabelMe();

		this.jLabelArchivoImportacionDetalleRecap.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRecap.add(this.jLabelArchivoImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleRecap = new JFileChooser();		
		this.jFileChooserImportacionDetalleRecap.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleRecap = new JButtonMe();
		this.jButtonAbrirImportacionDetalleRecap.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleRecap,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleRecap.setToolTipText("Generar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRecap.add(this.jButtonAbrirImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleRecap = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleRecap.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRecap.add(this.jLabelPathArchivoImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleRecap=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleRecap.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRecap.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRecap.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRecap.add(this.jTextFieldPathArchivoImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleRecap = new JButtonMe();
		this.jButtonGenerarImportacionDetalleRecap.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleRecap,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleRecap.setToolTipText("Generar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRecap.add(this.jButtonGenerarImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleRecap = new JButtonMe();
		this.jButtonCerrarImportacionDetalleRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleRecap.setToolTipText("Cancelar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRecap.add(this.jButtonCerrarImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleRecap = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleRecap= new JScrollPane(jPanelImportacionDetalleRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleRecap.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleRecap.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleRecap);
		this.jInternalFrameImportacionDetalleRecap.getContentPane().add(this.jScrollPanelImportacionDetalleRecap, this.gridBagConstraintsDetalleRecap);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleRecap(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleRecap = new JButtonMe();
			this.jButtonAbrirOrderByDetalleRecap.setText("Orden");
			this.jButtonAbrirOrderByDetalleRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRecap,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleRecap";
			inputMap = this.jButtonAbrirOrderByDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleRecap"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleRecap = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleRecap.setName("jPanelOrderByDetalleRecap"); 
			
			this.jPanelOrderByDetalleRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleRecap.setLayout(gridaBagLayoutOrderByDetalleRecap);
			
			
			this.jTableDatosDetalleRecapOrderBy = new JTableMe();        
			this.jTableDatosDetalleRecapOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleRecapOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleRecapOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleRecapOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleRecapOrderBy.setViewportView(this.jTableDatosDetalleRecapOrderBy);
			this.jTableDatosDetalleRecapOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleRecapOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleRecap= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleRecap= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleRecap = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleRecap= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleRecap.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleRecap.setTitle("Orden");
			this.jInternalFrameOrderByDetalleRecap.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleRecap.setResizable(true);
			this.jInternalFrameOrderByDetalleRecap.setClosable(true);
			this.jInternalFrameOrderByDetalleRecap.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Recapes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleRecap.ipady =150;
				
			this.jPanelOrderByDetalleRecap.add(jScrollPanelDatosDetalleRecapOrderBy, this.gridBagConstraintsDetalleRecap);//this.jTableDatosDetalleRecapTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleRecap = new JButtonMe();
			this.jButtonCerrarOrderByDetalleRecap.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleRecap,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleRecap.setToolTipText("Cancelar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleRecap.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleRecap.add(this.jButtonCerrarOrderByDetalleRecap, this.gridBagConstraintsDetalleRecap);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleRecap = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleRecap= new JScrollPane(jPanelOrderByDetalleRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleRecap.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleRecap);
			
			this.jInternalFrameOrderByDetalleRecap.getContentPane().add(this.jScrollPanelOrderByDetalleRecap, this.gridBagConstraintsDetalleRecap);			
		
		} else {
			this.jButtonAbrirOrderByDetalleRecap = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallerecapSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleRecap.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleRecap.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleRecap.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleRecap.getRowHeight();//DetalleRecapConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRecap.isSelected()) {
					iHeightTable=DetalleRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRecap.isSelected()) {
					iHeightTable=DetalleRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleRecap.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRecap.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRecap.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleRecap!=null && this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy()!=null) {
			//if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleRecap.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleRecap.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleRecap.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallerecapLogic.getDetalleRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerecaps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleRecap> TraerDetalleRecapBeans(List<DetalleRecap> detallerecaps,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleRecap detallerecap:detallerecaps) {
					
				if(!(DetalleRecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleRecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallerecap.setsDetalleGeneralEntityReporte(DetalleRecapConstantesFunciones.getDetalleRecapDescripcion(detallerecap));
										
						
					
						
					
				} else  {
							
					//detallerecap.setsDetalleGeneralEntityReporte(detallerecap.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallerecapbeans.add(detallerecapbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallerecaps;
    }
	//PARA REPORTES FIN
}
